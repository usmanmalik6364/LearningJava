package BankingApplication;

import java.util.ArrayList;

public class Bank {
        private String name;
        private ArrayList<Branch> branches;

    public Bank(String name, ArrayList<Branch> branches) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
        this.branches = branches;
    }
    public boolean addBranch(String branchName){
        if(findBranch(branchName )==null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            return branch.newCustomer(customerName,initialAmount);
        }
        return false;
    }
    private Branch findBranch(String branchName){
        if(this.branches.contains(branchName)!=true) return null;
        for (int i =0;i<this.branches.size();i++){
            if(this.branches.get(i).equals(branchName)){
                return this.branches.get(i);
            }
        }
        return null;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            return branch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }
    public boolean listCustomers(String branchName,boolean showTransactions){
       Branch branch = findBranch(branchName);
       if(branch!=null){
           System.out.println("Customer details for branch " + branch.getName());
           ArrayList<Customer> branchCustomers = branch.getCustomers();
           for (Customer customer: branchCustomers) {
               System.out.println("Customer: " + customer.getName());
               if(showTransactions){
                   System.out.println("Transactions: ");
                   ArrayList<Double> transactions = customer.getTransactions();
                   for (double customerTransaction: transactions) {
                       System.out.println("Amount : " + customerTransaction);
                   }
               }
               System.out.println("/n/n");
           }
       }
       return false;
    }
}
