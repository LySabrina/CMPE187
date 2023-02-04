import java.beans.Transient;
import java.util.Scanner;

public class MainTester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GumballMachine gumballMachine = new GumballMachine();
        System.out.println("Welcome to Gumball Machine\n1) Insert Coin 2) Red Lever 3) Yellow Lever 4) Change Lever 5) Exit T) Run test");
        while(s.hasNextLine()){
            String input = s.nextLine();
            if(input.equals("1")){
                System.out.println("Enter coin (dime, nickel, quarter):");
                String coin = s.nextLine();
                gumballMachine.insert(coin);
            }
            else if(input.equals("2")){
                gumballMachine.dispenseRed();
            }
            else if(input.equals("3")){
                gumballMachine.dispenseYellow();
            }
            else if(input.equals("4")){
                int change  = gumballMachine.returnChange();
                if ( change <0 )
                {
                        System.out.println("There is no coins inside. Returning 0 cents");
                }
                else
                {
                    System.out.println("Returning coins: " + String.valueOf(change));
                }
            }
            else if(input.equals("5")){
                System.out.println("Goodbye!");
                break;
            }
            else if(input.equals("T")){
                System.out.println("Run tests...");

                gumballMachine.testReturnNickel();
                gumballMachine.testReturnDime();
                gumballMachine.testReturnQuarter();
                gumballMachine.testInsertDollar();
                gumballMachine.testInsertPenny();
                gumballMachine.testNickelDispenseRed();
                gumballMachine.testDimeInsertion();
                gumballMachine.testQuarterDispenseTwoYellow();
                gumballMachine.testDimeDispenseTwoRed();
                gumballMachine.testDispensingRedandYellow();
                gumballMachine.testInsufficientCurrency();
                gumballMachine.testInsertQuarterDispenseRedReturnChange();
                break;
            }
            System.out.println("1) Insert Coin 2) Red Lever 3) Yellow Lever 4) Change Lever 5) Exit");
        }
    }

}