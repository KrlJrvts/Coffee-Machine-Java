package machine;

import java.util.Scanner;

import static machine.DrinkMaker.*;
import static machine.FillMachine.*;
import static machine.TakeMoney.*;
import static machine.Rem.*;



public class CoffeeMachine {
    public static void main(String[] args) {

        int water = 400; //ml
        int milk = 540; //ml
        int beans = 120; //g
        int cups = 9; //disposable cups
        int money = 550; //$

        Scanner scanner = new Scanner(System.in);
        boolean statusMainMenu = true;
        while (statusMainMenu) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String firstMenu = scanner.nextLine();
            switch (firstMenu) {
                case "buy" -> {
                    int[] newStock = drinkMaker(water, milk, beans, cups, money);
                    water = newStock[0];
                    milk = newStock[1];
                    beans = newStock[2];
                    cups = newStock[3];
                    money = newStock[4];
                }
                case "fill" -> {
                    int[] newStock = fillMachine(water, milk, beans, cups);
                    water = newStock[0];
                    milk = newStock[1];
                    beans = newStock[2];
                    cups = newStock[3];
                }
                case "take" -> {
                    int[] newStock = takeMoney(money);
                    money = newStock[0];
                }

                case "remaining" -> rem(water, milk, beans, cups, money);
                case "exit" -> statusMainMenu = false;
                default -> System.out.println("Invalid input");
            }
        }
    }
}

