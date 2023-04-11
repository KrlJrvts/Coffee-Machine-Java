package machine;

import java.util.Scanner;

public class FillMachine {
    public static int[] fillMachine(int water, int milk, int beans, int cups){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water you want to add:");
        int newWater = scanner.nextInt();
        water = water + newWater;
        System.out.println("Write how many ml of milk you want to add:");
        int newMilk = scanner.nextInt();
        milk = milk + newMilk;
        System.out.println("Write how many grams of coffee beans you want to add: ");
        int newBeans = scanner.nextInt();
        beans = beans + newBeans;
        System.out.println("Write how many disposable cups you want to add: ");
        int newCups = scanner.nextInt();
        cups = cups + newCups;

        return new int[] {water, milk, beans, cups};
    }
}
