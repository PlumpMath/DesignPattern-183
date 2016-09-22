package cn.sakuraffy.cor;

public class NumberFilter implements Filter {
	
	@Override
	public void doFilter(String request, String response, FilterChain chain) {
		request = request.replace('6', '4');
		System.out.println(request);
		System.out.println("NumberFilter request");
		chain.doFilter(request, response, chain);
		response = request.replace('4', '6');
		System.out.println(response);
		System.out.println("NumberFilter response");
	}

}