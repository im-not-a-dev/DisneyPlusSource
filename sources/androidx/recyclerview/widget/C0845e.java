package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView.C0794d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p096e.p121h.p135s.C4187x;

/* renamed from: androidx.recyclerview.widget.e */
/* compiled from: DefaultItemAnimator */
public class C0845e extends C0900t {

    /* renamed from: s */
    private static TimeInterpolator f3431s;

    /* renamed from: h */
    private ArrayList<C0794d0> f3432h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<C0794d0> f3433i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C0855j> f3434j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C0854i> f3435k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<ArrayList<C0794d0>> f3436l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<C0855j>> f3437m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<C0854i>> f3438n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<C0794d0> f3439o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<C0794d0> f3440p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<C0794d0> f3441q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<C0794d0> f3442r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.e$a */
    /* compiled from: DefaultItemAnimator */
    class C0846a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ ArrayList f3444c;

        C0846a(ArrayList arrayList) {
            this.f3444c = arrayList;
        }

        public void run() {
            Iterator it = this.f3444c.iterator();
            while (it.hasNext()) {
                C0855j jVar = (C0855j) it.next();
                C0845e.this.mo4984b(jVar.f3477a, jVar.f3478b, jVar.f3479c, jVar.f3480d, jVar.f3481e);
            }
            this.f3444c.clear();
            C0845e.this.f3437m.remove(this.f3444c);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    /* compiled from: DefaultItemAnimator */
    class C0847b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ ArrayList f3446c;

        C0847b(ArrayList arrayList) {
            this.f3446c = arrayList;
        }

        public void run() {
            Iterator it = this.f3446c.iterator();
            while (it.hasNext()) {
                C0845e.this.mo4980a((C0854i) it.next());
            }
            this.f3446c.clear();
            C0845e.this.f3438n.remove(this.f3446c);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    /* compiled from: DefaultItemAnimator */
    class C0848c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ ArrayList f3448c;

        C0848c(ArrayList arrayList) {
            this.f3448c = arrayList;
        }

        public void run() {
            Iterator it = this.f3448c.iterator();
            while (it.hasNext()) {
                C0845e.this.mo4988t((C0794d0) it.next());
            }
            this.f3448c.clear();
            C0845e.this.f3436l.remove(this.f3448c);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$d */
    /* compiled from: DefaultItemAnimator */
    class C0849d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0794d0 f3449a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3450b;

        /* renamed from: c */
        final /* synthetic */ View f3451c;

        C0849d(C0794d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3449a = d0Var;
            this.f3450b = viewPropertyAnimator;
            this.f3451c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3450b.setListener(null);
            this.f3451c.setAlpha(1.0f);
            C0845e.this.mo5140l(this.f3449a);
            C0845e.this.f3441q.remove(this.f3449a);
            C0845e.this.mo4987j();
        }

        public void onAnimationStart(Animator animator) {
            C0845e.this.mo5141m(this.f3449a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$e */
    /* compiled from: DefaultItemAnimator */
    class C0850e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0794d0 f3453a;

        /* renamed from: b */
        final /* synthetic */ View f3454b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f3455c;

        C0850e(C0794d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3453a = d0Var;
            this.f3454b = view;
            this.f3455c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f3454b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f3455c.setListener(null);
            C0845e.this.mo5136h(this.f3453a);
            C0845e.this.f3439o.remove(this.f3453a);
            C0845e.this.mo4987j();
        }

        public void onAnimationStart(Animator animator) {
            C0845e.this.mo5137i(this.f3453a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$f */
    /* compiled from: DefaultItemAnimator */
    class C0851f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0794d0 f3457a;

        /* renamed from: b */
        final /* synthetic */ int f3458b;

        /* renamed from: c */
        final /* synthetic */ View f3459c;

        /* renamed from: d */
        final /* synthetic */ int f3460d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f3461e;

        C0851f(C0794d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3457a = d0Var;
            this.f3458b = i;
            this.f3459c = view;
            this.f3460d = i2;
            this.f3461e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f3458b != 0) {
                this.f3459c.setTranslationX(0.0f);
            }
            if (this.f3460d != 0) {
                this.f3459c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f3461e.setListener(null);
            C0845e.this.mo5138j(this.f3457a);
            C0845e.this.f3440p.remove(this.f3457a);
            C0845e.this.mo4987j();
        }

        public void onAnimationStart(Animator animator) {
            C0845e.this.mo5139k(this.f3457a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$g */
    /* compiled from: DefaultItemAnimator */
    class C0852g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0854i f3463a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3464b;

        /* renamed from: c */
        final /* synthetic */ View f3465c;

        C0852g(C0854i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3463a = iVar;
            this.f3464b = viewPropertyAnimator;
            this.f3465c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3464b.setListener(null);
            this.f3465c.setAlpha(1.0f);
            this.f3465c.setTranslationX(0.0f);
            this.f3465c.setTranslationY(0.0f);
            C0845e.this.mo5131a(this.f3463a.f3471a, true);
            C0845e.this.f3442r.remove(this.f3463a.f3471a);
            C0845e.this.mo4987j();
        }

        public void onAnimationStart(Animator animator) {
            C0845e.this.mo5133b(this.f3463a.f3471a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$h */
    /* compiled from: DefaultItemAnimator */
    class C0853h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0854i f3467a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3468b;

        /* renamed from: c */
        final /* synthetic */ View f3469c;

        C0853h(C0854i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3467a = iVar;
            this.f3468b = viewPropertyAnimator;
            this.f3469c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3468b.setListener(null);
            this.f3469c.setAlpha(1.0f);
            this.f3469c.setTranslationX(0.0f);
            this.f3469c.setTranslationY(0.0f);
            C0845e.this.mo5131a(this.f3467a.f3472b, false);
            C0845e.this.f3442r.remove(this.f3467a.f3472b);
            C0845e.this.mo4987j();
        }

        public void onAnimationStart(Animator animator) {
            C0845e.this.mo5133b(this.f3467a.f3472b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$i */
    /* compiled from: DefaultItemAnimator */
    private static class C0854i {

        /* renamed from: a */
        public C0794d0 f3471a;

        /* renamed from: b */
        public C0794d0 f3472b;

        /* renamed from: c */
        public int f3473c;

        /* renamed from: d */
        public int f3474d;

        /* renamed from: e */
        public int f3475e;

        /* renamed from: f */
        public int f3476f;

        private C0854i(C0794d0 d0Var, C0794d0 d0Var2) {
            this.f3471a = d0Var;
            this.f3472b = d0Var2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChangeInfo{oldHolder=");
            sb.append(this.f3471a);
            sb.append(", newHolder=");
            sb.append(this.f3472b);
            sb.append(", fromX=");
            sb.append(this.f3473c);
            sb.append(", fromY=");
            sb.append(this.f3474d);
            sb.append(", toX=");
            sb.append(this.f3475e);
            sb.append(", toY=");
            sb.append(this.f3476f);
            sb.append('}');
            return sb.toString();
        }

        C0854i(C0794d0 d0Var, C0794d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.f3473c = i;
            this.f3474d = i2;
            this.f3475e = i3;
            this.f3476f = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$j */
    /* compiled from: DefaultItemAnimator */
    private static class C0855j {

        /* renamed from: a */
        public C0794d0 f3477a;

        /* renamed from: b */
        public int f3478b;

        /* renamed from: c */
        public int f3479c;

        /* renamed from: d */
        public int f3480d;

        /* renamed from: e */
        public int f3481e;

        C0855j(C0794d0 d0Var, int i, int i2, int i3, int i4) {
            this.f3477a = d0Var;
            this.f3478b = i;
            this.f3479c = i2;
            this.f3480d = i3;
            this.f3481e = i4;
        }
    }

    /* renamed from: u */
    private void m4785u(C0794d0 d0Var) {
        View view = d0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f3441q.add(d0Var);
        animate.setDuration(mo4671f()).alpha(0.0f).setListener(new C0849d(d0Var, animate, view)).start();
    }

    /* renamed from: v */
    private void m4786v(C0794d0 d0Var) {
        if (f3431s == null) {
            f3431s = new ValueAnimator().getInterpolator();
        }
        d0Var.itemView.animate().setInterpolator(f3431s);
        mo4666c(d0Var);
    }

    /* renamed from: a */
    public boolean mo4982a(C0794d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) d0Var.itemView.getTranslationY());
        m4786v(d0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo5138j(d0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        ArrayList<C0855j> arrayList = this.f3434j;
        C0855j jVar = new C0855j(d0Var, translationX, translationY, i3, i4);
        arrayList.add(jVar);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4984b(C0794d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f3440p.add(d0Var);
        ViewPropertyAnimator duration = animate.setDuration(mo4670e());
        C0851f fVar = new C0851f(d0Var, i5, view, i6, animate);
        duration.setListener(fVar).start();
    }

    /* renamed from: c */
    public void mo4666c(C0794d0 d0Var) {
        View view = d0Var.itemView;
        view.animate().cancel();
        int size = this.f3434j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C0855j) this.f3434j.get(size)).f3477a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo5138j(d0Var);
                this.f3434j.remove(size);
            }
        }
        m4782a((List<C0854i>) this.f3435k, d0Var);
        if (this.f3432h.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo5140l(d0Var);
        }
        if (this.f3433i.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo5136h(d0Var);
        }
        for (int size2 = this.f3438n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f3438n.get(size2);
            m4782a((List<C0854i>) arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f3438n.remove(size2);
            }
        }
        for (int size3 = this.f3437m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f3437m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C0855j) arrayList2.get(size4)).f3477a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo5138j(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3437m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3436l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f3436l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                mo5136h(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f3436l.remove(size5);
                }
            }
        }
        this.f3441q.remove(d0Var);
        this.f3439o.remove(d0Var);
        this.f3442r.remove(d0Var);
        this.f3440p.remove(d0Var);
        mo4987j();
    }

    /* renamed from: f */
    public boolean mo4985f(C0794d0 d0Var) {
        m4786v(d0Var);
        d0Var.itemView.setAlpha(0.0f);
        this.f3433i.add(d0Var);
        return true;
    }

    /* renamed from: g */
    public boolean mo4986g(C0794d0 d0Var) {
        m4786v(d0Var);
        this.f3432h.add(d0Var);
        return true;
    }

    /* renamed from: i */
    public void mo4674i() {
        boolean z = !this.f3432h.isEmpty();
        boolean z2 = !this.f3434j.isEmpty();
        boolean z3 = !this.f3435k.isEmpty();
        boolean z4 = !this.f3433i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.f3432h.iterator();
            while (it.hasNext()) {
                m4785u((C0794d0) it.next());
            }
            this.f3432h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f3434j);
                this.f3437m.add(arrayList);
                this.f3434j.clear();
                C0846a aVar = new C0846a(arrayList);
                if (z) {
                    C4187x.m14364a(((C0855j) arrayList.get(0)).f3477a.itemView, (Runnable) aVar, mo4671f());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f3435k);
                this.f3438n.add(arrayList2);
                this.f3435k.clear();
                C0847b bVar = new C0847b(arrayList2);
                if (z) {
                    C4187x.m14364a(((C0854i) arrayList2.get(0)).f3471a.itemView, (Runnable) bVar, mo4671f());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f3433i);
                this.f3436l.add(arrayList3);
                this.f3433i.clear();
                C0848c cVar = new C0848c(arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long f = z ? mo4671f() : 0;
                    long e = z2 ? mo4670e() : 0;
                    if (z3) {
                        j = mo4668d();
                    }
                    C4187x.m14364a(((C0794d0) arrayList3.get(0)).itemView, (Runnable) cVar, f + Math.max(e, j));
                } else {
                    cVar.run();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo4987j() {
        if (!mo4672g()) {
            mo4653a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo4988t(C0794d0 d0Var) {
        View view = d0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f3439o.add(d0Var);
        animate.alpha(1.0f).setDuration(mo4665c()).setListener(new C0850e(d0Var, view, animate)).start();
    }

    /* renamed from: g */
    public boolean mo4672g() {
        return !this.f3433i.isEmpty() || !this.f3435k.isEmpty() || !this.f3434j.isEmpty() || !this.f3432h.isEmpty() || !this.f3440p.isEmpty() || !this.f3441q.isEmpty() || !this.f3439o.isEmpty() || !this.f3442r.isEmpty() || !this.f3437m.isEmpty() || !this.f3436l.isEmpty() || !this.f3438n.isEmpty();
    }

    /* renamed from: b */
    private void m4784b(C0854i iVar) {
        C0794d0 d0Var = iVar.f3471a;
        if (d0Var != null) {
            m4783a(iVar, d0Var);
        }
        C0794d0 d0Var2 = iVar.f3472b;
        if (d0Var2 != null) {
            m4783a(iVar, d0Var2);
        }
    }

    /* renamed from: a */
    public boolean mo4983a(C0794d0 d0Var, C0794d0 d0Var2, int i, int i2, int i3, int i4) {
        if (d0Var == d0Var2) {
            return mo4982a(d0Var, i, i2, i3, i4);
        }
        float translationX = d0Var.itemView.getTranslationX();
        float translationY = d0Var.itemView.getTranslationY();
        float alpha = d0Var.itemView.getAlpha();
        m4786v(d0Var);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        d0Var.itemView.setTranslationX(translationX);
        d0Var.itemView.setTranslationY(translationY);
        d0Var.itemView.setAlpha(alpha);
        if (d0Var2 != null) {
            m4786v(d0Var2);
            d0Var2.itemView.setTranslationX((float) (-i5));
            d0Var2.itemView.setTranslationY((float) (-i6));
            d0Var2.itemView.setAlpha(0.0f);
        }
        ArrayList<C0854i> arrayList = this.f3435k;
        C0854i iVar = new C0854i(d0Var, d0Var2, i, i2, i3, i4);
        arrayList.add(iVar);
        return true;
    }

    /* renamed from: b */
    public void mo4661b() {
        int size = this.f3434j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0855j jVar = (C0855j) this.f3434j.get(size);
            View view = jVar.f3477a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo5138j(jVar.f3477a);
            this.f3434j.remove(size);
        }
        for (int size2 = this.f3432h.size() - 1; size2 >= 0; size2--) {
            mo5140l((C0794d0) this.f3432h.get(size2));
            this.f3432h.remove(size2);
        }
        int size3 = this.f3433i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C0794d0 d0Var = (C0794d0) this.f3433i.get(size3);
            d0Var.itemView.setAlpha(1.0f);
            mo5136h(d0Var);
            this.f3433i.remove(size3);
        }
        for (int size4 = this.f3435k.size() - 1; size4 >= 0; size4--) {
            m4784b((C0854i) this.f3435k.get(size4));
        }
        this.f3435k.clear();
        if (mo4672g()) {
            for (int size5 = this.f3437m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f3437m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C0855j jVar2 = (C0855j) arrayList.get(size6);
                    View view2 = jVar2.f3477a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo5138j(jVar2.f3477a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3437m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3436l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f3436l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C0794d0 d0Var2 = (C0794d0) arrayList2.get(size8);
                    d0Var2.itemView.setAlpha(1.0f);
                    mo5136h(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3436l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3438n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f3438n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m4784b((C0854i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3438n.remove(arrayList3);
                    }
                }
            }
            mo4981a((List<C0794d0>) this.f3441q);
            mo4981a((List<C0794d0>) this.f3440p);
            mo4981a((List<C0794d0>) this.f3439o);
            mo4981a((List<C0794d0>) this.f3442r);
            mo4653a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4980a(C0854i iVar) {
        View view;
        C0794d0 d0Var = iVar.f3471a;
        View view2 = null;
        if (d0Var == null) {
            view = null;
        } else {
            view = d0Var.itemView;
        }
        C0794d0 d0Var2 = iVar.f3472b;
        if (d0Var2 != null) {
            view2 = d0Var2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(mo4668d());
            this.f3442r.add(iVar.f3471a);
            duration.translationX((float) (iVar.f3475e - iVar.f3473c));
            duration.translationY((float) (iVar.f3476f - iVar.f3474d));
            duration.alpha(0.0f).setListener(new C0852g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f3442r.add(iVar.f3472b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo4668d()).alpha(1.0f).setListener(new C0853h(iVar, animate, view2)).start();
        }
    }

    /* renamed from: a */
    private void m4782a(List<C0854i> list, C0794d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0854i iVar = (C0854i) list.get(size);
            if (m4783a(iVar, d0Var) && iVar.f3471a == null && iVar.f3472b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m4783a(C0854i iVar, C0794d0 d0Var) {
        boolean z = false;
        if (iVar.f3472b == d0Var) {
            iVar.f3472b = null;
        } else if (iVar.f3471a != d0Var) {
            return false;
        } else {
            iVar.f3471a = null;
            z = true;
        }
        d0Var.itemView.setAlpha(1.0f);
        d0Var.itemView.setTranslationX(0.0f);
        d0Var.itemView.setTranslationY(0.0f);
        mo5131a(d0Var, z);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4981a(List<C0794d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((C0794d0) list.get(size)).itemView.animate().cancel();
        }
    }

    /* renamed from: a */
    public boolean mo4659a(C0794d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.mo4659a(d0Var, list);
    }
}
