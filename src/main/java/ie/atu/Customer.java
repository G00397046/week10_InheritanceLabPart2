package ie.atu;

public class Customer extends Person {
    private String customerNumber;
    private boolean isInMailingList;

    public Customer(){}
    public Customer(String name, String number, String address,String customerNumber,boolean isInMailingList){
        super(name,number,address); //Invoking Super Class
        this.customerNumber = customerNumber;
        this.isInMailingList = isInMailingList;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isInMailingList() {
        return isInMailingList;
    }

    public void setInMailingList(boolean inMailingList) {
        isInMailingList = inMailingList;
    }
    @Override
    public String toString(){
        return super.toString() + "Customer Number: " + customerNumber + "\nMailing List: " + isInMailingList;
    }
}
