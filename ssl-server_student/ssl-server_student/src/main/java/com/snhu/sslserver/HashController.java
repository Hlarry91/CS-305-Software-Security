package com.snhu.sslserver;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HashController {

    @GetMapping("/hash")
    public String getHash(
            @RequestParam(defaultValue = "HilneciaLarry-CS305") String input
    ) throws Exception {

        return sha256Hex(input);
    }

    // Helper method: SHA-256 → hex string
    private String sha256Hex(String input) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));

        StringBuilder hex = new StringBuilder();
        for (byte b : hashBytes) {
            String h = Integer.toHexString(0xff & b);
            if (h.length() == 1) hex.append('0');
            hex.append(h);
        }
        return hex.toString();
    }
}