package section14.b_functional_interface_categories;

public class B_CustomFunctionalInterface {
    public static void main(String[] args) {
        int result1 = calculator((a, b) -> a * b, 4, 7);
        var result2 = calculator((a, b) -> a / b, 10.0, 5.0);
        var result3 = calculator((a, b) -> a.toUpperCase() + " " + b.toUpperCase(), "Pratheev", "Raj");
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
