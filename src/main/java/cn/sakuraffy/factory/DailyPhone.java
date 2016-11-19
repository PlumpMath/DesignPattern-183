package cn.sakuraffy.factory;

public class DailyPhone extends Phone {
	public DailyPhone() {
		player = new QiYiFactory().product();
		caller = new MiFactory().product();
	}
}
