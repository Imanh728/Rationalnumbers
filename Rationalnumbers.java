public class Rationalnumbers {
    private int numerator;
    private int denominator;


    //default construtor
    public Rationalnumbers(){
        this.numerator = 0;
        this.denominator = 1;
    }

    //parametarized constructor
    public Rationalnumbers(int n,int d){
        if(d==0){
            throw new IllegalArgumentException("Denomnator cannot be zero");
        }
        this.numerator = n;
        this.denominator = d;
    
    }
    //setters and getters

     public void setnumerator(int n){
        this.numerator = n;
     }

     public void setdenominator(int d){
        if(d==0){
            throw new IllegalArgumentException("Denomnator cannot be zero");
        }
        this.denominator = d;
     }
     public int getnumerator(){
        return numerator;
     }
     public int getdenominator(){
       return denominator;

     }


     //print rational number 
     public void print(){
        System.out.println(numerator + "/ " + denominator);
     }

     //Add two rational number
     public Rationalnumbers add(Rationalnumbers y){
        int lcm = LCM(this.denominator, y.denominator);
        int num = this.numerator * (lcm / this.denominator) + y.numerator * ( lcm / y.denominator );
        return new Rationalnumbers(num, lcm);

     }
      //Subtract two rational numbers

      public Rationalnumbers subtract(Rationalnumbers y){
         int lcm = LCM(this.denominator, y.denominator);
         int num = this.numerator * (lcm / this.denominator) - y.numerator * ( lcm / y.denominator );
          return new Rationalnumbers(num, lcm);
      }

      //GCD to simplify
      private int GCD(int a, int b){
         if(b==0) return a;
         return GCD(b,a%b);
      }
      //lcm using gcd
      public int LCM(int a, int b){
         return (a*b)/GCD(a,b);
      }

      //simplify
      private void simplify(){
         int gcd =  GCD(Math.abs(numerator), Math.abs(denominator));
         numerator /= gcd;
         denominator /= gcd;
         if(denominator<0){
            numerator = -numerator;
            denominator = -denominator;
         }
      }

      //show simplifed rational numbers
      public void show(){
         simplify();
         print();
      }

}
 