package ge.tsu.abstractFactoryMethod.utils;

import ge.tsu.abstractFactoryMethod.elements.Array;

public interface ObjectFactory {

    public Array createArray(String variableName, String... elements);
}
