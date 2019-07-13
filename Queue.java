/**
 * @(#)Queue.java
 *
 *
 * @author 
 * @version 1.00 2019/7/13
 */


public class Queue {

    int data[];
    int head = 0;
    int tail = -1;

    public Queue(int size) {
        data = new int[size];
    }

    public boolean isEmpty(){
        if(tail==-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(tail==data.length-1){
            return true;
        }else{
            return false;
        }
    }

    public void Enqueue(int dataBaru){
        if(isEmpty()){
            tail = head;
            data[tail] = dataBaru;
        }else if(!isFull()){
            tail++;
            data[tail] = dataBaru;
        }else if(isFull()){
            System.out.println("antrian sudah penuh");
        }
    }

    public int Dequeue(){
        int temp = data[head];
        for(int i=head;i<=tail-1;i++){
            data[i] = data[i+1];
        }
        tail--;
        return temp;
    }
    
    public void tampilkan(){
        if(!isEmpty()){
            int index = head;
            while(index <= tail){
                System.out.print("|"+data[index]+"| ");
                index++;
            }
            System.out.println();
        }else{
            System.out.println("Kosong");
        }
    }

}