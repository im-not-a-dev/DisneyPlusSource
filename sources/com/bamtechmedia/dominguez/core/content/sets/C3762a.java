package com.bamtechmedia.dominguez.core.content.sets;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bamtechmedia.dominguez.auth.p066r0.C2793c;
import com.bamtechmedia.dominguez.auth.p066r0.C2793c.C2794a;
import com.bamtechmedia.dominguez.core.utils.C5850n;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6627c1;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import com.google.common.base.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000bH\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u001dR\u0014\u0010\n\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetAvailabilityHint;", "Lcom/bamtechmedia/dominguez/auth/logout/LogOutAction;", "context", "Landroid/content/Context;", "profileCache", "Lcom/google/common/base/Optional;", "Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "(Landroid/content/Context;Lcom/google/common/base/Optional;Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;)V", "logOutActionId", "", "getLogOutActionId", "()Ljava/lang/String;", "preferences", "Landroid/content/SharedPreferences;", "availabilityHint", "Lcom/bamtechmedia/dominguez/core/content/sets/AvailabilityHint;", "set", "Lcom/bamtechmedia/dominguez/core/content/sets/ReferenceSet;", "key", "type", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;", "setId", "onLogout", "Lio/reactivex/Completable;", "profileId", "setAvailabilityHint", "", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;", "collections_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.sets.a */
/* compiled from: ContentSetAvailabilityHint.kt */
public final class C3762a implements C2793c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final SharedPreferences f9389a;

    /* renamed from: b */
    private final String f9390b;

    /* renamed from: c */
    private final Optional<C6627c1> f9391c;

    /* renamed from: d */
    private final C6667g1 f9392d;

    /* renamed from: com.bamtechmedia.dominguez.core.content.sets.a$a */
    /* compiled from: ContentSetAvailabilityHint.kt */
    static final class C3763a implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C3762a f9393a;

        C3763a(C3762a aVar) {
            this.f9393a = aVar;
        }

        public final void run() {
            Editor edit = this.f9393a.f9389a.edit();
            C12880j.m40222a((Object) edit, "editor");
            edit.clear();
            edit.commit();
        }
    }

    public C3762a(Context context, Optional<C6627c1> optional, C6667g1 g1Var) {
        this.f9391c = optional;
        this.f9392d = g1Var;
        String str = "contentSetAvailability";
        this.f9389a = new C5850n(context, str);
        this.f9390b = str;
    }

    /* renamed from: d */
    private final String m12759d() {
        C6627c1 c1Var = (C6627c1) this.f9391c.mo27107c();
        if (c1Var != null) {
            C6626c0 b = c1Var.mo19287b();
            if (b != null) {
                String profileId = b.getProfileId();
                if (profileId != null) {
                    return profileId;
                }
            }
        }
        return ((C6626c0) this.f9392d.mo19381b().mo30224c()).getProfileId();
    }

    /* renamed from: b */
    public String mo11571b() {
        return this.f9390b;
    }

    /* renamed from: c */
    public Completable mo11572c() {
        return C2794a.m10466a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r0 != null) goto L_0x001e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bamtechmedia.dominguez.core.content.sets.AvailabilityHint mo13656a(com.bamtechmedia.dominguez.core.content.sets.ReferenceSet r4) {
        /*
            r3 = this;
            android.content.SharedPreferences r0 = r3.f9389a
            com.bamtechmedia.dominguez.core.content.sets.ContentSetType r1 = r4.mo13604b()
            java.lang.String r2 = r4.mo13608e()
            java.lang.String r1 = r3.m12758a(r1, r2)
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L_0x001c
            com.bamtechmedia.dominguez.core.content.sets.AvailabilityHint r0 = com.bamtechmedia.dominguez.core.content.sets.AvailabilityHint.valueOf(r0)
            if (r0 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            com.bamtechmedia.dominguez.core.content.sets.AvailabilityHint r0 = com.bamtechmedia.dominguez.core.content.sets.AvailabilityHint.UNKNOWN
        L_0x001e:
            r4.mo13627a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.sets.C3762a.mo13656a(com.bamtechmedia.dominguez.core.content.sets.ReferenceSet):com.bamtechmedia.dominguez.core.content.sets.AvailabilityHint");
    }

    /* renamed from: a */
    public final void mo13657a(ContentSet contentSet) {
        AvailabilityHint availabilityHint = contentSet.isEmpty() ? AvailabilityHint.NO_CONTENT : AvailabilityHint.HAS_CONTENT;
        Editor edit = this.f9389a.edit();
        C12880j.m40222a((Object) edit, "editor");
        edit.putString(m12758a(contentSet.mo13604b(), contentSet.mo13608e()), availabilityHint.name());
        edit.apply();
    }

    /* renamed from: a */
    private final String m12758a(ContentSetType contentSetType, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("profile_");
        sb.append(m12759d());
        sb.append("_type_");
        sb.append(contentSetType.name());
        sb.append("_id_");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public Completable mo11570a() {
        Completable c = Completable.m38166c((C11945a) new C3763a(this));
        C12880j.m40222a((Object) c, "Completable.fromAction {…mit = true) { clear() } }");
        return c;
    }
}
