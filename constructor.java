class a {
    a() {
        System.out.println("In super class");
    }

}

class b extends a {
    // b() {
    // // super();
    // System.out.println("In sub class");
    // }

    // Parameterised constructor
    b(int a) {
        // this();
        System.out.println("In sub class int");
    }
}

public class constructor {
    public static void main(String[] args) {
        a obj1 = new a();
        // b obj2 = new b();
        b obj3 = new b(2);
    }
}
