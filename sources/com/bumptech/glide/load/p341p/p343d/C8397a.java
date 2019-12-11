package com.bumptech.glide.load.p341p.p343d;

import com.bumptech.glide.load.p332m.C8124e;
import com.bumptech.glide.load.p332m.C8124e.C8125a;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.p.d.a */
/* compiled from: ByteBufferRewinder */
public class C8397a implements C8124e<ByteBuffer> {

    /* renamed from: a */
    private final ByteBuffer f17900a;

    /* renamed from: com.bumptech.glide.load.p.d.a$a */
    /* compiled from: ByteBufferRewinder */
    public static class C8398a implements C8125a<ByteBuffer> {
        /* renamed from: a */
        public C8124e<ByteBuffer> mo21183a(ByteBuffer byteBuffer) {
            return new C8397a(byteBuffer);
        }

        /* renamed from: a */
        public Class<ByteBuffer> mo21184a() {
            return ByteBuffer.class;
        }
    }

    public C8397a(ByteBuffer byteBuffer) {
        this.f17900a = byteBuffer;
    }

    public void cleanup() {
    }

    /* renamed from: a */
    public ByteBuffer m24412a() {
        this.f17900a.position(0);
        return this.f17900a;
    }
}
