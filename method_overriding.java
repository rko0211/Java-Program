
class A {
  public void show() {
    System.out.println("In class A");
  }

}

class B extends A {

  public void show() {
    System.out.println("In class B");
  }
}

public class method_overriding {
  public static void main(String[] args) {
    A obj1 = new A();
    obj1.show();
    B obj2 = new B();
    obj2.show();

    A obj3 = new B();

    obj3.show();

  }
}
