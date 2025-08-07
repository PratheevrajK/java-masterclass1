## SECTION 2: Using JShell

To use JShell, open Command Prompt (`Win+R` and type `cmd`) and enter `jshell`.

### Common Commands

- `/help intro` — Show introduction
- `/list -all` — Displays list of libraries and all commands executed
- `/list` — Displays only the list of commands executed successfully
- `/var` — Displays list of variables created
- `/exit` or `/ex` — Closes JShell
- `Ctrl+C` — Escapes the typed JShell command

### Executing Multiple Statements

Enclose statements inside curly braces `{}`:
```java
{
    statement1;
    statement2;
    ...
}
```

## SECTION 3: Java Basics

### Keywords
- All Java code is case-sensitive, including keywords.
- Example: `int` and `Int` are not the same.

### Variables & Expressions

#### Wrapper Classes
- Add more details/properties to primitive datatypes.
- Examples:
  - `Integer.MAX_VALUE = 2147483647`
  - `Integer.MIN_VALUE = -2147483648`
  - `Integer.SIZE = 32`
- Mappings:
  - `int` → `Integer`
  - `char` → `Character`
  - `boolean` → `Boolean`
  - `byte` → `Byte`
  - `short` → `Short`
  - `long` → `Long`
  - `float` → `Float`
  - `double` → `Double`

#### Overflow & Underflow
- Occurs only in expressions, not during variable initialization.
- Examples:
  - `overFlowValue = Integer.MAX_VALUE + 1` → `-2147483648`
  - `underFlowValue = Integer.MIN_VALUE - 1` → `2147483647`
  - `int maxIntTest = 5 + 214748364799` → Error: integer number too large

#### Readable Values
- Use underscores for readability:
  - `int readableInt = 1_234_567_890` → `1234567890`

#### Bit Sizes
- `byte` — 8 bits
- `short` — 16 bits
- `int`, `float` — 32 bits
- `long`, `double` — 64 bits

#### Long Values
- Assigning values to a `long` variable crossing `Integer.MAX_VALUE` should end with `L` or `l`.
- Examples:
  - `long myLongValue = 0L;`
  - `myLongValue = 100;` — works without `L`
  - `myLongValue = 2147483647999;` — Error: integer number too large
  - `myLongValue = 2147483647999L;` — works fine

#### Compiler Evaluation
- Java Compiler does not attempt to evaluate the value, in a variable, when it's used in a calculation, so it doesn't know if the value fits, and throws an error.
- During casting, we are telling compiler that the calculated value would be of short datatype, not int.

#### Byte & Short Casting
- Examples:
  - `byte myMinByteValue = Byte.MIN_VALUE;` → `-128`
  - `byte byteValue1 = -128 / 2;` → `-64`
  - `byte byteValue2 = myMinByteValue / 2;` → Error: possible lossy conversion from int to byte
  - `short myMinShortValue = Short.MIN_VALUE;` → `-32768`
  - `short shortValue1 = (myMinShortValue / 2);` → Error: possible lossy conversion from int to short
  - `short shortValue1 = (short) (myMinShortValue / 2);` → `-16384`

#### Default Datatypes
- Whole numbers: `int`
- Decimals: `double`
- Examples:
  - `float myFloatValue = 5.25;` → Error: possible lossy conversion from double to float
  - `float myFloatValue = (float) 5.25;` or `5.25f;` — works

#### Default values:
- boolean - false
- float, double - 0.0
- byte, short, int, long, char - 0

#### Character
- `char` can hold only one character.
- https://symbl.cc
```java
  char myLiteralChar = 'D', myUnicodeChar='\u0044', myDeci
  malCode=68;
  char firstChar = 'A', secondChar = 'B';
  firstChar+secondChar ->131
  ""+firstChar+secondChar ->"AB"
  firstChar ->'A'
  firstChar+2 ->67
```

#### Boolean
- `boolean myBooleanValue = true;` or `false;`

#### BigDecimal
- More accurate, used for currencies.

#### String
- Sequence of characters.
- Strings are immutable.

#### StringBuilder
- Mutable.
- Concatenation is not supported.

#### Incrementing by One
- Post-fix increment: `result++;`
- Addition compound assignment: `result += 1;`
- Compound assignment operator handles casting.

Example:
```java
int result = 10;
result -= 5.5;
System.out.println(result); // 4


int result = 10;
result = result - 5.5; (int) (result -5.5)
System.out.println(result); //-> Error: possible lossy conversion from double to int.
```