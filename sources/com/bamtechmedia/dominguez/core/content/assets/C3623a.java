package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;", "Landroid/os/Parcelable;", "decimalValue", "", "(F)V", "asConstraintDimension", "", "getAsConstraintDimension", "()Ljava/lang/String;", "getDecimalValue", "()F", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.assets.a */
/* compiled from: AspectRatio.kt */
public final class C3623a implements Parcelable {
    public static final Creator CREATOR = new C3625b();
    /* access modifiers changed from: private */

    /* renamed from: U */
    public static final Map<Float, C3623a> f9118U = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: V */
    public static final C3623a f9119V = f9125b0.mo13249a(2.0f);
    /* access modifiers changed from: private */

    /* renamed from: W */
    public static final C3623a f9120W = f9125b0.mo13249a(1.78f);
    /* access modifiers changed from: private */

    /* renamed from: X */
    public static final C3623a f9121X = f9125b0.mo13249a(1.33f);
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public static final C3623a f9122Y = f9125b0.mo13249a(1.0f);
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public static final C3623a f9123Z = f9125b0.mo13249a(0.75f);
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public static final C3623a f9124a0 = f9125b0.mo13249a(0.67f);

    /* renamed from: b0 */
    public static final C3624a f9125b0 = new C3624a(null);

    /* renamed from: c */
    private final float f9126c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.a$a */
    /* compiled from: AspectRatio.kt */
    public static final class C3624a {
        private C3624a() {
        }

        /* renamed from: a */
        public final C3623a mo13249a(float f) {
            Map Y = C3623a.f9118U;
            Float valueOf = Float.valueOf(f);
            Object obj = Y.get(valueOf);
            if (obj == null) {
                obj = new C3623a(f);
                Y.put(valueOf, obj);
            }
            return (C3623a) obj;
        }

        /* renamed from: b */
        public final C3623a mo13250b() {
            return C3623a.f9119V;
        }

        /* renamed from: c */
        public final C3623a mo13251c() {
            return C3623a.f9124a0;
        }

        /* renamed from: d */
        public final C3623a mo13252d() {
            return C3623a.f9123Z;
        }

        /* renamed from: e */
        public final C3623a mo13253e() {
            return C3623a.f9121X;
        }

        /* renamed from: f */
        public final C3623a mo13254f() {
            return C3623a.f9122Y;
        }

        public /* synthetic */ C3624a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C3623a mo13248a() {
            return C3623a.f9120W;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.a$b */
    public static class C3625b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new C3623a(parcel.readFloat());
        }

        public final Object[] newArray(int i) {
            return new C3623a[i];
        }
    }

    public C3623a(float f) {
        this.f9126c = f;
    }

    /* renamed from: X */
    public final float mo13242X() {
        return this.f9126c;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (java.lang.Float.compare(r1.f9126c, ((com.bamtechmedia.dominguez.core.content.assets.C3623a) r2).f9126c) == 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.core.content.assets.C3623a
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.core.content.assets.a r2 = (com.bamtechmedia.dominguez.core.content.assets.C3623a) r2
            float r0 = r1.f9126c
            float r2 = r2.f9126c
            int r2 = java.lang.Float.compare(r0, r2)
            if (r2 != 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.C3623a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f9126c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AspectRatio(decimalValue=");
        sb.append(this.f9126c);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f9126c);
    }
}
