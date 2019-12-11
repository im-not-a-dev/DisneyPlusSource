package com.bamtech.core.networking;

import com.bamtech.core.networking.handlers.ResponseTransformer;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import okhttp3.Request.C14113a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003BG\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u0010R\u0015\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u000f\u001a\u0004\u0018\u00018\u0001¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006\""}, mo31007d2 = {"Lcom/bamtech/core/networking/Request;", "OUT", "EXTRA", "", "client", "Lokhttp3/OkHttpClient;", "builder", "Lokhttp3/Request$Builder;", "Lcom/bamtech/core/networking/OkRequestBuilder;", "transformer", "Lcom/bamtech/core/networking/handlers/ResponseTransformer;", "timeout", "", "timeoutUnit", "Ljava/util/concurrent/TimeUnit;", "extra", "(Lokhttp3/OkHttpClient;Lokhttp3/Request$Builder;Lcom/bamtech/core/networking/handlers/ResponseTransformer;JLjava/util/concurrent/TimeUnit;Ljava/lang/Object;)V", "getBuilder", "()Lokhttp3/Request$Builder;", "getClient", "()Lokhttp3/OkHttpClient;", "getExtra", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTimeout", "()J", "setTimeout", "(J)V", "getTimeoutUnit", "()Ljava/util/concurrent/TimeUnit;", "setTimeoutUnit", "(Ljava/util/concurrent/TimeUnit;)V", "getTransformer", "()Lcom/bamtech/core/networking/handlers/ResponseTransformer;", "networking"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Request.kt */
public final class Request<OUT, EXTRA> {

    /* renamed from: a */
    private final OkHttpClient f5863a;

    /* renamed from: b */
    private final C14113a f5864b;

    /* renamed from: c */
    private final ResponseTransformer<OUT> f5865c;

    /* renamed from: d */
    private long f5866d;

    /* renamed from: e */
    private TimeUnit f5867e;

    /* renamed from: f */
    private final EXTRA f5868f;

    public Request(OkHttpClient okHttpClient, C14113a aVar, ResponseTransformer<? extends OUT> responseTransformer, long j, TimeUnit timeUnit, EXTRA extra) {
        this.f5863a = okHttpClient;
        this.f5864b = aVar;
        this.f5865c = responseTransformer;
        this.f5866d = j;
        this.f5867e = timeUnit;
        this.f5868f = extra;
    }

    /* renamed from: a */
    public final C14113a mo7478a() {
        return this.f5864b;
    }

    /* renamed from: b */
    public final OkHttpClient mo7479b() {
        return this.f5863a;
    }

    /* renamed from: c */
    public final EXTRA mo7480c() {
        return this.f5868f;
    }

    /* renamed from: d */
    public final long mo7481d() {
        return this.f5866d;
    }

    /* renamed from: e */
    public final TimeUnit mo7482e() {
        return this.f5867e;
    }

    /* renamed from: f */
    public final ResponseTransformer<OUT> mo7483f() {
        return this.f5865c;
    }
}
