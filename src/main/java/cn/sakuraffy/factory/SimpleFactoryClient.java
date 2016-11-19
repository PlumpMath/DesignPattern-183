package cn.sakuraffy.factory;

public class SimpleFactoryClient {
	public static void main(String[] args) {
		Callable phone = SimpleFactory.getCall("Mi");
		phone.call();
	}
}
