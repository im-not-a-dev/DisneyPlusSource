package com.bamtechmedia.dominguez.detail.common.formats;

import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.assets.C3638l;
import com.bamtechmedia.dominguez.core.content.assets.Language;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import com.bamtechmedia.dominguez.profiles.p263u1.p264d.C6861a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0001%B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0002J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0002J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ1\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0001¢\u0006\u0002\b\"J\u001e\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/formats/AvailableFeaturesFormatter;", "", "audioResolver", "Lcom/bamtechmedia/dominguez/profiles/api/language/AudioResolvers;", "stringBuilder", "Lcom/bamtechmedia/dominguez/detail/common/formats/AvailableFeaturesStringBuilder;", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "detailMediaContentMapper", "Lcom/bamtechmedia/dominguez/detail/common/formats/DetailMediaContentMapper;", "(Lcom/bamtechmedia/dominguez/profiles/api/language/AudioResolvers;Lcom/bamtechmedia/dominguez/detail/common/formats/AvailableFeaturesStringBuilder;Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;Lcom/bamtechmedia/dominguez/detail/common/formats/DetailMediaContentMapper;)V", "availableFeatureForAudioData", "", "Lcom/bamtechmedia/dominguez/detail/common/formats/AvailableFeatureData;", "audioFeatures", "", "videoFeatures", "createAvailableFeatureForFormat", "format", "filterOutUnsupportedFeatureItems", "features", "keyForFeature", "feature", "keyForFormat", "loadImagesForFormat", "Lio/reactivex/Single;", "", "playable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "allFormats", "", "mapMetadata", "metadata", "Lcom/bamtechmedia/dominguez/core/content/assets/MediaMetadata;", "mapMetadata$contentDetail_release", "shouldExcludeForDolby", "data", "Companion", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.common.formats.b */
/* compiled from: AvailableFeaturesFormatter.kt */
public final class C5929b {

    /* renamed from: e */
    private static final List<String> f13727e = C13185o.m40520c("dolby_20", "dolby_71", "SD");
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6861a f13728a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5935c f13729b;

    /* renamed from: c */
    private final C6667g1 f13730c;

    /* renamed from: d */
    private final C5938d f13731d;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.formats.b$a */
    /* compiled from: AvailableFeaturesFormatter.kt */
    public static final class C5930a {
        private C5930a() {
        }

        public /* synthetic */ C5930a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.formats.b$b */
    /* compiled from: AvailableFeaturesFormatter.kt */
    static final class C5931b<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ C3638l f13732U;

        /* renamed from: V */
        final /* synthetic */ boolean f13733V;

        /* renamed from: c */
        final /* synthetic */ C5929b f13734c;

        C5931b(C5929b bVar, C3638l lVar, boolean z) {
            this.f13734c = bVar;
            this.f13732U = lVar;
            this.f13733V = z;
        }

