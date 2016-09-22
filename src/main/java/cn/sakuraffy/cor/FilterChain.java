package cn.sakuraffy.cor;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
	private int index = 0;
	private List<Filter> filters = new ArrayList<Filter>();

	@Override
	public void doFilter(String request, String response, FilterChain chain) {
		if(index < filters.size()) {
			Filter filter = filters.get(index);
			index ++;
			filter.doFilter(request, response, chain);
		}
	}
	
	//链式编程
	public FilterChain add(Filter filter) {
		filters.add(filter);
		return this;
	}
}