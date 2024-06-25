package Project;

import java.util.ArrayList;
import java.util.Scanner;
import jdk.jshell.spi.ExecutionControl;

public class Main {
    static Employee employee;
    public static ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean online = true;
        Employee a1 = new Employee(1001,"admin1","pass1"); //default ACCOUNT
        listOfEmployees.add(a1);

        while (online) {
            System.out.println("============ Coffee Shop ============");
            System.out.print("\n[1] Login \n[2] Register \n[3] Exit\n\n Selected Choice: ");
            int choice = in.nextInt();
    
            switch (choice) {
                case 1:
                DisplayLogin();
                    break;
                case 2:
                register_Employee();
                    break;
            
                case 3:
                    
                    break;
                default:
                    break;
            }
        }



    }
    public static void DisplayLogin(){
        Scanner in = new Scanner(System.in);

      

            System.out.println("============ Register ============");
            System.out.print("Input User ID: ");
            int userID = in.nextInt();
            System.out.print("Input Password: ");
            String userPass = in.next();
    
            for(Employee employee: listOfEmployees){
                if(employee.getEmployeeID() == userID && employee.getEmployeePassword().equals(userPass)){
                    System.out.println("asdasd1");
                }
                else{
                    System.out.println("invalid1");
    
                }
            }
    }


    public static void register_Employee(){

        Scanner in = new Scanner(System.in);
        int index = listOfEmployees.size()-1;

        int ID = listOfEmployees.get(index).getEmployeeID()+1;
        System.out.println("============ Register ============");
        System.out.println(ID);
        System.out.print("Input Username: ");
        String username = in.next();
        System.out.print("Input Password: ");
        String password = in.next();

        Employee newEmployee = new Employee(ID,username,password);

        listOfEmployees.add(newEmployee);
    }


}
