package cn.sakuraffy.proxy;

public class StaticProxy implements Rentable {

	private Host host;
	
	public StaticProxy(Host host) {
		super();
		this.host = host;
	}



	@Override
	public void rent() {
		System.out.println("---visit house----");
		host.rent();
		System.out.println("---get cost----");
	}
	
}
