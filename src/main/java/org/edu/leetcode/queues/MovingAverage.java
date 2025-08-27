package org.edu.leetcode.queues;

import java.util.LinkedList;
import java.util.Queue;

class MovingAverage {
    private final int size;
    private final Queue<Integer> queue;
    private double sum = 0;

    public MovingAverage(int size) {
        this.sum = 0;
        this.size = size;
        this.queue = new LinkedList<>();
    }

    public double next(int val) {
        this.queue.offer(val);
        sum += val;

        if (queue.size() > size && !queue.isEmpty()) {
            int first = queue.poll();
            sum -= first;
        }
        return this.queue.isEmpty() ? 0 : sum / queue.size();
    }
}