StringProcessing Program
Overview
This program checks if a password is strong and counts digits and words in a line of input.

Explanation
1. Password Strength Check
First of all, I used the method public static boolean strong(String password) so that the program will be able to identify a strong password from an invalid one. The method checks for the following:

The password contains uppercase letters, lowercase letters, digits, and at least one special character.
The password must be at least 8 characters long, which is why I used if (password.length() < 8) return false;.
I used a loop for (char c : password.toCharArray()) to include checks for uppercase letters, lowercase letters, digits, and special characters.

2. Digit and Word Count
I used similar logic to count the digits and words in a line of input. For counting digits, I used int cntdigit = 0; and counted how many digits are in the string. For counting words, I used the calculateWords() method to count the length of words.

3. Conclusion
In the main method, I used a Scanner to accept input from the user. The program checks whether the password is strong and then outputs the number of digits and words in the input.
