package okhttp3.p688d0;

import java.util.concurrent.ThreadFactory;

/* renamed from: okhttp3.d0.b */
/* compiled from: lambda */
public final /* synthetic */ class C14123b implements ThreadFactory {

    /* renamed from: U */
    private final /* synthetic */ boolean f31326U;

    /* renamed from: c */
    private final /* synthetic */ String f31327c;

    public /* synthetic */ C14123b(String str, boolean z) {
        this.f31327c = str;
        this.f31326U = z;
    }

    public final Thread newThread(Runnable runnable) {
        return C14126e.m44820a(this.f31327c, this.f31326U, runnable);
    }
}
