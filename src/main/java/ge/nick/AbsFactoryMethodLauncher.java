/*
 * Author: Nika Robaqidze
 * Email: nika42568@gmail.com

 * Scenarios:
 * User need to generate OOP objects on some programming language.
 * In this example it create only array in C++ and JavaScript.
 * CodeGenerator creating objects. As the parameter it takes
 * function that override in specific class that describe elements
 * in specific (selected) language.
 * Then call base function to create element and get them required parameters for it.
 * As result program print generated code.
 */

package ge.nick;

import ge.nick.abstractFactoryMethod.utils.CodeGenerator;

public class AbsFactoryMethodLauncher {

    public static void main(String[] args) {

        // Initialize code generator for JavaScript and set create object of JS.
        CodeGenerator jsCodeGenerator = new CodeGenerator(
                new ge.nick.abstractFactoryMethod.languages.javascript.CodeObjectFactory());

        // Call function to create JavaScript array and set required parameters.
        String JavaScriptSyntax = jsCodeGenerator.generateArray(
                "fruits", "Apple", "Orange", "Mango");

        // Print generated JS syntax code on screen.
        System.out.println("JavaScript: " + JavaScriptSyntax);

        // Initialize code generator for C++ and set create object of C++.
        CodeGenerator codeGenerator = new CodeGenerator(
                new ge.nick.abstractFactoryMethod.languages.cpp.CodeObjectFactory());

        // Call function to create C++ array and set required parameters.
        String CPPSyntax = codeGenerator.generateArray(
                "fruits", "Apple", "Orange", "Mango");

        // Print generated C++ syntax code on screen.
        System.out.println("C++: " + CPPSyntax);
    }
}
