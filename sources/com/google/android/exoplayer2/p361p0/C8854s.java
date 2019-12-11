package com.google.android.exoplayer2.p361p0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.exoplayer2.p0.s */
/* compiled from: BaseAudioProcessor */
public abstract class C8854s implements C8840m {

    /* renamed from: b */
    protected int f18888b = -1;

    /* renamed from: c */
    protected int f18889c = -1;

    /* renamed from: d */
    protected int f18890d = -1;

    /* renamed from: e */
    private ByteBuffer f18891e;

    /* renamed from: f */
    private ByteBuffer f18892f;

    /* renamed from: g */
    private boolean f18893g;

    public C8854s() {
        ByteBuffer byteBuffer = C8840m.f18847a;
        this.f18891e = byteBuffer;
        this.f18892f = byteBuffer;
    }

    /* renamed from: a */
    public boolean mo23059a() {
        return this.f18888b != -1;
    }

    /* renamed from: b */
    public ByteBuffer mo23062b() {
        ByteBuffer byteBuffer = this.f18892f;
        this.f18892f = C8840m.f18847a;
        return byteBuffer;
    }

    /* renamed from: c */
    public boolean mo23063c() {
        return this.f18893g && this.f18892f == C8840m.f18847a;
    }

    /* renamed from: d */
    public int mo23064d() {
        return this.f18889c;
    }

    /* renamed from: e */
    public int mo23065e() {
        return this.f18888b;
    }

    /* renamed from: f */
    public int mo23066f() {
        return this.f18890d;
    }

    public final void flush() {
        this.f18892f = C8840m.f18847a;
        this.f18893g = false;
        mo23072i();
    }

    /* renamed from: g */
    public final void mo23068g() {
        this.f18893g = true;
        mo23159j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo23158h() {
        return this.f18892f.hasRemaining();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo23072i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo23159j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo23073k() {
    }

    public final void reset() {
        flush();
        this.f18891e = C8840m.f18847a;
        this.f18888b = -1;
        this.f18889c = -1;
        this.f18890d = -1;
        mo23073k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ByteBuffer mo23156a(int i) {
        if (this.f18891e.capacity() < i) {
            this.f18891e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f18891e.clear();
        }
        ByteBuffer byteBuffer = this.f18891e;
        this.f18892f = byteBuffer;
        return byteBuffer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo23157b(int i, int i2, int i3) {
        if (i == this.f18888b && i2 == this.f18889c && i3 == this.f18890d) {
            return false;
        }
        this.f18888b = i;
        this.f18889c = i2;
        this.f18890d = i3;
        return true;
    }
}
