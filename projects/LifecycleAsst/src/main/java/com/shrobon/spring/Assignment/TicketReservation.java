package com.shrobon.spring.Assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	private int tid;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}
	
	@PostConstruct
	public void initialize(){
		System.out.println("Using Annotations : Init");
	}
	
	@PreDestroy
	public void cleanup(){
		System.out.println("Using Annotations : Cleanup");
	}
}
