package problems;

public class Four {
    public int result() {
        int highest = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                if (isPalindrome(i*j) && i*j>highest) {
                    highest = i*j;
                }
            }
        }
        return highest;
    }

    private boolean isPalindrome(int number) {
        String string = String.valueOf(number);
        int digits = string.length();
        if (digits % 2 != 0) {
            return false;
        }
        else {
            String first = string.substring(0,digits/2);
            String second = new StringBuilder(string.substring(digits/2, digits)).reverse().toString();
            return first.equals(second);
        }
    }
}
