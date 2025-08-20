### Array:
- is a Class in Java.
- stores a sequence of values, all of same type.
- array is not resizable. Size of an array, once created, is fixed.
- Array when initialized with some size, will be created with default values of that datatype. For Primitives, it will be its own default type and `null` for Objects.
- has only one attribute, `length`.
- `int[] firstArray = new int[5];` - All five elements will be initialized with default int value `0`.
- `int[] secondArray = {1,2,3,4,5};`- Anonymous array.
### java.util.Arrays:
- helper class for array.
- contains methods like `toString()`, `sort()`, `copy()`, `fill()`, `equals()`, `binarySearch()`,...
- has static methods and not instance methods.
### Variable arguments:
- `public static void myMethod(String... args) {.....}`
- This is a special designation for Java that means Java will take zero, one, or many Strings as arguments to this method and create an array with which to process them in the method.
- There can be only one variable argument in a method.
- The variable argument must be the last argument.
