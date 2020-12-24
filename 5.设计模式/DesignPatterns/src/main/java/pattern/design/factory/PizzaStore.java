package pattern.design.factory;

public class PizzaStore {
    Pizza pizza;
    public Pizza orderPizza(String type){
        Pizza pizza=new Pizza();
        if(type.equals("cheese")){
            pizza=new CheesePizza();
        }else if(type.equals("greek")){
            pizza=new GreekPizza();
        }else if(type.equals("pepperoni")){
            pizza=new PepperoniPizza();
        }else if(type.equals("veggle")){
            pizza=new VegglePizza();
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
