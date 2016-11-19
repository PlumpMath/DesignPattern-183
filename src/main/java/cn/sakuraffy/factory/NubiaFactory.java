package cn.sakuraffy.factory;

public class NubiaFactory implements CallFactory {

	@Override
	public Callable product() {
		return new Nubia();
	}

}
