package cg;

public class Validator{
	
	public int getSizeinMl(Size size) {
		System.out.println(size+" "+size.getMl());
		return size.getMl();
		
	}
	
	public boolean ValidateNo(String data) {
	return data.matches("\\d+");
}
	public  boolean isPalindrome(String data) {
		StringBuffer sb = new StringBuffer(data);
		String reverseS = sb.reverse().toString();
		return data.equals(reverseS);
		
	}
}
