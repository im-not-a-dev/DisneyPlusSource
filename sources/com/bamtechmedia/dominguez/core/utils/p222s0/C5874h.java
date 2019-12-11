package com.bamtechmedia.dominguez.core.utils.p222s0;

import android.os.Trace;
import java.util.List;
import kotlin.jvm.internal.C12880j;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.C11863k;

/* renamed from: com.bamtechmedia.dominguez.core.utils.s0.h */
/* compiled from: TraceGroupAdapter.kt */
public final class C5874h<VH extends C11863k> extends C11848c<VH> {
    /* renamed from: a */
    public void onBindViewHolder(VH vh, int i, List<Object> list) {
        C11853e a = mo13700a(i);
        C12880j.m40222a((Object) a, "getItem(position)");
        String simpleName = a.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append("Bind ");
        sb.append(simpleName);
        Trace.beginSection(sb.toString());
        super.onBindViewHolder(vh, i, list);
        Trace.endSection();
    }
}
