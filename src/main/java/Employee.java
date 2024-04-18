public class Employee {
    String name;
    int age;
    private float monthlySalary;
    int empId;
    boolean isActive;
    Employee(String name, int age,float salary, int id, boolean status){
        this.name= name;
        this.age = age;
        monthlySalary = salary;
        empId = id;
        isActive = status;
    }

    public float getMonthlySalary() {
        return monthlySalary;
    }

    public void getDetails(){
        System.out.println("Name is:"+name);
        System.out.println("Employee Id is:"+empId);
        System.out.println("Age is:"+age);
    }
    public float getTaxAmountToBePaid(){
        float tax;
        if(monthlySalary > 100000)
            tax = (float) (monthlySalary*0.2);
        else
            tax =0;
        return tax;
    }
}
