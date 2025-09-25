import java.util.Scanner;

@FunctionalInterface
interface FunctionalInterfaceExample {
    String doSomething();
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Revising Lambda expressions and RegEx!");

        FunctionalInterfaceExample textEntered = () -> {
            System.out.print("Enter a phrase: ");
            return scanner.nextLine().trim();
        };

        String text = textEntered.doSomething();
        System.out.println(text);

        FunctionalInterfaceExample wordToFind = () -> {
            System.out.print("Enter a word you want to find: ");
            return scanner.nextLine().trim();
        };

        String  word = wordToFind.doSomething();
        System.out.println(word);
     }
}