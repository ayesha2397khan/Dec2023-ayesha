package polymorphismOverloading;
//Can we Overload main method ?
//=>yes, with the help of diff parameter 
//count of parameter must be diff
//count of datatype must be diff
//sequence of parameter must be diff
//minimum 1class suffisent
//***************************************************************************
//Can we Override main method ?
//==>No, Can not override mainmethod
//bcoz main method is static and static cant override
public class MainMethodOverload {
	
public static void main(String[] args) {
	
}
public static void main(int a) {
	
}
public static void main() {
	
}

}
