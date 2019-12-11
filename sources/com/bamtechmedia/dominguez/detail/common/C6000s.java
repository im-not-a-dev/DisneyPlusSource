package com.bamtechmedia.dominguez.detail.common;

import com.bamtechmedia.dominguez.core.content.C3686h;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.C3695p;
import com.bamtechmedia.dominguez.core.content.PromoLabel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p287k.C7313g;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u0016\u0010\f\u001a\u0004\u0018\u00010\u0004*\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/PromoPlayableHelper;", "", "()V", "findPromoPlayable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "extraContent", "Lcom/bamtechmedia/dominguez/detail/common/ExtraContent;", "promoLabel", "Lcom/bamtechmedia/dominguez/core/content/PromoLabel;", "getBookmarkButtonLabel", "", "playable", "findLatest", "contentType", "", "Companion", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.common.s */
/* compiled from: PromoPlayableHelper.kt */
public final class C6000s {

    /* renamed from: com.bamtechmedia.dominguez.detail.common.s$a */
    /* compiled from: PromoPlayableHelper.kt */
    public static final class C6001a {
        private C6001a() {
        }

        public /* synthetic */ C6001a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C6001a(null);
    }

    /* renamed from: a */
    public final C3693o mo18048a(C5982j jVar, PromoLabel promoLabel) {
        if ((promoLabel == null || !C3695p.m12564b(promoLabel)) && (promoLabel == null || !C3695p.m12565c(promoLabel))) {
            return null;
        }
        C3693o a = m19220a(jVar, "trailer");
        if (a == null) {
            a = m19220a(jVar, "clip");
        }
        return a;
    }

    /* renamed from: a */
    public final int mo18047a(C3693o oVar) {
        String contentType = oVar.getContentType();
        if (contentType != null) {
            int hashCode = contentType.hashCode();
            if (hashCode != -1067215565) {
                if (hashCode == 3056464 && contentType.equals("clip")) {
                    return C7313g.btn_play_extra;
                }
            } else if (contentType.equals("trailer")) {
                return C7313g.btn_play_trailer;
            }
        }
        return C7313g.btn_play;
    }

    /* renamed from: a */
    private final C3693o m19220a(C5982j jVar, String str) {
        Object obj;
        Iterator it = jVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((C3686h) obj).getContentType(), (Object) str)) {
                break;
            }
        }
        return (C3693o) obj;
    }
}
