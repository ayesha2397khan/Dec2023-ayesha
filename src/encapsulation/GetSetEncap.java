package encapsulation;

public class GetSetEncap {

	private String setuid="a";
	private String setuname="khan";
	
	public void method(String sid) {
		setuid=sid;
	}
	public void method2(String sname) {
		setuname=sname;
	}
	public String getid() {
		return setuid;
	}
	public String getname() {
		return setuname;
	}
	public static void main(String[] args) {
		GetSetEncap g = new GetSetEncap();
	
	    System.out.println(g.setuid);
		System.out.println(g.getname());
		
	}
	
	
	
	
	
}
