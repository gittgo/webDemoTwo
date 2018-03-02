package arithmetic.z4.d10;

//  字符串数组排序
public class p4_9 {
    static final int N = 5;
    static void quickSort(String[] arr,int left,int right){ // 快速排序
        String f,t;
        int rtemp,ltemp;

        ltemp = left;
        rtemp = right;
        f=arr[(left+right)/2];
        while (ltemp<rtemp){
            while (arr[ltemp].compareTo(f)<0){
                ++ltemp;
            }
            while (arr[rtemp].compareTo(f)>0){
                --rtemp;
            }
            if(ltemp<=rtemp){
                t=arr[ltemp];
                arr[ltemp] = arr[rtemp];
                arr[rtemp]=t;
                --rtemp;
                ++ltemp;
            }
        }
        if(ltemp==rtemp){
            ltemp++;
        }

        if(left<rtemp){
            quickSort(arr,left,ltemp-1);
        }

        if(ltemp<right){
            quickSort(arr,rtemp+1,right);
        }

    }


    public static void main(String[] args){
        String[] arr = new String[]{"One","Word","Dream","BeiJING","Onlympic"};

        int i;

        System.out.println("排序前：");

        for (i= 0;i<N;i++){
            System.out.println(arr[i]);
        }

        quickSort(arr,0,N-1);
        System.out.println();

        System.out.println("排序后：");

        for (i= 0;i<N;i++){
            System.out.println(arr[i]);
        }

    }


}
