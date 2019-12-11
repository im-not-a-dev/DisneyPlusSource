package p163g.p449j.p450a.p468b.p469l;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p096e.p113e.C3941i;

/* renamed from: g.j.a.b.l.h */
/* compiled from: MotionSpec */
public class C11475h {

    /* renamed from: a */
    private final C3941i<String, C11476i> f26828a = new C3941i<>();

    /* renamed from: a */
    public C11476i mo29304a(String str) {
        if (mo29306b(str)) {
            return (C11476i) this.f26828a.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public boolean mo29306b(String str) {
        return this.f26828a.get(str) != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11475h.class != obj.getClass()) {
            return false;
        }
        return this.f26828a.equals(((C11475h) obj).f26828a);
    }

    public int hashCode() {
        return this.f26828a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(C11475h.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.f26828a);
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo29305a(String str, C11476i iVar) {
        this.f26828a.put(str, iVar);
    }

    /* renamed from: a */
    public long mo29303a() {
        int size = this.f26828a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C11476i iVar = (C11476i) this.f26828a.mo14157d(i);
            j = Math.max(j, iVar.mo29310a() + iVar.mo29312b());
        }
        return j;
    }

    /* renamed from: a */
    public static C11475h m37007a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                return m37006a(context, resourceId);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C11475h m37006a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m37008a((List<Animator>) ((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m37008a((List<Animator>) arrayList);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            Log.w("MotionSpec", sb.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    private static C11475h m37008a(List<Animator> list) {
        C11475h hVar = new C11475h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m37009a(hVar, (Animator) list.get(i));
        }
        return hVar;
    }

    /* renamed from: a */
    private static void m37009a(C11475h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.mo29305a(objectAnimator.getPropertyName(), C11476i.m37014a((ValueAnimator) objectAnimator));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Animator must be an ObjectAnimator: ");
        sb.append(animator);
        throw new IllegalArgumentException(sb.toString());
    }
}
