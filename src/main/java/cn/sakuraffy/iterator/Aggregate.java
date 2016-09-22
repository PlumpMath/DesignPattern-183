package cn.sakuraffy.iterator;

public interface Aggregate<T> {
	void add(T obj);
	Iterator<T> itreator();
}