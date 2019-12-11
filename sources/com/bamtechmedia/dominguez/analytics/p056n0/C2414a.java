package com.bamtechmedia.dominguez.analytics.p056n0;

import com.bamtech.sdk4.internal.media.StreamSampleTelemetryData;
import com.bamtech.sdk4.useractivity.GlimpseEvent;
import com.bamtechmedia.dominguez.analytics.C2335a0;
import com.bamtechmedia.dominguez.analytics.C2336b;
import com.bamtechmedia.dominguez.analytics.C2364i;
import com.bamtechmedia.dominguez.analytics.C2476z;
import com.bamtechmedia.dominguez.analytics.p055m0.C2399m;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import com.bamtechmedia.dominguez.core.utils.C5859p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p503n.p504a.C11786a0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11960n;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0000\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003'()B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u0010H\u0002J\u001c\u0010\u0019\u001a\u00020\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u0010H\u0007J,\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u0010H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J(\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0016J$\u0010$\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001e\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010\u0011H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/glimpse/GlimpseAnalyticsViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/analytics/glimpse/GlimpseAnalyticsViewModel$State;", "Lcom/bamtechmedia/dominguez/analytics/GlimpseAnalytics;", "extrasGenerator", "Lcom/bamtechmedia/dominguez/analytics/glimpse/GlimpseExtrasGenerator;", "glimpseWrapper", "Lcom/bamtechmedia/dominguez/analytics/glimpse/GlimpseWrapper;", "activePageTracker", "Lcom/bamtechmedia/dominguez/analytics/ActivePageTracker;", "platformAnalyticsContributor", "Lcom/bamtechmedia/dominguez/analytics/contributors/PlatformAnalyticsContributor;", "config", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsConfig;", "(Lcom/bamtechmedia/dominguez/analytics/glimpse/GlimpseExtrasGenerator;Lcom/bamtechmedia/dominguez/analytics/glimpse/GlimpseWrapper;Lcom/bamtechmedia/dominguez/analytics/ActivePageTracker;Lcom/bamtechmedia/dominguez/analytics/contributors/PlatformAnalyticsContributor;Lcom/bamtechmedia/dominguez/analytics/AnalyticsConfig;)V", "createGlimpsePlaybackExitExtras", "", "", "currentState", "generateGlimpseEventCall", "", "event", "Lcom/bamtech/sdk4/useractivity/GlimpseEvent;", "extras", "", "trackContentSelected", "trackEvent", "action", "trackPageLoad", "trackPendingEventsAndClear", "activePage", "trackSessionStart", "fguid", "playbackSessionId", "contentId", "mediaId", "trackViewLoaded", "experimentToken", "transactionId", "Companion", "GlimpseEventParams", "State", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.n0.a */
/* compiled from: GlimpseAnalyticsViewModel.kt */
public final class C2414a extends C5741g<C2419e> implements C2476z {

    /* renamed from: U */
    private final C2428e f6664U;

    /* renamed from: V */
    private final C2336b f6665V;

    /* renamed from: W */
    private final C2399m f6666W;

    /* renamed from: X */
    private final C2364i f6667X;

    /* renamed from: c */
    private final C2426c f6668c;

    /* renamed from: com.bamtechmedia.dominguez.analytics.n0.a$a */
    /* compiled from: GlimpseAnalyticsViewModel.kt */
    static final class C2415a<T> implements Consumer<C2419e> {

        /* renamed from: c */
        public static final C2415a f6669c = new C2415a();

        C2415a() {
        }

