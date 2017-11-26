package arithmetic.z2.d3;

public class TestMain {

    // 测试方法
    public static void main(String[] args) {
        SLType slType = new SLType();
        DATA data = new DATA();
        data.setAge(12);
        data.setKey("5545");
        data.setName("sa");

        DATA data1 = new DATA();
        data1.setAge(123);
        data1.setKey("1111");
        data1.setName("222");

        slType.SLInsert(slType,1,data);             // 添加
        slType.SLAdd(slType,data1);                  // 追加
        // slType.SLDelete(slType,1);                // 删除
//        DATA dd = slType.SLFindByNum(1);
//        DATA dd = slType.SLFindByCont("5545");
        slType.SLAll();
         System.out.println(slType.ListLen);
        //System.out.println(slType.ListData[0].name);ListData[i]
//        System.out.println(slType.ListData[1].name);

    }

}
