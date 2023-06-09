package ge.nick.abstractFactoryMethod.utils;

import ge.nick.abstractFactoryMethod.elements.Array;

/*
* Interface that include all allowed and required functions to create any OOP element.
* In this example we create only Array but in future all functions
* that will create other elements should be described and implemented there.
* Described there functions will create required elements in implemented classes.
*/

public interface ObjectFactory {

    // To create array object from variable name and list of string elements.
    Array createArray(String variableName, String... elements);
}
