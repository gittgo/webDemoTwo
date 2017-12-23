package arithmetic.z3.d3;

import java.util.Scanner;

public class P3_3 {

    static long fact(int n){
        if(n<=1){
            return 1;
        }else {
            return n*fact(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("输入一个正整数！");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long st = fact(n);
        System.out.println("结果为："+st);
    }

}
