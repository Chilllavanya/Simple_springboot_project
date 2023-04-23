package com.microservicesDemo.microservices.demo;

public class DemoProject {
	private int max;
	private int min;
	
	public DemoProject(){}
	public DemoProject(int maxNum, int minNum){
		this.max=maxNum;
		this.min=minNum;
	}
	public int getMax(){
		return max;
	}
	public int getMin(){
		return min;
	}
}
