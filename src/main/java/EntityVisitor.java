import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class EntityVisitor implements ExpressGrammarListener {

    Entity curEntity;
    List<Entity> entityList = new ArrayList<Entity>();

    public List<Entity> GetEntityList() {
        return entityList;
    }



    public void enterSchema(ExpressGrammarParser.SchemaContext ctx) {

    }

    public void exitSchema(ExpressGrammarParser.SchemaContext ctx) {

    }

    public void enterBeginSchema(ExpressGrammarParser.BeginSchemaContext ctx) {

    }

    public void exitBeginSchema(ExpressGrammarParser.BeginSchemaContext ctx) {

    }

    public void enterEndSchema(ExpressGrammarParser.EndSchemaContext ctx) {

    }

    public void exitEndSchema(ExpressGrammarParser.EndSchemaContext ctx) {

    }

    public void enterEntity(ExpressGrammarParser.EntityContext ctx) {
        ctx.beginEntity().NAME().getText();
    }

    public void exitEntity(ExpressGrammarParser.EntityContext ctx) {
        entityList.add(curEntity);
    }

    public void enterBeginEntity(ExpressGrammarParser.BeginEntityContext ctx) {
        curEntity = new Entity(ctx.NAME().getText());
    }

    public void exitBeginEntity(ExpressGrammarParser.BeginEntityContext ctx) {

    }

    public void enterEndEntity(ExpressGrammarParser.EndEntityContext ctx) {

    }

    public void exitEndEntity(ExpressGrammarParser.EndEntityContext ctx) {

    }

    public void enterEntityType(ExpressGrammarParser.EntityTypeContext ctx) {

    }

    public void exitEntityType(ExpressGrammarParser.EntityTypeContext ctx) {

    }

    public void enterSubtype(ExpressGrammarParser.SubtypeContext ctx) {
        curEntity.setParent(ctx.NAME().getText());
    }

    public void exitSubtype(ExpressGrammarParser.SubtypeContext ctx) {

    }

    public void enterSupertypeOf(ExpressGrammarParser.SupertypeOfContext ctx) {

    }

    public void exitSupertypeOf(ExpressGrammarParser.SupertypeOfContext ctx) {

    }

    public void enterAttr(ExpressGrammarParser.AttrContext ctx) {
        curEntity.addAttribute(ctx.NAME().getText());
    }

    public void exitAttr(ExpressGrammarParser.AttrContext ctx) {

    }

    public void enterCollectionOf(ExpressGrammarParser.CollectionOfContext ctx) {

    }

    public void exitCollectionOf(ExpressGrammarParser.CollectionOfContext ctx) {

    }

    public void enterCollectionArgPart(ExpressGrammarParser.CollectionArgPartContext ctx) {

    }

    public void exitCollectionArgPart(ExpressGrammarParser.CollectionArgPartContext ctx) {

    }

    public void enterBeginNameList(ExpressGrammarParser.BeginNameListContext ctx) {

    }

    public void exitBeginNameList(ExpressGrammarParser.BeginNameListContext ctx) {

    }

    public void enterEndNameList(ExpressGrammarParser.EndNameListContext ctx) {

    }

    public void exitEndNameList(ExpressGrammarParser.EndNameListContext ctx) {

    }

    public void enterNameList(ExpressGrammarParser.NameListContext ctx) {

    }

    public void exitNameList(ExpressGrammarParser.NameListContext ctx) {

    }

    public void enterNames(ExpressGrammarParser.NamesContext ctx) {

    }

    public void exitNames(ExpressGrammarParser.NamesContext ctx) {

    }

    public void enterTypeName(ExpressGrammarParser.TypeNameContext ctx) {

    }

    public void exitTypeName(ExpressGrammarParser.TypeNameContext ctx) {

    }

    public void enterType(ExpressGrammarParser.TypeContext ctx) {

    }

    public void exitType(ExpressGrammarParser.TypeContext ctx) {

    }

    public void enterInversePart(ExpressGrammarParser.InversePartContext ctx) {

    }

    public void exitInversePart(ExpressGrammarParser.InversePartContext ctx) {

    }

    public void enterInverseSentence(ExpressGrammarParser.InverseSentenceContext ctx) {

    }

    public void exitInverseSentence(ExpressGrammarParser.InverseSentenceContext ctx) {

    }

    public void enterDerivePart(ExpressGrammarParser.DerivePartContext ctx) {

    }

    public void exitDerivePart(ExpressGrammarParser.DerivePartContext ctx) {

    }

    public void enterDeriveOverrideSentence(ExpressGrammarParser.DeriveOverrideSentenceContext ctx) {

    }

    public void exitDeriveOverrideSentence(ExpressGrammarParser.DeriveOverrideSentenceContext ctx) {

    }

    public void enterDeriveSentence(ExpressGrammarParser.DeriveSentenceContext ctx) {

    }

    public void exitDeriveSentence(ExpressGrammarParser.DeriveSentenceContext ctx) {

    }

    public void enterUniquePart(ExpressGrammarParser.UniquePartContext ctx) {

    }

    public void exitUniquePart(ExpressGrammarParser.UniquePartContext ctx) {

    }

    public void enterUniqueSentence(ExpressGrammarParser.UniqueSentenceContext ctx) {

    }

    public void exitUniqueSentence(ExpressGrammarParser.UniqueSentenceContext ctx) {

    }

    public void enterWherePart(ExpressGrammarParser.WherePartContext ctx) {

    }

    public void exitWherePart(ExpressGrammarParser.WherePartContext ctx) {

    }

    public void enterWhereSentence(ExpressGrammarParser.WhereSentenceContext ctx) {

    }

    public void exitWhereSentence(ExpressGrammarParser.WhereSentenceContext ctx) {

    }

    public void enterFunction(ExpressGrammarParser.FunctionContext ctx) {

    }

    public void exitFunction(ExpressGrammarParser.FunctionContext ctx) {

    }

    public void enterTherule(ExpressGrammarParser.TheruleContext ctx) {

    }

    public void exitTherule(ExpressGrammarParser.TheruleContext ctx) {

    }

    public void enterCommonKeyword(ExpressGrammarParser.CommonKeywordContext ctx) {

    }

    public void exitCommonKeyword(ExpressGrammarParser.CommonKeywordContext ctx) {

    }

    public void enterCommonSentence(ExpressGrammarParser.CommonSentenceContext ctx) {

    }

    public void exitCommonSentence(ExpressGrammarParser.CommonSentenceContext ctx) {

    }

    public void enterTypeSingleKeyword(ExpressGrammarParser.TypeSingleKeywordContext ctx) {

    }

    public void exitTypeSingleKeyword(ExpressGrammarParser.TypeSingleKeywordContext ctx) {

    }

    public void enterTypeArrayKeyword(ExpressGrammarParser.TypeArrayKeywordContext ctx) {

    }

    public void exitTypeArrayKeyword(ExpressGrammarParser.TypeArrayKeywordContext ctx) {

    }

    public void enterTypeKeyword(ExpressGrammarParser.TypeKeywordContext ctx) {

    }

    public void exitTypeKeyword(ExpressGrammarParser.TypeKeywordContext ctx) {

    }

    public void enterInnerKeyword(ExpressGrammarParser.InnerKeywordContext ctx) {

    }

    public void exitInnerKeyword(ExpressGrammarParser.InnerKeywordContext ctx) {

    }

    public void enterSign(ExpressGrammarParser.SignContext ctx) {

    }

    public void exitSign(ExpressGrammarParser.SignContext ctx) {

    }

    public void visitTerminal(TerminalNode terminalNode) {

    }

    public void visitErrorNode(ErrorNode errorNode) {

    }

    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
