package com.bamtechmedia.dominguez.analytics;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/TransactionIdProvider;", "", "clearAll", "", "clearTransactionId", "forPageName", "", "transactionId", "pageName", "addToCache", "", "analyticsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.i0 */
/* compiled from: TransactionIdProvider.kt */
public interface C2366i0 {

    /* renamed from: com.bamtechmedia.dominguez.analytics.i0$a */
    /* compiled from: TransactionIdProvider.kt */
    public static final class C2367a {
        /* renamed from: a */
        public static /* synthetic */ String m8888a(C2366i0 i0Var, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                return i0Var.mo11491a(str, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transactionId");
        }
    }

    /* renamed from: a */
    String mo11491a(String str, boolean z);

    /* renamed from: a */
    void mo11492a(String str);

    /* renamed from: e */
    void mo11493e();
}
