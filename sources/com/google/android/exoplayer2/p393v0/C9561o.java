package com.google.android.exoplayer2.p393v0;

import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* renamed from: com.google.android.exoplayer2.v0.o */
/* compiled from: GlUtil */
public final class C9561o {
    /* renamed from: a */
    public static void m29483a() {
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("glError ");
                sb.append(GLU.gluErrorString(i));
                C9563q.m29497b("GlUtil", sb.toString());
                i = glGetError;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static int m29486b() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m29483a();
        return iArr[0];
    }

    /* renamed from: a */
    public static int m29480a(String[] strArr, String[] strArr2) {
        String str = "\n";
        return m29479a(TextUtils.join(str, strArr), TextUtils.join(str, strArr2));
    }

    /* renamed from: a */
    public static int m29479a(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        m29483a();
        m29484a(35633, str, glCreateProgram);
        m29484a(35632, str2, glCreateProgram);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to link shader program: \n");
            sb.append(GLES20.glGetProgramInfoLog(glCreateProgram));
            m29485a(sb.toString());
        }
        m29483a();
        return glCreateProgram;
    }

    /* renamed from: a */
    public static FloatBuffer m29482a(float[] fArr) {
        return (FloatBuffer) m29481a(fArr.length).put(fArr).flip();
    }

    /* renamed from: a */
    public static FloatBuffer m29481a(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    /* renamed from: a */
    private static void m29484a(int i, String str, int i2) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(GLES20.glGetShaderInfoLog(glCreateShader));
            sb.append(", source: ");
            sb.append(str);
            m29485a(sb.toString());
        }
        GLES20.glAttachShader(i2, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        m29483a();
    }

    /* renamed from: a */
    private static void m29485a(String str) {
        C9563q.m29497b("GlUtil", str);
    }
}
