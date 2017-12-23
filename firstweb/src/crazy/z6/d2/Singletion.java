package src.crazy.z6.d2;

public class Singletion {
    private static Singletion singletion;
    private Singletion(){};
    public static Singletion getSingletion() {
        if(singletion==null){
            singletion = new Singletion();
        }
        return singletion;
    }
    public static void main(String[] args) {
        Singletion singletion1 = Singletion.getSingletion();
        Singletion singletion2 = Singletion.getSingletion();
        System.out.println(singletion1 == singletion2);
    }
}
