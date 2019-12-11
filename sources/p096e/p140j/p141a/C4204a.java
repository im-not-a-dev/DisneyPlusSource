package p096e.p140j.p141a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

/* renamed from: e.j.a.a */
/* compiled from: AbsSavedState */
public abstract class C4204a implements Parcelable {
    public static final Creator<C4204a> CREATOR = new C4206b();

    /* renamed from: U */
    public static final C4204a f10514U = new C4205a();

    /* renamed from: c */
    private final Parcelable f10515c;

    /* renamed from: e.j.a.a$a */
    /* compiled from: AbsSavedState */
    static class C4205a extends C4204a {
        C4205a() {
            super((C4205a) null);
        }
    }

    /* renamed from: e.j.a.a$b */
    /* compiled from: AbsSavedState */
    static class C4206b implements ClassLoaderCreator<C4204a> {
        C4206b() {
        }

        public C4204a[] newArray(int i) {
            return new C4204a[i];
        }

        public C4204a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return C4204a.f10514U;
            }
            throw new IllegalStateException("superState must be null");
        }

        public C4204a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }
    }

    /* synthetic */ C4204a(C4205a aVar) {
        this();
    }

    /* renamed from: X */
    public final Parcelable mo14857X() {
        return this.f10515c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f10515c, i);
    }

    private C4204a() {
        this.f10515c = null;
    }

    protected C4204a(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == f10514U) {
                parcelable = null;
            }
            this.f10515c = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected C4204a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = f10514U;
        }
        this.f10515c = readParcelable;
    }
}
