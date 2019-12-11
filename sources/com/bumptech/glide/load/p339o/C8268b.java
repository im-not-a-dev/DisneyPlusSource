package com.bumptech.glide.load.p339o;

import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p332m.C8122d;
import com.bumptech.glide.load.p332m.C8122d.C8123a;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p163g.p413f.p414a.C10657j;
import p163g.p413f.p414a.p423v.C10760b;

/* renamed from: com.bumptech.glide.load.o.b */
/* compiled from: ByteArrayLoader */
public class C8268b<Data> implements C8306n<byte[], Data> {

    /* renamed from: a */
    private final C8271b<Data> f17734a;

    /* renamed from: com.bumptech.glide.load.o.b$a */
    /* compiled from: ByteArrayLoader */
    public static class C8269a implements C8308o<byte[], ByteBuffer> {

        /* renamed from: com.bumptech.glide.load.o.b$a$a */
        /* compiled from: ByteArrayLoader */
        class C8270a implements C8271b<ByteBuffer> {
            C8270a(C8269a aVar) {
            }

            /* renamed from: a */
            public ByteBuffer m24035a(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }

            /* renamed from: a */
            public Class<ByteBuffer> mo21446a() {
                return ByteBuffer.class;
            }
        }

        /* renamed from: a */
        public C8306n<byte[], ByteBuffer> mo19954a(C8314r rVar) {
            return new C8268b(new C8270a(this));
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.o.b$b */
    /* compiled from: ByteArrayLoader */
    public interface C8271b<Data> {
        /* renamed from: a */
        Class<Data> mo21446a();

        /* renamed from: a */
        Data mo21447a(byte[] bArr);
    }

    /* renamed from: com.bumptech.glide.load.o.b$c */
    /* compiled from: ByteArrayLoader */
    private static class C8272c<Data> implements C8122d<Data> {

        /* renamed from: U */
        private final C8271b<Data> f17735U;

        /* renamed from: c */
        private final byte[] f17736c;

        C8272c(byte[] bArr, C8271b<Data> bVar) {
            this.f17736c = bArr;
            this.f17735U = bVar;
        }

        /* renamed from: a */
        public void mo21141a(C10657j jVar, C8123a<? super Data> aVar) {
            aVar.mo21180a(this.f17735U.mo21447a(this.f17736c));
        }

        /* renamed from: b */
        public C8105a mo21142b() {
            return C8105a.LOCAL;
        }

        public void cancel() {
        }

        public void cleanup() {
        }

        /* renamed from: a */
        public Class<Data> mo21140a() {
            return this.f17735U.mo21446a();
        }
    }

    /* renamed from: com.bumptech.glide.load.o.b$d */
    /* compiled from: ByteArrayLoader */
    public static class C8273d implements C8308o<byte[], InputStream> {

        /* renamed from: com.bumptech.glide.load.o.b$d$a */
        /* compiled from: ByteArrayLoader */
        class C8274a implements C8271b<InputStream> {
            C8274a(C8273d dVar) {
            }

            /* renamed from: a */
            public InputStream m24045a(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }

            /* renamed from: a */
            public Class<InputStream> mo21446a() {
                return InputStream.class;
            }
        }

        /* renamed from: a */
        public C8306n<byte[], InputStream> mo19954a(C8314r rVar) {
            return new C8268b(new C8274a(this));
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    public C8268b(C8271b<Data> bVar) {
        this.f17734a = bVar;
    }

    /* renamed from: a */
    public boolean mo19953a(byte[] bArr) {
        return true;
    }

    /* renamed from: a */
    public C8307a<Data> mo19951a(byte[] bArr, int i, int i2, C8115i iVar) {
        return new C8307a<>(new C10760b(bArr), new C8272c(bArr, this.f17734a));
    }
}
