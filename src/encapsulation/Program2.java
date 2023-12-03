package encapsulation;

//encapsulation

public class Program2 {

	private String name;
	private int id;
	
	public void setName(String Sname) {
		name=Sname;
	}
	public void seetId(int Sid) {
		id=Sid;
	}
	public String getname() {
		return name;
	}
	public int getid() {
		return id;
	}
	public static void main(String[] args) {
		Program2 p=new Program2();
		p.seetId(2399);
		p.setName("ayesha");
		System.out.println(p.getid());
		System.out.println(p.getname());
	}
	
}
