package ge.nick.abstractFactoryMethod.utils;

/**
* Class for generating code of OOP languages.
* In this example for generating elements in C++ and JavaScript languages.
* For generating it need object were described allowed functions to create elements.
* ObjectFactory it is this object, that definitely generating code in necessary OOP language.
* It includes all required functions for it.
*/

public class CodeGenerator {

    // Object that includes all required functions for code generating.
    private final ObjectFactory objectFactory;

    // Parametric constructor to set specific OOP language generator object.
    public CodeGenerator(ObjectFactory objectFactory) {
        this.objectFactory = objectFactory;
    }

    // To get result of generator object. May to modify output in the future.
    public String generateArray(String variableName, String... elements){

        StringBuilder sb = new StringBuilder();

        sb.append(objectFactory.createArray(variableName, elements).create());

        return sb.toString();
    }
}
