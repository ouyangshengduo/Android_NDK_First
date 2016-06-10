#include "com_oysd_android_ndk_demo001_NDKInterface.h"
#include <jni.h>


JNIEXPORT jint JNICALL Java_com_oysd_android_1ndk_1demo001_NDKInterface_Number_1Add
  (JNIEnv *env , jclass arg , jint a , jint b)
{
	return a + b;
}

JNIEXPORT jint JNICALL Java_com_oysd_android_1ndk_1demo001_NDKInterface_Number_1Sub
  (JNIEnv *env , jclass arg , jint a, jint b)
{
	return a - b;
}

JNIEXPORT jint JNICALL Java_com_oysd_android_1ndk_1demo001_NDKInterface_Number_1Mul
  (JNIEnv *env , jclass arg , jint a , jint b)
{
	return a * b;
}

JNIEXPORT jdouble JNICALL Java_com_oysd_android_1ndk_1demo001_NDKInterface_Number_1Div
(JNIEnv *env , jclass arg , jint a , jint b)
{
	return (a * 1.0) / ( 1.0 * b);
}

