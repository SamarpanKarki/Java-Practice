package classandobject;

public class CarConstructorMain {
    public static void main(String[] args) {
        CarConstructor c1 = new CarConstructor("Civic", "Honda", 49999.99);
        CarConstructor c2 = new CarConstructor("GTR", "Nissan");
        CarConstructor c3 = new CarConstructor(c1);
        c1.display();
        c2.display();
        c3.display();
    }
}