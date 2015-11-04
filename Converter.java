import java.util.ArrayList;

public class Converter{
  private ArrayList<String> alleBin = new ArrayList<String>();
  public void binToDeci(String bin){
    char test = '1';
    int value = 0;
    char[] binChar = bin.toCharArray();
    for(int i = 0; i<binChar.length;i++){
      if(binChar[i]==test){
        value +=(Math.pow(2,(binChar.length+(-i-1))));
      }
      else{
        value +=1*0;
      }
    }
    System.out.println(value);
  }

  public void deciToBin(int deci){
    int currDeci=deci;
    String value = "";
    if(currDeci==0){
      System.out.println("0");
    }

    while(currDeci!=0){
      if(currDeci%2==0){
        currDeci=currDeci/2;
        value+="0";
      }
      else{
        value +="1";
        currDeci= currDeci/2;
      }
    }
    char[] turn = value.toCharArray();
    for (int i = 0; i < turn.length / 2; i++) {
      char temp = turn[i];
      turn[i] = turn[turn.length - 1 - i];
      turn[turn.length - 1 - i] = temp;
  }
  value = "";
  for(int j = 0; j<turn.length;j++){
    value+=turn[j];
  }
      alleBin.add(value);//tester hvor det streiker

      System.out.println(value);
    }
}
