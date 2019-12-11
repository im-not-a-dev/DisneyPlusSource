package p520io.reactivex.p530x;

/* renamed from: io.reactivex.x.f */
/* compiled from: UndeliverableException */
public final class C12007f extends IllegalStateException {
    public C12007f(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | ");
        sb.append(th);
        super(sb.toString(), th);
    }
}
