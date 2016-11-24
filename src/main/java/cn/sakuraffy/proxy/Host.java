package cn.sakuraffy.proxy;

public class Host implements Rentable {

	@Override
	public void rent() {
		System.out.println("---house rent---");
	}

}
