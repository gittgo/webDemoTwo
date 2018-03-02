package src.test;
import blackhorse.JDBC.Demo3;
import org.junit.Test;


public class Demo3Test {
    @Test
    public void test1() throws Exception {
        Demo3 demo3 = new Demo3();
        demo3.test1();
    }

    @Test
    public void test2() throws Exception {
        Demo3 demo3 = new Demo3();
        demo3.testinsert();
    }

    @Test
    public void test3() throws Exception {
        Demo3 demo3 = new Demo3();
        demo3.testupdate();
    }

    @Test
    public void test4() throws Exception {
        Demo3 demo3 = new Demo3();
        demo3.testdelete();
    }

}