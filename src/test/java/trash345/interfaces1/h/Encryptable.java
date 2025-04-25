package trash345.interfaces1.h;

interface Encryptable {
    // Declare the abstract method "encrypt" that classes implementing this interface must provide
    String encrypt(String data);
    
    // Declare the abstract method "decrypt" that classes implementing this interface must provide
    String decrypt(String encryptedData);
}