public class LengthOfTheLastWord {

        public static int lengthOfLastWord(String s) {
            int i = s.length() - 1;
            while(i>=0 && s.charAt(i) == ' '){
                i--;
            }
            int count = 0;
            while(i>=0 && s.charAt(i) != ' '){
                count++;
                i--;
            }
            return count;
        }
    public static void main(String[] args) {

        String s = "Hello World   ";

        int result = lengthOfLastWord(s);

        System.out.println("String: " + s);
        System.out.println("Length of last word: " + result);
    }
}

