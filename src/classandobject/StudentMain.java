package classandobject;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name= "Samarpan Karki";
        s1.age = 20;
        s1.roll = 11;
        Student s2 = new Student();
        s2.name = "Mahesh Karki";
        s2.age = 20;
        s2.roll = 10;
        System.out.println("Student name : " + s1.name);
        System.out.println("Age : " +  s1.age);
        System.out.println("Roll number : " + s1.roll);
        System.out.println("Student name : " + s2.name);
        System.out.println("Age : " +  s2.age);
        System.out.println("Roll number : " + s2.roll);
    }
}
