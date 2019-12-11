package com.bamtechmedia.dominguez.detail.common.formats;

import kotlin.jvm.internal.C12880j;

/* renamed from: com.bamtechmedia.dominguez.detail.common.formats.a */
/* compiled from: AvailableFeatureData.kt */
public final class C5928a {

    /* renamed from: a */
    private final AvailableFeatureType f13723a;

    /* renamed from: b */
    private final String f13724b;

    /* renamed from: c */
    private final boolean f13725c;

    /* renamed from: d */
    private final String f13726d;

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5928a(java.lang.String r5, boolean r6, java.lang.String r7) {
        /*
            r4 = this;
            r4.<init>()
            r4.f13724b = r5
            r4.f13725c = r6
            r4.f13726d = r7
            com.bamtechmedia.dominguez.detail.common.formats.AvailableFeatureType[] r5 = com.bamtechmedia.dominguez.detail.common.formats.AvailableFeatureType.values()
            int r6 = r5.length
            r7 = 0
        L_0x000f:
            r0 = 0
            if (r7 >= r6) goto L_0x002f
            r1 = r5[r7]
            java.lang.String r2 = r1.name()
            java.lang.String r2 = com.bamtechmedia.dominguez.core.utils.C5838i0.m18844a(r2)
            java.lang.String r3 = r4.f13726d
            if (r3 == 0) goto L_0x0024
            java.lang.String r0 = com.bamtechmedia.dominguez.core.utils.C5838i0.m18844a(r3)
        L_0x0024:
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r2, r0)
            if (r0 == 0) goto L_0x002c
            r0 = r1
            goto L_0x002f
        L_0x002c:
            int r7 = r7 + 1
            goto L_0x000f
        L_0x002f:
            if (r0 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            com.bamtechmedia.dominguez.detail.common.formats.AvailableFeatureType r0 = com.bamtechmedia.dominguez.detail.common.formats.AvailableFeatureType.UNKNOWN
        L_0x0034:
            r4.f13723a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.common.formats.C5928a.<init>(java.lang.String, boolean, java.lang.String):void");
    }

    /* renamed from: a */
    public final String mo17849a() {
        return this.f13724b;
    }

    /* renamed from: b */
    public final String mo17850b() {
        return this.f13726d;
    }

    /* renamed from: c */
    public final AvailableFeatureType mo17851c() {
        return this.f13723a;
    }

    /* renamed from: d */
    public final boolean mo17852d() {
        return this.f13725c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5928a) {
                C5928a aVar = (C5928a) obj;
                if (C12880j.m40224a((Object) this.f13724b, (Object) aVar.f13724b)) {
                    if (!(this.f13725c == aVar.f13725c) || !C12880j.m40224a((Object) this.f13726d, (Object) aVar.f13726d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f13724b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f13725c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.f13726d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AvailableFeatureData(dictionaryKey=");
        sb.append(this.f13724b);
        sb.append(", isImage=");
        sb.append(this.f13725c);
        sb.append(", metadataKey=");
        sb.append(this.f13726d);
        sb.append(")");
        return sb.toString();
    }
}
