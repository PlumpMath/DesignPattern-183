package cn.sakuraffy.factory;

public class PotFactory implements PlayFactory{

	@Override
	public Playable product() {
		return new Potplayer();
	}

}
