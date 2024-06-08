package Project;

public class Employee {
   private int EmployeeID;
   private String Name;
   private String Password;

    public Employee(int employeeID, String name, String password) {
    EmployeeID = employeeID;
    Name = name;
    Password = password;
}

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }
    
    public void setPassword(String password) {
        Password = password;
    }

    public void AddEmployee(Employee employee)
    {
        this.EmployeeID = employee.EmployeeID;
        this.Name = employee.Name;
        this.Password = employee.Password;
    }



}
