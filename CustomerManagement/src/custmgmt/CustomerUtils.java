package custmgmt;

import java.util.List;

public class CustomerUtils {
    public static Customer signIn(String email, String password, List<Customer> customers)throws CustomerHandlingException{
        Customer c = new Customer(email);
        int index = customers.indexOf(c);

        if(index==-1){
            throw new CustomerHandlingException("invalid Email");
        }
        else if(customers.get(index).getPassword().equals(password)){

        System.out.println("Sign in successful.");
        return customers.get(index);
        }else{
            throw new CustomerHandlingException("Invalid password.");
        }

    }

    public static void changePass(Customer cust, String newpass){
        cust.setPassword(newpass);
        System.out.println("password changed successfully..");
    }

}
