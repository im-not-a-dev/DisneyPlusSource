package com.bamtechmedia.dominguez.collections.items;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.constraintlayout.widget.Group;
import com.bamtechmedia.dominguez.collections.C3320f;
import com.bamtechmedia.dominguez.collections.C3320f.C3322b;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import com.bamtechmedia.dominguez.collections.p081ui.C3493c;
import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import com.bamtechmedia.dominguez.core.p084g.C3800a;
import com.bamtechmedia.dominguez.core.p084g.p086d.C3822a;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import java.util.concurrent.TimeUnit;
import kotlin.C12907r;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p135s.C4127b0;
import p163g.p201e.p202a.C5361d;
import p163g.p201e.p202a.C5363f;
import p163g.p201e.p202a.C5364g;
import p163g.p201e.p202a.C5365h;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 12\u00020\u0001:\u0003123B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000eH\u0016J&\u0010\u001e\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016J\u0018\u0010'\u001a\u0004\u0018\u00010&2\f\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u000eH\u0016J\u0016\u0010+\u001a\u00020\u00102\f\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010)H\u0016J\u0018\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0010H\u0002R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00064"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/items/ContinueWatchingItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "config", "Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "shelfId", "", "asset", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "poster", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "title", "subtitle", "remainingTime", "percentageWatched", "", "isTv", "", "clickHandler", "Lcom/bamtechmedia/dominguez/collections/items/CollectionItemClickHandler;", "analytics", "Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;", "debugAssetHelper", "Lcom/bamtechmedia/dominguez/collections/items/DebugAssetHelper;", "shelfListItemScaleHelper", "Lcom/bamtechmedia/dominguez/collections/ui/ShelfListItemScaleHelper;", "shelfItemSessionHelper", "Lcom/bamtechmedia/dominguez/collections/items/ShelfItemSessionHelper;", "accessibility", "Lcom/bamtechmedia/dominguez/collections/items/CollectionAccessibility;", "(Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/Playable;Lcom/bamtechmedia/dominguez/core/content/assets/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLcom/bamtechmedia/dominguez/collections/items/CollectionItemClickHandler;Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;Lcom/bamtechmedia/dominguez/collections/items/DebugAssetHelper;Lcom/bamtechmedia/dominguez/collections/ui/ShelfListItemScaleHelper;Lcom/bamtechmedia/dominguez/collections/items/ShelfItemSessionHelper;Lcom/bamtechmedia/dominguez/collections/items/CollectionAccessibility;)V", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "holder", "payloads", "", "", "getChangePayload", "newItem", "Lcom/xwray/groupie/Item;", "getLayout", "isSameAs", "other", "progressBarAnimator", "view", "Landroid/view/View;", "hasFocus", "Companion", "Factory", "Payload", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.items.h */
/* compiled from: ContinueWatchingItem.kt */
public final class C3355h extends C11866a {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final String f8450U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C3693o f8451V;

    /* renamed from: W */
    private final Image f8452W;

    /* renamed from: X */
    private final String f8453X;

    /* renamed from: Y */
    private final String f8454Y;

    /* renamed from: Z */
    private final String f8455Z;

    /* renamed from: a0 */
    private final int f8456a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public final boolean f8457b0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3444j f8458c;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public final C3345c f8459c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public final C3320f f8460d0;

    /* renamed from: e0 */
    private final C3364j f8461e0;

    /* renamed from: f0 */
    private final C3493c f8462f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public final C3394w f8463g0;

    /* renamed from: h0 */
    private final C3341a f8464h0;

    /* renamed from: com.bamtechmedia.dominguez.collections.items.h$a */
    /* compiled from: ContinueWatchingItem.kt */
    public static final class C3356a {
        private C3356a() {
        }

        public /* synthetic */ C3356a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.h$b */
    /* compiled from: ContinueWatchingItem.kt */
    public static final class C3357b {

        /* renamed from: a */
        private final C3345c f8465a;

        /* renamed from: b */
        private final C3493c f8466b;

        /* renamed from: c */
        private final boolean f8467c;

        /* renamed from: d */
        private final C3320f f8468d;

        /* renamed from: e */
        private final C3364j f8469e;

        /* renamed from: f */
        private final C3394w f8470f;

        public C3357b(C3345c cVar, C3493c cVar2, boolean z, C3320f fVar, C3364j jVar, C3394w wVar) {
            this.f8465a = cVar;
            this.f8466b = cVar2;
            this.f8467c = z;
            this.f8468d = fVar;
            this.f8469e = jVar;
            this.f8470f = wVar;
        }

