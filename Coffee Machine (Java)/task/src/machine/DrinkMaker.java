package machine;

import java.util.Scanner;

public class DrinkMaker {
    public static int[] drinkMaker(int water, int milk, int beans, int cups, int money){
        Scanner scanner = new Scanner(System.in);
        // espresso inputs
        int espressoWater = 250;
        int espressoBeans = 16;
        int espressoPrice = 4;

        // latte inputs
        int latteWater = 350;
        int latteMilk = 75;
        int latteBeans = 20;
        int lattePrice = 7;

        // cappuccino inputs
        int cappuccinoWater = 200;
        int cappuccinoMilk = 100;
        int cappuccinoBeans = 12;
        int cappuccinoPrice = 6;

        boolean statusSecondMenu = true;
        while (statusSecondMenu) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
            String secondMenu = scanner.nextLine();

            switch (secondMenu) {
                case "1" -> {
                    if (water >= espressoWater && beans >= espressoBeans && cups >= 1) {
                        water = water - espressoWater;
                        beans = beans - espressoBeans;
                        cups = cups - 1;
                        money = money + espressoPrice;
                        System.out.println("I have enough resources, making you a coffee!");
                    } else if (water < espressoWater) {
                        System.out.println("Sorry, not enough water!");
                    } else if (beans < espressoBeans){
                        System.out.println("Sorry, not enough beans!");
                    } else {
                        System.out.println("Sorry, not enough cups!");
                    }
                    statusSecondMenu = false;

                }
                case "2" -> {
                    if (water >= latteWater && milk >= latteMilk && beans >= espressoBeans && cups >= 1) {
                        water = water - latteWater;
                        milk = milk - latteMilk;
                        beans = beans - latteBeans;
                        cups = cups - 1;
                        money = money + lattePrice;
                        System.out.println("I have enough resources, making you a coffee!");
                    } else if (water < latteWater) {
                        System.out.println("Sorry, not enough water!");
                    } else if (milk < latteMilk){
                        System.out.println("Sorry, not enough milk!");
                    } else if (beans < latteBeans){
                        System.out.println("Sorry, not enough beans!");
                    } else {
                        System.out.println("Sorry, not enough cups!");
                    }
                    statusSecondMenu = false;
                }
                case "3" -> {
                    if (water >= cappuccinoWater && milk >= cappuccinoMilk && beans >= cappuccinoBeans && cups >= 1) {
                        water = water - cappuccinoWater;
                        milk = milk - cappuccinoMilk;
                        beans = beans - cappuccinoBeans;
                        cups = cups - 1;
                        money = money + cappuccinoPrice;
                        System.out.println("I have enough resources, making you a coffee!");
                    } else if (water < latteWater) {
                        System.out.println("Sorry, not enough water!");
                    } else if (milk < latteMilk){
                        System.out.println("Sorry, not enough milk!");
                    } else if (beans < latteBeans){
                        System.out.println("Sorry, not enough beans!");
                    } else {
                        System.out.println("Sorry, not enough cups!");
                    }
                    statusSecondMenu = false;
                }
                case "back" ->{
                    statusSecondMenu = false; // exit
                }
                default -> {
                    System.out.println("No such kind of drink!");
                }
            }
        }
        return new int[] {water, milk, beans, cups, money};
    }
}
