package pattern.design.observer;

public interface Publisher {

    void addsubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void sendProduct();
}
