package encapsulation;

public class Sample3 {
 
	private String loginid="@$*";    //this data is only user
	private int password=2899;    
	
	
	public void User() {
		if(loginid =="@$*"&&password==2899) {
			System.out.println("You Are Succesfuly Accepted ....Welcome!!!");
		}
		else {
			System.out.println("you are not valid to login");
		}
	}
	public static void main(String[] args) {
		Sample3 s = new Sample3();
		s.User();
	}
}
