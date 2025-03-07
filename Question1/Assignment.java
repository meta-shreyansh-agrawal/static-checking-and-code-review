import java.util.Scanner; 
public class Assignment{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        HexCalc cal = new HexCalc(); 
        
        int choice = 1; 
        String first = "";
        String second = "";
        int no = 0; 
        while(true){
            System.out.println("Enter Choice\n1)Add Hex Numbers\n2)Subtract Hex Numbers\n3)Multiply Hex Numbers\n4)Divide Hex Numbers\n5)Compare Greater than\n6)Compare Equals\n7)Compate Smaller than\n8)Convert decimal to hex\n9)Convert hex to decimal\n0)Exit"); 
            choice = Util.inputNumberInRange(sc,0,9); 
            switch(choice){
                case 1: 
                    System.out.print("Enter first number: "); 
                    first = Util.inputHex(sc);
                    System.out.print("Enter second number: "); 
                    second = Util.inputHex(sc);
                    System.out.println("Addition of these is: "+cal.addHex(first,second)); 
                    break; 
                case 2: 
                    while(true){
                        try{
                            System.out.print("Enter first number: "); 
                            first = Util.inputHex(sc);
                            System.out.print("Enter second number: "); 
                            second = Util.inputHex(sc);
                            System.out.println("Subtraction of these is: "+cal.subtractHex(first,second)); 
                            break; 
                        }catch(ArithmeticException e){
                            System.out.println(e.getMessage()); 
                        }
                    }
                    break; 
                case 3: 
                    System.out.print("Enter first number: "); 
                    first = Util.inputHex(sc);
                    System.out.print("Enter second number: "); 
                    second = Util.inputHex(sc);
                    System.out.println("Multiplication of these is: "+cal.multiplyHex(first,second));
                    break; 
                case 4: 
                    while(true){
                        try{
                            System.out.print("Enter first number: "); 
                            first = Util.inputHex(sc);
                            System.out.print("Enter second number: "); 
                            second = Util.inputHex(sc);
                            System.out.println("Division of these is: "+cal.divideHex(first,second)); 
                            break; 
                        }catch(ArithmeticException e){
                            System.out.println(e.getMessage()); 
                        }
                    }
                    break; 
                case 5: 
                    System.out.print("Enter first number: "); 
                    first = Util.inputHex(sc);
                    System.out.print("Enter second number: "); 
                    second = Util.inputHex(sc);
                    System.out.println("First is Greater than second: "+cal.isGreater(first,second)); 
                    break; 
                case 6: 
                    System.out.print("Enter first number: "); 
                    first = Util.inputHex(sc);
                    System.out.print("Enter second number: "); 
                    second = Util.inputHex(sc);
                    System.out.println("First is Equal than second: "+cal.isEqual(first,second)); 
                    break; 
                case 7: 
                    System.out.print("Enter first number: "); 
                    first = Util.inputHex(sc);
                    System.out.print("Enter second number: "); 
                    second = Util.inputHex(sc);
                    System.out.println("First is Smaller than second: "+cal.isSmaller(first,second)); 
                    break; 
                case 8: 
                    System.out.print("Enter number: "); 
                    no = Util.inputWholeNumber(sc);
                    System.out.println("Hex is: "+cal.decToHex(no)); 
                    break; 
                case 9: 
                    System.out.print("Enter hex: "); 
                    first = Util.inputHex(sc);
                    System.out.println("Dec is: "+cal.hexToDec(first)); 
                    break; 
                case 0: 
                    sc.close(); 
                    return; 
            }
        }
    }
}