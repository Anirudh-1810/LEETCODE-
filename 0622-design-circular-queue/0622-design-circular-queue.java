class MyCircularQueue {
 public int arr[];
 public int front;
 public int rear;
 public int cap;
 public int size;
    public MyCircularQueue(int k) {
        arr = new int[k];
        this.size=0;
        this.front=0;
        this.rear=-1;
        this.cap=k;
    }
    
    public boolean enQueue(int value) {
        if(size==cap)return false;
        rear=(rear+1)%cap;
        arr[rear]=value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(size==0)return false;
        front=(front+1)%cap;
        size--;
        return true;
    }
    
    public int Front() {
        if(size>0)return arr[front];
        return -1;
    }
    
    public int Rear() {
        if(size>0)return arr[rear];
        return -1;
    }
    
    public boolean isEmpty() {
        if(size==0)return true;
        return false;
        
    }
    
    public boolean isFull() {
        if(size==cap)return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */