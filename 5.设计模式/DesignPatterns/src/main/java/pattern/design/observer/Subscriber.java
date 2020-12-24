package pattern.design.observer;

public interface Subscriber {

    void acquireProduct(Product product);
    void subscribe();
    void unsubscribe();
}
