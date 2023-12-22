package com.java.practice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConvertTemperature {
    public double[] convertTemperature(double celsius) {
        double[] convert = new double[2];

        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;

        convert[0] = kelvin;
        convert[1] = fahrenheit;

        return convert;
    }

    @Test
    void testTemperature() {
        double[] result = convertTemperature(36.50);
        System.out.println("Hasil konversi Kelvin: " + result[0]);
        System.out.println("Hasil konversi Fahrenheit: " + result[1]);
    }
}
