package p512h.p513c;

import android.app.Application;

/* renamed from: h.c.c */
/* compiled from: DaggerApplication */
public abstract class C11873c extends Application implements C11880i {

    /* renamed from: c */
    volatile C11876f<Object> f27532c;

    /* renamed from: b */
    private void mo11593b() {
        if (this.f27532c == null) {
            synchronized (this) {
                if (this.f27532c == null) {
                    mo11591a().mo11603a(this);
                    if (this.f27532c == null) {
                        throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C11871b<? extends C11873c> mo11591a();

    public C11871b<Object> androidInjector() {
        mo11593b();
        return this.f27532c;
    }

    public void onCreate() {
        super.onCreate();
        mo11593b();
    }
}
