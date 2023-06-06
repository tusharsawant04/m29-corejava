package com.tns.threading;

public class Account {
	 private String name;
	 private int id;
	 private int balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", id=" + id + ", balance=" + balance + "]";
	}

	public void deposite(int amount) {
		balance=balance+amount;
	}
	
	public void withdraw(int amount) {
		balance=balance-amount;
	}
}
