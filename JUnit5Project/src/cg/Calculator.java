package cg;

public class Calculator {
	public int add(int a, int b) {
		
		int res=0;
		if(a>=0&&b>=0)
		res=a+b;
		return res;
		
	}
	public static int idgenerator() {
		int no=(int)(Math.random()*1000);
		//System.out.println(no);
		return no;
		
	}
	/*
	 * public static void main(String args[]) {
	System.out.println(idgenerator());
		// TODO Auto-generated method stub

	}

	 * */}
