package com.bumptech.glide.load.p339o;

import android.util.Log;
import com.bumptech.glide.load.C8108d;
import com.bumptech.glide.load.C8115i;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p163g.p413f.p414a.p424w.C10761a;

/* renamed from: com.bumptech.glide.load.o.c */
/* compiled from: ByteBufferEncoder */
public class C8275c implements C8108d<ByteBuffer> {
    /* renamed from: a */
    public boolean mo21151a(ByteBuffer byteBuffer, File file, C8115i iVar) {
        try {
            C10761a.m33984a(byteBuffer, file);
            return true;
        } catch (IOException e) {
            String str = "ByteBufferEncoder";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to write data", e);
            }
            return false;
        }
    }
}
