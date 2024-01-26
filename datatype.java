public class datatype {
    public static void main(String[] args) {
        // By default decimal values are double in java but if we want to use float type value then we have to 
        // explicitely told that it is float value; by using a 'f' value in the number  
        double marks = 80.9;
        float m = 80.9f;
        byte val = -12;
        // To represent long type variavle value we need to add/write "l" after the value like float
        long l = 1200l;
        System.out.println(val);
         System.out.println(marks);
         System.out.println(m);
         System.out.println(l);

        //  Java does not support ASCII CODE rather it uses UNICODE

        // char takes only 2- bytes space in memory
        char c = 'k';
        System.out.println(c);
        boolean blval = true;
        System.out.println((blval));
    }
}
