class a {
    // Instance variable
    int age;
    String s;

    public void set_method(int a, String n) {
        age = a;
        s = n;
    }

    public static void show(a obj) {
        // System.out.println("Inside static method");
        System.out.println(obj.s + " " + obj.age);
    }
}

public class static_method {
    public static void main(String[] args) {
        a obj = new a();
        obj.set_method(16, " Ash Ketcham");
        // Using 'a' class object we will call show method
        // obj.show();
        // Static method and variable can be called using class name it is a part of
        // class not object
        a.show(obj);
    }
}
