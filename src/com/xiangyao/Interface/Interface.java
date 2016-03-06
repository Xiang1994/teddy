/**
 * 
 */
/**
 * @author xiangyao
 *
 */
package com.xiangyao.Interface;
public interface Interface{
	//接口中只有：常量、抽象方法
	//public static final接口中定义常量时写或不写都是这样
	String MAX_GRADE = "boss";
	int MAX_SPEED = 120;
	
	//public abstract
	void test01();
	public int test02(int a,int b);
	
public interface Interesting{	
	String MAX_MOVE = "LAUGH";
	String MIN_MOVE = "SMILE";
	public void giggle();
	}

public class MyClass implements Interface{

	@Override
	public void test01() {
		// TODO Auto-generated method stub
		System.out.println("test01");
	}

	@Override
	public int test02(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("test02");
		return 0;
	}
	public class NewClass implements Interface,Interesting{

		@Override
		public void giggle() {
			// TODO Auto-generated method stub
			System.out.println("very interesting");
		}

		@Override
		public void test01() {
			// TODO Auto-generated method stub
			System.out.println("test01");
		}

		@Override
		public int test02(int a, int b) {
			// TODO Auto-generated method stub
			System.out.println("test02");
			return 0;
		}
		
	}
}}
