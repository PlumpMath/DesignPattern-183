package cn.sakuraffy.cor;

public interface Filter {
	void doFilter(String request, String response, FilterChain chain);
}