import java.time.LocalDate;
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
//        System.out.println("Enter 1st number");
//        double num1= sc.nextDouble();
//        System.out.println("Enter 2nd number");
//        double num2= sc.nextDouble();
//        System.out.println("Enter 3rd number");
//        double num3= sc.nextDouble();
//        double largestNumber;
//        if(num1>=num2 && num1>=num3){
//            largestNumber=num1;
//            System.out.println("1st number is bigger : "+num1);
//        }
//        else if (num2>=num1 && num2>=num3 ){
//            largestNumber=num2;
//            System.out.println("2nd number is bigger : "+num2);
//        }
//        else {largestNumber = num3;
//            System.out.println("3rd number is bigger : " + num3);}



//        19# odd or even number
//        System.out.println("Enter the number ");
//        int number=sc.nextInt();
//        if(number%2==0){
//            System.out.println(number+" is even");
//        }else System.out.println(number+1+" is odd");



//        20# positive , negative number or 0 number
//        System.out.println("Enter the number ");
//        int number=sc.nextInt();
//        if(number>0){
//            System.out.println(number + " is positive");
//        }else if(number<0){
//            System.out.println(number +" is negative");
//        }else System.out.println(number+" is 0");

//        21#  Make a program that reads the scores of two tests and reports whether the student passed (score greater than or equal to 6) or
//        failed (score less than 6) in each of the tests.
//        System.out.println("Enter the score of 1st test ...");
//        double score1=sc.nextDouble();
//        System.out.println("Enter the score of 2nd test ...");
//        double score2=sc.nextDouble();
//        if (score1>=6){
//            System.out.println("You succesfully passed the 1st test");
//        }else System.out.println("You succesfully failed hahah the 1st test");
//        if(score2>=6){   System.out.println("You succesfully passed the 2nd test");
//        }else System.out.println("You succesfully failed hahah the 2nd test");



//        22# Make a program that reads the grades of two tests, calculates the simple arithmetic mean, and informs whether the student
//        passed (average greater than or equal to 6) or failed (average less than 6).
//        System.out.println("Enter the score of 1st test ...");
//        double score1=sc.nextDouble();
//        System.out.println("Enter the score of 2nd test ...");
//        double score2=sc.nextDouble();
//        double meanScore=(score1+score2)/2;
//        if (meanScore>=6){
//            System.out.println("You succesfully passed ");
//        }else System.out.println("You failed");

//        23# reads three numbers, and informs if their sum is divisible by 5 or not.
//        System.out.println("Enter 1st number");
//        int num1= sc.nextInt();
//        System.out.println("Enter 2nd number");
//        int num2= sc.nextInt();
//        System.out.println("Enter 3rd number");
//        int num3=sc.nextInt();
//        int result=num1+num2+num3;
//        if (result%5==0){
//            System.out.println("The sum of 3 numbers is divisible by 5.");
//        }else System.out.println("The sum of 3 numbers is NOT divisible by 5 .");


//        24#  reads three numbers and checks if their sum is positive, negative or equal to zero
//        System.out.println("Enter 1st number");
//        int num1= sc.nextInt();
//        System.out.println("Enter 2nd number");
//        int num2= sc.nextInt();
//        System.out.println("Enter 3rd number");
//        int num3=sc.nextInt();
//        int result=num1+num2+num3;
//        if (result>0){
//            System.out.println("The sum of 3numbers is positive number !");
//        } else if (result<0) {
//            System.out.println("The sum of 3numbers is negative number !");
//        }
//        else System.out.println("The sume of 3numbers is 0");

//        25#  reads three numbers, and displays them on the screen in ascending order.
//        System.out.println("Enter 1st number");
//        int num1= sc.nextInt();
//        System.out.println("Enter 2nd number");
//        int num2= sc.nextInt();
//        System.out.println("Enter 3rd number");
//        int num3=sc.nextInt();
//        int num[]={num1,num2,num3};
//        int size=num.length;
//        int number=0;
//        for (int i=1;i<size;i++){
//            for (int j=0;j<size-i;j++){
//                if (num[j]>num[j+1]){
//                    number=num[j];
//                    num[j]=num[j+1];
//                    num[j+1]=number;
//                }
//            }
//        }
//        for(int numbers:num){
//            System.out.println(numbers);
//        }



//        26# reads the age of three people and how many of them are of legal age (age 18 or older).
//        System.out.println("Enter 1st age");
//        int num1= sc.nextInt();
//        System.out.println("Enter 2nd age");
//        int num2= sc.nextInt();
//        System.out.println("Enter 3rd age");
//        int num3=sc.nextInt();
//        int num[]={num1,num2,num3};
//        int legalAgeCount=0;
//        for (int i=0;i<num.length;i++){
//            if(num[i]>=18){
//                legalAgeCount++;
//            }
//        }
//        System.out.println(legalAgeCount+" peope/person is in legal age");



//        27# reads three numbers and tells you if they can be the sides of a triangle (the sum of two sides must always be greater than the third side)
//        System.out.println("Enter the length of 1st side");
//        double side1= sc.nextDouble();
//        System.out.println("Enter the length of 2nd side");
//        double side2= sc.nextDouble();
//        System.out.println("Enter the length of 3rd side");
//        double side3=sc.nextDouble();
//
//        if (side1+side2>side3 && side1+side3>side2 && side2+side3>side1){
//            System.out.println("3 sides can be the sides of triangle");
//        }else System.out.println("They can NOT");



//        28# reads the year of birth of a person and informs if he is able to vote (age greater than or equal to 16 years old).
//        System.out.println("Enter the year of your birth");
//        int yearOfBirth= sc.nextInt();;
//        int currentYear= LocalDate.now().getYear();
//        int voteAge=currentYear-yearOfBirth;
//        if (voteAge>=16){
//            System.out.println("You can vote !!!");
//        }else System.out.println("You are not in Voting AGE");



//        29# reads a person's age and informs if he is not able to vote (age less than 16 years old), if he is able to
//        vote but is not obligated (16, 17 years old, or age equal to or greater than 70 years), or if it is obligatory (18 to 69 years old).
//        System.out.println("Enter your AGE");
//        int age= sc.nextInt();
//        if ((age>=16 && age<18) || (age>=70)){
//            System.out.println("You are in Voting Age But it is not mandatory for you !!!");
//        }else if(age>=18 && age<=69){
//            System.out.println("You must vote, it is mandatory for you !!!");
//        }else System.out.println("You are not voting age");



//        30# reads three grades from a student and reports whether he passed (final grade greater than or equal to
//        7), failed (final grade less than 4) or was in recovery (final grade between 4 and 7).
//        System.out.println("Enter the score of 1st test ...");
//        double score1=sc.nextDouble();
//        System.out.println("Enter the score of 2nd test ...");
//        double score2=sc.nextDouble();
//        System.out.println("Enter the score of 3rd test ...");
//        double score3=sc.nextDouble();
//        double meanScore=(score1+score2+score3)/3;
//        if (meanScore>=7){
//            System.out.println("You succesfully passed ");
//        } else if (meanScore>=4 && meanScore<7) {
//            System.out.println("Yoy in Recovery");
//        } else System.out.println("You failed");









        sc.close();

    }
}