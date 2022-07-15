package com.ivy;

public class Product {
	private int pid;
	private String name;
	public Product(int pid, String name, String desc) {
	
		this.pid = pid;
		this.name = name;
		this.desc = desc;
	}
	private String desc;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public Product() {
		
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", desc=" + desc + "]";
	}
}
