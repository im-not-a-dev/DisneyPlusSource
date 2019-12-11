package com.google.android.exoplayer2.p366s0;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import com.google.android.exoplayer2.metadata.p359j.C8766f;
import com.google.android.exoplayer2.metadata.p359j.C8774j;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.s0.k */
/* compiled from: GaplessInfoHolder */
public final class C8916k {

    /* renamed from: c */
    private static final Pattern f19145c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f19146a = -1;

    /* renamed from: b */
    public int f19147b = -1;

    /* renamed from: a */
    public boolean mo23315a(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f19146a = i2;
        this.f19147b = i3;
        return true;
    }

    /* renamed from: a */
    public boolean mo23316a(Metadata metadata) {
        for (int i = 0; i < metadata.mo22862X(); i++) {
            C8737b a = metadata.mo22863a(i);
            String str = "iTunSMPB";
            if (a instanceof C8766f) {
                C8766f fVar = (C8766f) a;
                if (str.equals(fVar.f18615V) && m26166a(fVar.f18616W)) {
                    return true;
                }
            } else if (a instanceof C8774j) {
                C8774j jVar = (C8774j) a;
                if ("com.apple.iTunes".equals(jVar.f18627U) && str.equals(jVar.f18628V) && m26166a(jVar.f18629W)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m26166a(String str) {
        Matcher matcher = f19145c.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f19146a = parseInt;
                    this.f19147b = parseInt2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo23314a() {
        return (this.f19146a == -1 || this.f19147b == -1) ? false : true;
    }
}
