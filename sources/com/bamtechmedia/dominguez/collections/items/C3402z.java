package com.bamtechmedia.dominguez.collections.items;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.bamtechmedia.dominguez.collections.C3288c;
import com.bamtechmedia.dominguez.collections.C3317e;
import com.bamtechmedia.dominguez.collections.C3317e.C3318a;
import com.bamtechmedia.dominguez.collections.C3320f;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j.C3445a;
import com.bamtechmedia.dominguez.collections.p080o0.C3446k;
import com.bamtechmedia.dominguez.collections.p081ui.C3493c;
import com.bamtechmedia.dominguez.core.content.C3688j;
import com.bamtechmedia.dominguez.core.content.C3793w;
import com.bamtechmedia.dominguez.core.content.C3794x;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import com.bamtechmedia.dominguez.core.content.collections.C3680n;
import com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView;
import com.bamtechmedia.dominguez.core.p084g.C3800a;
import com.bamtechmedia.dominguez.core.p084g.p086d.C3822a;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3849b;
import com.bamtechmedia.dominguez.core.p216l.C5763b;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.p391ui.PlayerView;
import com.google.common.base.Optional;
import javax.inject.Provider;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p202a.C5363f;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 /2\u00020\u0001:\u0002/0BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u0016\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u001c\u0010#\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\u0018\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002J\u0018\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0002J*\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010$\u001a\u00020%2\b\u0010.\u001a\u0004\u0018\u00010\u001eH\u0002R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/items/ShelfListItemFocusHelper;", "", "shelfListItemScaleHelper", "Lcom/bamtechmedia/dominguez/collections/ui/ShelfListItemScaleHelper;", "assetVideoArtHandler", "Lcom/bamtechmedia/dominguez/collections/AssetVideoArtHandler;", "shelfItemSessionHelper", "Lcom/bamtechmedia/dominguez/collections/items/ShelfItemSessionHelper;", "assetFocusCallback", "Lcom/bamtechmedia/dominguez/collections/AssetFocusCallback;", "asset", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "shelfId", "", "config", "Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "analytics", "Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;", "alphaFocusEffectEnabled", "", "(Lcom/bamtechmedia/dominguez/collections/ui/ShelfListItemScaleHelper;Lcom/bamtechmedia/dominguez/collections/AssetVideoArtHandler;Lcom/bamtechmedia/dominguez/collections/items/ShelfItemSessionHelper;Lcom/bamtechmedia/dominguez/collections/AssetFocusCallback;Lcom/bamtechmedia/dominguez/core/content/assets/Asset;Ljava/lang/String;Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;Z)V", "hasAnimatedBrands", "getHasAnimatedBrands", "()Z", "animateHeroContainerLogo", "", "holder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "animateViewOut", "view", "Landroid/view/View;", "bind", "position", "", "onClick", "resetView", "playerView", "Lcom/google/android/exoplayer2/ui/PlayerView;", "setBrandImages", "brandNormalImage", "Lcom/bamtechmedia/dominguez/core/design/widgets/AspectRatioImageView;", "brandWhiteImage", "setFocusHelperTags", "itemView", "updateVideoArtTile", "hasFocus", "brandTileBackground", "Companion", "Factory", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.items.z */
/* compiled from: ShelfListItemFocusHelper.kt */
public final class C3402z {

    /* renamed from: a */
    private final C3493c f8601a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3317e f8602b;

    /* renamed from: c */
    private final C3394w f8603c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3288c f8604d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3626b f8605e;

    /* renamed from: f */
    private final String f8606f;

    /* renamed from: g */
    private final C3444j f8607g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C3320f f8608h;

    /* renamed from: i */
    private final boolean f8609i;

    /* renamed from: com.bamtechmedia.dominguez.collections.items.z$a */
    /* compiled from: ShelfListItemFocusHelper.kt */
    public static final class C3403a {
        private C3403a() {
        }

        public /* synthetic */ C3403a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.z$b */
    /* compiled from: ShelfListItemFocusHelper.kt */
    public static final class C3404b {

        /* renamed from: a */
        private final Provider<C3493c> f8610a;

