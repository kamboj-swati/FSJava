public class AllDivisors {
    public void printAllDivisors(int n){
        int i=0;
        //to find prime factors
        for(i=1; i*i<=n; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
        //to print multiple of prime factors in ascending order without repeat
        for (;i>=1;i--){
            if(n%i == 0 && n/i != i){
                    System.out.println(n / i);
            }
        }

    }

    public static void main(String[] args) {

        AllDivisors divisors = new AllDivisors();
        divisors.printAllDivisors(64);
    }
}
