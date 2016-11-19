package cn.sakuraffy.factory;

public class FactoryMethodClient {
	public static void main(String[] args) {
		CallFactory factory = new NubiaFactory();
		Callable phone = factory.product();
		phone.call();
	}
}
