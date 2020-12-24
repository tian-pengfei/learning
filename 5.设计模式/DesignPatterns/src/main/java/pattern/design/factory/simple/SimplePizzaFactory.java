package pattern.design.factory.simple;

public class SimplePizzaFactory {

    public Pizza CreatePizza(String type){
        Pizza pizza=null;
        if(type.equals("cheese")){
            pizza=new CheesePizza();
        }else if(type.equals("greek")){
            pizza=new GreekPizza();
        }else if(type.equals("pepperoni")){
            pizza=new PepperoniPizza();
        }else if(type.equals("veggle")){
            pizza=new VegglePizza();
        }
        return pizza;
    }
}
