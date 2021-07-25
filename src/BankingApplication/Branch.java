package BankingApplication;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList <Customer> customers;

    public Branch(String name){
        this.name = name;
    }
    public ArrayList<Customer> getCustomers(){
        return this.customers;
    }
    public Branch(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
        this.customers = customers;
    }
    public String getName(){
        return name;
    }
    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName,initialAmount));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCUstomer = findCustomer(customerName);
        if(existingCUstomer!=null){
            existingCUstomer.addTransaction(amount );
            return true;
        }
        return false;
    }
    private Customer findCustomer(String customerName){
        if(this.customers.contains(customerName)){
           for (int i = 0; i<this.customers.size(); i++){
               if(this.customers.get(i).getName().equals(customerName)){
                   return this.customers.get(i);
               }
           }
        }
        return null;
    }
}
