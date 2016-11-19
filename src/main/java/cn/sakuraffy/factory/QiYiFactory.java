package cn.sakuraffy.factory;

public class QiYiFactory implements PlayFactory{

	@Override
	public Playable product() {
		return new QiYiPlayer();
	}

}
