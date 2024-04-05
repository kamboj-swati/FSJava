public class ReverseANumber {

    public void reverse(int number){
        int remainder;
        int reverse = 0;
        while( number> 0){
            remainder = number%10;
            number = number/10;
            reverse = (reverse*10)+remainder;
        }
        System.out.println("reverse of the number is: "+reverse);
    }

    public static void main(String[] args) {

        ReverseANumber rev = new ReverseANumber();
        rev.reverse(7832);

    }

}
