package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0709c0;
import p096e.p121h.p134r.C4117i;

/* renamed from: androidx.fragment.app.f */
/* compiled from: FragmentController */
public class C0535f {

    /* renamed from: a */
    private final C0537h<?> f2337a;

    private C0535f(C0537h<?> hVar) {
        this.f2337a = hVar;
    }

    /* renamed from: a */
    public static C0535f m2836a(C0537h<?> hVar) {
        C4117i.m14096a(hVar, "callbacks == null");
        return new C0535f(hVar);
    }

    /* renamed from: b */
    public void mo3127b() {
        this.f2337a.f2342X.mo3235k();
    }

    /* renamed from: c */
    public void mo3131c() {
        this.f2337a.f2342X.mo3237l();
    }

    /* renamed from: d */
    public void mo3132d() {
        this.f2337a.f2342X.mo3241n();
    }

    /* renamed from: e */
    public void mo3133e() {
        this.f2337a.f2342X.mo3243o();
    }

    /* renamed from: f */
    public void mo3134f() {
        this.f2337a.f2342X.mo3250q();
    }

    /* renamed from: g */
    public void mo3135g() {
        this.f2337a.f2342X.mo3251r();
    }

    /* renamed from: h */
    public void mo3136h() {
        this.f2337a.f2342X.mo3253s();
    }

    /* renamed from: i */
    public boolean mo3137i() {
        return this.f2337a.f2342X.mo3258u();
    }

    /* renamed from: j */
    public C0538i mo3138j() {
        return this.f2337a.f2342X;
    }

    /* renamed from: k */
    public void mo3139k() {
        this.f2337a.f2342X.mo3263z();
    }

    /* renamed from: l */
    public Parcelable mo3140l() {
        return this.f2337a.f2342X.mo3179B();
    }

    /* renamed from: a */
    public Fragment mo3118a(String str) {
        return this.f2337a.f2342X.mo3206b(str);
    }

    /* renamed from: b */
    public void mo3128b(boolean z) {
        this.f2337a.f2342X.mo3212b(z);
    }

    /* renamed from: a */
    public void mo3123a(Fragment fragment) {
        C0537h<?> hVar = this.f2337a;
        hVar.f2342X.mo3199a((C0537h) hVar, (C0534e) hVar, fragment);
    }

    /* renamed from: b */
    public boolean mo3129b(Menu menu) {
        return this.f2337a.f2342X.mo3213b(menu);
    }

    /* renamed from: a */
    public View mo3117a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2337a.f2342X.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: b */
    public boolean mo3130b(MenuItem menuItem) {
        return this.f2337a.f2342X.mo3214b(menuItem);
    }

    /* renamed from: a */
    public void mo3121a(Parcelable parcelable) {
        C0537h<?> hVar = this.f2337a;
        if (hVar instanceof C0709c0) {
            hVar.f2342X.mo3188a(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: a */
    public void mo3119a() {
        this.f2337a.f2342X.mo3233j();
    }

    /* renamed from: a */
    public void mo3124a(boolean z) {
        this.f2337a.f2342X.mo3201a(z);
    }

    /* renamed from: a */
    public void mo3120a(Configuration configuration) {
        this.f2337a.f2342X.mo3186a(configuration);
    }

    /* renamed from: a */
    public boolean mo3125a(Menu menu, MenuInflater menuInflater) {
        return this.f2337a.f2342X.mo3202a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean mo3126a(MenuItem menuItem) {
        return this.f2337a.f2342X.mo3203a(menuItem);
    }

    /* renamed from: a */
    public void mo3122a(Menu menu) {
        this.f2337a.f2342X.mo3189a(menu);
    }
}
