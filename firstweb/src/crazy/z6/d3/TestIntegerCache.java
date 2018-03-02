package src.crazy.z6.d3;

public class TestIntegerCache {

    public static void main(String[] args) {
        Integer in1 = new Integer(127);
        Integer in4 = new Integer(127);
        Integer in2 = Integer.valueOf(127);
        Integer in3 = Integer.valueOf(127);
        Integer in5 = 127;

        System.out.println(in1 == in2);
        System.out.println(in2 == in3);
        System.out.println(in3 == in4);
        System.out.println(in1 == in4);
        System.out.println(in5 == in1);
        System.out.println(in5 == in2);

//        6
//        false
//        true
//        false
//        false
//        false
//        true
    }
}
