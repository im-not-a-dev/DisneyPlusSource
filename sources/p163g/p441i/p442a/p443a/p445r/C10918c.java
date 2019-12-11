package p163g.p441i.p442a.p443a.p445r;

import p163g.p441i.p442a.p443a.C10899c;
import p163g.p441i.p442a.p443a.p448u.C10934a;

/* renamed from: g.i.a.a.r.c */
/* compiled from: IOContext */
public class C10918c {

    /* renamed from: a */
    protected final boolean f25910a;

    /* renamed from: b */
    protected final C10934a f25911b;

    /* renamed from: c */
    protected byte[] f25912c;

    /* renamed from: d */
    protected char[] f25913d;

    /* renamed from: e */
    protected char[] f25914e;

    public C10918c(C10934a aVar, Object obj, boolean z) {
        this.f25911b = aVar;
        this.f25910a = z;
    }

    /* renamed from: d */
    private IllegalArgumentException m34451d() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }

    /* renamed from: a */
    public void mo28107a(C10899c cVar) {
    }

    /* renamed from: a */
    public char[] mo28113a() {
        mo28108a((Object) this.f25913d);
        char[] b = this.f25911b.mo28173b(1);
        this.f25913d = b;
        return b;
    }

    /* renamed from: b */
    public byte[] mo28115b() {
        mo28108a((Object) this.f25912c);
        byte[] a = this.f25911b.mo28171a(1);
        this.f25912c = a;
        return a;
    }

    /* renamed from: c */
    public boolean mo28116c() {
        return this.f25910a;
    }

    /* renamed from: a */
    public void mo28109a(byte[] bArr) {
        if (bArr != null) {
            mo28110a(bArr, this.f25912c);
            this.f25912c = null;
            this.f25911b.mo28169a(1, bArr);
        }
    }

    /* renamed from: b */
    public void mo28114b(char[] cArr) {
        if (cArr != null) {
            mo28112a(cArr, this.f25914e);
            this.f25914e = null;
            this.f25911b.mo28170a(3, cArr);
        }
    }

    /* renamed from: a */
    public void mo28111a(char[] cArr) {
        if (cArr != null) {
            mo28112a(cArr, this.f25913d);
            this.f25913d = null;
            this.f25911b.mo28170a(1, cArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28108a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28110a(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw m34451d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28112a(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw m34451d();
        }
    }
}
