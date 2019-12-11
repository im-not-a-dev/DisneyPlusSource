package com.bamtechmedia.dominguez.profiles;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import net.danlew.android.joda.DateUtils;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005Bu\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n¢\u0006\u0002\u0010\u0013J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\u0011HÆ\u0003Jy\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0012\u001a\u00020\nHÆ\u0001J\t\u00103\u001a\u000204HÖ\u0001J\u0013\u00105\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000204HÖ\u0001J\t\u00109\u001a\u00020\u0007HÖ\u0001J\u000e\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0007J\u0019\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u000204HÖ\u0001R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000e\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0012\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001bR\u0014\u0010\f\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0014\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019¨\u0006A"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/TempProfile;", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "Landroid/os/Parcelable;", "profile", "originalProfile", "(Lcom/bamtechmedia/dominguez/profiles/Profile;Lcom/bamtechmedia/dominguez/profiles/Profile;)V", "profileId", "", "profileName", "currentlySelected", "", "isDefault", "kidsOnly", "avatarId", "avatarUserSelected", "isAutoPlay", "languagePreferences", "Lcom/bamtechmedia/dominguez/profiles/LanguagePreferences;", "backgroundVideo", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;ZZLcom/bamtechmedia/dominguez/profiles/LanguagePreferences;Lcom/bamtechmedia/dominguez/profiles/Profile;Z)V", "attributes", "Lcom/bamtechmedia/dominguez/profiles/ProfileAttributes;", "getAttributes", "()Lcom/bamtechmedia/dominguez/profiles/ProfileAttributes;", "getAvatarId", "()Ljava/lang/String;", "getAvatarUserSelected", "()Z", "getBackgroundVideo", "getCurrentlySelected", "getKidsOnly", "getLanguagePreferences", "()Lcom/bamtechmedia/dominguez/profiles/LanguagePreferences;", "setLanguagePreferences", "(Lcom/bamtechmedia/dominguez/profiles/LanguagePreferences;)V", "getOriginalProfile", "()Lcom/bamtechmedia/dominguez/profiles/Profile;", "getProfileId", "getProfileName", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "withAppLanguage", "appLanguage", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "profilesApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.r1 */
/* compiled from: ProfileModels.kt */
public final class C6780r1 implements C6626c0, Parcelable {
    public static final Creator CREATOR = new C6781a();

    /* renamed from: U */
    private final String f15159U;

    /* renamed from: V */
    private final boolean f15160V;

    /* renamed from: W */
    private final boolean f15161W;

    /* renamed from: X */
    private final boolean f15162X;

    /* renamed from: Y */
    private final String f15163Y;

    /* renamed from: Z */
    private final boolean f15164Z;

    /* renamed from: a0 */
    private final boolean f15165a0;

    /* renamed from: b0 */
    private C7019z f15166b0;

    /* renamed from: c */
    private final String f15167c;

    /* renamed from: c0 */
    private final C6626c0 f15168c0;

    /* renamed from: d0 */
    private final boolean f15169d0;

