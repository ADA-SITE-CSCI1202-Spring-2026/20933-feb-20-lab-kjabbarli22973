public class Main {

    public static int findCommonSubstrings(String s1, String s2) {
        int count = 0;

        int minLength = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLength; i++) {
            String temp = "";

            for (int j = i; j < minLength; j++) {
                if (s1.charAt(j) == s2.charAt(j)) {
                    temp += s1.charAt(j);
                    System.out.println(temp);
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "abcxxfga";

        int result = findCommonSubstrings(s1, s2);
        System.out.println("Total: " + result);
    }
}