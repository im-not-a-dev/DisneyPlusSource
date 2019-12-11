package com.bamtechmedia.dominguez.playback.common.tracks;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0425d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.C0513i;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.playback.C6325d;
import com.bamtechmedia.dominguez.playback.C6327f;
import com.bamtechmedia.dominguez.playback.C6329h;
import com.bamtechmedia.dominguez.playback.C6330i;
import com.bamtechmedia.dominguez.playback.C6331j;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p174d.p178b.p193j0.C5285a;
import p163g.p174d.p178b.p193j0.C5286b;
import p163g.p174d.p178b.p193j0.C5288c;
import p163g.p174d.p178b.p193j0.C5290d;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.C11863k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001/B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\u0016J\b\u0010\u001f\u001a\u00020\u000bH\u0016J&\u0010 \u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u0016\u0010!\u001a\u00020\u000e2\f\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\u0016J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0002H\u0002J\u0012\u0010$\u001a\u00020\u00172\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0018\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000bH\u0002J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0002J\u001d\u0010,\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u000eH\u0001¢\u0006\u0002\b.R\u0014\u0010\r\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u00060"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/tracks/SelectablePlaybackTrackItem;", "Lcom/xwray/groupie/Item;", "Lcom/xwray/groupie/ViewHolder;", "Landroid/view/View$OnClickListener;", "track", "Lcom/bamtech/player/tracks/Track;", "profileUpdateListener", "Lcom/bamtechmedia/dominguez/playback/common/tracks/ProfileUpdateListener;", "trackUpdateListener", "Lcom/bamtechmedia/dominguez/playback/common/tracks/TrackUpdateListener;", "nextAccessibilityTraversalId", "", "(Lcom/bamtech/player/tracks/Track;Lcom/bamtechmedia/dominguez/playback/common/tracks/ProfileUpdateListener;Lcom/bamtechmedia/dominguez/playback/common/tracks/TrackUpdateListener;I)V", "isSelected", "", "()Z", "isSubtitleTrack", "name", "", "getName", "()Ljava/lang/String;", "wasSelected", "bind", "", "viewHolder", "position", "payloads", "", "", "getChangePayload", "newItem", "getLayout", "incrementalTvBind", "isSameAs", "oldItem", "itemHasFocus", "onClick", "v", "Landroid/view/View;", "setCheckmarkStartMargin", "trackTvLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "newPixelMargin", "setTelevisionFocusChangeListeners", "setTextAppearance", "hasFocus", "setTextAppearance$playback_release", "ChangePayload", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.e */
/* compiled from: SelectablePlaybackTrackItem.kt */
public final class C6317e extends C11853e<C11863k> implements OnClickListener {

    /* renamed from: U */
    private C5290d f14403U;

    /* renamed from: V */
    private final C6316d f14404V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final C6324g f14405W;

    /* renamed from: X */
    private final int f14406X;

    /* renamed from: c */
    private boolean f14407c;

    /* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.e$a */
    /* compiled from: SelectablePlaybackTrackItem.kt */
    public static final class C6318a {

        /* renamed from: a */
        private final C5290d f14408a;

        /* renamed from: b */
        private final boolean f14409b;

        /* renamed from: c */
        private final boolean f14410c;

        public C6318a(C5290d dVar, boolean z, boolean z2) {
            this.f14408a = dVar;
            this.f14409b = z;
            this.f14410c = z2;
        }

        /* renamed from: a */
        public final boolean mo18940a() {
            return this.f14410c;
        }

