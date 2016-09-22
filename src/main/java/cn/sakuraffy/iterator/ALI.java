package cn.sakuraffy.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ALI {
	public static void main(String[] args)  {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			Integer i = iterator.next();
			if (i == 2) {
				list.remove(i);
				//iterator.remove();
			}
		}
	}
}