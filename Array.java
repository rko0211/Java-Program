 class Array {
    public static void main(String[]args){
        // Array declaration
        // int []arr;
     //  Static array declaration
     int[] ar = {1,2,3,4,5,6,7,8,9,10};
     for(int i=0;i<ar.length;i++){
        System.out.print(ar[i]+" ");
     }
     System.out.println();

        int a[] ;
        // Dynamically memory is allocated for the array a. 'a' is a base address of the array, a
        a = new int[10];

      for(int i=0;i<10;i++){
        System.out.print(a[i]+" ");
      }
        System.out.println();
        
            //   For each loop
        for(int i:ar){
             System.out.print(i+" ");
           }
       System.out.println();
       
    }
    
}
