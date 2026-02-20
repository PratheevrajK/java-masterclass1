package section7.g_string_builder;

public class Main {
    public static void main(String[] args) {
        StringBuilder emptyStart = new StringBuilder();
        System.out.println("capacity:" + emptyStart.capacity());//capacity:16
        emptyStart.repeat("a", 50);
        System.out.println("length:" + emptyStart.length());//length:50
        System.out.println("capacity:" + emptyStart.capacity());//capacity:50

        StringBuilder strBuilder1 = new StringBuilder("Hello" + " World");
        strBuilder1.append(" and Goodbye!");
        System.out.println(strBuilder1);//Hello World and Goodbye!
        System.out.println("length:" + strBuilder1.length());//length:24
        System.out.println("capacity:" + strBuilder1.capacity());//capacity:27

        strBuilder1.deleteCharAt(16).insert(16, 'g');
        System.out.println(strBuilder1);//Hello World and goodbye!
        strBuilder1.replace(16, 17, "G");
        System.out.println(strBuilder1);//Hello World and Goodbye!

        strBuilder1.reverse().setLength(8);
        System.out.println(strBuilder1);//!eybdooG
    }
}
