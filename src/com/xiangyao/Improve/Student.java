/**
 * 
 */
/**
 * @author xiangyao
 *
 */
package com.xiangyao.Improve;
public class Student{
	int age;
	String name;
	int id;
	
	public void sayHello(String sname){
		System.out.println(name+"向"+sname+"\t"+"say hello");
	}
	public void study(String sclass){
		System.out.println(name+"在学习"+sclass);
	}
	public static void main(String[] args){
		Student s1 = new Student();
		s1.name = "xy";
		s1.age = 22;
		s1.sayHello("sb");
		
		Student s2 = new Student();
		s2.name = "sb";
		s2.age = 3;
		s2.study("French");
	}}
