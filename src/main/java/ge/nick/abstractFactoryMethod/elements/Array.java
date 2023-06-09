package ge.nick.abstractFactoryMethod.elements;

import ge.nick.abstractFactoryMethod.utils.Creatable;
import java.util.List;

/*
* Class for array object to render it in any OOP language.
* It implements Creatable interface to set required render functions.
* In this case it is array that contains string.
*/

public abstract class Array implements Creatable {

    // To save name of rendered variable to be initialized.
    private String variableName;
    // List of string data that will contain rendered array.
    private List<String> elements;

    // Parametric constructor to set values.
    public Array(String variableName, List<String> elements) {
        this.variableName = variableName;
        this.elements = elements;
    }

    // To get rendered array variable name.
    public String getVariableName() {
        return variableName;
    }

    // To get list of string data of rendered array.
    public List<String> getElements() {
        return elements;
    }

    // To set rendered array variable name.
    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    // To set list of string data of rendered array.
    public void setElements(List<String> elements) {
        this.elements = elements;
    }
}
