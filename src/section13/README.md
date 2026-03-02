### Nesting classes (or types) within another class (or type):
- A class can contain other types within the class body, such as other classes, interfaces, enums, and records.
- These are called nested types, or nested classes. 
- You might want to use nested classes when your classes are tightly coupled, meaning their functionality is interwoven.

### Nested Classes:
- Before JDK16, only static nested classes were allowed to have static methods.
- As of JDK16, all four types of nested classes can have static members of any type, including static methods.
![img.png](img.png)

### Static nested class:
- `EnclosingClass.NestedClass nestedClass = new EnclosingClass.NestedClass();`

### Instance or inner class:
- `EnclosingClass.InnerClass innerClass = new EnclosingClass().new InnerClass();`

### Anonymous class:
- An anonymous class is a local class that doesn't have a name.
- The anonymous class is never created with a class declaration, but it's always instantiated as part of an expression.
- Anonymous classes has been replaced with Lambda expressions.
