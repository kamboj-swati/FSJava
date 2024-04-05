public class StarPyramidFirst {

    public static void main(String[] args) {

        for(int i=1; i<=5;i++){
            //for loop to have spaces
            for(int space =1; space<=5-i; space++) {
                System.out.print(" "); //no next line
            }
                //for loop to have stars
                for(int j=1; j<= 2*i-1; j++){
                    System.out.print("*"); //no next line
                }
                System.out.println(); //go to next line

        }
    }
}
