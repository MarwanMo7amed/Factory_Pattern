package Pizza;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String sauce;
    ArrayList toppings= new ArrayList();
    String dough;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public ArrayList getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList toppings) {
        this.toppings = toppings;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                ", dough='" + dough + '\'' +
                '}';
    }
}
