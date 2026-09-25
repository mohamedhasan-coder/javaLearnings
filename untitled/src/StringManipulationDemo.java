//Day 5 - 1

public class StringManipulationDemo {

    public static void main(String[] args) {

        String str = "Hello Java Programming";

        // 1. Length of the string
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());

        // 2. Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 3. Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 4. Character at a particular position
        System.out.println("Character at index 1: " + str.charAt(1));

        // 5. Substring
        System.out.println("Substring: " + str.substring(6, 10));

        // 6. Check whether string contains a word
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // 7. Check beginning and ending
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with 'Programming': " + str.endsWith("Programming"));

        // 8. Replace characters/text
        System.out.println("Replace Java with Python: "
                + str.replace("Java", "Python"));

        // 9. Find position of a word
        System.out.println("Index of Java: " + str.indexOf("Java"));

        // 10. Compare two strings
        String str2 = "Hello Java Programming";
        System.out.println("Strings are equal: " + str.equals(str2));

        // 11. Remove leading and trailing spaces
        String str3 = "   Hello Java   ";
        System.out.println("Before trim: [" + str3 + "]");
        System.out.println("After trim: [" + str3.trim() + "]");

        // 12. Concatenation
        String firstName = "John";
        String lastName = "David";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("Full Name: " + fullName);

        // 13. Split string
        String words = "Java is easy";
        String[] result = words.split(" ");

        System.out.println("Words:");
        for (String word : result) {
            System.out.println(word);
        }
    }
}
