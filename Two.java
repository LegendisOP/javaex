class One {
  int a=10;
  void display(){
    System.out.println(a);
  }
}

public class Two {
  public static void main(String args[]){
    One k = new One();
    k.display();
    System.out.println(k.a);
  }
}
