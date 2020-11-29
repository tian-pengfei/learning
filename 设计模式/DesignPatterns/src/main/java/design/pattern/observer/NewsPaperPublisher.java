package design.pattern.observer;


import java.util.List;

public class NewsPaperPublisher implements Publisher {

    List<Subscriber> subscribers;
    NewsPaper newsPaper;

    @Override
    public void addsubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void sendProduct() {
        for (Subscriber subscriber:subscribers){
            subscriber.acquireProduct(newsPaper);
        }
    }

    public void createNewsPaper(String id,String info){

        this.newsPaper=new NewsPaper(id,info);
    }

}
