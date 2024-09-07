public class strings {
  public static void main(String[] args) {
    // String s1 = "Hello world 1";
    // System.out.println(s1);

    // String s2 = new String();
    // System.out.println(s2);

    // String s3 = new String("Hello world 3");

    // System.out.println(s3);

    // System.out.println(s3.hashCode());

    // IN java strings are immutable(can't change them directly) we can not iterate
    // strings character directly;

    String s4 = new String("Hello world");

    for (int i = 0; i < s4.length(); i++) {
      System.out.println(s4[i]);
    }

    System.out.println(s4);

  }
}
