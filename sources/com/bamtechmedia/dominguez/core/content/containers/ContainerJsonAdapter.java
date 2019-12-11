package com.bamtechmedia.dominguez.core.content.containers;

import com.bamtechmedia.dominguez.core.content.sets.C3778h;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/containers/ContainerJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/containers/Container;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "containerTypeAdapter", "Lcom/bamtechmedia/dominguez/core/content/containers/ContainerType;", "dmcSetAdapter", "Lcom/bamtechmedia/dominguez/core/content/sets/DmcSet;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ContainerJsonAdapter.kt */
public final class ContainerJsonAdapter extends C11725h<Container> {
    private final C11725h<ContainerType> containerTypeAdapter;
    private final C11725h<C3778h> dmcSetAdapter;
    private final C11739b options;

    public ContainerJsonAdapter(C11760v vVar) {
        String str = "set";
        String str2 = "type";
        C11739b a = C11739b.m37729a(str2, str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"type\", \"set\")");
        this.options = a;
        C11725h<ContainerType> a2 = vVar.mo29869a((Type) ContainerType.class, C13188p0.m40531a(), str2);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<ContainerT…tions.emptySet(), \"type\")");
        this.containerTypeAdapter = a2;
        C11725h<C3778h> a3 = vVar.mo29869a((Type) C3778h.class, C13188p0.m40531a(), str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter<DmcSet>(Dm…ctions.emptySet(), \"set\")");
        this.dmcSetAdapter = a3;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, Container container) {
        if (container != null) {
            sVar.mo29791b();
            sVar.mo29796e("type");
            this.containerTypeAdapter.toJson(sVar, container.mo13401b());
            sVar.mo29796e("set");
            this.dmcSetAdapter.toJson(sVar, container.mo13400a());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Container)";
    }

    public Container fromJson(C11737m mVar) {
        mVar.mo29763b();
        ContainerType containerType = null;
        C3778h hVar = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                containerType = (ContainerType) this.containerTypeAdapter.fromJson(mVar);
                if (containerType == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'type' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a != 1) {
                continue;
            } else {
                hVar = (C3778h) this.dmcSetAdapter.fromJson(mVar);
                if (hVar == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-null value 'set' was null at ");
                    sb2.append(mVar.mo29775j0());
                    throw new C11734j(sb2.toString());
                }
            }
        }
        mVar.mo29767d();
        if (containerType == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Required property 'type' missing at ");
            sb3.append(mVar.mo29775j0());
            throw new C11734j(sb3.toString());
        } else if (hVar != null) {
            return new Container(containerType, hVar);
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Required property 'set' missing at ");
            sb4.append(mVar.mo29775j0());
            throw new C11734j(sb4.toString());
        }
    }
}
