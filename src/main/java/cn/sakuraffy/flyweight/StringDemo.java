package cn.sakuraffy.flyweight;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc"); 
		System.out.println(s1 == s2);   //false
		System.out.println(s1.intern() == s2.intern()); //true
	}
}