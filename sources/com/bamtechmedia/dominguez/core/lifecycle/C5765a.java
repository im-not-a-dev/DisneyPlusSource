package com.bamtechmedia.dominguez.core.lifecycle;

import android.app.Application.ActivityLifecycleCallbacks;
import androidx.lifecycle.C0710d;
import kotlin.Metadata;
import p520io.reactivex.Observable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "streamUpdates", "Lio/reactivex/Observable;", "Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi$AppPresenceResponse;", "AppPresenceResponse", "coreCommon_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.lifecycle.a */
/* compiled from: AppPresenceApi.kt */
public interface C5765a extends ActivityLifecycleCallbacks, C0710d {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi$AppPresenceResponse;", "", "()V", "Background", "Foreground", "LeavePage", "Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi$AppPresenceResponse$Foreground;", "Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi$AppPresenceResponse$Background;", "Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi$AppPresenceResponse$LeavePage;", "coreCommon_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.core.lifecycle.a$a */
    /* compiled from: AppPresenceApi.kt */
    public static abstract class C5766a {

        /* renamed from: com.bamtechmedia.dominguez.core.lifecycle.a$a$a */
        /* compiled from: AppPresenceApi.kt */
        public static final class C5767a extends C5766a {

            /* renamed from: a */
            public static final C5767a f13525a = new C5767a();

            private C5767a() {
                super(null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.core.lifecycle.a$a$b */
        /* compiled from: AppPresenceApi.kt */
        public static final class C5768b extends C5766a {

            /* renamed from: a */
            public static final C5768b f13526a = new C5768b();

            private C5768b() {
                super(null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.core.lifecycle.a$a$c */
        /* compiled from: AppPresenceApi.kt */
        public static final class C5769c extends C5766a {

            /* renamed from: a */
            private final int f13527a;

            /* renamed from: b */
            private final boolean f13528b;

            public C5769c(int i, boolean z) {
                super(null);
                this.f13527a = i;
                this.f13528b = z;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C5769c) {
                        C5769c cVar = (C5769c) obj;
                        if (this.f13527a == cVar.f13527a) {
                            if (this.f13528b == cVar.f13528b) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                int i = this.f13527a * 31;
                boolean z = this.f13528b;
                if (z) {
                    z = true;
                }
                return i + (z ? 1 : 0);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("LeavePage(numProfiles=");
                sb.append(this.f13527a);
                sb.append(", fromDeeplink=");
                sb.append(this.f13528b);
                sb.append(")");
                return sb.toString();
            }
        }

        private C5766a() {
        }

        public /* synthetic */ C5766a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    Observable<C5766a> mo17649a();
}
