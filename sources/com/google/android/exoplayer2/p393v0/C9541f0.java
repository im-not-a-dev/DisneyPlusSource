package com.google.android.exoplayer2.p393v0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.android.exoplayer2.v0.f0 */
/* compiled from: SystemHandlerWrapper */
final class C9541f0 implements C9562p {

    /* renamed from: a */
    private final Handler f22256a;

    public C9541f0(Handler handler) {
        this.f22256a = handler;
    }

    /* renamed from: a */
    public Looper mo24618a() {
        return this.f22256a.getLooper();
    }

    /* renamed from: b */
    public void mo24624b(int i) {
        this.f22256a.removeMessages(i);
    }

    /* renamed from: a */
    public Message mo24621a(int i, Object obj) {
        return this.f22256a.obtainMessage(i, obj);
    }

    /* renamed from: a */
    public Message mo24619a(int i, int i2, int i3) {
        return this.f22256a.obtainMessage(i, i2, i3);
    }

    /* renamed from: a */
    public Message mo24620a(int i, int i2, int i3, Object obj) {
        return this.f22256a.obtainMessage(i, i2, i3, obj);
    }

    /* renamed from: a */
    public boolean mo24622a(int i) {
        return this.f22256a.sendEmptyMessage(i);
    }

    /* renamed from: a */
    public boolean mo24623a(int i, long j) {
        return this.f22256a.sendEmptyMessageAtTime(i, j);
    }
}
