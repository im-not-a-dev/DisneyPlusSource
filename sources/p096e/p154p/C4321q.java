package p096e.p154p;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p096e.p154p.C4309m.C4314e;
import p096e.p154p.C4309m.C4315f;

/* renamed from: e.p.q */
/* compiled from: TransitionSet */
public class C4321q extends C4309m {

    /* renamed from: C0 */
    private ArrayList<C4309m> f10759C0 = new ArrayList<>();

    /* renamed from: D0 */
    private boolean f10760D0 = true;

    /* renamed from: E0 */
    int f10761E0;

    /* renamed from: F0 */
    boolean f10762F0 = false;

    /* renamed from: G0 */
    private int f10763G0 = 0;

    /* renamed from: e.p.q$a */
    /* compiled from: TransitionSet */
    class C4322a extends C4316n {

        /* renamed from: a */
        final /* synthetic */ C4309m f10764a;

        C4322a(C4321q qVar, C4309m mVar) {
            this.f10764a = mVar;
        }

        /* renamed from: c */
        public void mo15038c(C4309m mVar) {
            this.f10764a.mo15117n();
            mVar.mo15099b((C4315f) this);
        }
    }

    /* renamed from: e.p.q$b */
    /* compiled from: TransitionSet */
    static class C4323b extends C4316n {

        /* renamed from: a */
        C4321q f10765a;

        C4323b(C4321q qVar) {
            this.f10765a = qVar;
        }

        /* renamed from: a */
        public void mo15054a(C4309m mVar) {
            C4321q qVar = this.f10765a;
            if (!qVar.f10762F0) {
                qVar.mo15118o();
                this.f10765a.f10762F0 = true;
            }
        }

        /* renamed from: c */
        public void mo15038c(C4309m mVar) {
            C4321q qVar = this.f10765a;
            qVar.f10761E0--;
            if (qVar.f10761E0 == 0) {
                qVar.f10762F0 = false;
                qVar.mo15088a();
            }
            mVar.mo15099b((C4315f) this);
        }
    }

    /* renamed from: q */
    private void m14855q() {
        C4323b bVar = new C4323b(this);
        Iterator it = this.f10759C0.iterator();
        while (it.hasNext()) {
            ((C4309m) it.next()).mo15085a((C4315f) bVar);
        }
        this.f10761E0 = this.f10759C0.size();
    }

