package xyz.bozqee.common.lang;

import org.apache.commons.codec.binary.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class HashUtils {

    private static final Logger logger = LoggerFactory.getLogger(HashUtils.class);
    private static final String SHA_256 = "SHA-256";

    public static String getSha256String(String message) {
        if (message == null) {
            return null;
        }
        try {
            byte[] data = message.getBytes(StandardCharsets.UTF_8);
            return getSha256(data);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return "";
        }
    }

    public static String getSha256(byte[] message) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SHA_256);
            messageDigest.update(message);
            return Hex.encodeHexString(messageDigest.digest());
        } catch (Exception e) {
            logger.error(e.getMessage());
            return "";
        }
    }

}
