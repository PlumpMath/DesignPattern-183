package cn.sakuraffy.flyweight;

	public class Client {
		public static void main(String[] args) {
			FlyweightFactory ff = new FlyweightFactory();
			Flyweight bf = ff.getFlyweight(Color.BLUE);
			Flyweight bf1 = ff.getFlyweight(Color.BLUE);
			Flyweight rf = ff.getFlyweight(Color.RED);
			bf.draw();
			bf1.draw();
			rf.draw();
			System.out.println(bf == bf1);
		}
	}