package Day11;
public class CompileTimeException {
    public static void main(String[] args){
        Thread T = new Thread(()->{
            try{
                System.out.println("Thread sleep");
                Thread.sleep(2000);
                System.out.println("thread wake");
            }
            catch(InterruptedException e){
                System.out.println("Sleep interrupted");
            }
        });
        T.start();
        try{
            Thread.sleep(6000);
        }
        catch(Exception e){
            System.out.println("Not T");
        }
        T.interrupt();
    }
}
