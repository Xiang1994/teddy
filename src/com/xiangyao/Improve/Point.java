/**
 * 
 */
/**
 * @author xiangyao
 *
 */
package com.xiangyao.Improve;
public class Point{
	double x,y,z;
	
	public  Point(double x,double y,double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void setPoint(double x,double y,double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double distance(Point p){
		double result = Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)*(z-p.z));
		return result;
	}
	public static void main(String[] args){
		Point p = new Point(3,4,5);
		Point p2 = new Point(4,5,6);
		p.setPoint(3,4,5);
		System.out.println(p.x+","+p.y+","+p.z);
		System.out.println(p.distance(p2));
	}
}
