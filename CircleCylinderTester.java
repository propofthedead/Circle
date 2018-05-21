public class CircleCylinderTester
{
  public static void main(String args[])
  {
    System.out.println("Testing the circle method");
    Circle jo= new Circle(3);
    double rad= jo.getRadius();
    double cir=jo.calcCircumference();
    double area= jo.calcAreaCircle();
    System.out.println("The radius is "+ rad);
    System.out.println("The circumference is "+cir);
    System.out.println("The area is "+ area);
    System.out.println("We are now changing the radius to 5.5");
    jo.setRadius(5.5);
    rad= jo.getRadius();
    cir=jo.calcCircumference();
    area= jo.calcAreaCircle();
    System.out.println("The radius is "+ rad);
    System.out.println("The circumference is "+cir);
    System.out.println("The area is "+ area);
    
    System.out.println("NOw we are testing the circle method");
    Cylinder hi = new Cylinder(2,3);
    rad= hi.getRadius();
    double hei= hi.getHeight();
    double areacy= hi.calcAreaCylinder();
    double volume= hi.calcVolumeCylinder();
    System.out.println("The radius is " + rad);
    System.out.println("The height is" +hei);
    System.out.println("the surface area is "+ areacy);
    System.out.println("The volume is " + volume);
    System.out.println("Now we will change the radius to 3.1 and the height to 7.5");
    System.out.println();
    
  }

}