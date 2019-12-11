package p163g.p201e.p203b.p311p;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bamtechmedia.dominguez.core.content.sets.ContentSetType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006$"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/filter/Filter;", "Landroid/os/Parcelable;", "id", "", "title", "setType", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;", "isSelected", "", "showIsNewItem", "(Ljava/lang/String;Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;ZZ)V", "getId", "()Ljava/lang/String;", "()Z", "getSetType", "()Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;", "getShowIsNewItem", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "filter_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.p.a */
/* compiled from: Filter.kt */
public final class C7649a implements Parcelable {
    public static final Creator CREATOR = new C7650a();

    /* renamed from: U */
    private final String f16663U;

    /* renamed from: V */
    private final ContentSetType f16664V;

    /* renamed from: W */
    private final boolean f16665W;

    /* renamed from: X */
    private final boolean f16666X;

    /* renamed from: c */
    private final String f16667c;

    /* renamed from: g.e.b.p.a$a */
    public static class C7650a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ContentSetType contentSetType = (ContentSetType) Enum.valueOf(ContentSetType.class, parcel.readString());
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            C7649a aVar = new C7649a(readString, readString2, contentSetType, z2, z);
            return aVar;
        }

        public final Object[] newArray(int i) {
            return new C7649a[i];
        }
    }

    public C7649a(String str, String str2, ContentSetType contentSetType, boolean z, boolean z2) {
        this.f16667c = str;
        this.f16663U = str2;
        this.f16664V = contentSetType;
        this.f16665W = z;
        this.f16666X = z2;
    }

    /* renamed from: X */
    public final String mo20570X() {
        return this.f16667c;
    }

    /* renamed from: Y */
    public final String mo20571Y() {
        return this.f16663U;
    }

    /* renamed from: Z */
    public final boolean mo20572Z() {
        return this.f16665W;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7649a) {
                C7649a aVar = (C7649a) obj;
                if (Intrinsics.areEqual((Object) this.f16667c, (Object) aVar.f16667c) && Intrinsics.areEqual((Object) this.f16663U, (Object) aVar.f16663U) && Intrinsics.areEqual((Object) this.f16664V, (Object) aVar.f16664V)) {
                    if (this.f16665W == aVar.f16665W) {
                        if (this.f16666X == aVar.f16666X) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f16667c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f16663U;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ContentSetType contentSetType = this.f16664V;
        if (contentSetType != null) {
            i = contentSetType.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f16665W;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f16666X;
        if (z2) {
            z2 = true;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Filter(id=");
        sb.append(this.f16667c);
        sb.append(", title=");
        sb.append(this.f16663U);
        sb.append(", setType=");
        sb.append(this.f16664V);
        sb.append(", isSelected=");
        sb.append(this.f16665W);
        sb.append(", showIsNewItem=");
        sb.append(this.f16666X);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16667c);
        parcel.writeString(this.f16663U);
        parcel.writeString(this.f16664V.name());
        parcel.writeInt(this.f16665W ? 1 : 0);
        parcel.writeInt(this.f16666X ? 1 : 0);
    }

    public /* synthetic */ C7649a(String str, String str2, ContentSetType contentSetType, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            contentSetType = ContentSetType.UnsupportedSet;
        }
        this(str, str2, contentSetType, z, (i & 16) != 0 ? false : z2);
    }
}
