import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);

        if(matcher.find()){
            System.out.println(matcher.group() + " was found");
        }
     }
}