/* This is a class that extends on the circle class
 * this class adds in the aspect of height and volume to the basic circle making a cylinder
 * And with comes in a affect of surface area and volume
 */

public class Cylinder extends Circle
{
  private double height;
  
  Cylinder(double radius, double height)
  {
    super(radius);
    this.height=height;
  }
  
  public double getHeight()
  {
    return this.height;
  }
  
  public void setHeight(double height)
  {
    this.height=height;
  }
  
  public double calcAreaCylinder()
  {
    double areaCylinder=(2*super.calcAreaCircle())+(super.calcCircumference()*height);
    return areaCylinder;
  }
  
  public double calcVolumeCylinder()
  {
    double volume= super.calcAreaCircle()*height;
    return volume;
  }
  
  public String toString()
  {
    String answer= "For a cylinder with the radius of "+ super.getRadius()+" and a height of "+this.getHeight()+"."+'\n'+  
      "The surface area of the shape is "+ this.calcAreaCylinder()+ " the volume of the shape is " +this.calcVolumeCylinder();
      return answer;
  }
}