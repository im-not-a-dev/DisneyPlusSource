package com.bamtechmedia.dominguez.keyboard;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.fragment.app.C0532d;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/keyboard/KeyboardStateListener;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "keyboardOpen", "Ljava/util/concurrent/atomic/AtomicBoolean;", "keyboardVisible", "", "getKeyboardVisible", "()Z", "onStart", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "startTracking", "stopTracking", "Companion", "core-ui-framework_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: KeyboardStateListener.kt */
public final class KeyboardStateListener implements C0710d {

    /* renamed from: U */
    private OnGlobalLayoutListener f14046U;

    /* renamed from: V */
    private final C0532d f14047V;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AtomicBoolean f14048c;

    /* renamed from: com.bamtechmedia.dominguez.keyboard.KeyboardStateListener$a */
    /* compiled from: KeyboardStateListener.kt */
    public static final class C6109a {
        private C6109a() {
        }

        public /* synthetic */ C6109a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.keyboard.KeyboardStateListener$b */
    /* compiled from: KeyboardStateListener.kt */
    static final class C6110b implements OnGlobalLayoutListener {

        /* renamed from: U */
        final /* synthetic */ View f14049U;

        /* renamed from: c */
        final /* synthetic */ KeyboardStateListener f14050c;

        C6110b(KeyboardStateListener keyboardStateListener, View view) {
            this.f14050c = keyboardStateListener;
            this.f14049U = view;
        }

        public final void onGlobalLayout() {
            Rect rect = new Rect();
            this.f14049U.getWindowVisibleDisplayFrame(rect);
            View view = this.f14049U;
            C12880j.m40222a((Object) view, "rootView");
            int height = view.getHeight();
            if (((float) (height - rect.bottom)) > ((float) height) * 0.15f) {
                this.f14050c.f14048c.set(true);
            } else {
                this.f14050c.f14048c.set(false);
            }
        }
    }

    static {
        new C6109a(null);
    }

    /* renamed from: e */
    private final void m19526e() {
        View findViewById = this.f14047V.findViewById(16908290);
        if (findViewById != null) {
            ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            if (viewTreeObserver != null) {
                OnGlobalLayoutListener onGlobalLayoutListener = this.f14046U;
                if (onGlobalLayoutListener != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                } else {
                    C12880j.m40227c("globalLayoutListener");
                    throw null;
                }
            }
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: b */
    public final boolean mo18369b() {
        return this.f14048c.get();
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public void mo4129d(C0722m mVar) {
        m19526e();
    }

    /* renamed from: e */
    public /* synthetic */ void mo4130e(C0722m mVar) {
        C0708c.m3733b(this, mVar);
    }

    /* renamed from: f */
    public void mo4131f(C0722m mVar) {
        m19525d();
    }

    /* renamed from: d */
    private final void m19525d() {
        View findViewById = this.f14047V.findViewById(16908290);
        this.f14046U = new C6110b(this, findViewById);
        C12880j.m40222a((Object) findViewById, "rootView");
        ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
        OnGlobalLayoutListener onGlobalLayoutListener = this.f14046U;
        if (onGlobalLayoutListener != null) {
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        } else {
            C12880j.m40227c("globalLayoutListener");
            throw null;
        }
    }
}
