package accessSpecifier2;

import accessSpecifier.Parent3;

public class DiffClassDiffPack {
	  public static void main(String[] args) {
			Parent3 p = new Parent3();
//			p.method1();       //private
//			p.method2();       //defualt
//			p.method3();      //protected   
			p.method4();      //public
		
	  }	
	}

