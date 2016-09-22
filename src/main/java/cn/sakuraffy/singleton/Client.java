package cn.sakuraffy.singleton;

public class Client {
	public static void main(String[] args) {
		HungrySingleton hs = HungrySingleton.newInstance();
		HungrySingleton hs1 = HungrySingleton.newInstance();
		System.out.println(hs == hs1);
		
		LazySingleton ls = LazySingleton.newInstance();
		LazySingleton ls1 = LazySingleton.newInstance();
		System.out.println(ls == ls1);
		
		VolatileSingleton vs = VolatileSingleton.newInstance();
		VolatileSingleton vs1 = VolatileSingleton.newInstance();
		System.out.println(vs == vs1);
		
		InnerClassSingleton ics = InnerClassSingleton.newInstance();
		InnerClassSingleton ics1 = InnerClassSingleton.newInstance();
		System.out.println(ics ==ics1);
		
		DoubleCheckSingleton dcs = DoubleCheckSingleton.newInstance();
		DoubleCheckSingleton dcs1 = DoubleCheckSingleton.newInstance();
		System.out.println(dcs == dcs1);
		
		EnumSingleton es = EnumSingleton.instance;
		EnumSingleton es1 = EnumSingleton.instance;
		System.out.println(es == es1);
	}
}
