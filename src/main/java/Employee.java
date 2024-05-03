public class Employee {

    private String name;
    private Integer empId;
    private Character gender;

    public Employee(String name, Integer Id, Character gender){
        this.name = name;
        this.empId = Id;
        this.gender = gender;
    }
    public String getName(){
        return this.name;
    }
    public Integer getEmpId(){
        return this.empId;
    }
    public Character getGender(){
        return this.gender;
    }


}
