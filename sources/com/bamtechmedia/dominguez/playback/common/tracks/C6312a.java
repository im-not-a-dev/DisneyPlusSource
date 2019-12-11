package com.bamtechmedia.dominguez.playback.common.tracks;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import androidx.fragment.app.C0532d;
import androidx.lifecycle.C0715i;
import com.bamtechmedia.dominguez.collections.C3432o;
import com.bamtechmedia.dominguez.playback.C6331j;
import java.util.Collection;
import java.util.List;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p509o.p510a.C11847b;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;
import p512h.p513c.p514k.C11885d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010#\u001a\u00020$H&J\b\u0010%\u001a\u00020&H\u0002J\u0012\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0016\u0010*\u001a\u00020&2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0016J&\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u00104\u001a\u00020&2\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020&H\u0016J\u0016\u00108\u001a\u00020&2\f\u00109\u001a\b\u0012\u0004\u0012\u00020-0,H\u0016J\u001a\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020/2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\b¨\u0006<"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/tracks/PlaybackAudioAndSubtitlesFragment;", "Ldagger/android/support/DaggerAppCompatDialogFragment;", "Lcom/bamtechmedia/dominguez/playback/common/tracks/TrackUpdateListener;", "()V", "audioAdapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "getAudioAdapter", "()Lcom/xwray/groupie/GroupAdapter;", "dismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "getDismissListener", "()Landroid/content/DialogInterface$OnDismissListener;", "setDismissListener", "(Landroid/content/DialogInterface$OnDismissListener;)V", "focusHelper", "Lcom/bamtechmedia/dominguez/collections/CollectionViewFocusHelper;", "getFocusHelper", "()Lcom/bamtechmedia/dominguez/collections/CollectionViewFocusHelper;", "setFocusHelper", "(Lcom/bamtechmedia/dominguez/collections/CollectionViewFocusHelper;)V", "presenter", "Lcom/bamtechmedia/dominguez/playback/common/tracks/PlaybackAudioAndSubtitlesPresenter;", "getPresenter", "()Lcom/bamtechmedia/dominguez/playback/common/tracks/PlaybackAudioAndSubtitlesPresenter;", "setPresenter", "(Lcom/bamtechmedia/dominguez/playback/common/tracks/PlaybackAudioAndSubtitlesPresenter;)V", "showListener", "Landroid/content/DialogInterface$OnShowListener;", "getShowListener", "()Landroid/content/DialogInterface$OnShowListener;", "setShowListener", "(Landroid/content/DialogInterface$OnShowListener;)V", "subtitlesAdapter", "getSubtitlesAdapter", "getLayoutResource", "", "maintainPlayersImmersiveMode", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAudioTracksUpdated", "audioItems", "", "Lcom/bamtechmedia/dominguez/playback/common/tracks/SelectablePlaybackTrackItem;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onSubtitleOrAudioTrackSelected", "onSubtitleTracksUpdated", "subtitleItems", "onViewCreated", "view", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.a */
/* compiled from: PlaybackAudioAndSubtitlesFragment.kt */
public abstract class C6312a extends C11885d implements C6324g {

    /* renamed from: U */
    public PlaybackAudioAndSubtitlesPresenter f14394U;

    /* renamed from: V */
    private final C11848c<C11863k> f14395V = new C11848c<>();

    /* renamed from: W */
    private final C11848c<C11863k> f14396W = new C11848c<>();

    /* renamed from: X */
    public OnDismissListener f14397X;

    /* renamed from: Y */
    public OnShowListener f14398Y;

    /* renamed from: Z */
    public C3432o f14399Z;

    /* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.a$a */
    /* compiled from: PlaybackAudioAndSubtitlesFragment.kt */
    static final class C6313a implements OnShowListener {

        /* renamed from: U */
        final /* synthetic */ C6312a f14400U;

        /* renamed from: c */
        final /* synthetic */ Window f14401c;

