public class threeDimensionalArray {
    public static void main(String[] args) {
        int a[][][] = new int[2][2][3];
        // Total element -> 2 X 2 X 3
        a[0][0][0] = 1;
        a[0][0][1] = 2;
        a[0][0][2] = 3;
        a[0][1][0] = 4;
        a[0][1][1] = 5;
        a[0][1][2] = 6;

        a[1][0][0] = 7;
        a[1][0][1] = 8;
        a[1][0][2] = 9;
        a[1][1][0] = 10;
        a[1][1][1] = 11;
        a[1][1][2] = 12;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    System.out.print(a[i][j][k]+" ");
                }
                System.err.println();
            }
            System.out.println();
        }
    }
}
