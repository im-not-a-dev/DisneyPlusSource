package com.bamtechmedia.dominguez.core.content.assets;

import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

/* renamed from: com.bamtechmedia.dominguez.core.content.assets.h */
/* compiled from: DmcItemJsonAdapter.kt */
public final class C3634h extends C11725h<C3626b> {

    /* renamed from: a */
    private final C11760v f9138a;

    public C3634h(C11760v vVar) {
        this.f9138a = vVar;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, C3626b bVar) {
        if (bVar == null) {
            sVar.mo29800i();
        } else {
            this.f9138a.mo29866a(bVar.getClass()).toJson(sVar, bVar);
        }
    }

    public C3626b fromJson(C11737m mVar) {
        Object p = mVar.mo29781p();
        if (p != null) {
            Map map = (Map) p;
            Object obj = map.get("type");
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str = (String) obj;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1668096677:
                        if (str.equals("StandardCollection")) {
                            return (C3626b) this.f9138a.mo29866a(CollectionAsset.class).fromJsonValue(map);
                        }
                        break;
                    case -1519003555:
                        if (str.equals("DmcSeason")) {
                            return (C3626b) this.f9138a.mo29866a(DmcSeason.class).fromJsonValue(map);
                        }
                        break;
                    case -1518507023:
                        if (str.equals("DmcSeries")) {
                            return (C3626b) this.f9138a.mo29866a(DmcSeries.class).fromJsonValue(map);
                        }
                        break;
                    case -877391935:
                        if (str.equals("DmcVideo")) {
                            return (C3626b) m12368a(map).fromJsonValue(map);
                        }
                        break;
                    case 1972874617:
                        if (str.equals("Avatar")) {
                            return (C3626b) this.f9138a.mo29866a(ProfileAvatar.class).fromJsonValue(map);
                        }
                        break;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Do not know how to parse DmcAsset of type ");
            sb.append(str);
            throw new C11734j(sb.toString());
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
    }

    /* renamed from: a */
    private final C11725h<? extends C3632f> m12368a(Map<?, ?> map) {
        Object obj = map.get("programType");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1544438277) {
                String str2 = "moshi.adapter(DmcExtra::class.java)";
                if (hashCode != -711993159) {
                    if (hashCode == 756050958 && str.equals("promotional")) {
                        C11725h<? extends C3632f> a = this.f9138a.mo29866a(DmcExtra.class);
                        Intrinsics.checkReturnedValueIsNotNull((Object) a, str2);
                        return a;
                    }
                } else if (str.equals("supplement")) {
                    C11725h<? extends C3632f> a2 = this.f9138a.mo29866a(DmcExtra.class);
                    Intrinsics.checkReturnedValueIsNotNull((Object) a2, str2);
                    return a2;
                }
            } else if (str.equals("episode")) {
                C11725h<? extends C3632f> a3 = this.f9138a.mo29866a(DmcEpisode.class);
                Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter(DmcEpisode::class.java)");
                return a3;
            }
        }
        C11725h<? extends C3632f> a4 = this.f9138a.mo29866a(DmcMovie.class);
        Intrinsics.checkReturnedValueIsNotNull((Object) a4, "moshi.adapter(DmcMovie::class.java)");
        return a4;
    }
}
