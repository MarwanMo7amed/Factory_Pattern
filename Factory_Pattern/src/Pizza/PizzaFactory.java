package Pizza;

public class PizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type=="Cheese")
            pizza=new CheesePizza();
        if(type=="Veggie")
            pizza=new VeggiePizza();
        if(type=="Pepperoni")
            pizza=new PepperoniPizza();
        return pizza;
    }
}
