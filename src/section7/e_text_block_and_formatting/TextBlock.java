package section7.e_text_block_and_formatting;

public class TextBlock {
    public static void main(String[] args) {
        int age = 20, yearOfBirth = 2005;
        // There are multiple ways of formatting output.
        System.out.println("Hey my age is " + age + " and my birth year is " + yearOfBirth + ".");
        System.out.println(String.format("Hey my age is %d and my birth year is %d.", age, yearOfBirth));
        System.out.printf("Hey my age is %d and my birth year is %d.\n", age, yearOfBirth);
        System.out.printf("Hey my age is %d and my birth year is %d.%n", age, yearOfBirth);
        //String literal formatted function is introduced in Java15.
        System.out.println("Hey my age is %d and my birth year is %d.".formatted(age, yearOfBirth));

        String bulletIt = "These are the following points:" +
                "1. Hey Buddy" +
                    "a. My age is " + age;
        System.out.println(bulletIt);

        // TextBlock is introduced in Java15 for formatting multi-line string literals.
        String textBlock = """
                These are the following points:
                    1. Hey Buddy
                        a. My age is %d""".formatted(age);
        System.out.println(textBlock);

        String textBlock2 = """
                These are the following points:
                    1. Hey Buddy
                        a. My age is %d
                """;
        System.out.printf(textBlock2, age);
    }
}
