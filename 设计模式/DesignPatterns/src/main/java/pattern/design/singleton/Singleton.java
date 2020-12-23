package pattern.design.singleton;

public class Singleton {
    private static volatile Singleton uniqueSingleton =new Singleton();
    private Singleton(){}

    public static  Singleton getInstance(){
        if(uniqueSingleton==null){
            synchronized (Singleton.class){
                if (uniqueSingleton == null) {
                    uniqueSingleton = new Singleton();
                }
            }
        }
        return uniqueSingleton;
    }

    public static void main(String[] args) {
        uniqueSingleton = new Singleton();
    }
}
