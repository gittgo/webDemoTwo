package src.crazy.z6.d2;

public class Singletion13 {
    private static class LazyHolder{
        private static final Singletion13 INSTANCE = new Singletion13();
    }
    private Singletion13(){}
    public static final Singletion13 getInstance(){
        return LazyHolder.INSTANCE;
    }
    public static void main(String[] args) {
        Singletion13 singletion1 = Singletion13.getInstance();
        Singletion13 singletion2 = Singletion13.getInstance();
        System.out.println(singletion1 == singletion2);

    }
}
