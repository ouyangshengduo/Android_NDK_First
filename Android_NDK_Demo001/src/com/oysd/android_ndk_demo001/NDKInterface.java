package com.oysd.android_ndk_demo001;


public class NDKInterface {
	
	static{
		System.loadLibrary("NumberUtil");
	}
	public static native int Number_Add(int a , int b);// 加法
	public static native int Number_Sub(int a , int b);// 减法
	public static native int Number_Mul(int a , int b);// 乘法
	public static native double Number_Div(int a , int b);// 除法
}
