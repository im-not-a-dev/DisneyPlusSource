package com.bamtechmedia.dominguez.core.content.assets;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/UserMediaMetaJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/assets/UserMediaMeta;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "longAdapter", "", "nullableLongAdapter", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserMediaMetaJsonAdapter.kt */
public final class UserMediaMetaJsonAdapter extends C11725h<UserMediaMeta> {
    private final C11725h<Long> longAdapter;
    private final C11725h<Long> nullableLongAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public UserMediaMetaJsonAdapter(C11760v vVar) {
        C11739b a = C11739b.m37729a("userId", "ccMedia", "ccDefault", "occurredOn", "playhead", "runtime");
        C12880j.m40222a((Object) a, "JsonReader.Options.of(\"u…\", \"playhead\", \"runtime\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), "userId");
        C12880j.m40222a((Object) a2, "moshi.adapter<String>(St…ons.emptySet(), \"userId\")");
        this.stringAdapter = a2;
        C11725h<Long> a3 = vVar.mo29869a((Type) Long.class, C13188p0.m40531a(), "ccMedia");
        C12880j.m40222a((Object) a3, "moshi.adapter<Long?>(Lon…ns.emptySet(), \"ccMedia\")");
        this.nullableLongAdapter = a3;
        C11725h<Long> a4 = vVar.mo29869a((Type) Long.TYPE, C13188p0.m40531a(), "ccDefault");
        C12880j.m40222a((Object) a4, "moshi.adapter<Long>(Long….emptySet(), \"ccDefault\")");
        this.longAdapter = a4;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, UserMediaMeta userMediaMeta) {
        if (userMediaMeta != null) {
            sVar.mo29791b();
            sVar.mo29796e("userId");
            this.stringAdapter.toJson(sVar, userMediaMeta.mo13230b0());
            sVar.mo29796e("ccMedia");
            this.nullableLongAdapter.toJson(sVar, userMediaMeta.mo13226Y());
            sVar.mo29796e("ccDefault");
            this.longAdapter.toJson(sVar, Long.valueOf(userMediaMeta.mo13225X()));
            sVar.mo29796e("occurredOn");
            this.longAdapter.toJson(sVar, Long.valueOf(userMediaMeta.mo13227Z()));
            sVar.mo29796e("playhead");
            this.longAdapter.toJson(sVar, Long.valueOf(userMediaMeta.getPlayhead()));
            sVar.mo29796e("runtime");
            this.longAdapter.toJson(sVar, Long.valueOf(userMediaMeta.mo13229a0()));
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(UserMediaMeta)";
    }

    public UserMediaMeta fromJson(C11737m mVar) {
        C11737m mVar2 = mVar;
        mVar.mo29763b();
        Long l = null;
        Long l2 = null;
        String str = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        while (mVar.mo29770f()) {
            switch (mVar2.mo29758a(this.options)) {
                case -1:
                    mVar.mo29783q();
                    mVar.mo29784r();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(mVar2);
                    if (str != null) {
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Non-null value 'userId' was null at ");
                        sb.append(mVar.mo29775j0());
                        throw new C11734j(sb.toString());
                    }
                case 1:
                    l3 = (Long) this.nullableLongAdapter.fromJson(mVar2);
                    break;
                case 2:
                    Long l6 = (Long) this.longAdapter.fromJson(mVar2);
                    if (l6 != null) {
                        l = Long.valueOf(l6.longValue());
                        break;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Non-null value 'ccDefault' was null at ");
                        sb2.append(mVar.mo29775j0());
                        throw new C11734j(sb2.toString());
                    }
                case 3:
                    Long l7 = (Long) this.longAdapter.fromJson(mVar2);
                    if (l7 != null) {
                        l2 = Long.valueOf(l7.longValue());
                        break;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Non-null value 'occurredOn' was null at ");
                        sb3.append(mVar.mo29775j0());
                        throw new C11734j(sb3.toString());
                    }
                case 4:
                    Long l8 = (Long) this.longAdapter.fromJson(mVar2);
                    if (l8 != null) {
                        l4 = Long.valueOf(l8.longValue());
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Non-null value 'playhead' was null at ");
                        sb4.append(mVar.mo29775j0());
                        throw new C11734j(sb4.toString());
                    }
                case 5:
                    Long l9 = (Long) this.longAdapter.fromJson(mVar2);
                    if (l9 != null) {
                        l5 = Long.valueOf(l9.longValue());
                        break;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Non-null value 'runtime' was null at ");
                        sb5.append(mVar.mo29775j0());
                        throw new C11734j(sb5.toString());
                    }
            }
        }
        mVar.mo29767d();
        if (str == null) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Required property 'userId' missing at ");
            sb6.append(mVar.mo29775j0());
            throw new C11734j(sb6.toString());
        } else if (l != null) {
            long longValue = l.longValue();
            if (l2 != null) {
                long longValue2 = l2.longValue();
                if (l4 != null) {
                    long longValue3 = l4.longValue();
                    if (l5 != null) {
                        UserMediaMeta userMediaMeta = new UserMediaMeta(str, l3, longValue, longValue2, longValue3, l5.longValue());
                        return userMediaMeta;
                    }
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("Required property 'runtime' missing at ");
                    sb7.append(mVar.mo29775j0());
                    throw new C11734j(sb7.toString());
                }
                StringBuilder sb8 = new StringBuilder();
                sb8.append("Required property 'playhead' missing at ");
                sb8.append(mVar.mo29775j0());
                throw new C11734j(sb8.toString());
            }
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Required property 'occurredOn' missing at ");
            sb9.append(mVar.mo29775j0());
            throw new C11734j(sb9.toString());
        } else {
            StringBuilder sb10 = new StringBuilder();
            sb10.append("Required property 'ccDefault' missing at ");
            sb10.append(mVar.mo29775j0());
            throw new C11734j(sb10.toString());
        }
    }
}
