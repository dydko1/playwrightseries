package trash123.interfaces.exc10;

interface Encryptable {
    // Declare the abstract method "encrypt" that classes implementing this interface must provide
    String encrypt(String data);
    
    // Declare the abstract method "decrypt" that classes implementing this interface must provide
    String decrypt(String encryptedData);
}