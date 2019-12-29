import  java.lang.Math;

public class NumberConverter {
  private  int number;

    /*NumberConverter(int n){
        number = n;

    }*/
    public int getNumber() {
        return number;
    }

    public void setNumber(int n) {
        number = n;
    }

    String toBinary(){
      return Integer.toBinaryString(number);

    }
    String toCotal(){
      return  Integer.toOctalString(number);
    }
    String toHex(){
      return Integer.toHexString(number);
    }

}
class NumberDemo{
    public static void main(String args []){
        NumberConverter c1 = new NumberConverter();
        c1.setNumber(11);
        System.out.println("The binay is:" + c1.toBinary());
        c1.setNumber(12);
        System.out.println("The Hex is:" + c1.toHex());
        c1.setNumber(25);
        System.out.println("The Octal is:"+c1.toCotal());
    }
}
