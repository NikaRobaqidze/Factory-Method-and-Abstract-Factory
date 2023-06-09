package ge.tsu.abstractFactoryMethod.languages.javascript;

import ge.tsu.abstractFactoryMethod.elements.Array;

import java.util.List;

public class CodeArray extends Array {

    public CodeArray(String variableName, List<String> elements) {
        super(variableName, elements);
    }

    @Override
    public String create() {

        String sb = "var " + getVariableName() + " = ['" +
                String.join("', ", getElements()) + "']";

        return sb.toString();
    }
}
