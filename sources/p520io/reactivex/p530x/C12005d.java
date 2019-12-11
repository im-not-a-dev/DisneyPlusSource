package p520io.reactivex.p530x;

/* renamed from: io.reactivex.x.d */
/* compiled from: OnErrorNotImplementedException */
public final class C12005d extends RuntimeException {
    public C12005d(String str, Throwable th) {
        if (th == null) {
            th = new NullPointerException();
        }
        super(str, th);
    }

    public C12005d(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ");
        sb.append(th);
        this(sb.toString(), th);
    }
}
