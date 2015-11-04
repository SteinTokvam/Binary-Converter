public class test{
  public static void main(String[] args) {
    Converter test = new Converter();
      test.binToDeci("01100100");
      for(int i = 0;i<=100;i++){
        System.out.println("deci: " + (i));
        test.deciToBin(i);
      }
      test.test();
  }
}
