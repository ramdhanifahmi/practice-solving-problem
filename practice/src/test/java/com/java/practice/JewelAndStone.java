package com.java.practice;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class JewelAndStone {
    
/*  Anda diberikan dua string:
    jewels: String yang mewakili jenis-jenis batu yang dianggap sebagai perhiasan (jewels).
    stones: String yang mewakili batu-batu yang Anda miliki.

    Tugas Anda adalah menghitung berapa banyak batu yang Anda miliki (stones) yang juga termasuk dalam jenis perhiasan (jewels).
    Perlu diperhatikan bahwa huruf besar dan kecil dianggap berbeda. Misalnya, "a" dan "A" dianggap sebagai jenis batu yang berbeda.
    
    Contoh 1:
    Input: jewels = "aA", stones = "aAAbbbb"
    
    Output: 3
    
    Penjelasan:
    jewels = "aA" berarti jenis perhiasan adalah 'a' dan 'A'.
    
    stones = "aAAbbbb" berarti batu-batu yang Anda miliki adalah 'a', 'A', 'A', 'b', 'b', 'b', 'b'.
    
    Sekarang, kita hitung berapa banyak batu yang Anda miliki yang termasuk dalam jenis perhiasan:
    
    'a' muncul 1 kali di stones.
    
    'A' muncul 2 kali di stones.
    
    Jumlah total batu yang termasuk dalam jenis perhiasan adalah 1 + 2 = 3.
    
    Kesimpulan:
    Outputnya adalah 3 karena ada 3 batu ('a', 'A', 'A') yang termasuk dalam jenis perhiasan ('a' dan 'A').

    */
    
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelSet = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            
            jewelSet.add(c);
        }
        int count = 0;
        for (char c : stones.toCharArray()) {
            if (jewelSet.contains(c)) {
                count++;
            }
        }
        
        return count;
    }
    
    @Test
    public void testNumJewelsInStones() {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(
                numJewelsInStones("Bb", "aAAbbbb")
        );
    }
}
