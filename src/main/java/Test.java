import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;

import java.util.List;


public class Test {

    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName("F:\\Javaworkspace\\AntlrTest\\src\\main\\resources\\ifc4.exp");

            ExpressGrammarLexer lexer = new ExpressGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExpressGrammarParser parser = new ExpressGrammarParser(tokens);
            ParseTree tree = parser.schema();


            ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
            EntityVisitor extractor = new EntityVisitor();
            walker.walk(extractor, tree); // initiate walk of tree with listener
            List<Entity> res = extractor.GetEntityList();
            for (Entity e: res) System.out.println(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
