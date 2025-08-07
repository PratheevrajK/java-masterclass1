# Static and Instance Fields and Methods:

| Static field                                                                                       | Instance field |
|----------------------------------------------------------------------------------------------------|---------------|
| Declared with `static` keyword                                                                     | Omits `static` keyword |
| There will be only one copy in memory, and this value is associated with class or template itself. | An object needs to be created from the Class to access the field inside it. |
| Integer.MAX_VALUE;                                                                                 | objectName.fieldName; |

| Static method                                                                                           | Instance method                                                                                      |
|---------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------|
| Declared with `static` keyword                                                                          | Omits `static` keyword                                                                               |
| Integer.parseInt("123");                                                                                | objectName.methodName("someParam");                                                                  |
| Static method can't be dependent on any object's state. <br/>So, it can reference any instance members. | To use an instance method, first we have to instantiate the class using `new` keyword.               |
| Inside a static method, we can't use the `this` keyword. | Instance methods can access both instance fields and methods and static fields and methods directly. |