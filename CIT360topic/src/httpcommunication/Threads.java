package httpcommunication;


class Threads extends Thread{
   public void run(){
      System.out.println("Throwing in " +"Threads");
      throw new RuntimeException();
   }
}
class Main {
   public static void main(String[] args){
      Threads t = new Threads();
      t.start();
      try{
         Thread.sleep(1000);
      }
      catch (Exception x){
         System.out.println("Caught it" + x);
      }
      System.out.println("Exiting main");
   }
}