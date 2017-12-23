package src.crazy.z6.d1;

public class Test1Integercatch {

    // TODO  反射的使用； 验证从数据库取出的数据用Integer  类型用== 是不是一致的

    public static void ct(){
            try{
//                Class<?>cache=Integer.class.getDeclaredClasses()[0];
//                FieldmyCache=cache.getDeclaredField("cache");
//                Fieldhigh=cache.getDeclaredField("high");
//                Fieldlow=cache.getDeclaredField("low");
//                myCache.setAccessible(true);
//                high.setAccessible(true);
//                low.setAccessible(true);
//                /*去除final修饰符的影响，将字段设为可修改的*/
//                FieldmodifiersField=Field.class.getDeclaredField("modifiers");
//                modifiersField.setAccessible(true);
//                modifiersField.setInt(high,high.getModifiers()&~Modifier.FINAL);
//                modifiersField.setInt(low,low.getModifiers()&~Modifier.FINAL);
//                modifiersField.set(myCache,myCache.getModifiers()&~Modifier.FINAL);
//
//                MethodmodifiersMethod=Method.class.getDeclaredMethod("getModifiers");
//                modifiersMethod.setAccessible(true);
//                high.setInt(high,high.getModifiers()&~Modifier.FINAL);
//                high.set("high",1000);
//
//                low.setInt(low,low.getModifiers()&~Modifier.FINAL);
//                low.set("low",-1001);
//
//                /*修改cache数组的信息,将数组的大小和内容都修改*/
//                Integer[]ca=new Integer[2002];
//                intj=-1001;
//                for(intk=0;k<ca.length;k++)ca[k]=newInteger(j++);
//                myCache.set(null,ca);
            }catch(Exception e){
                e.printStackTrace();
            }
    }

    public static void main(String[] args) {

        String s = "ssss";
        System.out.println( s.equals("ss"));
        System.out.println( s.hashCode());
        s.hashCode();

        String a="Aa";
        String b="BB";
        int aa=a.hashCode();
        int bb=b.hashCode();
        System.out.println( aa);
        System.out.println( bb);
        Integer u = new Integer(2);
        Integer u2 = new Integer(2);
        Integer u3 = 2;
        Integer u4 = 2;
        Integer u5 = 12345;
        Integer u6 = 12345;
        System.out.println(u==u2);
        System.out.println(u3==u2);
        System.out.println(u3==u4);
        System.out.println(u5==u6);
    }


}
