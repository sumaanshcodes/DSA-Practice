package StringPractice;

public class StringBasic {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Java Programming";
        String str3 = "   Leading and trailing spaces   ";

        // Length of the string
        System.out.println("Length of str1: " + str1.length());

        // Character at a specific index
        System.out.println("Character at index 7 in str1: " + str1.charAt(7));

        // Substring
        System.out.println("Substring of str2 from index 5 to 15: " + str2.substring(5, 15));

        // Concatenation
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated string: " + concatenated);

        // Trimming whitespace
        System.out.println("Trimmed str3: '" + str3.trim() + "'");

        // Replacing characters
        String replacedStr1 = str1.replace('o', '0');
        System.out.println("Replaced 'o' with '0' in str1: " + replacedStr1);

        // Converting to uppercase and lowercase
        System.out.println("str2 in uppercase: " + str2.toUpperCase());
        System.out.println("str2 in lowercase: " + str2.toLowerCase());
    }   
    
}
