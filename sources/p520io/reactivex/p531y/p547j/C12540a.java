package p520io.reactivex.p531y.p547j;

import org.reactivestreams.Subscriber;
import p520io.reactivex.C11968q;
import p520io.reactivex.functions.C11952h;

/* renamed from: io.reactivex.y.j.a */
/* compiled from: AppendOnlyLinkedArrayList */
public class C12540a<T> {

    /* renamed from: a */
    final int f29071a;

    /* renamed from: b */
    final Object[] f29072b;

    /* renamed from: c */
    Object[] f29073c = this.f29072b;

    /* renamed from: d */
    int f29074d;

    /* renamed from: io.reactivex.y.j.a$a */
    /* compiled from: AppendOnlyLinkedArrayList */
    public interface C12541a<T> extends C11952h<T> {
        boolean test(T t);
    }

    public C12540a(int i) {
        this.f29071a = i;
        this.f29072b = new Object[(i + 1)];
    }

    /* renamed from: a */
    public void mo30663a(T t) {
        int i = this.f29071a;
        int i2 = this.f29074d;
        if (i2 == i) {
            Object[] objArr = new Object[(i + 1)];
            this.f29073c[i] = objArr;
            this.f29073c = objArr;
            i2 = 0;
        }
        this.f29073c[i2] = t;
        this.f29074d = i2 + 1;
    }

    /* renamed from: b */
    public void mo30666b(T t) {
        this.f29072b[0] = t;
    }

    /* renamed from: a */
    public void mo30662a(C12541a<? super T> aVar) {
        int i = this.f29071a;
        for (Object[] objArr = this.f29072b; objArr != null; objArr = objArr[i]) {
            int i2 = 0;
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (!aVar.test(objArr2)) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public <U> boolean mo30665a(Subscriber<? super U> subscriber) {
        Object[] objArr = this.f29072b;
        int i = this.f29071a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (C12551j.m39363a((Object) objArr2, subscriber)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }

    /* renamed from: a */
    public <U> boolean mo30664a(C11968q<? super U> qVar) {
        Object[] objArr = this.f29072b;
        int i = this.f29071a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (C12551j.m39365b(objArr2, qVar)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }
}
