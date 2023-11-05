public class BasicFunctions {

    // 1. A function to calculate the sum of two numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // 2. A function to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // 3. A function to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 4. A function to divide two numbers
    public static double divide(double a, double b) {
        return a / b;
    }

    // 5. A function to find the average of two numbers
    public static double average(double a, double b) {
        return (a + b) / 2;
    }

    // 6. A function to compute the remainder of two numbers
    public static int modulus(int a, int b) {
        return a % b;
    }

    // 7. A function to check if a number is even
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    // 8. A function to check if a number is odd
    public static boolean isOdd(int a) {
        return a % 2 != 0;
    }

    // 9. A function to find the maximum of two numbers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // 10. A function to find the minimum of two numbers
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    // 11. A function to calculate the factorial of a number
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 12. A function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 13. A function to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 14. A function to convert temperature from Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // 15. A function to convert temperature from Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // 16. A function to reverse a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // 17. A function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        return str.equals(reverseString(str));
    }

    // 18. A function to count the number of vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    // 19. A function to convert a binary number to decimal
    public static int binaryToDecimal(String binaryStr) {
        return Integer.parseInt(binaryStr, 2);
    }

    // 20. A function to check if an integer is a palindrome
    public static boolean isIntPalindrome(int number) {
        return isPalindrome(Integer.toString(number));
    }
}




public class StringManipulations {

    // 1. Print a substring of a string from index start to end
    public static void printSubstring(String str, int start, int end) {
        System.out.println(str.substring(start, end));
    }

    // 2. Print a character at a specific index of a string
    public static void printCharAt(String str, int index) {
        System.out.println(str.charAt(index));
    }

    // 3. Print a string converted to upper case
    public static void printUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }

    // 4. Print a string converted to lower case
    public static void printLowerCase(String str) {
        System.out.println(str.toLowerCase());
    }

    // 5. Print a string after replacing all occurrences of oldChar with newChar
    public static void printReplaceChar(String str, char oldChar, char newChar) {
        System.out.println(str.replace(oldChar, newChar));
    }

    // 6. Print a string with all occurrences of a substring replaced with a new substring
    public static void printReplaceSubstring(String str, String oldSubstr, String newSubstr) {
        System.out.println(str.replace(oldSubstr, newSubstr));
    }

    // 7. Print a string after trimming whitespace from both ends
    public static void printTrim(String str) {
        System.out.println(str.trim());
    }

    // 8. Print a string after removing leading and trailing whitespace
    public static void printStrip(String str) {
        System.out.println(str.strip());
    }

    // 9. Print a concatenation of two strings
    public static void printConcat(String str1, String str2) {
        System.out.println(str1.concat(str2));
    }

    // 10. Print a string after removing all white spaces
    public static void printRemoveWhitespaces(String str) {
        System.out.println(str.replaceAll("\\s", ""));
    }

    // 11. Print a string array as a single string separated by a delimiter
    public static void printJoin(String delimiter, String[] strings) {
        System.out.println(String.join(delimiter, strings));
    }

    // 12. Print if a string starts with a specified prefix
    public static void printStartsWith(String str, String prefix) {
        System.out.println("Starts with prefix? " + str.startsWith(prefix));
    }

    // 13. Print if a string ends with a specified suffix
    public static void printEndsWith(String str, String suffix) {
        System.out.println("Ends with suffix? " + str.endsWith(suffix));
    }

    // 14. Print the index of the first occurrence of a character in a string
    public static void printIndexOfChar(String str, char ch) {
        System.out.println("Index of char '" + ch + "': " + str.indexOf(ch));
    }

    // 15. Print the index of the first occurrence of a substring in a string
    public static void printIndexOfSubstring(String str, String substr) {
        System.out.println("Index of substring '" + substr + "': " + str.indexOf(substr));
    }

    // 16. Print the string with each word capitalized (title case)
    public static void printToTitleCase(String str) {
        String[] words = str.split("\\s");
        StringBuilder titleCase = new StringBuilder();
        for (String word : words) {
            titleCase.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        System.out.println(titleCase.toString().trim());
    }

    // 17. Print the reversed version of a string
    public static void printReverse(String str) {
        System.out.println(new StringBuilder(str).reverse().toString());
    }

    // 18. Print if a string contains a certain sequence of characters
    public static void printContains(String str, String sequence) {
        System.out.println("Contains sequence? " + str.contains(sequence));
    }

    // 19. Print the number of occurrences of a character in a string
    public static void printCountChar(String str, char ch) {
        long count = str.chars().filter(c -> c == ch).count();
        System.out.println("Number of occurrences of '" + ch + "': " + count);
    }

    // 20. Print a string after replacing multiple spaces with a single space
    public static void printReplaceMultipleSpaces(String str) {
        System.out.println(str.replaceAll("\\s+", " "));
    }
    
    // Main method to test the string manipulation functions
    public static void main(String[] args) {
        // Test the functions with example strings
        printSubstring("Hello World", 0, 5);
        printCharAt("Hello World", 4);
        printUpperCase("hello world");
        printLowerCase("HELLO WORLD");
        printReplaceChar("hello world", 'l', 'p');
        printReplaceSubstring("hello world", "world", "Java");
        printTrim("  hello world  ");
        printStrip("  hello world  ");
        printConcat("Hello ", "World");
        printRemoveWhitespaces(" h e l l o w o r l d ");
        printJoin("-", new String[]{"Hello", "World"});
        printStartsWith("Hello World", "He");
        printEndsWith("Hello World", "ld");
        printIndexOfChar("Hello World", 'W');
        printIndexOfSubstring("Hello World", "World");
        printToTitleCase("hello world");
        printReverse("Hello World");
        printContains("Hello World", "World");
        printCountChar("Hello World", 'l');
        printReplaceMultipleSpaces("Hello    World");
    }
}
