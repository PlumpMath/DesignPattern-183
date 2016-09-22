package cn.sakuraffy.singleton;

public class LazySingleton {
	private final static LazySingleton instance = new LazySingleton();
	
	private LazySingleton() {}
	
	public static LazySingleton newInstance() {
		return instance;
	}
}
