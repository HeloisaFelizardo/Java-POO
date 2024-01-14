
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        elements.add(element);
    }

    public ArrayList<String> getElements() {
        return elements;
    }

    public String toString() {
        String printOutPut = "";

        if (!elements.isEmpty()) {
            printOutPut += "The collection " + name + " has " + elements.size()
                    + " element" + (elements.size() > 1 ? "s" : "") + ":";

            for (String element : elements) {
                printOutPut += "\n" + element;
            }
        } else {
            printOutPut += "The collection " + name + " is empty.";
        }

        return printOutPut;
    }
}
