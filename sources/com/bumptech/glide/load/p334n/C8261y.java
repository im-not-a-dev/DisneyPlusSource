package com.bumptech.glide.load.p334n;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.bumptech.glide.load.n.y */
/* compiled from: ResourceRecycler */
class C8261y {

    /* renamed from: a */
    private boolean f17720a;

    /* renamed from: b */
    private final Handler f17721b = new Handler(Looper.getMainLooper(), new C8262a());

    /* renamed from: com.bumptech.glide.load.n.y$a */
    /* compiled from: ResourceRecycler */
    private static final class C8262a implements Callback {
        C8262a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C8258v) message.obj).mo21407a();
            return true;
        }
    }

    C8261y() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo21439a(C8258v<?> vVar) {
        if (this.f17720a) {
            this.f17721b.obtainMessage(1, vVar).sendToTarget();
        } else {
            this.f17720a = true;
            vVar.mo21407a();
            this.f17720a = false;
        }
    }
}
