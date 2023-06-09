package ge.tsu.abstractFactoryMethod.utils;

public class CodeGenerator {

    private ObjectFactory objectFactory;

    public CodeGenerator(ObjectFactory objectFactory) {
        this.objectFactory = objectFactory;
    }

    public String generateArray(String variableName, String... elements){

        StringBuilder sb = new StringBuilder();

        sb.append(objectFactory.createArray(variableName, elements).create());

        return sb.toString();
    }
}
