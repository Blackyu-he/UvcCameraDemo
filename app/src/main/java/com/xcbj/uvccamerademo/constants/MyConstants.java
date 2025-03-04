package com.xcbj.uvccamerademo.constants;

public class MyConstants {
    public enum UsbCamState {
        IDLE, RECORDING, WAIT_SURE_VIDEO, WAIT_SURE_PIC, ERROR, TAKING_PIC
    }

    public enum UsbDeviceState {
        ATTACH,DETTACH,CONNECT,DISCONNECT
    }

    public static int DEFAULT_USB_CAM_WIDTH = 640;
    public static int DEFAULT_USB_CAM_HEIGHT = 480;

    public static int FORMAT_YUV = 0x01;
}
