package cn.sakuraffy.iterator;

public class Client {
	public static void main(String[] args) {
		Aggregate<Integer> ag = new ConcreteAggregate<>();
		ag.add(1);
		ag.add(2);
		ag.add(2);
		ag.add(2);
		Iterator<Integer> it = ag.itreator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}