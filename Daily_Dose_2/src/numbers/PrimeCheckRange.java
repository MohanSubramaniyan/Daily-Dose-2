package numbers;



public class PrimeCheckRange {

    public static void main(String[] args) {
    	for(int num=5;num<=24;num++){
        boolean isPrime = true;

        if (num < 2)
            isPrime = false;
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

       String result = isPrime ? num+" " :"";
       System.out.print(result);
    }
    }
}
