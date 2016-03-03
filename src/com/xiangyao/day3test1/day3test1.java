/**
 * 
 */
/**
 * @author xiangyao
 *
 */
package com.xiangyao.day3test1;
public class day3test1{
	/**
	 * @param args
	 */
	public static void main(String[] args){
		/*
		int a = 3;
		int b = a++;
		int c = ++a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
		
		
		/*
		 * boolean c = 1>2&&2>(3/0);  //1<2&&2>(3/0);
		 * System.out.println(c);
		 */
		
		
		/*
		int a = 3<<2;//移位运算符比乘法更快
		int b = 12>>2;
		int c = 3*2*2;
		int d = 12/2/2;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);*/
		
		
		/*
		//扩展运算符
		int a = 5;
		a += 5;//a = a+5;*/
		
		
		/*
		boolean b1 = false&true;
		System.out.println(b1);*/
		
		//三目条件运算符x?y:z
		/*int a = 3;
		int b = 4;
		String str = "";
		str = (a<b)?"a<b":"a>b";
		System.out.println(str);
		*/
		//三目条件运算符
		/*
		 * if(a<b){
		 *    str = "a<b";
		 *    }
		 *    else{
		 *       str = "a>b";
		 *    }   
		 */
		
		double d = Math.random();//打印［0，1）之间的小数
		int e = (int)(d*5);//强制取整
		System.out.println(e);
		//掷骰子1～6
		/*
		 * int e = 1+(int)(d*6);
		 */
		if(e>3){
			System.out.println("大数");
		}
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}