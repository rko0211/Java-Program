import java.util.Scanner;

class check_palindrome {
   static  boolean checkPalindrome(){
         Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter array size ");
        size = sc.nextInt();
        int a[];
        a = new int[size];
        System.out.println("Enter array elements ");
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<size/2;i++){
          if(a[i]!=a[size-i-1]){
            return false;
          }
        }
        return true;
    }
    public static void main(String[] args) {
       if(checkPalindrome()){
        System.out.println("The array is Palindrome");
       }
       else{
        System.out.println("The array is not palindrome");
       }
    }
}
