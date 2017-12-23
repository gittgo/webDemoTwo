package src.crazy.z6.d2;

public class Singletion11 {
    private static Singletion11 singletion;
    private Singletion11(){};
    public static synchronized Singletion11 getSingletion() {
        if(singletion==null){
            singletion = new Singletion11();
        }
        return singletion;
    }
    public static void main(String[] args) {
        Singletion11 singletion1 = Singletion11.getSingletion();
        Singletion11 singletion2 = Singletion11.getSingletion();
        System.out.println(singletion1 == singletion2);
    }
}
