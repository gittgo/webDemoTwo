package src.arithmetic.z4.d5;

public class P4_4 {

    static final int SIZE = 10;

    public static void shellSort(int[] a){
        int i,j,h;
        int r,temp;
        int x=0;

        for (r = a.length/2;  r>=1 ; r/=2) {
            for (i = r; i < a.length ; i++) {
                temp = a[i];
                j=i-r;
                while (j>=0 && temp<a[j]){
                    a[r+j] = a[j];
                    j-=r;
                }
                a[j+r] = temp;
            }
            x++;
            System.out.println("第"+x+ "步排序为：");
            for (h = 0; h < a.length; h++) {
                System.out.print("  "+a[h]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] shuzu = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            shuzu[i] = (int)(100 + Math.random()*(100+1));
        }
        //
        System.out.println("排序前数组为：");
        for (int i = 0; i < shuzu.length; i++) {
            System.out.print("  "+ shuzu[i]);
        }
        //
        System.out.println();
        shellSort(shuzu);
        System.out.println("排序后数组为：");
        for (int i = 0; i < shuzu.length; i++) {
            System.out.print("  "+ shuzu[i]);
        }

    }
}
