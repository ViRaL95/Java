import java.util.Date;
public class Animal{
	private String name;
	private String color;
	private Date date;
	
	Animal(String name, String color, Date date){
		this.name=name;
		this.color=color;
		this.date=date;
	}	
	public String getName(){
		return name;
	}
	public String getColor(){
		return color;
	}
	public Date getDate(){
		return date;
	}


}