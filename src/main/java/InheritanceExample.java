
public class InheritanceExample {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        String s = "Hello";
        System.out.println(childClass instanceof ChildClass);
        System.out.println(childClass instanceof ParentClass);
//        System.out.println(childClass instanceof String);

        ParentClass pc = new ChildClass();
        Object o = new String();
    }
}

class ParentClass {

    String a;

    public ParentClass() {
        System.out.println("Parent constructor");
    }

    public ParentClass(String name) {
        name = a;
    }
}

class ChildClass extends ParentClass {

    String b;

    public ChildClass() {
        System.out.println("Child constructor");
    }
}
