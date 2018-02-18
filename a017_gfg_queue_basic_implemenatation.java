
class Queue{
int front, rear , size, capacity, array[];
	
	public Queue(int capacity) {
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int[this.capacity];
	}
	
	boolean isFull(Queue queue) {
		return (this.size == this.capacity);
	}
	
	boolean isEmpty(Queue queue) {
		return (this.size == 0);
	}
	
	void enqueue(int item) {
		if (isFull(this) ) {return;}
		this.rear = (this.rear+1) % this.capacity;
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item +" : enqueued to the queue");
	}
	
	int dequeue() {
		if (isEmpty(this)) {return Integer.MIN_VALUE;}
		int item = this.array[this.front];
		this.front = (this.front+1)%this.capacity;
		this.size = this.size - 1;
		return item;
	}
	
	int front() {
		if (isEmpty(this)) {return Integer.MIN_VALUE;}
		return this.array[this.front];
	}
	
	int rear() {
		if (isEmpty(this)) {return Integer.MIN_VALUE;}
		return this.array[this.rear];
	}
	
}

public class a017_gfg_queue_basic_implemenatation {

	public static void main(String[] args) {
		Queue queue = new Queue(1000);
		queue.enqueue(10);
		queue.enqueue(110);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(60);
		
		System.out.println(queue.dequeue()+" : dequeued from queue");
		System.out.println(queue.front()+" : is the front element of queue");
		System.out.println(queue.rear()+" : is the rear element of queue");
	}
	
}
