package models;

public class Decrypt {
    private String mWord;
    private Integer mKey;

    //Getter
    public String getWord(){
        return mWord;
    }
    public Integer getKey(){
        return mKey;
    }
    //Setter
    public  void setWord(String newWord){
        this.mWord = newWord;
    }
    public  void setKey(int newKey){
        this.mKey = newKey;
    }


    public String decrypter(){
        String decryptedText = "";
        for (int i = 0; i < getWord().length(); i++){
            char wordChar = getWord().charAt(i);
            char decrypted = (char) (wordChar - getKey());
            decryptedText += decrypted;
        }
        return decryptedText;
    }
}