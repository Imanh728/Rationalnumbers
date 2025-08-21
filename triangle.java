public class triangle {
    public class triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private static int count = 0;

 public triangle(){
   this(1.0, 1.0, 1.0);
   count++;
 }
 public triangle(double side){
  this(side,side,side);
  count++;
 }
 public triangle(double x,double y){
  this(x,x, y);
  count++;
 }
 public triangle(double x,double y, double z){
  this.sideA= x;
  this.sideB= y;
  this.sideC= z;
  count++;
 }
 public triangle(triangle t){
  this(t.sideA,t.sideB,t.sideC);
 }

 //GETTERS AND SETTERS

 public double getsideA(){
  return sideA;
 }
 public void setsideA(double sideA){
  this.sideA= sideA;
 }

  public double getsideB(){
  return sideA;
 }
 public void setsideB(double sideB){
  this.sideB= sideB;
 }

  public double getsideC(){
  return sideC;
 }
 public void setsideC(double sideC){
  this.sideC= sideC;
 }
 
 public double perimeter(){
  return sideA + sideB + sideC;
 } 

public static int objectcount(){
  return count;
}

@Override
public String toString(){
  return "triangle [sideA=" + sideA + ",sideB=" + sideB + ", sideC= " + sideC + "]";
} 

}


}
