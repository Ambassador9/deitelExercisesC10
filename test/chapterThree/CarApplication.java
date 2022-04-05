package chapterThree;

public class CarApplication {
    public static void main(String[] args) {
        Car firstCar = new Car();
        Car secondCar = new Car();

        // initialise instance variables via constructor method
        firstCar.carProperties("IVM", "2022", 15_000_000);
        System.out.println("Model: " + firstCar.getModel());
        System.out.println("Year: " + firstCar.getYear());
        System.out.println("Price: " + firstCar.getPrice());
        secondCar.carProperties("Toyota", "2020", 7_000_000);
        System.out.println("Model: " + secondCar.getModel());
        System.out.println("Year: " + secondCar.getYear());
        System.out.println("Price: " + secondCar.getPrice());
        System.out.println();

        // applying the discount
        System.out.println("Discounted price for IVM:");
        System.out.println(firstCar.firstDiscountedPrice());
        System.out.println("Discounted price for Toyota:");
        System.out.println(secondCar.secondDiscountedPrice());
    }
}
