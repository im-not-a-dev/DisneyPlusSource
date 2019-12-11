package com.bamtechmedia.dominguez.core.framework;

import androidx.lifecycle.C0741y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p503n.p504a.C11790c0;
import p520io.reactivex.subjects.C11978b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/framework/AutoDisposeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "scopeSubject", "Lio/reactivex/subjects/CompletableSubject;", "viewModelScope", "Lcom/uber/autodispose/ScopeProvider;", "getViewModelScope", "()Lcom/uber/autodispose/ScopeProvider;", "onCleared", "", "core-ui-framework_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.framework.a */
/* compiled from: AutoDisposeViewModel.kt */
public class C5733a extends C0741y {
    /* access modifiers changed from: private */
    public final C11978b scopeSubject;
    private final C11790c0 viewModelScope = new C5734a(this);

    /* renamed from: com.bamtechmedia.dominguez.core.framework.a$a */
    /* compiled from: AutoDisposeViewModel.kt */
    static final class C5734a implements C11790c0 {

        /* renamed from: a */
        final /* synthetic */ C5733a f13497a;

        C5734a(C5733a aVar) {
            this.f13497a = aVar;
        }

        /* renamed from: d */
        public final C11978b m18665d() {
            return this.f13497a.scopeSubject;
        }
    }

    public C5733a() {
        C11978b j = C11978b.m38573j();
        Intrinsics.checkReturnedValueIsNotNull((Object) j, "CompletableSubject.create()");
        this.scopeSubject = j;
    }

    public final C11790c0 getViewModelScope() {
        return this.viewModelScope;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        this.scopeSubject.onComplete();
        super.onCleared();
    }
}
