import java.lang.reflect.Array;
import java.util.*;

public class exercises1 {
static Scanner in = new Scanner(System.in);
static ArrayList<Accounts> ListAccount = new ArrayList<Accounts>(); ; 

static class Accounts{

    int Id;
    String Username;
    String Password;

    Accounts(int id,String user,String pass){
        this.Id = id;
        this.Username = user;
        this.Password = pass;
    }

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        Username = username;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }

    
}
    
public static void main(String[] args) {
        boolean  LoggedIn = false;
        Accounts a1 = new Accounts(1001,"admin1","pass1");
        Accounts a2 = new Accounts(1002,"admin2","pass2");
        Accounts a3 = new Accounts(1003,"admin3","pass3");

        ListAccount.add(a1);
        ListAccount.add(a2);
        ListAccount.add(a3);

        Default();

    }

    public static void Default(){
        System.out.println("============ MANGO CRAZY ============\n");
        System.out.print("[1] Login\n" +
                            "[2] Register\n" +
                            "[3] Exit\n\n" +
                            "Selected Choice: ");
        int Choice = in.nextInt();

        switch (Choice) {
            case 1:
            DisplayLoggingIn();
                break;
            case 2:
                
                break;    

            case 3:
                
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void DisplayLoggingIn(){
        String ID = "", Pass = "";

     
            System.out.println("============ MANGO CRAZY ============");
            System.out.println("Login");
            System.out.print("ID: ");
            ID = in.next();
            System.out.print("\nPassword: ");
            Pass = in.next();

          CheckLoggingIn(ID, Pass);
        
    }

    public static void CheckLoggingIn(String ID,String Pass){

        String chckID = ID;
        String chckPassword = Pass;

        for (int i = 0; i < ListAccount.size(); i++) {
            if(String.valueOf(ListAccount.get(i).Id).equals(chckID) && ListAccount.get(i).Password.equals(chckPassword)){

            }
            
        }


    }
}
