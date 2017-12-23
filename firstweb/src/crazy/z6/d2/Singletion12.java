package src.crazy.z6.d2;

public class Singletion12 {
    private static Singletion12 singletion;
    private Singletion12(){};
    public static synchronized Singletion12 getSingletion() {
        System.out.println(11111);
        if(singletion == null){
            synchronized(Singletion12.class){
                if(singletion == null){
                    System.out.println(111112);
                    singletion = new Singletion12();
                }
            }
        }
        return singletion;
    }
    public static void main(String[] args) {
        Singletion12 singletion1 = Singletion12.getSingletion();
        Singletion12 singletion2 = Singletion12.getSingletion();
        System.out.println(singletion1 == singletion2);
    }
}
