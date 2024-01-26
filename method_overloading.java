class A {
    public int add(int a, int b, int c) {
        return (a + b + c);
    }

    public float add(int a, int b, float c) {
        return (a + b + c);
    }
}

public class method_overloading {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.add(1, 2, 4));

        System.out.println(obj.add(1, 2, 4.5f));

    }
}
