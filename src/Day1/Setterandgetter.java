package Day1;
class Entityclass
{
	private int data;
	private String name;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Setterandgetter {

	public static void main(String[] args) {
		Entityclass e1=new Entityclass();
		e1.setData(100);
		e1.setName("Arun");
		System.out.println(e1.getData()+" "+e1.getName());
	}

}
