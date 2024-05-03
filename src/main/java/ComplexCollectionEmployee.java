import java.util.ArrayList;
import java.util.List;

public class ComplexCollectionEmployee {

    public static void main(String[] args) {

        Employee e1 = new Employee("swati1",1, 'F');
        Employee e2 = new Employee("swati2",2, 'M');
        Employee e3 = new Employee("swati3",3, 'M');
        Employee e4 = new Employee("swati4",4, 'F');

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);

        for(Employee e: employeeList){
            System.out.println(e.getName()+ "| "+e.getEmpId()+ " | "+ e.getGender());

        }
    }
}
