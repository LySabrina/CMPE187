import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GumballMachine {

    //inputtedCurrency used to keep track the amount of coins inserted by user
    private int inputtedCurrency;

    //track the amount of gumballs dispensed
    private int dispensedRed;
    private int dispensedYellow;

    //Coins that are only valid for the gumball machine
    private final List VALID_COINS = Arrays.asList("dime", "nickel", "quarter");

    /**
     * Initialize GumballMachine with 0 coins
     */
    public GumballMachine(){
        inputtedCurrency = 0;
        dispensedRed = 0;
        dispensedYellow = 0;
    }

    /**
     * Dispenses Yellow Gumball
     * @return
     */
    public int dispenseYellow(){
        if(inputtedCurrency >= 10){
            inputtedCurrency -= 10;
            dispensedYellow += 1;
            System.out.println("Dispensed: 1 yellow gumball");
            System.out.println("Current inputted currency: " + inputtedCurrency);
        }
        else{
            System.out.println( "Not enough currency. Please input at least 10 cents");
        }
        return dispensedYellow;
    }

    public int dispenseRed(){
        if(inputtedCurrency >= 5){
            inputtedCurrency -= 5;
            dispensedRed += 1;
            System.out.println( "Dispensed: 1 red gumball");
            System.out.println("Current inputted currency: " + inputtedCurrency);
        }
        else{
            System.out.println( "Not enough currency. Please input at least 5 cents");
        }
        return dispensedRed;

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
            System.out.println( "testInsertDollar: Failed insert dollar" );
            return;
        }

        System.out.println( "TestReturnDollar: Passed");
    }

    public void testNickelDispenseRed()
    {
        if ( this.insert("nickel") == false )
        {
            System.out.println( "testNickelDispenseRed: Failed insert" );
            return;
        }

        int redGumball  = this.dispenseRed();
        if ( redGumball == 1 )
        {
            System.out.println( "testNickelDispenseRed: Passed");
        }
        else
        {
            System.out.println( "testNickelDispenseRed: Failed dispense="+redGumball);
        }
    }

    public void testDimeInsertion()
    {
        if ( this.insert("dime") & this.insert("dime") & this.insert("dime") == false )
        {
            System.out.println( "testDimeInsertion: Failed insert dime" );
            return;
        }

        System.out.println( "testDimeInsertion: Passed");
    }

    public void testQuarterDispenseTwoYellow()
    {
        dispensedYellow = 0;
        dispensedRed = 0;

        if ( this.insert("quarter") == false )
        {
            System.out.println( "testQuarterDispenseTwoYellow: Failed insert" );
            return;
        }

        int yellowGumball  = this.dispenseYellow() + this.dispenseYellow();
        if ( dispensedYellow == 2 )
        {
            System.out.println( "testQuarterDispenseTwoYellow: Passed");
        }
        else
        {
            System.out.println( "testQuarterDispenseTwoYellow: Failed dispense="+yellowGumball);
        }
    }

    public void testDimeDispenseTwoRed()
    {
        dispensedYellow = 0;
        dispensedRed = 0;

        if ( this.insert("dime") == false )
        {
            System.out.println( "testDimeDispenseTwoRed: Failed insert" );
            return;
        }

        int redGumball  = this.dispenseRed() + this.dispenseRed();
        if ( dispensedRed == 2 )
        {
            System.out.println( "testDimeDispenseTwoRed: Passed");
        }
        else
        {
            System.out.println( "testDimeDispenseTwoRed: Failed dispense=" + redGumball);
        }
    }

    public void testDispensingRedandYellow()
    {
        dispensedYellow = 0;
        dispensedRed = 0;

        if ( this.insert("quarter") == false )
        {
            System.out.println( "testDispensingRedandYellow: Failed insert" );
            return;
        }

        int Gumball  = this.dispenseRed() + this.dispenseYellow();
        if ( dispensedRed == 1 && dispensedYellow == 1 )
        {
            System.out.println( "testDispensingRedandYellow: Passed");
        }
        else
        {
            System.out.println( "testDispensingRedandYellow: Failed dispense=" + Gumball);
        }
    }
    

}
