public class Tester {
    public Tester(){
    }
    public static void main(String[] args){

        String string1 = "Hello";
        String string2 = "How are you?";
        char charArray[] = new char[4];

        //getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)

        string1.getChars(0,2,charArray,0);
        string2.getChars(10,12, charArray, 2);

        System.out.println(charArray);


    }
}
