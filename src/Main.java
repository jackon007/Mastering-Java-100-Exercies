import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
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


//        53.  prompts the user for a list of numbers, until the user types the number zero, and displays the largest and smallest numbers in the list.
//            int largest=Integer.MIN_VALUE;
//            int smallest=Integer.MAX_VALUE;
//           while (true){
//               System.out.println("Enter a number...");
//               int number= sc.nextInt();
//               if (number==0){
//                   break;
//               }
//               if (number>largest){
//                   largest=number;
//               }
//               if (number<smallest){
//                   smallest=number;
//               }
//           }
//        System.out.println("Largest number is :" +largest);
//        System.out.println("The smallest number is : "+smallest);

//        54. Write a program that prompts the user for a sentence and displays the number of vowels in the sentence.
//        System.out.println("Enter a sentence ...");
//        String sentence=sc.nextLine().toLowerCase();
//        int count=0;
//        for (int i=0;i<sentence.length();i++){
//            char ch=sentence.charAt(i);
//            if (ch =='a'||ch =='e'||ch =='i'||ch=='o'||ch =='u')
//                count++;
//        }
//        System.out.println("The count of vowels : "+count);


//        55. Write a program that prompts the user for a number and displays its divisors.
//        System.out.println("Enter the number ...");
//        int number= sc.nextInt();
//        System.out.println("its divisors: ");
//        for (int i=1;i<=number;i++){
//            if (number%i==0){
//                System.out.println(i);
//            }
//        }


//        56. Write a program that determines the lowest common multiple (LCM) between two numbers entered by the user.
//        System.out.println("Enter the 1st number ...");
//        int a= sc.nextInt();
//        System.out.println("Enter the 2nd number ...");
//        int b= sc.nextInt();
//        System.out.println("LCM for "+a +" , "+b+" : ");
//        int i=0;
//        if(b%a==0){
//            System.out.println(b);
//        }else if (a%b==0){
//            System.out.println(a);
//        }else
//            if (a>b){
//            while (true) {
//                i++;
//                int result=a*i;
//                if (result%b==0){
//                    System.out.println(result);
//                    break;
//                }
//
//            }
//            }else if (a<b) {
//                while (true) {
//                    i++;
//                    int result = b * i;
//                    if (result % a == 0) {
//                        System.out.println(result);
//                        break;
//                    }
//                }
//            }


//       57# Write a program that determines the greatest common divisor (GCD) between two numbers entered by the user.
//        System.out.println("Enter the 1st number ...");
//        int a= sc.nextInt();
//        System.out.println("Enter the 2nd number");
//        int b= sc.nextInt();
//
//        while (b!=0){
//            int temp=b;
//            b=a%b;
//            a=temp;
//        }
//        System.out.println("GCD :"+a);


//        61#  Create a program that reads an array of integers and displays the sum of all the elements.
//        System.out.println("Enter the size of array");
//        int size=sc.nextInt();
//        int arr[]=new int[size];
//        for (int i=0;i<size;i++){
//            System.out.println("Enter the element of array ...");
//            arr[i]= sc.nextInt();
//        }
//        int sum=0;
//        for(int n:arr){
//            sum+=n;
//        }
//        System.out.println("The sume of elements of array is : " +sum);

//        62. Write a program that reads an array of integers and displays the largest element in the array.
//        System.out.println("Enter the size of array");
//        int size= sc.nextInt();
//        int arr[]=new int[size];
//
//        for(int i=0;i<size;i++){
//            System.out.println("Enter the number of Array ...");
//            arr[i]=sc.nextInt();
//        }
//        int largest=0;
//        for(int i=0;i<size-1;i++){
//            if (arr[i]>arr[i+1]){
//                largest=arr[i];
//                arr[i]=arr[i+1];
//                arr[i+1]=largest;
//            }
//        }
//        System.out.println(largest);

//        63# Write a program that reads an array of integers and displays the average of the elements.
//        System.out.println("Enter the size of array");
//        int size= sc.nextInt();
//        int arr[]=new int[size];
//        for(int i=0;i<size;i++){
//            System.out.println("Enter the number of Array ...");
//            arr[i]=sc.nextInt();
//        }
//        int sum=0;
//        for (int i=0;i<size;i++){
//            sum+=arr[i];
//        }
//        double avg=sum/size;
//        System.out.println("Average of elements of array is :" +avg);