        /* renamed from: a */
        public final void accept(C2419e eVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("New GlimpseAnalyticsViewModel state ");
            sb.append(eVar);
            C14100a.m44529c(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.n0.a$b */
    /* compiled from: GlimpseAnalyticsViewModel.kt */
    static final class C2416b<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C2416b f6670c = new C2416b();

        C2416b() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44528b(th, "Error in GlimpseAnalyticsViewModel state stream", new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.n0.a$c */
    /* compiled from: GlimpseAnalyticsViewModel.kt */
    public static final class C2417c {
        private C2417c() {
        }

        public /* synthetic */ C2417c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.n0.a$d */
    /* compiled from: GlimpseAnalyticsViewModel.kt */
    public static final class C2418d {

        /* renamed from: a */
        private final GlimpseEvent f6671a;

        /* renamed from: b */
        private final Map<String, Object> f6672b;

        public C2418d(GlimpseEvent glimpseEvent, Map<String, ? extends Object> map) {
            this.f6671a = glimpseEvent;
            this.f6672b = map;
        }

        /* renamed from: a */
        public final GlimpseEvent mo11542a() {
            return this.f6671a;
        }

        /* renamed from: b */
        public final Map<String, Object> mo11543b() {
            return this.f6672b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f6672b, (java.lang.Object) r3.f6672b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.bamtechmedia.dominguez.analytics.p056n0.C2414a.C2418d
                if (r0 == 0) goto L_0x001d
                com.bamtechmedia.dominguez.analytics.n0.a$d r3 = (com.bamtechmedia.dominguez.analytics.p056n0.C2414a.C2418d) r3
                com.bamtech.sdk4.useractivity.GlimpseEvent r0 = r2.f6671a
                com.bamtech.sdk4.useractivity.GlimpseEvent r1 = r3.f6671a
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f6672b
                java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f6672b
                boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.analytics.p056n0.C2414a.C2418d.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            GlimpseEvent glimpseEvent = this.f6671a;
            int i = 0;
            int hashCode = (glimpseEvent != null ? glimpseEvent.hashCode() : 0) * 31;
            Map<String, Object> map = this.f6672b;
            if (map != null) {
                i = map.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("GlimpseEventParams(event=");
            sb.append(this.f6671a);
            sb.append(", extras=");
            sb.append(this.f6672b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.n0.a$e */
    /* compiled from: GlimpseAnalyticsViewModel.kt */
    public static final class C2419e {

        /* renamed from: a */
        private final String f6673a;

        /* renamed from: b */
        private final List<C2418d> f6674b;

        /* renamed from: c */
        private final String f6675c;

        /* renamed from: d */
        private final String f6676d;

        /* renamed from: e */
        private final String f6677e;

        /* renamed from: f */
        private final String f6678f;

        public C2419e(String str, List<C2418d> list, String str2, String str3, String str4, String str5) {
            this.f6673a = str;
            this.f6674b = list;
            this.f6675c = str2;
            this.f6676d = str3;
            this.f6677e = str4;
            this.f6678f = str5;
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.analytics.n0.a$d>, for r6v0, types: [java.util.List] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ com.bamtechmedia.dominguez.analytics.p056n0.C2414a.C2419e m8973a(com.bamtechmedia.dominguez.analytics.p056n0.C2414a.C2419e r4, java.lang.String r5, java.util.List<com.bamtechmedia.dominguez.analytics.p056n0.C2414a.C2418d> r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, java.lang.Object r12) {
            /*
                r12 = r11 & 1
                if (r12 == 0) goto L_0x0006
                java.lang.String r5 = r4.f6673a
            L_0x0006:
                r12 = r11 & 2
                if (r12 == 0) goto L_0x000c
                java.util.List<com.bamtechmedia.dominguez.analytics.n0.a$d> r6 = r4.f6674b
            L_0x000c:
                r12 = r6
                r6 = r11 & 4
                if (r6 == 0) goto L_0x0013
                java.lang.String r7 = r4.f6675c
            L_0x0013:
                r0 = r7
                r6 = r11 & 8
                if (r6 == 0) goto L_0x001a
                java.lang.String r8 = r4.f6676d
            L_0x001a:
                r1 = r8
                r6 = r11 & 16
                if (r6 == 0) goto L_0x0021
                java.lang.String r9 = r4.f6677e
            L_0x0021:
                r2 = r9
                r6 = r11 & 32
                if (r6 == 0) goto L_0x0028
                java.lang.String r10 = r4.f6678f
            L_0x0028:
                r3 = r10
                r6 = r4
                r7 = r5
                r8 = r12
                r9 = r0
                r10 = r1
                r11 = r2
                r12 = r3
                com.bamtechmedia.dominguez.analytics.n0.a$e r4 = r6.mo11547a(r7, r8, r9, r10, r11, r12)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.analytics.p056n0.C2414a.C2419e.m8973a(com.bamtechmedia.dominguez.analytics.n0.a$e, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):com.bamtechmedia.dominguez.analytics.n0.a$e");
        }

        /* renamed from: a */
        public final C2419e mo11547a(String str, List<C2418d> list, String str2, String str3, String str4, String str5) {
            C2419e eVar = new C2419e(str, list, str2, str3, str4, str5);
            return eVar;
        }

        /* renamed from: a */
        public final String mo11548a() {
            return this.f6677e;
        }

        /* renamed from: b */
        public final String mo11549b() {
            return this.f6675c;
        }

        /* renamed from: c */
        public final String mo11550c() {
            return this.f6678f;
        }

        /* renamed from: d */
        public final String mo11551d() {
            return this.f6673a;
        }

        /* renamed from: e */
        public final List<C2418d> mo11552e() {
            return this.f6674b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f6678f, (java.lang.Object) r3.f6678f) != false) goto L_0x0047;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0047
                boolean r0 = r3 instanceof com.bamtechmedia.dominguez.analytics.p056n0.C2414a.C2419e
                if (r0 == 0) goto L_0x0045
                com.bamtechmedia.dominguez.analytics.n0.a$e r3 = (com.bamtechmedia.dominguez.analytics.p056n0.C2414a.C2419e) r3
                java.lang.String r0 = r2.f6673a
                java.lang.String r1 = r3.f6673a
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.util.List<com.bamtechmedia.dominguez.analytics.n0.a$d> r0 = r2.f6674b
                java.util.List<com.bamtechmedia.dominguez.analytics.n0.a$d> r1 = r3.f6674b
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r2.f6675c
                java.lang.String r1 = r3.f6675c
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r2.f6676d
                java.lang.String r1 = r3.f6676d
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r2.f6677e
                java.lang.String r1 = r3.f6677e
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r2.f6678f
                java.lang.String r3 = r3.f6678f
                boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
                if (r3 == 0) goto L_0x0045
                goto L_0x0047
            L_0x0045:
                r3 = 0
                return r3
            L_0x0047:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.analytics.p056n0.C2414a.C2419e.equals(java.lang.Object):boolean");
        }

        /* renamed from: f */
        public final String mo11554f() {
            return this.f6676d;
        }

        public int hashCode() {
            String str = this.f6673a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<C2418d> list = this.f6674b;
            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            String str2 = this.f6675c;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f6676d;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f6677e;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f6678f;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return hashCode5 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(pageName=");
            sb.append(this.f6673a);
            sb.append(", pendingEventsInfo=");
            sb.append(this.f6674b);
            sb.append(", fguid=");
            sb.append(this.f6675c);
            sb.append(", playbackSessionId=");
            sb.append(this.f6676d);
            sb.append(", contentId=");
            sb.append(this.f6677e);
            sb.append(", mediaId=");
            sb.append(this.f6678f);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C2419e(String str, List list, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str6 = "0";
            this(str, list, (i & 4) != 0 ? str6 : str2, (i & 8) != 0 ? str6 : str3, (i & 16) != 0 ? str6 : str4, (i & 32) != 0 ? str6 : str5);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.n0.a$f */
    /* compiled from: GlimpseAnalyticsViewModel.kt */
    static final class C2420f implements C11945a {

        /* renamed from: a */
        public static final C2420f f6679a = new C2420f();

        C2420f() {
        }

        public final void run() {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.n0.a$g */
    /* compiled from: GlimpseAnalyticsViewModel.kt */
    static final /* synthetic */ class C2421g extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C2421g f6680c = new C2421g();

        C2421g() {
            super(1);
        }

        /* renamed from: a */
        public final void mo11557a(Throwable th) {
            C14100a.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C14100a.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11557a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.n0.a$h */
    /* compiled from: GlimpseAnalyticsViewModel.kt */
    static final class C2422h extends C12881k implements Function1<C2419e, C2419e> {

        /* renamed from: U */
        final /* synthetic */ String f6681U;

        /* renamed from: c */
        final /* synthetic */ Map f6682c;

        C2422h(Map map, String str) {
            this.f6682c = map;
            this.f6681U = str;
            super(1);
        }

        /* renamed from: a */
        public final C2419e invoke(C2419e eVar) {
            return C2419e.m8973a(eVar, null, C13199w.m40563a((Collection) eVar.mo11552e(), (Object) new C2418d(GlimpseEvent.Companion.getContentSelected(), C13173j0.m40354a(this.f6682c, C12907r.m40244a("fromPageName", this.f6681U)))), null, null, null, null, 61, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.n0.a$i */
    /* compiled from: GlimpseAnalyticsViewModel.kt */
    static final class C2423i extends C12881k implements Function1<C2419e, C2419e> {

        /* renamed from: c */
        final /* synthetic */ String f6683c;

        C2423i(String str) {
            this.f6683c = str;
            super(1);
        }

        /* renamed from: a */
        public final C2419e invoke(C2419e eVar) {
            return C2419e.m8973a(eVar, this.f6683c, C13185o.m40513a(), null, null, null, null, 60, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.n0.a$j */
    /* compiled from: GlimpseAnalyticsViewModel.kt */
    static final class C2424j extends C12881k implements Function1<C2419e, C2419e> {

        /* renamed from: U */
        final /* synthetic */ String f6684U;

        /* renamed from: V */
        final /* synthetic */ String f6685V;

        /* renamed from: W */
        final /* synthetic */ String f6686W;

        /* renamed from: c */
        final /* synthetic */ String f6687c;

        C2424j(String str, String str2, String str3, String str4) {
            this.f6687c = str;
            this.f6684U = str2;
            this.f6685V = str3;
            this.f6686W = str4;
            super(1);
        }

        /* renamed from: a */
        public final C2419e invoke(C2419e eVar) {
            return C2419e.m8973a(eVar, null, null, this.f6687c, this.f6684U, this.f6685V, this.f6686W, 3, null);
        }
    }

    static {
        new C2417c(null);
    }

    public C2414a(C2426c cVar, C2428e eVar, C2336b bVar, C2399m mVar, C2364i iVar) {
        super(null, 1, null);
        this.f6668c = cVar;
        this.f6664U = eVar;
        this.f6665V = bVar;
        this.f6666W = mVar;
        this.f6667X = iVar;
        C2419e eVar2 = new C2419e("", C13185o.m40513a(), null, null, null, null, 60, null);
        createState(eVar2);
        Object a = getState().mo30161a((C11960n<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11786a0) a).mo29915a(C2415a.f6669c, C2416b.f6670c);
    }

    /* renamed from: b */
    private final void m8963b(String str) {
        C2419e eVar = (C2419e) getCurrentState();
        if (eVar != null) {
            List<C2418d> e = eVar.mo11552e();
            if (e != null) {
                for (C2418d dVar : e) {
                    m8961a(dVar.mo11542a(), C13173j0.m40354a(dVar.mo11543b(), C12907r.m40244a("toPageName", str)));
                }
            }
        }
        updateState(new C2423i(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0 != null) goto L_0x0011;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11538a(java.util.Map<java.lang.String, ? extends java.lang.Object> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.getCurrentState()
            com.bamtechmedia.dominguez.analytics.n0.a$e r0 = (com.bamtechmedia.dominguez.analytics.p056n0.C2414a.C2419e) r0
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = r0.mo11551d()
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            java.lang.String r0 = ""
        L_0x0011:
            com.bamtechmedia.dominguez.analytics.n0.a$h r1 = new com.bamtechmedia.dominguez.analytics.n0.a$h
            r1.<init>(r3, r0)
            r2.updateState(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.analytics.p056n0.C2414a.mo11538a(java.util.Map):void");
    }

    /* renamed from: i */
    public void mo11539i() {
        String str;
        Object obj;
        String a = this.f6665V.mo11445a();
        C2419e eVar = (C2419e) getCurrentState();
        Object obj2 = null;
        if (eVar != null) {
            List e = eVar.mo11552e();
            if (e != null) {
                Iterator it = e.iterator();
                while (true) {
                    str = "experimentToken";
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((C2418d) obj).mo11543b().containsKey(str)) {
                        break;
                    }
                }
                C2418d dVar = (C2418d) obj;
                if (dVar != null) {
                    Map b = dVar.mo11543b();
                    if (b != null) {
                        obj2 = b.get(str);
                    }
                }
            }
        }
        m8963b(a);
        m8962a(obj2, a, this.f6665V.mo11448c());
    }

    /* renamed from: a */
    private final void m8962a(Object obj, String str, String str2) {
        m8961a(GlimpseEvent.Companion.getViewLoaded(), C5859p.m18899a(C5859p.m18899a(C13173j0.m40354a(C13173j0.m40354a(C2426c.m8985a(this.f6668c, null, null, 3, null), C12907r.m40244a("pageName", str)), C12907r.m40244a("loadType", "full")), "experimentToken", obj), "contentTransactionId", str2));
    }

    /* renamed from: a */
    public void mo11536a(String str, GlimpseEvent glimpseEvent, Map<String, ? extends Object> map) {
        Map a = C2426c.m8985a(this.f6668c, this.f6665V.mo11446a(str), null, 2, null);
        if (!this.f6667X.mo11490a("glimpse", glimpseEvent.getEventUrn())) {
            if (C12880j.m40224a((Object) glimpseEvent, (Object) GlimpseEvent.Companion.getAppLaunched())) {
                m8961a(glimpseEvent, C13173j0.m40353a(C13173j0.m40354a((Map) map, C12907r.m40244a("platformDeviceIds", C13170i0.m40332a(C12907r.m40244a("adid", this.f6666W.mo11528b())))), C2426c.m8985a(this.f6668c, null, null, 3, null)));
            } else if (C12880j.m40224a((Object) glimpseEvent, (Object) GlimpseEvent.Companion.getContentSelected())) {
                mo11538a(C13173j0.m40353a(a, (Map) map));
            } else if (C12880j.m40224a((Object) glimpseEvent, (Object) GlimpseEvent.Companion.getPlaybackExited())) {
                m8961a(glimpseEvent, C13173j0.m40353a(C13173j0.m40353a((Map) map, mo11535a((C2419e) getCurrentState())), C2426c.m8985a(this.f6668c, null, null, 3, null)));
            } else if (C12880j.m40224a((Object) glimpseEvent, (Object) GlimpseEvent.Companion.getPlaybackSelected())) {
                m8961a(glimpseEvent, C5859p.m18899a(C13173j0.m40354a((Map) map, C12907r.m40244a(StreamSampleTelemetryData.TIMESTAMP_KEY, C2335a0.f6535b.mo11444a())), "contentTransactionId", this.f6665V.mo11448c()));
            } else if (C12880j.m40224a((Object) glimpseEvent, (Object) GlimpseEvent.Companion.getPurchaseCompleted())) {
                C2419e eVar = (C2419e) getCurrentState();
                m8961a(glimpseEvent, C13173j0.m40353a((Map) map, C2426c.m8985a(this.f6668c, null, eVar != null ? eVar.mo11551d() : null, 1, null)));
            } else {
                m8961a(glimpseEvent, C13173j0.m40353a((Map) map, C2426c.m8985a(this.f6668c, null, null, 3, null)));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, com.bamtechmedia.dominguez.analytics.n0.a$g] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r1v0, types: [com.bamtechmedia.dominguez.analytics.n0.b] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m8961a(com.bamtech.sdk4.useractivity.GlimpseEvent r3, java.util.Map<java.lang.String, ? extends java.lang.Object> r4) {
        /*
            r2 = this;
            com.bamtechmedia.dominguez.analytics.n0.e r0 = r2.f6664U
            io.reactivex.Completable r3 = r0.mo11562a(r3, r4)
            g.n.a.c0 r4 = r2.getViewModelScope()
            g.n.a.h r4 = p163g.p503n.p504a.C11793e.m37930a(r4)
            java.lang.Object r3 = r3.mo30048a(r4)
            java.lang.String r4 = "this.`as`(AutoDispose.au…isposable<Any>(provider))"
            kotlin.jvm.internal.C12880j.m40222a(r3, r4)
            g.n.a.v r3 = (p163g.p503n.p504a.C11839v) r3
            com.bamtechmedia.dominguez.analytics.n0.a$f r4 = com.bamtechmedia.dominguez.analytics.p056n0.C2414a.C2420f.f6679a
            com.bamtechmedia.dominguez.analytics.n0.a$g r0 = com.bamtechmedia.dominguez.analytics.p056n0.C2414a.C2421g.f6680c
            if (r0 == 0) goto L_0x0025
            com.bamtechmedia.dominguez.analytics.n0.b r1 = new com.bamtechmedia.dominguez.analytics.n0.b
            r1.<init>(r0)
            r0 = r1
        L_0x0025:
            io.reactivex.functions.Consumer r0 = (p520io.reactivex.functions.Consumer) r0
            r3.mo29926a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.analytics.p056n0.C2414a.m8961a(com.bamtech.sdk4.useractivity.GlimpseEvent, java.util.Map):void");
    }

    /* renamed from: a */
    public void mo11537a(String str, String str2, String str3, String str4) {
        updateState(new C2424j(str, str2, str3, str4));
    }

    /* renamed from: a */
    public final Map<String, String> mo11535a(C2419e eVar) {
        if (eVar != null) {
            Map<String, String> a = C13173j0.m40356a(C12907r.m40244a("fguid", eVar.mo11549b()), C12907r.m40244a("playbackSessionId", eVar.mo11554f()), C12907r.m40244a("contentId", eVar.mo11548a()), C12907r.m40244a("mediaId", eVar.mo11550c()));
            if (a != null) {
                return a;
            }
        }
        return C13173j0.m40350a();
    }
}
