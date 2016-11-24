package cn.sakuraffy.proxy;

public class StaticProxyClient {
	public static void main(String[] args) {
		Host host = new Host();
		StaticProxy proxy = new StaticProxy(host);
		proxy.rent();
	}
}
