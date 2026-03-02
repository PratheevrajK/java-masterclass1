package section14.c_lambda_mini_challenge;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConsumerChallenge {
    public static void main(String[] args) {
        //CHALLENGE-1: Convert this anonymous function to Lambda expression.
        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };
        printWords.accept("Let's split this.");
        //Let's
        //split
        //this.

        Consumer<String> printWordsLambda = s -> {
            String[] parts = s.split(" ");
//            for (String part : parts) {
//                System.out.println(part);
//            } //forEach Consumer can also be used.
            Arrays.asList(parts).forEach(a -> System.out.println(a));
        };
        printWordsLambda.accept("Let's split this."); // openly executing the lambda, instead in a method.
        //Let's
        //split
        //this.

        //CHALLENGE1 ends here...


        String result1 = everySecondChar("abcdefgh");
        System.out.println(result1); //bdfh

        //UnaryOperator<String> result2 = s -> {...} this also works, as it accepts String and returns String.
        //Function<String, String> means accept String and return String.
        Function<String, String> result2 = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };
        everySecondCharPrinter(result2, "abcdefgh");

        //CHALLENGE-3: Create simple Supplier type lambda function and execute it.
        Supplier<String> iLoveJava = () -> "I love Java!";
        Supplier<String> iLoveJava2 = () -> {return "I love Java!";};

        System.out.println(iLoveJava.get());
        System.out.println(iLoveJava2.get());
    }

    //CHALLENGE-2: Convert this method to lambda
    public static String everySecondChar(String source) {

        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    //lambda is executed using this function.
    public static void everySecondCharPrinter(Function<String, String> function ,String someStr) {
        System.out.println(function.apply(someStr)); //bdfh
    }

    //converting above method to Generics.
//    public static <T, R> void everySecondCharPrinter(Function<T, R> function ,T someStr) {
//        System.out.println(function.apply(someStr)); //bdfh
//    }

}
