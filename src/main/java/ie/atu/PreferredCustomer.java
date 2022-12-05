package ie.atu;

public class PreferredCustomer extends Customer {
    private double fivePercent = .05;
    private double sixPercent = .06;
    private double sevenPercent = .07;
    private double tenPercent = .1;

    private double amountPurchased;

    public PreferredCustomer(String name, String number, String address,String customerNumber,boolean isInMailingList, double sales){
        super(name,number,address,customerNumber,isInMailingList);
        this.amountPurchased = sales;
    }

    public double getAmountPurchased() {
        return amountPurchased;
    }

    public void setAmountPurchased(double amountPurchased) {
        this.amountPurchased = amountPurchased;
    }

    public double getDiscount(){
        double discount = 0;
        if(amountPurchased >= 500 && amountPurchased < 1000){
            discount = amountPurchased * fivePercent;
        }
        else if (amountPurchased >= 1000 && amountPurchased < 1500){
            discount = amountPurchased * sixPercent;
        }
        else if(amountPurchased >= 1500 && amountPurchased < 2000){
            discount = amountPurchased * sevenPercent;
        }
        else if(amountPurchased > 2000){
            discount = amountPurchased * tenPercent;
        }
        return discount;
    }

}
