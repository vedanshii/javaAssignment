package custmgmt;

import java.time.LocalDate;
import java.util.Objects;

public class Customer {
    int customerid;
    String firstname, lastname;
    String email;
    String password;
    double registrationAmount;
    LocalDate dob;

    ServicePlan plan;

    public Customer(String email) {
        this.email = email;
    }



    public Customer(int customerid, String firstname, String lastname, String email, String password, double registrationAmount, LocalDate dob, ServicePlan plan) {
        this.customerid = customerid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.registrationAmount = registrationAmount;
        this.dob = dob;
        this.plan = plan;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "customerid=" + customerid +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", registrationAmount=" + registrationAmount +
                ", dob=" + dob +
                ", plan=" + plan +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("In Customer's Obj");
        if(o instanceof Customer){
            Customer n = (Customer) o;
            return this.email.equals(n.email);
        }
        return false;
    }




}