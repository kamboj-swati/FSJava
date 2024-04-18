
public class Admin {
    String role;

    public float getTotalReqBudget(){
        float reqBudget =0;
        for(Employee emp: Organization.employees){
            if(emp.isActive){
                reqBudget = reqBudget+emp.getMonthlySalary();
            }
        }
    return reqBudget;
    }
    public float getTotalTaxCalculated(){
       float totalTax = 0;
        for(Employee emp: Organization.employees){
            if(emp.isActive){
                totalTax = totalTax+emp.getTaxAmountToBePaid();
            }
        }
        return totalTax;
    }
    public void printTaxAmountPerEmployee(){
        for(Employee emp: Organization.employees){
            if(emp.isActive){
                System.out.println("Tax paid by "+emp.name+ " is :"+emp.getTaxAmountToBePaid());
            }
        }
    }
}
