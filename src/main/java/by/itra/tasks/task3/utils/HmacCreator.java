package by.itra.tasks.task3.utils;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Formatter;

public class HmacCreator {

    private final static String HMAC_SHA_3_256 = "HmacSHA3-256";

    private byte[] getRandomKey(int countByte) {
        SecureRandom random = new SecureRandom();
        return random.generateSeed(countByte);
    }

    private String calculateHMAC(String data, byte[] key) {
        SecretKey secretKey = new SecretKeySpec(key, HMAC_SHA_3_256);
        Mac mac = null;
        try {
            mac = Mac.getInstance(HMAC_SHA_3_256);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        try {
            if (mac != null) {
                mac.init(secretKey);
            }
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
        return toHexString(mac.doFinal(data.getBytes()));
    }

    private String toHexString(byte[] bytes) {
        Formatter formatter = new Formatter();
        for (byte b : bytes) {
            formatter.format("%02x", b);
        }
        return formatter.toString();
    }

}
