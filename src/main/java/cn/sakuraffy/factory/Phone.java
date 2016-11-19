package cn.sakuraffy.factory;

public class Phone {
	protected Callable caller;
	protected Playable player;
	
	public void show() {
		System.out.println("phone info : " + this.getClass().getName());
		caller.call();
		player.play();
	}
}
