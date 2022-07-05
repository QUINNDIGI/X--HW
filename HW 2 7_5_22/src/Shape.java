public class Shape {

    private boolean isFilled;
    private String color;

    //Constructors
    public Shape() {
        this.isFilled = true;
        this.color = "Green";
    }
    public Shape(boolean isFilled, String color) {
        this.isFilled = isFilled;
        this.color = color;
    }

    //Getters
    public boolean getIsFilled() {
        return isFilled;
    }
    public String getColor() {
        return color;
    }
    //Setters
    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //Methods
    @Override
    public String toString() {
        return ("Filled: " + this.isFilled + "\n" + "Color: " + this.color + "\n");
    }

}
