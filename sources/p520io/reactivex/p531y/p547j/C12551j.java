package p520io.reactivex.p531y.p547j;

import java.io.Serializable;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11968q;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.j.j */
/* compiled from: NotificationLite */
public enum C12551j {
    COMPLETE;

    /* renamed from: io.reactivex.y.j.j$a */
    /* compiled from: NotificationLite */
    static final class C12552a implements Serializable {

        /* renamed from: c */
        final Disposable f29084c;

        C12552a(Disposable disposable) {
            this.f29084c = disposable;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationLite.Disposable[");
            sb.append(this.f29084c);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: io.reactivex.y.j.j$b */
    /* compiled from: NotificationLite */
    static final class C12553b implements Serializable {

        /* renamed from: c */
        final Throwable f29085c;

        C12553b(Throwable th) {
            this.f29085c = th;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12553b)) {
                return false;
            }
            return C12036b.m38664a((Object) this.f29085c, (Object) ((C12553b) obj).f29085c);
        }

        public int hashCode() {
            return this.f29085c.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationLite.Error[");
            sb.append(this.f29085c);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: io.reactivex.y.j.j$c */
    /* compiled from: NotificationLite */
    static final class C12554c implements Serializable {

        /* renamed from: c */
        final C14314c f29086c;

        C12554c(C14314c cVar) {
            this.f29086c = cVar;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationLite.Subscription[");
            sb.append(this.f29086c);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static Object m39357a() {
        return COMPLETE;
    }

    /* renamed from: b */
    public static <T> T m39364b(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static <T> boolean m39365b(Object obj, C11968q<? super T> qVar) {
        if (obj == COMPLETE) {
            qVar.onComplete();
            return true;
        } else if (obj instanceof C12553b) {
            qVar.onError(((C12553b) obj).f29085c);
            return true;
        } else if (obj instanceof C12552a) {
            qVar.onSubscribe(((C12552a) obj).f29084c);
            return false;
        } else {
            qVar.onNext(obj);
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m39366c(Object obj) {
        return obj == COMPLETE;
    }

    /* renamed from: d */
    public static boolean m39367d(Object obj) {
        return obj instanceof C12553b;
    }

    /* renamed from: e */
    public static <T> Object m39368e(T t) {
        return t;
    }

    public String toString() {
        return "NotificationLite.Complete";
    }

    /* renamed from: a */
    public static Object m39359a(Throwable th) {
        return new C12553b(th);
    }

    /* renamed from: a */
    public static Object m39360a(C14314c cVar) {
        return new C12554c(cVar);
    }

    /* renamed from: a */
    public static Object m39358a(Disposable disposable) {
        return new C12552a(disposable);
    }

    /* renamed from: a */
    public static Throwable m39361a(Object obj) {
        return ((C12553b) obj).f29085c;
    }

    /* renamed from: a */
    public static <T> boolean m39362a(Object obj, C11968q<? super T> qVar) {
        if (obj == COMPLETE) {
            qVar.onComplete();
            return true;
        } else if (obj instanceof C12553b) {
            qVar.onError(((C12553b) obj).f29085c);
            return true;
        } else {
            qVar.onNext(obj);
            return false;
        }
    }

    /* renamed from: a */
    public static <T> boolean m39363a(Object obj, Subscriber<? super T> subscriber) {
        if (obj == COMPLETE) {
            subscriber.onComplete();
            return true;
        } else if (obj instanceof C12553b) {
            subscriber.onError(((C12553b) obj).f29085c);
            return true;
        } else if (obj instanceof C12554c) {
            subscriber.mo29945a(((C12554c) obj).f29086c);
            return false;
        } else {
            subscriber.onNext(obj);
            return false;
        }
    }
}
