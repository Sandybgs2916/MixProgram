package mixprogram;

public class removecharexceptalphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hell456o56wor%>ld";
		s = s.replaceAll("[^a-zA-Z]","");  // use regex method i.e replaceAll by ("[^a-zA-Z]","")
		System.out.println(s);
	}
}