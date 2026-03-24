package section14.b_functional_interface_categories;

public class B_CustomFunctionalInterface {
    public static void main(String[] args) {
        Operation <Integer> product = (a, b) -> a * b;
        int result1 = calculator(product, 4, 7);
        //Result of operation: 28
        var result2 = calculator((a, b) -> a / b, 10.0, 5.0);
        //Result of operation: 2.0
        var result3 = calculator((a, b) -> a.toUpperCase() + " " + b.toUpperCase(), "Pratheev", "Raj");
        //Result of operation: PRATHEEV RAJ
    }

    public static <T> T calculator(Operation <T> function, T a, T b) {
        T result = function.operate(a, b);
        System.out.println("Result of operation: " + result);
        return result;
    }
}

interface Operation <T> {
    T operate(T a, T b);
}
