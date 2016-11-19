package cn.sakuraffy.flyweight;

	import java.util.HashMap;

	public class FlyweightFactory {
		private HashMap<Color,Flyweight> flyweights = new HashMap<>();
		
		public Flyweight getFlyweight(Color color) {
			Flyweight fw = flyweights.get(color);
			if (fw == null) {
				fw = new ConcreteFlyweight(color);
				flyweights.put(color, fw);
			}
			return fw;
		}
	}