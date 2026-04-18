class SampleThread extends Thread{
    String name;
    public SampleThread(String name) {
        this.name=name;
    }
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(name+":"+i);
        }
    }
}
public class ConcurrencyExample {
    public static void main(String[] args) {
        SampleThread s1=new SampleThread("task1");
        SampleThread s2=new SampleThread("task2");
        s1.start();
        s2.start();

    }
}
