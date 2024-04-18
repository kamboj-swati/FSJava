public class DemoRun {

    public static void main(String[] args) {
        Organization PodTest = new Organization();

        Organization.employees = new Employee[5];
        Organization.employees[0] = new Employee("swati",32,200000,101,true);
        Organization.employees[1] = new Employee("Tanvi",31,90000,102,true);
        Organization.employees[2] = new Employee("Aditi",33,190000,103,true);
        Organization.employees[3] = new Employee("Navi",32,80000,104,true);
        Organization.employees[4] = new Employee("Gaurav",34,280000,105,false);

        Admin Rohan = new Admin();

        Rohan.printTaxAmountPerEmployee();
        System.out.println("Total tax calculated for active employees: " + Rohan.getTotalTaxCalculated());
        System.out.println("Total requested budget for active employees: " + Rohan.getTotalReqBudget());



    }
}
