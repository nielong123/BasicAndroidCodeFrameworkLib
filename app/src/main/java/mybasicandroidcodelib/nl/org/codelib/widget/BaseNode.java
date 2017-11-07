package mybasicandroidcodelib.nl.org.codelib.widget;


import com.simon.multilevellist.tree.INode;

/**
 * base node
 * Created by simon on 17-5-12.
 */

public class BaseNode implements INode {

    private String name;

    public BaseNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }
}
