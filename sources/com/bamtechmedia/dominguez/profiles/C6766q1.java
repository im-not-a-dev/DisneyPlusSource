package com.bamtechmedia.dominguez.profiles;

import kotlin.Metadata;
import p520io.reactivex.Maybe;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH&¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/StartupProfileProvider;", "", "removeLocalSelectedProfileId", "", "setLocalSelectedProfileId", "profileId", "", "startupProfileMaybe", "Lio/reactivex/Maybe;", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "forceActiveProfile", "", "Companion", "profilesApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.q1 */
/* compiled from: StartupProfileProvider.kt */
public interface C6766q1 {

    /* renamed from: a */
    public static final C6767a f15142a = C6767a.f15144b;

    /* renamed from: com.bamtechmedia.dominguez.profiles.q1$a */
    /* compiled from: StartupProfileProvider.kt */
    public static final class C6767a {

        /* renamed from: a */
        private static String f15143a;

        /* renamed from: b */
        static final /* synthetic */ C6767a f15144b = new C6767a();

        private C6767a() {
        }

        /* renamed from: a */
        public final String mo19490a() {
            return f15143a;
        }

        /* renamed from: a */
        public final void mo19491a(String str) {
            f15143a = str;
        }
    }

    /* renamed from: a */
    void mo19265a(String str);

    /* renamed from: b */
    Maybe<C6626c0> mo19268b(boolean z);

    /* renamed from: c */
    void mo19269c();
}
