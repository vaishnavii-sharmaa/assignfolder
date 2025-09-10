public class P3 {
    class Person {
    String name;
    int age;

   
    Person() {
        name = "Unknown";
        age = 0;
    }

    
    Person(String n, int a) {
        name = n;
        age = a;
    }

    
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public static void main(String[] args) {
        P3 outer = new P3();
        Person p1 = outer.new Person("Alice", 25);   
        Person p2 =outer. new Person(p1);            
    }
}
    
}
