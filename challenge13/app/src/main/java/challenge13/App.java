/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge13;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        ValidateBrackets validateBrackets=new ValidateBrackets();
        System.out.println(validateBrackets.isValidateBrackets(" "));

//        System.out.println( ValidateBrackets.areBracketsBalanced("{]"));
    }
}
