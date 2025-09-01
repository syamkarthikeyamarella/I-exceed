@FunctionalInterface
interface mydata  //A Functional Interface in Java is an interface that has exactly one abstract method
 {
    public void display1();
   
 }
 
 class demofunctional
  {
     public static void main(String[] args) 
	 {
        new mydata()
		{
             public void display1()
             {
                System.out.println("Inside the functional interface method");
             }
 
        }.display1();
     }
     
  }