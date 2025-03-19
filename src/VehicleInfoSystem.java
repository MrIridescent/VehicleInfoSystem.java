import java.util.Scanner;

// Vehicle interface
interface Vehicle {
    String getMake();
    String getModel();
    int getYear();
}

// CarVehicle interface
interface CarVehicle extends Vehicle {
    void setNumberOfDoors(int doors);
    int getNumberOfDoors();
    void setFuelType(String fuelType);
    String getFuelType();
}

// MotorVehicle interface
interface MotorVehicle extends Vehicle {
    void setNumberOfWheels(int wheels);
    int getNumberOfWheels();
    void setMotorcycleType(String type);
    String getMotorcycleType();
}

// TruckVehicle interface
interface TruckVehicle extends Vehicle {
    void setCargoCapacity(double capacity);
    double getCargoCapacity();
    void setTransmissionType(String transmission);
    String getTransmissionType();
}

// Car class
class Car implements CarVehicle {
    private String make;
    private String model;
    private int year;
    private int numberOfDoors;
    private String fuelType;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setNumberOfDoors(int doors) {
        this.numberOfDoors = doors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }
}

// Motorcycle class
class Motorcycle implements MotorVehicle {
    private String make;
    private String model;
    private int year;
    private int numberOfWheels;
    private String motorcycleType;

    public Motorcycle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setNumberOfWheels(int wheels) {
        this.numberOfWheels = wheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setMotorcycleType(String type) {
        this.motorcycleType = type;
    }

    public String getMotorcycleType() {
        return motorcycleType;
    }
}

// Truck class
class Truck implements TruckVehicle {
    private String make;
    private String model;
    private int year;
    private double cargoCapacity;
    private String transmissionType;

    public Truck(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setCargoCapacity(double capacity) {
        this.cargoCapacity = capacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setTransmissionType(String transmission) {
        this.transmissionType = transmission;
    }

    public String getTransmissionType() {
        return transmissionType;
    }
}

// Main class
public class VehicleInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example: Creating a Car object
        System.out.println("Enter car details:");
        System.out.print("Make: ");
        String carMake = scanner.nextLine();
        System.out.print("Model: ");
        String carModel = scanner.nextLine();
        System.out.print("Year: ");
        int carYear = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Car car = new Car(carMake, carModel, carYear);
        System.out.print("Number of doors: ");
        int doors = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        car.setNumberOfDoors(doors);

        System.out.print("Fuel type (petrol/diesel/electric): ");
        String fuelType = scanner.nextLine();
        car.setFuelType(fuelType);

        // Display car details
        System.out.println("\nCar Details:");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Number of Doors: " + car.getNumberOfDoors());
        System.out.println("Fuel Type: " + car.getFuelType());

        // Similarly, you can add blocks for Motorcycle and Truck

        scanner.close();
    }
}