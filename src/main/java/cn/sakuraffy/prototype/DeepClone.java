package cn.sakuraffy.prototype;

public class DeepClone implements Cloneable {
	private int id;
	private String name;
	private Book book;
	
	private static class Book {
		private String name;

		public Book(String name) {
			super();
			this.name = name;
		}

		@Override
		public String toString() {
			return "Book [name=" + name + "]";
		}
		
	}
	
	public DeepClone(int id, String name, Book book) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
	}

	@Override
	public String toString() {
		return "DeepClone [id=" + id + ", name=" + name + ", book=" + book
				+ "]";
	}

	@Override
	protected Object clone() {
		DeepClone dc = null;
		try {
			dc = (DeepClone) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dc;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Book book = new Book("Goodbye");
		DeepClone dc = new DeepClone(1, "sakuraffy", book);
		DeepClone dc1 = (DeepClone) dc.clone();
		Thread.sleep(1000);
		//这里简单使用，用getter和setter更合理
		dc1.name = "sakura";
		dc1.book.name = "Hello";
		dc1.id = 2;
		System.out.println(dc);
		System.out.println(dc1);
		System.out.println(dc.book == dc1.book);
	}
}