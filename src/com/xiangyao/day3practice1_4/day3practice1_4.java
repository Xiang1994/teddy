/**
 *  四个练习：1:一百以内奇偶数和
 *          2:
 */
/**
 * @author xiangyao
 *
 */
package com.xiangyao.day3practice1_4;

public class day3practice1_4 {
	public static void main(String[] args) {
		Math m = new Math();
		m.getFive();
		m.getSum();
		m.getRes();
        m.getAdd();
	}
}

class Math {
	public  void getFive() {
		System.out.println("输出1～1000能被5整除的数，每行三个");
		for (int i = 1; i <= 1000; i++) {
			if (i % 5 == 0) {
				System.out.print(i+"\t");
			}
			 if(i%5*3 == 0){
				System.out.println();
			}
		}
	}

	public  void getSum() {
		int sum1 = 0;// oddSum奇数
		for (int i = 1; i <= 100;) {
			// if(i%2!=0)
			sum1 += i;
			i = i + 2;

		}
		System.out.println("一百以内奇数和为" + sum1);
		int sum2 = 0;// evenSum偶数
		for (int j = 2; j <= 100;) {
			// if(i%2=0)
			sum2 += j;
			j = j + 2;
		}
		System.out.println("一百以内偶数和为" + sum2);
	}

/*
 * goodSample int oddSum = 0; int evenSum = 0; for(int i = 0;i<=100;i++){
 * if(i%2!=0){ oddSum += i;} else{ evenSum += i;}
 * System.out.println("奇数和"+oddSum); System.out.println("偶数和"+evenSum);
 */
 public void getRes(){
	 for(int i = 1;i<=9;i++){
		 for(int j = 1;j<=i;j++){
			 System.out.print(i+"*"+j+"="+i*j+"\t");
		 }
		 System.out.println();
	 }
	 System.out.println("*********************");
 }
 
  
 public void getAdd(){
	 int d = 0;
	 for(int m = 1;m<=9;m++){
		 for(int n = 1;n<=m;n++){
			 int c = m + n;
			  d = d + c;
			 System.out.print(m+"+"+n+"="+c+"\t");
			 
		 }
     System.out.println();
	 }
	 System.out.println(d);
 }

}















