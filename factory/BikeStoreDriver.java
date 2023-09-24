package factory;

import java.util.Scanner;
/**
 * A driver class for the BikeStore program.
 */
public class BikeStoreDriver {
	private Scanner scanner;

    /**
     * Constructs a new BikeStoreDriver object and initializes the scanner.
     */
	public BikeStoreDriver() {
		scanner = new Scanner(System.in);
	}
	/**
     * Runs the BikeStore program, which allows users to choose what bike to create and assemble.
     */
	public void runBikeStore() {
		System.out.println("Welcome to our Bike Store.");
		BikeStore bikeStore = new BikeStore();
		Bike bike;

		switch (getBikeType()) {
			case 0:
				bike = bikeStore.createBike("tricycle");
				break;
			case 1:
				bike = bikeStore.createBike("strider");
				break;
			case 2:
				bike = bikeStore.createBike("kids bike");
				break;
			default:
				System.out.println("We are sorry to hear you do not want a bike.");
				System.out.println("Goodbye");
				return;
		}
		System.out.println(bike.assembleBike());
	}
 /**
     * Prompts the user to enter the type of bike they want and returns the selected type.
     *
     * @return The selected bike type as an integer (1 for tricycle, 2 for strider, 3 for kids bike, 4 for none).
     */
	private int getBikeType() {
		while (true) {
			System.out.println("\nEnter Bike Type: ");
			System.out.println("1. Tricycle\n2. Strider\n3. Kids Bike\n4. None");

			try {
				String line = scanner.nextLine();
				int num = Integer.parseInt(line) - 1;
				if (num >= 0 && num <= 3) {
					return num;
				}
			} catch (NumberFormatException e) {
			}
			System.out.println("Please enter a valid whole number between 1 and 4.");
		}
	}
 	/**
     * The main method that starts the BikeStore program.
     */
	public static void main(String[] args) {
		BikeStoreDriver driver = new BikeStoreDriver();
		driver.runBikeStore();
	}

}
