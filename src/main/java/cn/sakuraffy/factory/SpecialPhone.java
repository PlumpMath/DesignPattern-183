package cn.sakuraffy.factory;

public class SpecialPhone extends Phone {
	public SpecialPhone() {
		caller = new NubiaFactory().product();
		player = new PotFactory().product();
	}
}
