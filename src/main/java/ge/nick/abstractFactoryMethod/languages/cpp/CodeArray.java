package ge.nick.abstractFactoryMethod.languages.cpp;

import ge.nick.abstractFactoryMethod.elements.Array;

import java.util.List;

/*
 * Class for array object to render elements in C++ language.
 * It extends Array class that have required prototype to render it.
 * In this case it is array that contains string and create only array objects in C++.
*/

public class CodeArray extends Array {

    // Parametric constructor to create set values.
    public CodeArray(String variableName, List<String> elements) {
        super(variableName, elements);
    }

    @Override
    public String create() {

        return "string " + getVariableName() + "[" + getElements().size() + "]" + " = {\"" +
                String.join("\", ", getElements()) + "\"};";
    }
}
