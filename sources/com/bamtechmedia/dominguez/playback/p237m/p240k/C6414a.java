package com.bamtechmedia.dominguez.playback.p237m.p240k;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0425d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.C0532d;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.playback.C6325d;
import com.bamtechmedia.dominguez.playback.C6327f;
import kotlin.C12907r;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/controls/TopBarPresenter;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "resources", "Landroid/content/res/Resources;", "stringDictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "(Landroidx/fragment/app/FragmentActivity;Landroid/content/res/Resources;Lcom/bamtechmedia/dominguez/config/StringDictionary;)V", "addBottomPadding", "", "containerView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "pixels", "", "setTvPrimaryTitleTopOffset", "isMovie", "", "elements", "Lcom/bamtechmedia/dominguez/playback/common/controls/TopBarPresenter$TopBarElements;", "setupTopBar", "playable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "TopBarElements", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.k.a */
/* compiled from: TopBarPresenter.kt */
public final class C6414a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0532d f14549a;

    /* renamed from: b */
    private final Resources f14550b;

    /* renamed from: c */
    private final C3572r0 f14551c;

    /* renamed from: com.bamtechmedia.dominguez.playback.m.k.a$a */
    /* compiled from: TopBarPresenter.kt */
    public static final class C6415a {

        /* renamed from: a */
        private final ConstraintLayout f14552a;

        /* renamed from: b */
        private final TextView f14553b;

        /* renamed from: c */
        private final TextView f14554c;

        /* renamed from: d */
        private final Group f14555d;

        /* renamed from: e */
        private final ConstraintLayout f14556e;

        public C6415a(ConstraintLayout constraintLayout, TextView textView, TextView textView2, Group group, ConstraintLayout constraintLayout2) {
            this.f14552a = constraintLayout;
            this.f14553b = textView;
            this.f14554c = textView2;
            this.f14555d = group;
            this.f14556e = constraintLayout2;
        }

        /* renamed from: a */
        public final TextView mo19062a() {
            return this.f14553b;
        }

        /* renamed from: b */
        public final TextView mo19063b() {
            return this.f14554c;
        }

        /* renamed from: c */
        public final ConstraintLayout mo19064c() {
            return this.f14552a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f14556e, (java.lang.Object) r3.f14556e) != false) goto L_0x003d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x003d
                boolean r0 = r3 instanceof com.bamtechmedia.dominguez.playback.p237m.p240k.C6414a.C6415a
                if (r0 == 0) goto L_0x003b
                com.bamtechmedia.dominguez.playback.m.k.a$a r3 = (com.bamtechmedia.dominguez.playback.p237m.p240k.C6414a.C6415a) r3
                androidx.constraintlayout.widget.ConstraintLayout r0 = r2.f14552a
                androidx.constraintlayout.widget.ConstraintLayout r1 = r3.f14552a
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x003b
                android.widget.TextView r0 = r2.f14553b
                android.widget.TextView r1 = r3.f14553b
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x003b
                android.widget.TextView r0 = r2.f14554c
                android.widget.TextView r1 = r3.f14554c
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x003b
                androidx.constraintlayout.widget.Group r0 = r2.f14555d
                androidx.constraintlayout.widget.Group r1 = r3.f14555d
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x003b
                androidx.constraintlayout.widget.ConstraintLayout r0 = r2.f14556e
                androidx.constraintlayout.widget.ConstraintLayout r3 = r3.f14556e
                boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
                if (r3 == 0) goto L_0x003b
                goto L_0x003d
            L_0x003b:
                r3 = 0
                return r3
            L_0x003d:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.p240k.C6414a.C6415a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            ConstraintLayout constraintLayout = this.f14552a;
            int i = 0;
            int hashCode = (constraintLayout != null ? constraintLayout.hashCode() : 0) * 31;
            TextView textView = this.f14553b;
            int hashCode2 = (hashCode + (textView != null ? textView.hashCode() : 0)) * 31;
            TextView textView2 = this.f14554c;
            int hashCode3 = (hashCode2 + (textView2 != null ? textView2.hashCode() : 0)) * 31;
            Group group = this.f14555d;
            int hashCode4 = (hashCode3 + (group != null ? group.hashCode() : 0)) * 31;
            ConstraintLayout constraintLayout2 = this.f14556e;
            if (constraintLayout2 != null) {
                i = constraintLayout2.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TopBarElements(topBarContainer=");
            sb.append(this.f14552a);
            sb.append(", parentTitle=");
            sb.append(this.f14553b);
            sb.append(", seriesTitle=");
            sb.append(this.f14554c);
            sb.append(", upNextGroup=");
            sb.append(this.f14555d);
            sb.append(", motionLayout=");
            sb.append(this.f14556e);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C6415a(ConstraintLayout constraintLayout, TextView textView, TextView textView2, Group group, ConstraintLayout constraintLayout2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(constraintLayout, textView, textView2, (i & 8) != 0 ? null : group, (i & 16) != 0 ? null : constraintLayout2);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.k.a$b */
    /* compiled from: TopBarPresenter.kt */
    static final class C6416b implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C6414a f14557c;

        C6416b(C6414a aVar) {
            this.f14557c = aVar;
        }

        public final void onClick(View view) {
            this.f14557c.f14549a.finish();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.k.a$c */
    /* compiled from: TopBarPresenter.kt */
    static final class C6417c implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C6414a f14558c;

        C6417c(C6414a aVar) {
            this.f14558c = aVar;
        }

        public final void onClick(View view) {
            this.f14558c.f14549a.finish();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.k.a$d */
    /* compiled from: TopBarPresenter.kt */
    static final class C6418d implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C6414a f14559c;

        C6418d(C6414a aVar) {
            this.f14559c = aVar;
        }

        public final void onClick(View view) {
            this.f14559c.f14549a.finish();
        }
    }

    public C6414a(C0532d dVar, Resources resources, C3572r0 r0Var) {
        this.f14549a = dVar;
        this.f14550b = resources;
        this.f14551c = r0Var;
    }

    /* renamed from: a */
    public final void mo19061a(C3693o oVar, C6415a aVar) {
        if (oVar instanceof C3685g) {
            aVar.mo19063b().setVisibility(0);
            C3685g gVar = (C3685g) oVar;
            String str = "season_episode_title_placeholder";
            aVar.mo19062a().setText(this.f14551c.mo12773a(str, C13173j0.m40356a(C12907r.m40244a("S", Integer.valueOf(gVar.mo12876F())), C12907r.m40244a("E", Integer.valueOf(gVar.mo12878I())), C12907r.m40244a("TITLE", oVar.getTitle()))));
            aVar.mo19063b().setText(gVar.mo12877G());
            mo19060a(aVar.mo19064c(), this.f14550b.getDimensionPixelSize(C6325d.top_bar_bottom_padding_episode));
            if (C5837i.m18843e(this.f14549a)) {
                m20068a(false, aVar);
                return;
            }
            aVar.mo19062a().setOnClickListener(new C6416b(this));
            aVar.mo19063b().setOnClickListener(new C6417c(this));
            return;
        }
        aVar.mo19063b().setVisibility(8);
        aVar.mo19062a().setText(oVar.getTitle());
        if (C5837i.m18843e(this.f14549a)) {
            m20068a(true, aVar);
            return;
        }
        aVar.mo19062a().setOnClickListener(new C6418d(this));
        aVar.mo19063b().setOnClickListener(null);
    }

    /* renamed from: a */
    private final void m20068a(boolean z, C6415a aVar) {
        C0425d dVar = new C0425d();
        dVar.mo2430c(aVar.mo19064c());
        dVar.mo2411a(aVar.mo19062a().getId(), 3);
        if (z) {
            dVar.mo2413a(aVar.mo19062a().getId(), 3, C6327f.guideline_text_top_movie, 4);
        } else {
            dVar.mo2413a(aVar.mo19062a().getId(), 3, C6327f.guideline_text_top_series, 4);
        }
        dVar.mo2427b(aVar.mo19064c());
    }

    /* renamed from: a */
    public final void mo19060a(ConstraintLayout constraintLayout, int i) {
        constraintLayout.setPadding(0, 0, 0, i);
    }
}
