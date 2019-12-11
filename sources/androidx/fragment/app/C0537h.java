package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.C0460a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p096e.p121h.p134r.C4117i;

/* renamed from: androidx.fragment.app.h */
/* compiled from: FragmentHostCallback */
public abstract class C0537h<E> extends C0534e {

    /* renamed from: U */
    private final Context f2339U;

    /* renamed from: V */
    private final Handler f2340V;

    /* renamed from: W */
    private final int f2341W;

    /* renamed from: X */
    final C0542j f2342X;

    /* renamed from: c */
    private final Activity f2343c;

    C0537h(C0532d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    /* renamed from: a */
    public View mo3021a(int i) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3104a(Fragment fragment) {
    }

    /* renamed from: a */
    public void mo3105a(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.f2339U.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: a */
    public void mo3107a(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: a */
    public void mo3108a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: a */
    public boolean mo3022a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo3109a(String str) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Activity mo3142b() {
        return this.f2343c;
    }

    /* renamed from: b */
    public boolean mo3110b(Fragment fragment) {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Context mo3143c() {
        return this.f2339U;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Handler mo3144d() {
        return this.f2340V;
    }

    /* renamed from: e */
    public abstract E mo3111e();

    /* renamed from: f */
    public LayoutInflater mo3112f() {
        return LayoutInflater.from(this.f2339U);
    }

    /* renamed from: g */
    public int mo3113g() {
        return this.f2341W;
    }

    /* renamed from: h */
    public boolean mo3114h() {
        return true;
    }

    /* renamed from: i */
    public void mo3115i() {
    }

    C0537h(Activity activity, Context context, Handler handler, int i) {
        this.f2342X = new C0542j();
        this.f2343c = activity;
        C4117i.m14096a(context, "context == null");
        this.f2339U = context;
        C4117i.m14096a(handler, "handler == null");
        this.f2340V = handler;
        this.f2341W = i;
    }

    /* renamed from: a */
    public void mo3106a(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (i == -1) {
            C0460a.m2491a(this.f2343c, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }
}
