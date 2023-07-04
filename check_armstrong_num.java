
import java.util.*;

public class check_armstrong_num {
    static boolean checkAemstromnum(){
        System.out.println("Enter the number");
        int  n; 
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int x = n;
        int ans =0;
        while(n>0){
         int rem = n%10;
         ans+=rem;
         n/=10;
        }
        if(x==ans){
            return true;
        }
        return false;
        
     }
    public static void main(String[] args) {
     
        if(checkAemstromnum()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

}
