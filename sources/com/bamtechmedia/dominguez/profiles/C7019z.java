package com.bamtechmedia.dominguez.profiles;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 02\u00020\u0001:\u00010BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012JV\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010#J\t\u0010$\u001a\u00020%HÖ\u0001J\u0013\u0010&\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020%HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020%HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014¨\u00061"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/LanguagePreferences;", "Landroid/os/Parcelable;", "appLanguage", "", "playbackLanguage", "preferAudioDescription", "", "preferSDH", "subtitleLanguage", "subtitlesEnabled", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAppLanguage", "()Ljava/lang/String;", "setAppLanguage", "(Ljava/lang/String;)V", "getPlaybackLanguage", "setPlaybackLanguage", "getPreferAudioDescription", "()Ljava/lang/Boolean;", "setPreferAudioDescription", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPreferSDH", "setPreferSDH", "getSubtitleLanguage", "setSubtitleLanguage", "getSubtitlesEnabled", "setSubtitlesEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/bamtechmedia/dominguez/profiles/LanguagePreferences;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "profilesApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.z */
/* compiled from: ProfileModels.kt */
public final class C7019z implements Parcelable {
    public static final Creator CREATOR = new C7021b();

    /* renamed from: U */
    private String f15594U;

    /* renamed from: V */
    private Boolean f15595V;

    /* renamed from: W */
    private Boolean f15596W;

    /* renamed from: X */
    private String f15597X;

    /* renamed from: Y */
    private Boolean f15598Y;

    /* renamed from: c */
    private String f15599c;

    /* renamed from: com.bamtechmedia.dominguez.profiles.z$a */
    /* compiled from: ProfileModels.kt */
    public static final class C7020a {
        private C7020a() {
        }

        public /* synthetic */ C7020a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.z$b */
    public static class C7021b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            if (parcel.readInt() != 0) {
                bool2 = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool2 = null;
            }
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool3 = Boolean.valueOf(z);
            } else {
                bool3 = null;
            }
            C7019z zVar = new C7019z(readString, readString2, bool, bool2, readString3, bool3);
            return zVar;
        }

        public final Object[] newArray(int i) {
            return new C7019z[i];
        }
    }

    static {
        new C7020a(null);
    }

    public C7019z() {
        this(null, null, null, null, null, null, 63, null);
    }

    public C7019z(String str, String str2, Boolean bool, Boolean bool2, String str3, Boolean bool3) {
        this.f15599c = str;
        this.f15594U = str2;
        this.f15595V = bool;
        this.f15596W = bool2;
        this.f15597X = str3;
        this.f15598Y = bool3;
    }

    /* renamed from: a */
    public static /* synthetic */ C7019z m21314a(C7019z zVar, String str, String str2, Boolean bool, Boolean bool2, String str3, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zVar.f15599c;
        }
        if ((i & 2) != 0) {
            str2 = zVar.f15594U;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            bool = zVar.f15595V;
        }
        Boolean bool4 = bool;
        if ((i & 8) != 0) {
            bool2 = zVar.f15596W;
        }
        Boolean bool5 = bool2;
        if ((i & 16) != 0) {
            str3 = zVar.f15597X;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            bool3 = zVar.f15598Y;
        }
        return zVar.mo19795a(str, str4, bool4, bool5, str5, bool3);
    }

    /* renamed from: X */
    public final String mo19792X() {
        return this.f15599c;
    }

    /* renamed from: Y */
    public final String mo19793Y() {
        return this.f15594U;
    }

    /* renamed from: Z */
    public final Boolean mo19794Z() {
        return this.f15595V;
    }

    /* renamed from: a */
    public final C7019z mo19795a(String str, String str2, Boolean bool, Boolean bool2, String str3, Boolean bool3) {
        C7019z zVar = new C7019z(str, str2, bool, bool2, str3, bool3);
        return zVar;
    }

    /* renamed from: a0 */
    public final Boolean mo19796a0() {
        return this.f15596W;
    }

    /* renamed from: b0 */
    public final String mo19797b0() {
        return this.f15597X;
    }

    /* renamed from: c0 */
    public final Boolean mo19798c0() {
        return this.f15598Y;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f15598Y, (java.lang.Object) r3.f15598Y) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.profiles.C7019z
            if (r0 == 0) goto L_0x0045
            com.bamtechmedia.dominguez.profiles.z r3 = (com.bamtechmedia.dominguez.profiles.C7019z) r3
            java.lang.String r0 = r2.f15599c
            java.lang.String r1 = r3.f15599c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f15594U
            java.lang.String r1 = r3.f15594U
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.Boolean r0 = r2.f15595V
            java.lang.Boolean r1 = r3.f15595V
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.Boolean r0 = r2.f15596W
            java.lang.Boolean r1 = r3.f15596W
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f15597X
            java.lang.String r1 = r3.f15597X
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.Boolean r0 = r2.f15598Y
            java.lang.Boolean r3 = r3.f15598Y
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r3 = 0
            return r3
        L_0x0047:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.C7019z.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f15599c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f15594U;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f15595V;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f15596W;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str3 = this.f15597X;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool3 = this.f15598Y;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LanguagePreferences(appLanguage=");
        sb.append(this.f15599c);
        sb.append(", playbackLanguage=");
        sb.append(this.f15594U);
        sb.append(", preferAudioDescription=");
        sb.append(this.f15595V);
        sb.append(", preferSDH=");
        sb.append(this.f15596W);
        sb.append(", subtitleLanguage=");
        sb.append(this.f15597X);
        sb.append(", subtitlesEnabled=");
        sb.append(this.f15598Y);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15599c);
        parcel.writeString(this.f15594U);
        Boolean bool = this.f15595V;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool2 = this.f15596W;
        if (bool2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f15597X);
        Boolean bool3 = this.f15598Y;
        if (bool3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
            return;
        }
        parcel.writeInt(0);
    }

    public /* synthetic */ C7019z(String str, String str2, Boolean bool, Boolean bool2, String str3, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4 = null;
        String str5 = (i & 1) != 0 ? null : str;
        String str6 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            bool = Boolean.valueOf(false);
        }
        Boolean bool4 = bool;
        if ((i & 8) != 0) {
            bool2 = Boolean.valueOf(false);
        }
        Boolean bool5 = bool2;
        if ((i & 16) == 0) {
            str4 = str3;
        }
        if ((i & 32) != 0) {
            bool3 = Boolean.valueOf(false);
        }
        this(str5, str6, bool4, bool5, str4, bool3);
    }
}
