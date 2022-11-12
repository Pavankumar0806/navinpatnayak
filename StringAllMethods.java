package RowdyString;

public class StringAllMethods {

	public static void main(String[] args) {
		String s="Hello";
		System.out.println(s.charAt(3));
		
		String s1="Hello";//second method
		String s2="Hellk";
		String s3="Mellko";
		
		System.out.println(s1.compareTo(s2));//compare chesthadi
       System.out.println(s1.compareTo(s3));
       
       String str1="Hello";//third method
       String str2="java";
       String str3="Reader";
       
       String str4=str1.concat(str2);//adding chesthadi
       System.out.println(str4);
       
       String str5=str1.concat(str2).concat(str3);
       System.out.println(str5);
       
       String ss1="what do you know about me";//fourth method
       
       System.out.println(ss1.contains("do you know"));
       System.out.println(ss1.contains("about"));
       System.out.println(ss1.contains("hello"));
       
       String ss2="java by javatpoint";//5th method
       System.out.println(ss2.endsWith("t"));
       System.out.println(ss2.endsWith("point"));
       
	}

}
