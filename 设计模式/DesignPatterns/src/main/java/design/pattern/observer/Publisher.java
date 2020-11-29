package design.pattern.observer;

public interface Publisher {

    void addsubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void sendProduct();
}
