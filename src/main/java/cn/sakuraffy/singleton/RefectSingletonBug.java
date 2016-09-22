package cn.sakuraffy.singleton;

import java.lang.reflect.Constructor;

public class RefectSingletonBug {
	public static void main(String[] args) throws Exception {
		HungrySingleton hs = HungrySingleton.newInstance();
		Class<HungrySingleton> clazz = HungrySingleton.class;
		Constructor<HungrySingleton> c = clazz.getDeclaredConstructor();
		c.setAccessible(true);
		HungrySingleton hs1 = c.newInstance();
		
		System.out.println(hs);
		System.out.println(hs1);
		System.out.println(hs == hs1);
	}
}
