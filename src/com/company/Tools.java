package com.company;

import java.security.MessageDigest;

public class Tools {
    public static String getSHA2HexValue(String data) {
        byte[] cipher_byte;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(data.getBytes());
            cipher_byte = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : cipher_byte) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }
}
