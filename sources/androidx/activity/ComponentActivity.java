package androidx.activity;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.C0474f;
import androidx.lifecycle.C0707b0;
import androidx.lifecycle.C0709c0;
import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0715i.C0717b;
import androidx.lifecycle.C0720k;
import androidx.lifecycle.C0722m;
import androidx.lifecycle.C0723n;
import androidx.lifecycle.C0737w;
import androidx.savedstate.C0956a;
import androidx.savedstate.C0957b;
import androidx.savedstate.SavedStateRegistry;

public class ComponentActivity extends C0474f implements C0722m, C0709c0, C0957b, C0061c {
    private int mContentLayoutId;
    private final C0723n mLifecycleRegistry = new C0723n(this);
    private final OnBackPressedDispatcher mOnBackPressedDispatcher = new OnBackPressedDispatcher(new C0056a());
    private final C0956a mSavedStateRegistryController = C0956a.m5180a((C0957b) this);
    private C0707b0 mViewModelStore;

    /* renamed from: androidx.activity.ComponentActivity$a */
    class C0056a implements Runnable {
        C0056a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    static final class C0057b {

        /* renamed from: a */
        C0707b0 f156a;

        C0057b() {
        }
    }

    public ComponentActivity() {
        if (getLifecycle() != null) {
            if (VERSION.SDK_INT >= 19) {
                getLifecycle().mo4134a(new C0720k() {
                    /* renamed from: a */
                    public void mo330a(C0722m mVar, C0716a aVar) {
                        if (aVar == C0716a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            getLifecycle().mo4134a(new C0720k() {
                /* renamed from: a */
                public void mo330a(C0722m mVar, C0716a aVar) {
                    if (aVar == C0716a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getViewModelStore().mo4119a();
                    }
                }
            });
            int i = VERSION.SDK_INT;
            if (19 <= i && i <= 23) {
                getLifecycle().mo4134a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public C0715i getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.mo5302a();
    }

    public C0707b0 getViewModelStore() {
        if (getApplication() != null) {
            if (this.mViewModelStore == null) {
                C0057b bVar = (C0057b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.mViewModelStore = bVar.f156a;
                }
                if (this.mViewModelStore == null) {
                    this.mViewModelStore = new C0707b0();
                }
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.mo333a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mSavedStateRegistryController.mo5303a(bundle);
        C0737w.m3795b((Activity) this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C0707b0 b0Var = this.mViewModelStore;
        if (b0Var == null) {
            C0057b bVar = (C0057b) getLastNonConfigurationInstance();
            if (bVar != null) {
                b0Var = bVar.f156a;
            }
        }
        if (b0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0057b bVar2 = new C0057b();
        bVar2.f156a = b0Var;
        return bVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C0715i lifecycle = getLifecycle();
        if (lifecycle instanceof C0723n) {
            ((C0723n) lifecycle).mo4141b(C0717b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo5304b(bundle);
    }
}
