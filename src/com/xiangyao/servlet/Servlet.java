/**
 * 
 */
/**
 * @author xiangyao
 *
 */
package com.xiangyao.servlet;
public class Servlet{
	public void service(){
		System.out.println("Servlet.servlet");
		doGet();
	}
    public void doGet(){
    	System.out.println("Servlet.doGet");
	}
 
}