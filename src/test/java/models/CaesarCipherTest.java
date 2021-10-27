package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {
    @Test
    public void caesarCipher_instantiatesCorrectly_true() {
        CaesarCipher testCaesar = new CaesarCipher("Hello",2);
        assertTrue(testCaesar instanceof CaesarCipher);
    }

    @Test
    public void caesarCipher_getmKey_int() {
        CaesarCipher testCaesar = new CaesarCipher("Hello",2);
        assertEquals(2,testCaesar.getmKey());
    }

    @Test
    public void caesarCipher_getmWord_String() {
        CaesarCipher testCaesar = new CaesarCipher("Hello",1);
        assertEquals("Hello",testCaesar.getmWord());
    }

    @Test
    public void caesarCipher_setmWord_String() {
        CaesarCipher testCaesar = new CaesarCipher("Hello",1);
        testCaesar.setmWord("hi");
        assertEquals("hi",testCaesar.getmWord());
    }

    @Test
    public void caesarCipher_setmKey_int(){
        CaesarCipher testCaesar = new CaesarCipher("Hello",2);
        testCaesar.setmKey(1);
        assertEquals(1,testCaesar.getmKey());
    }

    @Test
    public void caesarCipher_encrypter_String(){
        CaesarCipher testCaesar = new CaesarCipher("Ae", 1);
        Encrypt testEncrypt = new Encrypt();
        testEncrypt.setWord(testCaesar.getmWord());
        testEncrypt.setKey(testCaesar.getmKey());
        assertEquals("Bf",testEncrypt.encrypter());
    }

    @Test
    public void caesarCipher_decrypter_String(){
        CaesarCipher testCaesar = new CaesarCipher("Bf", 1);
        Decrypt testDecrypt = new Decrypt();
        testDecrypt.setWord(testCaesar.getmWord());
        testDecrypt.setKey(testCaesar.getmKey());
        assertEquals("Ae",testDecrypt.decrypter());
    }

    }
