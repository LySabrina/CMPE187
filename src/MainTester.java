import java.util.Scanner;

public class MainTester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GumballMachine gumballMachine = new GumballMachine();
        System.out.println("Welcome to Gumball Machine\n1) Insert Coin 2) Red Lever 3) Yellow Lever 4) Change Lever 5) Exit");
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
                gumballMachine.returnChange();
            }
            else if(input.equals("5")){
                System.out.println("Goodbye!");
                break;
            }
            System.out.println("1) Insert Coin 2) Red Lever 3) Yellow Lever 4) Change Lever 5) Exit");
        }
    }
}