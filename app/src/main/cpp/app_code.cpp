//
// Created by Ali on 26.05.2022.
//

#include <jni.h>
#include <string>
#include <iostream>



extern "C" JNIEXPORT jstring JNICALL
Java_com_example_filedecriptor_MainActivity_getType(JNIEnv *env, jobject thiz, jstring path) {
    return path;
}


