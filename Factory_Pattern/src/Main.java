import Pizza.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PizzaFactory factory= new PizzaFactory();
        System.out.println("Place your order");
        System.out.println("1- Cheese Pizza");
        System.out.println("2- Pepperoni Pizza");
        System.out.println("3- Veggie Pizza");
        Pizza pizza=null;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==1)
            pizza=factory.createPizza("Cheese");
        if(num==2)
            pizza=factory.createPizza("Pepperoni");
        if(num==3)
            pizza=factory.createPizza("Veggie");
        if(pizza!=null)
            System.out.println("Ordered Pizza is"+pizza );
    }
}
