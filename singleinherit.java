package oops;
 
class parent
{
	void hello()
	{
		System.out.println("hello");
	}
}
public class singleinherit extends parent 
{
    void hi()
    {
    	System.out.println("hi");
    }
	public static void main(String[] args)
	{
		singleinherit s=new singleinherit();
		s.hello();
		s.hi();

	}

}
