package com.bamtechmedia.dominguez.core.content;

import android.content.res.Resources;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.core.C3797e;
import com.bamtechmedia.dominguez.core.content.assets.Rating;
import com.bamtechmedia.dominguez.core.utils.C5821c0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p275a0.C7159g;
import p163g.p201e.p203b.p275a0.C7159g.C7162c;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0&2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J3\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0&2\u0006\u0010\u0015\u001a\u00020\u00162\u0016\u0010(\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\"0)\"\u0004\u0018\u00010\"H\u0016¢\u0006\u0002\u0010*J(\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\"H\u0002J\b\u00101\u001a\u000202H\u0016R\u001c\u0010\r\u001a\n \u000e*\u0004\u0018\u00010\u00040\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u00063"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/RatingAdvisoriesFormatterImpl;", "Lcom/bamtechmedia/dominguez/core/content/RatingAdvisoriesFormatter;", "dictionaryProvider", "Ljavax/inject/Provider;", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "stringDictionary", "runtimeConverter", "Lcom/bamtechmedia/dominguez/core/utils/RuntimeConverter;", "ripcutImageLoader", "Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;", "resources", "Landroid/content/res/Resources;", "(Ljavax/inject/Provider;Lcom/bamtechmedia/dominguez/config/StringDictionary;Lcom/bamtechmedia/dominguez/core/utils/RuntimeConverter;Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;Landroid/content/res/Resources;)V", "dictionary", "kotlin.jvm.PlatformType", "getDictionary", "()Lcom/bamtechmedia/dominguez/config/StringDictionary;", "iconHeight", "", "format", "Landroid/text/Spannable;", "rating", "Lcom/bamtechmedia/dominguez/core/content/assets/Rating;", "formatForImage", "imageUri", "Landroid/net/Uri;", "formatRatingWithMovieInfo", "movie", "Lcom/bamtechmedia/dominguez/core/content/Movie;", "formatWithExtraInfo", "extra", "Lcom/bamtechmedia/dominguez/core/content/Extra;", "getLowerCasedValues", "Lkotlin/Pair;", "", "getRatingImageId", "getRatingText", "getReasonImageIds", "", "getReasonTexts", "additionalReasonIds", "", "(Lcom/bamtechmedia/dominguez/core/content/assets/Rating;[Ljava/lang/String;)Ljava/util/List;", "mapToReason", "reasonValue", "isTVPG", "", "system", "ratingValue", "prefetchRatingIcons", "Lio/reactivex/Completable;", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.r */
/* compiled from: RatingAdvisoriesFormatterImpl.kt */
public final class C3718r implements C3716q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f9291a;

    /* renamed from: b */
    private final Provider<C3572r0> f9292b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3572r0 f9293c;

    /* renamed from: d */
    private final C5821c0 f9294d;

    /* renamed from: e */
    private final C7159g f9295e;

    /* renamed from: com.bamtechmedia.dominguez.core.content.r$a */
    /* compiled from: RatingAdvisoriesFormatterImpl.kt */
    static final class C3719a extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3718r f9296c;

        C3719a(C3718r rVar, SpannableStringBuilder spannableStringBuilder) {
            this.f9296c = rVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo13552a(C7162c cVar) {
            cVar.mo19994d(Integer.valueOf(this.f9296c.f9291a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo13552a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.r$b */
    /* compiled from: RatingAdvisoriesFormatterImpl.kt */
    static final class C3720b extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3718r f9297c;

        C3720b(C3718r rVar) {
            this.f9297c = rVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo13553a(C7162c cVar) {
            cVar.mo19994d(Integer.valueOf(this.f9297c.f9291a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo13553a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.r$c */
    /* compiled from: RatingAdvisoriesFormatterImpl.kt */
    static final class C3721c extends C12881k implements Function1<GenreMeta, String> {

        /* renamed from: c */
        final /* synthetic */ C3718r f9298c;

        C3721c(C3718r rVar, C3692n nVar) {
            this.f9298c = rVar;
            super(1);
        }

        /* renamed from: a */
        public final String invoke(GenreMeta genreMeta) {
            String Y = genreMeta.mo12798Y();
            C3572r0 b = this.f9298c.f9293c;
            StringBuilder sb = new StringBuilder();
            sb.append("genre_");
            sb.append(Y);
            return C3573a.m12037b(b, sb.toString(), null, 2, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.r$d */
    /* compiled from: RatingAdvisoriesFormatterImpl.kt */
    static final class C3722d extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3718r f9299c;

        C3722d(C3718r rVar) {
            this.f9299c = rVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo13555a(C7162c cVar) {
            cVar.mo19994d(Integer.valueOf(this.f9299c.f9291a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo13555a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    public C3718r(Provider<C3572r0> provider, C3572r0 r0Var, C5821c0 c0Var, C7159g gVar, Resources resources) {
        this.f9292b = provider;
        this.f9293c = r0Var;
        this.f9294d = c0Var;
        this.f9295e = gVar;
        this.f9291a = resources.getDimensionPixelOffset(C3797e.rating_icon_height);
    }

    /* renamed from: e */
    private final Pair<String, String> m12637e(Rating rating) {
        String Y = rating.mo13187Y();
        String str = "null cannot be cast to non-null type java.lang.String";
        if (Y != null) {
            String lowerCase = Y.toLowerCase();
            String str2 = "(this as java.lang.String).toLowerCase()";
            Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase, str2);
            String Z = rating.mo13188Z();
            if (Z != null) {
                String lowerCase2 = Z.toLowerCase();
                Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase2, str2);
                return new Pair<>(lowerCase, lowerCase2);
            }
            throw new C13142s(str);
        }
        throw new C13142s(str);
    }

    /* renamed from: c */
    public String mo13550c(Rating rating) {
        Pair e = m12637e(rating);
        String str = (String) e.mo31013a();
        String str2 = (String) e.mo31014b();
        StringBuilder sb = new StringBuilder();
        sb.append("image_rating_");
        sb.append(str);
        sb.append('_');
        sb.append(str2);
        return C3573a.m12036a(m12635b(), sb.toString(), (Map) null, 2, (Object) null);
    }

    /* renamed from: d */
    public List<String> mo13551d(Rating rating) {
        String Y = rating.mo13187Y();
        String str = "null cannot be cast to non-null type java.lang.String";
        if (Y != null) {
            String lowerCase = Y.toLowerCase();
            String str2 = "(this as java.lang.String).toLowerCase()";
            Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase, str2);
            List<String> X = rating.mo13186X();
            ArrayList arrayList = new ArrayList();
            for (String str3 : X) {
                C3572r0 b = m12635b();
                StringBuilder sb = new StringBuilder();
                sb.append("image_reason_");
                sb.append(lowerCase);
                sb.append('_');
                if (str3 != null) {
                    String lowerCase2 = str3.toLowerCase();
                    Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase2, str2);
                    sb.append(lowerCase2);
                    String a = C3573a.m12036a(b, sb.toString(), (Map) null, 2, (Object) null);
                    if (a != null) {
                        arrayList.add(a);
                    }
                } else {
                    throw new C13142s(str);
                }
            }
            return arrayList;
        }
        throw new C13142s(str);
    }

    /* renamed from: b */
    private final C3572r0 m12635b() {
        return (C3572r0) this.f9292b.get();
    }

    /* renamed from: a */
    public Completable mo13547a() {
        Set a = m12635b().mo12774a();
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object next : a) {
            if (C12832w.m40123b((String) next, "image_", false, 2, null)) {
                arrayList.add(next);
            }
        }
        ArrayList<String> arrayList2 = new ArrayList<>(C13187p.m40525a((Iterable) arrayList, 10));
        for (String b : arrayList) {
            arrayList2.add(C3573a.m12037b(m12635b(), b, null, 2, null));
        }
        ArrayList arrayList3 = new ArrayList(C13187p.m40525a((Iterable) arrayList2, 10));
        for (String b2 : arrayList2) {
            arrayList3.add(this.f9295e.mo19958b(b2, new C3722d(this)));
        }
        Completable c = Completable.m38167c((Iterable<? extends CompletableSource>) arrayList3);
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "Completable.mergeDelayEr… iconHeight } }\n        )");
        return c;
    }

    /* renamed from: b */
    public String mo13549b(Rating rating) {
        Pair e = m12637e(rating);
        String str = (String) e.mo31013a();
        String str2 = (String) e.mo31014b();
        StringBuilder sb = new StringBuilder();
        sb.append("rating_");
        sb.append(str);
        sb.append('_');
        sb.append(str2);
        return C3573a.m12037b(m12635b(), sb.toString(), null, 2, null);
    }

    /* renamed from: a */
    public List<String> mo13548a(Rating rating, String... strArr) {
        Pair e = m12637e(rating);
        String str = (String) e.mo31013a();
        String str2 = (String) e.mo31014b();
        boolean a = Intrinsics.areEqual((Object) str, (Object) "tvpg");
        List<String> X = rating.mo13186X();
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) X, 10));
        for (String str3 : X) {
            if (str3 != null) {
                String lowerCase = str3.toLowerCase();
                Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                arrayList.add(m12634a(lowerCase, a, str, str2));
            } else {
                throw new C13142s("null cannot be cast to non-null type java.lang.String");
            }
        }
        List<String> d = C13174k.m40404d((Object[]) strArr);
        ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) d, 10));
        for (String b : d) {
            arrayList2.add(C3573a.m12037b(m12635b(), b, null, 2, null));
        }
        return C13199w.m40583d((Collection) arrayList, (Iterable) arrayList2);
    }

    /* renamed from: a */
    public Spannable mo13544a(Rating rating) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String c = mo13550c(rating);
        Uri d = c != null ? this.f9295e.mo19960d(c, new C3720b(this)) : null;
        if (d != null) {
            spannableStringBuilder.append(m12633a(d));
        } else {
            spannableStringBuilder.append(mo13549b(rating));
        }
        Iterator it = mo13551d(rating).iterator();
        while (true) {
            String str = " ";
            if (it.hasNext()) {
                String str2 = (String) it.next();
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append(str);
                }
                Uri d2 = this.f9295e.mo19960d(str2, new C3719a(this, spannableStringBuilder));
                if (d2 != null) {
                    spannableStringBuilder.append(m12633a(d2));
                }
            } else {
                SpannableStringBuilder append = spannableStringBuilder.append(str);
                Intrinsics.checkReturnedValueIsNotNull((Object) append, "ratingsSpan.append(SPACE)");
                return append;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0 != null) goto L_0x000f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.text.Spannable mo13546a(com.bamtechmedia.dominguez.core.content.C3692n r12) {
        /*
            r11 = this;
            com.bamtechmedia.dominguez.core.content.assets.Rating r0 = r12.mo13265g()
            if (r0 == 0) goto L_0x000d
            android.text.Spannable r0 = r11.mo13544a(r0)
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            java.lang.String r0 = ""
        L_0x000f:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r0)
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r0 = r1.append(r0)
            java.lang.String r1 = r12.mo13267h()
            android.text.SpannableStringBuilder r0 = r0.append(r1)
            java.lang.Long r1 = r12.mo12913w()
            r2 = 1
            if (r1 == 0) goto L_0x002b
            r1 = 1
            goto L_0x002c
        L_0x002b:
            r1 = 0
        L_0x002c:
            java.lang.String r3 = " • "
            if (r1 == 0) goto L_0x0043
            android.text.SpannableStringBuilder r1 = r0.append(r3)
            com.bamtechmedia.dominguez.core.utils.c0 r4 = r11.f9294d
            java.lang.Long r5 = r12.mo12913w()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r4 = r4.mo17730a(r5, r6)
            r1.append(r4)
        L_0x0043:
            java.util.List r1 = r12.mo12896c()
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x006a
            android.text.SpannableStringBuilder r1 = r0.append(r3)
            java.util.List r2 = r12.mo12896c()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            com.bamtechmedia.dominguez.core.content.r$c r8 = new com.bamtechmedia.dominguez.core.content.r$c
            r8.<init>(r11, r12)
            r9 = 31
            r10 = 0
            java.lang.String r12 = kotlin.p590y.C13199w.m40559a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1.append(r12)
        L_0x006a:
            java.lang.String r12 = "SpannableStringBuilder(m…         })\n            }"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.C3718r.mo13546a(com.bamtechmedia.dominguez.core.content.n):android.text.Spannable");
    }

    /* renamed from: a */
    public Spannable mo13545a(C3686h hVar) {
        String h = hVar.mo13267h();
        if (h == null) {
            h = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(h);
        if (hVar.mo12913w() != null) {
            spannableStringBuilder.append(" • ").append(this.f9294d.mo17730a(hVar.mo12913w(), TimeUnit.MILLISECONDS));
        }
        return spannableStringBuilder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0052, code lost:
        kotlin.p580c0.C12724b.m39863a(r8, r10);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.text.Spannable m12633a(android.net.Uri r10) {
        /*
            r9 = this;
            java.lang.String r6 = r10.toString()
            java.lang.String r0 = "imageUri.toString()"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r6, r0)
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>(r6)
            java.io.FileInputStream r8 = new java.io.FileInputStream
            java.lang.String r0 = r10.getPath()
            r8.<init>(r0)
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x004f }
            android.graphics.drawable.Drawable r10 = android.graphics.drawable.Drawable.createFromStream(r8, r10)     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "drawable"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r10, r0)     // Catch:{ all -> 0x004f }
            int r0 = r10.getIntrinsicWidth()     // Catch:{ all -> 0x004f }
            int r1 = r10.getIntrinsicHeight()     // Catch:{ all -> 0x004f }
            r2 = 0
            r10.setBounds(r2, r2, r0, r1)     // Catch:{ all -> 0x004f }
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r7
            r1 = r6
            int r0 = kotlin.p588j0.C12833x.m40132a(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x004f }
            int r1 = r6.length()     // Catch:{ all -> 0x004f }
            int r1 = r1 + r0
            com.bamtechmedia.dominguez.core.utils.h r2 = new com.bamtechmedia.dominguez.core.utils.h     // Catch:{ all -> 0x004f }
            r3 = 1
            r2.<init>(r10, r3)     // Catch:{ all -> 0x004f }
            r10 = 33
            r7.setSpan(r2, r0, r1, r10)     // Catch:{ all -> 0x004f }
            r10 = 0
            kotlin.p580c0.C12724b.m39863a(r8, r10)
            return r7
        L_0x004f:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            kotlin.p580c0.C12724b.m39863a(r8, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.C3718r.m12633a(android.net.Uri):android.text.Spannable");
    }

    /* renamed from: a */
    private final String m12634a(String str, boolean z, String str2, String str3) {
        String str4;
        String str5 = "reason_";
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(str5);
            sb.append(str2);
            sb.append('_');
            sb.append(str);
            sb.append('_');
            sb.append(str3);
            str4 = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str5);
            sb2.append(str2);
            sb2.append('_');
            sb2.append(str);
            str4 = sb2.toString();
        }
        return C3573a.m12037b(m12635b(), str4, null, 2, null);
    }
}
