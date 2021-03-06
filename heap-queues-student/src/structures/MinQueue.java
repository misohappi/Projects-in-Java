package structures;

import java.util.Comparator;
import java.util.Iterator;

import comparators.ReverseIntegerComparator;

public class MinQueue<V> implements PriorityQueue<Integer, V> {
	private ReverseIntegerComparator c = new ReverseIntegerComparator();
	private StudentArrayHeap <Integer, V> heap = new StudentArrayHeap<Integer, V>(c);
	@Override
	public PriorityQueue<Integer, V> enqueue(Integer priority, V value) {
		// TODO Auto-generated method stub
		if(priority == null || value == null)
			throw new NullPointerException();
		heap.add(priority, value);
		return this;
	}

	@Override
	public V dequeue() {
		// TODO Auto-generated method stub
		if(heap.isEmpty())
			throw new IllegalStateException();
		return  (heap.remove());
	}

	@Override
	public V peek() {
		// TODO Auto-generated method stub
		if(heap.isEmpty())
			throw new IllegalStateException();
		return (heap.peek());
	}

	@Override
	public Iterator<Entry<Integer, V>> iterator() {
		// TODO Auto-generated method stub
		return heap.asList().iterator();
	}

	@Override
	public Comparator<Integer> getComparator() {
		// TODO Auto-generated method stub
		return heap.getComparator();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return heap.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return heap.isEmpty();
	}
}

