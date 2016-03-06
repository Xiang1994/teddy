package com.xiangyao.servlet;

/*public class Test {
   public static void main(String[] args){
	   Servlet s = new Servlet();
	   s.service();
   }
}*/

 abstract class Animal{
	
	public abstract void run();
	
	public void eat(){
		System.out.println("mia");
	}
}

class Cat extends Animal{
	
	@override
	public void run(){
		System.out.println("mew");
	}
	
class Dog extends Animal{
		
		@override
		public void run(){
			System.out.println("woo");
		}
	}
	
}









