package pattern.design.singleton;

public class Singleton2 {
    private static Singleton2 uniqueSingleton;
    private Singleton2(){}

    public static Singleton2 getInstance(){
        if(uniqueSingleton==null)
            uniqueSingleton=new Singleton2();
        return uniqueSingleton;
    }
}
