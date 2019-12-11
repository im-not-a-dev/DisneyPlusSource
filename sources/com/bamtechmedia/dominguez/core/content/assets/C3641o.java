package com.bamtechmedia.dominguez.core.content.assets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C12880j;

/* renamed from: com.bamtechmedia.dominguez.core.content.assets.o */
/* compiled from: Milestones.kt */
public final class C3641o {
    /* renamed from: a */
    public static final Long m12389a(List<Milestone> list) {
        return m12390a(list, C3640n.INTRO_END);
    }

    /* renamed from: b */
    public static final Long m12392b(List<Milestone> list) {
        return m12390a(list, C3640n.INTRO_START);
    }

    /* renamed from: c */
    public static final Long m12393c(List<Milestone> list) {
        return m12390a(list, C3640n.RECAP_END);
    }

    /* renamed from: d */
    public static final Long m12394d(List<Milestone> list) {
        return m12390a(list, C3640n.RECAP_START);
    }

    /* renamed from: e */
    public static final Long m12395e(List<Milestone> list) {
        return m12391a(list, C3640n.UP_NEXT, C3640n.TAG_END);
    }

    /* renamed from: a */
    private static final Long m12388a(Milestone milestone) {
        Object obj;
        Iterator it = milestone.mo13128X().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C12880j.m40224a((Object) ((MilestoneAttributes) obj).mo13138Y(), (Object) C3639m.OFFSET.mo13283a())) {
                break;
            }
        }
        MilestoneAttributes milestoneAttributes = (MilestoneAttributes) obj;
        if (milestoneAttributes != null) {
            return milestoneAttributes.mo13137X();
        }
        return null;
    }

    /* renamed from: a */
    private static final Long m12390a(List<Milestone> list, C3640n nVar) {
        Object obj;
        Object obj2;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C12880j.m40224a((Object) ((Milestone) obj).mo13129Y(), (Object) nVar.mo13284a())) {
                break;
            }
        }
        Milestone milestone = (Milestone) obj;
        if (milestone == null) {
            return null;
        }
        List X = milestone.mo13128X();
        if (X == null) {
            return null;
        }
        Iterator it2 = X.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (C12880j.m40224a((Object) ((MilestoneAttributes) obj2).mo13138Y(), (Object) C3639m.OFFSET.mo13283a())) {
                break;
            }
        }
        MilestoneAttributes milestoneAttributes = (MilestoneAttributes) obj2;
        if (milestoneAttributes != null) {
            return milestoneAttributes.mo13137X();
        }
        return null;
    }

    /* renamed from: a */
    public static final Long m12391a(List<Milestone> list, C3640n... nVarArr) {
        Object obj;
        ArrayList<Milestone> arrayList = new ArrayList<>();
        for (Object next : list) {
            Milestone milestone = (Milestone) next;
            ArrayList arrayList2 = new ArrayList(nVarArr.length);
            for (C3640n a : nVarArr) {
                arrayList2.add(a.mo13284a());
            }
            if (arrayList2.contains(milestone.mo13129Y())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C13187p.m40525a((Iterable) arrayList, 10));
        for (Milestone a2 : arrayList) {
            arrayList3.add(m12388a(a2));
        }
        Iterator it = arrayList3.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                Long l = (Long) obj;
                long longValue = l != null ? l.longValue() : 0;
                do {
                    Object next2 = it.next();
                    Long l2 = (Long) next2;
                    long longValue2 = l2 != null ? l2.longValue() : 0;
                    if (longValue < longValue2) {
                        obj = next2;
                        longValue = longValue2;
                    }
                } while (it.hasNext());
            }
        }
        return (Long) obj;
    }
}
