class A {
  int i;
  // private int j;
  int j;
  void setij(int x,int y){
    i=x;
    j=y;
  }
}

class B extends A{
  int total;
  void sum(){
    total = i + j; // Error j is not accessible here
  }
}

public class AccessDemo {
  public static void main(String args[]){
    B subOb = new B();
    subOb.setij(10, 12);
    subOb.sum();
    System.out.println("Total is" + subOb.total);
}
}
