package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;

/* renamed from: androidx.lifecycle.a */
/* compiled from: AndroidViewModel */
public class C0702a extends C0741y {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: c */
    private Application f2984c;

    public C0702a(Application application) {
        this.f2984c = application;
    }

    /* renamed from: y */
    public <T extends Application> T mo4111y() {
        return this.f2984c;
    }
}
