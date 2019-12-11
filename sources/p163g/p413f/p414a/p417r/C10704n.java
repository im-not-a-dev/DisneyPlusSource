package p163g.p413f.p414a.p417r;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p163g.p413f.p414a.p420u.C10726d;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: g.f.a.r.n */
/* compiled from: RequestTracker */
public class C10704n {

    /* renamed from: a */
    private final Set<C10726d> f25316a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<C10726d> f25317b = new ArrayList();

    /* renamed from: c */
    private boolean f25318c;

    /* renamed from: a */
    public boolean mo27651a(C10726d dVar) {
        return m33672a(dVar, true);
    }

    /* renamed from: b */
    public void mo27653b(C10726d dVar) {
        this.f25316a.add(dVar);
        if (!this.f25318c) {
            dVar.mo27723c();
            return;
        }
        dVar.clear();
        String str = "RequestTracker";
        if (Log.isLoggable(str, 2)) {
            Log.v(str, "Paused, delaying request");
        }
        this.f25317b.add(dVar);
    }

    /* renamed from: c */
    public void mo27654c() {
        for (C10726d dVar : C10775k.m34027a((Collection<T>) this.f25316a)) {
            if (!dVar.isComplete() && !dVar.mo27731g()) {
                dVar.clear();
                if (!this.f25318c) {
                    dVar.mo27723c();
                } else {
                    this.f25317b.add(dVar);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo27655d() {
        this.f25318c = false;
        for (C10726d dVar : C10775k.m34027a((Collection<T>) this.f25316a)) {
            if (!dVar.isComplete() && !dVar.isRunning()) {
                dVar.mo27723c();
            }
        }
        this.f25317b.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.f25316a.size());
        sb.append(", isPaused=");
        sb.append(this.f25318c);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    private boolean m33672a(C10726d dVar, boolean z) {
        boolean z2 = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f25316a.remove(dVar);
        if (!this.f25317b.remove(dVar) && !remove) {
            z2 = false;
        }
        if (z2) {
            dVar.clear();
            if (z) {
                dVar.mo27718a();
            }
        }
        return z2;
    }

    /* renamed from: a */
    public void mo27650a() {
        for (C10726d a : C10775k.m34027a((Collection<T>) this.f25316a)) {
            m33672a(a, false);
        }
        this.f25317b.clear();
    }

    /* renamed from: b */
    public void mo27652b() {
        this.f25318c = true;
        for (C10726d dVar : C10775k.m34027a((Collection<T>) this.f25316a)) {
            if (dVar.isRunning()) {
                dVar.clear();
                this.f25317b.add(dVar);
            }
        }
    }
}
