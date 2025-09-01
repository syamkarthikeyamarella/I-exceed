interface bankoperations
 {
     public void deposit(double amt);
     public void withdraw(double amt);
     
 }
 
 class savingsbank implements bankoperations
 {
    double balance=100000;
	
    @Override
    public void deposit(double amt) // overiding deposit method with our logic
	{
        balance+=amt;
        System.out.println("Deposited"+amt);
    }
   
    @Override
    public void withdraw(double amt) // overiding withdraw method with our logic
	{
        balance-=amt;
        System.out.println("Withdrawed"+amt);
    }
 
    public double getBalance()
    {
        return balance;
    }
   
 }
 
 class interfacewithref
 {
    public static void main(String[] args) 
	{
    bankoperations ref = new savingsbank();
    ref.deposit(10000);
    ref.withdraw(5000);
	
    System.out.println(((savingsbank)ref).getBalance());
    }
}