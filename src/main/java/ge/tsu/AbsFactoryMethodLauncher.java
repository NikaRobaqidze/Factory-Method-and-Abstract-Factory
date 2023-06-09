package ge.tsu;

import ge.tsu.abstractFactoryMethod.utils.CodeGenerator;

public class AbsFactoryMethodLauncher {

    public static void main(String[] args) {

        CodeGenerator jsCodeGenerator = new CodeGenerator(new ge.tsu.abstractFactoryMethod.languages.javascript.CodeObjectFactory());
        String JavaScriptSyntax = jsCodeGenerator.generateArray("fruits", "Apple", "Orange", "Mango");

        System.out.println(JavaScriptSyntax);

        CodeGenerator codeGenerator = new CodeGenerator(new ge.tsu.abstractFactoryMethod.languages.cpp.CodeObjectFactory());
        String CPPSyntax = codeGenerator.generateArray("fruits", "Apple", "Orange", "Mango");

        System.out.println(CPPSyntax);
    }
}
