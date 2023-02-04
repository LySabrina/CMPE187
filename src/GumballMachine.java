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

    public boolean insert(String coin){
        if(!VALID_COINS.contains(coin.toLowerCase())){
            System.out.println("Returning Invalid " + coin);
            return false;
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
        return true;
    }

    public int returnChange(){
        if(inputtedCurrency == 0){
            return -1;
        }
        else{
            int ic  = inputtedCurrency;
            inputtedCurrency = 0;
             return ic;
        }
    }

    // ---------
    // @test
    public void testReturnQuarter()
    {
        if ( this.insert("quarter") == false )
        {
            System.out.println( "TestReturnQuarter: Failed insert" );
            return;
        }

        int change  = this.returnChange();
        if ( change == 25 )
        {
            System.out.println( "TestReturnQuarter: Passed");
        }
        else
        {
            System.out.println( "TestReturnQuarter: Failed change="+change);
        }
    }

    public void testInsertDollar()
    {
        if ( this.insert("dollar") == false )
        {
            System.out.println( "TestReturnQuarter: Failed insert dollar" );
            return;
        }

        System.out.println( "TestReturnDollar: Passed");
    }

}
