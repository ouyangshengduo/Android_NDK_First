LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE   := NumberUtil
LOCAL_STATIC_LIBRARIES := NumberUtil
LOCAL_SRC_FILES := Numberutil.cpp
				
LOCAL_LDLIBS := -llog 
include $(BUILD_SHARED_LIBRARY)

LOCAL_ALLOW_UNDEFINED_SYMBOLS := true