import java.util.Stack;

/*Очередь с помощью двух стеков*/
public class Task1 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
    }

    static class MyQueue {
        private Stack<Integer> s1 = new Stack<Integer>();
        private Stack<Integer> s2 = new Stack<Integer>();

        public MyQueue() {
        }

        public void push(int value) {
            s1.push(value);
        }

        public Integer pop() {
            this.shift();
            return s2.pop();
        }

        private void shift() {
            if(!s2.empty()) {
                return;
            }
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
    }
}
