package cn.sakuraffy.cor;

public class ManagerFilter implements SimpleFilter {
	private SimpleFilter next;
	
	@Override
	public boolean doFilter(int num) {
		if(num < 1000) {
			System.out.println("manager deal");
			return true;
		}
		return getNext().doFilter(num);
	}

	public final SimpleFilter getNext() {
		return next;
	}

	public final void setNext(SimpleFilter next) {
		this.next = next;
	}
}