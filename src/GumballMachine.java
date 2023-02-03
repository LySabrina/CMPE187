public class GumballMachine {

    //inputtedCurrency used to keep track the amount of coins inserted by user
    private int inputtedCurrency;

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
    public String dispenseYellow(){
        if(inputtedCurrency >= 10){
            return "";
        }
        return "Not enough currency. Please input at least 10 cents";
    }

    public String dispenseRed(){
        if(inputtedCurrency >= 5){
            return "";
        }
        return "Not enough currency. Please inpput at least 5 cents";
    }

    public void insert(String coin){

    }

    public String returnChange(){
        if(inputtedCurrency == 0){
            return "Return 0 cents";
        }
        return "";
    }

}
