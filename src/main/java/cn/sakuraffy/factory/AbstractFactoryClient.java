package cn.sakuraffy.factory;

public class AbstractFactoryClient {
	public static void main(String[] args) {
		Phone phone = new SpecialPhone();
		phone.show();
	}
}
