package p096e.p114f.p117b.p118j;

import p096e.p114f.p117b.p118j.C3973f.C3975b;

/* renamed from: e.f.b.j.a */
/* compiled from: Analyzer */
public class C3964a {
    /* renamed from: a */
    static int m13411a(C3973f fVar) {
        float f;
        int i = -1;
        if (fVar.f9989P == 0.0f) {
            return -1;
        }
        if (fVar.mo14387o() == C3975b.MATCH_CONSTRAINT) {
            i = (int) (((float) fVar.mo14381l()) * fVar.f9989P);
            fVar.mo14401u(i);
        } else if (fVar.mo14410z() == C3975b.MATCH_CONSTRAINT) {
            if (fVar.f9990Q == -1) {
                f = ((float) fVar.mo14316B()) / fVar.f9989P;
            } else {
                f = ((float) fVar.mo14316B()) * fVar.f9989P;
            }
            i = (int) f;
            fVar.mo14384m(i);
        }
        return i;
    }
}
