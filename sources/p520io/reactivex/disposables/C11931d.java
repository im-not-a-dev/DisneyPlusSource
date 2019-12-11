package p520io.reactivex.disposables;

/* renamed from: io.reactivex.disposables.d */
/* compiled from: RunnableDisposable */
final class C11931d extends C11930c<Runnable> {
    C11931d(Runnable runnable) {
        super(runnable);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RunnableDisposable(disposed=");
        sb.append(isDisposed());
        sb.append(", ");
        sb.append(get());
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30253a(Runnable runnable) {
        runnable.run();
    }
}
