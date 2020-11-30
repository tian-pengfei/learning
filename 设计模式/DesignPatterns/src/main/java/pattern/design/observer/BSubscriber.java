package pattern.design.observer;

public class BSubscriber implements Subscriber,UseProduct{
    NewsPaper newsPaper;
    Publisher publisher;
    BSubscriber(Publisher publisher){
        this.publisher=publisher;
    }

    @Override
    public void acquireProduct(Product product) {
        this.newsPaper=(NewsPaper)product;
        use();
    }

    @Override
    public void use() {
        System.out.println("我要在id为"+newsPaper.getId()+"的报纸上找工作");
        //查看招聘信息
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