//        64. Create a program that reads two vectors of integers of the same size and
//        displays a new vector with the sum of the corresponding elements of the two vectors.
//        System.out.println("Enter the size of arrays");
//        int size= sc.nextInt();
//        int arr1[]=new int[size];
//        for(int i=0;i<size;i++){
//            System.out.println("Enter the number of 1st Array ...");
//            arr1[i]=sc.nextInt();
//        }
//
//        int arr2[]=new int[size];
//        for(int i=0;i<size;i++){
//            System.out.println("Enter the number of 2nd Array ...");
//            arr2[i]=sc.nextInt();
//        }
//        System.out.println("The elements of sum of the corresponding elements of the two vectors ");
//        int arr3[] =new int[size];
//        for (int i=0;i<size;i++){
//            arr3[i]=arr1[i]+arr2[i];
//            System.out.println(arr3[i]);
//        }

//        #65. Write a program that reads an array of integers and checks if they are in ascending order.
//        System.out.println("Enter the size of array");
//        int size= sc.nextInt();
//        int arr[]=new int[size];
//        for(int i=0;i<size;i++){
//            System.out.println("Enter the number of Array ...");
//            arr[i]=sc.nextInt();
//        }
//        boolean ascendingOrder=true;
//        for(int i=0;i<size-1;i++){
//            if (arr[i]>arr[i+1]){
//                ascendingOrder=false;
//                break;
//            }
//        }
//        if (ascendingOrder){
//            System.out.println("Array of integers are in ascending order");
//        }else System.out.println("They are not");

//        66. Write a program that reads an array of integers and displays the elements in reverse order.
//        System.out.println("Enter the size of array");
//        int size= sc.nextInt();
//        int arr[]=new int[size];
//        for(int i=0;i<size;i++){
//            System.out.println("Enter the number of Array ...");
//            arr[i]=sc.nextInt();
//        }
//
//        System.out.println("Reverse of arrray is :");
//        for(int i=size-1;i>=0;i--){
//            System.out.println(arr[i]+" ");
//        }

//        68. Write a program that reads an array of integers and displays how many times a specific number appears in the array.
//        System.out.println("Enter the size of array");
//        int size= sc.nextInt();
//        int arr[]=new int[size];
//        for(int i=0;i<size;i++){
//            System.out.println("Enter the number of Array ...");
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("Enter the specific number...");
//        int specificNumber= sc.nextInt();
//
//        int count=0;
//        for (int n:arr){
//            if (n==specificNumber){
//                count++;
//            }
//        }
//        System.out.println(count+ " times appear in array");


//        69. Write a program that reads two arrays of integers with the same size and displays a new array with the elements
//        resulting from the multiplication of the corresponding elements of the two arrays.
//        System.out.println("Enter the size of arrays");
//        int size= sc.nextInt();
//        int array1[]=new int[size];
//        for(int i=0;i<size;i++){
//            System.out.println("Enter the number of 1st Array ...");
//            array1[i]=sc.nextInt();
//        }
//
//        int array2[]=new int[size];
//        for(int i=0;i<size;i++){
//            System.out.println("Enter the number of 2nd Array ...");
//            array2[i]=sc.nextInt();
//        }
//        System.out.println("Elements of array that created by multiplication of the corresponding elements of the two arrays");
//        int finalArray[]=new int[size];
//        for(int i=0;i<size;i++){
//            finalArray[i]=array1[i]*array2[i];
//            System.out.println(finalArray[i]);
//        }


//        70. Create a program that reads an array of integers and checks that all elements are even.
//        System.out.println("Enter the size of arrays");
//        int size= sc.nextInt();
//        int array[]=new int[size];
//        for(int i=0;i<size;i++){
//            System.out.println("Enter the number of  Array ...");
//            array[i]=sc.nextInt();
//        }
//        boolean allEven=true;
//        for (int a:array){
//            if (a%2!=0){
//                allEven=false;
//                break;
//            }
//        }
//        if (allEven){
//            System.out.println("Elements of Array are even");
//        }else System.out.println("Elements of Array are not even");


//        #Strings

//        71. Create a program that reads two words and concatenates them, displaying the resulting word.
//        System.out.println("Enter 1st word...");
//        String text1=sc.nextLine();
//        System.out.println("Enter 2nd word...");
//        String text2=sc.nextLine();
//        String text3=text1+text2;
//        System.out.println(text3);


//        72. Write a program that takes a word and displays each letter separately.
//        System.out.println("Enter word...");
//        String word=sc.nextLine();
//        int size=word.length();
//        for (int i=0;i<size;i++){
//            char letter=word.charAt(i);
//            System.out.println(letter);
//        }


