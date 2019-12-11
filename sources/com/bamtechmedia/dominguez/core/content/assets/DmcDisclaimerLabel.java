package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bamtechmedia.dominguez.core.content.C3683e;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/DmcDisclaimerLabel;", "Landroid/os/Parcelable;", "Lcom/bamtechmedia/dominguez/core/content/DisclaimerLabel;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: DmcDisclaimerLabel.kt */
public final class DmcDisclaimerLabel implements Parcelable, C3683e {
    public static final Creator CREATOR = new C3596a();

    /* renamed from: c */
    private final String f8950c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.DmcDisclaimerLabel$a */
    public static class C3596a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new DmcDisclaimerLabel(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new DmcDisclaimerLabel[i];
        }
    }

    public DmcDisclaimerLabel(String str) {
        this.f8950c = str;
    }

    /* renamed from: X */
    public String mo12863X() {
        return this.f8950c;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) mo12863X(), (java.lang.Object) ((com.bamtechmedia.dominguez.core.content.assets.DmcDisclaimerLabel) r2).mo12863X()) != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0019
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.core.content.assets.DmcDisclaimerLabel
            if (r0 == 0) goto L_0x0017
            com.bamtechmedia.dominguez.core.content.assets.DmcDisclaimerLabel r2 = (com.bamtechmedia.dominguez.core.content.assets.DmcDisclaimerLabel) r2
            java.lang.String r0 = r1.mo12863X()
            java.lang.String r2 = r2.mo12863X()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r2 = 0
            return r2
        L_0x0019:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.DmcDisclaimerLabel.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String X = mo12863X();
        if (X != null) {
            return X.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcDisclaimerLabel(value=");
        sb.append(mo12863X());
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8950c);
    }
}
