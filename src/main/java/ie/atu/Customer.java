package ie.atu;

public class Customer extends Person {
    private String customerNumber;
    private boolean isInMailingList;

    public Customer(){}
    public Customer(String name, String number, String address){
        super(name,number,address);
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
}
