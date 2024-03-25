public class PalindromicString {
    //1st Approach to check the palindromic string first reverse and then compare with original
    //string
    public static String reverseString(String str){
        StringBuilder builder = new StringBuilder(str);
        int j = str.length()-1;
        for(int i = 0;i<str.length();i++){
            char start = str.charAt(i);
            char end = str.charAt(j);
            if(i==j){
                break;
            }
            else{
                builder.setCharAt(i,end);
                builder.setCharAt(j,start);
                j--;
            }
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        String result = reverseString(str);
        System.out.println(result);
        if(str.equals(result))
            System.out.println("Palindromic");
        else
            System.out.println("Not Palondromic");
    }
}
