package okio;

import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\u0000J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0000J\u0016\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo31007d2 = {"Lokio/Segment;", "", "()V", "data", "", "pos", "", "limit", "shared", "", "owner", "([BIIZZ)V", "next", "prev", "compact", "", "pop", "push", "segment", "sharedCopy", "split", "byteCount", "unsharedCopy", "writeTo", "sink", "Companion", "jvm"}, mo31008k = 1, mo31009mv = {1, 1, 11})
/* renamed from: okio.s */
/* compiled from: Segment.kt */
public final class C14295s {

    /* renamed from: a */
    public final byte[] f31900a;

    /* renamed from: b */
    public int f31901b;

    /* renamed from: c */
    public int f31902c;

    /* renamed from: d */
    public boolean f31903d;

    /* renamed from: e */
    public boolean f31904e;

    /* renamed from: f */
    public C14295s f31905f;

    /* renamed from: g */
    public C14295s f31906g;

    /* renamed from: okio.s$a */
    /* compiled from: Segment.kt */
    public static final class C14296a {
        private C14296a() {
        }

        public /* synthetic */ C14296a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C14296a(null);
    }

    public C14295s() {
        this.f31900a = new byte[ContentServiceClientExtras.URL_SIZE_LIMIT];
        this.f31904e = true;
        this.f31903d = false;
    }

    /* renamed from: a */
    public final C14295s mo36459a(C14295s sVar) {
        sVar.f31906g = this;
        sVar.f31905f = this.f31905f;
        C14295s sVar2 = this.f31905f;
        if (sVar2 != null) {
            sVar2.f31906g = sVar;
            this.f31905f = sVar;
            return sVar;
        }
        Intrinsics.throwNpe();
        throw null;
    }

    /* renamed from: b */
    public final C14295s mo36462b() {
        C14295s sVar = this.f31905f;
        if (sVar == this) {
            sVar = null;
        }
        C14295s sVar2 = this.f31906g;
        if (sVar2 != null) {
            sVar2.f31905f = this.f31905f;
            C14295s sVar3 = this.f31905f;
            if (sVar3 != null) {
                sVar3.f31906g = sVar2;
                this.f31905f = null;
                this.f31906g = null;
                return sVar;
            }
            Intrinsics.throwNpe();
            throw null;
        }
        Intrinsics.throwNpe();
        throw null;
    }

    /* renamed from: c */
    public final C14295s mo36463c() {
        this.f31903d = true;
        C14295s sVar = new C14295s(this.f31900a, this.f31901b, this.f31902c, true, false);
        return sVar;
    }

    public C14295s(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f31900a = bArr;
        this.f31901b = i;
        this.f31902c = i2;
        this.f31903d = z;
        this.f31904e = z2;
    }

    /* renamed from: a */
    public final C14295s mo36458a(int i) {
        C14295s sVar;
        if (i > 0 && i <= this.f31902c - this.f31901b) {
            if (i >= 1024) {
                sVar = mo36463c();
            } else {
                C14295s a = C14297t.m45788a();
                C14272b.m45647a(this.f31900a, this.f31901b, a.f31900a, 0, i);
                sVar = a;
            }
            sVar.f31902c = sVar.f31901b + i;
            this.f31901b += i;
            C14295s sVar2 = this.f31906g;
            if (sVar2 != null) {
                sVar2.mo36459a(sVar);
                return sVar;
            }
            Intrinsics.throwNpe();
            throw null;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    /* renamed from: a */
    public final void mo36460a() {
        int i = 0;
        if (this.f31906g != this) {
            C14295s sVar = this.f31906g;
            if (sVar == null) {
                Intrinsics.throwNpe();
                throw null;
            } else if (sVar.f31904e) {
                int i2 = this.f31902c - this.f31901b;
                if (sVar != null) {
                    int i3 = 8192 - sVar.f31902c;
                    if (sVar != null) {
                        if (!sVar.f31903d) {
                            if (sVar != null) {
                                i = sVar.f31901b;
                            } else {
                                Intrinsics.throwNpe();
                                throw null;
                            }
                        }
                        if (i2 <= i3 + i) {
                            C14295s sVar2 = this.f31906g;
                            if (sVar2 != null) {
                                mo36461a(sVar2, i2);
                                mo36462b();
                                C14297t.m45789a(this);
                                return;
                            }
                            Intrinsics.throwNpe();
                            throw null;
                        }
                        return;
                    }
                    Intrinsics.throwNpe();
                    throw null;
                }
                Intrinsics.throwNpe();
                throw null;
            }
        } else {
            throw new IllegalStateException("cannot compact".toString());
        }
    }

    /* renamed from: a */
    public final void mo36461a(C14295s sVar, int i) {
        if (sVar.f31904e) {
            int i2 = sVar.f31902c;
            if (i2 + i > 8192) {
                if (!sVar.f31903d) {
                    int i3 = i2 + i;
                    int i4 = sVar.f31901b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = sVar.f31900a;
                        C14272b.m45647a(bArr, i4, bArr, 0, i2 - i4);
                        sVar.f31902c -= sVar.f31901b;
                        sVar.f31901b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            C14272b.m45647a(this.f31900a, this.f31901b, sVar.f31900a, sVar.f31902c, i);
            sVar.f31902c += i;
            this.f31901b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }
}
