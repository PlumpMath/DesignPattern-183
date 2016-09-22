package cn.sakuraffy.cor;

public class SimpleClient {
	public static void main(String[] args) {
		int num = 800;
		GroupFilter gf = new GroupFilter();
		ManagerFilter mf = new ManagerFilter();
		CEOFilter cf = new CEOFilter();
		gf.setNext(mf);
		mf.setNext(cf);
		System.out.println(gf.doFilter(num));
	}
}
