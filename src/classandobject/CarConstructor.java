package classandobject;

public class CarConstructor {
    String Model;
    String Brand;
    double Price;

    CarConstructor(String Model, String Brand, double Price) {
        System.out.println("Car Object Created");
        this.Model = Model;
        this.Brand = Brand;
        this.Price = Price;
    }

    CarConstructor(String Model, String Brand) {
        System.out.println("Second Car Object Created");
        this.Model = Model;
        this.Brand = Brand;
    }

    CarConstructor (CarConstructor c){
        this.Model = c.Model;
        this.Brand = c.Brand;
        this.Price = c.Price;
    }

    void display() {
        System.out.println(Model);
        System.out.println(Brand);
        System.out.println(Price);
    }
}
