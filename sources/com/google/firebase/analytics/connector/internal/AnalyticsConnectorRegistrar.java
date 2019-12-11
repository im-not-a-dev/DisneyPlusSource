package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.analytics.p403a.C10419a;
import com.google.firebase.components.C10429d;
import com.google.firebase.components.C10429d.C10431b;
import com.google.firebase.components.C10438h;
import com.google.firebase.components.C10447n;
import java.util.Arrays;
import java.util.List;
import p163g.p449j.p482b.C11512c;
import p163g.p449j.p482b.p483e.C11522d;
import p163g.p449j.p482b.p486h.C11530f;

@Keep
public class AnalyticsConnectorRegistrar implements C10438h {
    @SuppressLint({"MissingPermission"})
    @Keep
    public List<C10429d<?>> getComponents() {
        C10431b a = C10429d.m32955a(C10419a.class);
        a.mo27230a(C10447n.m33011a(C11512c.class));
        a.mo27230a(C10447n.m33011a(Context.class));
        a.mo27230a(C10447n.m33011a(C11522d.class));
        a.mo27229a(C10424a.f24742a);
        a.mo27232c();
        return Arrays.asList(new C10429d[]{a.mo27231b(), C11530f.m37168a("fire-analytics", "16.5.0")});
    }
}
