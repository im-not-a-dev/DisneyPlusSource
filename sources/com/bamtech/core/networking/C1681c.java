package com.bamtech.core.networking;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import okhttp3.C14235h;
import okhttp3.Call;
import okhttp3.Response;
import p520io.reactivex.C11986t;
import p520io.reactivex.C11988v;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00062\u0006\u0010\u0000\u001a\u00020\u0007\u001a\u001c\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0004*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00040\u0006\u001a3\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\f\"\u0006\b\u0000\u0010\u0003\u0018\u0001\"\u0004\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0006H\b\u001a3\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0006\b\u0000\u0010\u0003\u0018\u0001\"\u0004\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0006H\b¨\u0006\u000e"}, mo31007d2 = {"call", "Lio/reactivex/Single;", "Lcom/bamtech/core/networking/Response;", "OUT", "EXTRA", "request", "Lcom/bamtech/core/networking/Request;", "Lokhttp3/Call;", "asCompletable", "Lio/reactivex/Completable;", "", "asMaybe", "Lio/reactivex/Maybe;", "asSingle", "networking-reactivex"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.core.networking.c */
/* compiled from: ReactiveExtensions.kt */
public final class C1681c {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032 \u0010\u0004\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H\u0002 \u0007*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00060\u00060\u0005H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "", "OUT", "EXTRA", "emitter", "Lio/reactivex/SingleEmitter;", "Lcom/bamtech/core/networking/Response;", "kotlin.jvm.PlatformType", "subscribe"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtech.core.networking.c$a */
    /* compiled from: ReactiveExtensions.kt */
    static final class C1682a<T> implements C11988v<T> {

        /* renamed from: a */
        final /* synthetic */ Call f5874a;

        /* renamed from: b */
        final /* synthetic */ Request f5875b;

        /* renamed from: com.bamtech.core.networking.c$a$a */
        /* compiled from: ReactiveExtensions.kt */
        public static final class C1683a implements C14235h {

            /* renamed from: U */
            final /* synthetic */ C11986t f5876U;

            /* renamed from: c */
            final /* synthetic */ C1682a f5877c;

            C1683a(C1682a aVar, C11986t tVar) {
                this.f5877c = aVar;
                this.f5876U = tVar;
            }

            /* renamed from: a */
            public void mo7493a(Call call, IOException iOException) {
                C11986t tVar = this.f5876U;
                String str = "emitter";
                C12880j.m40222a((Object) tVar, str);
                if (!tVar.isDisposed()) {
                    try {
                        this.f5877c.f5875b.mo7483f().mo7524a(iOException, call.mo35725m0());
                    } catch (Throwable th) {
                        C11986t tVar2 = this.f5876U;
                        C12880j.m40222a((Object) tVar2, str);
                        if (!tVar2.isDisposed()) {
                            this.f5876U.onError(th);
                        }
                    }
                }
            }

            /* renamed from: a */
            public void mo7494a(Call call, Response response) {
                try {
                    this.f5876U.onSuccess(this.f5877c.f5875b.mo7483f().mo7525a(response));
                } catch (Throwable th) {
                    C11986t tVar = this.f5876U;
                    C12880j.m40222a((Object) tVar, "emitter");
                    if (!tVar.isDisposed()) {
                        if (th instanceof IOException) {
                            mo7493a(call, th);
                        } else {
                            this.f5876U.onError(th);
                        }
                    }
                }
            }
        }

        C1682a(Call call, Request request) {
            this.f5874a = call;
            this.f5875b = request;
        }

        /* renamed from: a */
        public final void mo7288a(C11986t<Response<OUT>> tVar) {
            this.f5874a.mo35722a(new C1683a(this, tVar));
        }
    }

    /* renamed from: a */
    public static final <OUT, EXTRA> Single<Response<OUT>> m7780a(Request<? extends OUT, ? extends EXTRA> request, Call call) {
        Single<Response<OUT>> a = Single.m38392a((C11988v<T>) new C1682a<T>(call, request));
        C12880j.m40222a((Object) a, "Single.create<Response<O…       }\n        })\n    }");
        return a;
    }
}
