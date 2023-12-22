package com.java.practice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

public class DefangingIpAddr {
    public String defangIPaddr(String address) {
        StringBuilder defangedIp = new StringBuilder();


        for(int i=0; i<address.length(); i++){
            char currentChar = address.charAt(i);

            if(currentChar == '.'){
                defangedIp.append("[.]");
            } else{
                defangedIp.append(currentChar);
            }
        }


        return defangedIp.toString();
    }

    //simple way
    public String defangWithReplace(String addr){
        return addr.replace(".", "[.]");
    }

    @Test
    void TestDefangIpAddr(){
        String test = defangIPaddr("1.1.1.1");
        System.out.println(test);
        assertEquals("1[.]1[.]1[.]1", test, "Test berhasil");
    }
}
