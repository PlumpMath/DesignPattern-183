package cn.sakuraffy.proxy;

import java.util.ArrayList;
import java.util.Collection;

public class DynamicProxyClient {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Host host = new Host();
		DynamicProxy dp = new DynamicProxy(host);
		Rentable proxy = (Rentable) dp.getProxy();
		proxy.rent();
		
		Collection<String> c = new ArrayList<>();
		dp = new DynamicProxy(c);
		Collection<String> proxy2 = (Collection<String>) dp.getProxy();
		proxy2.add("Hello");
	}
}
