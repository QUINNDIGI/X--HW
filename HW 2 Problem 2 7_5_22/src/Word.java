public class Word extends Sentence{

    private String noVowelWord;

    //Constructors
    public Word(String s, String w){
        super(s);
        this.noVowelWord = w.replaceAll("[aeiou]", "");
        }
    //Getters
    public String getNoVowelsWord(){
        return this.noVowelWord;
    }
    //Methods
    public boolean isSubstring() {
        return getSentence().contains(this.noVowelWord);
    }
}



