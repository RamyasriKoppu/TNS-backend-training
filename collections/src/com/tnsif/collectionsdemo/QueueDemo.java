package com.tnsif.collectionsdemo;

import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> dq=new PriorityQueue<String>();
		dq.add("ramya");
		dq.add("nobita");
		dq.add("doraemon");
		dq.add("suzuka");
		
		for (String name:dq) {
			System.out.println(name);
		}
		
	
	PriorityQueue<Integer> d=new PriorityQueue<Integer>();
	
	d.add(1234);
	d.add(234);
	d.add(345);
	for (Integer num:d) {
		System.out.println(num);
	}
	}
}
