package project;

public class BankAccount {
    private String username;
    private String pinCode;
    private double moneyBalance = 0;

    public BankAccount(String clientName, String pinCode, double moneyBalance){
        setUsername(clientName);
        setPinCode(pinCode);
        setMoneyBalance(moneyBalance);
    }

    public void deposit(double money){
        moneyBalance = moneyBalance + money;
        System.out.println("now your balance is " + moneyBalance);
    }

    public void withdraw(double money){
        if(money <= moneyBalance){
            moneyBalance = moneyBalance - money;
            System.out.println("now your balance is: " + moneyBalance);
        }
        else{
            System.out.println("Not enough money in your account");
        }
    }

    public void changePinCode(String oldPinCode, String newPinCode){
        if(isValidPinCode(oldPinCode) && isValidPinCode(newPinCode) && oldPinCode.equals(pinCode)){
            this.pinCode = newPinCode;
            System.out.println("You pincode is updated successfully, and now it is: " + pinCode);
        }
        else
            System.out.println("You pincode is not changed due to some reasons");
    }

    private boolean isValidPinCode(String pinCode){
        if(pinCode.length() != 4){
            return false;
        }
        for(int i=0; i<pinCode.length(); i++){
            if(pinCode.charAt(i) < 48 || pinCode.charAt(i) > 57){
                return false;
            }
        }
        return true;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        if(isValidPinCode(pinCode))
            this.pinCode = pinCode;
        else
            this.pinCode = "1111";
    }

    public double getMoneyBalance() {
        return moneyBalance;
    }

    public void setMoneyBalance(double moneyBalance) {
        if(moneyBalance >= 0)
            this.moneyBalance = moneyBalance;
        else
            this.moneyBalance = 0;
    }

}
