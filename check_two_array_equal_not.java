import java.util.*;
class check_two_array_equal_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // In java by default array are initialized by 0
        int size = sc.nextInt();
        int[] a = new int[size];
        int maxi1 = -10000000;
        for(int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
            if(maxi1<a[i]){
                maxi1=a[i];
            }
        }
        int maxi2 = -10000000;
        int[] b = new int[size];
        for(int i=0;i<b.length;i++){
            b[i]= sc.nextInt();
            if(maxi2<b[i]){
                maxi2 = b[i];
            }
        }
        int []hash1 = new int[maxi1+1];
        int[] hash2 = new int[maxi2+1];
        for(int i=0;i<a.length;i++){
            hash1[a[i]]++;
            hash2[b[i]]++;
        }
        boolean flag = true;
        for(int i=0;i<a.length;i++){
            if(hash1[a[i]] != hash2[a[i]]){
                flag =false;
                break;
            }
        }
        if(flag){
            System.out.println("Array are equal");
        }
        else
        System.err.println("Array are not equal");

       
    }
}