        /* renamed from: b */
        public final C5290d mo18941b() {
            return this.f14408a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C6318a) {
                    C6318a aVar = (C6318a) obj;
                    if (Intrinsics.areEqual((Object) this.f14408a, (Object) aVar.f14408a)) {
                        if (this.f14409b == aVar.f14409b) {
                            if (this.f14410c == aVar.f14410c) {
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
            C5290d dVar = this.f14408a;
            int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
            boolean z = this.f14409b;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z2 = this.f14410c;
            if (z2) {
                z2 = true;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChangePayload(track=");
            sb.append(this.f14408a);
            sb.append(", labelChanged=");
            sb.append(this.f14409b);
            sb.append(", selectionChanged=");
            sb.append(this.f14410c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.e$b */
    /* compiled from: SelectablePlaybackTrackItem.kt */
    static final class C6319b implements OnFocusChangeListener {

        /* renamed from: U */
        final /* synthetic */ C11863k f14411U;

        /* renamed from: c */
        final /* synthetic */ C6317e f14412c;

        C6319b(C6317e eVar, C11863k kVar) {
            this.f14412c = eVar;
            this.f14411U = kVar;
        }

        public final void onFocusChange(View view, boolean z) {
            this.f14412c.mo18938a(this.f14411U, z);
            if (z) {
                this.f14412c.f14405W.mo18946m();
            }
        }
    }

    public C6317e(C5290d dVar, C6316d dVar2, C6324g gVar, int i) {
        this.f14403U = dVar;
        this.f14404V = dVar2;
        this.f14405W = gVar;
        this.f14406X = i;
        boolean z = this.f14403U instanceof C5288c;
    }

    /* renamed from: b */
    private final boolean m19893b() {
        return this.f14403U.mo16858e();
    }

    public void bind(C11863k kVar, int i) {
    }

    public void bind(C11863k kVar, int i, List<? extends Object> list) {
        View view = kVar.itemView;
        String str = "viewHolder.itemView";
        Intrinsics.checkReturnedValueIsNotNull((Object) view, str);
        Context context = view.getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context, "viewHolder.itemView.context");
        boolean e = C5837i.m18843e(context);
        if (!list.isEmpty()) {
            Object obj = list.get(0);
            if (obj != null) {
                this.f14403U = ((C6318a) obj).mo18941b();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bamtechmedia.dominguez.playback.common.tracks.SelectablePlaybackTrackItem.ChangePayload");
            }
        } else {
            View view2 = kVar.itemView;
            Intrinsics.checkReturnedValueIsNotNull((Object) view2, str);
            TextView textView = (TextView) view2.findViewById(C6327f.rowTitleText);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView, "viewHolder.itemView.rowTitleText");
            textView.setText(mo18937a());
        }
        View view3 = kVar.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view3, str);
        C5852n0.m18888b(view3, this.f14406X);
        View view4 = kVar.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view4, str);
        ImageView imageView = (ImageView) view4.findViewById(C6327f.checkBoxImageView);
        Intrinsics.checkReturnedValueIsNotNull((Object) imageView, "viewHolder.itemView.checkBoxImageView");
        imageView.setSelected(m19893b());
        kVar.mo30014c().setOnClickListener(this);
        if (e) {
            m19890a(kVar, list, i);
        } else {
            mo18938a(kVar, false);
        }
        this.f14407c = m19893b();
    }

    public Object getChangePayload(C11853e<?> eVar) {
        if (eVar != null) {
            C6317e eVar2 = (C6317e) eVar;
            C5290d dVar = eVar2.f14403U;
            boolean z = true;
            boolean z2 = !Intrinsics.areEqual((Object) dVar.mo16867a(), (Object) this.f14403U.mo16867a());
            if (eVar2.m19893b() == this.f14407c) {
                z = false;
            }
            return new C6318a(dVar, z2, z);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bamtechmedia.dominguez.playback.common.tracks.SelectablePlaybackTrackItem");
    }

    public int getLayout() {
        return C6329h.playback_track_item;
    }

    public boolean isSameAs(C11853e<?> eVar) {
        if (eVar != null) {
            return Intrinsics.areEqual((Object) ((C6317e) eVar).f14403U.mo16867a(), (Object) this.f14403U.mo16867a());
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bamtechmedia.dominguez.playback.common.tracks.SelectablePlaybackTrackItem");
    }

    public void onClick(View view) {
        this.f14403U.mo16859f();
        C5290d dVar = this.f14403U;
        if (dVar instanceof C5285a) {
            this.f14404V.mo18912a((C5285a) dVar);
        } else if (dVar instanceof C5288c) {
            this.f14404V.mo18913a((C5288c) dVar);
        }
    }

    /* renamed from: a */
    private final boolean m19891a(C11863k kVar) {
        View view = kVar.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view, "viewHolder.itemView");
        return ((ConstraintLayout) view.findViewById(C6327f.playTrackTvConstraintLayout)).hasFocus();
    }

    /* renamed from: b */
    private final void m19892b(C11863k kVar) {
        View view = kVar.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view, "viewHolder.itemView");
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(C6327f.playTrackTvConstraintLayout);
        if (constraintLayout != null) {
            constraintLayout.setOnFocusChangeListener(new C6319b(this, kVar));
        }
    }

    /* renamed from: a */
    public final void mo18938a(C11863k kVar, boolean z) {
        int i;
        View view = kVar.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view, "viewHolder.itemView");
        TextView textView = (TextView) view.findViewById(C6327f.rowTitleText);
        if (z && m19893b()) {
            i = C6331j.Disney_TextAppearance_TrackItem_SelectedFocused;
        } else if (z) {
            i = C6331j.Disney_TextAppearance_TrackItem_Focused;
        } else if (m19893b()) {
            i = C6331j.Disney_TextAppearance_TrackItem_Selected;
        } else {
            i = C6331j.Disney_TextAppearance_TrackItem;
        }
        C0513i.m2778d(textView, i);
    }

    /* renamed from: a */
    public final String mo18937a() {
        C5290d dVar = this.f14403U;
        if (dVar instanceof C5286b) {
            return C5880u.m18936a(C6330i.subtitles_media_player);
        }
        if ((dVar instanceof C5285a) || (dVar instanceof C5288c)) {
            return this.f14403U.mo16867a();
        }
        throw new IllegalArgumentException("wrong track type submitted");
    }

    /* renamed from: a */
    private final void m19889a(ConstraintLayout constraintLayout, int i) {
        C0425d dVar = new C0425d();
        dVar.mo2430c(constraintLayout);
        dVar.mo2411a(C6327f.checkBoxImageView, 6);
        dVar.mo2414a(C6327f.checkBoxImageView, 6, 0, 6, i);
        dVar.mo2427b(constraintLayout);
    }

    /* renamed from: a */
    private final void m19890a(C11863k kVar, List<? extends Object> list, int i) {
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null) {
                    if (((C6318a) next).mo18940a()) {
                        z = true;
                        break;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bamtechmedia.dominguez.playback.common.tracks.SelectablePlaybackTrackItem.ChangePayload");
                }
            }
        }
        boolean isEmpty = list.isEmpty();
        View view = kVar.itemView;
        String str = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout";
        if (view != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            if (z) {
                mo18938a(kVar, m19891a(kVar));
                return;
            }
            String str2 = "trackTvLayout.context";
            if (isEmpty) {
                mo18938a(kVar, m19891a(kVar));
                m19892b(kVar);
                if (m19893b() && i != 0) {
                    View view2 = kVar.itemView;
                    if (view2 != null) {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view2;
                        Context context = constraintLayout.getContext();
                        Intrinsics.checkReturnedValueIsNotNull((Object) context, str2);
                        m19889a(constraintLayout2, context.getResources().getDimensionPixelSize(C6325d.checkmark_visible_left_margin));
                        return;
                    }
                    throw new TypeCastException(str);
                }
            } else if (view != null) {
                ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                Context context2 = constraintLayout.getContext();
                Intrinsics.checkReturnedValueIsNotNull((Object) context2, str2);
                m19889a(constraintLayout3, context2.getResources().getDimensionPixelSize(C6325d.checkmark_invisible_left_margin));
            } else {
                throw new TypeCastException(str);
            }
        } else {
            throw new TypeCastException(str);
        }
    }
}