//        73. Create a program that takes a sentence and replaces all the letters "a" with "e"
//        System.out.println("Enter the sentence...");
//        String sentence=sc.nextLine();
//        char[] charArray=sentence.toCharArray();
//        for (int i=0;i<charArray.length;i++){
//            if (charArray[i]=='a'){
//                charArray[i]='e';
//            }
//        }
//        String modifySentence=new String(charArray);
//        System.out.println(modifySentence);


//        74. Write a program that receives a name and checks that it starts with the letter "A".
//        System.out.println("Enter the name ...");
//        String name=sc.nextLine();
//        boolean startWithA=name.toUpperCase().startsWith("A");
//        if (startWithA){
//            System.out.println("it starts with A");
//        }else System.out.println("it does not start with A");


//        75. Write a program that reads a word and checks if it is a palindrome (if it can be read backwards the same way).
//        System.out.println("Enter the word ...");
//        String word=sc.nextLine();
//        int left=0;
//        int right=word.length()-1;
//        boolean isPalindrome=true;
//        while (left<right){
//            if (word.charAt(left)!=word.charAt(right)){
//                isPalindrome=false;
//                break;
//            }
//            left++;
//            right--;
//        }
//        if (isPalindrome){
//            System.out.println("Word is palindrome");
//        }else System.out.println("It is not");

//        76. Create a program that reads two words and checks if the second word is an anagram of the first.
//        System.out.println("Enter the 1st word");
//        String word1= sc.nextLine();
//        System.out.println("Enter the 2nd word");
//        String word2= sc.nextLine();
//        word1=word1.replaceAll("\\s","").toLowerCase();
//        word2=word2.replaceAll("\\s","").toLowerCase();
//        char[] wordArray1=word1.toCharArray();
//        char[] wordArray2=word2.toCharArray();
//        Arrays.sort(wordArray1);
//        Arrays.sort(wordArray2);
//        boolean isAnagram=Arrays.equals(wordArray1,wordArray2);
//        if (isAnagram){
//            System.out.println("Words are anagram of each");
//        }else System.out.println("They are not");
//


//        77. Write a program that takes a full name and displays only the first name
//        System.out.println("Enter the full name...");
//        String fullName=sc.nextLine();
//        String nameParts[]=fullName.trim().split("\\s+");
//        String firstName=nameParts[0];
//        System.out.println(firstName);



//        78. Make a program that receives a sentence and displays the amount of blank spaces present in it.
//        System.out.println("Enter the sentence");
//        String sentence=sc.nextLine();
//        char letter[]=sentence.toCharArray();
//        int count=0;
//        for (char l:letter){
//            if (l==' ' || l=='\t'){
//                count++;
//            }
//        }
//        System.out.println("The number of blank spaces : "+count);


//        79. Create a program that reads a word and displays the number of vowels present in it.
//        System.out.println("Enter the sentence");
//        String sentence=sc.nextLine();
//        char letter[]=sentence.toLowerCase().toCharArray();
//        int count=0;
//        for (char l:letter){
//            if (l=='a' || l=='o' || l=='i'||l=='u'||l=='e'){
//                count++;
//            }
//        }
//        System.out.println("The number of vowels  : "+count);


//        80. Write a program that takes a full name and displays the last name (last name) first.
//        System.out.println("Enter the name");
//        String sentence=sc.nextLine();
//
//        String parts[]=sentence.trim().split("\\s+");
//        System.out.println("Last Name : "+parts[1]);



//        81. Write a program that fills a 3x3 matrix with values entered by the user and displays the sum of the main diagonal values.
//        System.out.println("Enter the elements of matric 3x3...");
//        int matrix[][]=new int[3][3];
//        for (int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                System.out.println("Enter the number of the place : "+"["+(i+1)+","+(j+1)+"]");
//                int number= sc.nextInt();
//                matrix[i][j]=number;
//            }
//        }
//
//        for(int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        int sum=0;
//        for(int i=0;i<3;i++){
//            sum+=matrix[i][i];
//        }
//        System.out.println("The sum of main diagonal values : "+ sum);

//        82. Write a program that fills a 4x4 matrix with random values and displays the transposed matrix.
//        int matrix[][]=new int[4][4];
//        Random random=new Random();
//        System.out.println("Real 4x4 Matrix :");
//        for (int i=0;i<4;i++){
//            for (int j=0;j<4;j++){
//                matrix[i][j]=random.nextInt(100);
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        int transposedMatrix[][]=new int[4][4];
//        System.out.println("Transposed of 4x4 Matrix :");
//        for (int i=0;i<4;i++){
//            for (int j=0;j<4;j++){
//                transposedMatrix[i][j]=matrix[j][i];
//                System.out.print(transposedMatrix[i][j]+" ");
//            }
//            System.out.println();
//        }

