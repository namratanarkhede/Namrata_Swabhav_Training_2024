package com.aurionpro.test;

//String are immutable
public class StringTest {
	public static void main(String[] args) {
		String name1 = "Nams";
		String name2 = "Nams";
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name1==name2);
		
		System.out.println("----------------------------");
		
		String name3 = new String("NamrataNarkhede");
		String name4 = new String("Namrata");
		System.out.println(name3.hashCode());
		System.out.println(name4.hashCode());
		System.out.println(name3==name4);
		
		System.out.println(" ----------------------- ");
		String name = "Namrata";
		System.out.println(name);
		System.out.println(name.hashCode());
		name = name+"Narkhede";
		System.out.println(name);
		System.out.println(name.hashCode());
		
		System.out.println(" ----------------------- ");

		StringBuffer name5 = new StringBuffer("Namrata");
		System.out.println(name5.hashCode());
		name5 = name5.append("Narkhede");
		System.out.println(name5.hashCode());
		
		System.out.println(" ----------------------- ");

		StringBuilder name6 = new StringBuilder("Namrata");
		System.out.println(name6.hashCode());
		name6 = name6.append("Narkhede");
		System.out.println(name6.hashCode());
		
		
	}

}
