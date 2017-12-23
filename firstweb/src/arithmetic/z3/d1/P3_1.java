package arithmetic.z3.d1;

import java.util.Scanner;

public class P3_1 {
    static int chichen,habbit;// chichen 代表鸡的个数，habbit 代表兔的个数
    public static int qiongju(int head,int foot){
        int re,i,j;
        re = 0;
        for (i = 0;  i< head; i++) {
            j=head-i;
            if (i*2+j*4 == foot){
                re = 1;
                chichen = i;
                habbit = j;
            }
        }
        return re;
    }

    public static void main(String[] args) {
        int re,head,foot;
        System.out.println("穷举法求解鸡兔同笼问题：");
        System.out.println("请输入头数");
        Scanner input = new Scanner(System.in);
        head = input.nextInt();
        System.out.println("请输入头数");
        foot = input.nextInt();
        re = qiongju(head,foot);
        if(re ==1 ){
            System.out.println("鸡有"+chichen+"只，兔有"+habbit+"只");
        }else {
            System.out.println("无法求解！");
        }
    }

//    穷举法求解鸡兔同笼问题：
//    请输入头数
//35
//    请输入头数
//94
//    鸡有23只，兔有12只



}
