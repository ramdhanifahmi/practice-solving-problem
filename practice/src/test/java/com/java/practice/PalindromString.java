package com.java.practice;

public class PalindromString {
    public boolean isPalindrome(String s) {
        // Mengonversi semua huruf kapital menjadi huruf kecil
        s = s.toLowerCase();

        // Menghapus karakter non-alphanumeric
        StringBuilder cleanedString = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanedString.append(c);
            }
        }

        // Mengecek apakah string adalah palindrome
        int length = cleanedString.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedString.charAt(i) != cleanedString.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
