package arithmetic.z3.d6;

import java.util.Random;
import java.util.Scanner;

public class P3_5 extends Random{

    static double MontePI(int n){
        double PI;
        double x,y;
        int i,sum;
        sum = 0;
        for(i=1;i<n;i++){
            x = Math.random();
            y = Math.random();
            if((x*x+y*y)<=1)sum++;
        }
        PI = 4.0*sum/n;
        return PI;
    }

    public static void main(String[] args) {

//          final double DOUBLE_UNIT = 0x1.0p-53; // 1.0 / (1L << 53)
//        System.out.println(DOUBLE_UNIT);

        P3_5 r = new P3_5();
        System.out.println(r.next(27));

    }
}
