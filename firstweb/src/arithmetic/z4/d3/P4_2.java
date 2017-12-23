package src.arithmetic.z4.d3;

public class P4_2 {

    static final int SIZE = 10;

    public static void selectSort(int[] a){
        int index,temp;
        for (int i = 0; i < a.length-1; i++) {
            index = i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j] < a[index]){
                    index = j;
                }
            }
            // 交换参数
            if(index!=i){
              temp = a[i];
              a[i] = a[index];
              a[index] = temp;
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
        selectSort(shuzu);
        System.out.println("排序后数组为：");
        for (int i = 0; i < shuzu.length; i++) {
            System.out.print("  "+ shuzu[i]);
        }

    }
}
