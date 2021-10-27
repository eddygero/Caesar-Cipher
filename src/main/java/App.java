import models.CaesarCipher;
import models.Decrypt;
import models.Encrypt;

import java.util.Scanner;

public class App {
    public static void main (String[] args){
        System.out.println("\t===========================");
        System.out.println("\t\tCAESAR-CIPHER");
        System.out.println("\t===========================");
        System.out.println("\n Welcome to Caesar Cipher.");
        boolean run = true;
        while (run){
            Scanner myScanner = new Scanner(System.in);
            System.out.println("\n\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t| Enter ->  1: to Encrypt\n\t| Enter ->  2: to Decrypt\n\t| Enter ->  0: to Exit ");
            System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            Integer branch = Integer.parseInt(myScanner.nextLine());

            if (branch.equals(1)) {
                System.out.println("\n Enter a word to encrypt");
                String stringWord = myScanner.nextLine();
                System.out.println(" You entered: " + stringWord);
                System.out.println("\n Enter the key to encrypt with");
                int intKey = myScanner.nextInt();
                CaesarCipher testCaesar = new CaesarCipher(stringWord, intKey);
                Encrypt encrypt = new Encrypt();
                encrypt.setWord(testCaesar.getmWord());
                encrypt.setKey(testCaesar.getmKey());
                System.out.println("\t--------------------------------");
                System.out.println("\t| Your encrypted word is: "+ encrypt.encrypter());
                System.out.println("\t--------------------------------");
            }else if (branch.equals(2)) {
                System.out.println("\n Enter a word to Decrypt");
                String stringWord = myScanner.nextLine();
                System.out.println(" You entered: " + stringWord);
                System.out.println("\n Enter the key to Decrypt with");
                int intKey = myScanner.nextInt();
                CaesarCipher testCaesar = new CaesarCipher(stringWord,intKey);
                Decrypt decrypt = new Decrypt();
                decrypt.setWord(testCaesar.getmWord());
                decrypt.setKey(testCaesar.getmKey());
                System.out.println("\t---------------------------------");
                System.out.println("\t| Your decrypted word is: "+ decrypt.decrypter());
                System.out.println("\t---------------------------------");

            }else if(branch.equals(0)){
                run = false;
            }else {
                System.out.println(" Error! It should be a number");
            }
        }
    }
}
