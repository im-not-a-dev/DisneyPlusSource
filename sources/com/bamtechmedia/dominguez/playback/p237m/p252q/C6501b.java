package com.bamtechmedia.dominguez.playback.p237m.p252q;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextAction;", "", "()V", "DisplayUpNextDialogElements", "HideUpNextDialog", "IgnoreUpNext", "IgnoreUpNextPreparing", "UpNextDialogIsShowing", "Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextAction$HideUpNextDialog;", "Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextAction$DisplayUpNextDialogElements;", "Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextAction$UpNextDialogIsShowing;", "Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextAction$IgnoreUpNext;", "Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextAction$IgnoreUpNextPreparing;", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.q.b */
/* compiled from: UpNextRecommendation.kt */
public abstract class C6501b {

    /* renamed from: com.bamtechmedia.dominguez.playback.m.q.b$a */
    /* compiled from: UpNextRecommendation.kt */
    public static final class C6502a extends C6501b {

        /* renamed from: a */
        private final C6509d f14715a;

        /* renamed from: b */
        private final boolean f14716b;

        /* renamed from: c */
        private final boolean f14717c;

        public /* synthetic */ C6502a(C6509d dVar, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            this(dVar, z, z2);
        }

        /* renamed from: a */
        public final C6509d mo19160a() {
            return this.f14715a;
        }

        /* renamed from: b */
        public final boolean mo19161b() {
            return this.f14717c;
        }

        /* renamed from: c */
        public final boolean mo19162c() {
            return this.f14716b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C6502a) {
                    C6502a aVar = (C6502a) obj;
                    if (Intrinsics.areEqual((Object) this.f14715a, (Object) aVar.f14715a)) {
                        if (this.f14716b == aVar.f14716b) {
                            if (this.f14717c == aVar.f14717c) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C6509d dVar = this.f14715a;
            int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
            boolean z = this.f14716b;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z2 = this.f14717c;
            if (z2) {
                z2 = true;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DisplayUpNextDialogElements(autoPlayType=");
            sb.append(this.f14715a);
            sb.append(", isMilestone=");
            sb.append(this.f14716b);
            sb.append(", currentIsDownload=");
            sb.append(this.f14717c);
            sb.append(")");
            return sb.toString();
        }

        public C6502a(C6509d dVar, boolean z, boolean z2) {
            super(null);
            this.f14715a = dVar;
            this.f14716b = z;
            this.f14717c = z2;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.q.b$b */
    /* compiled from: UpNextRecommendation.kt */
    public static final class C6503b extends C6501b {

        /* renamed from: a */
        public static final C6503b f14718a = new C6503b();

        private C6503b() {
            super(null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.q.b$c */
    /* compiled from: UpNextRecommendation.kt */
    public static final class C6504c extends C6501b {

        /* renamed from: a */
        public static final C6504c f14719a = new C6504c();

        private C6504c() {
            super(null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.q.b$d */
    /* compiled from: UpNextRecommendation.kt */
    public static final class C6505d extends C6501b {

        /* renamed from: a */
        public static final C6505d f14720a = new C6505d();

        private C6505d() {
            super(null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.q.b$e */
    /* compiled from: UpNextRecommendation.kt */
    public static final class C6506e extends C6501b {
        public C6506e(C6509d dVar, boolean z, boolean z2) {
            super(null);
        }
    }

    private C6501b() {
    }

    public /* synthetic */ C6501b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
