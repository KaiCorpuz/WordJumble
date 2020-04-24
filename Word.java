
/*  take a word from the list and make it the answer
    The, scramble the word
 */
import java.util.Random;
//import java.util.ArrayList;
import javax.swing.JPanel;

class Word{
    public String answer;

    public Word(){
        newAnswer();

    }
    
    public static int GetNumberBetweenInclusive(int min, int max) {
        Random myRandom = new Random();
        return min + myRandom.nextInt(max-min+1);
    }  
    
    
    final String[] wordList = {"thunder","lightning","computer","choir","music","cut","paper","rock","banana","apple","orange","route","strengths","narrow","head","nose","falling","flip","bird","avenger",
        "alien","ladder","telephone","tables","obstacle","platform","quick","stare","ghost","store","liberate","science","thursday","canine","purple","brown","million","hundred","cabin","forty",
        "droid","assault","quarantine","security","national","crazy","brothel","tennis","foot","basket","shoe","military","recession","inflation","deflation","respawn","chalupa","environment","translation","variable",
        "surfaces","arctic","tractor","industry","compilation","bakery","baseball","record","plant","option","private","public","glacier","graphics","rapper","wrapper","question","react","mouse","phone",
        "dizzy","jumpy","quirk","quake","jokes","phase","bronze","magic","booze","capes","jumbo","shrimp","lobster","sheep","horse","cream","sugar","smile","sprint","goals",
        "rabbit","itchy","bunker","number","gizmo","robot","letter","folks","woah","funky","smooth","empty","complex","freeze","sweet","salty","siege","bulls","sweat","course",
        "carrot","school","eleven","seven","three","water","pencil","eraser","wonder","super","ships","ball","wet","mad","happy","sad","moody","pen","sap","ape",
        "try","tries","level","sand","peace","love","lead","deal","link","logs","ink","master","branch","drink","crab","fish","bubble","mirror","amaze","beat",};
        //20 words per line


      
   public String newAnswer(){
        int randNum = GetNumberBetweenInclusive(0,wordList.length);
        answer = wordList[randNum];
        
        return answer;
    }    

    public Boolean checkAnswer(String x){
        if (x.equals(answer)){
            return true;
        }
        return false;
    }
    

    public String scramble(){
        int wordLength = answer.length();

        char[] characters = answer.toCharArray();
        for(int i = 0; i < wordLength; i++){
            int randomIndex = (int)(Math.random() * characters.length);
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        }
        return new String(characters);
    }
    
    /*
    public static void main(String[] args){
        Word randWord = new Word();

        System.out.println(randWord.getAnswer());
        System.out.println(randWord.scramble(answer));
        
        
    }
    */
    
    
}



