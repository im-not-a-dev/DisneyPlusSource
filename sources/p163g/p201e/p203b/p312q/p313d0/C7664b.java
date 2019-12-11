package p163g.p201e.p203b.p312q.p313d0;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.analytics.C2334a;
import com.bamtechmedia.dominguez.core.content.C3653c;
import com.bamtechmedia.dominguez.core.content.C3653c.C3654a;
import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.C3690l;
import com.bamtechmedia.dominguez.core.content.C3692n;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.C3791v;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import p163g.p201e.p203b.p286j.C7300k;
import p163g.p201e.p203b.p299m.C7536a;
import p163g.p201e.p203b.p299m.C7536a.C7538b;
import p163g.p201e.p203b.p299m.C7543f.C7544a;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p312q.C7653a0;
import p163g.p201e.p203b.p312q.C7689j;
import p163g.p201e.p203b.p312q.C7718y;
import p163g.p201e.p203b.p312q.C7719z;
import p512h.p513c.p514k.C11890i;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001IB\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0002J\u0012\u00102\u001a\u00020-2\b\u00103\u001a\u0004\u0018\u000104H\u0002J\u0010\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020/H\u0002J\"\u00107\u001a\u00020-2\u0006\u00108\u001a\u00020/2\u0006\u0010.\u001a\u00020/2\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\u0018\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020/2\u0006\u0010>\u001a\u00020/H\u0016J\u0012\u0010?\u001a\u00020-2\b\u0010@\u001a\u0004\u0018\u000101H\u0016J&\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010F2\b\u0010@\u001a\u0004\u0018\u000101H\u0016J\u001a\u0010G\u001a\u00020-2\u0006\u0010H\u001a\u00020B2\b\u0010@\u001a\u0004\u0018\u000101H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006J"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/globalnav/tab/TabFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/dialogs/AlertDialogCallback;", "()V", "activePageOverride", "Lcom/bamtechmedia/dominguez/analytics/ActivePageOverride;", "getActivePageOverride", "()Lcom/bamtechmedia/dominguez/analytics/ActivePageOverride;", "setActivePageOverride", "(Lcom/bamtechmedia/dominguez/analytics/ActivePageOverride;)V", "contentTypeRouter", "Lcom/bamtechmedia/dominguez/core/content/ContentTypeRouter;", "getContentTypeRouter", "()Lcom/bamtechmedia/dominguez/core/content/ContentTypeRouter;", "setContentTypeRouter", "(Lcom/bamtechmedia/dominguez/core/content/ContentTypeRouter;)V", "deepLinks", "Lcom/bamtechmedia/dominguez/deeplink/DeepLinks;", "getDeepLinks", "()Lcom/bamtechmedia/dominguez/deeplink/DeepLinks;", "setDeepLinks", "(Lcom/bamtechmedia/dominguez/deeplink/DeepLinks;)V", "dialogRouter", "Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;", "getDialogRouter", "()Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;", "setDialogRouter", "(Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;)V", "globalNavTab", "Lcom/bamtechmedia/dominguez/globalnav/GlobalNavTab;", "getGlobalNavTab", "()Lcom/bamtechmedia/dominguez/globalnav/GlobalNavTab;", "router", "Lcom/bamtechmedia/dominguez/globalnav/tab/TabRouter;", "getRouter", "()Lcom/bamtechmedia/dominguez/globalnav/tab/TabRouter;", "setRouter", "(Lcom/bamtechmedia/dominguez/globalnav/tab/TabRouter;)V", "viewModel", "Lcom/bamtechmedia/dominguez/globalnav/tab/TabViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/globalnav/tab/TabViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/globalnav/tab/TabViewModel;)V", "handleBackFromUpNext", "", "resultCode", "", "extras", "Landroid/os/Bundle;", "handleBackToDetails", "playable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "handleDeeplinkErrorResult", "code", "onActivityResult", "requestCode", "data", "Landroid/content/Intent;", "onAlertDialogAction", "", "requestId", "which", "onCreate", "savedInstanceState", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "globalNav_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.q.d0.b */
/* compiled from: TabFragment.kt */
public final class C7664b extends C11890i implements C7536a {

    /* renamed from: b0 */
    public static final C7665a f16695b0 = new C7665a(null);

    /* renamed from: U */
    public C7673i f16696U;

    /* renamed from: V */
    public C3653c f16697V;

    /* renamed from: W */
    public C7300k f16698W;

    /* renamed from: X */
    public C7677l f16699X;

    /* renamed from: Y */
    public C2334a f16700Y;

    /* renamed from: Z */
    public C7547h f16701Z;

    /* renamed from: a0 */
    private HashMap f16702a0;

    /* renamed from: g.e.b.q.d0.b$a */
    /* compiled from: TabFragment.kt */
    public static final class C7665a {
        private C7665a() {
        }

        /* renamed from: a */
        public final C7664b mo20588a(C7689j jVar) {
            C7664b bVar = new C7664b();
            bVar.setArguments(C5833g.m18829a(C12907r.m40244a("globalNavTab", jVar)));
            return bVar;
        }