        C6313a(Window window, C6312a aVar) {
            this.f14401c = window;
            this.f14400U = aVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            this.f14401c.clearFlags(8);
            C0532d activity = this.f14400U.getActivity();
            Object systemService = activity != null ? activity.getSystemService("window") : null;
            if (systemService != null) {
                WindowManager windowManager = (WindowManager) systemService;
                Dialog requireDialog = this.f14400U.requireDialog();
                String str = "requireDialog()";
                Intrinsics.checkReturnedValueIsNotNull((Object) requireDialog, str);
                Window window = requireDialog.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    Dialog requireDialog2 = this.f14400U.requireDialog();
                    Intrinsics.checkReturnedValueIsNotNull((Object) requireDialog2, str);
                    Window window2 = requireDialog2.getWindow();
                    if (window2 != null) {
                        windowManager.updateViewLayout(decorView, window2.getAttributes());
                        this.f14400U.mo18934r().onShow(this.f14400U.getDialog());
                        return;
                    }
                    Intrinsics.throwNpe();
                    throw null;
                }
                Intrinsics.throwNpe();
                throw null;
            }
            throw new C13142s("null cannot be cast to non-null type android.view.WindowManager");
        }
    }

    /* renamed from: t */
    private final void m19874t() {
        Dialog requireDialog = requireDialog();
        Intrinsics.checkReturnedValueIsNotNull((Object) requireDialog, "requireDialog()");
        Window window = requireDialog.getWindow();
        if (window != null) {
            window.setFlags(8, 8);
            View decorView = window.getDecorView();
            Intrinsics.checkReturnedValueIsNotNull((Object) decorView, "decorView");
            C0532d activity = getActivity();
            if (activity != null) {
                Intrinsics.checkReturnedValueIsNotNull((Object) activity, "activity!!");
                Window window2 = activity.getWindow();
                Intrinsics.checkReturnedValueIsNotNull((Object) window2, "activity!!.window");
                View decorView2 = window2.getDecorView();
                Intrinsics.checkReturnedValueIsNotNull((Object) decorView2, "activity!!.window.decorView");
                decorView.setSystemUiVisibility(decorView2.getSystemUiVisibility());
                requireDialog().setOnShowListener(new C6313a(window, this));
                return;
            }
            Intrinsics.throwNpe();
            throw null;
        }
    }

    public abstract void _$_clearFindViewByIdCache();

    /* renamed from: a */
    public void mo18929a(List<C6317e> list) {
        this.f14396W.mo29963a((Collection<? extends C11847b>) list);
    }

    /* renamed from: b */
    public void mo18930b(List<C6317e> list) {
        this.f14395V.mo29963a((Collection<? extends C11847b>) list);
    }

    /* renamed from: o */
    public final C11848c<C11863k> mo18931o() {
        return this.f14396W;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog requireDialog = requireDialog();
        Intrinsics.checkReturnedValueIsNotNull((Object) requireDialog, "requireDialog()");
        Window window = requireDialog.getWindow();
        if (window != null) {
            LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.windowAnimations = C6331j.AudioSubtitleOverlayAnimation;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m19874t();
        return layoutInflater.inflate(mo18933q(), viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        OnDismissListener onDismissListener = this.f14397X;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("dismissListener");
            throw null;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0715i lifecycle = getLifecycle();
        PlaybackAudioAndSubtitlesPresenter playbackAudioAndSubtitlesPresenter = this.f14394U;
        if (playbackAudioAndSubtitlesPresenter != null) {
            lifecycle.mo4134a(playbackAudioAndSubtitlesPresenter);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            throw null;
        }
    }

    /* renamed from: p */
    public final C3432o mo18932p() {
        C3432o oVar = this.f14399Z;
        if (oVar != null) {
            return oVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("focusHelper");
        throw null;
    }

    /* renamed from: q */
    public abstract int mo18933q();

    /* renamed from: r */
    public final OnShowListener mo18934r() {
        OnShowListener onShowListener = this.f14398Y;
        if (onShowListener != null) {
            return onShowListener;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showListener");
        throw null;
    }

    /* renamed from: s */
    public final C11848c<C11863k> mo18935s() {
        return this.f14395V;
    }
}
