public class OverridingExample {

    public static void main(String[] args) {

//        Child c = new Child();
//        c.m();
//
//        Parent p = new Parent();
//        p.m();

        Child cp = new Child();
        cp.m();

        Class childClassClass = cp.getClass();

    }
}

class Parent {

    void m() {
        System.out.println("i am parent");
    }
}

class Child extends Parent {

    @Override
    @Deprecated
    void m() {
        super.m();
        System.out.println("i am child");
    }
}
