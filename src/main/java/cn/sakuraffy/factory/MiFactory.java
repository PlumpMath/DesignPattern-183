package cn.sakuraffy.factory;

public class MiFactory implements CallFactory {

	@Override
	public Callable product() {
		return new Mi();
	}

}
