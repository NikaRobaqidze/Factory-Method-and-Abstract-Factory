package ge.nick.abstractFactoryMethod.languages.javascript;

import java.util.List;
import ge.nick.abstractFactoryMethod.elements.Array;

/**
 * Class for array object to render elements in JavaScript language.
 * It extends Array class that have required prototype to render it.
 * In this case it is array that contains string and create only array objects in JavaScript.
*/

public class CodeArray extends Array {

    // Parametric constructor to create set values.
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
