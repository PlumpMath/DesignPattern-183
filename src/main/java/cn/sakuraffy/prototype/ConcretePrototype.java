package cn.sakuraffy.prototype;

public class ConcretePrototype implements Cloneable {
	private String name;
	private int id;
	
	public ConcretePrototype(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	@Override
	protected Object clone() {
		ConcretePrototype cp = null;
		try {
			cp = (ConcretePrototype) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cp;
	}

	@Override
	public String toString() {
		return "ConcretePrototype [name=" + name + ", id=" + id + "]";
	}
	
}