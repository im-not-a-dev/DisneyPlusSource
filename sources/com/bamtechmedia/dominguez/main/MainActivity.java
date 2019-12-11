package com.bamtechmedia.dominguez.main;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.C0538i;
import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0741y;
import com.bamtechmedia.dominguez.auth.p064p0.C2760a;
import com.bamtechmedia.dominguez.background.MainActivityBackgroundResponder;
import com.bamtechmedia.dominguez.collections.C3330h;
import com.bamtechmedia.dominguez.config.C3517b;
import com.bamtechmedia.dominguez.core.framework.C5735b;
import com.bamtechmedia.dominguez.core.p087h.C3828d;
import com.bamtechmedia.dominguez.core.p217m.C5772a;
import com.bamtechmedia.dominguez.core.utils.C5820c;
import com.bamtechmedia.dominguez.core.utils.C5866s;
import com.bamtechmedia.dominguez.playback.p236l.C6333a;
import com.google.common.base.Optional;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p202a.C5359b;
import p163g.p201e.p202a.C5363f;
import p163g.p201e.p202a.C5364g;
import p163g.p201e.p203b.p299m.C7536a;
import p163g.p201e.p203b.p299m.C7536a.C7538b;
import p163g.p201e.p203b.p319v.C7900q;
import p163g.p413f.p414a.C10652e;
import p512h.C11868a;
import p520io.reactivex.subjects.C11976a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 f2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001fB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0002J\"\u0010F\u001a\u00020C2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020H2\b\u0010J\u001a\u0004\u0018\u00010EH\u0014J\u0018\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020H2\u0006\u0010N\u001a\u00020HH\u0016J\b\u0010O\u001a\u00020CH\u0016J\u0012\u0010P\u001a\u00020C2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0014J\u0018\u0010S\u001a\u00020L2\u0006\u0010T\u001a\u00020H2\u0006\u0010U\u001a\u00020VH\u0016J\u0010\u0010W\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0014J\u0010\u0010X\u001a\u00020C2\u0006\u0010Y\u001a\u00020HH\u0016J\u0018\u0010Z\u001a\u00020C2\u0006\u0010[\u001a\u00020H2\u0006\u0010\\\u001a\u00020LH\u0016J,\u0010Z\u001a\u00020C2\u0006\u0010]\u001a\u00020^2\b\u0010_\u001a\u0004\u0018\u00010^2\b\u0010`\u001a\u0004\u0018\u00010a2\u0006\u0010\\\u001a\u00020LH\u0016J \u0010b\u001a\u00020C2\u0006\u0010[\u001a\u00020H2\u0006\u0010c\u001a\u00020H2\u0006\u0010\\\u001a\u00020LH\u0016J<\u0010d\u001a\u00020C2\u0006\u0010]\u001a\u00020^2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010^2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010a2\b\b\u0002\u0010e\u001a\u00020H2\b\b\u0002\u0010\\\u001a\u00020LH\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u00038\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\b\u0012\u0004\u0012\u0002000/8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00105\u001a\b\u0012\u0004\u0012\u000207068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010<\u001a\u00020=8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006g"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/main/MainActivity;", "Lcom/bamtechmedia/dominguez/core/framework/BaseActivity;", "Lcom/bamtechmedia/dominguez/main/SnackMessenger;", "Lcom/bamtechmedia/dominguez/dialogs/AlertDialogCallback;", "()V", "activityResultSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/bamtechmedia/dominguez/core/model/ActivityResult;", "getActivityResultSubject", "()Lio/reactivex/subjects/BehaviorSubject;", "appConfig", "Lcom/bamtechmedia/dominguez/config/AppConfig;", "getAppConfig", "()Lcom/bamtechmedia/dominguez/config/AppConfig;", "setAppConfig", "(Lcom/bamtechmedia/dominguez/config/AppConfig;)V", "autoLoginOptional", "Lcom/google/common/base/Optional;", "Lcom/bamtechmedia/dominguez/auth/autologin/AutoLogin;", "getAutoLoginOptional", "()Lcom/google/common/base/Optional;", "setAutoLoginOptional", "(Lcom/google/common/base/Optional;)V", "backgroundResponder", "Lcom/bamtechmedia/dominguez/background/MainActivityBackgroundResponder;", "getBackgroundResponder", "()Lcom/bamtechmedia/dominguez/background/MainActivityBackgroundResponder;", "setBackgroundResponder", "(Lcom/bamtechmedia/dominguez/background/MainActivityBackgroundResponder;)V", "clearDataRequest", "getClearDataRequest", "()Lcom/bamtechmedia/dominguez/dialogs/AlertDialogCallback;", "setClearDataRequest", "(Lcom/bamtechmedia/dominguez/dialogs/AlertDialogCallback;)V", "collectionCache", "Lcom/bamtechmedia/dominguez/collections/CollectionCache;", "getCollectionCache", "()Lcom/bamtechmedia/dominguez/collections/CollectionCache;", "setCollectionCache", "(Lcom/bamtechmedia/dominguez/collections/CollectionCache;)V", "dispatchingLifecycleObserver", "Lcom/bamtechmedia/dominguez/main/DispatchingLifecycleObserver;", "getDispatchingLifecycleObserver", "()Lcom/bamtechmedia/dominguez/main/DispatchingLifecycleObserver;", "setDispatchingLifecycleObserver", "(Lcom/bamtechmedia/dominguez/main/DispatchingLifecycleObserver;)V", "lazyApplicationRestartListener", "Ldagger/Lazy;", "Lcom/bamtechmedia/dominguez/core/app/ApplicationRestartListener;", "getLazyApplicationRestartListener", "()Ldagger/Lazy;", "setLazyApplicationRestartListener", "(Ldagger/Lazy;)V", "paywallServicesInteractor", "Ljavax/inject/Provider;", "Lcom/bamtechmedia/dominguez/paywall/PaywallServicesInteractor;", "getPaywallServicesInteractor", "()Ljavax/inject/Provider;", "setPaywallServicesInteractor", "(Ljavax/inject/Provider;)V", "viewModel", "Landroidx/lifecycle/ViewModel;", "getViewModel", "()Landroidx/lifecycle/ViewModel;", "setViewModel", "(Landroidx/lifecycle/ViewModel;)V", "handleIntent", "", "intent", "Landroid/content/Intent;", "onActivityResult", "requestCode", "", "resultCode", "data", "onAlertDialogAction", "", "requestId", "which", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "onNewIntent", "onTrimMemory", "level", "showMessage", "messageId", "applyBottomOffset", "message", "", "actionLabel", "callback", "Lcom/google/android/material/snackbar/Snackbar$Callback;", "showMessageUserMustDismiss", "dismissTextId", "showSnackBar", "duration", "Companion", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MainActivity.kt */
public final class MainActivity extends C5735b implements C6205v, C7536a {

