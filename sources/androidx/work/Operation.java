package androidx.work;

import android.annotation.SuppressLint;
import com.google.common.util.concurrent.ListenableFuture;

public interface Operation {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a */
    public static final SUCCESS f4003a = new SUCCESS();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b */
    public static final C1017b f4004b = new C1017b();

    public static abstract class State {

        public static final class SUCCESS extends State {
            public String toString() {
                return "SUCCESS";
            }

            private SUCCESS() {
            }
        }

        /* renamed from: androidx.work.Operation$State$a */
        public static final class C1016a extends State {

            /* renamed from: a */
            private final Throwable f4005a;

            public C1016a(Throwable th) {
                this.f4005a = th;
            }

            /* renamed from: a */
            public Throwable mo5620a() {
                return this.f4005a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.f4005a.getMessage()});
            }
        }

        /* renamed from: androidx.work.Operation$State$b */
        public static final class C1017b extends State {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C1017b() {
            }
        }

        State() {
        }
    }

    /* renamed from: a */
    ListenableFuture<SUCCESS> mo5618a();
}
