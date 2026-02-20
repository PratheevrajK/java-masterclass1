package section7.f_overriding;

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.print();

        Parent obj1 = new Child1();
        obj1.print();

        Parent obj2 = new Child2();
        obj2.print();
    }
}

class Parent {
    void print() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("Child");
    }
}

class Child1 extends Parent {
    //'print()' in 'Child1' clashes with 'print()' in 'Parent'; incompatible return type
//     int print() {
//        System.out.println("Child1");
//        return 0;
//    }
}

class Child2 extends Parent {
    //can't have more restrictive access privileges than parent.
//     private void print() {
//        System.out.println("Child2");
//    }
}