    /* renamed from: i0 */
    public static final C6124a f14065i0 = new C6124a(null);

    /* renamed from: Y */
    public C0741y f14066Y;

    /* renamed from: Z */
    public C7536a f14067Z;

    /* renamed from: a0 */
    public C6127c f14068a0;

    /* renamed from: b0 */
    public C11868a<C3828d> f14069b0;

    /* renamed from: c0 */
    public C3517b f14070c0;

    /* renamed from: d0 */
    public MainActivityBackgroundResponder f14071d0;

    /* renamed from: e0 */
    public Optional<C2760a> f14072e0;

    /* renamed from: f0 */
    public C3330h f14073f0;

    /* renamed from: g0 */
    public Provider<C7900q> f14074g0;

    /* renamed from: h0 */
    private final C11976a<C5772a> f14075h0;

    /* renamed from: com.bamtechmedia.dominguez.main.MainActivity$a */
    /* compiled from: MainActivity.kt */
    public static final class C6124a implements C6333a {
        private C6124a() {
        }

        /* renamed from: a */
        public Intent mo18747a(Context context, String str) {
            Intent intent = new Intent(context, MainActivity.class);
            intent.putExtra(str, true).addFlags(67108864);
            return intent;
        }

        public /* synthetic */ C6124a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MainActivity() {
        C11976a<C5772a> p = C11976a.m38563p();
        C12880j.m40222a((Object) p, "BehaviorSubject.create()");
        this.f14075h0 = p;
    }

