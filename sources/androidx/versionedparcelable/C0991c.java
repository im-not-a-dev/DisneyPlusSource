package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p096e.p113e.C3926a;

/* renamed from: androidx.versionedparcelable.c */
/* compiled from: VersionedParcelParcel */
class C0991c extends C0990b {

    /* renamed from: d */
    private final SparseIntArray f3904d;

    /* renamed from: e */
    private final Parcel f3905e;

    /* renamed from: f */
    private final int f3906f;

    /* renamed from: g */
    private final int f3907g;

    /* renamed from: h */
    private final String f3908h;

    /* renamed from: i */
    private int f3909i;

    /* renamed from: j */
    private int f3910j;

    /* renamed from: k */
    private int f3911k;

    C0991c(Parcel parcel) {
        Parcel parcel2 = parcel;
        this(parcel2, parcel.dataPosition(), parcel.dataSize(), "", new C3926a(), new C3926a(), new C3926a());
    }

    /* renamed from: a */
    public boolean mo5465a(int i) {
        while (true) {
            boolean z = true;
            if (this.f3910j < this.f3907g) {
                int i2 = this.f3911k;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                this.f3905e.setDataPosition(this.f3910j);
                int readInt = this.f3905e.readInt();
                this.f3911k = this.f3905e.readInt();
                this.f3910j += readInt;
            } else {
                if (this.f3911k != i) {
                    z = false;
                }
                return z;
            }
        }
    }

    /* renamed from: b */
    public void mo5469b(int i) {
        mo5456a();
        this.f3909i = i;
        this.f3904d.put(i, this.f3905e.dataPosition());
        mo5477c(0);
        mo5477c(i);
    }

    /* renamed from: c */
    public void mo5477c(int i) {
        this.f3905e.writeInt(i);
    }

    /* renamed from: d */
    public boolean mo5479d() {
        return this.f3905e.readInt() != 0;
    }

    /* renamed from: e */
    public byte[] mo5480e() {
        int readInt = this.f3905e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f3905e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public CharSequence mo5481f() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f3905e);
    }

    /* renamed from: g */
    public int mo5482g() {
        return this.f3905e.readInt();
    }

    /* renamed from: h */
    public <T extends Parcelable> T mo5483h() {
        return this.f3905e.readParcelable(C0991c.class.getClassLoader());
    }

    /* renamed from: i */
    public String mo5484i() {
        return this.f3905e.readString();
    }

    private C0991c(Parcel parcel, int i, int i2, String str, C3926a<String, Method> aVar, C3926a<String, Method> aVar2, C3926a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f3904d = new SparseIntArray();
        this.f3909i = -1;
        this.f3910j = 0;
        this.f3911k = -1;
        this.f3905e = parcel;
        this.f3906f = i;
        this.f3907g = i2;
        this.f3910j = this.f3906f;
        this.f3908h = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0990b mo5468b() {
        Parcel parcel = this.f3905e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3910j;
        if (i == this.f3906f) {
            i = this.f3907g;
        }
        int i2 = i;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3908h);
        sb.append("  ");
        C0991c cVar = new C0991c(parcel, dataPosition, i2, sb.toString(), this.f3901a, this.f3902b, this.f3903c);
        return cVar;
    }

    /* renamed from: a */
    public void mo5456a() {
        int i = this.f3909i;
        if (i >= 0) {
            int i2 = this.f3904d.get(i);
            int dataPosition = this.f3905e.dataPosition();
            int i3 = dataPosition - i2;
            this.f3905e.setDataPosition(i2);
            this.f3905e.writeInt(i3);
            this.f3905e.setDataPosition(dataPosition);
        }
    }

    /* renamed from: a */
    public void mo5464a(byte[] bArr) {
        if (bArr != null) {
            this.f3905e.writeInt(bArr.length);
            this.f3905e.writeByteArray(bArr);
            return;
        }
        this.f3905e.writeInt(-1);
    }

    /* renamed from: a */
    public void mo5461a(String str) {
        this.f3905e.writeString(str);
    }

    /* renamed from: a */
    public void mo5457a(Parcelable parcelable) {
        this.f3905e.writeParcelable(parcelable, 0);
    }

    /* renamed from: a */
    public void mo5462a(boolean z) {
        this.f3905e.writeInt(z ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5460a(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f3905e, 0);
    }
}
