import java.lang.Math;

public class Circle
{
  private double radius;
  
  public Circle(double radius)
  {
    this.radius=radius;
  }
  
  public void setRadius(double r)
  {
    radius=r;
  }
  
  public double getRadius()
  {
    return radius;
  }
  
  public double calcCircumference()
  {
    double Circumference= radius*2* Math.PI;
    return Circumference;
  }
  public double calcAreaCircle()
  {
    double area= Math.pow(radius,2)*Math.PI;
    return area;
  }
  
  public String toString()
  {
    String reply= "A circle with the radius of "+radius+ ", has a Circumference of "+ this.calcCircumference()+"  and has an area of "+ this.calcAreaCircle()+".";
    return reply;
  }
}