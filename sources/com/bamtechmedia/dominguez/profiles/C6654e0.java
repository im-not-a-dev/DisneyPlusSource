package com.bamtechmedia.dominguez.profiles;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/ProfileAttributes;", "Landroid/os/Parcelable;", "isKidsModeEnabled", "", "isAutoPlayEnabled", "isDefault", "avatarId", "", "avatarUserSelected", "backgroundVideo", "languagePreferences", "Lcom/bamtechmedia/dominguez/profiles/LanguagePreferences;", "(ZZZLjava/lang/String;ZZLcom/bamtechmedia/dominguez/profiles/LanguagePreferences;)V", "getAvatarId", "()Ljava/lang/String;", "getAvatarUserSelected", "()Z", "getBackgroundVideo", "getLanguagePreferences", "()Lcom/bamtechmedia/dominguez/profiles/LanguagePreferences;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "profilesApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.e0 */
/* compiled from: ProfileAttributes.kt */
public final class C6654e0 implements Parcelable {
    public static final Creator CREATOR = new C6655a();

    /* renamed from: U */
    private final boolean f14990U;

    /* renamed from: V */
    private final boolean f14991V;

    /* renamed from: W */
    private final String f14992W;

    /* renamed from: X */
    private final boolean f14993X;

    /* renamed from: Y */
    private final boolean f14994Y;

    /* renamed from: Z */
    private final C7019z f14995Z;

    /* renamed from: c */
    private final boolean f14996c;

    /* renamed from: com.bamtechmedia.dominguez.profiles.e0$a */
    public static class C6655a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C6654e0 e0Var = new C6654e0(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (C7019z) C7019z.CREATOR.createFromParcel(parcel));
            return e0Var;
        }

        public final Object[] newArray(int i) {
            return new C6654e0[i];
        }
    }

    public C6654e0(boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5, C7019z zVar) {
        this.f14996c = z;
        this.f14990U = z2;
        this.f14991V = z3;
        this.f14992W = str;
        this.f14993X = z4;
        this.f14994Y = z5;
        this.f14995Z = zVar;
    }

    /* renamed from: O */
    public final boolean mo19334O() {
        return this.f14994Y;
    }

    /* renamed from: P */
    public final C7019z mo19335P() {
        return this.f14995Z;
    }

    /* renamed from: S */
    public final boolean mo19336S() {
        return this.f14993X;
    }

    /* renamed from: X */
    public final boolean mo19337X() {
        return this.f14990U;
    }

    /* renamed from: Y */
    public final boolean mo19338Y() {
        return this.f14996c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6654e0) {
                C6654e0 e0Var = (C6654e0) obj;
                if (this.f14996c == e0Var.f14996c) {
                    if (this.f14990U == e0Var.f14990U) {
                        if ((this.f14991V == e0Var.f14991V) && C12880j.m40224a((Object) this.f14992W, (Object) e0Var.f14992W)) {
                            if (this.f14993X == e0Var.f14993X) {
                                if (!(this.f14994Y == e0Var.f14994Y) || !C12880j.m40224a((Object) this.f14995Z, (Object) e0Var.f14995Z)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.f14996c;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.f14990U;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.f14991V;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        String str = this.f14992W;
        int i5 = 0;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z4 = this.f14993X;
        if (z4) {
            z4 = true;
        }
        int i6 = (hashCode + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f14994Y;
        if (!z5) {
            i = z5;
        }
        int i7 = (i6 + i) * 31;
        C7019z zVar = this.f14995Z;
        if (zVar != null) {
            i5 = zVar.hashCode();
        }
        return i7 + i5;
    }

    public final boolean isDefault() {
        return this.f14991V;
    }

    /* renamed from: j */
    public final String mo19343j() {
        return this.f14992W;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProfileAttributes(isKidsModeEnabled=");
        sb.append(this.f14996c);
        sb.append(", isAutoPlayEnabled=");
        sb.append(this.f14990U);
        sb.append(", isDefault=");
        sb.append(this.f14991V);
        sb.append(", avatarId=");
        sb.append(this.f14992W);
        sb.append(", avatarUserSelected=");
        sb.append(this.f14993X);
        sb.append(", backgroundVideo=");
        sb.append(this.f14994Y);
        sb.append(", languagePreferences=");
        sb.append(this.f14995Z);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14996c ? 1 : 0);
        parcel.writeInt(this.f14990U ? 1 : 0);
        parcel.writeInt(this.f14991V ? 1 : 0);
        parcel.writeString(this.f14992W);
        parcel.writeInt(this.f14993X ? 1 : 0);
        parcel.writeInt(this.f14994Y ? 1 : 0);
        this.f14995Z.writeToParcel(parcel, 0);
    }

    public /* synthetic */ C6654e0(boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5, C7019z zVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, str, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? true : z5, (i & 64) != 0 ? new C7019z(null, null, null, null, null, null, 63, null) : zVar);
    }
}
