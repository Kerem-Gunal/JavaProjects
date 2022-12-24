public class Circle {
    private double circleradius;

    public Circle(){
        circleradius = 0;
    }
    public void setRadius(double circleradius){
        this.circleradius=circleradius;
    }
    public double getRadius(){
        return circleradius;
    }
    public double circumference(){
        double circumference = 2*(Math.PI*circleradius);
        return circumference;
    }
    public double area(){
        double area = Math.PI*(circleradius*circleradius);
        return area;
    }
    public String toString(){
        return "Radius: "+circleradius+", Circumference: "+circumference()+", Area: "+area();
    }
}
