### Composition:
- way to make combination of objects that acts as a single coherent object.
- `HAS-A` relationship.
- as a general rule, look at using composition before implementing inheritance.
### Encapsulation principles:
- Create constructors for object initialization, which enforces that only objects with valid data will get created.
- Use the private access modifier for your fields.
- Use setter methods sparingly and only as needed.
- Use access modifiers that aren't private, only for the methods that the calling code needs to use.
### Compile time vs Runtime type:
| Compile time typing                                                                               | Run time typing                                                                                        |
|---------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------|
| In many cases, the compile time type is the declared type to the left of the assignment operator. | What is returned on the right side of the assignment operator from whatever expression or method is executed. |
| You can think of the compile time type as the declared type.                                      | You can assign a runtime instance to a different compile time type, only if certain rules are followed.       |
- In this course, up to now, we've looked at only one rule that applies, and that's the inheritance rule.
- We can assign an instance to a variable of the same type, or a parent type, or a parent's parent type, including java.lang.Object, the ultimate base class.
### instanceof operator:
- The `instanceof` operator lets you test the type of object or instance.
- The reference variable you are testing is the left operand.
- The type you are testing for is the right operand.
- Ex: `unknownObject instanceof Movie`
### FQCN:
- Fully Qualified Class Name
- Ex: java.util.Scanner, instead import java.util.Scanner.