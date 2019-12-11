package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0715i.C0717b;
import androidx.lifecycle.C0722m;
import androidx.lifecycle.C0723n;
import androidx.lifecycle.C0737w;
import p096e.p113e.C3941i;
import p096e.p121h.p135s.C4141f;
import p096e.p121h.p135s.C4141f.C4142a;

/* renamed from: androidx.core.app.f */
/* compiled from: ComponentActivity */
public class C0474f extends Activity implements C0722m, C4142a {
    private C3941i<Class<? extends C0475a>, C0475a> mExtraDataMap = new C3941i<>();
    private C0723n mLifecycleRegistry = new C0723n(this);

    /* renamed from: androidx.core.app.f$a */
    /* compiled from: ComponentActivity */
    public static class C0475a {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C4141f.m14182a(decorView, keyEvent)) {
            return C4141f.m14183a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C4141f.m14182a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public C0715i getLifecycle() {
        return this.mLifecycleRegistry;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0737w.m3795b((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.mo4140a(C0717b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(C0475a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
