package arithmetic.z4.d9;

import java.util.Date;

public class p4_8 {  // 倒序插入排序

    static final int SIZE = 10;
    static void insertionSort(int[] a,int len){  // 插入排序
        int i,j,t,h;

        for(i = 1;i<len;i++){
            t=a[i];
            j=i-1;
            while (j>=0 && t>a[j]){   // 返序
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = t;

            System.out.println("第"+i+"步排序结果：");  // 输出每步排序结果
            for(h=0;h<len;h++){
                System.out.print(" "+a[h]);
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
        System.out.println("begin time"+ new Date());
//        for (int i = 0; i < shuzu.length; i++) {
//            System.out.print("  "+ shuzu[i]);
//        }
        //
        System.out.println();
        insertionSort(shuzu,SIZE);
        System.out.println("排序后数组为：");
        System.out.println("end time"+ new Date());
//        for (int i = 0; i < shuzu.length; i++) {
//            System.out.print("  "+ shuzu[i]);
//        }

    }






}
