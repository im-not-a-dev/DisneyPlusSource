package com.bamtechmedia.dominguez.core.content.playback.queryaction;

import com.bamtechmedia.dominguez.core.content.assets.C3632f;
import org.joda.time.DateTime;

/* renamed from: com.bamtechmedia.dominguez.core.content.playback.queryaction.d */
/* compiled from: UpNextResult.kt */
public final class C3714d {

    /* renamed from: a */
    private final C3715e f9279a;

    /* renamed from: b */
    private final C3632f f9280b;

    /* renamed from: c */
    private final C3711a f9281c;

    /* renamed from: d */
    private final C3711a f9282d;

    /* renamed from: e */
    private final DateTime f9283e;

    public C3714d(C3715e eVar, C3632f fVar, C3711a aVar, C3711a aVar2, DateTime dateTime) {
        this.f9279a = eVar;
        this.f9280b = fVar;
        this.f9281c = aVar;
        this.f9282d = aVar2;
        this.f9283e = dateTime;
    }

    /* renamed from: a */
    public final DateTime mo13535a() {
        return this.f9283e;
    }

    /* renamed from: b */
    public final C3632f mo13536b() {
        return this.f9280b;
    }

    /* renamed from: c */
    public final C3711a mo13537c() {
        return this.f9281c;
    }

    /* renamed from: d */
    public final C3711a mo13538d() {
        return this.f9282d;
    }

    /* renamed from: e */
    public final C3715e mo13539e() {
        return this.f9279a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f9283e, (java.lang.Object) r3.f9283e) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.playback.queryaction.C3714d
            if (r0 == 0) goto L_0x003b
            com.bamtechmedia.dominguez.core.content.playback.queryaction.d r3 = (com.bamtechmedia.dominguez.core.content.playback.queryaction.C3714d) r3
            com.bamtechmedia.dominguez.core.content.playback.queryaction.e r0 = r2.f9279a
            com.bamtechmedia.dominguez.core.content.playback.queryaction.e r1 = r3.f9279a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.bamtechmedia.dominguez.core.content.assets.f r0 = r2.f9280b
            com.bamtechmedia.dominguez.core.content.assets.f r1 = r3.f9280b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.bamtechmedia.dominguez.core.content.playback.queryaction.a r0 = r2.f9281c
            com.bamtechmedia.dominguez.core.content.playback.queryaction.a r1 = r3.f9281c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.bamtechmedia.dominguez.core.content.playback.queryaction.a r0 = r2.f9282d
            com.bamtechmedia.dominguez.core.content.playback.queryaction.a r1 = r3.f9282d
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            org.joda.time.DateTime r0 = r2.f9283e
            org.joda.time.DateTime r3 = r3.f9283e
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.playback.queryaction.C3714d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C3715e eVar = this.f9279a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        C3632f fVar = this.f9280b;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C3711a aVar = this.f9281c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C3711a aVar2 = this.f9282d;
        int hashCode4 = (hashCode3 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        DateTime dateTime = this.f9283e;
        if (dateTime != null) {
            i = dateTime.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpNextResult(upNextType=");
        sb.append(this.f9279a);
        sb.append(", nextAsset=");
        sb.append(this.f9280b);
        sb.append(", programTypeItemFrom=");
        sb.append(this.f9281c);
        sb.append(", programTypeItemTo=");
        sb.append(this.f9282d);
        sb.append(", comingSoonDate=");
        sb.append(this.f9283e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C3714d(C3715e eVar, C3632f fVar, C3711a aVar, C3711a aVar2, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i & 2) != 0 ? null : fVar, aVar, aVar2, (i & 16) != 0 ? null : dateTime);
    }
}
