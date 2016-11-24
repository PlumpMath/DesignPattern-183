package cn.sakuraffy.proxy;

public class StaticProxy implements Rentable {

	private Host host;
	
	public StaticProxy(Host host) {
		super();
		this.host = host;
	}



	@Override
	public void rent() {
		System.out.println("---static proxy start----");
		host.rent();
		System.out.println("---static proxy end----");
	}
	
}
