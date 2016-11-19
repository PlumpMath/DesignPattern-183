package cn.sakuraffy.factory;

public class SimpleFactory {
	public static Callable getCall(String name) {
		if("Nubia".equals(name)) {
			return new Nubia();
		} else if ("Mi".equals(name)) {
			return new Mi();
		} else {
			return null;
		}
	}
}
