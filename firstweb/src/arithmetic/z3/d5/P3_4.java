package src.arithmetic.z3.d5;

public class P3_4 {

    static final int MAXNUM = 30;
    static int FalseCoin(int coin[],int low,int high){
        int i,sum1,sum2,sum3;
        int re =0;
        sum1=sum2=sum3=0;

        if(low+1 == high){
            if(coin[low]<coin[high]){
                re = low+1;
                return re;
            }else{
                re = high+1;
                return re;
            }
        }

        if ((high-low+1)%2 == 0){ // n 是偶数
            for (i=low;i<=low+(high-low)/2;i++){
                sum1 = sum1 + coin[i];
            }
            for (i=low+(high=low)/2+1;i<=high;i++){
                sum2 = sum2 + coin[i];
            }
            if(sum1 > sum2){
                re = FalseCoin(coin,low+(high-low)/2+1,high);
                return re;
            }else if(sum1<sum2){
                re = FalseCoin(coin,low,low+(high-low)/2);
                return re;
            }else {

            }
        }
        else {
            for (i=low;i<low+(high-low)/2-1;i++){
                sum1 = sum1 + coin[i];
            }
            for (i=low+(high=low)/2+1;i<=high;i++){
                sum2 = sum2 + coin[i];
            }
            sum3 = coin[low+(high-low)/2];
            if(sum1>sum2){
                re = FalseCoin(coin,low+(high-low)/2+1,high);
                return re;
            }else if(sum1<sum2){
                re = FalseCoin(coin,low,low+(high-low)/2-1);
                return re;
            }else{}

            if(sum1+sum3 == sum2+sum3){
                re = low+(high-low)/2+1;
                return re;
            }
        }
        return re;

    }

}