        /* renamed from: a */
        public final List<C5928a> apply(List<String> list) {
            return this.f13734c.mo17857a(this.f13732U, this.f13733V, list);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.formats.b$c */
    /* compiled from: AvailableFeaturesFormatter.kt */
    static final class C5932c<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C5929b f13735c;

        C5932c(C5929b bVar) {
            this.f13735c = bVar;
        }

        /* renamed from: a */
        public final Single<CharSequence> apply(List<C5928a> list) {
            return this.f13735c.f13729b.mo17862a(list);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.formats.b$d */
    /* compiled from: AvailableFeaturesFormatter.kt */
    static final class C5933d<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ C3693o f13736U;

        /* renamed from: c */
        final /* synthetic */ C5929b f13737c;

        C5933d(C5929b bVar, C3693o oVar) {
            this.f13737c = bVar;
            this.f13736U = oVar;
        }

        /* renamed from: a */
        public final Single<Language> apply(C6626c0 c0Var) {
            return this.f13737c.f13728a.mo19626a(c0Var.mo19352P(), this.f13736U.mo12910s(), this.f13736U.mo13273l());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.formats.b$e */
    /* compiled from: AvailableFeaturesFormatter.kt */
    static final class C5934e<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C5934e f13738c = new C5934e();

        C5934e() {
        }

        /* renamed from: a */
        public final List<String> apply(Language language) {
            return language.mo13103X();
        }
    }

    static {
        new C5930a(null);
    }

    public C5929b(C6861a aVar, C5935c cVar, C6667g1 g1Var, C5938d dVar) {
        this.f13728a = aVar;
        this.f13729b = cVar;
        this.f13730c = g1Var;
        this.f13731d = dVar;
    }

    /* renamed from: c */
    private final String m19039c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("media_format_");
        Locale locale = Locale.US;
        Intrinsics.checkReturnedValueIsNotNull((Object) locale, "Locale.US");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            sb.append(lowerCase);
            return sb.toString();
        }
        throw new C13142s("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: b */
    private final String m19038b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("media_feature_");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final Single<CharSequence> mo17856a(C3693o oVar, boolean z) {
        Single single;
        C3638l B = oVar.mo13271B();
        if (B != null) {
            List l = oVar.mo13273l();
            if (l == null || l.isEmpty()) {
                single = Single.m38399b(C13185o.m40513a());
            } else {
                single = this.f13730c.mo19381b().mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C5933d<Object,Object>(this, oVar)).mo30233g(C5934e.f13738c);
            }
            Intrinsics.checkReturnedValueIsNotNull((Object) single, "if (audioTracks.isNullOr…{ it.features }\n        }");
            Single<CharSequence> a = single.mo30233g(new C5931b(this, B, z)).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C5932c<Object,Object>(this));
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "audioFeaturesSingle.map …ilder.mapDictionary(it) }");
            return a;
        }
        Single<CharSequence> b = Single.m38399b("");
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Single.just(\"\")");
        return b;
    }

    /* renamed from: a */
    public final List<C5928a> mo17857a(C3638l lVar, boolean z, List<String> list) {
        List X = lVar.mo12950X();
        if (X == null) {
            X = C13185o.m40513a();
        }
        List a = m19035a(list, X);
        C5928a a2 = m19032a(lVar.getFormat());
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object next : X) {
            if (!Intrinsics.areEqual((Object) (String) next, (Object) "dolby_vision")) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) arrayList, 10));
        for (String str : arrayList) {
            arrayList2.add(new C5928a(m19038b(str), false, str));
        }
        ArrayList arrayList3 = new ArrayList();
        if (a2 != null) {
            arrayList3.add(a2);
            if (Intrinsics.areEqual((Object) a2.mo17850b(), (Object) "UHD")) {
                String str2 = "HD";
                arrayList3.add(new C5928a(str2, false, str2));
            }
        }
        List a3 = m19034a(C13199w.m40583d((Collection) C13199w.m40583d((Collection) arrayList3, (Iterable) arrayList2), (Iterable) a));
        if (z) {
            return this.f13731d.mo17865a(a3);
        }
        return this.f13731d.mo17866b(a3);
    }

    /* renamed from: a */
    private final List<C5928a> m19035a(List<String> list, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        String str = "dolby_vision";
        if (list2.contains(str)) {
            arrayList.add(new C5928a("image_media_feature_dolby_vision", true, str));
        }
        String str2 = "dolby_atmos";
        if (list.contains(str2)) {
            arrayList.add(new C5928a("image_media_feature_dolby_atmos", true, str2));
        }
        String str3 = "dolby_51";
        if (list.contains(str3)) {
            arrayList.add(new C5928a("media_feature_dolby_51", false, str3));
        }
        return arrayList;
    }

    /* renamed from: a */
    private final C5928a m19032a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return new C5928a(m19039c(str), false, str);
    }

    /* renamed from: a */
    private final boolean m19036a(C5928a aVar, List<C5928a> list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((C5928a) obj).mo17850b(), (Object) "dolby_vision")) {
                break;
            }
        }
        boolean z = obj != null;
        boolean z2 = Intrinsics.areEqual((Object) aVar.mo17850b(), (Object) "hdr") || Intrinsics.areEqual((Object) aVar.mo17850b(), (Object) "hdr_10");
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final List<C5928a> m19034a(List<C5928a> list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (true ^ C13199w.m40564a((Iterable) f13727e, (Object) ((C5928a) next).mo17850b())) {
                arrayList.add(next);
            }
        }
        boolean z = false;
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (z) {
                arrayList2.add(next2);
            } else if (!m19036a((C5928a) next2, list)) {
                arrayList2.add(next2);
                z = true;
            }
        }
        return arrayList2;
    }
}
