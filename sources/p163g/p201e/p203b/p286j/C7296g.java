package p163g.p201e.p203b.p286j;

import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.C0741y;
import com.bamtechmedia.dominguez.analytics.C2348e;
import com.bamtechmedia.dominguez.analytics.C2348e.C2349a;
import com.bamtechmedia.dominguez.analytics.p059q0.C2450b;
import com.bamtechmedia.dominguez.analytics.p059q0.C2451c;
import kotlin.C12907r;
import kotlin.jvm.internal.C12880j;
import okhttp3.HttpUrl;
import p520io.reactivex.Observable;
import p520io.reactivex.subjects.C11983e;
import p520io.reactivex.subjects.PublishSubject;

/* renamed from: g.e.b.j.g */
/* compiled from: DeepLinkViewModel.kt */
public final class C7296g extends C0741y implements C7300k {

    /* renamed from: U */
    private HttpUrl f16047U;

    /* renamed from: V */
    private final Observable<HttpUrl> f16048V = this.f16051c;

    /* renamed from: W */
    private final C2348e f16049W;

    /* renamed from: X */
    private final C2451c f16050X;

    /* renamed from: c */
    private final C11983e<HttpUrl> f16051c;

    public C7296g(C2348e eVar, C2451c cVar) {
        this.f16049W = eVar;
        this.f16050X = cVar;
        PublishSubject q = PublishSubject.m38553q();
        C12880j.m40222a((Object) q, "PublishSubject.create()");
        this.f16051c = q;
    }

    /* renamed from: a */
    public void mo20102a(Intent intent, boolean z) {
        Uri data = intent.getData();
        if (data != null) {
            String uri = data.buildUpon().scheme("https").build().toString();
            C12880j.m40222a((Object) uri, "uri.buildUpon().scheme(\"https\").build().toString()");
            this.f16047U = intent.getData() != null ? HttpUrl.m44643e(uri) : null;
            if (z) {
                HttpUrl httpUrl = this.f16047U;
                if (httpUrl != null) {
                    this.f16051c.onNext(httpUrl);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo20104b(String str, String str2) {
        C2349a.m8854a(this.f16049W, C13173j0.m40360b(C12907r.m40244a("deeplinkUrl", str), C12907r.m40244a("deeplinkPageLanding", str2)), null, 2, null);
    }

    /* renamed from: o */
    public Observable<HttpUrl> mo20105o() {
        return this.f16048V;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        this.f16050X.mo11584a(null);
        super.onCleared();
    }

    /* renamed from: s */
    public void mo20106s() {
        this.f16047U = null;
    }

    /* renamed from: x */
    public HttpUrl mo20107x() {
        return this.f16047U;
    }

    /* renamed from: y */
    public final void mo20108y() {
        this.f16050X.mo11584a(null);
        this.f16047U = null;
    }

    /* renamed from: a */
    public final void mo20103a(String str, String str2) {
        this.f16050X.mo11584a(new C2450b(str, str2));
    }
}
