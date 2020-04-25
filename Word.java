
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
    
    
    final String[] wordList = {"dance","guess","panel","choir","music","cut","paper","rock","banana","apple","orange","route","price","north","head","nose","falls","flip","bird","avenge",
        "alien","term","cards","table","stack","swing","quick","stare","ghost","store","light","rebel","media","canine","purple","brown","sixty","fifty","cabin","forty",
        "droid","fleet","flight","shirt","nation","crazy","rocket","tennis","foot","basket","shoe","bass","tweet","snap","fans","stick","before","lakes","meme","fight",
        "fuel","arctic","belly","south","chop","bakery","soft","record","plant","option","target","public","moves","blue","rapper","texas","wallet","react","mouse","phone",
        "dizzy","jumpy","quirk","quake","jokes","phase","bronze","magic","booze","capes","jumbo","shrimp","clams","sheep","horse","cream","sugar","smile","sprint","goals",
        "rabbit","itchy","bunker","number","gizmo","robot","letter","folks","woah","funky","smooth","empty","funny","freeze","sweet","salty","siege","bulls","sweat","course",
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



