class ThreadDemo2 implements Runnable
{
  Thread t = new Thread();
  public void run(){
    for(int i=0;i<=10;i++)
    {
      System.out.println(i+" "+t.getName());
      try {
        Thread.sleep(2000);
      } 
      catch(InterruptedException e)
      {
        e.printStackTrace();
      }
    }
  }
}

class myThread
{
  public static void main(String args[])
  {
    ThreadDemo2 t1 = new ThreadDemo2();
    ThreadDemo2 t2 = new ThreadDemo2();
    Thread a = new Thread(t1);
    Thread b = new Thread(t2);
    a.start();
    b.start();
  }

}
