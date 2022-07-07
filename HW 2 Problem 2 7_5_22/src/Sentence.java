public class Sentence {

    private String sentence;

    //Constructors
    public Sentence(String sentence){
        this.sentence = sentence;
    }
    //Getters
    public String getSentence() {
        return sentence;
    }
    //Methods
    @Override
    public boolean equals(Object newSentence){
        if(this.sentence == newSentence) {
            return true;
        } else {
            return false;
        }
    }
}
