package arithmetic.z4.d8;

public class p4_7 {

    static final int SIZE=15;
    static void mergeOne(int a[],int b[],int n,int len){
        int i,j,k,s,e;
        s=0;
        while (s+len<n){
            e=s+2*len-1;
            if(e>=n){   //最后一段可能少于len个结点
                e=n-1;
            }
            // 相邻有序段合并
            k=s;
            i=s;
            j=s+len;
            while (i<s+len && j<=e){
                if (a[i]<=a[j]){
                    b[k++]=a[i++];
                }else{
                    b[k++]=a[j++];
                }
            }
            while (i<s+len){
                b[k++]=a[j++];
            }
            while (j<=e){
                b[k++]=a[j++];
            }
            s=e+1;
        }
        if (s<n){
            for (;s<n;s++){
                b[s]=a[s];
            }
        }
    }
}
