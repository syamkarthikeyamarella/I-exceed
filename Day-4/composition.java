class qualification
{
     String ug,pg;
     int yoe;
 
    public qualification(String ug,String pg,int yoe) 
	{
        this.ug=ug;
        this.pg=pg;
        this.yoe=yoe;
    }
 
    public void displayQualification()
    {
        System.out.println("UG Degree\t"+ug);
        System.out.println("PG Degree\t"+pg);
        System.out.println("Experience\t"+yoe);
    }
     
}

class teacher
{
    qualification qt;
    String name,dept;
	
    teacher(String name,String dept)
    {
        qt=new qualification("B.Tech","M.Tech",25); //this is called as composition, where the qualification class is tightly coupled(completely part of) with the teacher class
        this.name=name;
        this.dept=dept;
    }
	 
    public void displayTeacher()
    {
        System.out.println("Teacher name\t"+name);
        System.out.println("Department\t"+dept);
        qt.displayQualification();
    }
}
 
class composition
{
    public static void main(String[] args) 
	{
        teacher t = new teacher("Syam","Maths");
		teacher t1 = new teacher("Karthik","Physics");
        t.displayTeacher();
		t1.displayTeacher();
    }
}