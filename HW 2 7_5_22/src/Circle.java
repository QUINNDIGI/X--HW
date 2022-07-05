public class Circle extends Shape {

    private double radius;

    //Constructors
    public Circle() {
        radius = 1;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, boolean isFilled, String color) {
        super(isFilled, color);
        this.radius = radius;
    }
    //Getters
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    //Setters
    public void setRadius(double radius){
        this.radius = radius;
    }

    //Methods
    public String toString(){
        return ("Radius: " + this.radius + "\n" + "Area: " + getArea() + "\n" + super.toString());
    }
}
