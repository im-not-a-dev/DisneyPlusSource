package p092d.p093a.p094a.p095a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p092d.p093a.p094a.p095a.C3851a.C3852a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: d.a.a.a.b */
/* compiled from: ResultReceiver */
public class C3854b implements Parcelable {
    public static final Creator<C3854b> CREATOR = new C3855a();

    /* renamed from: U */
    C3851a f9528U;

    /* renamed from: c */
    final Handler f9529c = null;

    /* renamed from: d.a.a.a.b$a */
    /* compiled from: ResultReceiver */
    static class C3855a implements Creator<C3854b> {
        C3855a() {
        }

        public C3854b createFromParcel(Parcel parcel) {
            return new C3854b(parcel);
        }

        public C3854b[] newArray(int i) {
            return new C3854b[i];
        }
    }

    /* renamed from: d.a.a.a.b$b */
    /* compiled from: ResultReceiver */
    class C3856b extends C3852a {
        C3856b() {
        }

        /* renamed from: a */
        public void mo13769a(int i, Bundle bundle) {
            C3854b bVar = C3854b.this;
            Handler handler = bVar.f9529c;
            if (handler != null) {
                handler.post(new C3857c(i, bundle));
            } else {
                bVar.mo13a(i, bundle);
            }
        }
    }

    /* renamed from: d.a.a.a.b$c */
    /* compiled from: ResultReceiver */
    class C3857c implements Runnable {

        /* renamed from: U */
        final Bundle f9531U;

        /* renamed from: c */
        final int f9533c;

        C3857c(int i, Bundle bundle) {
            this.f9533c = i;
            this.f9531U = bundle;
        }

        public void run() {
            C3854b.this.mo13a(this.f9533c, this.f9531U);
        }
    }

    C3854b(Parcel parcel) {
        this.f9528U = C3852a.m12939a(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f9528U == null) {
                this.f9528U = new C3856b();
            }
            parcel.writeStrongBinder(this.f9528U.asBinder());
        }
    }
}
