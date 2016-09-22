package cn.sakuraffy.cor;

public class WorldFilter implements Filter {

	@Override
	public void doFilter(String request, String response,FilterChain chain) {
		request = request.replace("hello", "nihao");
		System.out.println(request);
		System.out.println("WordFilter request");
		chain.doFilter(request, response, chain);
		response = request.replace("nihao", "hello");
		System.out.println(response);
		System.out.println("WordFilter response");
	}
	
}