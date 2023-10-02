public class Employee {
    private String employeeID;
    private String name;
    private final static String designation="labAttendant";
Employee(String employeeID,String name,String designation){
    this.employeeID=employeeID;
    this.name=name;

}

    public String getName() {
        return name;
    }
    public String getEmployeeID(){
    return employeeID;
    }

    public static String getDesignation() {
        return designation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
