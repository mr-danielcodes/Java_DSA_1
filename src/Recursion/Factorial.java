package Recursion;

public class Factorial {
    //with recursion approach
    public static int getFactorialWithRecursion(int n){
        if(n==0) {
            return 1;
        }
        int fact = getFactorialWithRecursion(n-1);
        int result = n*fact;
        return result;
    }
    //with loop
    public static int getFactorial(int n){
        int result = 1;
        for(int i=1;i<=n;i++){
            result = result*(i);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(getFactorial(3));
        System.out.println(getFactorialWithRecursion(5));
    }
}
