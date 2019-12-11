package com.bamtechmedia.dominguez.ripcut.glide;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Response;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ripcut/glide/RetryInterceptor;", "Lokhttp3/Interceptor;", "retryCount", "", "(I)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "interceptWithRetry", "Companion", "ripcut_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.ripcut.glide.e */
/* compiled from: RetryInterceptor.kt */
public final class C7134e implements Interceptor {

    /* renamed from: a */
    private final int f15770a;

    /* renamed from: com.bamtechmedia.dominguez.ripcut.glide.e$a */
    /* compiled from: RetryInterceptor.kt */
    public static final class C7135a {
        private C7135a() {
        }

        public /* synthetic */ C7135a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7135a(null);
    }

    public C7134e(int i) {
        this.f15770a = i;
    }

    /* renamed from: a */
    private final Response m21646a(Chain chain, int i) {
        C14100a.m44529c("Loading", new Object[0]);
        Response a = chain.mo35780a(chain.mo35785m0());
        String e = a.mo35861e("x-bamtech-error");
        C12880j.m40222a((Object) a, "response");
        if (a.mo35863f() && e != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ripcut error;");
            sb.append(e);
            sb.append(" on ");
            sb.append(a.mo35870m().mo35837g());
            C14100a.m44526b(sb.toString(), new Object[0]);
            String str = "1002";
            if (i > 0 && C12833x.m40154a((CharSequence) e, (CharSequence) str, false, 2, (Object) null)) {
                a.close();
                Thread.sleep(3000);
                a = m21646a(chain, i - 1);
            } else if (C12833x.m40154a((CharSequence) e, (CharSequence) "1000", false, 2, (Object) null) || C12833x.m40154a((CharSequence) e, (CharSequence) str, false, 2, (Object) null)) {
                a.close();
                throw new IOException(e);
            }
            C12880j.m40222a((Object) a, "if (retryCount > 0 && ba…   response\n            }");
        }
        return a;
    }

    public Response intercept(Chain chain) {
        return m21646a(chain, this.f15770a);
    }

    public /* synthetic */ C7134e(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        this(i);
    }
}
