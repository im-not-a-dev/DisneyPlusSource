package com.bamtechmedia.dominguez.playback.p254tv.p257e;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.TextView;
import androidx.core.widget.C0513i;
import androidx.fragment.app.C0538i;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0797g;
import com.bamtechmedia.dominguez.collections.C3432o;
import com.bamtechmedia.dominguez.core.utils.RecyclerViewExtKt;
import com.bamtechmedia.dominguez.playback.C6270c;
import com.bamtechmedia.dominguez.playback.C6327f;
import com.bamtechmedia.dominguez.playback.C6329h;
import com.bamtechmedia.dominguez.playback.C6331j;
import com.bamtechmedia.dominguez.playback.common.tracks.C6312a;
import java.util.HashMap;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p096e.p121h.p122j.C4025a;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0002J\u001a\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0002J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0014\u0010\u001e\u001a\u00020\u0006*\u00020\u001f2\u0006\u0010 \u001a\u00020\u001dH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/tv/tracks/TvPlaybackAudioAndSubtitlesFragment;", "Lcom/bamtechmedia/dominguez/playback/common/tracks/PlaybackAudioAndSubtitlesFragment;", "()V", "audioAndSubtitlesDisposable", "Lio/reactivex/disposables/Disposable;", "cancelDialogTimer", "", "getLayoutResource", "", "getTheme", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onPause", "onSubtitleOrAudioTrackSelected", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setTabListeners", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "tag", "", "startTimerToHide", "updateTabs", "isSubtitle", "", "setTabsTextAppearance", "Landroid/widget/TextView;", "hasFocus", "Companion", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.tv.e.b */
/* compiled from: TvPlaybackAudioAndSubtitlesFragment.kt */
public final class C6561b extends C6312a {

    /* renamed from: a0 */
    private Disposable f14820a0;

    /* renamed from: b0 */
    private HashMap f14821b0;

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.e.b$a */
    /* compiled from: TvPlaybackAudioAndSubtitlesFragment.kt */
    private static final class C6562a {
        private C6562a() {
        }

        public /* synthetic */ C6562a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.e.b$b */
    /* compiled from: TvPlaybackAudioAndSubtitlesFragment.kt */
    static final class C6563b implements OnKeyListener {

        /* renamed from: U */
        final /* synthetic */ View f14822U;

        /* renamed from: c */
        final /* synthetic */ C6561b f14823c;

        C6563b(C6561b bVar, View view) {
            this.f14823c = bVar;
            this.f14822U = view;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            int i2;
            C6561b bVar;
            View findFocus = this.f14822U.findFocus();
            boolean z = false;
            if (i == 19) {
                if ((findFocus != null ? findFocus.getParent() : null) instanceof RecyclerView) {
                    View _$_findCachedViewById = this.f14823c._$_findCachedViewById(C6327f.subtitleIndicator);
                    Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, "subtitleIndicator");
                    if (_$_findCachedViewById.getVisibility() == 0) {
                        z = true;
                    }
                    if (z) {
                        bVar = this.f14823c;
                        i2 = C6327f.subtitleTabText;
                    } else {
                        bVar = this.f14823c;
                        i2 = C6327f.audioTabText;
                    }
                    ((TextView) bVar._$_findCachedViewById(i2)).requestFocus();
                    return true;
                } else if (findFocus != null) {
                    return C3432o.m11717a(this.f14823c.mo18932p(), i, this.f14822U, false, 4, null);
                }
            }
            return false;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.e.b$c */
    /* compiled from: TvPlaybackAudioAndSubtitlesFragment.kt */
    static final class C6564c implements OnFocusChangeListener {

        /* renamed from: U */
        final /* synthetic */ int f14824U;

        /* renamed from: V */
        final /* synthetic */ int f14825V;

        /* renamed from: c */
        final /* synthetic */ C6561b f14826c;

        C6564c(C6561b bVar, int i, int i2) {
            this.f14826c = bVar;
            this.f14824U = i;
            this.f14825V = i2;
        }

        public final void onFocusChange(View view, boolean z) {
            TextView textView = (TextView) this.f14826c._$_findCachedViewById(C6327f.subtitleTabText);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView, "subtitleTabText");
            textView.setSelected(z);
            if (z) {
                this.f14826c.m20426b(true);
            }
            ((TextView) this.f14826c._$_findCachedViewById(C6327f.subtitleTabText)).setTextColor(z ? this.f14824U : this.f14825V);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.e.b$d */
    /* compiled from: TvPlaybackAudioAndSubtitlesFragment.kt */
    static final class C6565d implements OnFocusChangeListener {

        /* renamed from: U */
        final /* synthetic */ int f14827U;

        /* renamed from: V */
        final /* synthetic */ int f14828V;

        /* renamed from: c */
        final /* synthetic */ C6561b f14829c;

        C6565d(C6561b bVar, int i, int i2) {
            this.f14829c = bVar;
            this.f14827U = i;
            this.f14828V = i2;
        }

