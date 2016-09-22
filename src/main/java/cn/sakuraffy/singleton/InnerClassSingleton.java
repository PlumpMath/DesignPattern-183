package cn.sakuraffy.singleton;

public class InnerClassSingleton {
	private static class SingletonInstance {
		private static final InnerClassSingleton instance = new InnerClassSingleton(); 
	}
	
	private InnerClassSingleton() {}
	
	public static InnerClassSingleton newInstance() {
		return SingletonInstance.instance;
	}
}