package design.pattern.observer;

public class NewsPaper implements  Product {

    String id;
    String info;

    NewsPaper(String id, String info){
        this.id=id;
        this.info=info;
    }
    public String getId() {
        return id;
    }
    public String getInfo() {
        return info;
    }

}
