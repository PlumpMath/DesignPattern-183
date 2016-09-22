package cn.sakuraffy.cor;

public class GroupFilter implements SimpleFilter {
	private SimpleFilter next;
	
	public final SimpleFilter getNext() {
		return next;
	}
	public final void setNext(SimpleFilter next) {
		this.next = next;
	}
	
	@Override
	public boolean doFilter(int num) {
		if(num < 500) {
			System.out.println("group deal");
			return true;
		}else {
			return getNext().doFilter(num);
		}
	}
}