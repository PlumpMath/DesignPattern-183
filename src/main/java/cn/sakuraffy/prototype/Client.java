package cn.sakuraffy.prototype;

public class Client {
	public static void main(String[] args) {
		ConcretePrototype cp = new ConcretePrototype("sakuraffy",8);
		ConcretePrototype cp1 = (ConcretePrototype) cp.clone();
		System.out.println(cp);
		System.out.println(cp1);
		System.out.println(cp.getClass() == cp1.getClass());
		System.out.println(cp == cp1);
	}
}