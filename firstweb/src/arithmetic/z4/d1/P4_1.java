package src.arithmetic.z4.d1;

public class P4_1 {
    static final int SIZE = 10;
    public static void bubbleSort(int[] a){
        int temp;
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
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
        bubbleSort(shuzu);
        System.out.println("排序后数组为：");
        for (int i = 0; i < shuzu.length; i++) {
            System.out.print("  "+ shuzu[i]);
        }

    }
}
