### OOPs(Object-Oriented programming):
 - Way to model real-world objects as software objects that contain both data and code.
 - Also called as Class based programming.
 - Classes are blueprints for creating objects.
 - #### Access modifiers for the Class:
    - Top-class - Defined in source code and file and not enclosed in the code block of another class, type or method.
    - `public` - Any other class in any package can access this class.
    - `no modifier` - means package private - accessible by classes under same package.
 - #### Access modifiers for Class Members:
    - `public` - Any class in any package can access this member.
    - `protected` - Classes within package and its subclasses in any other package can access.
    - `no modifier` - Package private - Classes within same package can access.
    - `private` - no other class can access these members.
 - #### Encapsulation:
    - bundling of behavior and attributes on a single object.
    - Practice of hiding fields and some methods from public access.
 - #### null:
    - means variable of attribute has a type but no reference to an object.
    - means no variable or object is assigned to the field.
    - fields with primitive data type are never null.
 - #### this:
    - Refers to the instance that was created when the object was instantiated.
    - we can use `this` to access fields on the class.
 - #### Constructor:
    - used in the object creation.
    - same name as class itself and doesn't return any value, not even void is allowed.
    - #### Default Constructor:
      - If a class has no constructor, then default constructor is implicitly declared.
      - has no arguments and called as no-args constructor.
      - If a class contains any other constructor, then default constructor is NOT implicitly declared.
    - #### Constructor overloading:
      - Declaring multiple constructors with same name and different parameters.
    - #### Constructor chaining:
      - one constructor explicitly calling another constructor.
      - `this()` is used to execute another constructor, passing it arguments if needed.
      - `this()` must be the first executable statement if it's used from another constructor.
 

### POJOs(Plain Old Java Objects):
Class that generally has instance fields and its getters and setters. And no other, or very few methods.
It is also called as ..
 - Bean or JavaBean - just a POJO with some extra rules applied to it.
 - Entity - as sometimes it mirrors database entities.
 - DTO(Data Transfer Object) - Object that can be modelled as just data.

### Annotations:
 - are a type of metadata.
 - way to formally describe additional information about our code.
 - they can be used by compilers or other pre-processing functions, to information about the code.

### Records:
 - Create immutable data classes by automatically generating boilerplate code like constructors, getters, equals(), hashCode(), and toString() methods.
 - Setter methods are not supported.
 - Also called as Plain Data Carriers.

### Inheritance:
 - organize classes into a parent-child hierarchy.
 - this lets child inherit(reuse), fields and methods from its parent.
 - `IS-A` relationship.
 - #### extends:
   - used by child class to extend parent class.
   - child class can extend one and only one class.
 - #### super():
   - It's a way to call a constructor on the super class directly from the sub-class's constructor.
   - `super()` is a lot like `this()` and should be the first statement of the constructor.
   - because of this rule, `this()` and `super()` can never be used together.
   - If you don't make a call to `super()`, then Java makes it for you using super's default constructor.
   - If your super class doesn't have a default constructor, then you must explicitly call `super()` in all of your constructors, passing the right arguments to that constructor.
 - #### overridden method in sub class can do of the three things:
   - It can implement completely different behavior, overriding the behavior of the parent.
   - It can simply call the parent class's method, which is somewhat redundant to do.
   - Or the method can call the parent class's method and include other code to run so it can extend the functionality for the child class, for that behavior.
### Polymorphism:
 - means "many forms" like a Parent class being extended by many child classes.
 - is achieved by Inheritance.
 - makes code simpler and encourages code extensibility.
### Method overriding rules:
 - Child class must have the same name and same arguments.
 - Allows covariant return type - return type can be a subclass of the return type of parent class. Ex: Parent class returns List and Child class returns ArrayList.
 - It can't have lower access modifier, means it can't have more restrictive access privileges.
 - Only inherited methods can be overridden, means methods can be overridden only by child classes.
 - Constructors, private methods and methods that are final of Parent class can't be overridden.
 - A SubClass can use super.methodName() to call the SuperClass version of the overridden method.

