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
}
