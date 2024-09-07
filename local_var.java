class calc {

  int num = 5;
}

class A {

  void inc() {
    System.out.println(n);
    n++;
  }

  int n = 5;
}

public class local_var {
  public static void main(String[] args) {
    // calc obj = new calc();
    // obj , obj1 are local variable that stores the address of all variable present
    // in a class calc

    // calc obj1 = new calc();
    // obj.num = 8;
    // System.out.println(obj.num);
    // System.err.println(obj1.num);
    A obj2 = new A();

    obj2.inc();
    obj2.inc();

  }
}
