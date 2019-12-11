package com.bumptech.glide.integration.okhttp3;

import android.util.Log;
import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.C8109e;
import com.bumptech.glide.load.p332m.C8122d;
import com.bumptech.glide.load.p332m.C8122d.C8123a;
import com.bumptech.glide.load.p339o.C8292g;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;
import okhttp3.C14235h;
import okhttp3.C14264y;
import okhttp3.Call;
import okhttp3.Call.C14111a;
import okhttp3.Request;
import okhttp3.Request.C14113a;
import okhttp3.Response;
import p163g.p413f.p414a.C10657j;
import p163g.p413f.p414a.p424w.C10765c;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.integration.okhttp3.b */
/* compiled from: OkHttpStreamFetcher */
public class C8102b implements C8122d<InputStream>, C14235h {

    /* renamed from: U */
    private final C8292g f17346U;

    /* renamed from: V */
    private InputStream f17347V;

    /* renamed from: W */
    private C14264y f17348W;

    /* renamed from: X */
    private C8123a<? super InputStream> f17349X;

    /* renamed from: Y */
    private volatile Call f17350Y;

    /* renamed from: c */
    private final C14111a f17351c;

    public C8102b(C14111a aVar, C8292g gVar) {
        this.f17351c = aVar;
        this.f17346U = gVar;
    }

    /* renamed from: a */
    public void mo21141a(C10657j jVar, C8123a<? super InputStream> aVar) {
        C14113a aVar2 = new C14113a();
        aVar2.mo35848b(this.f17346U.mo21464c());
        for (Entry entry : this.f17346U.mo21463b().entrySet()) {
            aVar2.mo35840a((String) entry.getKey(), (String) entry.getValue());
        }
        Request a = aVar2.mo35846a();
        this.f17349X = aVar;
        this.f17350Y = this.f17351c.mo35727a(a);
        this.f17350Y.mo35722a(this);
    }

    /* renamed from: b */
    public C8105a mo21142b() {
        return C8105a.REMOTE;
    }

    public void cancel() {
        Call call = this.f17350Y;
        if (call != null) {
            call.cancel();
        }
    }

    public void cleanup() {
        try {
            if (this.f17347V != null) {
                this.f17347V.close();
            }
        } catch (IOException unused) {
        }
        C14264y yVar = this.f17348W;
        if (yVar != null) {
            yVar.close();
        }
        this.f17349X = null;
    }

    /* renamed from: a */
    public void mo7493a(Call call, IOException iOException) {
        String str = "OkHttpFetcher";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "OkHttp failed to obtain result", iOException);
        }
        this.f17349X.mo21179a((Exception) iOException);
    }

    /* renamed from: a */
    public void mo7494a(Call call, Response response) {
        this.f17348W = response.mo35855a();
        if (response.mo35863f()) {
            C14264y yVar = this.f17348W;
            C10774j.m34012a(yVar);
            this.f17347V = C10765c.m33990a(this.f17348W.mo36277a(), yVar.mo35701b());
            this.f17349X.mo21180a(this.f17347V);
            return;
        }
        this.f17349X.mo21179a((Exception) new C8109e(response.mo35864g(), response.mo35858c()));
    }

    /* renamed from: a */
    public Class<InputStream> mo21140a() {
        return InputStream.class;
    }
}
