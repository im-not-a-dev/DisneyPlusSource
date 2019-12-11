package com.google.android.exoplayer2.p361p0;

import com.google.android.exoplayer2.p361p0.C8840m.C8841a;
import com.google.android.exoplayer2.p393v0.Assertions;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.p0.t */
/* compiled from: ChannelMappingAudioProcessor */
final class C8855t extends C8854s {

    /* renamed from: h */
    private int[] f18894h;

    /* renamed from: i */
    private boolean f18895i;

    /* renamed from: j */
    private int[] f18896j;

    C8855t() {
    }

    /* renamed from: a */
    public void mo23160a(int[] iArr) {
        this.f18894h = iArr;
    }

    /* renamed from: d */
    public int mo23064d() {
        int[] iArr = this.f18896j;
        return iArr == null ? this.f18889c : iArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo23073k() {
        this.f18896j = null;
        this.f18894h = null;
        this.f18895i = false;
    }

    /* renamed from: a */
    public boolean mo23060a(int i, int i2, int i3) throws C8841a {
        boolean z = !Arrays.equals(this.f18894h, this.f18896j);
        this.f18896j = this.f18894h;
        int[] iArr = this.f18896j;
        if (iArr == null) {
            this.f18895i = false;
            return z;
        } else if (i3 != 2) {
            throw new C8841a(i, i2, i3);
        } else if (!z && !mo23157b(i, i2, i3)) {
            return false;
        } else {
            this.f18895i = i2 != iArr.length;
            int i4 = 0;
            while (i4 < iArr.length) {
                int i5 = iArr[i4];
                if (i5 < i2) {
                    this.f18895i = (i5 != i4) | this.f18895i;
                    i4++;
                } else {
                    throw new C8841a(i, i2, i3);
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo23059a() {
        return this.f18895i;
    }

    /* renamed from: a */
    public void mo23058a(ByteBuffer byteBuffer) {
        int[] iArr = this.f18896j;
        Assertions.checkNotNull(iArr);
        int[] iArr2 = iArr;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer a = mo23156a(((limit - position) / (this.f18889c * 2)) * iArr2.length * 2);
        while (position < limit) {
            for (int i : iArr2) {
                a.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f18889c * 2;
        }
        byteBuffer.position(limit);
        a.flip();
    }
}
