/**
 * 
 */
/**
 * @author xiangyao
 *
 */
package com.xiangyao.Improve;

import java.util.Scanner; 



public class Improve{
	public static void Add1(){
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println("just print "+str);
	}
	public static void Add2(){
		Scanner s = new Scanner(System.in);
		System.out.println("输入加数:");
		int a = s.nextInt();
		
		System.out.println("输入被加数:");
		int b = s.nextInt();
		
		int sum = a + b;
		System.out.println("和为"+sum);
		}
		
	

public static void main(String[] args){
	 
     Add2();

}}
