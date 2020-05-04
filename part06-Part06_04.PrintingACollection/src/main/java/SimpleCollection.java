
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String result = "";

        if (this.elements.size() == 0) {
            return "The collection " + this.name + " is empty.";
        }

        if (this.elements.size() == 1) {
            result += "The collection " + this.name + " has " + this.elements.size() + " element:\n";
            result += this.elements.get(0);
            return result;
        } else {
            result += "The collection " + this.name + " has " + this.elements.size() + " elements:\n";
        }

        for (String element : this.elements) {
            result += element + "\n";
        }

        return result;
    }

}
