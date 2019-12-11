package com.google.android.exoplayer2.p381t0;

import android.media.MediaFormat;
import com.google.android.exoplayer2.p394w0.C9586i;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.t0.e */
/* compiled from: MediaFormatUtil */
public final class C9284e {
    /* renamed from: a */
    public static void m28167a(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    /* renamed from: a */
    public static void m28165a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: a */
    public static void m28164a(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    /* renamed from: a */
    public static void m28166a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* renamed from: a */
    public static void m28163a(MediaFormat mediaFormat, C9586i iVar) {
        if (iVar != null) {
            m28165a(mediaFormat, "color-transfer", iVar.f22376V);
            m28165a(mediaFormat, "color-standard", iVar.f22379c);
            m28165a(mediaFormat, "color-range", iVar.f22375U);
            m28166a(mediaFormat, "hdr-static-info", iVar.f22377W);
        }
    }
}
