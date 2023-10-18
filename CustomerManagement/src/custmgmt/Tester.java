package custmgmt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static custmgmt.CustomerValidationRules.validateAllInputs;

public class Tester {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            ArrayList<Customer> customerList = new ArrayList<>();
            boolean exit= false;
            while (!exit){
                System.out.println("Options : 1 . Display Customer \n 2.Signup \n" + "3. Signin \n"
						+ "4. Change Password \n 5. Unsubscribe \n 0.Exit");
                System.out.println("Choose an option: ");
                try{
                switch (sc.nextInt()){

                    case 1:
                        System.out.println("Display customer details ");
                        for(Customer c: customerList){
                            System.out.println(c);
                        }
                        break;

                    case 2:
                        System.out.println("Enter Customer Details: customerid, firstname, lastname, email, password, registrationAmount,  dob,  plan");
                        Customer customer =validateAllInputs(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),/*sc.next(), */customerList);
                        customerList.add(customer);
                        System.out.println("Added successfully.");
                        break;

                    case 3:
                        //signin
                        Customer cust = CustomerUtils.signIn(sc.next(),sc.next(),customerList);
                        System.out.println(cust);
                        break;

                    case 4:
                        //change password
                        Customer custt = CustomerUtils.signIn(sc.next(),sc.next(),customerList);
                        System.out.println("Enter new password. ");
                        CustomerUtils.changePass(custt,sc.next());
                        break;

                    case 5:
                        //Unsubscribe
                        System.out.println("Enter email ID ");
						Customer custrem =new Customer(sc.next());
						boolean removed=customerList.remove(custrem);
						if(!removed)
							throw new CustomerHandlingException("Please Enter a Valid EmailID: ");
						System.out.println("Unsubscribed Sucessfully :( ");
						break;


                    case 0:
                        exit = true;
                        break;

                }

                }catch (Exception e){
                    System.out.println(e);
                    System.out.println("pls retry...");
                    sc.nextLine();
                }


            }


        }



    }
}
