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
//    9#task
    public void perimeterRectangle(double w, double l){
        result=2 *(w+l);
        System.out.println("Perimeter of Rectangle is "+result);
    }
    public void areaRectangle(double w, double l){
        result=(w*l);
        System.out.println("Area of Rectangle is "+result);
    }

//    10# task
    public void perimeterTriangle(double a, double b,double c){
    result=a+b+c;
    System.out.println("Perimeter of Triangle is "+result);
    }
    public void areaTriangle(double b, double h){
        result=(b*h)/2;
        System.out.println("Area of Triangle is "+result);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Give me 1st number");
//        double num1=sc.nextInt();
//        System.out.println("Give me 2nd number");
//        double num2= sc.nextInt();
//        System.out.println("Give me 3rd number");
//        double num3= sc.nextInt();


//        ArithmeticCalculator calculator=new ArithmeticCalculator(num1,num2);
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

//        calculator.deltaQuadQuation(num3);

//        9# task
//        calculator.areaRectangle(num1,num2);
//        calculator.perimeterRectangle(num1,num2);


//        10# task
//        System.out.println("Ente height of b side");
//        int h= sc.nextInt();
//        calculator.areaTriangle(h,num2);
//        calculator.perimeterTriangle(num1,num2,num3);


//        16# task -legal age checker 18+
//        System.out.println("Enter your age");
//        int age=sc.nextInt();
//        boolean legalAge=age>=18;
//        if (legalAge){
//            System.out.println("You are in legal  age");
//        }else System.out.println("You are not in legal  age");


//        17# task Bigger number checker for 2numbers
//        System.out.println("Enter 1st number");
//        double num1= sc.nextDouble();
//        System.out.println("Enter 2nd number");
//        double num2= sc.nextDouble();
//        if(num1>num2){
//            System.out.println("1st number is bigger");
//        }
//        else if (num1<num2){
//            System.out.println("2nd number is bigger");
//        }
//        else System.out.println("Both numbers are equal");


//        18# task Bigger number checker for 3NUMBERS

        System.out.println("Enter 1st number");
        double num1= sc.nextDouble();
        System.out.println("Enter 2nd number");
        double num2= sc.nextDouble();
        System.out.println("Enter 3rd number");
        double num3= sc.nextDouble();
        double largestNumber;
        if(num1>=num2 && num1>=num3){
            largestNumber=num1;
            System.out.println("1st number is bigger : "+num1);
        }
        else if (num2>=num1 && num2>=num3 ){
            largestNumber=num2;
            System.out.println("2nd number is bigger : "+num2);
        }
        else {largestNumber = num3;
            System.out.println("3rd number is bigger : " + num3);}


        sc.close();
    }
}