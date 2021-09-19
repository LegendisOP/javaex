class staticMethod {
  static int j = 10;
  int i = 20;
  static void staticDisplay(){
    System.out.println(j);
    // System.out.println(i); i is not static
  }
}

public class TestStatic {
  public static void main(String args[]){
    staticMethod.staticDisplay();
  }
}
