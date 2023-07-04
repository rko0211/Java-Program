import java.util.*;
class Main {
public static void main(String[] args) {
    System.out.println("Hello World");
    Scanner sc = new Scanner(System.in);
     int x;
     x = sc.nextInt();
    if(x<18){
        System.out.println("You are not eligible for vote");
    }
    else{
        System.out.println("You are eligible for vote");
    }
}
}