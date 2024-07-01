package hu.aestallon.example;

import java.util.Objects;

/**
 * Contains static utility methods to determine palindromic properties of {@link String}s.
 */
public final class Palindromes {

  // constructor declared private to prevent instantiation
  private Palindromes() {}

  // JavaDoc is provided for every public/protected member of a class as it is part of its API:

  /**
   * Determines whether the provided {@link String} is a palindrome or not.
   *
   * <p>
   * Palindromes are {@code String}s which read the same backwards and forwards. Single character
   * {@code String}s, although fulfill the above requirement, are not considered palindromes.
   *
   * @param s the {@link String} to test, not null
   *
   * @return true, if the specified {@link String} is a palindrome, false otherwise
   * @throws NullPointerException if invoked with {@code null} argument
   */
  public static boolean isPalindrome(String s) {
    Objects.requireNonNull(s, "input string cannot be null!");

    if (s.length() < 2) {
      return false;
    }

    final var chars = s.toCharArray();
    int l = 0;
    int r = chars.length - 1;
    while (l <= r) {
      if (chars[l++] != chars[r--]) {
        return false;
      }
    }
    return true;
  }

}
