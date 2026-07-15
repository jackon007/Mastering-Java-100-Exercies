import java.util.Scanner;

class ArithmeticCalculator{
    private double a;
    private double b;
    private static double result;
    ArithmeticCalculator(double a, double b){
        this.a=a;
        this.b=b;
    }
    public void addition(){
         result=a+b;
        System.out.println("Addition: "+result);
    }
    public void substraction(){
         result =a-b;
        System.out.println("Subtraction: " +result);
    }
    public void multiplication(){
         result=a*b;
        System.out.println("Multiplication: " +result);
    }
    public void division(){
         result=a/b;
        System.out.println("Division: " +result);
    }
//    #mean for 2 numbers
    public void arithmeticMean(){
         result=(a+b)/2;
        System.out.println("Mean is "+result);
    }
//    #mean for 3 numbers
    public void meanForThreeNum(double c){
        result =(a+b+c)/3;
        System.out.println("Mean is " +result);
    }
//    #geometric mean of 3number
    public void geomMeanForThreeNum(double c){
        result=Math.pow(a*b*c,1.0/3.0);
        System.out.println("Geometry Mean is "+result);
    }
    static void bMI(double h, double w) {
        result=w/(h*h);
        System.out.println("Bmi is " +result);
    }
    static void perimeterCircle(double r ){
        result=2*Math.PI*r;
        System.out.println("Radius is "+result);
    }
    static void areaCircle(double r){
        result=Math.PI*r*r;
        System.out.println("The area of Circle is "+result);
    }
    public void deltaQuadQuation(double c){
        result=Math.pow(b,2)-4*a*c;
        System.out.println("Delta of Quadratic Equation "+result);

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give me 1st number");
        double num1=sc.nextInt();
        System.out.println("Give me 2nd number");
        double num2= sc.nextInt();
        System.out.println("Give me 3rd number");
        double num3= sc.nextInt();



        ArithmeticCalculator calculator=new ArithmeticCalculator(num1,num2);
//        calculator.addition();
//        calculator.substraction();
//        calculator.multiplication();
//        calculator.division();
//        calculator.arithmeticMean();
//        calculator.meanForThreeNum(num3);

//        System.out.println("Enter your height");
//        double h=sc.nextDouble();
//        System.out.println("Enter your weight");
//        double w=sc.nextDouble();
//        ArithmeticCalculator.bMI(h,w);

//        System.out.println("Enter radius ..");
//        double r =sc.nextDouble();
////        ArithmeticCalculator.perimeterCircle(r);
//        ArithmeticCalculator.areaCircle(r);

        calculator.deltaQuadQuation(num3);







        sc.close();
    }
}