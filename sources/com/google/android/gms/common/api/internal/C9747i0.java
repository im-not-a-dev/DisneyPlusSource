package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.i0 */
abstract class C9747i0 implements Runnable {

    /* renamed from: c */
    private final /* synthetic */ C9802y f22845c;

    private C9747i0(C9802y yVar) {
        this.f22845c = yVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25116a();

    public void run() {
        this.f22845c.f22992b.lock();
        try {
            if (!Thread.interrupted()) {
                mo25116a();
                this.f22845c.f22992b.unlock();
            }
        } catch (RuntimeException e) {
            this.f22845c.f22991a.mo25242a(e);
        } finally {
            this.f22845c.f22992b.unlock();
        }
    }

    /* synthetic */ C9747i0(C9802y yVar, C9805z zVar) {
        this(yVar);
    }
}
