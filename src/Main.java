@FunctionalInterface
interface FunctionalInterfaceExample {
    void doSomething();
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Revising Lambda expressions and RegEx!");

        FunctionalInterfaceExample funExample = () -> {
            System.out.println("This is my first time using Lambda functions in Java:)");
        };

        funExample.doSomething();
     }
}