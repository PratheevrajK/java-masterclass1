# Static and Instance Fields and Methods:

| Static field                                                        | Instance field |
|---------------------------------------------------------------------|---------------|
| Declared with `static` keyword                                      | Omits `static` keyword |
| Value of the field will be stored only in a single memory location. | An object needs to be created from the Class to access the field inside it. |
| Integer.MAX_VALUE;                                                  | objectName.fieldName; |

| Static method | Instance method |
|--------------|----------------|
| Declared with `static` keyword | Omits `static` keyword |
| Integer.parseInt("123"); | objectName.methodName("someParam"); |