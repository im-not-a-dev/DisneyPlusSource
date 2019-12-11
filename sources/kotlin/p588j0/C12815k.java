package kotlin.p588j0;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.p587i0.C12775h;
import kotlin.reflect.KDeclarationContainer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 ,2\u00060\u0001j\u0002`\u0002:\u0002,-B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\u0010\u000bB\u000f\b\u0001\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0017J\u0011\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0004J\"\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\"J\u0016\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004J\u0016\u0010$\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010'\u001a\u00020\u001bJ\u0006\u0010(\u001a\u00020\rJ\b\u0010)\u001a\u00020\u0004H\u0016J\b\u0010*\u001a\u00020+H\u0002R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006."}, mo31007d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "(Ljava/lang/String;)V", "option", "Lkotlin/text/RegexOption;", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "options", "", "(Ljava/lang/String;Ljava/util/Set;)V", "nativePattern", "Ljava/util/regex/Pattern;", "(Ljava/util/regex/Pattern;)V", "_options", "getOptions", "()Ljava/util/Set;", "getPattern", "()Ljava/lang/String;", "containsMatchIn", "", "input", "", "find", "Lkotlin/text/MatchResult;", "startIndex", "", "findAll", "Lkotlin/sequences/Sequence;", "matchEntire", "matches", "replace", "transform", "Lkotlin/Function1;", "replacement", "replaceFirst", "split", "", "limit", "toPattern", "toString", "writeReplace", "", "Companion", "Serialized", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.j0.k */
/* compiled from: Regex.kt */
public final class C12815k implements Serializable {

    /* renamed from: U */
    public static final C12816a f29494U = new C12816a(null);

    /* renamed from: c */
    private final Pattern f29495c;

    /* renamed from: kotlin.j0.k$a */
    /* compiled from: Regex.kt */
    public static final class C12816a {
        private C12816a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final int m40041a(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        public /* synthetic */ C12816a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlin.j0.k$b */
    /* compiled from: Regex.kt */
    static final class C12817b extends C12881k implements Function0<C12808i> {

        /* renamed from: U */
        final /* synthetic */ CharSequence f29496U;

        /* renamed from: V */
        final /* synthetic */ int f29497V;

        /* renamed from: c */
        final /* synthetic */ C12815k f29498c;

        C12817b(C12815k kVar, CharSequence charSequence, int i) {
            this.f29498c = kVar;
            this.f29496U = charSequence;
            this.f29497V = i;
            super(0);
        }

        public final C12808i invoke() {
            return this.f29498c.mo31137a(this.f29496U, this.f29497V);
        }
    }

    /* renamed from: kotlin.j0.k$c */
    /* compiled from: Regex.kt */
    static final /* synthetic */ class C12818c extends C12879i implements Function1<C12808i, C12808i> {

        /* renamed from: c */
        public static final C12818c f29499c = new C12818c();

        C12818c() {
            super(1);
        }

        /* renamed from: a */
        public final C12808i invoke(C12808i iVar) {
            return iVar.next();
        }

        public final String getName() {
            return "next";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C12808i.class);
        }

        public final String getSignature() {
            return "next()Lkotlin/text/MatchResult;";
        }
    }

    public C12815k(Pattern pattern) {
        this.f29495c = pattern;
    }

    /* renamed from: b */
    public static /* synthetic */ C12775h m40034b(C12815k kVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return kVar.mo31139b(charSequence, i);
    }

    /* renamed from: a */
    public final boolean mo31138a(CharSequence charSequence) {
        return this.f29495c.matcher(charSequence).find();
    }

    /* renamed from: c */
    public final boolean mo31141c(CharSequence charSequence) {
        return this.f29495c.matcher(charSequence).matches();
    }

    public String toString() {
        String pattern = this.f29495c.toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) pattern, "nativePattern.toString()");
        return pattern;
    }

    public C12815k(String str) {
        Pattern compile = Pattern.compile(str);
        Intrinsics.checkReturnedValueIsNotNull((Object) compile, "Pattern.compile(pattern)");
        this(compile);
    }

    /* renamed from: a */
    public static /* synthetic */ C12808i m40033a(C12815k kVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return kVar.mo31137a(charSequence, i);
    }

    /* renamed from: b */
    public final C12775h<C12808i> mo31139b(CharSequence charSequence, int i) {
        return C12781n.m39978a((Function0<? extends T>) new C12817b<Object>(this, charSequence, i), (Function1<? super T, ? extends T>) C12818c.f29499c);
    }

    public C12815k(String str, C12820m mVar) {
        Pattern compile = Pattern.compile(str, f29494U.m40041a(mVar.mo31144a()));
        Intrinsics.checkReturnedValueIsNotNull((Object) compile, "Pattern.compile(pattern,…nicodeCase(option.value))");
        this(compile);
    }

    /* renamed from: a */
    public final C12808i mo31137a(CharSequence charSequence, int i) {
        Matcher matcher = this.f29495c.matcher(charSequence);
        Intrinsics.checkReturnedValueIsNotNull((Object) matcher, "nativePattern.matcher(input)");
        return C12819l.m40048b(matcher, i, charSequence);
    }

    /* renamed from: b */
    public final C12808i mo31140b(CharSequence charSequence) {
        Matcher matcher = this.f29495c.matcher(charSequence);
        Intrinsics.checkReturnedValueIsNotNull((Object) matcher, "nativePattern.matcher(input)");
        return C12819l.m40049b(matcher, charSequence);
    }

    /* renamed from: a */
    public final String mo31136a(CharSequence charSequence, String str) {
        String replaceAll = this.f29495c.matcher(charSequence).replaceAll(str);
        Intrinsics.checkReturnedValueIsNotNull((Object) replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }
}