    /* renamed from: com.bamtechmedia.dominguez.profiles.r1$a */
    public static class C6781a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C6780r1 r1Var = new C6780r1(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (C7019z) C7019z.CREATOR.createFromParcel(parcel), (C6626c0) parcel.readParcelable(C6780r1.class.getClassLoader()), parcel.readInt() != 0);
            return r1Var;
        }

        public final Object[] newArray(int i) {
            return new C6780r1[i];
        }
    }

    public C6780r1() {
        this(null, null, false, false, false, null, false, false, null, null, false, 2047, null);
    }

    public C6780r1(String str, String str2, boolean z, boolean z2, boolean z3, String str3, boolean z4, boolean z5, C7019z zVar, C6626c0 c0Var, boolean z6) {
        this.f15167c = str;
        this.f15159U = str2;
        this.f15160V = z;
        this.f15161W = z2;
        this.f15162X = z3;
        this.f15163Y = str3;
        this.f15164Z = z4;
        this.f15165a0 = z5;
        this.f15166b0 = zVar;
        this.f15168c0 = c0Var;
        this.f15169d0 = z6;
    }

    /* renamed from: a */
    public static /* synthetic */ C6780r1 m20868a(C6780r1 r1Var, String str, String str2, boolean z, boolean z2, boolean z3, String str3, boolean z4, boolean z5, C7019z zVar, C6626c0 c0Var, boolean z6, int i, Object obj) {
        C6626c0 c0Var2;
        int i2 = i;
        String profileId = (i2 & 1) != 0 ? r1Var.getProfileId() : str;
        String profileName = (i2 & 2) != 0 ? r1Var.getProfileName() : str2;
        boolean Q = (i2 & 4) != 0 ? r1Var.mo19353Q() : z;
        boolean isDefault = (i2 & 8) != 0 ? r1Var.isDefault() : z2;
        boolean R = (i2 & 16) != 0 ? r1Var.mo19354R() : z3;
        String j = (i2 & 32) != 0 ? r1Var.mo19364j() : str3;
        boolean S = (i2 & 64) != 0 ? r1Var.mo19355S() : z4;
        boolean T = (i2 & 128) != 0 ? r1Var.mo19356T() : z5;
        C7019z P = (i2 & 256) != 0 ? r1Var.mo19352P() : zVar;
        if ((i2 & DateUtils.FORMAT_NO_NOON) != 0) {
            c0Var2 = r1Var.f15168c0;
        } else {
            C6780r1 r1Var2 = r1Var;
            c0Var2 = c0Var;
        }
        return r1Var.mo19515a(profileId, profileName, Q, isDefault, R, j, S, T, P, c0Var2, (i2 & 1024) != 0 ? r1Var.mo19351O() : z6);
    }

    /* renamed from: O */
    public boolean mo19351O() {
        return this.f15169d0;
    }

    /* renamed from: P */
    public C7019z mo19352P() {
        return this.f15166b0;
    }

    /* renamed from: Q */
    public boolean mo19353Q() {
        return this.f15160V;
    }

    /* renamed from: R */
    public boolean mo19354R() {
        return this.f15162X;
    }

    /* renamed from: S */
    public boolean mo19355S() {
        return this.f15164Z;
    }

    /* renamed from: T */
    public boolean mo19356T() {
        return this.f15165a0;
    }

    /* renamed from: X */
    public final C6626c0 mo19513X() {
        return this.f15168c0;
    }

    /* renamed from: a */
    public final C6780r1 mo19514a(String str) {
        return m20868a(this, null, null, false, false, false, null, false, false, C7019z.m21314a(mo19352P(), str, null, null, null, null, null, 62, null), null, false, 1791, null);
    }

    /* renamed from: a */
    public final C6780r1 mo19515a(String str, String str2, boolean z, boolean z2, boolean z3, String str3, boolean z4, boolean z5, C7019z zVar, C6626c0 c0Var, boolean z6) {
        C6780r1 r1Var = new C6780r1(str, str2, z, z2, z3, str3, z4, z5, zVar, c0Var, z6);
        return r1Var;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6780r1) {
                C6780r1 r1Var = (C6780r1) obj;
                if (C12880j.m40224a((Object) getProfileId(), (Object) r1Var.getProfileId()) && C12880j.m40224a((Object) getProfileName(), (Object) r1Var.getProfileName())) {
                    if (mo19353Q() == r1Var.mo19353Q()) {
                        if (isDefault() == r1Var.isDefault()) {
                            if ((mo19354R() == r1Var.mo19354R()) && C12880j.m40224a((Object) mo19364j(), (Object) r1Var.mo19364j())) {
                                if (mo19355S() == r1Var.mo19355S()) {
                                    if ((mo19356T() == r1Var.mo19356T()) && C12880j.m40224a((Object) mo19352P(), (Object) r1Var.mo19352P()) && C12880j.m40224a((Object) this.f15168c0, (Object) r1Var.f15168c0)) {
                                        if (mo19351O() == r1Var.mo19351O()) {
                                            return true;
                                        }
                                    }
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

    public C6654e0 getAttributes() {
        C6654e0 e0Var = new C6654e0(mo19354R(), mo19356T(), isDefault(), mo19364j(), mo19355S(), mo19351O(), mo19352P());
        return e0Var;
    }

    public String getProfileId() {
        return this.f15167c;
    }

    public String getProfileName() {
        return this.f15159U;
    }

    public int hashCode() {
        String profileId = getProfileId();
        int i = 0;
        int hashCode = (profileId != null ? profileId.hashCode() : 0) * 31;
        String profileName = getProfileName();
        int hashCode2 = (hashCode + (profileName != null ? profileName.hashCode() : 0)) * 31;
        boolean Q = mo19353Q();
        if (Q) {
            Q = true;
        }
        int i2 = (hashCode2 + (Q ? 1 : 0)) * 31;
        boolean isDefault = isDefault();
        if (isDefault) {
            isDefault = true;
        }
        int i3 = (i2 + (isDefault ? 1 : 0)) * 31;
        boolean R = mo19354R();
        if (R) {
            R = true;
        }
        int i4 = (i3 + (R ? 1 : 0)) * 31;
        String j = mo19364j();
        int hashCode3 = (i4 + (j != null ? j.hashCode() : 0)) * 31;
        boolean S = mo19355S();
        if (S) {
            S = true;
        }
        int i5 = (hashCode3 + (S ? 1 : 0)) * 31;
        boolean T = mo19356T();
        if (T) {
            T = true;
        }
        int i6 = (i5 + (T ? 1 : 0)) * 31;
        C7019z P = mo19352P();
        int hashCode4 = (i6 + (P != null ? P.hashCode() : 0)) * 31;
        C6626c0 c0Var = this.f15168c0;
        if (c0Var != null) {
            i = c0Var.hashCode();
        }
        int i7 = (hashCode4 + i) * 31;
        boolean O = mo19351O();
        if (O) {
            O = true;
        }
        return i7 + (O ? 1 : 0);
    }

    public boolean isDefault() {
        return this.f15161W;
    }

    /* renamed from: j */
    public String mo19364j() {
        return this.f15163Y;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TempProfile(profileId=");
        sb.append(getProfileId());
        sb.append(", profileName=");
        sb.append(getProfileName());
        sb.append(", currentlySelected=");
        sb.append(mo19353Q());
        sb.append(", isDefault=");
        sb.append(isDefault());
        sb.append(", kidsOnly=");
        sb.append(mo19354R());
        sb.append(", avatarId=");
        sb.append(mo19364j());
        sb.append(", avatarUserSelected=");
        sb.append(mo19355S());
        sb.append(", isAutoPlay=");
        sb.append(mo19356T());
        sb.append(", languagePreferences=");
        sb.append(mo19352P());
        sb.append(", originalProfile=");
        sb.append(this.f15168c0);
        sb.append(", backgroundVideo=");
        sb.append(mo19351O());
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15167c);
        parcel.writeString(this.f15159U);
        parcel.writeInt(this.f15160V ? 1 : 0);
        parcel.writeInt(this.f15161W ? 1 : 0);
        parcel.writeInt(this.f15162X ? 1 : 0);
        parcel.writeString(this.f15163Y);
        parcel.writeInt(this.f15164Z ? 1 : 0);
        parcel.writeInt(this.f15165a0 ? 1 : 0);
        this.f15166b0.writeToParcel(parcel, 0);
        parcel.writeParcelable(this.f15168c0, i);
        parcel.writeInt(this.f15169d0 ? 1 : 0);
    }

    public /* synthetic */ C6780r1(String str, String str2, boolean z, boolean z2, boolean z3, String str3, boolean z4, boolean z5, C7019z zVar, C6626c0 c0Var, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        String str4 = "";
        String str5 = (i2 & 1) != 0 ? str4 : str;
        String str6 = (i2 & 2) != 0 ? str4 : str2;
        boolean z7 = false;
        boolean z8 = (i2 & 4) != 0 ? false : z;
        boolean z9 = (i2 & 8) != 0 ? false : z2;
        boolean z10 = (i2 & 16) != 0 ? false : z3;
        if ((i2 & 32) == 0) {
            str4 = str3;
        }
        if ((i2 & 64) == 0) {
            z7 = z4;
        }
        boolean z11 = true;
        boolean z12 = (i2 & 128) != 0 ? true : z5;
        C7019z zVar2 = (i2 & 256) != 0 ? new C7019z("en-GB", null, null, null, null, null, 62, null) : zVar;
        C6626c0 c0Var2 = (i2 & DateUtils.FORMAT_NO_NOON) != 0 ? null : c0Var;
        if ((i2 & 1024) == 0) {
            z11 = z6;
        }
        this(str5, str6, z8, z9, z10, str4, z7, z12, zVar2, c0Var2, z11);
    }

    public /* synthetic */ C6780r1(C6626c0 c0Var, C6626c0 c0Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            c0Var2 = null;
        }
        this(c0Var, c0Var2);
    }

    public C6780r1(C6626c0 c0Var, C6626c0 c0Var2) {
        this(c0Var.getProfileId(), c0Var.getProfileName(), c0Var.mo19353Q(), c0Var.isDefault(), c0Var.mo19354R(), c0Var.mo19364j(), c0Var.mo19355S(), c0Var.mo19356T(), c0Var.mo19352P(), c0Var2, c0Var.mo19351O());
    }
}
