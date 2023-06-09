package ge.tsu.abstractFactoryMethod.elements;

import ge.tsu.abstractFactoryMethod.utils.Creatable;

import java.util.List;

public abstract class Array implements Creatable {

    private String variableName;
    private List<String> elements;

    public Array(String variableName, List<String> elements) {
        this.variableName = variableName;
        this.elements = elements;
    }

    public String getVariableName() {
        return variableName;
    }

    public List<String> getElements() {
        return elements;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public void setElements(List<String> elements) {
        this.elements = elements;
    }
}
