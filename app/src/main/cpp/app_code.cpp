//
// Created by Ali on 26.05.2022.
//

#include <jni.h>
#include <string>
#include <iostream>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <stdio.h>
#include <time.h>


extern "C" JNIEXPORT jstring JNICALL
Java_com_example_filedecriptor_MainActivity_getType(JNIEnv *env, jobject thiz, jstring path) {
    return path;
}


