import java.util.ArrayList;
import java.util.List;

public class Entity {
    private String name;
    private String parent;
    private List<String> attrs = new ArrayList<String>();

    public Entity(String name) {
        this.name = name;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public void addAttribute(String name) {
        attrs.add(name);
    }

    public String toString() {
        String res = "";
        res = res + name + " " + parent + " ";
        for (String str: attrs) res += str+",";
        return res;
    }


}