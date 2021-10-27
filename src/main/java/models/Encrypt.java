package models;

public class Encrypt {
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


    public String encrypter(){
        StringBuilder encryptedText = new StringBuilder();

        for(int i = 0; i < getWord().length(); i++ ){
            char wordChar = getWord().charAt(i);
            char encrypted =  (char) (wordChar + getKey());
            encryptedText.append(encrypted);
        }
        return encryptedText.toString();
    }

}