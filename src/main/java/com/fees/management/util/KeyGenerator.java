package com.fees.management.util;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import javax.crypto.SecretKey;
import java.util.Base64;

public class KeyGenerator {
    public static void main(String[] args) {
        // Generate a secure key for HS256
        SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        
        // Encode the key in Base64
        String base64Key = Base64.getEncoder().encodeToString(key.getEncoded());
        
        // Print the secure key
        System.out.println("Secure Key: " + base64Key);
    }
}