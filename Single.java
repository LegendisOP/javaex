
//Super class
class singleOne {
  void display1()
  {
    System.out.println("class One");
  }
}

//Sub class
class singleTwo extends singleOne {
  void display2()
  {
    System.out.println("class Two");
  }
}

public class Single {
  public static void main(String args[]){
    singleTwo singleObject = new singleTwo();
    singleObject.display1();
    singleObject.display2();
  }
}
