package cn.sakuraffy.cor;

public class CEOFilter implements SimpleFilter {
	private SimpleFilter next;
	
	@Override
	public boolean doFilter(int num) {
		System.out.println("ceo deal");
		return true;
	}

	public final SimpleFilter getNext() {
		return next;
	}

	public final void setNext(SimpleFilter next) {
		this.next = next;
	}
}
