package cn.sakuraffy.singleton;

import java.lang.reflect.Constructor;

public class RefectSingleton {
	private static RefectSingleton instance;
	
	private RefectSingleton() {
		if (instance != null) {
			throw new RuntimeException();
		}
	}
	
	public static RefectSingleton newInstance() {
		if (instance == null) {
			instance = new RefectSingleton();
		}
		return instance;
	}
	
	public static void main(String[] args) throws Exception {
		RefectSingleton rs = RefectSingleton.newInstance();
		Constructor<RefectSingleton> constructor = RefectSingleton
						.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		RefectSingleton rs1 = constructor.newInstance();
		System.out.println(rs == rs1);
	}
}
