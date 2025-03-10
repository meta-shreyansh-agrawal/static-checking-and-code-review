import java.util.Scanner; 
public class Util{

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
                sc.nextLine();
            }
        }
    }
    
    public static String inputHex(Scanner sc){
        String str = "";
        boolean validated = true; 
        while(true){
            System.out.print("Enter hexadecimal number with Capital alphabets: "); 
            try{
                str = sc.next(); 
                validated = true; 
                for(int i = 0;i<str.length();i++){
                    char c = str.charAt(i); 
                    if ((c < '0' || c > '9') && (c < 'A' || c > 'F')){
                        System.out.println("Enter valid Number"); 
                        validated = false; 
                        break; 
                    }
                }
                if(validated)return str; 
            }catch(IllegalArgumentException e){
                System.out.println("Enter valid hexadecimal number"); 
                sc.nextLine();
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
                sc.nextLine();
            }
        }
    }
}
