public class ADDING_BINARY_NUMBERS {
    public static String addBinary(String a,String b){
        int n = a.length() - 1;
        int m = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while(n>=0||m>=0||carry!=0){
            int bitA = (n>=0) ? a.charAt(n) - '0' : 0 ;
            int bitB = (m>=0) ? b.charAt(m) - '0': 0;
            int sum = bitA+ bitB + carry;
            int digit = sum%2;
            carry = sum/2;
            result.append(digit);
            n--;
            m--;
        }
        result.reverse();
        return result.toString();
    }
    public static void main(String[] args){
        String a = "1010";
        String b = "110";
        System.out.println(addBinary(a,b));
    }
}
