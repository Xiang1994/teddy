/**
 * 
 */
/**
 * @author xiangyao
 *
 */
package com.xiangyao.day3test2;
public class day3test2{
	public static void main(String[] args){
		double d = Math.random();
		int e = 1+(int)(d*6);
		System.out.println(e);
		switch(e){
		
		case 6:
			System.out.println("good luck");
			break;//防止case穿透现象
		case 5:
			System.out.println("fine");
			break;
		case 4:
			System.out.println("okay");
			break;
		default:
			System.out.println("fine");
			break;
		}
		
		System.out.println("*************************");
		
		
        char c1 = 'a';
        int rand = (int)(26*Math.random());
        char c2 = (char)(c1+rand);
        System.out.println(c2+":");
        switch(c2){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        	System.out.println("元音");
			break;
        case 'y':
        case 'w':
        	System.out.println("半元音");
			break;
		default:
		    System.out.println("辅音");
        }
        System.out.println("*************利用case穿透现象"); 
		
        //计算1加至100
        int a = 1;
        int sum = 0;
        while(a<=100){
        	sum = sum + a;
        	a++;
        	}//此处若不写｝则输出sum累加过程
        	System.out.println("sum="+sum);
        	
        System.out.println("*************for循环*****");
             
            int tot = 0;//提前声明，在for循环体内声明显示变量无效
        	for(int m=1;m<=100;m++){//先初始化，判断，然后执行循环体，最后迭代
        	
        		tot += m;}
				System.out.println("tot="+tot);
 
	   
	}}
	
        	
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
