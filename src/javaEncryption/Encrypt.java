package javaEncryption;

public class Encrypt {
    private char[] characterArray = {
            'A', 'B', 'C', 'Ç', 'D', 'E', 'F', 'G', 'Ğ', 'H', 'I', 'İ',
            'J', 'K', 'L', 'M', 'N', 'O', 'Ö', 'P', 'Q', 'R', 'S', 'Ş',
            'T', 'U', 'Ü', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'ç', 'd', 'e', 'f', 'g', 'ğ', 'h', 'ı', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'ö', 'p', 'q', 'r', 's', 'ş',
            't', 'u', 'ü', 'v', 'w', 'x', 'y', 'z',
            '<', '>', '\'', '^', '#', '+', '$', '!', '%', '&', '{', '}',
            '[', ']', '(', ')', '/', '\\', '=', '?', '*', '|', '-', '_',
            '@', '\"', 'é', ',', ';', '`', '.', ':',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
        };
    
    private String[] encryptCharacterArray = {
                "Do8", "Q%l", "9)1", "nMt", "bD*", "t;?", "3=é", "irU", "VwV", "6_>",
                "Hg|", "p02", "{fq", "@Lk", "x+\\", "JjY", "76,", "`SR", "Il-", "nS4",
                "Ux6", "]rE", "&%z", "0S3", ":éU", "E3D", "%fT", "Z1q", "rX.", "6G<",
                ")C'", "pp0", "t+T", "O0P", "V8e", "#@$", "h!>", "x3|", "5Q[", "z*@",
                "C)>", "LFT", "=1}", "><{", "Y'\\", "d|b", "m3?", "K<+", "U0_", "|@|",
                "^:!", "'T_", "(a\\", "7ZI", "lG9", "P$T", "3B}", "8&Q", "t?^", "tJU",
                "Z|^", "R<<", "@0a", "X+<", "Bo=", "|TF", "0Y<", "%5}", "83_", "{H]",
                "ae/", "1Z:", "?S5", "<=>", "=}<", "*'s", "cTw", "GlP", "9QO", "nMr",
                "AZJ", "`;-", "YZs", "/Al", "4+G", "vVS", "+=!", "LsZ", "<K<", "U0x",
                "3@'", "WaV", "B3b", "2S7", "Vbq", "C5T", "h^a", "F+K", "<]U", ":`D",
                "&<#", "r3|", "_%X", "JcQ", "L!]", "{\\7"
        };
    
    private int firstRandomNum = 0;
    private int lastRandomNum = 0;
    
    public int getFirstRandomNum(){
        return firstRandomNum;
    }
    
    public void setFirstRandomNum(int _firstRandomNum){
        firstRandomNum = _firstRandomNum;
    }
    
    public int getLastRandomNum(){
        return lastRandomNum;
    }
    
    public void setLastRandomNum(int _lastRandomNum){
        lastRandomNum = _lastRandomNum;
    }
    
    //kelimenin char dizisine dönüşümü
    private char[] wordArray;
    public void setWordCharacterArray(String word){
        wordArray = word.toCharArray();
        //word.
    }
    
    //karakter kontrol eden metod
    public boolean chackWordCharcter(){
        String chack = "";
        
        for(char wordCharacter : wordArray){
            for(char arrayCharacter : characterArray){
                if(wordCharacter == arrayCharacter){
                    chack += "+";
                }
            }
        }
        
        if(chack.length() == wordArray.length){
            return true;
        }
        
        return false;
    }
    
    //şifreleyen metod
    public String getEncryptedWord(){
        String encryptedWord = "";
        
        for(int i = wordArray.length - 1; i >= 0; i--){
            for(int j = 0; j < characterArray.length; j++){
                if(wordArray[i] == characterArray[j]){
                    encryptedWord += encryptCharacterArray[j];
                }
            }
        }
        
        return encryptedWord(encryptedWord).concat(randomCharcter(lastRandomNum));
    }
    
