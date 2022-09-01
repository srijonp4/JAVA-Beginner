public class CharBoolean {

    public static void main(String[] args){

        char myChar = 'S' ;//single character only in single quote it occupies 16 bits or 2 bytes of memory and it stores unicode characters by unicode we can represent every language .
        System.out.println(myChar);
        char myUnicode = '\u00A9'; 
        // to use unicode we have to use "backslash u"
        System.out.println(myUnicode);

        boolean myTrueValue = true ;
        boolean myFalseValue = false ;
        System.out.println(myTrueValue);
        System.out.println(myFalseValue);
        

    }
    
}
