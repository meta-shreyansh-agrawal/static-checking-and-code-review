public class HexCalc{
    public int hexToDec(String hex){
        int dec = 0;
        int multiplier = 1; 
        for(int i = hex.length()-1;i>=0;i--){
            char c = hex.charAt(i); 
            if(c>="0"&&c<="9"){
                dec += (c - 48)*multiplier; 
            }else if(c>="A"&&c<"F"){
                dec += (c-55)*multiplier; 
            }else{
                throw new IllegalArgumentException("Enter valid hexadecimal Number"); 
            }
            multiplier=multiplier*multiplier; 
        }
        return dec; 
    }
    public String decToHex(int dec){
        String hex = ""; 
        while(dec!=0){
            int digit = dec%16; 
            if(digit > 9){
                digit += 55; 
            }
            char c = char(digit);
            hex = c + hex;
            digit = digit/16;  
        }
        return hex; 
    }
    public String addHex(String first,String second){
        return decToHex(hexToDec(first)+hexToDec(second));
    }
    public String subtractHex(String first,String second){
        int firstDec = hexToDec(first);
        int secondDec = hexToDec(second);
        if(secondDec>firstDec)throw new ArithmeticException("First Can't be greater than Second"); 
        return decToHex(firstDec - secondDec);
    }
    public String multiplyHex(String first,String second){
        return decToHex(hexToDec(first)*hexToDec(second));
    }
    public String divideHex(String first,String second){
        int secondDec = hexToDec(second); 
        if(secondDec==0)throw new ArithmeticException("divisor can't be 0"); 
        return decToHex(hexToDec(first)/secondDec);
    }
    public boolean isGreater(String first,String second){
        return hexToDec(first)>hexToDec(second); 
    }
    public boolean isEqual(String first,String second){
        return hexToDec(first)==hexToDec(second); 
    }
    public boolean isSmaller(String first,String second){
        return hexToDec(first)<hexToDec(second); 
    }
    
}