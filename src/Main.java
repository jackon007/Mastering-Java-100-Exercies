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


//        31# asks for the name of a day of the week and displays whether it is a weekday (Monday to Friday) or a weekend day (Saturday and Sunday).
//        System.out.println("Enter the name of day ... Example : Monday or Tuesday ...");
//        String day=sc.nextLine().toLowerCase();
//
//        switch (day){
//            case "monday":
//                System.out.println("It is weekday");
//                break;
//            case "tuesday":
//                System.out.println("It is weekday");
//                break;
//            case "wednesday":
//                System.out.println("It is weekday");
//                break;
//            case "thursday":
//                System.out.println("It is weekday");
//                break;
//            case "friday":
//                System.out.println("It is weekday");
//                break;
//            case "saturday":
//                System.out.println("It is weekend day");
//                break;
//            case "sunday":
//                System.out.println("It is weekend day");
//                break;
//            default:
//                System.out.println("Check your input !!!");
//        }

//        32#  asks for a person's height and weight and  calculates their body mass index (BMI), displaying the corresponding
//        category (underweight, normal weight, overweight, obese, severely obese).
//        System.out.println("Enter your height ...");
//        double height=sc.nextDouble();
//        System.out.println("Enter your weight ...");
//        double weight=sc.nextDouble();
//        double bmi = weight / (height* height);
//        System.out.println("Your BMI is: " + bmi);
//
//        if (bmi < 16) {
//            System.out.println("Category: Severely under "+ weight);
//        } else if (bmi >= 16 && bmi < 17) {
//            System.out.println("Category: Underweight");
//        } else if (bmi >= 17 && bmi < 18.5) {
//            System.out.println("Category: Mildly under-weight");
//        } else if (bmi >= 18.5 && bmi < 25) {
//            System.out.println("Category: Normal weight");
//        } else if (bmi >= 25 && bmi <30) {
//            System.out.println("Category: Overweight");
//        } else if (bmi >= 30 && bmi < 35) {
//            System.out.println("Category: Obese Class I (Mod-erately obese)");
//        } else if (bmi >= 35 && bmi < 40) {
//            System.out.println("Category: Obese Class II (Se-verely obese");
//        }else {
//            System.out.println("Category: Obese Class III (Very severely obese)");
//        }


//        33# asks for an integer and checks if it is divisible by 3 and 5 at the same time.
//        System.out.println("Enter the number ...");
//        int num=sc.nextInt();
//        if(num%3==0 && num%5==0){
//            System.out.println("It is divisible by 3 and 5");
//        }else System.out.println("It is not divisible !");



//        34# person's age and displays whether they are a child (0-12 years old), teenager
//        (13-17 years old), adult (18-59 years old), or elderly (60 years old or older).
//        System.out.println("Enter the age ...");
//        int age=sc.nextInt();
//        if(age>=0 && age<=12){
//            System.out.println("You are a child");
//        } else if (age>=13 && age<=17) {
//            System.out.println("You are a teenager");
//        } else if (age>=18 && age<=59) {
//            System.out.println("You are a adult");
//        } else if (age>=60) {
//            System.out.println("You are elderly");
//        }
//        else System.out.println("Check your input !!!");


//        35# two numbers and displays if the first is divisible by the second
//        System.out.println("Enter the first ");
//        int num1=sc.nextInt();
//        System.out.println("Enter the second ");
//        int num2=sc.nextInt();
//        int result1 =num1%num2;
//        int result2=num2%num1;
//        if (result1==0){
//            System.out.println("1st one is divisible by second one");
//        }else if (result2==0){
//            System.out.println("2nd one is divisible by 1st one");
//        }
//        else System.out.println("they are not divisble");



//        36# displays the numbers 1 through 10 using a loop.
//        for(int i=1;i<=10;i++){
//            System.out.print(i+" ");
//        }



//        37. displays all numbers from 1 to 100
//        for(int i=1;i<=100;i++){
//            System.out.print(i+" ");
//        }



//        38. displays all even numbers from 1 to 100
//        int num=2;
//        while (num<100){
//                System.out.print(num+" ");
//            num+=2;
//        }



//        39. Write a program that displays even numbers 1 to 50 and odd numbers 51 to 100 using a repeating loop.
//        System.out.print("Even numbers between 1 and 50 : ");
//        for (int i=1;i<=50;i++){
//            if( i%2==0){
//                System.out.print(i+" ");
//            }
//        }
//        System.out.println();
//        System.out.print("Odd numbers between 51 and 100 : ");
//        for (int i=51;i<100;i++){
//            if( i%2!=0){
//                System.out.print(i+" ");
//            }
//        }


//        40# Create a program that prompts the user for a number and displays the table of that number using a loop.
//        System.out.println("Enter the number ...");
//        int num=sc.nextInt();
//        int i=0;
//        int result=0;
//        while (i<=10){
//            result=num*i;
//            System.out.println(num+" x "+i+" = "+result);
//            i++;
//        }



