public class Util{
    public static String inputHex(Scanner sc){
        while(true){
            System.out.print("Enter hexadecimal number with Capital alphabets: "); 
            try{
                String str = sc.next(); 
                for(int i = 0;i<str.length();i++){
                    char c = str.getChar(i); 
                    if ((ch < '0' || ch > '9') && (ch < 'A' || ch > 'F')){
                        System.out.println("Enter valid Number"); 
                        break; 
                    }
                }
                return str; 
            }catch(IllegalArgumentException e){
                System.out.println("Enter valid hexadecimal number"); 
            }
        }
    }
}