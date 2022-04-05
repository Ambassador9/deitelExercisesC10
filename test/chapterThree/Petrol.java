package chapterThree;

public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase petrol = new PetrolPurchase();

        // initial values of instance variables
        System.out.println("The location is: " + petrol.getLocation());
        System.out.println("The type of petrol is: " + petrol.getPetrolType());
        System.out.println("The quantity purchased in litre is: " + petrol.getQuantity());
        System.out.println("the price per litre is: " + petrol.getPricePerLiter());
        System.out.println("the percentage discount is: " + petrol.getPercentageDiscount());
        System.out.println("The purchase amount is: " + petrol.getPurchaseAmount());
        System.out.println();

        // assigning values to instance variables via constructor method
        petrol.petrolPurchase("Ebonyi", "Diesel", 20, 350, 0.05);
        System.out.println("The location is: " + petrol.getLocation());
        System.out.println("The type of petrol is: " + petrol.getPetrolType());
        System.out.println("The quantity purchased in litre is: " + petrol.getQuantity());
        System.out.println("the price per litre is: " + petrol.getPricePerLiter());
        System.out.println("the percentage discount is: " + petrol.getPercentageDiscount());
        System.out.println("The purchase amount is: " + petrol.getPurchaseAmount());
        System.out.println();

        // reassigning values via setter method
        petrol.setLocation("Lagos");
        petrol.setPetrolType("Liquefied gas");
        petrol.setQuantity(50);
        petrol.setPricePerLiter(1200);
        petrol.setPercentageDiscount(0.045);
        System.out.println("The location is: " + petrol.getLocation());
        System.out.println("The type of petrol is: " + petrol.getPetrolType());
        System.out.println("The quantity purchased in litre is: " + petrol.getQuantity());
        System.out.println("the price per litre is: " + petrol.getPricePerLiter());
        System.out.println("the percentage discount is: " + petrol.getPercentageDiscount());
        System.out.println("The purchase amount is: " + petrol.getPurchaseAmount());
    }
}