        /* renamed from: b */
        private final Optional<C3317e> f8611b;

        /* renamed from: c */
        private final Provider<C3394w> f8612c;

        /* renamed from: d */
        private final Optional<C3288c> f8613d;

        public C3404b(Provider<C3493c> provider, Optional<C3317e> optional, Provider<C3394w> provider2, Optional<C3288c> optional2) {
            this.f8610a = provider;
            this.f8611b = optional;
            this.f8612c = provider2;
            this.f8613d = optional2;
        }

        /* renamed from: a */
        public final C3402z mo12567a(C3626b bVar, String str, C3444j jVar, boolean z, C3320f fVar) {
            Object obj = this.f8610a.get();
            Intrinsics.checkReturnedValueIsNotNull(obj, "shelfListItemScaleHelper.get()");
            C3493c cVar = (C3493c) obj;
            C3317e eVar = (C3317e) this.f8611b.mo27107c();
            Object obj2 = this.f8612c.get();
            Intrinsics.checkReturnedValueIsNotNull(obj2, "shelfItemSessionHelper.get()");
            C3402z zVar = new C3402z(cVar, eVar, (C3394w) obj2, (C3288c) this.f8613d.mo27107c(), bVar, str, jVar, fVar, z);
            return zVar;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.z$c */
    /* compiled from: ShelfListItemFocusHelper.kt */
    static final class C3405c extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ View f8614c;

        C3405c(View view) {
            this.f8614c = view;
            super(0);
        }

        public final void invoke() {
            this.f8614c.setVisibility(8);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.z$d */
    /* compiled from: ShelfListItemFocusHelper.kt */
    static final class C3406d extends C12881k implements Function1<Boolean, C13145v> {

        /* renamed from: U */
        final /* synthetic */ C11867b f8615U;

        /* renamed from: c */
        final /* synthetic */ C3402z f8616c;

        C3406d(C3402z zVar, C11867b bVar) {
            this.f8616c = zVar;
            this.f8615U = bVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }

        public final void invoke(boolean z) {
            PlayerView playerView = (PlayerView) this.f8615U.mo20994a().findViewById(C5363f.player_view);
            if (playerView != null) {
                int i = 4;
                playerView.setVisibility(z ^ true ? 4 : 0);
                CardView cardView = (CardView) this.f8615U.mo20994a().findViewById(C5363f.playerViewLayout);
                Intrinsics.checkReturnedValueIsNotNull((Object) cardView, "holder.playerViewLayout");
                cardView.setVisibility(z ^ true ? 4 : 0);
                AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) this.f8615U.mo20994a().findViewById(C5363f.brandNormalLogoImage);
                if (aspectRatioImageView != null) {
                    aspectRatioImageView.setVisibility(z ? 4 : 0);
                }
                AspectRatioImageView aspectRatioImageView2 = (AspectRatioImageView) this.f8615U.mo20994a().findViewById(C5363f.brandWhiteLogoImage);
                if (aspectRatioImageView2 != null) {
                    if (!(!z)) {
                        i = 0;
                    }
                    aspectRatioImageView2.setVisibility(i);
                }
                if (this.f8616c.f8602b != null) {
                    C3402z zVar = this.f8616c;
                    zVar.m11664a(z, zVar.f8602b, playerView, (ImageView) this.f8615U.mo20994a().findViewById(C5363f.brandTileBackground));
                }
            }
            if (z && this.f8616c.f8605e != null) {
                C3288c c = this.f8616c.f8604d;
                if (c != null) {
                    c.mo12317d(this.f8616c.f8605e);
                }
                this.f8616c.m11666b(this.f8615U);
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.z$e */
    /* compiled from: ShelfListItemFocusHelper.kt */
    static final class C3407e extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ View f8617U;

        /* renamed from: V */
        final /* synthetic */ long f8618V;

        /* renamed from: W */
        final /* synthetic */ C3680n f8619W;

        /* renamed from: c */
        final /* synthetic */ C3402z f8620c;

        C3407e(C3402z zVar, C3317e eVar, PlayerView playerView, View view, long j, C3680n nVar) {
            this.f8620c = zVar;
            this.f8617U = view;
            this.f8618V = j;
            this.f8619W = nVar;
            super(0);
        }

        public final void invoke() {
            String str;
            this.f8620c.m11657a(this.f8617U);
            long currentTimeMillis = System.currentTimeMillis() - this.f8618V;
            C3320f a = this.f8620c.f8608h;
            C3626b b = this.f8620c.f8605e;
            if (b != null) {
                String title = b.getTitle();
                if (title != null) {
                    if (title != null) {
                        str = title.toLowerCase();
                        Intrinsics.checkReturnedValueIsNotNull((Object) str, "(this as java.lang.String).toLowerCase()");
                        a.mo12373a(str, this.f8619W.getUrl(), currentTimeMillis, "tileFocus");
                    }
                    throw new C13142s("null cannot be cast to non-null type java.lang.String");
                }
            }
            str = null;
            a.mo12373a(str, this.f8619W.getUrl(), currentTimeMillis, "tileFocus");
        }
    }

    static {
        new C3403a(null);
    }

    public C3402z(C3493c cVar, C3317e eVar, C3394w wVar, C3288c cVar2, C3626b bVar, String str, C3444j jVar, C3320f fVar, boolean z) {
        this.f8601a = cVar;
        this.f8602b = eVar;
        this.f8603c = wVar;
        this.f8604d = cVar2;
        this.f8605e = bVar;
        this.f8606f = str;
        this.f8607g = jVar;
        this.f8608h = fVar;
        this.f8609i = z;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m11666b(p163g.p509o.p510a.p511l.C11867b r29) {
        /*
            r28 = this;
            r0 = r29
            android.view.View r1 = r0.itemView
            java.lang.String r2 = "holder.itemView"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r2)
            android.content.Context r1 = r1.getContext()
            java.lang.String r3 = "holder.itemView.context"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r3)
            boolean r1 = com.bamtechmedia.dominguez.core.utils.C5837i.m18843e(r1)
            r4 = r28
            com.bamtechmedia.dominguez.collections.o0.j r5 = r4.f8607g
            com.bamtechmedia.dominguez.collections.o0.j$a r5 = r5.mo12627g()
            com.bamtechmedia.dominguez.collections.o0.j$a r6 = com.bamtechmedia.dominguez.collections.p080o0.C3444j.C3445a.HERO_SNAP
            r7 = 1
            if (r5 != r6) goto L_0x0025
            r5 = 1
            goto L_0x0026
        L_0x0025:
            r5 = 0
        L_0x0026:
            if (r1 == 0) goto L_0x00ba
            if (r5 == 0) goto L_0x00ba
            android.view.View r1 = r0.itemView
            boolean r5 = r1 instanceof com.bamtechmedia.dominguez.collections.items.ShelfItemLayout
            r6 = 0
            if (r5 != 0) goto L_0x0032
            r1 = r6
        L_0x0032:
            com.bamtechmedia.dominguez.collections.items.ShelfItemLayout r1 = (com.bamtechmedia.dominguez.collections.items.ShelfItemLayout) r1
            if (r1 == 0) goto L_0x003b
            com.bamtechmedia.dominguez.collections.e0 r1 = r1.getFocusChangeInfo()
            goto L_0x003c
        L_0x003b:
            r1 = r6
        L_0x003c:
            android.view.View r5 = r0.itemView
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r2)
            android.content.Context r2 = r5.getContext()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r3)
            r3 = 1106247680(0x41f00000, float:30.0)
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r5 = "resources"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r5)
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r7, r3, r2)
            if (r1 == 0) goto L_0x0065
            int r1 = r1.mo12369a()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
        L_0x0065:
            r1 = 66
            r3 = 0
            if (r6 != 0) goto L_0x006b
            goto L_0x0073
        L_0x006b:
            int r5 = r6.intValue()
            if (r5 != r1) goto L_0x0073
        L_0x0071:
            r14 = r2
            goto L_0x0081
        L_0x0073:
            r1 = 17
            if (r6 != 0) goto L_0x0078
            goto L_0x0080
        L_0x0078:
            int r5 = r6.intValue()
            if (r5 != r1) goto L_0x0080
            float r2 = -r2
            goto L_0x0071
        L_0x0080:
            r14 = 0
        L_0x0081:
            int r1 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00ba
            android.view.View r0 = r29.mo20994a()
            int r1 = p163g.p201e.p202a.C5363f.logo
            android.view.View r0 = r0.findViewById(r1)
            r5 = r0
            com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView r5 = (com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView) r5
            if (r5 == 0) goto L_0x00ba
            r18 = 700(0x2bc, double:3.46E-321)
            r20 = 150(0x96, double:7.4E-322)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            r16 = 0
            r17 = 0
            r15 = 0
            com.bamtechmedia.dominguez.core.g.d.a$a r0 = com.bamtechmedia.dominguez.core.p084g.p086d.C3822a.f9509k
            com.bamtechmedia.dominguez.core.g.d.a r22 = r0.mo13749d()
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 232700(0x38cfc, float:3.26082E-40)
            r27 = 0
            com.bamtechmedia.dominguez.core.p084g.C3800a.m12829a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r23, r24, r25, r26, r27)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.items.C3402z.m11666b(g.o.a.l.b):void");
    }

    /* renamed from: a */
    public final boolean mo12566a() {
        return this.f8602b != null;
    }

    /* renamed from: a */
    public final void mo12565a(C11867b bVar, int i) {
        C3493c cVar = this.f8601a;
        View view = bVar.itemView;
        String str = "holder.itemView";
        Intrinsics.checkReturnedValueIsNotNull((Object) view, str);
        C3493c.m11865a(cVar, view, null, this.f8607g, this.f8609i, new C3406d(this, bVar), 2, null);
        if (this.f8605e != null) {
            C3394w wVar = this.f8603c;
            View view2 = bVar.itemView;
            Intrinsics.checkReturnedValueIsNotNull((Object) view2, str);
            wVar.mo12548a(view2, this.f8606f, this.f8605e);
        }
        if (!(((PlayerView) bVar.mo20994a().findViewById(C5363f.player_view)) == null || ((AspectRatioImageView) bVar.mo20994a().findViewById(C5363f.brandNormalLogoImage)) == null || ((AspectRatioImageView) bVar.mo20994a().findViewById(C5363f.brandWhiteLogoImage)) == null)) {
            AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) bVar.mo20994a().findViewById(C5363f.brandNormalLogoImage);
            Intrinsics.checkReturnedValueIsNotNull((Object) aspectRatioImageView, "holder.brandNormalLogoImage");
            AspectRatioImageView aspectRatioImageView2 = (AspectRatioImageView) bVar.mo20994a().findViewById(C5363f.brandWhiteLogoImage);
            Intrinsics.checkReturnedValueIsNotNull((Object) aspectRatioImageView2, "holder.brandWhiteLogoImage");
            m11663a(aspectRatioImageView, aspectRatioImageView2);
        }
        View view3 = bVar.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view3, str);
        m11658a(view3, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11664a(boolean z, C3317e eVar, PlayerView playerView, View view) {
        C3626b bVar = this.f8605e;
        String str = null;
        if (!(bVar instanceof C3793w)) {
            bVar = null;
        }
        C3793w wVar = (C3793w) bVar;
        C3680n a = wVar != null ? C3794x.m12817a(wVar, "tile") : null;
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            if (a != null) {
                C3407e eVar2 = new C3407e(this, eVar, playerView, view, currentTimeMillis, a);
                C3318a.m11423a(eVar, playerView, a, true, eVar2, null, 16, null);
                return;
            }
            return;
        }
        m11659a(view, playerView);
        if (a != null) {
            C3320f fVar = this.f8608h;
            C3626b bVar2 = this.f8605e;
            if (bVar2 != null) {
                String title = bVar2.getTitle();
                if (title != null) {
                    if (title != null) {
                        str = title.toLowerCase();
                        Intrinsics.checkReturnedValueIsNotNull((Object) str, "(this as java.lang.String).toLowerCase()");
                    } else {
                        throw new C13142s("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
            fVar.mo12374a(str, a.getUrl(), "tileFocus");
        }
    }

    /* renamed from: a */
    private final void m11659a(View view, PlayerView playerView) {
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            if (animate != null) {
                animate.cancel();
            }
        }
        if (view != null) {
            view.setVisibility(0);
        }
        if (view != null) {
            view.setAlpha(1.0f);
        }
        if (playerView != null) {
            Player player = playerView.getPlayer();
            if (player != null) {
                player.stop();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11657a(View view) {
        View view2 = view;
        if (view2 != null) {
            C3822a a = C3822a.f9509k.mo13746a();
            C3405c cVar = r1;
            C3405c cVar2 = new C3405c(view2);
            C3800a.m12829a(view, 1.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 500, 450, a, null, cVar, null, 167932, null);
        }
    }

    /* renamed from: a */
    private final void m11663a(AspectRatioImageView aspectRatioImageView, AspectRatioImageView aspectRatioImageView2) {
        AspectRatioImageView aspectRatioImageView3 = aspectRatioImageView;
        C3626b bVar = this.f8605e;
        Image a = bVar != null ? bVar.mo12846a(this.f8607g.mo12628h(), this.f8607g.mo12621b()) : null;
        C3626b bVar2 = this.f8605e;
        Image a2 = bVar2 != null ? bVar2.mo12846a(C3688j.TILE_WHITE.mo13408a(), this.f8607g.mo12621b()) : null;
        String str = "brand";
        String str2 = str;
        C5763b.m18702a(aspectRatioImageView, a, C3849b.m12935a(C3849b.f9526a, this.f8607g.mo12621b().mo13242X(), 0, 2, null), null, Integer.valueOf(C3446k.m11762a(this.f8607g, aspectRatioImageView3)), Intrinsics.areEqual((Object) this.f8607g.mo12623d(), (Object) str), false, Intrinsics.areEqual((Object) this.f8607g.mo12623d(), (Object) str), 36, null);
        String str3 = str2;
        C5763b.m18702a(aspectRatioImageView2, a2, C3849b.m12935a(C3849b.f9526a, this.f8607g.mo12621b().mo13242X(), 0, 2, null), null, Integer.valueOf(C3446k.m11762a(this.f8607g, aspectRatioImageView3)), Intrinsics.areEqual((Object) this.f8607g.mo12623d(), (Object) str3), false, Intrinsics.areEqual((Object) this.f8607g.mo12623d(), (Object) str3), 36, null);
    }

    /* renamed from: a */
    private final void m11658a(View view, int i) {
        boolean z = true;
        boolean z2 = this.f8607g.mo12627g() == C3445a.HERO_SNAP;
        view.setTag(C5363f.focusHelperHideNavOnViewFocus, Boolean.valueOf(z2));
        view.setTag(C5363f.focusHelperSkipCollectionViewFocusHelperHorizontal, Boolean.valueOf(z2));
        view.setTag(C5363f.focusHelperExpandNavOnFocusSearchLeft, Boolean.valueOf(i == 0));
        view.setTag(C5363f.focusHelperHeroShelfListItem, Boolean.valueOf(z2));
        int i2 = C5363f.focusHelperPinScrollWindow;
        if (!Intrinsics.areEqual((Object) this.f8607g.mo12623d(), (Object) "brand") && !Intrinsics.areEqual((Object) this.f8607g.mo12623d(), (Object) "featured") && !z2) {
            z = false;
        }
        view.setTag(i2, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo12564a(C11867b bVar) {
        C3626b bVar2 = this.f8605e;
        if (bVar2 != null) {
            m11659a((View) (ImageView) bVar.mo20994a().findViewById(C5363f.brandTileBackground), (PlayerView) bVar.mo20994a().findViewById(C5363f.player_view));
            C3317e eVar = this.f8602b;
            if (eVar != null) {
                eVar.mo12322c();
            }
            C3288c cVar = this.f8604d;
            if (cVar != null) {
                cVar.mo12316c(this.f8605e);
            }
            this.f8603c.mo12549a(this.f8606f, bVar2);
        }
    }
}
