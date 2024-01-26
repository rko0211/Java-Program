class a {
    public int add(int n1, int n2, int n3) {
        return (n1 + n2 + n3);
    }
}

public class obj {
    public static void main(String[] args) {

        a obj = new a(); // object of class 'a'
        System.out.println(obj.add(2, 3, 4));
    }
}
