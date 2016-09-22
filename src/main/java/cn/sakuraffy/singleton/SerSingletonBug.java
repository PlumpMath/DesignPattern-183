package cn.sakuraffy.singleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerSingletonBug {
	
	private static class Singleton implements Serializable {
		private static final long serialVersionUID = 1L;
		
		private static final Singleton instance = new Singleton();
		
		private Singleton() {}
		
		public static Singleton newInstance() {
			return instance;
		}
	}
	
	public static void main(String[] args) throws Exception {
		Singleton s = Singleton.newInstance();
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(s);
		byte[] bytes = baos.toByteArray();
		oos.close();
		
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bais);
		Singleton s1 = (Singleton) ois.readObject();
		ois.close();
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s1 == s);
	}
}
