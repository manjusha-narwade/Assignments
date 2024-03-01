 class Vehicle {
     double price;
     String color;
     String model;

    // Constructor to initialize attributes
    public Vehicle(double price, String color, String model) {
       this.price = price;
       this.color = color;
       this.model = model;
    }

    // Method to display details of the vehicle
    public void display() {
        System.out.println("Vehicle Details:");
        System.out.println("Price: $" + price);
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        // Creating an instance of the Vehicle class and initializing it with values
        Vehicle myVehicle = new Vehicle(65000.0, "Blue", "Activa");

        // Displaying details of the vehicle using the display method
        myVehicle.display();
    }
}

