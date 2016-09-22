package cn.sakuraffy.singleton;

public class DoubleCheckSingleton {
	private static DoubleCheckSingleton instance = null;
	
	private DoubleCheckSingleton() {}
	
	public static DoubleCheckSingleton newInstance() {
		if (instance == null){
			synchronized (DoubleCheckSingleton.class) {
				// 避免判断了instance==null的等待线程重复创建instance
				if (instance == null){  
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}