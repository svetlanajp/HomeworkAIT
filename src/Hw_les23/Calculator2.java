package Hw_les23;

public class Calculator2 {
    public double x;
    public double y;
    public double z;

    public Calculator2(){this(9);}
    public Calculator2(double x){this(x,5);}
    public Calculator2(double x, double y){this(x,y,3);}

    public Calculator2(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void sumAndSubstr(){
        System.out.println(x + " + " + y + " = " + (x+y));
        System.out.println(x + " + " + y + " + " + z + " = " + (x+y+z));
        System.out.println(x + " - " + y + " = " + (x-y));
        System.out.println(x + " - " + y + " - " + z + " = " + (x-y-z));
    }

}
