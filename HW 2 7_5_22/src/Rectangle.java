public class Rectangle extends Shape {

    private double width;
    private double length;

    //Constructors
    public Rectangle(){
        length = 2;
        width = 1;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        setLW(length, width);
    }
    public Rectangle(double width, double length, boolean isFilled, String color){
        super(isFilled, color);
        this.width = width;
        this.length = length;
        setLW(length, width);
    }

    //Getters

    //Setters
    public void setLW(double x, double y){
        if(x > y){
            this.length = x;
            this.width = y;
        } else {
            this.length = y;
            this.width = x;
        }
    }
    //Methods
    public double getArea(){
        return this.length * this.width;
    }
    public String toString(){
        return ("Width: " + this.width + "\n" + "Length: " + this.length + "\n" + "Area: " + getArea() + "\n" + super.toString());
    }

}
