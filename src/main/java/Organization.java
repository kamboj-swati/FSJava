public class Organization {
    int NoOfEmployees;
    public static Employee[] employees;
    private void printEmployeeDetailsAll(){
     for(Employee emp: employees){
    System.out.println("Name of Employee:" +emp.name);
    System.out.println("Age of Employee:" +emp.age);
    System.out.println("Id of Employee:" +emp.empId);
}
    }


}
