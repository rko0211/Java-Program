public class casting {
    public static void main(String[] args) {
        byte b = 127;
        int a = 257;
        // b = a ----X
        // a = b-----Y

        // Type casting --> explicite conversion

        b = (byte) a;
        // b = a;
        System.out.println(a);
        System.out.println(b);

        float f = 3.9f;
        int x = (int) f;
        System.out.println(x);
        a = b;
        System.out.println(a);
        // automatic conversion is called type conversion

        // Type promossions

        byte p = 20;
        byte q = 40;
        // byte res = p * q; --> it will throw error but as p*q exceed the range of byte
        // type variable
        int res = p * q;
        // Java automatically store large value in int variable by using type promosion
        // features
        System.out.println(res);
    }
}