    /* renamed from: c */
    private final void m19535c(Intent intent) {
        MainActivityBackgroundResponder mainActivityBackgroundResponder = this.f14071d0;
        if (mainActivityBackgroundResponder != null) {
            mainActivityBackgroundResponder.mo12182a(intent);
            String str = "notificationId";
            if (intent.hasExtra(str)) {
                NotificationManagerCompat.from(this).cancel(intent.getIntExtra(str, -1));
            }
            if (intent.getBooleanExtra("restart", false)) {
                C11868a<C3828d> aVar = this.f14069b0;
                if (aVar != null) {
                    ((C3828d) aVar.get()).mo13751b();
                } else {
                    C12880j.m40227c("lazyApplicationRestartListener");
                    throw null;
                }
            }
        } else {
            C12880j.m40227c("backgroundResponder");
            throw null;
        }
    }

    /* renamed from: a */
    public boolean mo11887a(int i, int i2) {
        if (i == C5363f.force_update_dialog && i2 == -1) {
            C3517b bVar = this.f14070c0;
            if (bVar != null) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(bVar.mo12728c())));
                finish();
                return true;
            }
            C12880j.m40227c("appConfig");
            throw null;
        } else if (i != C5363f.clear_data_dialog) {
            return false;
        } else {
            C7536a aVar = this.f14067Z;
            if (aVar != null) {
                return aVar.mo11887a(i, i2);
            }
            C12880j.m40227c("clearDataRequest");
            throw null;
        }
    }

    /* renamed from: d */
    public boolean mo11888d() {
        return C7538b.m22446a(this);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Optional<C2760a> optional = this.f14072e0;
        if (optional != null) {
            C2760a aVar = (C2760a) optional.mo27107c();
            if (aVar != null) {
                aVar.mo11776a(i, i2, intent);
            }
            this.f14075h0.onNext(new C5772a(i, i2, intent));
            Provider<C7900q> provider = this.f14074g0;
            if (provider != null) {
                ((C7900q) provider.get()).mo20740a(i, i2, intent);
            } else {
                C12880j.m40227c("paywallServicesInteractor");
                throw null;
            }
        } else {
            C12880j.m40227c("autoLoginOptional");
            throw null;
        }
    }

    public void onBackPressed() {
        C0538i supportFragmentManager = getSupportFragmentManager();
        C12880j.m40222a((Object) supportFragmentManager, "supportFragmentManager");
        if (!C5820c.m18813a(supportFragmentManager)) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getResources().getBoolean(C5359b.portrait_only)) {
            setRequestedOrientation(1);
        }
        if (bundle == null) {
            Intent intent = getIntent();
            C12880j.m40222a((Object) intent, "intent");
            m19535c(intent);
        }
        setContentView(C5364g.activity_main);
        Window window = getWindow();
        C12880j.m40222a((Object) window, "window");
        View decorView = window.getDecorView();
        C12880j.m40222a((Object) decorView, "window.decorView");
        decorView.setSystemUiVisibility(1280);
        C6127c cVar = this.f14068a0;
        if (cVar != null) {
            C0715i lifecycle = getLifecycle();
            C12880j.m40222a((Object) lifecycle, "lifecycle");
            cVar.mo18748a(lifecycle);
            Optional<C2760a> optional = this.f14072e0;
            if (optional == null) {
                C12880j.m40227c("autoLoginOptional");
                throw null;
            } else if (optional != null) {
                C2760a aVar = (C2760a) optional.mo27107c();
                if (aVar != null) {
                    aVar.mo11777a(this);
                }
            }
        } else {
            C12880j.m40227c("dispatchingLifecycleObserver");
            throw null;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C0538i supportFragmentManager = getSupportFragmentManager();
        C12880j.m40222a((Object) supportFragmentManager, "supportFragmentManager");
        if (C5866s.m18914a(supportFragmentManager, i)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m19535c(intent);
    }

    public void onTrimMemory(int i) {
        C10652e.m33418b((Context) this).mo27517a();
        if (i > 20) {
            C3330h hVar = this.f14073f0;
            if (hVar != null) {
                hVar.mo12350e();
            } else {
                C12880j.m40227c("collectionCache");
                throw null;
            }
        }
        super.onTrimMemory(i);
    }
}
