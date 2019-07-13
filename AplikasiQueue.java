/**
 * @(#)AplikasiQueue.java
 *
 *
 * @author 
 * @version 1.00 2019/7/13
 */


public class AplikasiQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);
        queue.tampilkan();
        queue.Dequeue();
        queue.tampilkan();
        queue.Dequeue();
        queue.tampilkan();
        queue.Dequeue();
        queue.tampilkan();
    }
}