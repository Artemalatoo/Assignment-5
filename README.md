StringProcessing Program Overview This program is meant to verify the strength of a password, and no. of digits and words present in a particular line of input.

Explanation

Password Strength Check First of all, I did make use of the method public static boolean strong(String password) so that the program would be able to distinguish the weak password and that of a strong password. The method examines the following:

The password with a combination of alphanumeric characters along with a minimum of one special character. In fact, the password is also very limited with a reasonable figure as the minimum should be any figure above eight including eight there when I specifically stated if (password.length () < 8) return false;. I had included a for loop for for (char c : password.toCharArray()) to incorporate all of the checks including the uppercase checks, lowercase, digits, and other special characters.

Digit and Word Count I applied the same concept described above for counting the number of digits and words in a line of input. For the number of digits, I had used int cntdigit = 0; to keep track of the number of digits in the initially created string. For the words, I again had to use the calculateWords() method to execute the counting for the length of words.

Conclusion In the main method, I had in addition a Scanner to facilitate the request for input from the user. The password strength analysis is carried out and after that, the password-related data is returned showing number of digits and words in the provided text input.
