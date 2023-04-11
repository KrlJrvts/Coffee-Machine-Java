package machine;

public class TakeMoney {
    public static int[] takeMoney(int money){
        System.out.println("I gave you $" + money);
        money = 0;
        return new int[] {money};

    }
}
