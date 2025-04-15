package com.rafabispo.banking.util;

import java.util.Random;

public class Utility {

    public Utility() {
        // Private constructor to prevent instantiation
    }

    public static String generateAccountNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) { // Generate a 10-digit account number
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}
