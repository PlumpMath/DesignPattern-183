package cn.sakuraffy.cor;

public class Client {
	public static void main(String[] args) {
		String request = "hello everyone 2016";
		String response = "";
		NumberFilter nf = new NumberFilter();
		WorldFilter wf = new WorldFilter();
		FilterChain fc = new FilterChain();
		fc.add(nf).add(wf);
		fc.doFilter(request, response, fc);
	}
}