//        83. Write a program that reads two 2x2 matrices and displays the sum of the two matrices.

//        int firstMatrix[][]=new int[2][2];
//        int secondMatrix[][]=new int[2][2];
//        int sumMatrix[][]=new int[2][2];
//        System.out.println("Enter the elements of first matrix");
//            for (int i=0;i<2;i++){
//                for (int j=0;j<2;j++){
//                    System.out.println("Enter the number of the place : "+"["+(i+1)+","+(j+1)+"]");
//                    firstMatrix[i][j]= sc.nextInt();
//                }
//            }
//
//        System.out.println("Enter the elements of second matrix");
//        for (int i=0;i<2;i++){
//            for (int j=0;j<2;j++){
//                System.out.println("Enter the number of the place : "+"["+(i+1)+","+(j+1)+"]");
//                secondMatrix[i][j]= sc.nextInt();
//            }
//        }
//
//        for (int i=0;i<2;i++){
//            for (int j=0;j<2;j++){
//                sumMatrix[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
//                System.out.print(sumMatrix[i][j]+" ");
//            }
//            System.out.println();
//        }

//        84. Write a program that fills a 5x5 matrix with integers and displays the largest value in the matrix and its position.
//                int matrix[][]=new int[5][5];
//        System.out.println("Enter the elements of matrix ...");
//
//        for (int i=0;i<5;i++){
//            for (int j=0;j<5;j++){
//                System.out.println("Enter the matric of ["+(i+1)+","+(j+1)+"]");
//                matrix[i][j]= sc.nextInt();
//            }
//        }
//
//        int largest=matrix[0][0];
//        int row=0;
//        int column=0;
//        for (int i=0;i<5;i++){
//            for (int j=0;j<5;j++){
//               if (matrix[i][j]>=largest){
//                   largest=matrix[i][j];
//                   row=i;
//                   column=j;
//               }
//            }
//        }
//        System.out.println("The largest values is : "+largest);
//        System.out.println("Its position ["+row+","+column+"]");

//        85. Write a program that reads a 3x3 matrix and calculates the average of the values present in the even positions (sum
//        of the even indices) of the matrix.
//        int matrix[][]=new int[3][3];
//        System.out.println("Enter the elements of matrix ...");
//
//        for (int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                System.out.println("Enter the matric of ["+(i+1)+","+(j+1)+"]");
//                matrix[i][j]= sc.nextInt();
//            }
//        }
//
//        int sum=0;
//        int count=0;
//        for (int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//               if ((j+j)%2==0){
//                   sum+=matrix[i][j];
//                   count++;
//               }
//            }
//        }
//        double avg=(double) sum/count;
//        System.out.println("The sum of numbers " +avg);


//        86. Write a program that fills a 4x4 matrix with random numbers and displays the sum of the values present in each row and in each column.
//        int matrix[][]=new int[4][4];
//        Random random=new Random();
//        for (int i=0;i<4;i++){
//            for (int j=0;j<4;j++){
//                matrix[i][j]=random.nextInt(10);
//            }
//        }
//
//
//        for (int i=0;i<4;i++){
//           int sumOfRow=0;
//            for (int j=0;j<4;j++){
//                sumOfRow+=matrix[i][j];
//            }
//            System.out.println("The sum of ROW: "+(i+1)+" is "+sumOfRow);
//        }
//
//        for (int j=0;j<4;j++){
//            int sumOfColumn=0;
//            for (int i=0;i<4;i++){
//               sumOfColumn+=matrix[i][j];
//            }
//            System.out.println("The sum of ROW: "+(j+1)+" is "+sumOfColumn);
//        }


//        87. Write a program that reads a 3x3 matrix and calculates the determinant of the matrix.
//        int matrix[][]=new int[3][3];
//        System.out.println("Enter the elements of matrix ...");
//
//        for (int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                System.out.println("Enter the matric of ["+(i+1)+","+(j+1)+"]");
//                matrix[i][j]= sc.nextInt();
//            }
//        }
//
//        int a=matrix[0][0];
//        int b=matrix[0][1];
//        int c=matrix[0][2];
//        int d=matrix[1][0];
//        int e=matrix[1][1];
//        int f=matrix[1][2];
//        int g=matrix[2][0];
//        int h=matrix[2][1];
//        int i=matrix[2][2];
//
//        int determinant=a*(e*i-h*f)-b*(d*i-g*f)+c*(d*h-e*g);
//        System.out.println("The determinant of matrix : "+determinant);



        sc.close();
    }

}