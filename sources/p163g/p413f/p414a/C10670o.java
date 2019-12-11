package p163g.p413f.p414a;

import p163g.p413f.p414a.C10670o;
import p163g.p413f.p414a.p420u.p422m.C10754c;
import p163g.p413f.p414a.p420u.p422m.C10758e;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: g.f.a.o */
/* compiled from: TransitionOptions */
public abstract class C10670o<CHILD extends C10670o<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: c */
    private C10758e<? super TranscodeType> f25206c = C10754c.m33972b();

    /* renamed from: b */
    private CHILD m33505b() {
        return this;
    }

    /* renamed from: a */
    public final CHILD mo27580a(C10758e<? super TranscodeType> eVar) {
        C10774j.m34012a(eVar);
        this.f25206c = eVar;
        m33505b();
        return this;
    }

    public final CHILD clone() {
        try {
            return (C10670o) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C10758e<? super TranscodeType> mo27581a() {
        return this.f25206c;
    }
}
