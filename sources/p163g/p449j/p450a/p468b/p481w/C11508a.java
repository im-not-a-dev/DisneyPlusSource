package p163g.p449j.p450a.p468b.p481w;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import p096e.p113e.C3941i;
import p096e.p140j.p141a.C4204a;

/* renamed from: g.j.a.b.w.a */
/* compiled from: ExtendableSavedState */
public class C11508a extends C4204a {
    public static final Creator<C11508a> CREATOR = new C11509a();

    /* renamed from: V */
    public final C3941i<String, Bundle> f26906V;

    /* renamed from: g.j.a.b.w.a$a */
    /* compiled from: ExtendableSavedState */
    static class C11509a implements ClassLoaderCreator<C11508a> {
        C11509a() {
        }

        public C11508a[] newArray(int i) {
            return new C11508a[i];
        }

        public C11508a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C11508a(parcel, classLoader, null);
        }

        public C11508a createFromParcel(Parcel parcel) {
            return new C11508a(parcel, null, null);
        }
    }

    /* synthetic */ C11508a(Parcel parcel, ClassLoader classLoader, C11509a aVar) {
        this(parcel, classLoader);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExtendableSavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" states=");
        sb.append(this.f26906V);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f26906V.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = (String) this.f26906V.mo14151b(i2);
            bundleArr[i2] = (Bundle) this.f26906V.mo14157d(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public C11508a(Parcelable parcelable) {
        super(parcelable);
        this.f26906V = new C3941i<>();
    }

    private C11508a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f26906V = new C3941i<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f26906V.put(strArr[i], bundleArr[i]);
        }
    }
}
