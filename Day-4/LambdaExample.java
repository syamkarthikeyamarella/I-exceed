@FunctionalInterface
interface Calculator 
{
    int add(int a, int b); 
}

public class LambdaExample 
{
    public static void main(String[] args) 
	{
        // Using lambda expression to implement the functional interface
        Calculator addOperation = (a, b) -> a + b;
        
        // Calling the method through the reference
        int result = addOperation.add(10, 20);
        System.out.println("The sum is: " + result);
    }
}
