package p163g.p449j.p450a.p468b.p469l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: g.j.a.b.l.i */
/* compiled from: MotionTiming */
public class C11476i {

    /* renamed from: a */
    private long f26829a = 0;

    /* renamed from: b */
    private long f26830b = 300;

    /* renamed from: c */
    private TimeInterpolator f26831c = null;

    /* renamed from: d */
    private int f26832d = 0;

    /* renamed from: e */
    private int f26833e = 1;

    public C11476i(long j, long j2) {
        this.f26829a = j;
        this.f26830b = j2;
    }

    /* renamed from: a */
    public void mo29311a(Animator animator) {
        animator.setStartDelay(mo29310a());
        animator.setDuration(mo29312b());
        animator.setInterpolator(mo29313c());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo29314d());
            valueAnimator.setRepeatMode(mo29315e());
        }
    }

    /* renamed from: b */
    public long mo29312b() {
        return this.f26830b;
    }

    /* renamed from: c */
    public TimeInterpolator mo29313c() {
        TimeInterpolator timeInterpolator = this.f26831c;
        return timeInterpolator != null ? timeInterpolator : C11468a.f26816b;
    }

    /* renamed from: d */
    public int mo29314d() {
        return this.f26832d;
    }

    /* renamed from: e */
    public int mo29315e() {
        return this.f26833e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11476i.class != obj.getClass()) {
            return false;
        }
        C11476i iVar = (C11476i) obj;
        if (mo29310a() == iVar.mo29310a() && mo29312b() == iVar.mo29312b() && mo29314d() == iVar.mo29314d() && mo29315e() == iVar.mo29315e()) {
            return mo29313c().getClass().equals(iVar.mo29313c().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (mo29310a() ^ (mo29310a() >>> 32))) * 31) + ((int) (mo29312b() ^ (mo29312b() >>> 32)))) * 31) + mo29313c().getClass().hashCode()) * 31) + mo29314d()) * 31) + mo29315e();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(C11476i.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(mo29310a());
        sb.append(" duration: ");
        sb.append(mo29312b());
        sb.append(" interpolator: ");
        sb.append(mo29313c().getClass());
        sb.append(" repeatCount: ");
        sb.append(mo29314d());
        sb.append(" repeatMode: ");
        sb.append(mo29315e());
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: b */
    private static TimeInterpolator m37015b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C11468a.f26816b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C11468a.f26817c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            interpolator = C11468a.f26818d;
        }
        return interpolator;
    }

    /* renamed from: a */
    public long mo29310a() {
        return this.f26829a;
    }

    /* renamed from: a */
    static C11476i m37014a(ValueAnimator valueAnimator) {
        C11476i iVar = new C11476i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m37015b(valueAnimator));
        iVar.f26832d = valueAnimator.getRepeatCount();
        iVar.f26833e = valueAnimator.getRepeatMode();
        return iVar;
    }

    public C11476i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f26829a = j;
        this.f26830b = j2;
        this.f26831c = timeInterpolator;
    }
}
