import java.util.Scanner;
public class Assignment{
    public static void main(String[] args){
        int base;
        System.out.print("Enter valid base between 2 to 35: ");
        Scanner sc = new Scanner(System.in);
        base = sc.nextInt();
        while(base<2||base>35){
            System.out.print("Enter valid base between 2 to 35: ");
            base = sc.nextInt();
        }
        Calculator calc = new Calculator(base);
        int choice = 1;
        while(choice!=0){
            System.out.println("Enter your choice\n1)Add\n2)Subtract\n3)Multiply\n4)Divide\n5)Greater than\n6)Equals to\n7)Less than\n8)convert to decimal\n9)Convert decimal to base no\n0)Exit");
            choice = sc.nextInt();
            if(choice<0||choice>9){
                System.out.print("Enter valid Choice");
                continue;
            }
            System.out.print("Enter first Number: ");
            String first = sc.next();
            String second = "";
            if(!(choice==8||choice==9)){
                System.out.print("Enter Second Number: ");
                second = sc.next();
            }
            String result;
            boolean bool;
            int num;
            switch(choice){
                case 1:
                     result = calc.add(first,second);
                    System.out.println("Result is: "+result);
                case 2:
                     result = calc.subtract(first,second);
                    System.out.println("Result is: "+result);
                case 3:
                     result = calc.multiply(first,second);
                    System.out.println("Result is: "+result);
                case 4:
                     result = calc.divide(first,second);
                    System.out.println("Result is: "+result);
                case 5:
                     bool = calc.isGreater(first,second);
                    System.out.println("Result is: "+bool);
                case 6:
                     bool = calc.isEqual(first,second);
                    System.out.println("Result is: "+bool);
                case 7:
                     bool = calc.isSmaller(first,second);
                    System.out.println("Result is: "+bool);
                case 8:
                     num = calc.numToDec(first);
                    System.out.println("Result is: "+num);
                case 9:
                     result = calc.decToNum(Integer.parseInt(first));
                    System.out.println("Result is: "+result);
                case 0:
                    sc.close();
                    return;
                default:
                    System.out.println("Enter valid choice");
            }


        }
        sc.close();
    }  
}


class Calculator{


    int base;


    Calculator(int base){
        if(base<2||base>35){
            throw new IllegalArgumentException("Enter valid Base");
        }
        this.base = base;
    }


    boolean validateNumber(String number){
        // validate number according to base
        return true;
    }


    int numToDec(String number){
        // convert number to decimal
        return Integer.parseInt(number);
    }


    String decToNum(int decimal){
        // convert decimal to number
        return Integer.toString(decimal);
    }


    String add(String num1,String num2){
        // add both numbers
        return num1;
    }


    String subtract(String num1,String num2){
        // subtract both numbers
                return num1;


    }


    String multiply(String num1,String num2){
        // multiply both numbers
                return num1;


    }


    String divide(String num1,String num2){
        // divide numbers
                return num1;


    }
    boolean isGreater(String num1,String num2){
        // divide numbers
                return true;


    }
    boolean isEqual(String num1,String num2){
        // divide numbers
                return true;


    }
    boolean isSmaller(String num1,String num2){
        // divide numbers
                return true;


    }
}
 

