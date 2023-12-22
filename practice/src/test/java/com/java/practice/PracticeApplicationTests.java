package com.java.practice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PracticeApplicationTests {

	public int countPalindromicSubsequence(String s) {
		Set<Character> letters = new HashSet<>();
		for (char c : s.toCharArray()) {
			letters.add(c);
		}

		int ans = 0;

		for (char letter : letters) {
			int i = -1, j = 0;

			for (int k = 0; k < s.length(); k++) {
				if (s.charAt(k) == letter) {
					if (i == -1) {
						i = k;
					}
					j = k;
				}
			}

			Set<Character> between = new HashSet<>();

			for (int k = i + 1; k < j; k++) {
				between.add(s.charAt(k));
			}


			ans += between.size();
		}

		return ans;
	}

	@Test
	void contextLoads() {
		int result = countPalindromicSubsequence("abcdefghijka");
		System.out.println("Jumlah palindromic subsequence: " + result);
		assertEquals(10, result, "Jumlah palindromic subsequence nggak sesuai ekspektasi");
		assertTrue(result == 10, "jumlah palindrom sesuai ekspektasi");

	}

}
