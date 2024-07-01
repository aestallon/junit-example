package hu.aestallon.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromesTest {

  @Test
  void isPalindromeReturnsTrueForPalindromesWithOddLength() {
    assertTrue(Palindromes.isPalindrome("aba"));
  }

  @Test
  void isPalindromeReturnsTrueForPalindromesWithEvenLength() {
    assertTrue(Palindromes.isPalindrome("abba"));
  }

  @Test
  void isPalindromeReturnsFalseForNotPalindromesWithOddLength() {
    assertFalse(Palindromes.isPalindrome("abc"));
  }

  @Test
  void isPalindromeReturnsFalseForNotPalindromesWithEvenLength() {
    assertFalse(Palindromes.isPalindrome("abcdef"));
  }

  @Test
  void isPalindromeReturnsFalseForSingleLetterStrings() {
    assertFalse(Palindromes.isPalindrome("x"));
  }

  @Test
  void isPalindromeReturnsFalseForEmptyString() {
    assertFalse(Palindromes.isPalindrome(""));
  }

  @Test
  void isPalindromeRejectsNullString() {
    assertThrows(NullPointerException.class, () -> Palindromes.isPalindrome(null));
  }

  @Test
  void isPalindromeReturnsFalseForStringsWithDifferentTerminalCharacters() {
    assertTrue(Palindromes.isPalindrome("qwertzuioppoiuztrewq"));
    assertFalse(Palindromes.isPalindrome("qwertzuioppoiuztrewa"));
  }

}
