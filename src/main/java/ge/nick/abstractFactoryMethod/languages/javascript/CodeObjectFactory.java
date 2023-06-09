package ge.nick.abstractFactoryMethod.languages.javascript;

import ge.nick.abstractFactoryMethod.elements.Array;
import ge.nick.abstractFactoryMethod.utils.ObjectFactory;

import java.util.Arrays;

/**
 * Object that include (override) all required functions to render any element in JavaScript language.
 * It implements ObjectFactory interface where described allowed functions to create elements.
 * In this example we create only arrays. There set we call JavaScript array create function
 * in overrided allowed createArray function.
 */

public class CodeObjectFactory implements ObjectFactory {

    @Override
    public Array createArray(String variableName, String... elements) {
        return new CodeArray(variableName, Arrays.stream(elements).toList());
    }
}
