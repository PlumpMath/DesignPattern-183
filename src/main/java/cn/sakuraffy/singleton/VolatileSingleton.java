package cn.sakuraffy.singleton;

public class VolatileSingleton {
	private static volatile VolatileSingleton instance = null;
	
	private VolatileSingleton(){}
	
	public static VolatileSingleton newInstance() {
		if (instance == null){
			synchronized (VolatileSingleton.class) {
				// 避免判断了instance==null的等待线程重复创建instance
				if (instance == null){  
					instance = new VolatileSingleton();
				}
			}
		}
		return instance;
	}
}