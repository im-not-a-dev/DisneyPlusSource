package com.google.android.exoplayer2.metadata.p360k;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.C8738a;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;

/* renamed from: com.google.android.exoplayer2.metadata.k.b */
/* compiled from: SpliceCommand */
public abstract class C8786b implements C8737b {
    /* renamed from: H */
    public /* synthetic */ Format mo22873H() {
        return C8738a.m25358b(this);
    }

    /* renamed from: K */
    public /* synthetic */ byte[] mo22874K() {
        return C8738a.m25357a(this);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SCTE-35 splice command: type=");
        sb.append(getClass().getSimpleName());
        return sb.toString();
    }
}
