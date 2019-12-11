package com.bamtechmedia.dominguez.auth.p070v0.p072h;

import com.bamtechmedia.dominguez.legal.api.LegalApi;
import com.bamtechmedia.dominguez.legal.api.LegalDisclosure;
import com.bamtechmedia.dominguez.legal.api.MarketingEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Observable;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p524d0.C11918b;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0002J(\u0010\f\u001a\u00020\u00072\u001e\u0010\r\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000eH\u0002J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/validation/signup/MarketingAndLegalAction;", "", "legalApi", "Lcom/bamtechmedia/dominguez/legal/api/LegalApi;", "(Lcom/bamtechmedia/dominguez/legal/api/LegalApi;)V", "fetchMarketingAndLegalItems", "Lio/reactivex/Observable;", "Lcom/bamtechmedia/dominguez/auth/validation/signup/MarketingAndLegalAction$ActionState;", "legalDataOnce", "Lio/reactivex/Single;", "", "Lcom/bamtechmedia/dominguez/legal/api/LegalDisclosure;", "mapResponseToActionState", "pair", "Lkotlin/Pair;", "Lcom/bamtechmedia/dominguez/legal/api/MarketingEntity;", "marketingDataOnce", "ActionState", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.v0.h.d */
/* compiled from: MarketingAndLegalAction.kt */
public final class C3095d {

    /* renamed from: a */
    private final LegalApi f8000a;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/validation/signup/MarketingAndLegalAction$ActionState;", "", "()V", "Completed", "GenericError", "GlobalOneIdError", "Loading", "Lcom/bamtechmedia/dominguez/auth/validation/signup/MarketingAndLegalAction$ActionState$Loading;", "Lcom/bamtechmedia/dominguez/auth/validation/signup/MarketingAndLegalAction$ActionState$Completed;", "Lcom/bamtechmedia/dominguez/auth/validation/signup/MarketingAndLegalAction$ActionState$GenericError;", "Lcom/bamtechmedia/dominguez/auth/validation/signup/MarketingAndLegalAction$ActionState$GlobalOneIdError;", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.d$a */
    /* compiled from: MarketingAndLegalAction.kt */
    public static abstract class C3096a {

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.d$a$a */
        /* compiled from: MarketingAndLegalAction.kt */
        public static final class C3097a extends C3096a {

            /* renamed from: a */
            private final List<MarketingEntity> f8001a;

            /* renamed from: b */
            private final List<LegalDisclosure> f8002b;

            public C3097a(List<MarketingEntity> list, List<LegalDisclosure> list2) {
                super(null);
                this.f8001a = list;
                this.f8002b = list2;
            }

            /* renamed from: a */
            public final List<LegalDisclosure> mo12127a() {
                return this.f8002b;
            }

            /* renamed from: b */
            public final List<MarketingEntity> mo12128b() {
                return this.f8001a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f8002b, (java.lang.Object) r3.f8002b) != false) goto L_0x001f;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x001f
                    boolean r0 = r3 instanceof com.bamtechmedia.dominguez.auth.p070v0.p072h.C3095d.C3096a.C3097a
                    if (r0 == 0) goto L_0x001d
                    com.bamtechmedia.dominguez.auth.v0.h.d$a$a r3 = (com.bamtechmedia.dominguez.auth.p070v0.p072h.C3095d.C3096a.C3097a) r3
                    java.util.List<com.bamtechmedia.dominguez.legal.api.MarketingEntity> r0 = r2.f8001a
                    java.util.List<com.bamtechmedia.dominguez.legal.api.MarketingEntity> r1 = r3.f8001a
                    boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                    if (r0 == 0) goto L_0x001d
                    java.util.List<com.bamtechmedia.dominguez.legal.api.LegalDisclosure> r0 = r2.f8002b
                    java.util.List<com.bamtechmedia.dominguez.legal.api.LegalDisclosure> r3 = r3.f8002b
                    boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                    if (r3 == 0) goto L_0x001d
                    goto L_0x001f
                L_0x001d:
                    r3 = 0
                    return r3
                L_0x001f:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p070v0.p072h.C3095d.C3096a.C3097a.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                List<MarketingEntity> list = this.f8001a;
                int i = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                List<LegalDisclosure> list2 = this.f8002b;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Completed(marketingEntities=");
                sb.append(this.f8001a);
                sb.append(", legalDisclosures=");
                sb.append(this.f8002b);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.d$a$b */
        /* compiled from: MarketingAndLegalAction.kt */
        public static final class C3098b extends C3096a {

            /* renamed from: a */
            public static final C3098b f8003a = new C3098b();

            private C3098b() {
                super(null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.d$a$c */
        /* compiled from: MarketingAndLegalAction.kt */
        public static final class C3099c extends C3096a {

            /* renamed from: a */
            private final String f8004a;

            /* renamed from: a */
            public final String mo12132a() {
                return this.f8004a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f8004a, (java.lang.Object) ((com.bamtechmedia.dominguez.auth.p070v0.p072h.C3095d.C3096a.C3099c) r2).f8004a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof com.bamtechmedia.dominguez.auth.p070v0.p072h.C3095d.C3096a.C3099c
                    if (r0 == 0) goto L_0x0013
                    com.bamtechmedia.dominguez.auth.v0.h.d$a$c r2 = (com.bamtechmedia.dominguez.auth.p070v0.p072h.C3095d.C3096a.C3099c) r2
                    java.lang.String r0 = r1.f8004a
                    java.lang.String r2 = r2.f8004a
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                    if (r2 == 0) goto L_0x0013
                    goto L_0x0015
                L_0x0013:
                    r2 = 0
                    return r2
                L_0x0015:
                    r2 = 1
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.auth.p070v0.p072h.C3095d.C3096a.C3099c.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f8004a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("GlobalOneIdError(errorMessage=");
                sb.append(this.f8004a);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.d$a$d */
        /* compiled from: MarketingAndLegalAction.kt */
        public static final class C3100d extends C3096a {

            /* renamed from: a */
            public static final C3100d f8005a = new C3100d();

            private C3100d() {
                super(null);
            }
        }

        private C3096a() {
        }

        public /* synthetic */ C3096a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.d$b */
    /* compiled from: MarketingAndLegalAction.kt */
    static final class C3101b<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C3095d f8006c;

        C3101b(C3095d dVar) {
            this.f8006c = dVar;
        }

        /* renamed from: a */
        public final C3096a apply(Pair<? extends List<MarketingEntity>, ? extends List<LegalDisclosure>> pair) {
            return this.f8006c.m10924a(pair);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.d$c */
    /* compiled from: MarketingAndLegalAction.kt */
    static final class C3102c<T, R> implements Function<Throwable, C3096a> {

        /* renamed from: c */
        public static final C3102c f8007c = new C3102c();

        C3102c() {
        }

        /* renamed from: a */
        public final C3098b apply(Throwable th) {
            Timber.m44530c(th, "Error while retrieving marketing and legal items", new Object[0]);
            return C3098b.f8003a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.d$d */
    /* compiled from: MarketingAndLegalAction.kt */
    static final class C3103d<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C3103d f8008c = new C3103d();

        C3103d() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Timber.m44528b(th, "Unable to load legal disclosures!", new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.d$e */
    /* compiled from: MarketingAndLegalAction.kt */
    static final class C3104e<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C3104e f8009c = new C3104e();

        C3104e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Timber.m44528b(th, "Unable to load marketing entities!", new Object[0]);
        }
    }

    public C3095d(LegalApi legalApi) {
        this.f8000a = legalApi;
    }

    /* renamed from: b */
    private final Single<List<LegalDisclosure>> m10925b() {
        Single<List<LegalDisclosure>> b = this.f8000a.getLegalData().mo30218b((Consumer<? super Throwable>) C3103d.f8008c);
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "legalApi.getLegalData()\n…ad legal disclosures!\") }");
        return b;
    }

    /* renamed from: c */
    private final Single<List<MarketingEntity>> m10926c() {
        Single<List<MarketingEntity>> b = this.f8000a.getMarketingData().mo30218b((Consumer<? super Throwable>) C3104e.f8009c);
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "legalApi.getMarketingDat…d marketing entities!\") }");
        return b;
    }

    /* renamed from: a */
    public final Observable<C3096a> mo12126a() {
        Observable<C3096a> i = C11918b.f27600a.mo30245a(m10926c(), m10925b()).mo30233g(new C3101b(this)).mo30236i().mo30154a(C3100d.f8005a).mo30198i(C3102c.f8007c);
        Intrinsics.checkReturnedValueIsNotNull((Object) i, "Singles.zip(marketingDat…enericError\n            }");
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C3096a m10924a(Pair<? extends List<MarketingEntity>, ? extends List<LegalDisclosure>> pair) {
        if (((List) pair.mo31015c()).isEmpty() || ((List) pair.mo31016d()).isEmpty()) {
            return C3098b.f8003a;
        }
        return new C3097a((List) pair.mo31015c(), (List) pair.mo31016d());
    }
}
