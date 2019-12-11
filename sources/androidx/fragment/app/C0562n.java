package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import androidx.lifecycle.C0715i.C0717b;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.n */
/* compiled from: FragmentState */
final class C0562n implements Parcelable {
    public static final Creator<C0562n> CREATOR = new C0563a();

    /* renamed from: U */
    final String f2427U;

    /* renamed from: V */
    final boolean f2428V;

    /* renamed from: W */
    final int f2429W;

    /* renamed from: X */
    final int f2430X;

    /* renamed from: Y */
    final String f2431Y;

    /* renamed from: Z */
    final boolean f2432Z;

    /* renamed from: a0 */
    final boolean f2433a0;

    /* renamed from: b0 */
    final boolean f2434b0;

    /* renamed from: c */
    final String f2435c;

    /* renamed from: c0 */
    final Bundle f2436c0;

    /* renamed from: d0 */
    final boolean f2437d0;

    /* renamed from: e0 */
    final int f2438e0;

    /* renamed from: f0 */
    Bundle f2439f0;

    /* renamed from: g0 */
    Fragment f2440g0;

    /* renamed from: androidx.fragment.app.n$a */
    /* compiled from: FragmentState */
    static class C0563a implements Creator<C0562n> {
        C0563a() {
        }

        public C0562n createFromParcel(Parcel parcel) {
            return new C0562n(parcel);
        }

        public C0562n[] newArray(int i) {
            return new C0562n[i];
        }
    }

    C0562n(Fragment fragment) {
        this.f2435c = fragment.getClass().getName();
        this.f2427U = fragment.mWho;
        this.f2428V = fragment.mFromLayout;
        this.f2429W = fragment.mFragmentId;
        this.f2430X = fragment.mContainerId;
        this.f2431Y = fragment.mTag;
        this.f2432Z = fragment.mRetainInstance;
        this.f2433a0 = fragment.mRemoving;
        this.f2434b0 = fragment.mDetached;
        this.f2436c0 = fragment.mArguments;
        this.f2437d0 = fragment.mHidden;
        this.f2438e0 = fragment.mMaxState.ordinal();
    }

    /* renamed from: a */
    public Fragment mo3304a(ClassLoader classLoader, C0536g gVar) {
        if (this.f2440g0 == null) {
            Bundle bundle = this.f2436c0;
            if (bundle != null) {
                bundle.setClassLoader(classLoader);
            }
            this.f2440g0 = gVar.mo3141a(classLoader, this.f2435c);
            this.f2440g0.setArguments(this.f2436c0);
            Bundle bundle2 = this.f2439f0;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
                this.f2440g0.mSavedFragmentState = this.f2439f0;
            } else {
                this.f2440g0.mSavedFragmentState = new Bundle();
            }
            Fragment fragment = this.f2440g0;
            fragment.mWho = this.f2427U;
            fragment.mFromLayout = this.f2428V;
            fragment.mRestored = true;
            fragment.mFragmentId = this.f2429W;
            fragment.mContainerId = this.f2430X;
            fragment.mTag = this.f2431Y;
            fragment.mRetainInstance = this.f2432Z;
            fragment.mRemoving = this.f2433a0;
            fragment.mDetached = this.f2434b0;
            fragment.mHidden = this.f2437d0;
            fragment.mMaxState = C0717b.values()[this.f2438e0];
            if (C0542j.f2346A0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiated fragment ");
                sb.append(this.f2440g0);
                Log.v("FragmentManager", sb.toString());
            }
        }
        return this.f2440g0;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2435c);
        sb.append(" (");
        sb.append(this.f2427U);
        sb.append(")}:");
        if (this.f2428V) {
            sb.append(" fromLayout");
        }
        if (this.f2430X != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2430X));
        }
        String str = this.f2431Y;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f2431Y);
        }
        if (this.f2432Z) {
            sb.append(" retainInstance");
        }
        if (this.f2433a0) {
            sb.append(" removing");
        }
        if (this.f2434b0) {
            sb.append(" detached");
        }
        if (this.f2437d0) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2435c);
        parcel.writeString(this.f2427U);
        parcel.writeInt(this.f2428V ? 1 : 0);
        parcel.writeInt(this.f2429W);
        parcel.writeInt(this.f2430X);
        parcel.writeString(this.f2431Y);
        parcel.writeInt(this.f2432Z ? 1 : 0);
        parcel.writeInt(this.f2433a0 ? 1 : 0);
        parcel.writeInt(this.f2434b0 ? 1 : 0);
        parcel.writeBundle(this.f2436c0);
        parcel.writeInt(this.f2437d0 ? 1 : 0);
        parcel.writeBundle(this.f2439f0);
        parcel.writeInt(this.f2438e0);
    }

    C0562n(Parcel parcel) {
        this.f2435c = parcel.readString();
        this.f2427U = parcel.readString();
        boolean z = true;
        this.f2428V = parcel.readInt() != 0;
        this.f2429W = parcel.readInt();
        this.f2430X = parcel.readInt();
        this.f2431Y = parcel.readString();
        this.f2432Z = parcel.readInt() != 0;
        this.f2433a0 = parcel.readInt() != 0;
        this.f2434b0 = parcel.readInt() != 0;
        this.f2436c0 = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.f2437d0 = z;
        this.f2439f0 = parcel.readBundle();
        this.f2438e0 = parcel.readInt();
    }
}
