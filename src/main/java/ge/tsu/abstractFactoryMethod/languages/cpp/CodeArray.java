package ge.tsu.abstractFactoryMethod.languages.cpp;

import ge.tsu.abstractFactoryMethod.elements.Array;

import java.util.List;

public class CodeArray extends Array {

    public CodeArray(String variableName, List<String> elements) {
        super(variableName, elements);
    }

    @Override
    public String create() {

        String sb = "string " + getVariableName() + "[" + getElements().size() + "]" + " = {\"" +
                String.join("\", ", getElements()) + "\"};";

        return sb.toString();
    }
}
