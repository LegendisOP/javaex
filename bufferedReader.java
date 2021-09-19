import java.io.*;


public class bufferedReader {
  public static void main(String args[])throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num[] = new int[10];
    String[] str;
    
    System.out.println("Enter string of numbers");

    str = br.readLine().split(" ");

    for(int i=0;i<str.length;i++){
      num[i] = Integer.parseInt(str[i]);
    }

    System.out.println("array");

    for(int i=0;i<str.length;i++){
      System.out.println(num[i]);
    }

  }
}
