package p163g.p201e.p203b.p298l;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dialog/PromoInfo;", "Landroid/os/Parcelable;", "promoName", "", "(Ljava/lang/String;)V", "actionText", "getActionText", "()Ljava/lang/String;", "actionUrl", "getActionUrl", "description", "getDescription", "imageLogo", "getImageLogo", "noActionText", "getNoActionText", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.l.q */
/* compiled from: PromoInfo.kt */
public final class C7534q implements Parcelable {
    public static final Creator CREATOR = new C7535a();

    /* renamed from: c */
    private final String f16502c;

    /* renamed from: g.e.b.l.q$a */
    public static class C7535a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new C7534q(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new C7534q[i];
        }
    }

    public C7534q(String str) {
        this.f16502c = str;
    }

    /* renamed from: X */
    public final String mo20427X() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16502c);
        sb.append("_buy_now_link_1_text");
        return sb.toString();
    }

    /* renamed from: Y */
    public final String mo20428Y() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16502c);
        sb.append("_buy_now_link_1_url");
        return sb.toString();
    }

    /* renamed from: Z */
    public final String mo20429Z() {
        StringBuilder sb = new StringBuilder();
        sb.append("image_");
        sb.append(this.f16502c);
        return sb.toString();
    }

    /* renamed from: a0 */
    public final String mo20430a0() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16502c);
        sb.append("_cd_visit_");
        sb.append(this.f16502c);
        return sb.toString();
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f16502c, (java.lang.Object) ((p163g.p201e.p203b.p298l.C7534q) r2).f16502c) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof p163g.p201e.p203b.p298l.C7534q
            if (r0 == 0) goto L_0x0013
            g.e.b.l.q r2 = (p163g.p201e.p203b.p298l.C7534q) r2
            java.lang.String r0 = r1.f16502c
            java.lang.String r2 = r2.f16502c
            boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p298l.C7534q.equals(java.lang.Object):boolean");
    }

    public final String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16502c);
        sb.append("_tagline");
        return sb.toString();
    }

    public int hashCode() {
        String str = this.f16502c;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PromoInfo(promoName=");
        sb.append(this.f16502c);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16502c);
    }
}
