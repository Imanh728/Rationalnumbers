public class trianglemain {
    
public class practiceMain {
    public static void main(String[] args) {
        triangle t1 = new triangle();
        System.out.println(" t1: " + t1);
        System.out.println("perimeter of t1: " + t1.perimeter());

        triangle t2 = new triangle(5);
        System.out.println(" \nt2: " + t2);
        System.out.println("perimeter of t2: " + t2.perimeter());
        
         triangle t3 = new triangle(5,7);
        System.out.println(" \nt3: " + t3);
        System.out.println("perimeter of t3: " + t3.perimeter());
        
         triangle t4 = new triangle(3,4,5);
        System.out.println(" \nt4: " + t4);
        System.out.println("perimeter of t4: " + t4.perimeter());
        
         triangle t5 = new triangle();
        System.out.println(" \nt5(copy of t4): " + t5);
        System.out.println("perimeter of t5: " + t5.perimeter());
        
       System.out.println("\nTotal triangle objects: " + triangle.objectcount());

    }
}
}
