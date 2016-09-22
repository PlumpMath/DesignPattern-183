package cn.sakuraffy.singleton;

public class HungrySingleton {
	private static HungrySingleton instance;
	
	private HungrySingleton() {}

	public static HungrySingleton newInstance() {
		if (instance == null) {
			instance = new HungrySingleton();
		} 
		return instance;
	}
}
