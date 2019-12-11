package com.bamtechmedia.dominguez.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B;\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006$"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "Landroid/os/Parcelable;", "analyticsPage", "Lcom/bamtechmedia/dominguez/analytics/globalvalues/AnalyticsPage;", "transactionId", "", "(Lcom/bamtechmedia/dominguez/analytics/globalvalues/AnalyticsPage;Ljava/lang/String;)V", "pageName", "section", "extrasMap", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getExtrasMap", "()Ljava/util/Map;", "getPageName", "()Ljava/lang/String;", "getSection", "getTransactionId", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "analyticsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.m */
/* compiled from: AnalyticsSection.kt */
public final class C2378m implements Parcelable {
    public static final Creator CREATOR = new C2379a();

    /* renamed from: U */
    private final String f6600U;

    /* renamed from: V */
    private final String f6601V;

    /* renamed from: W */
    private final Map<String, String> f6602W;

    /* renamed from: c */
    private final String f6603c;

    /* renamed from: com.bamtechmedia.dominguez.analytics.m$a */
    public static class C2379a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            while (readInt != 0) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
                readInt--;
            }
            return new C2378m(readString, readString2, readString3, (Map<String, String>) linkedHashMap);
        }

        public final Object[] newArray(int i) {
            return new C2378m[i];
        }
    }

    public C2378m(C2433b bVar) {
        this(bVar, (String) null, 2, (DefaultConstructorMarker) null);
    }

    public C2378m(String str, String str2, String str3, Map<String, String> map) {
        this.f6603c = str;
        this.f6600U = str2;
        this.f6601V = str3;
        this.f6602W = map;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Map, code=java.util.Map<java.lang.String, java.lang.String>, for r4v0, types: [java.util.Map] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtechmedia.dominguez.analytics.C2378m m8910a(com.bamtechmedia.dominguez.analytics.C2378m r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.Map<java.lang.String, java.lang.String> r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            java.lang.String r1 = r0.f6603c
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            java.lang.String r2 = r0.f6600U
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            java.lang.String r3 = r0.f6601V
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.f6602W
        L_0x0018:
            com.bamtechmedia.dominguez.analytics.m r0 = r0.mo11512a(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.analytics.C2378m.m8910a(com.bamtechmedia.dominguez.analytics.m, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, java.lang.Object):com.bamtechmedia.dominguez.analytics.m");
    }

    /* renamed from: X */
    public final Map<String, String> mo11509X() {
        return this.f6602W;
    }

    /* renamed from: Y */
    public final String mo11510Y() {
        return this.f6603c;
    }

    /* renamed from: Z */
    public final String mo11511Z() {
        return this.f6600U;
    }

    /* renamed from: a */
    public final C2378m mo11512a(String str, String str2, String str3, Map<String, String> map) {
        return new C2378m(str, str2, str3, map);
    }

    /* renamed from: a0 */
    public final String mo11513a0() {
        return this.f6601V;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f6602W, (java.lang.Object) r3.f6602W) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.analytics.C2378m
            if (r0 == 0) goto L_0x0031
            com.bamtechmedia.dominguez.analytics.m r3 = (com.bamtechmedia.dominguez.analytics.C2378m) r3
            java.lang.String r0 = r2.f6603c
            java.lang.String r1 = r3.f6603c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f6600U
            java.lang.String r1 = r3.f6600U
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f6601V
            java.lang.String r1 = r3.f6601V
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f6602W
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f6602W
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.analytics.C2378m.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f6603c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6600U;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6601V;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Map<String, String> map = this.f6602W;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnalyticsSection(pageName=");
        sb.append(this.f6603c);
        sb.append(", section=");
        sb.append(this.f6600U);
        sb.append(", transactionId=");
        sb.append(this.f6601V);
        sb.append(", extrasMap=");
        sb.append(this.f6602W);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Map$Entry, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [java.util.Map$Entry, java.lang.Object]
      assigns: [java.lang.Object]
      uses: [java.util.Map$Entry]
      mth insns count: 21
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeToParcel(android.os.Parcel r3, int r4) {
        /*
            r2 = this;
            java.lang.String r4 = r2.f6603c
            r3.writeString(r4)
            java.lang.String r4 = r2.f6600U
            r3.writeString(r4)
            java.lang.String r4 = r2.f6601V
            r3.writeString(r4)
            java.util.Map<java.lang.String, java.lang.String> r4 = r2.f6602W
            int r0 = r4.size()
            r3.writeInt(r0)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0020:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r4.next()
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r3.writeString(r1)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.writeString(r0)
            goto L_0x0020
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.analytics.C2378m.writeToParcel(android.os.Parcel, int):void");
    }

    public /* synthetic */ C2378m(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            map = C13173j0.m40350a();
        }
        this(str, str2, str3, map);
    }

    public /* synthetic */ C2378m(C2433b bVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            str = null;
        }
        this(bVar, str);
    }

    public C2378m(C2433b bVar, String str) {
        this(bVar.mo11564a(), bVar.mo11565b(), str, C13173j0.m40350a());
    }
}
