package p163g.p174d.p178b.p179a0;

import java.io.File;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.C12880j;

/* renamed from: g.d.b.a0.h */
/* compiled from: RandomAccessFileWrapper.kt */
public final class C4833h {

    /* renamed from: a */
    private RandomAccessFile f11994a;

    /* renamed from: b */
    private final File f11995b;

    public C4833h(File file) {
        this.f11995b = file;
        mo16247c();
    }

    /* renamed from: a */
    public final void mo16245a() {
        RandomAccessFile randomAccessFile = this.f11994a;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        this.f11994a = null;
    }

    /* renamed from: b */
    public final RandomAccessFile mo16246b() {
        return this.f11994a;
    }

    /* renamed from: c */
    public final RandomAccessFile mo16247c() {
        if (this.f11994a == null) {
            this.f11994a = new RandomAccessFile(this.f11995b, "r");
        }
        RandomAccessFile randomAccessFile = this.f11994a;
        if (randomAccessFile != null) {
            return randomAccessFile;
        }
        C12880j.m40220a();
        throw null;
    }
}
