package design.pattern.observer;

public class ASubscriber implements Subscriber,UseProduct{
    NewsPaper newsPaper;
    Publisher publisher;

    ASubscriber(Publisher publisher){
        this.publisher=publisher;
    }
    @Override
    public void acquireProduct(Product product) {
        this.newsPaper=(NewsPaper)product;
        use();
    }
    @Override
    public void use() {
        System.out.println("我要更换宣传栏报纸，这次报纸id为" + newsPaper.getId());
        //更换宣传栏报纸
    }
    @Override
    public void subscribe() {
        publisher.addsubscriber(this);
    }

    @Override
    public void unsubscribe() {
        publisher.removeSubscriber(this);
    }
}
