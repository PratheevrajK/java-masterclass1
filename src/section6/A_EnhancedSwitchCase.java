package section6;

/*
NOTES:
Enhanced Switch-case statement was introduced in Java12 to eliminate fall through issue(adding break stmt in every case).
*/

public class A_EnhancedSwitchCase {
    public static void main(String[] args) {
        traditionalSwitch(1);
        traditionalSwitch(2);
        traditionalSwitch(3);
        traditionalSwitch(4);
        traditionalSwitch(10);
        enhancedSwitch(1);
        enhancedSwitch(2);
        enhancedSwitch(3);
        enhancedSwitch(4);
        enhancedSwitch(10);
    }
    public static void traditionalSwitch(int value) {
        switch(value) {
            case 1:
                System.out.println("Traditional 1!");
                break;
            case 2:
                System.out.println("Traditional 2!");
                break;
            case 3: case 4: case 5:
                System.out.println("Traditional 3 or 4 or 5!");
                break;
            default:
                System.out.println("Traditional default!");
                break;
        }
    }
    public static void enhancedSwitch(int value) {
        switch (value) {
            case 1 -> System.out.println("Enhanced 1!");
            case 2 -> System.out.println("Enhanced 2!");
            case 3, 4 , 5 -> {
                System.out.println("Enhanced 3 or 4 or 5!");
            }
            default -> System.out.println("Enhanced default!");
        }
    }
}