    /* renamed from: c */
    public void mo15008c(C4325s sVar) {
        if (mo15102b(sVar.f10770b)) {
            Iterator it = this.f10759C0.iterator();
            while (it.hasNext()) {
                C4309m mVar = (C4309m) it.next();
                if (mVar.mo15102b(sVar.f10770b)) {
                    mVar.mo15008c(sVar);
                    sVar.f10771c.add(mVar);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo15109e(View view) {
        super.mo15109e(view);
        int size = this.f10759C0.size();
        for (int i = 0; i < size; i++) {
            ((C4309m) this.f10759C0.get(i)).mo15109e(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo15117n() {
        if (this.f10759C0.isEmpty()) {
            mo15118o();
            mo15088a();
            return;
        }
        m14855q();
        if (!this.f10760D0) {
            for (int i = 1; i < this.f10759C0.size(); i++) {
                ((C4309m) this.f10759C0.get(i - 1)).mo15085a((C4315f) new C4322a(this, (C4309m) this.f10759C0.get(i)));
            }
            C4309m mVar = (C4309m) this.f10759C0.get(0);
            if (mVar != null) {
                mVar.mo15117n();
            }
        } else {
            Iterator it = this.f10759C0.iterator();
            while (it.hasNext()) {
                ((C4309m) it.next()).mo15117n();
            }
        }
    }

    /* renamed from: p */
    public int mo15132p() {
        return this.f10759C0.size();
    }

    public C4309m clone() {
        C4321q qVar = (C4321q) super.clone();
        qVar.f10759C0 = new ArrayList<>();
        int size = this.f10759C0.size();
        for (int i = 0; i < size; i++) {
            qVar.mo15130a(((C4309m) this.f10759C0.get(i)).clone());
        }
        return qVar;
    }

    /* renamed from: d */
    public C4321q m14881d(View view) {
        for (int i = 0; i < this.f10759C0.size(); i++) {
            ((C4309m) this.f10759C0.get(i)).mo15107d(view);
        }
        super.mo15107d(view);
        return this;
    }

    /* renamed from: b */
    public C4321q mo15131b(int i) {
        if (i == 0) {
            this.f10760D0 = true;
        } else if (i == 1) {
            this.f10760D0 = false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid parameter for TransitionSet ordering: ");
            sb.append(i);
            throw new AndroidRuntimeException(sb.toString());
        }
        return this;
    }

    /* renamed from: a */
    public C4321q mo15130a(C4309m mVar) {
        this.f10759C0.add(mVar);
        mVar.f10729k0 = this;
        long j = this.f10713V;
        if (j >= 0) {
            mVar.mo15082a(j);
        }
        if ((this.f10763G0 & 1) != 0) {
            mVar.mo15083a(mo15106d());
        }
        if ((this.f10763G0 & 2) != 0) {
            mVar.mo15095a(mo15111g());
        }
        if ((this.f10763G0 & 4) != 0) {
            mVar.mo15093a(mo15110f());
        }
        if ((this.f10763G0 & 8) != 0) {
            mVar.mo15094a(mo15103c());
        }
        return this;
    }

    /* renamed from: b */
    public C4321q m14875b(long j) {
        super.mo15098b(j);
        return this;
    }

    /* renamed from: c */
    public void mo15104c(View view) {
        super.mo15104c(view);
        int size = this.f10759C0.size();
        for (int i = 0; i < size; i++) {
            ((C4309m) this.f10759C0.get(i)).mo15104c(view);
        }
    }

    /* renamed from: b */
    public C4321q m14876b(C4315f fVar) {
        super.mo15099b(fVar);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo15101b(C4325s sVar) {
        super.mo15101b(sVar);
        int size = this.f10759C0.size();
        for (int i = 0; i < size; i++) {
            ((C4309m) this.f10759C0.get(i)).mo15101b(sVar);
        }
    }

    /* renamed from: a */
    public C4309m mo15129a(int i) {
        if (i < 0 || i >= this.f10759C0.size()) {
            return null;
        }
        return (C4309m) this.f10759C0.get(i);
    }

    /* renamed from: a */
    public C4321q m14861a(long j) {
        super.mo15082a(j);
        if (this.f10713V >= 0) {
            int size = this.f10759C0.size();
            for (int i = 0; i < size; i++) {
                ((C4309m) this.f10759C0.get(i)).mo15082a(j);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C4321q m14862a(TimeInterpolator timeInterpolator) {
        this.f10763G0 |= 1;
        ArrayList<C4309m> arrayList = this.f10759C0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C4309m) this.f10759C0.get(i)).mo15083a(timeInterpolator);
            }
        }
        super.mo15083a(timeInterpolator);
        return this;
    }

    /* renamed from: a */
    public C4321q m14863a(View view) {
        for (int i = 0; i < this.f10759C0.size(); i++) {
            ((C4309m) this.f10759C0.get(i)).mo15084a(view);
        }
        super.mo15084a(view);
        return this;
    }

    /* renamed from: a */
    public C4321q m14864a(C4315f fVar) {
        super.mo15085a(fVar);
        return this;
    }

    /* renamed from: a */
    public void mo15093a(C4294g gVar) {
        super.mo15093a(gVar);
        this.f10763G0 |= 4;
        for (int i = 0; i < this.f10759C0.size(); i++) {
            ((C4309m) this.f10759C0.get(i)).mo15093a(gVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15091a(ViewGroup viewGroup, C4326t tVar, C4326t tVar2, ArrayList<C4325s> arrayList, ArrayList<C4325s> arrayList2) {
        long h = mo15112h();
        int size = this.f10759C0.size();
        for (int i = 0; i < size; i++) {
            C4309m mVar = (C4309m) this.f10759C0.get(i);
            if (h > 0 && (this.f10760D0 || i == 0)) {
                long h2 = mVar.mo15112h();
                if (h2 > 0) {
                    mVar.mo15098b(h2 + h);
                } else {
                    mVar.mo15098b(h);
                }
            }
            mVar.mo15091a(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public void mo15007a(C4325s sVar) {
        if (mo15102b(sVar.f10770b)) {
            Iterator it = this.f10759C0.iterator();
            while (it.hasNext()) {
                C4309m mVar = (C4309m) it.next();
                if (mVar.mo15102b(sVar.f10770b)) {
                    mVar.mo15007a(sVar);
                    sVar.f10771c.add(mVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo15095a(C4320p pVar) {
        super.mo15095a(pVar);
        this.f10763G0 |= 2;
        int size = this.f10759C0.size();
        for (int i = 0; i < size; i++) {
            ((C4309m) this.f10759C0.get(i)).mo15095a(pVar);
        }
    }

    /* renamed from: a */
    public void mo15094a(C4314e eVar) {
        super.mo15094a(eVar);
        this.f10763G0 |= 8;
        int size = this.f10759C0.size();
        for (int i = 0; i < size; i++) {
            ((C4309m) this.f10759C0.get(i)).mo15094a(eVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo15087a(String str) {
        String a = super.mo15087a(str);
        for (int i = 0; i < this.f10759C0.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("\n");
            C4309m mVar = (C4309m) this.f10759C0.get(i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(mVar.mo15087a(sb2.toString()));
            a = sb.toString();
        }
        return a;
    }
}
