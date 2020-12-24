package pattern.design.singleton;

public class Singleton3 {
    private static Singleton3 uniqueSingleton =new Singleton3();
    private Singleton3(){}

    public static synchronized Singleton3 getInstance(){
        if(uniqueSingleton==null)
            uniqueSingleton=new Singleton3();
        return uniqueSingleton;
    }
}
