package com.bamtechmedia.dominguez.app;

import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.p530x.C11998a;
import p551j.p552a.C12589b;
import p686n.p687a.C14100a.C14102b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00070\u0001¢\u0006\u0002\b\u0002:\u0001+B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0017H\u0002J\u0012\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u000eH\u0002J\u001b\u0010 \u001a\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0002\u0010$J,\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010\u0017H\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/app/SentryTree;", "Ltimber/log/Timber$Tree;", "Lorg/jetbrains/annotations/NotNull;", "wrapper", "Lcom/bamtechmedia/dominguez/app/SentryTree$SentryWrapper;", "(Lcom/bamtechmedia/dominguez/app/SentryTree$SentryWrapper;)V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "ignoredMessages", "", "", "getIgnoredMessages", "()Ljava/util/Set;", "setIgnoredMessages", "(Ljava/util/Set;)V", "ignoredStackTraceElements", "getIgnoredStackTraceElements", "setIgnoredStackTraceElements", "lastThrowable", "", "getLastThrowable", "()Ljava/lang/Throwable;", "setLastThrowable", "(Ljava/lang/Throwable;)V", "isLoggable", "throwable", "isMessageLoggable", "message", "isStackTrackLoggable", "stackTrace", "", "Ljava/lang/StackTraceElement;", "([Ljava/lang/StackTraceElement;)Z", "log", "", "priority", "", "tag", "t", "SentryWrapper", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.app.z */
/* compiled from: SentryTree.kt */
public final class C2686z extends C14102b {

    /* renamed from: b */
    private volatile Throwable f7433b;

    /* renamed from: c */
    private boolean f7434c;

    /* renamed from: d */
    private Set<String> f7435d = C13188p0.m40533b("idp.error.payload.fields.incorrect", "idp.error.otp.invalid-passcode", "idp.error.identity.bad-credentials", "access-token.invalid", "unreliable-location", "code='unauthorized'", "stream-concurrency-violation", "account.profiles.max.exceeded", "Not connected. Call connect() and wait for onConnected() to be called.", "The source did not signal an event for", "Unable to resolve host", "errors=[(code='network-error'", "Resource ID #0xffffffff", "4: Sign-in required.", "16: No eligible accounts can be found.", "Receiver not registered:", "Document store could not load", "Required output protections are not active", "com.google.android.exoplayer2.upstream.HttpDataSource");

    /* renamed from: e */
    private Set<String> f7436e = C13186o0.m40524a("singleBitmapAtIndex");

    /* renamed from: f */
    private final C2687a f7437f;

    /* renamed from: com.bamtechmedia.dominguez.app.z$a */
    /* compiled from: SentryTree.kt */
    public static final class C2687a {
        /* renamed from: a */
        public final void mo11727a(Throwable th) {
            C12589b.m39532a(th);
        }
    }

    public C2686z(C2687a aVar) {
        this.f7437f = aVar;
    }

    /* renamed from: c */
    private final boolean m10308c(Throwable th) {
        if (m10306a(th.getMessage())) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            C12880j.m40222a((Object) stackTrace, "throwable.stackTrace");
            if (m10307a(stackTrace) && (!C12880j.m40224a((Object) this.f7433b, (Object) th))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo11725a(boolean z) {
        this.f7434c = z;
    }

    /* renamed from: b */
    public final void mo11726b(Set<String> set) {
        this.f7436e = set;
    }

    /* renamed from: a */
    public final void mo11724a(Set<String> set) {
        this.f7435d = set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11723a(int i, String str, String str2, Throwable th) {
        if (th instanceof C11998a) {
            for (Throwable a : ((C11998a) th).mo30334a()) {
                mo11723a(i, str, str2, a);
            }
            return;
        }
        if (this.f7434c && th != null && m10308c(th)) {
            try {
                this.f7437f.mo11727a(th);
                this.f7433b = th;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private final boolean m10306a(String str) {
        boolean z;
        Set<String> set = this.f7435d;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        for (String str2 : set) {
            if (str == null || C12833x.m40154a((CharSequence) str, (CharSequence) str2, false, 2, (Object) null)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m10307a(StackTraceElement[] stackTraceElementArr) {
        for (StackTraceElement methodName : stackTraceElementArr) {
            if (this.f7436e.contains(methodName.getMethodName())) {
                return false;
            }
        }
        return true;
    }
}
