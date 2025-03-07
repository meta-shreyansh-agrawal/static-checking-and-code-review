import java.util.Scanner; 
public class Util{

    public static int inputNaturalNumber(Scanner sc){
        while(true){
            try{
                int num = sc.nextInt(); 
                if(num<1){
                    System.out.println("Enter number greater than 0"); 
                }else{
                    return num; 
                }
            }catch(IllegalArgumentException e){
                System.out.println("Enter valid Natural Number"); 
            }
        }
    }

    public static int inputWholeNumber(Scanner sc){
        while(true){
            try{
                int num = sc.nextInt(); 
                if(num<0){
                    System.out.println("Enter number greater than or equals to 0"); 
                }else{
                    return num; 
                }
            }catch(IllegalArgumentException e){
                System.out.println("Enter valid Whole Number"); 
            }
        }
    }

    public static int inputNumberInRange(Scanner sc,int start,int end){
        while(true){
            try{
                int num = sc.nextInt(); 
                if(num<start||num>end){
                    System.out.println("Enter number between "+start+" and "+end); 
                }else{
                    return num; 
                }
            }catch(IllegalArgumentException e){
                System.out.println("Enter valid Number"); 
            }
        }
    }




}