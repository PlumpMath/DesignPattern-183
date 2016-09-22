package cn.sakuraffy.prototype;

public class ShallowClone implements Cloneable {
	private int id;
	private String name;
	private Book book;
	
	//要实现对象引用的深复制，其所引用的对象必须实现实现Cloneable接口
	private static class Book implements Cloneable {
		private String name;

		public Book(String name) {
			super();
			this.name = name;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
		
		@Override
		public String toString() {
			return "Book [name=" + name + "]";
		}
		
	}
	
	public ShallowClone(int id, String name, Book book) {
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
		ShallowClone sc = null;
		try {
			sc = (ShallowClone) super.clone();
			//重点
			sc.book = (Book) this.book.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sc;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Book book = new Book("Goodbye");
		ShallowClone sc = new ShallowClone(1, "sakuraffy", book);
		ShallowClone sc1 = (ShallowClone) sc.clone();
		//这里简单使用，用getter和setter更合理
		sc1.name = "sakura";
		sc1.id = 2;
		sc1.book.name = "Hello";
		System.out.println(sc);
		System.out.println(sc1);
		System.out.println(sc.book == sc1.book);
	}
}