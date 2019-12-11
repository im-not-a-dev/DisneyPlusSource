package com.google.android.exoplayer2.metadata.p359j;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.C8738a;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;

/* renamed from: com.google.android.exoplayer2.metadata.j.i */
/* compiled from: Id3Frame */
public abstract class C8773i implements C8737b {

    /* renamed from: c */
    public final String f18626c;

    public C8773i(String str) {
        this.f18626c = str;
    }

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
        return this.f18626c;
    }
}