        /* renamed from: b */
        private final String m11547b(C3693o oVar) {
            if (!(oVar instanceof C3685g)) {
                oVar = null;
            }
            C3685g gVar = (C3685g) oVar;
            if (gVar == null) {
                return null;
            }
            return C5880u.m18937a(C5365h.season_episode_title_placeholder, C13173j0.m40356a(C12907r.m40244a("S", String.valueOf(gVar.mo12876F())), C12907r.m40244a("E", String.valueOf(gVar.mo12878I())), C12907r.m40244a("TITLE", gVar.getTitle())));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
            if (r1 != null) goto L_0x0028;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bamtechmedia.dominguez.collections.items.C3355h mo12457a(com.bamtechmedia.dominguez.collections.p080o0.C3444j r19, java.lang.String r20, com.bamtechmedia.dominguez.core.content.C3693o r21, com.bamtechmedia.dominguez.collections.items.C3341a r22) {
            /*
                r18 = this;
                r0 = r18
                r4 = r21
                com.bamtechmedia.dominguez.collections.items.h r17 = new com.bamtechmedia.dominguez.collections.items.h
                java.lang.String r1 = r19.mo12628h()
                com.bamtechmedia.dominguez.core.content.assets.a r2 = r19.mo12621b()
                com.bamtechmedia.dominguez.core.content.assets.Image r5 = r4.mo12846a(r1, r2)
                boolean r1 = r4 instanceof com.bamtechmedia.dominguez.core.content.C3685g
                if (r1 != 0) goto L_0x0018
                r1 = 0
                goto L_0x0019
            L_0x0018:
                r1 = r4
            L_0x0019:
                com.bamtechmedia.dominguez.core.content.g r1 = (com.bamtechmedia.dominguez.core.content.C3685g) r1
                if (r1 == 0) goto L_0x0024
                java.lang.String r1 = r1.mo12877G()
                if (r1 == 0) goto L_0x0024
                goto L_0x0028
            L_0x0024:
                java.lang.String r1 = r21.getTitle()
            L_0x0028:
                r6 = r1
                java.lang.String r7 = r0.m11547b(r4)
                java.lang.String r8 = r0.m11546a(r4)
                boolean r10 = r0.f8467c
                java.lang.Integer r1 = r21.mo13270A()
                if (r1 == 0) goto L_0x003f
                int r1 = r1.intValue()
                r9 = r1
                goto L_0x0041
            L_0x003f:
                r1 = 0
                r9 = 0
            L_0x0041:
                com.bamtechmedia.dominguez.collections.items.c r11 = r0.f8465a
                com.bamtechmedia.dominguez.collections.f r12 = r0.f8468d
                com.bamtechmedia.dominguez.collections.items.j r13 = r0.f8469e
                com.bamtechmedia.dominguez.collections.ui.c r14 = r0.f8466b
                com.bamtechmedia.dominguez.collections.items.w r15 = r0.f8470f
                r1 = r17
                r2 = r19
                r3 = r20
                r4 = r21
                r16 = r22
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return r17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.items.C3355h.C3357b.mo12457a(com.bamtechmedia.dominguez.collections.o0.j, java.lang.String, com.bamtechmedia.dominguez.core.content.o, com.bamtechmedia.dominguez.collections.items.a):com.bamtechmedia.dominguez.collections.items.h");
        }

        /* renamed from: a */
        private final String m11546a(C3693o oVar) {
            Integer m = oVar.mo13274m();
            if (m == null) {
                Long w = oVar.mo12913w();
                m = w != null ? Integer.valueOf((int) TimeUnit.MILLISECONDS.toMinutes(w.longValue())) : null;
            }
            int intValue = m != null ? m.intValue() : 0;
            if (intValue < 60) {
                return C5880u.m18937a(C5365h.video_time_remaining, C13170i0.m40332a(C12907r.m40244a("time", String.valueOf(intValue))));
            }
            return C5880u.m18937a(C5365h.continue_watching_hours, C13173j0.m40356a(C12907r.m40244a("hours_remaining", String.valueOf(intValue / 60)), C12907r.m40244a("minutes_remaining", String.valueOf(intValue % 60))));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.h$c */
    /* compiled from: ContinueWatchingItem.kt */
    private static final class C3358c {

        /* renamed from: a */
        private final boolean f8471a;

        /* renamed from: b */
        private final boolean f8472b;

        /* renamed from: c */
        private final boolean f8473c;

        /* renamed from: d */
        private final boolean f8474d;

        /* renamed from: e */
        private final boolean f8475e;

        public C3358c(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.f8471a = z;
            this.f8472b = z2;
            this.f8473c = z3;
            this.f8474d = z4;
            this.f8475e = z5;
        }

        /* renamed from: a */
        public final boolean mo12458a() {
            return this.f8472b;
        }

        /* renamed from: b */
        public final boolean mo12459b() {
            return this.f8473c;
        }

        /* renamed from: c */
        public final boolean mo12460c() {
            return this.f8471a;
        }

        /* renamed from: d */
        public final boolean mo12461d() {
            return this.f8475e;
        }

        /* renamed from: e */
        public final boolean mo12462e() {
            return this.f8474d;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C3358c) {
                    C3358c cVar = (C3358c) obj;
                    if (this.f8471a == cVar.f8471a) {
                        if (this.f8472b == cVar.f8472b) {
                            if (this.f8473c == cVar.f8473c) {
                                if (this.f8474d == cVar.f8474d) {
                                    if (this.f8475e == cVar.f8475e) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.f8471a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = (z ? 1 : 0) * true;
            boolean z2 = this.f8472b;
            if (z2) {
                z2 = true;
            }
            int i3 = (i2 + (z2 ? 1 : 0)) * 31;
            boolean z3 = this.f8473c;
            if (z3) {
                z3 = true;
            }
            int i4 = (i3 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f8474d;
            if (z4) {
                z4 = true;
            }
            int i5 = (i4 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.f8475e;
            if (!z5) {
                i = z5;
            }
            return i5 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Payload(percentageWatched=");
            sb.append(this.f8471a);
            sb.append(", configChanged=");
            sb.append(this.f8472b);
            sb.append(", imageChanged=");
            sb.append(this.f8473c);
            sb.append(", titleChanged=");
            sb.append(this.f8474d);
            sb.append(", remainingTimeChanged=");
            sb.append(this.f8475e);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.h$d */
    /* compiled from: ContinueWatchingItem.kt */
    static final class C3359d implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ int f8476U;

        /* renamed from: c */
        final /* synthetic */ C3355h f8477c;

        C3359d(C3355h hVar, int i) {
            this.f8477c = hVar;
            this.f8476U = i;
        }

        public final void onClick(View view) {
            this.f8477c.f8459c0.mo12437a(this.f8477c.f8451V, 7003);
            C3322b.m11431a(this.f8477c.f8460d0, this.f8477c.f8458c, this.f8476U, this.f8477c.f8451V, null, true, 8, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.h$e */
    /* compiled from: ContinueWatchingItem.kt */
    static final class C3360e extends C12881k implements Function1<Boolean, C13145v> {

        /* renamed from: U */
        final /* synthetic */ C11867b f8478U;

        /* renamed from: c */
        final /* synthetic */ C3355h f8479c;

        C3360e(C3355h hVar, C11867b bVar) {
            this.f8479c = hVar;
            this.f8478U = bVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }

        public final void invoke(boolean z) {
            Group group = (Group) this.f8478U.mo20994a().findViewById(C5363f.groupFocused);
            if (group != null) {
                C4127b0.m14131b(group, z);
            }
            C3355h hVar = this.f8479c;
            View view = this.f8478U.itemView;
            Intrinsics.checkReturnedValueIsNotNull((Object) view, "holder.itemView");
            hVar.m11538a(view, z);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.h$f */
    /* compiled from: ContinueWatchingItem.kt */
    static final class C3361f implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ int f8480U;

        /* renamed from: V */
        final /* synthetic */ C11867b f8481V;

        /* renamed from: c */
        final /* synthetic */ C3355h f8482c;

        C3361f(C3355h hVar, int i, C11867b bVar) {
            this.f8482c = hVar;
            this.f8480U = i;
            this.f8481V = bVar;
        }

        public final void onClick(View view) {
            try {
                C3322b.m11431a(this.f8482c.f8460d0, this.f8482c.f8458c, this.f8480U, this.f8482c.f8451V, null, false, 24, null);
                if (this.f8482c.f8457b0) {
                    this.f8482c.f8459c0.mo12437a(this.f8482c.f8451V, 7003);
                } else {
                    this.f8482c.f8459c0.mo12436a(this.f8482c.f8451V);
                }
                this.f8482c.f8463g0.mo12549a(this.f8482c.f8450U, this.f8482c.f8451V);
            } catch (IllegalArgumentException e) {
                View view2 = this.f8481V.itemView;
                Intrinsics.checkReturnedValueIsNotNull((Object) view2, "holder.itemView");
                Context context = view2.getContext();
                Intrinsics.checkReturnedValueIsNotNull((Object) context, "holder.itemView.context");
                String localizedMessage = e.getLocalizedMessage();
                Intrinsics.checkReturnedValueIsNotNull((Object) localizedMessage, "e.localizedMessage");
                Toast makeText = Toast.makeText(context.getApplicationContext(), localizedMessage, 0);
                makeText.show();
                Intrinsics.checkReturnedValueIsNotNull((Object) makeText, "Toast.makeText(applicati…uration).apply { show() }");
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.h$g */
    /* compiled from: ContinueWatchingItem.kt */
    static final class C3362g implements Runnable {

        /* renamed from: U */
        final /* synthetic */ ProgressBar f8483U;

        /* renamed from: V */
        final /* synthetic */ int f8484V;

        /* renamed from: W */
        final /* synthetic */ View f8485W;

        /* renamed from: c */
        final /* synthetic */ boolean f8486c;

        C3362g(boolean z, ProgressBar progressBar, int i, View view) {
            this.f8486c = z;
            this.f8483U = progressBar;
            this.f8484V = i;
            this.f8485W = view;
        }

        public final void run() {
            String str = "progressBar";
            if (this.f8486c) {
                ProgressBar progressBar = this.f8483U;
                ProgressBar progressBar2 = progressBar;
                Intrinsics.checkReturnedValueIsNotNull((Object) progressBar, str);
                ProgressBar progressBar3 = this.f8483U;
                Intrinsics.checkReturnedValueIsNotNull((Object) progressBar3, str);
                float scaleX = progressBar3.getScaleX();
                float measuredHeight = 1.0f / ((((float) this.f8484V) / ((float) this.f8485W.getMeasuredHeight())) + 1.0f);
                ProgressBar progressBar4 = this.f8483U;
                Intrinsics.checkReturnedValueIsNotNull((Object) progressBar4, str);
                Context context = progressBar4.getContext();
                Intrinsics.checkReturnedValueIsNotNull((Object) context, "progressBar.context");
                Resources resources = context.getResources();
                Intrinsics.checkReturnedValueIsNotNull((Object) resources, "resources");
                C3800a.m12829a(progressBar2, 0.0f, 0.0f, scaleX, measuredHeight, null, null, 0.0f, TypedValue.applyDimension(1, -4.0f, resources.getDisplayMetrics()), 0.0f, 0.0f, 0.0f, 0.0f, 150, 0, C3822a.f9509k.mo13746a(), null, null, null, 241459, null);
                return;
            }
            ProgressBar progressBar5 = this.f8483U;
            ProgressBar progressBar6 = progressBar5;
            Intrinsics.checkReturnedValueIsNotNull((Object) progressBar5, str);
            ProgressBar progressBar7 = this.f8483U;
            Intrinsics.checkReturnedValueIsNotNull((Object) progressBar7, str);
            float scaleX2 = progressBar7.getScaleX();
            float measuredHeight2 = (((float) this.f8484V) / ((float) this.f8485W.getMeasuredHeight())) + 1.0f;
            ProgressBar progressBar8 = this.f8483U;
            Intrinsics.checkReturnedValueIsNotNull((Object) progressBar8, str);
            C3800a.m12829a(progressBar6, 0.0f, 0.0f, scaleX2, measuredHeight2, null, null, progressBar8.getTranslationY(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 250, 0, C3822a.f9509k.mo13747b(), null, null, null, 241459, null);
        }
    }

    static {
        new C3356a(null);
    }

    public C3355h(C3444j jVar, String str, C3693o oVar, Image image, String str2, String str3, String str4, int i, boolean z, C3345c cVar, C3320f fVar, C3364j jVar2, C3493c cVar2, C3394w wVar, C3341a aVar) {
        this.f8458c = jVar;
        this.f8450U = str;
        this.f8451V = oVar;
        this.f8452W = image;
        this.f8453X = str2;
        this.f8454Y = str3;
        this.f8455Z = str4;
        this.f8456a0 = i;
        this.f8457b0 = z;
        this.f8459c0 = cVar;
        this.f8460d0 = fVar;
        this.f8461e0 = jVar2;
        this.f8462f0 = cVar2;
        this.f8463g0 = wVar;
        this.f8464h0 = aVar;
    }

    public void bind(C11867b bVar, int i) {
    }

    public Object getChangePayload(C11853e<?> eVar) {
        if (eVar != null) {
            C3355h hVar = (C3355h) eVar;
            C3358c cVar = new C3358c(hVar.f8456a0 != this.f8456a0, !Intrinsics.areEqual((Object) hVar.f8458c, (Object) this.f8458c), !Intrinsics.areEqual((Object) hVar.f8452W, (Object) this.f8452W), (Intrinsics.areEqual((Object) hVar.f8453X, (Object) this.f8453X) ^ true) || (Intrinsics.areEqual((Object) hVar.f8454Y, (Object) this.f8454Y) ^ true), !Intrinsics.areEqual((Object) hVar.f8455Z, (Object) this.f8455Z));
            return cVar;
        }
        throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.collections.items.ContinueWatchingItem");
    }

    public int getLayout() {
        return C5364g.continue_watching_item;
    }

    public boolean isSameAs(C11853e<?> eVar) {
        if (eVar instanceof C3355h) {
            C3693o oVar = ((C3355h) eVar).f8451V;
            C3693o oVar2 = this.f8451V;
            if (oVar == oVar2 || oVar.mo12848a(oVar2)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11538a(View view, boolean z) {
        ProgressBar progressBar = (ProgressBar) view.findViewById(C5363f.watchingProgress);
        progressBar.post(new C3362g(z, progressBar, view.getResources().getDimensionPixelSize(C5361d.default_container_focus_padding), view));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02dd, code lost:
        if (r2 == false) goto L_0x02e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0212  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bind(p163g.p509o.p510a.p511l.C11867b r21, int r22, java.util.List<? extends java.lang.Object> r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            android.view.View r4 = r1.itemView
            java.lang.String r5 = "holder.itemView"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r4, r5)
            int r6 = p163g.p201e.p202a.C5363f.titleView
            android.view.View r4 = r4.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r6 = "holder.itemView.titleView"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r4, r6)
            com.bamtechmedia.dominguez.core.content.o r6 = r0.f8451V
            boolean r6 = r6 instanceof com.bamtechmedia.dominguez.core.content.C3685g
            if (r6 == 0) goto L_0x0024
            r6 = 2
            goto L_0x0025
        L_0x0024:
            r6 = 3
        L_0x0025:
            r4.setMaxLines(r6)
            android.view.View r4 = r21.mo20994a()
            int r6 = p163g.p201e.p202a.C5363f.poster
            android.view.View r4 = r4.findViewById(r6)
            com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView r4 = (com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView) r4
            com.bamtechmedia.dominguez.collections.items.h$d r6 = new com.bamtechmedia.dominguez.collections.items.h$d
            r6.<init>(r0, r2)
            r4.setOnClickListener(r6)
            com.bamtechmedia.dominguez.core.content.o r4 = r0.f8451V
            java.lang.Integer r4 = r4.mo13274m()
            if (r4 == 0) goto L_0x0045
            goto L_0x005d
        L_0x0045:
            com.bamtechmedia.dominguez.core.content.o r4 = r0.f8451V
            java.lang.Long r4 = r4.mo12913w()
            if (r4 == 0) goto L_0x005c
            long r6 = r4.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r6 = r4.toMinutes(r6)
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            goto L_0x005d
        L_0x005c:
            r4 = 0
        L_0x005d:
            com.bamtechmedia.dominguez.core.content.o r6 = r0.f8451V
            boolean r7 = r6 instanceof com.bamtechmedia.dominguez.core.content.C3685g
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x006d
            java.lang.Integer r6 = r6.mo13274m()
            if (r6 != 0) goto L_0x006d
            r6 = 1
            goto L_0x006e
        L_0x006d:
            r6 = 0
        L_0x006e:
            com.bamtechmedia.dominguez.collections.items.a r7 = r0.f8464h0
            com.bamtechmedia.dominguez.core.content.o r10 = r0.f8451V
            java.lang.String r11 = r0.f8453X
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r7.mo12418a(r6, r10, r11, r4)
            android.view.View r6 = r21.mo20994a()
            int r7 = p163g.p201e.p202a.C5363f.shelfItemLayout
            android.view.View r6 = r6.findViewById(r7)
            com.bamtechmedia.dominguez.collections.items.ShelfItemLayout r6 = (com.bamtechmedia.dominguez.collections.items.ShelfItemLayout) r6
            if (r6 == 0) goto L_0x008d
            r6.setContentDescription(r4)
        L_0x008d:
            boolean r6 = r0.f8457b0
            if (r6 == 0) goto L_0x00a5
            android.view.View r6 = r21.mo20994a()
            int r7 = p163g.p201e.p202a.C5363f.poster
            android.view.View r6 = r6.findViewById(r7)
            com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView r6 = (com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView) r6
            java.lang.String r7 = "holder.poster"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r6, r7)
            r6.setContentDescription(r4)
        L_0x00a5:
            com.bamtechmedia.dominguez.collections.ui.c r10 = r0.f8462f0
            android.view.View r11 = r1.itemView
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r11, r5)
            r12 = 0
            com.bamtechmedia.dominguez.collections.o0.j r13 = r0.f8458c
            r14 = 0
            com.bamtechmedia.dominguez.collections.items.h$e r15 = new com.bamtechmedia.dominguez.collections.items.h$e
            r15.<init>(r0, r1)
            r16 = 10
            r17 = 0
            com.bamtechmedia.dominguez.collections.p081ui.C3493c.m11865a(r10, r11, r12, r13, r14, r15, r16, r17)
            android.view.View r4 = r1.itemView
            com.bamtechmedia.dominguez.collections.items.h$f r6 = new com.bamtechmedia.dominguez.collections.items.h$f
            r6.<init>(r0, r2, r1)
            r4.setOnClickListener(r6)
            com.bamtechmedia.dominguez.collections.items.j r4 = r0.f8461e0
            android.view.View r6 = r1.itemView
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r6, r5)
            com.bamtechmedia.dominguez.core.content.o r7 = r0.f8451V
            r4.mo12470a(r6, r7)
            com.bamtechmedia.dominguez.collections.items.w r4 = r0.f8463g0
            android.view.View r6 = r1.itemView
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r6, r5)
            java.lang.String r7 = r0.f8450U
            com.bamtechmedia.dominguez.core.content.o r10 = r0.f8451V
            r4.mo12548a(r6, r7, r10)
            android.view.View r4 = r1.itemView
            int r6 = p163g.p201e.p202a.C5363f.focusHelperExpandNavOnFocusSearchLeft
            if (r2 != 0) goto L_0x00e8
            r2 = 1
            goto L_0x00e9
        L_0x00e8:
            r2 = 0
        L_0x00e9:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4.setTag(r6, r2)
            boolean r2 = r23.isEmpty()
            if (r2 != 0) goto L_0x0127
            boolean r2 = r3 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0102
            boolean r2 = r23.isEmpty()
            if (r2 == 0) goto L_0x0102
        L_0x0100:
            r2 = 0
            goto L_0x0122
        L_0x0102:
            java.util.Iterator r2 = r23.iterator()
        L_0x0106:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0100
            java.lang.Object r4 = r2.next()
            boolean r6 = r4 instanceof com.bamtechmedia.dominguez.collections.items.C3355h.C3358c
            if (r6 == 0) goto L_0x011e
            com.bamtechmedia.dominguez.collections.items.h$c r4 = (com.bamtechmedia.dominguez.collections.items.C3355h.C3358c) r4
            boolean r4 = r4.mo12458a()
            if (r4 == 0) goto L_0x011e
            r4 = 1
            goto L_0x011f
        L_0x011e:
            r4 = 0
        L_0x011f:
            if (r4 == 0) goto L_0x0106
            r2 = 1
        L_0x0122:
            if (r2 == 0) goto L_0x0125
            goto L_0x0127
        L_0x0125:
            r2 = 0
            goto L_0x0128
        L_0x0127:
            r2 = 1
        L_0x0128:
            if (r2 == 0) goto L_0x013b
            android.view.View r2 = r21.mo20994a()
            int r4 = p163g.p201e.p202a.C5363f.shelfItemLayout
            android.view.View r2 = r2.findViewById(r4)
            com.bamtechmedia.dominguez.collections.items.ShelfItemLayout r2 = (com.bamtechmedia.dominguez.collections.items.ShelfItemLayout) r2
            com.bamtechmedia.dominguez.collections.o0.j r4 = r0.f8458c
            r2.setConfig(r4)
        L_0x013b:
            boolean r2 = r23.isEmpty()
            if (r2 != 0) goto L_0x0172
            boolean r2 = r3 instanceof java.util.Collection
            if (r2 == 0) goto L_0x014d
            boolean r2 = r23.isEmpty()
            if (r2 == 0) goto L_0x014d
        L_0x014b:
            r2 = 0
            goto L_0x016d
        L_0x014d:
            java.util.Iterator r2 = r23.iterator()
        L_0x0151:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x014b
            java.lang.Object r4 = r2.next()
            boolean r6 = r4 instanceof com.bamtechmedia.dominguez.collections.items.C3355h.C3358c
            if (r6 == 0) goto L_0x0169
            com.bamtechmedia.dominguez.collections.items.h$c r4 = (com.bamtechmedia.dominguez.collections.items.C3355h.C3358c) r4
            boolean r4 = r4.mo12459b()
            if (r4 == 0) goto L_0x0169
            r4 = 1
            goto L_0x016a
        L_0x0169:
            r4 = 0
        L_0x016a:
            if (r4 == 0) goto L_0x0151
            r2 = 1
        L_0x016d:
            if (r2 == 0) goto L_0x0170
            goto L_0x0172
        L_0x0170:
            r2 = 0
            goto L_0x0173
        L_0x0172:
            r2 = 1
        L_0x0173:
            if (r2 == 0) goto L_0x01a6
            android.view.View r2 = r21.mo20994a()
            int r4 = p163g.p201e.p202a.C5363f.poster
            android.view.View r2 = r2.findViewById(r4)
            r10 = r2
            com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView r10 = (com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView) r10
            java.lang.String r2 = "posterImage"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r10, r2)
            com.bamtechmedia.dominguez.core.content.assets.Image r11 = r0.f8452W
            int r12 = p163g.p201e.p202a.C5362e.fallback_1_78_tile
            r13 = 0
            com.bamtechmedia.dominguez.collections.o0.j r2 = r0.f8458c
            int r2 = com.bamtechmedia.dominguez.collections.p080o0.C3446k.m11762a(r2, r10)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            r15 = 0
            com.bamtechmedia.dominguez.core.content.o r2 = r0.f8451V
            boolean r16 = r2.mo13268i()
            r17 = 0
            r18 = 84
            r19 = 0
            com.bamtechmedia.dominguez.core.p216l.C5763b.m18702a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x01a6:
            boolean r2 = r23.isEmpty()
            if (r2 != 0) goto L_0x01dd
            boolean r2 = r3 instanceof java.util.Collection
            if (r2 == 0) goto L_0x01b8
            boolean r2 = r23.isEmpty()
            if (r2 == 0) goto L_0x01b8
        L_0x01b6:
            r2 = 0
            goto L_0x01d8
        L_0x01b8:
            java.util.Iterator r2 = r23.iterator()
        L_0x01bc:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01b6
            java.lang.Object r4 = r2.next()
            boolean r6 = r4 instanceof com.bamtechmedia.dominguez.collections.items.C3355h.C3358c
            if (r6 == 0) goto L_0x01d4
            com.bamtechmedia.dominguez.collections.items.h$c r4 = (com.bamtechmedia.dominguez.collections.items.C3355h.C3358c) r4
            boolean r4 = r4.mo12462e()
            if (r4 == 0) goto L_0x01d4
            r4 = 1
            goto L_0x01d5
        L_0x01d4:
            r4 = 0
        L_0x01d5:
            if (r4 == 0) goto L_0x01bc
            r2 = 1
        L_0x01d8:
            if (r2 == 0) goto L_0x01db
            goto L_0x01dd
        L_0x01db:
            r2 = 0
            goto L_0x01de
        L_0x01dd:
            r2 = 1
        L_0x01de:
            java.lang.String r4 = "holder.subtitleView"
            if (r2 == 0) goto L_0x020c
            android.view.View r2 = r21.mo20994a()
            int r6 = p163g.p201e.p202a.C5363f.titleView
            android.view.View r2 = r2.findViewById(r6)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r6 = "holder.titleView"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r6)
            java.lang.String r6 = r0.f8453X
            r2.setText(r6)
            android.view.View r2 = r21.mo20994a()
            int r6 = p163g.p201e.p202a.C5363f.subtitleView
            android.view.View r2 = r2.findViewById(r6)
            android.widget.TextView r2 = (android.widget.TextView) r2
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r4)
            java.lang.String r6 = r0.f8454Y
            r2.setText(r6)
        L_0x020c:
            boolean r2 = r23.isEmpty()
            if (r2 != 0) goto L_0x0243
            boolean r2 = r3 instanceof java.util.Collection
            if (r2 == 0) goto L_0x021e
            boolean r2 = r23.isEmpty()
            if (r2 == 0) goto L_0x021e
        L_0x021c:
            r2 = 0
            goto L_0x023e
        L_0x021e:
            java.util.Iterator r2 = r23.iterator()
        L_0x0222:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x021c
            java.lang.Object r6 = r2.next()
            boolean r7 = r6 instanceof com.bamtechmedia.dominguez.collections.items.C3355h.C3358c
            if (r7 == 0) goto L_0x023a
            com.bamtechmedia.dominguez.collections.items.h$c r6 = (com.bamtechmedia.dominguez.collections.items.C3355h.C3358c) r6
            boolean r6 = r6.mo12461d()
            if (r6 == 0) goto L_0x023a
            r6 = 1
            goto L_0x023b
        L_0x023a:
            r6 = 0
        L_0x023b:
            if (r6 == 0) goto L_0x0222
            r2 = 1
        L_0x023e:
            if (r2 == 0) goto L_0x0241
            goto L_0x0243
        L_0x0241:
            r2 = 0
            goto L_0x0244
        L_0x0243:
            r2 = 1
        L_0x0244:
            if (r2 == 0) goto L_0x02ab
            android.view.View r2 = r21.mo20994a()
            int r6 = p163g.p201e.p202a.C5363f.remainTimeView
            android.view.View r2 = r2.findViewById(r6)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r6 = "holder.remainTimeView"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r6)
            r2.setVisibility(r9)
            boolean r2 = r0.f8457b0
            if (r2 != 0) goto L_0x0297
            java.lang.String r2 = r0.f8454Y
            if (r2 == 0) goto L_0x026b
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0269
            goto L_0x026b
        L_0x0269:
            r2 = 0
            goto L_0x026c
        L_0x026b:
            r2 = 1
        L_0x026c:
            if (r2 != 0) goto L_0x026f
            goto L_0x0297
        L_0x026f:
            android.view.View r2 = r21.mo20994a()
            int r7 = p163g.p201e.p202a.C5363f.subtitleView
            android.view.View r2 = r2.findViewById(r7)
            android.widget.TextView r2 = (android.widget.TextView) r2
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r4)
            java.lang.String r4 = r0.f8455Z
            r2.setText(r4)
            android.view.View r2 = r21.mo20994a()
            int r4 = p163g.p201e.p202a.C5363f.remainTimeView
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r6)
            r4 = 4
            r2.setVisibility(r4)
            goto L_0x02ab
        L_0x0297:
            android.view.View r2 = r21.mo20994a()
            int r4 = p163g.p201e.p202a.C5363f.remainTimeView
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r6)
            java.lang.String r4 = r0.f8455Z
            r2.setText(r4)
        L_0x02ab:
            boolean r2 = r23.isEmpty()
            if (r2 != 0) goto L_0x02df
            boolean r2 = r3 instanceof java.util.Collection
            if (r2 == 0) goto L_0x02bd
            boolean r2 = r23.isEmpty()
            if (r2 == 0) goto L_0x02bd
        L_0x02bb:
            r2 = 0
            goto L_0x02dd
        L_0x02bd:
            java.util.Iterator r2 = r23.iterator()
        L_0x02c1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02bb
            java.lang.Object r3 = r2.next()
            boolean r4 = r3 instanceof com.bamtechmedia.dominguez.collections.items.C3355h.C3358c
            if (r4 == 0) goto L_0x02d9
            com.bamtechmedia.dominguez.collections.items.h$c r3 = (com.bamtechmedia.dominguez.collections.items.C3355h.C3358c) r3
            boolean r3 = r3.mo12460c()
            if (r3 == 0) goto L_0x02d9
            r3 = 1
            goto L_0x02da
        L_0x02d9:
            r3 = 0
        L_0x02da:
            if (r3 == 0) goto L_0x02c1
            r2 = 1
        L_0x02dd:
            if (r2 == 0) goto L_0x02e0
        L_0x02df:
            r9 = 1
        L_0x02e0:
            if (r9 == 0) goto L_0x0338
            android.view.View r2 = r21.mo20994a()
            int r3 = p163g.p201e.p202a.C5363f.watchingProgress
            android.view.View r2 = r2.findViewById(r3)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            java.lang.String r3 = "holder.watchingProgress"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r3)
            int r3 = r0.f8456a0
            r2.setProgress(r3)
            boolean r2 = r0.f8457b0
            if (r2 == 0) goto L_0x0338
            android.view.View r2 = r21.mo20994a()
            int r3 = p163g.p201e.p202a.C5363f.watchingProgress
            android.view.View r2 = r2.findViewById(r3)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            if (r2 == 0) goto L_0x030f
            int r3 = r0.f8456a0
            r2.setProgress(r3)
        L_0x030f:
            android.view.View r2 = r1.itemView
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r5)
            android.content.Context r2 = r2.getContext()
            java.lang.String r3 = "holder.itemView.context"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r3)
            int r3 = p163g.p201e.p202a.C5358a.assetCornerRadius
            float r2 = com.bamtechmedia.dominguez.core.utils.C5837i.m18837b(r2, r3)
            android.view.View r3 = r1.itemView
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r5)
            com.bamtechmedia.dominguez.core.p.a r4 = new com.bamtechmedia.dominguez.core.p.a
            r4.<init>(r2)
            r3.setOutlineProvider(r4)
            android.view.View r1 = r1.itemView
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r5)
            r1.setClipToOutline(r8)
        L_0x0338:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.items.C3355h.bind(g.o.a.l.b, int, java.util.List):void");
    }
}
