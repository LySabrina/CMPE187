import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GumballMachine {

    //inputtedCurrency used to keep track the amount of coins inserted by user
    private int inputtedCurrency;

    //Coins that are only valid for the gumball machine
    private final List VALID_COINS = Arrays.asList("dime", "nickel", "quarter");

    /**
     * Initialize GumballMachine with 0 coins
     */
    public GumballMachine(){
        inputtedCurrency = 0;
    }

    /**
     * Dispenses Yellow Gumball
     * @return
     */
    public void dispenseYellow(){
        if(inputtedCurrency >= 10){
            inputtedCurrency -= 10;
            System.out.println("Dispensed: 1 yellow gumball");
            System.out.println("Current inputted currency: " + inputtedCurrency);
        }
        else{
            System.out.println( "Not enough currency. Please input at least 10 cents");
        }


    }

    public void dispenseRed(){
        if(inputtedCurrency >= 5){
            inputtedCurrency -= 5;
            System.out.println( "Dispensed: 1 red gumball");
            System.out.println("Current inputted currency: " + inputtedCurrency);
        }
        else{
            System.out.println( "Not enough currency. Please input at least 5 cents");
        }


    }

    public void insert(String coin){
        if(!VALID_COINS.contains(coin.toLowerCase())){
            System.out.println("Returning Invalid " + coin);
        }
        else{
            switch (coin.toLowerCase()){
                case "quarter":
                    inputtedCurrency += 25;
                    System.out.println("Inserted 25 cents");
                    break;
                case "nickel":
                    inputtedCurrency += 5;
                    System.out.println("Inserted 5 cents");
                    break;
                case "dime":
                    inputtedCurrency +=10;
                    System.out.println("Inserted 10 cents");
                    break;
            }
        }
    }

    public void returnChange(){
        if(inputtedCurrency == 0){
            System.out.println("There is no coins inside. Returning 0 cents");

        }
        else{
            System.out.println("Returning coins: " + String.valueOf(inputtedCurrency));
            inputtedCurrency = 0;
        }
    }

}
