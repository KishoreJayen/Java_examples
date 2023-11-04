package Class_Program;

public class UserDetails {
	int index;
	String name;
	
	public UserDetails(int index) {
		this.index=index;
	}
	
	public UserDetails(int index, String name) {
		this.index = index;
		this.name = name;
		
	}
	
	
	public void setIndex (int index)
	{
		this.index=index;
	}
	public void setIndex (String name)
	{
		this.name=name;
	}
	
	
	public int getIndex ()
	{
		return index;
	}

	public void setName(String name)
	{
		this.name= name;
	}
	
	public String getName()
	{
		return name;
	}
}
