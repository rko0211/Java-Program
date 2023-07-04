import java.util.Scanner;

class max_min_ele_arr {
    public static void main(String[] args) {
        // new key word is used for dynamically memory allocation
        int a[] = new int[10];
       
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Element ");
        for(int i=0;i<10;i++){
            a[i] = sc.nextInt();
        }
   
        int mini = 1000000000;
        int maxi = -100000000;
        for(int i=0;i<a.length;i++){
            if(mini>a[i]){
                mini = a[i];
            }
            if(maxi<a[i]){
                maxi = a[i];
            }
        }
        System.out.println("Maximum and Minimum value in the array is "+ maxi+" "+ mini);
        
    }
}
