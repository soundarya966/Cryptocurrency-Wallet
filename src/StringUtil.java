import java.security.MessageDigest;

public class StringUtil {

    // Function to apply SHA-256 hashing
    public static String applySha256(String input) {

        try {

            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Applies SHA-256 to input
            byte[] hash = digest.digest(input.getBytes("UTF-8"));

            // Converts byte array into hexadecimal format
            StringBuffer hexString = new StringBuffer();

            for (int i = 0; i < hash.length; i++) {

                String hex = Integer.toHexString(0xff & hash[i]);

                if (hex.length() == 1)
                    hexString.append('0');

                hexString.append(hex);
            }

            return hexString.toString();

        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }
}
