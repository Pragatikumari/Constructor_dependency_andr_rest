package constructor_injection;

public class Triangle {
	private String type;
	private int height;  
	

	public Triangle(String type)
	{
		this.type= type;
	}
	
	public Triangle( String type, int height)
	{
		this.type= type;
		this.height= height;
	}
	
	public Triangle(int height)
	{
		this.height= height;
	}
	
	public String getType() {
		return type;
	}

	
	public int getHeight() {
		return height;
	}
	
	/*public void setType(String type) {
		this.type = type;
	}*/
	
	public void draw(){
		System.out.println(getType()+" Triangle drawn of height "+getHeight());
		
	}

	

	/*public void setHeight(int height) {
		this.height = height;
	}*/
	
	

}
