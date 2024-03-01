class Person {
    int age;
    double height;
    double weight;

    
    public Person(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }



 
    public void display() {
        System.out.println("Person Details:");
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + height + " inches");
        System.out.println("Weight: " + weight + " kg");
    }

    public static void main(String[] args) {
        
        Person person1 = new Person(25, 6.2, 70.0);
        
        
        person1.display();
        System.out.println();


    }
}
