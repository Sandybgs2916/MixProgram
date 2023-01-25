package mixprogram;

public class removebracketsfromexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(a+b)=c";
		s = s.replaceAll("[(){}]","");  
		System.out.println(s);
	}
}