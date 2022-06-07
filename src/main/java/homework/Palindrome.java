package homework;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isStringPalindrome("Juris"));
        System.out.println(isStringPalindrome("oto"));
        System.out.println(isStringPalindrome("rotor"));
        System.out.println(isStringPalindrome("ooaoo"));
        System.out.println(isStringPalindrome("cat"));
    }

    static boolean isStringPalindrome(String string) {
        String reverse = "";
        var length = string.length();
        for (int i = 1; i <= length; i++) {
            reverse = reverse.concat(String.valueOf(string.charAt(length - i)));

        }
        return string.equals(reverse);
    }
}
