package kotlin.p587i0;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\b\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004\u001a<\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000b\u001a=\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\b\u0010\f\u001a\u0004\u0018\u0001H\u00022\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000bH\u0007¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0010\"\u0002H\u0002¢\u0006\u0002\u0010\u0011\u001a\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001aC\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u00050\u000bH\u0002¢\u0006\u0002\b\u0016\u001a)\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00170\u0001H\u0007¢\u0006\u0002\b\u0018\u001a\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a2\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0004H\u0007\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\b\u001a@\u0010\u001c\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u001e0\u001d\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0015*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00150\u001d0\u0001¨\u0006\u001f"}, mo31007d2 = {"Sequence", "Lkotlin/sequences/Sequence;", "T", "iterator", "Lkotlin/Function0;", "", "emptySequence", "generateSequence", "", "nextFunction", "seedFunction", "Lkotlin/Function1;", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "asSequence", "constrainOnce", "flatten", "R", "flatten$SequencesKt__SequencesKt", "", "flattenSequenceOfIterable", "ifEmpty", "defaultValue", "orEmpty", "unzip", "Lkotlin/Pair;", "", "kotlin-stdlib"}, mo31008k = 5, mo31009mv = {1, 1, 15}, mo31011xi = 1, mo31012xs = "kotlin/sequences/SequencesKt")
/* renamed from: kotlin.i0.n */
/* compiled from: Sequences.kt */
class C12781n extends C12780m {

    /* renamed from: kotlin.i0.n$a */
    /* compiled from: Sequences.kt */
    public static final class C12782a implements C12775h<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f29454a;

        public C12782a(Iterator it) {
            this.f29454a = it;
        }

        public Iterator<T> iterator() {
            return this.f29454a;
        }
    }

    /* renamed from: kotlin.i0.n$b */
    /* compiled from: Sequences.kt */
    static final class C12783b extends C12881k implements Function1<C12775h<? extends T>, Iterator<? extends T>> {

        /* renamed from: c */
        public static final C12783b f29455c = new C12783b();

        C12783b() {
            super(1);
        }

        /* renamed from: a */
        public final Iterator<T> invoke(C12775h<? extends T> hVar) {
            return hVar.iterator();
        }
    }

    /* renamed from: kotlin.i0.n$c */
    /* compiled from: Sequences.kt */
    static final class C12784c extends C12881k implements Function1<T, T> {

        /* renamed from: c */
        public static final C12784c f29456c = new C12784c();

        C12784c() {
            super(1);
        }

        public final T invoke(T t) {
            return t;
        }
    }

    /* renamed from: kotlin.i0.n$d */
    /* compiled from: Sequences.kt */
    static final class C12785d extends C12881k implements Function1<T, T> {

        /* renamed from: c */
        final /* synthetic */ Function0 f29457c;

        C12785d(Function0 function0) {
            this.f29457c = function0;
            super(1);
        }

        public final T invoke(T t) {
            return this.f29457c.invoke();
        }
    }

    /* renamed from: kotlin.i0.n$e */
    /* compiled from: Sequences.kt */
    static final class C12786e extends C12881k implements Function0<T> {

        /* renamed from: c */
        final /* synthetic */ Object f29458c;

        C12786e(Object obj) {
            this.f29458c = obj;
            super(0);
        }

        public final T invoke() {
            return this.f29458c;
        }
    }

    /* renamed from: a */
    public static <T> C12775h<T> m39974a(Iterator<? extends T> it) {
        return m39975a((C12775h<? extends T>) new C12782a<Object>(it));
    }

    /* renamed from: b */
    public static final <T> C12775h<T> m39980b(C12775h<? extends C12775h<? extends T>> hVar) {
        return m39976a(hVar, (Function1<? super T, ? extends Iterator<? extends R>>) C12783b.f29455c);
    }

    /* renamed from: a */
    public static final <T> C12775h<T> m39979a(T... tArr) {
        return tArr.length == 0 ? m39972a() : C13174k.m40401c((Object[]) tArr);
    }

    /* renamed from: a */
    public static <T> C12775h<T> m39972a() {
        return C12768d.f29431a;
    }

    /* renamed from: a */
    private static final <T, R> C12775h<R> m39976a(C12775h<? extends T> hVar, Function1<? super T, ? extends Iterator<? extends R>> function1) {
        if (hVar instanceof C12795r) {
            return ((C12795r) hVar).mo31109a(function1);
        }
        return new C12771f(hVar, C12784c.f29456c, function1);
    }

    /* renamed from: a */
    public static final <T> C12775h<T> m39975a(C12775h<? extends T> hVar) {
        return hVar instanceof C12764a ? hVar : new C12764a(hVar);
    }

    /* renamed from: a */
    public static <T> C12775h<T> m39977a(Function0<? extends T> function0) {
        return m39975a((C12775h<? extends T>) new C12773g<Object>(function0, new C12785d(function0)));
    }

    /* renamed from: a */
    public static <T> C12775h<T> m39973a(T t, Function1<? super T, ? extends T> function1) {
        if (t == null) {
            return C12768d.f29431a;
        }
        return new C12773g(new C12786e(t), function1);
    }

    /* renamed from: a */
    public static <T> C12775h<T> m39978a(Function0<? extends T> function0, Function1<? super T, ? extends T> function1) {
        return new C12773g(function0, function1);
    }
}
