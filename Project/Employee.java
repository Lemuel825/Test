package Project;

public class Employee {
   private int EmployeeID;
   private String EmployeeName;
   private String EmployeePassword;



    public Employee(int employeeID, String employeeName, String employeePassword) {
    EmployeeID = employeeID;
    EmployeeName = employeeName;
    EmployeePassword = employeePassword;
}



    public int getEmployeeID() {
    return EmployeeID;
}



public void setEmployeeID(int employeeID) {
    EmployeeID = employeeID;
}



public String getEmployeeName() {
    return EmployeeName;
}



public void setEmployeeName(String employeeName) {
    EmployeeName = employeeName;
}



public String getEmployeePassword() {
    return EmployeePassword;
}



public void setEmployeePassword(String employeePassword) {
    EmployeePassword = employeePassword;
}



    public void AddEmployee(Employee employee)
    {
        this.EmployeeID = employee.EmployeeID;
        this.EmployeeName = employee.EmployeeName;
        this.EmployeePassword = employee.EmployeePassword;
    }



}
