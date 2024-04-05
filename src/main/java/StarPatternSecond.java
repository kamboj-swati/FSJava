public class StarPatternSecond {

    public static void main(String[] args) {

        //loop to have no of rows
        for(int i=1; i<=5; i++){
            //loop to print stars
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //reverse of above 2 loops
        for(int i=1;i<=5;i++){

            for(int j=4; j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
