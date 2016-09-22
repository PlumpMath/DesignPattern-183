package cn.sakuraffy.iterator;

import java.util.NoSuchElementException;

public class ConcreteAggregate<T> implements Aggregate<T> {
	private Object[] data = new Object[10];
	private int size;
	
	@Override
	public void add(T obj) {
		if (size < data.length) {
			data[size++] = obj;
		}
	}

	@Override
	public Iterator<T> itreator() {
		return new ConcreteIterator();
	}

	private class ConcreteIterator implements Iterator<T>{
		private int cursor;
		
		@Override
		public boolean hasNext() {
			return cursor < size;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T next() {
			if (cursor < size) {
				return (T) data[cursor++];
			} else {
				throw new NoSuchElementException();
			}
		}
		
	}
}