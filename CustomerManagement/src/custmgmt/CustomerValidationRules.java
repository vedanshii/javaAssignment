package custmgmt;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class CustomerValidationRules {

 public static void duplicateCheck(String email, List<Customer> customers ) throws CustomerHandlingException {
        Customer newCustomer = new Customer(email);
        if(customers.contains(newCustomer)){
            throw  new CustomerHandlingException("Duplicate Entry Found");
        }
        System.out.println("NoDupesFound. Valid Entry");
 }
public static ServicePlan CheckPlan(String plan) throws IllegalArgumentException{
     return ServicePlan.valueOf(plan.toUpperCase());

}

//public  LocalDate(String date)throws IllegalArgumentException, CustomerHandlingException, DateTimeParseException{
//
//
//}


    public static Customer validateAllInputs(int customerid, String firstname, String lastname, String email, String password, double registrationAmount, /*LocalDate dob,*/String plan, List<Customer> management)
    throws CustomerHandlingException, IllegalArgumentException, DateTimeParseException {
     duplicateCheck(email,management);
     ServicePlan planes = CheckPlan(plan);
     return new Customer(customerid, firstname, lastname, email, password,  registrationAmount, /* dob, */ planes);



    }

}
