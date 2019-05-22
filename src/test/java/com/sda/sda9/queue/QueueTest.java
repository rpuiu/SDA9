package com.sda.sda9.queue;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {

    @Test
    public void testEqueueDequeue(){
        Queue queue = new Queue(3);
        queue.enqueue(1);
        System.out.println(queue);

        queue.enqueue(12);
        System.out.println(queue);

        queue.enqueue(13);
        System.out.println(queue);

        Assert.assertEquals(1, queue.dequeue());
        System.out.println(queue);

        Assert.assertEquals(12, queue.dequeue());
        System.out.println(queue);

        Assert.assertEquals(13, queue.dequeue());
        System.out.println(queue);


        System.out.println(queue);

    }

    @Test
    public void testShift(){
        Queue q = new Queue(5);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q);
        q.dequeue();
        System.out.println(q);

        q.dequeue(); //0,5,0,0,0
        System.out.println(q);

        q.dequeue();
        System.out.println(q);
        q.enqueue(5);
        q.enqueue(3);
        q.enqueue(2);
        System.out.println(q);

//        q.shift();
//        System.out.println(q);
    }
}
