package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.C0715i.C0717b;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b */
/* compiled from: BackStackState */
final class C0528b implements Parcelable {
    public static final Creator<C0528b> CREATOR = new C0529a();

    /* renamed from: U */
    final ArrayList<String> f2320U;

    /* renamed from: V */
    final int[] f2321V;

    /* renamed from: W */
    final int[] f2322W;

    /* renamed from: X */
    final int f2323X;

    /* renamed from: Y */
    final int f2324Y;

    /* renamed from: Z */
    final String f2325Z;

    /* renamed from: a0 */
    final int f2326a0;

    /* renamed from: b0 */
    final int f2327b0;

    /* renamed from: c */
    final int[] f2328c;

    /* renamed from: c0 */
    final CharSequence f2329c0;

    /* renamed from: d0 */
    final int f2330d0;

    /* renamed from: e0 */
    final CharSequence f2331e0;

    /* renamed from: f0 */
    final ArrayList<String> f2332f0;

    /* renamed from: g0 */
    final ArrayList<String> f2333g0;

    /* renamed from: h0 */
    final boolean f2334h0;

    /* renamed from: androidx.fragment.app.b$a */
    /* compiled from: BackStackState */
    static class C0529a implements Creator<C0528b> {
        C0529a() {
        }

        public C0528b createFromParcel(Parcel parcel) {
            return new C0528b(parcel);
        }

        public C0528b[] newArray(int i) {
            return new C0528b[i];
        }
    }

    public C0528b(C0527a aVar) {
        int size = aVar.f2441a.size();
        this.f2328c = new int[(size * 5)];
        if (aVar.f2448h) {
            this.f2320U = new ArrayList<>(size);
            this.f2321V = new int[size];
            this.f2322W = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0565a aVar2 = (C0565a) aVar.f2441a.get(i);
                int i3 = i2 + 1;
                this.f2328c[i2] = aVar2.f2459a;
                ArrayList<String> arrayList = this.f2320U;
                Fragment fragment = aVar2.f2460b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f2328c;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f2461c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f2462d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f2463e;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f2464f;
                this.f2321V[i] = aVar2.f2465g.ordinal();
                this.f2322W[i] = aVar2.f2466h.ordinal();
                i++;
                i2 = i7;
            }
            this.f2323X = aVar.f2446f;
            this.f2324Y = aVar.f2447g;
            this.f2325Z = aVar.f2450j;
            this.f2326a0 = aVar.f2319u;
            this.f2327b0 = aVar.f2451k;
            this.f2329c0 = aVar.f2452l;
            this.f2330d0 = aVar.f2453m;
            this.f2331e0 = aVar.f2454n;
            this.f2332f0 = aVar.f2455o;
            this.f2333g0 = aVar.f2456p;
            this.f2334h0 = aVar.f2457q;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C0527a mo3056a(C0542j jVar) {
        C0527a aVar = new C0527a(jVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f2328c.length) {
            C0565a aVar2 = new C0565a();
            int i3 = i + 1;
            aVar2.f2459a = this.f2328c[i];
            if (C0542j.f2346A0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append(aVar);
                sb.append(" op #");
                sb.append(i2);
                sb.append(" base fragment #");
                sb.append(this.f2328c[i3]);
                Log.v("FragmentManager", sb.toString());
            }
            String str = (String) this.f2320U.get(i2);
            if (str != null) {
                aVar2.f2460b = (Fragment) jVar.f2353Z.get(str);
            } else {
                aVar2.f2460b = null;
            }
            aVar2.f2465g = C0717b.values()[this.f2321V[i2]];
            aVar2.f2466h = C0717b.values()[this.f2322W[i2]];
            int[] iArr = this.f2328c;
            int i4 = i3 + 1;
            aVar2.f2461c = iArr[i3];
            int i5 = i4 + 1;
            aVar2.f2462d = iArr[i4];
            int i6 = i5 + 1;
            aVar2.f2463e = iArr[i5];
            int i7 = i6 + 1;
            aVar2.f2464f = iArr[i6];
            aVar.f2442b = aVar2.f2461c;
            aVar.f2443c = aVar2.f2462d;
            aVar.f2444d = aVar2.f2463e;
            aVar.f2445e = aVar2.f2464f;
            aVar.mo3317a(aVar2);
            i2++;
            i = i7;
        }
        aVar.f2446f = this.f2323X;
        aVar.f2447g = this.f2324Y;
        aVar.f2450j = this.f2325Z;
        aVar.f2319u = this.f2326a0;
        aVar.f2448h = true;
        aVar.f2451k = this.f2327b0;
        aVar.f2452l = this.f2329c0;
        aVar.f2453m = this.f2330d0;
        aVar.f2454n = this.f2331e0;
        aVar.f2455o = this.f2332f0;
        aVar.f2456p = this.f2333g0;
        aVar.f2457q = this.f2334h0;
        aVar.mo3033a(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2328c);
        parcel.writeStringList(this.f2320U);
        parcel.writeIntArray(this.f2321V);
        parcel.writeIntArray(this.f2322W);
        parcel.writeInt(this.f2323X);
        parcel.writeInt(this.f2324Y);
        parcel.writeString(this.f2325Z);
        parcel.writeInt(this.f2326a0);
        parcel.writeInt(this.f2327b0);
        TextUtils.writeToParcel(this.f2329c0, parcel, 0);
        parcel.writeInt(this.f2330d0);
        TextUtils.writeToParcel(this.f2331e0, parcel, 0);
        parcel.writeStringList(this.f2332f0);
        parcel.writeStringList(this.f2333g0);
        parcel.writeInt(this.f2334h0 ? 1 : 0);
    }

    public C0528b(Parcel parcel) {
        this.f2328c = parcel.createIntArray();
        this.f2320U = parcel.createStringArrayList();
        this.f2321V = parcel.createIntArray();
        this.f2322W = parcel.createIntArray();
        this.f2323X = parcel.readInt();
        this.f2324Y = parcel.readInt();
        this.f2325Z = parcel.readString();
        this.f2326a0 = parcel.readInt();
        this.f2327b0 = parcel.readInt();
        this.f2329c0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2330d0 = parcel.readInt();
        this.f2331e0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2332f0 = parcel.createStringArrayList();
        this.f2333g0 = parcel.createStringArrayList();
        this.f2334h0 = parcel.readInt() != 0;
    }
}