    //şifreyi çözen metod
    private String decryptedWord(){
        String decryptedWord = "";
        String encryptedWord = ""; 
        int index = 0;
        int error = 0;
        
        for(int i = 0; i < wordArray.length ; i++){
            index++;
            encryptedWord += wordArray[i];
            
            if(index%3 == 0){
                for(int j = 0 ; j < encryptCharacterArray.length; j++){
                    error++;
                    if(encryptedWord.equals(encryptCharacterArray[j])){
                        decryptedWord += characterArray[j];
                        encryptedWord = "";
                        error = 0;
                        break;
                    }
                    
                    if(error == encryptCharacterArray.length){
                        decryptedWord += "- ]RAV RETKARAK ILATAH[";
                    }
                }
            }
        }
        
        return decryptedWord;
    }
    
    //çözülen tersten çıkan şifreyi düzeltip çıktı veren metod
    public String getDecryptedWord(String _decryptedWord){
        String setDecrytedWord = "";
        
        char[] words = decryptedWord().toCharArray();
        
        for(int i = words.length - 1; i >= 0; i--){
            setDecrytedWord += words[i];
        }
        
        return setDecrytedWord;
    }
    
    //şifre çözülme kontrol etme metodu
    public boolean chackDecrypted(){
        decryptedFLRandomClearTrimWord();
        decryptedWordRandomClearTrimWord();
        
        if(wordArray.length % 3 == 0 && chackWordCharcter()){
            return true;
        }
        return false;
    }
    
    //random kelime atama metodu
    private String randomCharcter(int num){
        String rndCharcter = "";
        for(int i = 0; i < num; i++){
            rndCharcter += String.valueOf(characterArray[(int)(Math.random() * characterArray.length)]);
        }
        return rndCharcter;
    }
    
    //3 lü kelime arasına şifrenin koyulacak yer parametresi
    private int encryptI = 0;
    private boolean wordEncryptMethod(){
        if(encryptI > 11){
            encryptI = 0;
        }
        
        switch(encryptI++){
            case 2:
            case 7:
            case 11:
                return true;
            default :
                return false;
        }
    }
    
    //şifrenin arasına harf ekleyen metod
    private String encryptedWord(String encrypt){
        String getEncrypt = "";
        encryptI = 0;
        char[] newEncrypt = encrypt.toCharArray();
        
        for(int i = 0; i < newEncrypt.length; i++){
            if(!wordEncryptMethod()){
                getEncrypt += newEncrypt[i];
            }
            else{
                getEncrypt += randomCharcter(1);
                i--;
            }
        }
        return randomCharcter(firstRandomNum).concat(getEncrypt);
    }
    
    private void firstRandomClear(int num){
        for(int i = 0; i < wordArray.length; i++){
            if(i < num){
                wordArray[i] = ' ';
            }
            else{
                break;
            }
        }
    }
    
    private void lastRandomClear(int num){
        int end = (wordArray.length - num) - 1;
        for(int i = wordArray.length - 1; i > 0; i--){
            if(i == end){
                break;
            }
            else{
                wordArray[i] = ' ';
            }
        }
    }
    
    private void wordRandomClear(){
        encryptI = 0;
        for(int i = 0; i < wordArray.length; i++){
            if(wordEncryptMethod()){
                wordArray[i] = ' ';
            }
        }
    }
    
    //Dizide ki boşlukları kaldırma
    private void decryptedFLRandomClearTrimWord(){
        String newWord = "";
        
        firstRandomClear(firstRandomNum);
        lastRandomClear(lastRandomNum);
        
        for(int i = 0; i < wordArray.length; i++){
            newWord += wordArray[i];
        }
        
        wordArray = newWord.trim().toCharArray();
    }
    
    //Kelime arasındaki harfleri çıkarma
    private void decryptedWordRandomClearTrimWord(){
        String newWord = "";
        wordRandomClear();
        
        for(int i = 0; i < wordArray.length; i++){
            newWord += wordArray[i];
        }
        
        wordArray = newWord.replace(" ", "").toCharArray();
    }
    
    //Test
    public String decryptedWord(String text, int num){
        decryptedFLRandomClearTrimWord();
        decryptedWordRandomClearTrimWord();
        
        String w = "";
        for(int i = 0; i < wordArray.length; i++){
            w += wordArray[i];
        }
        return w;
    }
}
