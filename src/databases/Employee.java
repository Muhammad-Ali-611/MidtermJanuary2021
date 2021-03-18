package databases;

public class Employee {

    private String empName;
    private String empID;
    private String empDOB;
    public static void main (String[] args){  
        Employee raji = new Employee("Raji", "2762", "16-07-1995");
        System.out.println(raji.getEmpName());
        System.out.println(raji.getEmpID());
        System.out.println(raji.getEmpDOB());
        
    public Employee(){}
    public Employee(String empName, String empID, String empDOB) {
        this.empName = empName;
        this.empID = empID;
        this.empDOB = empDOB;
    }
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpDOB() {
        return empDOB;
    }

    public void setEmpDOB(String empDOB) {
        this.empDOB = empDOB;
    }
}
}
