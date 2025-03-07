import java.util.Scanner; 
public static class Util{

    public int inputNaturalNumber(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                int num = sc.nextInt(); 
                if(num<1){
                    System.out.println("Enter number greater than 0"); 
                }else{
                    sc.close(); 
                    return num; 
                }
            }catch(){
                System.out.println("Enter valid Whole Number"); 
            }
        }
        sc.close(); 
        return 0;
    }

    public int inputWholeNumber(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                int num = sc.nextInt(); 
                if(num<0){
                    System.out.println("Enter number greater than 0"); 
                }else{
                    sc.close(); 
                    return num; 
                }
            }catch(){
                System.out.println("Enter valid Whole Number"); 
            }
        }
        sc.close(); 
        return 0;
    }




}