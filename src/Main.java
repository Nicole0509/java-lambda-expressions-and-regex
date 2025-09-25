@FunctionalInterface
interface FunctionalInterfaceExample {
    void doSomething(String something);
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Revising Lambda expressions and RegEx!");

        FunctionalInterfaceExample sayHello = (name) -> {
            System.out.println("Hello " + name);
        };

        sayHello.doSomething("Nicole");
     }
}