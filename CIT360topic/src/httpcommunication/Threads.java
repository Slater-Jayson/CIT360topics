package httpcommunication;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class Threads {

 public static void main(String args[]) {
     
     ExecutorService executor = Executors.newCachedThreadPool();

     // create thread
     FutureTask task = new FutureTask(new SomeThread(false));
     executor.submit(task); 
     executor.shutdown();

     try {
         
         executor.awaitTermination(3, TimeUnit.SECONDS);
        
         System.out.println("returns: " + task.get());
     } catch (InterruptedException e) {
         e.printStackTrace();
     } catch (ExecutionException e) {
         e.printStackTrace();
     }

     executor = Executors.newCachedThreadPool();
     task = new FutureTask(new SomeThread(true));
     executor.submit(task);

     executor.shutdown();
     try {
         executor.awaitTermination(3, TimeUnit.SECONDS);
         
         System.out.println("returns: " + task.get());
     } catch (InterruptedException e) {
         e.printStackTrace();
     } catch (ExecutionException e) {
         e.printStackTrace();
     }
 } 

 static class SomeThread implements Callable {
     boolean throwError = false;

     public SomeThread(boolean throwError) {
         this.throwError = throwError;
     }

     @Override
	public String call() throws Exception {
         System.out.println("going..");
         Thread.sleep(2000);
         System.out.println("done");

         if (throwError) {
             throw new Exception("boom, exception");
         }

         return "value";
     }
 } 
}
