package section10.e_boxing_unboxing;

import java.util.ArrayList;
import java.util.Arrays;

public class BoxingUnboxingPractice {
    public static void main(String[] args) {
        Integer integerWrapper = 90;
        System.out.println(integerWrapper.getClass().getName());
        System.out.println(getInt(integerWrapper));
        System.out.println(getInt(10)); // As the input param is primitive instead of Wrapper, autoboxing happens during method call.
        System.out.println(getInteger(15));

        var integerList = getList(1,2,3,4,5);
        System.out.println(integerList);

        Integer[] integerArray = new Integer[5];
        integerArray[0] = 25; // Autoboxing happens here.
        integerArray[1] = integerWrapper;
        System.out.println(Arrays.toString(integerArray));

        Character[] characterArray = {'a', 'e', 'i', 'o'}; // Anonymous array initialization
        System.out.println(characterArray[0].getClass().getName());
        System.out.println(Arrays.toString(characterArray));

    }
    private static int getInt(Integer i) {
        return i; // Auto-unboxing(Wrapper class object to Primitive) happens here
    }
    private static Integer getInteger(int i) {
        return i; // Auto-boxing(Primitive to Wrapper class object) happens here
    }
    private static ArrayList<Integer> getList(int... varargs) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : varargs) {
            list.add(i); //Auto-boxing happens here
        }
        return list;
    }
}
