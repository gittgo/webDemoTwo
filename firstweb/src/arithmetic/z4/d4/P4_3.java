package arithmetic.z4.d4;

public class P4_3 {

    static final int SIZE = 10;

    public static void insertionSort(int[] a){
        int i,j,t,h;
        for (i = 1; i < a.length; i++) {
            t=a[i];
            j=i-1;
            while (j>=0 && t<a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = t;


            System.out.print("第"+i+"步排序结果");

            for (int k = 0; k < a.length; k++) {
                System.out.print("  "+a[k]);
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
        insertionSort(shuzu);
        System.out.println("排序后数组为：");
        for (int i = 0; i < shuzu.length; i++) {
            System.out.print("  "+ shuzu[i]);
        }

    }
}
