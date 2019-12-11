package com.facebook.stetho.websocket;

import com.facebook.stetho.common.Utf8Charset;

class FrameHelper {
    FrameHelper() {
    }

    public static Frame createBinaryFrame(byte[] bArr) {
        return createSimpleFrame(2, bArr);
    }

    public static Frame createCloseFrame(int i, String str) {
        byte[] bArr;
        int i2;
        if (str != null) {
            bArr = Utf8Charset.encodeUTF8(str);
            i2 = bArr.length + 2;
        } else {
            bArr = null;
            i2 = 2;
        }
        byte[] bArr2 = new byte[i2];
        bArr2[0] = (byte) ((i >> 8) & 255);
        bArr2[1] = (byte) (i & 255);
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
        }
        return createSimpleFrame(8, bArr2);
    }

    public static Frame createPingFrame(byte[] bArr, int i) {
        return createSimpleFrame(9, bArr, i);
    }

    public static Frame createPongFrame(byte[] bArr, int i) {
        return createSimpleFrame(10, bArr, i);
    }

    private static Frame createSimpleFrame(byte b, byte[] bArr) {
        return createSimpleFrame(b, bArr, bArr.length);
    }

    public static Frame createTextFrame(String str) {
        return createSimpleFrame(1, Utf8Charset.encodeUTF8(str));
    }

    private static Frame createSimpleFrame(byte b, byte[] bArr, int i) {
        Frame frame = new Frame();
        frame.fin = true;
        frame.hasMask = false;
        frame.opcode = b;
        frame.payloadLen = (long) i;
        frame.payloadData = bArr;
        return frame;
    }
}
