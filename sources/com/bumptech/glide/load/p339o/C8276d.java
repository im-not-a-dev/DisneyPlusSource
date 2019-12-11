package com.bumptech.glide.load.p339o;

import android.util.Log;
import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p332m.C8122d;
import com.bumptech.glide.load.p332m.C8122d.C8123a;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p163g.p413f.p414a.C10657j;
import p163g.p413f.p414a.p423v.C10760b;
import p163g.p413f.p414a.p424w.C10761a;

/* renamed from: com.bumptech.glide.load.o.d */
/* compiled from: ByteBufferFileLoader */
public class C8276d implements C8306n<File, ByteBuffer> {

    /* renamed from: com.bumptech.glide.load.o.d$a */
    /* compiled from: ByteBufferFileLoader */
    private static final class C8277a implements C8122d<ByteBuffer> {

        /* renamed from: c */
        private final File f17737c;

        C8277a(File file) {
            this.f17737c = file;
        }

        /* renamed from: a */
        public void mo21141a(C10657j jVar, C8123a<? super ByteBuffer> aVar) {
            try {
                aVar.mo21180a(C10761a.m33983a(this.f17737c));
            } catch (IOException e) {
                String str = "ByteBufferFileLoader";
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Failed to obtain ByteBuffer for file", e);
                }
                aVar.mo21179a((Exception) e);
            }
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
        public Class<ByteBuffer> mo21140a() {
            return ByteBuffer.class;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.d$b */
    /* compiled from: ByteBufferFileLoader */
    public static class C8278b implements C8308o<File, ByteBuffer> {
        /* renamed from: a */
        public C8306n<File, ByteBuffer> mo19954a(C8314r rVar) {
            return new C8276d();
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    /* renamed from: a */
    public boolean mo19953a(File file) {
        return true;
    }

    /* renamed from: a */
    public C8307a<ByteBuffer> mo19951a(File file, int i, int i2, C8115i iVar) {
        return new C8307a<>(new C10760b(file), new C8277a(file));
    }
}
