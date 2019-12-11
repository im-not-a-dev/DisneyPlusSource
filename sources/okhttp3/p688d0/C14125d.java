package okhttp3.p688d0;

/* renamed from: okhttp3.d0.d */
/* compiled from: NamedRunnable */
public abstract class C14125d implements Runnable {

    /* renamed from: c */
    protected final String f31329c;

    public C14125d(String str, Object... objArr) {
        this.f31329c = C14126e.m44817a(str, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo35896b();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f31329c);
        try {
            mo35896b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