//        41. Create a program that displays the table of all numbers from 1 to 10.
//        for(int i=1;i<=10;i++){
//            for (int j=1;j<=10;j++){
//                System.out.println(i+" x "+j+" = "+i*j);
//            }
//            System.out.println();
//        }



//        42. Write a program that asks the user for a number N and displays the sum of all numbers from 1 to N.
//        System.out.println("Enter the number ... ");
//        int num=sc.nextInt();
//
//        int i=1;
//        int sum=0;
//        while (i<=num){
//            sum+=i;
//            i++;
//        }
//        System.out.println("The sum of numbers from 1 to N : "+sum);


//        43. Write a program that calculates and displays the sum of even numbers from 1 to 100 using a repeating loop.
//        int sum=0;
//        int i=0;
//        while (i<=100){
//            sum+=i;
//            i+=2;
//        }
//        System.out.println("The sum of even numbers from 1 to 100 : "+sum);



//        44. Write a program that calculates and displays the value of the power of a number
//        entered by the user raised to an exponent also entered by the user, using repetition loops.
//        System.out.println("Enter the base number ...");
//        int base= sc.nextInt();
//        System.out.println("Enter the exponent number ...");
//        int exponent=sc.nextInt();
//        int result=1;
//        for (int i=1;i<=exponent;i++){
//            result*=base;
//        }
//        System.out.println("Result : "+result);


//        45. Write a program that asks the user for a number N and says whether it is prime or not.
//        System.out.println("Enter the number ...");
//        int num=sc.nextInt();
//        int count=0;
//        for (int i=1;i<=num;i++){
//            if (num==1){
//                System.out.println(num +" is not reachable");
//                break;
//            }
//            else if (num%i==0){
//                count++;
//            }
//        }
//        if (count>2){
//            System.out.println("Number is not prime !!!");
//        }else System.out.println("THe number is prime !!!");

//        46. Write a program that prompts  the user for a number N and displays  all prime numbers less than N.
//        System.out.println("Enter the number ...");
//        int num=sc.nextInt();
//        if(num==2){
//            System.out.println(num);
//        }
//        for( int i=2;i<num;i++){
//            boolean isPrime=true;
//            for (int j=2;j<=Math.sqrt(i);j++){
//                if(i%j==0){
//                    isPrime=false;
//                    break;
//                }
//            }
//            if (isPrime){
//                System.out.println(i+" ");
//            }
//        }


//        47. Create a program that displays the first N prime numbers, where Nis informed by the user, using a loop.
//        System.out.println("Enter the number ...");
//        int num=sc.nextInt();
//        int count=0;
//        int i=2;
//        while (count!=num){
//            boolean isPrime=true;
//
//            for(int j=2;j<=Math.sqrt(i);j++){
//                if(i%j==0){
//                    isPrime=false;
//                }
//            }
//            if (isPrime){
//                count++;
//                System.out.println(i);
//            }
//            i++;
//        }


//        48# Create a program that displays the first N first perfect squares, where Nis informed by the user, using a loop.
//        System.out.println("Enter the number ...");
//        int num=sc.nextInt();
//        for(int i=1;i<=num;i++){
//            int result=1;
//            result=i*i;
//            System.out.println(result);
//        }

//        49. Write a program that prompts the user for two numbers A and B and displays all numbers between A and B.
//        System.out.println("Enter A number ...");
//        int a=sc.nextInt();
//        System.out.println("Enter B number ...");
//        int b=sc.nextInt();
//        if (a>b){
//            while (a>=b){
//                System.out.println(b);
//                b++;
//            }
//        }
//        else  while (a<=b){
//            System.out.println(a);
//            a++;
//        }
//        2nd version
        //        if (a <= b) {
//            for (int i = a; i <= b; i++) {
//                System.out.print(i +" ");
//            }
//        } else {
//            for (int i = a; i >= b; i--) {
//                System.out.print(i + "");
//            }
//        }


//        50. Write a program that reads numbers from the user until a negative number is entered, and prints the sum of the positive numbers.
//        int sum=0;
//        int nums=0;
//        while (nums>=0){
//            sum+=nums;
//            System.out.println("Enter a number ...");
//            nums=sc.nextInt();
//        }
//        System.out.println(sum);


//        51. Write a program that prompts the user for a number and displays the Fibonacci sequence up to the given number using a repeating loop.
//        System.out.println("Enter the number ...");
//        int n=sc.nextInt();
//        int nextNum=0;
//        int num1=0;
//        int num2=1;
//        while (num1<=n){
//            System.out.println(num1);
//            nextNum=num1+num2;
//            num1=num2;
//            num2=nextNum;
//        }



//        52. Write a program that reads numbers from the user until zero is entered, and displays the average of the numbers entered.
//        int sum=0;
//        int count=0;
//        while (true){
//            System.out.println("Enter a number ...");
//            int number=sc.nextInt();
//            if (number==0){
//                break;
//            }
//            sum+=number;
//            count++;
//        }
//        double avg=sum/count;
//        System.out.println(avg);












        sc.close();

    }
}