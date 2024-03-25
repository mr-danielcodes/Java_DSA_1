package Recursion;

public class ReverseString {
    //with loop approach
    public static String reverseWithLoop(String inputStr){
        StringBuilder reverseStr = new StringBuilder();
        for(int i=inputStr.length()-1;i>=0;i--){
            reverseStr.append(inputStr.charAt(i));
        }
        return reverseStr.toString();
    }

    public static void main(String[] args) {
        //with first method
        String name = "Daniel";
        String result = reverseWithLoop(name);
        System.out.println(result);
    }
}
