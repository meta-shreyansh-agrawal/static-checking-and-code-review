public class HexCalc{
    public int hexToDec(String hex){
        // convert hex to dec
    }
    public String decToHex(int dec){
        // convert dec to hex
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