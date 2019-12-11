package p163g.p201e.p203b.p312q;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\bHÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/globalnav/GlobalNavTab;", "Landroid/os/Parcelable;", "fragmentClass", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "isTopLevel", "", "menuItemId", "", "fragmentArguments", "Landroid/os/Bundle;", "(Ljava/lang/Class;ZILandroid/os/Bundle;)V", "getFragmentArguments", "()Landroid/os/Bundle;", "getFragmentClass", "()Ljava/lang/Class;", "()Z", "getMenuItemId", "()I", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "globalNavApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.q.j */
/* compiled from: GlobalNavTab.kt */
public final class C7689j implements Parcelable {
    public static final Creator CREATOR = new C7690a();

    /* renamed from: U */
    private final boolean f16732U;

    /* renamed from: V */
    private final int f16733V;

    /* renamed from: W */
    private final Bundle f16734W;

    /* renamed from: c */
    private final Class<? extends Fragment> f16735c;

    /* renamed from: g.e.b.q.j$a */
    public static class C7690a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new C7689j((Class) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt(), parcel.readBundle());
        }

        public final Object[] newArray(int i) {
            return new C7689j[i];
        }
    }

    public C7689j(Class<? extends Fragment> cls, boolean z, int i, Bundle bundle) {
        this.f16735c = cls;
        this.f16732U = z;
        this.f16733V = i;
        this.f16734W = bundle;
    }

    /* renamed from: X */
    public final Bundle mo20602X() {
        return this.f16734W;
    }

    /* renamed from: Y */
    public final Class<? extends Fragment> mo20603Y() {
        return this.f16735c;
    }

    /* renamed from: Z */
    public final int mo20604Z() {
        return this.f16733V;
    }

    /* renamed from: a0 */
    public final boolean mo20605a0() {
        return this.f16732U;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7689j) {
                C7689j jVar = (C7689j) obj;
                if (C12880j.m40224a((Object) this.f16735c, (Object) jVar.f16735c)) {
                    if (this.f16732U == jVar.f16732U) {
                        if (!(this.f16733V == jVar.f16733V) || !C12880j.m40224a((Object) this.f16734W, (Object) jVar.f16734W)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Class<? extends Fragment> cls = this.f16735c;
        int i = 0;
        int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
        boolean z = this.f16732U;
        if (z) {
            z = true;
        }
        int i2 = (((hashCode + (z ? 1 : 0)) * 31) + this.f16733V) * 31;
        Bundle bundle = this.f16734W;
        if (bundle != null) {
            i = bundle.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GlobalNavTab(fragmentClass=");
        sb.append(this.f16735c);
        sb.append(", isTopLevel=");
        sb.append(this.f16732U);
        sb.append(", menuItemId=");
        sb.append(this.f16733V);
        sb.append(", fragmentArguments=");
        sb.append(this.f16734W);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f16735c);
        parcel.writeInt(this.f16732U ? 1 : 0);
        parcel.writeInt(this.f16733V);
        parcel.writeBundle(this.f16734W);
    }
}
