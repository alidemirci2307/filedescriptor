cmake_minimum_required(VERSION 3.4.1)

add_library(app_code
            SHARED
            app_code.cpp)

find_library(
            app_code
            log)

# Include libraries needed for hello-jni lib
target_link_libraries(app_code
        ${log_lib})