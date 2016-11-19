package cn.sakuraffy.flyweight;

	//这里以画方块为例
	public class ConcreteFlyweight implements Flyweight {
		private int width;
		private int hight;
		private Color color;
		
		private ConcreteFlyweight(int width, int hight) {
			super();
			this.width = width;
			this.hight = hight;
		}
		
		//构造时，客户端只能控制颜色
		public ConcreteFlyweight(Color color) {
			this(1,3);
			this.color = color;
		}

		public final int getWidth() {
			return width;
		}

		public final int getHight() {
			return hight;
		}

		public final Color getColor() {
			return color;
		}

		public final void setColor(Color color) {
			this.color = color;
		}

		//打印方块属性
		@Override
		public void draw() {
			System.out.println("color =" + color + " width=" + width + " hight=" + hight);
		}	
	}