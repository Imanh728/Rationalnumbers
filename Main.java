public class Main{
    public static void main(String[] args) {
        Rationalnumbers r1 = new Rationalnumbers(1,2);
        Rationalnumbers r2 = new Rationalnumbers(3,4);

        System.out.println("r1 = ");
        r1.show();
        System.out.println("r2 = ");
        r2.show();

        Rationalnumbers sum = r1.add(r2);
        System.out.println("r1 + r2 = ");
        sum.show();

          Rationalnumbers diff = r1.subtract(r2);
        System.out.println("r1 - r2 = ");
        diff.show();
    }
}