        public /* synthetic */ C7665a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m22654a(int i, Bundle bundle) {
        if (i == -1) {
            C3693o oVar = bundle != null ? (C3693o) bundle.getParcelable("key_playable") : null;
            Serializable serializable = bundle != null ? bundle.getSerializable("key_tab") : null;
            if (!(serializable instanceof C3690l)) {
                serializable = null;
            }
            C3690l lVar = (C3690l) serializable;
            if (lVar == null) {
                lVar = C3690l.NONE;
            }
            String str = "contentTypeRouter";
            if (oVar instanceof C3692n) {
                C3653c cVar = this.f16697V;
                if (cVar != null) {
                    cVar.mo13291a((C3692n) oVar, lVar, true);
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                    throw null;
                }
            } else if (oVar instanceof C3791v) {
                C3653c cVar2 = this.f16697V;
                if (cVar2 != null) {
                    cVar2.mo13293a((C3791v) oVar, lVar, true);
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                    throw null;
                }
            } else if (oVar instanceof C3685g) {
                String C = ((C3685g) oVar).mo12873C();
                if (C != null) {
                    C3653c cVar3 = this.f16697V;
                    if (cVar3 != null) {
                        cVar3.mo13294a(C, lVar, true);
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                        throw null;
                    }
                }
            } else {
                Timber.m44532e("unhandled route from playback", new Object[0]);
            }
        }
    }

    /* renamed from: b */
    private final void m22656b(int i) {
        String str = "dialogRouter";
        if (i == 7001) {
            C7547h hVar = this.f16701Z;
            if (hVar != null) {
                C7544a aVar = new C7544a();
                aVar.mo20466a(C7718y.deeplink_error_dialog);
                aVar.mo20484i(Integer.valueOf(C7653a0.error_medianotallowed_parental_control));
                aVar.mo20480g(Integer.valueOf(C7653a0.btn_ok));
                hVar.mo20491b(aVar.mo20465a());
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException(str);
            throw null;
        } else if (i == 7002) {
            C7547h hVar2 = this.f16701Z;
            if (hVar2 != null) {
                C7544a aVar2 = new C7544a();
                aVar2.mo20466a(C7718y.deeplink_error_dialog);
                aVar2.mo20484i(Integer.valueOf(C7653a0.error_mediaunavailable));
                aVar2.mo20480g(Integer.valueOf(C7653a0.btn_ok));
                hVar2.mo20491b(aVar2.mo20465a());
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException(str);
            throw null;
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f16702a0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: d */
    public boolean mo11888d() {
        return C7538b.m22446a(this);
    }

    /* renamed from: o */
    public final C7689j mo20587o() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            C7689j jVar = (C7689j) arguments.getParcelable("globalNavTab");
            if (jVar != null) {
                return jVar;
            }
        }
        throw new AssertionError("globalNavTab was not specified");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Object obj = null;
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (i == 7000 || i == 7003) {
            if (extras != null) {
                obj = extras.get("playable");
            }
            m22655a((C3693o) obj);
        } else if (i == 7004) {
            m22654a(i2, extras);
        }
        m22656b(i2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2334a aVar = this.f16700Y;
        if (aVar != null) {
            aVar.mo11442a((Fragment) this);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("activePageOverride");
            throw null;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C7719z.fragment_tab, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C7300k kVar = this.f16698W;
        if (kVar != null) {
            HttpUrl x = kVar.mo20107x();
            String str = "viewModel";
            if (x != null) {
                C7677l lVar = this.f16699X;
                if (lVar != null) {
                    lVar.mo20594a(mo20587o(), x);
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                    throw null;
                }
            } else if (bundle == null) {
                C7677l lVar2 = this.f16699X;
                if (lVar2 != null) {
                    lVar2.mo20593a(mo20587o());
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                    throw null;
                }
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("deepLinks");
            throw null;
        }
    }

    /* renamed from: a */
    private final void m22655a(C3693o oVar) {
        String str = "contentTypeRouter";
        if (oVar instanceof C3692n) {
            C3653c cVar = this.f16697V;
            if (cVar != null) {
                C3654a.m12425a(cVar, (C3692n) oVar, (C3690l) null, false, 6, (Object) null);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
        } else if (oVar instanceof C3791v) {
            C3653c cVar2 = this.f16697V;
            if (cVar2 != null) {
                C3654a.m12427a(cVar2, (C3791v) oVar, (C3690l) null, false, 6, (Object) null);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
        } else if (oVar instanceof C3685g) {
            C3653c cVar3 = this.f16697V;
            if (cVar3 != null) {
                C3654a.m12428a(cVar3, ((C3685g) oVar).mo12874D(), (C3690l) null, false, 6, (Object) null);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
        } else {
            Timber.m44532e("unhandled back to details result", new Object[0]);
        }
    }

    /* renamed from: a */
    public boolean mo11887a(int i, int i2) {
        if (i != C7718y.wifi_required_dialog) {
            return false;
        }
        if (i2 == -2) {
            C7673i iVar = this.f16696U;
            if (iVar != null) {
                iVar.mo20591b();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("router");
                throw null;
            }
        }
        return true;
    }
}
