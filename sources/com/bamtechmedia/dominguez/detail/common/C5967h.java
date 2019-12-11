package com.bamtechmedia.dominguez.detail.common;

import com.bamtechmedia.dominguez.analytics.C2366i0;
import com.bamtechmedia.dominguez.analytics.C2366i0.C2367a;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import com.bamtechmedia.dominguez.detail.common.p226c0.C5909a;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5948c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/DetailViewModel;", "T", "", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "()V", "contentDetailConfig", "Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;", "getContentDetailConfig", "()Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;", "lifecycleObserver", "Lcom/bamtechmedia/dominguez/detail/common/DetailLifecycleObserver;", "getLifecycleObserver", "()Lcom/bamtechmedia/dominguez/detail/common/DetailLifecycleObserver;", "pageName", "", "getPageName", "()Ljava/lang/String;", "transactionId", "getTransactionId", "transactionIdProvider", "Lcom/bamtechmedia/dominguez/analytics/TransactionIdProvider;", "getTransactionIdProvider", "()Lcom/bamtechmedia/dominguez/analytics/TransactionIdProvider;", "loadUserData", "", "onCleared", "DetailBaseState", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.common.h */
/* compiled from: DetailViewModel.kt */
public abstract class C5967h<T> extends C5741g<T> {

    /* renamed from: com.bamtechmedia.dominguez.detail.common.h$a */
    /* compiled from: DetailViewModel.kt */
    public static abstract class C5968a implements C5943g, C5909a {
        public C5968a(C6008x xVar, List<? extends C6008x> list, Map<String, ? extends Object> map) {
        }
    }

    public C5967h() {
        super(null, 1, null);
    }

    /* renamed from: A */
    public abstract String mo17912A();

    /* renamed from: B */
    public final String mo17913B() {
        return C2367a.m8888a(mo17914C(), mo17912A(), false, 2, null);
    }

    /* renamed from: C */
    public abstract C2366i0 mo17914C();

    /* renamed from: D */
    public abstract void mo17915D();

    public void onCleared() {
        mo17914C().mo11492a(mo17913B());
        super.onCleared();
    }

    /* renamed from: y */
    public abstract C5948c mo17916y();

    /* renamed from: z */
    public final DetailLifecycleObserver mo17917z() {
        return new DetailLifecycleObserver(this, mo17916y());
    }
}
