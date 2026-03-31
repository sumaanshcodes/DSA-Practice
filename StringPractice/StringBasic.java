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

/*
Char[] arr = {'H','e','l','l','o'};

# String Data Type: String is a class in java that represnets a sequence of
                  characters. It is used to store and manipulate text.
       
        Eg:-           String str = "Hello, World!";
Character Array: A character array is an array of characters. It is used to store a sequence of characters as an array. 

        Eg:-           char[] arr = {'H','e','l','l','o'};  
                

String Methods:  

1. length(): Returns the length of the string.
 --> String s = "Sumansh Yadav";
     System.out.println(s.length()); // Output: 13

2. charAt(int index): Returns the character at the specified index.
 --> String s = "Sumansh Yadav";
     System.out.println(s.charAt(0)); // Output: 'S'
     System.out.println(s.charAt(7)); // Output: 'Y'

3. substring(int beginIndex, int endIndex): Returns a new string that is a substring of this string.
 --> String s = "Sumansh Yadav";
     System.out.println(s.substring(0, 7)); // Output: "Sumansh"
     System.out.println(s.substring(8));    // Output: "Yadav"

4. concat(String str): Concatenates the specified string to the end of this string.
 --> String s1 = "Hello, ";
     String s2 = "World!";
     String s3 = s1.concat(s2);
     System.out.println(s3); // Output: "Hello, World!"

5. trim(): Returns a copy of the string, with leading and trailing whitespace omitted.
 --> String s = "   Hello, World!   ";
     System.out.println(s.trim()); // Output: "Hello, World!"

6. replace(char oldChar, char newChar): Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
 --> String s = "Hello, World!";
     String replaced = s.replace('o', '0');
     System.out.println(replaced); // Output: "Hell0, W0rld!"

7. toUpperCase(): Converts all of the characters in this String to upper case.
 --> String s = "Hello, World!";
     System.out.println(s.toUpperCase()); // Output: "HELLO, WORLD!"

8. toLowerCase(): Converts all of the characters in this String to lower case.  
 --> String s = "Hello, World!";
     System.out.println(s.toLowerCase()); // Output: "hello, world!"

9. equals(Object anObject): Compares this string to the specified object.
 --> String s1 = "Hello";
     String s2 = "Hello";
     String s3 = "hello";
     System.out.println(s1.equals(s2)); // Output: true
     System.out.println(s1.equals(s3)); // Output: false

10. equalsIgnoreCase(String anotherString): Compares this String to another String, ignoring case considerations.
 --> String s1 = "Hello";
     String s2 = "hello";
     System.out.println(s1.equalsIgnoreCase(s2)); // Output: true

11. contains(CharSequence s): Returns true if and only if this string contains the specified sequence of char values.
 --> String s = "Hello, World!";
     System.out.println(s.contains("World")); // Output: true
     System.out.println(s.contains("world")); // Output: false 

 
*/ 
