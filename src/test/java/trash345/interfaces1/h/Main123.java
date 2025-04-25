package trash345.interfaces1.h;

public class Main123 {
    public static void main(String[] args) {
        Encryptable aes = new AES();

        // Encrypt data using AES encryption and store the result
        String encryptedDataAES = aes.encrypt("Java Interface.");
        System.out.println("AES Encrypted: " + encryptedDataAES);

        // Decrypt the AES-encrypted data and store the result
        String decryptedDataAES = aes.decrypt(encryptedDataAES);
        System.out.println("AES Decrypted: " + decryptedDataAES);

        System.out.println("--------------------------------------");
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
