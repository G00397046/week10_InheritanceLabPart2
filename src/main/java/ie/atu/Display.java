package ie.atu;

public class Display {
    public static void main(String[] args) {
        Customer Gene = new Customer("Gene","815-858-4652","123 S Main St.","123443",false);
        System.out.println(Gene.toString());

        Customer Richard = new Customer();
        Richard.setName("Richard");
        Richard.setNumber("1-800-867-5309");
        Richard.setAddress("242 N Holland Ave");
        Richard.setCustomerNumber("454543");
        Richard.setInMailingList(false);

        System.out.println("\nCustomer Name: " + Richard.getName() + "\nCustomer Address: " + Richard.getAddress() + "\nCustomer Phone Number: " + Richard.getNumber() + "\nCustomer Employee Number: " + Richard.getCustomerNumber() + "\nOn Mailing List: " + Richard.isInMailingList());

        PreferredCustomer Mike = new PreferredCustomer("Mike","815-858-2131","214 Rock Hill Rd","23456",true,2555);

        System.out.println("\nCustomer Name: " + Mike.getName() + "\nCustomer Address: " + Mike.getAddress() + "\nCustomer Phone Number: " + Mike.getNumber() + "\nCustomer Employee Number: " + Mike.getCustomerNumber() + "\nOn Mailing List: " + Mike.isInMailingList() + "\nCustomer Total Spend: $" + Mike.getAmountPurchased() + "\nPreferred Customer Discount: $" + Mike.getDiscount() + "\nTotal With Discount: $" + (Mike.getAmountPurchased() - Mike.getDiscount()));



    }
}
