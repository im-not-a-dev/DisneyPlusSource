package com.google.android.exoplayer2.metadata.p356g;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.google.android.exoplayer2.metadata.g.c */
/* compiled from: EventMessageEncoder */
public final class C8749c {

    /* renamed from: a */
    private final ByteArrayOutputStream f18578a = new ByteArrayOutputStream(DateUtils.FORMAT_NO_NOON);

    /* renamed from: b */
    private final DataOutputStream f18579b = new DataOutputStream(this.f18578a);

    /* renamed from: a */
    public byte[] mo22890a(C8746a aVar) {
        this.f18578a.reset();
        try {
            m25381a(this.f18579b, aVar.f18577c);
            m25381a(this.f18579b, aVar.f18572U != null ? aVar.f18572U : "");
            m25380a(this.f18579b, aVar.f18573V);
            m25380a(this.f18579b, aVar.f18574W);
            this.f18579b.write(aVar.f18575X);
            this.f18579b.flush();
            return this.f18578a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static void m25381a(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: a */
    private static void m25380a(DataOutputStream dataOutputStream, long j) throws IOException {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }
}
