package ds.queue;

public class Queue {
	private int maxSize; //initialized the set of slots
	private long[] queArray; //slots to maintain data
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int size) {
		this.maxSize = size;
		this.queArray = new long[size];
		front = 0; //index posiion of the first slot of the array;
		rear=-1; 
		nItems=0;
	}
	
}