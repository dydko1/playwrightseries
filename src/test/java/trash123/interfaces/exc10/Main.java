package trash123.interfaces.exc10;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

// Declare the Main class
public class Main {
    public static void main(String[] args) {
        // Create an instance of the AES class for encryption and decryption
        Encryptable aes = new AES();

        // Encrypt data using AES encryption and store the result
        String encryptedDataAES = aes.encrypt("Java Interface.");
        System.out.println("AES Encrypted: " + encryptedDataAES);

        // Decrypt the AES-encrypted data and store the result
        String decryptedDataAES = aes.decrypt(encryptedDataAES);
        System.out.println("AES Decrypted: " + decryptedDataAES);

        // Create an instance of the RSA class for encryption and decryption
        Encryptable rsa = new RSA();

        // Encrypt data using RSA encryption and store the result
        String encryptedDataRSA = rsa.encrypt("Java Interface.");
        System.out.println("RSA Encrypted: " + encryptedDataRSA);

        // Decrypt the RSA-encrypted data and store the result
        String decryptedDataRSA = rsa.decrypt(encryptedDataRSA);
        System.out.println("RSA Decrypted: " + decryptedDataRSA);
    }
}