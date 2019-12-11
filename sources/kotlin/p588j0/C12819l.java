package kotlin.p588j0;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.p586h0.C12757d;

/* renamed from: kotlin.j0.l */
/* compiled from: Regex.kt */
public final class C12819l {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C12808i m40048b(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new C12811j(matcher, charSequence);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C12808i m40049b(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new C12811j(matcher, charSequence);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C12757d m40047b(MatchResult matchResult, int i) {
        return C12762h.m39920d(matchResult.start(i), matchResult.end(i));
    }
}
