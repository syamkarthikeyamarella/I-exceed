class sample extends Thread
{
    public void run()
    {
        for(var i=0;i<10;i++)
        {
            try{
            System.out.println(i);
            Thread.sleep(1000);
            }catch(InterruptedException d){}
        }
    }
}
 
class thread6
 {
    public static void main(String[] args) throws Exception {
        sample obj1=new sample();
        sample obj2=new sample();
        sample obj3=new sample();
        obj1.start(); // starts a new thread with obj1 reference
        obj1.join(); // wait until the the current thread finishes the job
        obj2.start(); // starts a new thread
        obj3.start(); // starts a new thread parallelly to obj3 
    }
 }
 