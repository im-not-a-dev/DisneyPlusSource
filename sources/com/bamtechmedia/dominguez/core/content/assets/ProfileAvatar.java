package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.bamtechmedia.dominguez.core.content.C3593a;
import com.bamtechmedia.dominguez.core.content.C3593a.C3594a;
import com.bamtechmedia.dominguez.core.content.C3688j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001fH\u0016J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0018HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000b¨\u0006&"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/ProfileAvatar;", "Lcom/bamtechmedia/dominguez/core/content/Avatar;", "avatarId", "", "texts", "", "Lcom/bamtechmedia/dominguez/core/content/assets/TextEntry;", "images", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAvatarId", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "getTexts", "title", "getTitle", "uniqueId", "getUniqueId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "isSameAs", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: ProfileAvatar.kt */
public final class ProfileAvatar implements C3593a {
    public static final Creator CREATOR = new C3617a();

    /* renamed from: U */
    private final List<TextEntry> f9099U;

    /* renamed from: V */
    private final List<Image> f9100V;

    /* renamed from: c */
    private final String f9101c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.ProfileAvatar$a */
    public static class C3617a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList2.add((TextEntry) parcel.readParcelable(ProfileAvatar.class.getClassLoader()));
                readInt--;
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList.add((Image) parcel.readParcelable(ProfileAvatar.class.getClassLoader()));
                    readInt2--;
                }
            } else {
                arrayList = null;
            }
            return new ProfileAvatar(readString, arrayList2, arrayList);
        }

        public final Object[] newArray(int i) {
            return new ProfileAvatar[i];
        }
    }

    public ProfileAvatar(String str, List<TextEntry> list, List<Image> list2) {
        this.f9101c = str;
        this.f9099U = list;
        this.f9100V = list2;
    }

    /* renamed from: a */
    public Image mo12845a(C3688j jVar, C3623a aVar) {
        return C3594a.m12091a((C3593a) this, jVar, aVar);
    }

    /* renamed from: b */
    public String mo13175b() {
        return mo12824j();
    }

    /* renamed from: c */
    public final List<TextEntry> mo13176c() {
        return this.f9099U;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) mo12847a(), (java.lang.Object) r3.mo12847a()) != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0031
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.assets.ProfileAvatar
            if (r0 == 0) goto L_0x002f
            com.bamtechmedia.dominguez.core.content.assets.ProfileAvatar r3 = (com.bamtechmedia.dominguez.core.content.assets.ProfileAvatar) r3
            java.lang.String r0 = r2.mo12824j()
            java.lang.String r1 = r3.mo12824j()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x002f
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.TextEntry> r0 = r2.f9099U
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.TextEntry> r1 = r3.f9099U
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x002f
            java.util.List r0 = r2.mo12847a()
            java.util.List r3 = r3.mo12847a()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r3 = 0
            return r3
        L_0x0031:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.ProfileAvatar.equals(java.lang.Object):boolean");
    }

    public String getTitle() {
        return C3650u.m12406a(this.f9099U, C3648s.TITLE, null, C3647r.AVATAR, 2, null);
    }

    public int hashCode() {
        String j = mo12824j();
        int i = 0;
        int hashCode = (j != null ? j.hashCode() : 0) * 31;
        List<TextEntry> list = this.f9099U;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List a = mo12847a();
        if (a != null) {
            i = a.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: j */
    public String mo12824j() {
        return this.f9101c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProfileAvatar(avatarId=");
        sb.append(mo12824j());
        sb.append(", texts=");
        sb.append(this.f9099U);
        sb.append(", images=");
        sb.append(mo12847a());
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9101c);
        List<TextEntry> list = this.f9099U;
        parcel.writeInt(list.size());
        for (TextEntry writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        List<Image> list2 = this.f9100V;
        if (list2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (Image writeParcelable2 : list2) {
                parcel.writeParcelable(writeParcelable2, i);
            }
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: a */
    public Image mo12846a(String str, C3623a aVar) {
        return C3594a.m12092a((C3593a) this, str, aVar);
    }

    /* renamed from: a */
    public List<Image> mo12847a() {
        return this.f9100V;
    }

    /* renamed from: a */
    public boolean mo12848a(C3626b bVar) {
        return (bVar instanceof ProfileAvatar) && Intrinsics.areEqual((Object) ((ProfileAvatar) bVar).mo12824j(), (Object) mo12824j());
    }
}
