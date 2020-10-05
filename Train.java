package com.xworkz.encapsulation;

public class Train {
	private String ticketno; // critical data
	public String regname;
	public int price;
	public String route;
	
	public Train( String ticketno, String regname,int price) {
		route= "tumkur-bangalore";
		ticketno=ticketno;
		regname=regname;
		price=price;}
	
	public String getroute() {
		System.out.println("the route is :" + route);
		return route;}
	
	private void setroute(String inroute){
		route=inroute; }
		
	protected int  getprice() {
		return price;}
		
	protected void setprice(int price) {
			this.price = price; }
			
	public String getticketno() {
		return ticketno;}
	
	public void setticketno(String ticketno) {
		this.ticketno= ticketno;}
}