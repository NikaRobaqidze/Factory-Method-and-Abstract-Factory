package ge.tsu.abstractFactoryMethod.languages.javascript;

import ge.tsu.abstractFactoryMethod.elements.Array;
import ge.tsu.abstractFactoryMethod.utils.ObjectFactory;

import java.util.Arrays;

public class CodeObjectFactory implements ObjectFactory {

    @Override
    public Array createArray(String variableName, String... elements) {
        return new CodeArray(variableName, Arrays.stream(elements).toList());
    }
}
