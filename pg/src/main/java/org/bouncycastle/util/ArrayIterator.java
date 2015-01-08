package org.bouncycastle.util;

import java.util.Iterator;

public class ArrayIterator implements Iterator {

	private Object[] data;
	private int pos;
	public ArrayIterator(Object[] data) {
		this.data = data;
		pos=0;
	}
	
	public boolean hasNext() {
		return pos < data.length;
	}

	public Object next() {
		return data[pos++];
	}

}
