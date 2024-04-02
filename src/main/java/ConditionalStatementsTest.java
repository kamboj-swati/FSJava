public class ConditionalStatementsTest{

    public static void main(String[] args) {

        ConditionalStatementsTest input = new ConditionalStatementsTest();
        input.getRightCategory(40,'K');
    }

    public void getRightCategory(int age, char gender){
        if (gender =='M'){
            if ( age>0 && age< 18 ){
                System.out.println(" It's a Boy");
            } else if (age>=18 && age< 60) {
                System.out.println(" It's a Man");
            } else if (age>60) {
                System.out.println(" It's a SC Man");
            }
            else
                System.out.println(" Invalid age entered ");
        }
         else if (gender =='F') {
            if ( age>0 && age< 18 ){
                System.out.println(" It's a Girl");
            } else if (age>=18 && age< 60) {
                System.out.println(" It's a Woman");
            } else if (age>60) {
                System.out.println(" It's a SC Woman");
            }
            else
                System.out.println(" Invalid age entered");
        }
         else
            System.out.println(" Invalid gender");
        }
    }