        public final void onFocusChange(View view, boolean z) {
            this.f14829c.m20429v();
            TextView textView = (TextView) this.f14829c._$_findCachedViewById(C6327f.audioTabText);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView, "audioTabText");
            textView.setSelected(z);
            if (z) {
                this.f14829c.m20426b(false);
            }
            ((TextView) this.f14829c._$_findCachedViewById(C6327f.audioTabText)).setTextColor(z ? this.f14827U : this.f14828V);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.e.b$e */
    /* compiled from: TvPlaybackAudioAndSubtitlesFragment.kt */
    static final class C6566e<T> implements Consumer<Long> {

        /* renamed from: c */
        final /* synthetic */ C6561b f14830c;

        C6566e(C6561b bVar) {
            this.f14830c = bVar;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            this.f14830c.dismiss();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.e.b$f */
    /* compiled from: TvPlaybackAudioAndSubtitlesFragment.kt */
    static final /* synthetic */ class C6567f extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6567f f14831c = new C6567f();

        C6567f() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19219a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19219a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C6562a(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m20426b(boolean z) {
        if (!isRemoving()) {
            View _$_findCachedViewById = _$_findCachedViewById(C6327f.subtitleIndicator);
            Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, "subtitleIndicator");
            int i = 0;
            _$_findCachedViewById.setVisibility(z ? 0 : 8);
            TextView textView = (TextView) _$_findCachedViewById(C6327f.subtitleTabText);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView, "subtitleTabText");
            m20423a(textView, z);
            View _$_findCachedViewById2 = _$_findCachedViewById(C6327f.audioIndicator);
            Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById2, "audioIndicator");
            if (!(!z)) {
                i = 8;
            }
            _$_findCachedViewById2.setVisibility(i);
            TextView textView2 = (TextView) _$_findCachedViewById(C6327f.audioTabText);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView2, "audioTabText");
            m20423a(textView2, !z);
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C6327f.subTitleAudioTvRecyclerView);
            if (recyclerView != null) {
                recyclerView.mo4380a((C0797g) z ? mo18935s() : mo18931o(), true);
            }
        }
    }

    /* renamed from: t */
    private final void m20427t() {
        Disposable disposable = this.f14820a0;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: u */
    private final void m20428u() {
        int a = C4025a.m13788a(requireContext(), C6270c.vader_black);
        int a2 = C4025a.m13788a(requireContext(), C6270c.vader_white);
        ((TextView) _$_findCachedViewById(C6327f.subtitleTabText)).setOnFocusChangeListener(new C6564c(this, a, a2));
        ((TextView) _$_findCachedViewById(C6327f.audioTabText)).setOnFocusChangeListener(new C6565d(this, a, a2));
        ((TextView) _$_findCachedViewById(C6327f.subtitleTabText)).requestFocus();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.bamtechmedia.dominguez.playback.tv.e.b$f, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.bamtechmedia.dominguez.playback.tv.e.c] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m20429v() {
        /*
            r4 = this;
            r4.m20427t()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 5
            io.reactivex.Observable r0 = p520io.reactivex.Observable.m38310c(r1, r0)
            com.bamtechmedia.dominguez.playback.tv.e.b$e r1 = new com.bamtechmedia.dominguez.playback.tv.e.b$e
            r1.<init>(r4)
            com.bamtechmedia.dominguez.playback.tv.e.b$f r2 = com.bamtechmedia.dominguez.playback.p254tv.p257e.C6561b.C6567f.f14831c
            if (r2 == 0) goto L_0x001a
            com.bamtechmedia.dominguez.playback.tv.e.c r3 = new com.bamtechmedia.dominguez.playback.tv.e.c
            r3.<init>(r2)
            r2 = r3
        L_0x001a:
            io.reactivex.functions.Consumer r2 = (p520io.reactivex.functions.Consumer) r2
            io.reactivex.disposables.Disposable r0 = r0.mo30157a(r1, r2)
            r4.f14820a0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p254tv.p257e.C6561b.m20429v():void");
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f14821b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f14821b0 == null) {
            this.f14821b0 = new HashMap();
        }
        View view = (View) this.f14821b0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f14821b0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public int getTheme() {
        return C6331j.FullScreenDialogOverlay_TvDialogOverlay;
    }

    /* renamed from: m */
    public void mo18946m() {
        m20429v();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        m20427t();
        super.onDismiss(dialogInterface);
    }

    public void onPause() {
        super.onPause();
        m20427t();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C6327f.subTitleAudioTvRecyclerView);
        if (recyclerView != null) {
            RecyclerViewExtKt.m18800a(this, recyclerView, mo18935s());
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C6327f.subTitleAudioTvRecyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView2, "subTitleAudioTvRecyclerView");
        recyclerView2.setItemAnimator(new C6559a());
        requireDialog().setOnKeyListener(new C6563b(this, view));
        m20428u();
    }

    /* renamed from: q */
    public int mo18933q() {
        return C6329h.fragment_playback_audio_and_subtitles_tv;
    }

    public void show(C0538i iVar, String str) {
        super.show(iVar, str);
        m20429v();
    }

    /* renamed from: a */
    private final void m20423a(TextView textView, boolean z) {
        int i;
        if (z) {
            i = C6331j.Disney_TextAppearance_ButtonFocused;
        } else {
            i = C6331j.Disney_TextAppearance_ButtonUnfocused;
        }
        C0513i.m2778d(textView, i);
    }
}
