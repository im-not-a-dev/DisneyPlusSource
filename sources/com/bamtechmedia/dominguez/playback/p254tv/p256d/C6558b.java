package com.bamtechmedia.dominguez.playback.p254tv.p256d;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.bamtech.player.exo.ExoSurfaceView;
import com.bamtechmedia.dominguez.playback.C6327f;
import java.util.List;
import kotlin.jvm.internal.C12880j;
import p163g.p174d.p178b.C5273h;
import p163g.p174d.p178b.p200z.C5342b.C5343a;
import p163g.p174d.p178b.p200z.C5347c.C5348a;

/* renamed from: com.bamtechmedia.dominguez.playback.tv.d.b */
/* compiled from: TvPlaybackPlayerView.kt */
public final class C6558b extends C5273h {

    /* renamed from: a */
    private final Activity f14818a;

    public C6558b(Activity activity) {
        this.f14818a = activity;
    }

    /* renamed from: A */
    public View mo16795A() {
        return (ProgressBar) this.f14818a.findViewById(C6327f.progressBar);
    }

    /* renamed from: B */
    public TextView mo16796B() {
        return (TextView) this.f14818a.findViewById(C6327f.remainingTimeTextView);
    }

    /* renamed from: D */
    public View mo16798D() {
        return (Group) this.f14818a.findViewById(C6327f.playerControls);
    }

    /* renamed from: F */
    public View mo16800F() {
        return (ImageView) this.f14818a.findViewById(C6327f.jumpForwardButton);
    }

    /* renamed from: H */
    public List<View> mo16802H() {
        return C13183n.m40498a((TextView) this.f14818a.findViewById(C6327f.remainingTimeTextView));
    }

    /* renamed from: J */
    public TextView mo16804J() {
        return (TextView) this.f14818a.findViewById(C6327f.currentTimeTextView);
    }

    /* renamed from: K */
    public View mo16805K() {
        return (TextView) this.f14818a.findViewById(C6327f.skipRecap);
    }

    /* renamed from: L */
    public final List<View> mo19211L() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f14818a.findViewById(C6327f.bottomBarContainer);
        C12880j.m40222a((Object) constraintLayout, "activity.bottomBarContainer");
        return C13183n.m40498a(constraintLayout);
    }

    /* renamed from: M */
    public final List<View> mo19212M() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f14818a.findViewById(C6327f.topBarContainer);
        C12880j.m40222a((Object) constraintLayout, "activity.topBarContainer");
        return C13183n.m40498a(constraintLayout);
    }

    /* renamed from: a */
    public TextView mo16806a() {
        return (TextView) this.f14818a.findViewById(C6327f.trickPlayTimeTextView);
    }

    /* renamed from: d */
    public View mo16809d() {
        return (ImageView) this.f14818a.findViewById(C6327f.playPauseButton);
    }

    /* renamed from: g */
    public View mo16812g() {
        return (LinearLayout) this.f14818a.findViewById(C6327f.trickPlayLayout);
    }

    /* renamed from: h */
    public View mo16813h() {
        return (ImageView) this.f14818a.findViewById(C6327f.jumpBackwardButton);
    }

    /* renamed from: i */
    public View mo16814i() {
        return (TextView) this.f14818a.findViewById(C6327f.skipIntro);
    }

    /* renamed from: j */
    public View mo16815j() {
        return (ImageView) this.f14818a.findViewById(C6327f.shutterView);
    }

    /* renamed from: k */
    public View mo16816k() {
        return (ImageView) this.f14818a.findViewById(C6327f.fastForwardButton);
    }

    /* renamed from: l */
    public ImageView mo16817l() {
        return (ImageView) this.f14818a.findViewById(C6327f.trickPlayImageView);
    }

    /* renamed from: p */
    public View mo16821p() {
        return (ExoSurfaceView) this.f14818a.findViewById(C6327f.videoView);
    }

    /* renamed from: q */
    public View mo16822q() {
        return (ImageView) this.f14818a.findViewById(C6327f.rewindButton);
    }

    /* renamed from: r */
    public SeekBar mo16823r() {
        return (SeekBar) this.f14818a.findViewById(C6327f.seekBar);
    }

    /* renamed from: s */
    public List<View> mo16824s() {
        TextView textView = (TextView) this.f14818a.findViewById(C6327f.currentTimeTextView);
        C12880j.m40222a((Object) textView, "activity.currentTimeTextView");
        TextView textView2 = (TextView) this.f14818a.findViewById(C6327f.remainingTimeTextView);
        C12880j.m40222a((Object) textView2, "activity.remainingTimeTextView");
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f14818a.findViewById(C6327f.topBarContainer);
        C12880j.m40222a((Object) constraintLayout, "activity.topBarContainer");
        ImageView imageView = (ImageView) this.f14818a.findViewById(C6327f.jumpBackwardButton);
        C12880j.m40222a((Object) imageView, "activity.jumpBackwardButton");
        ImageView imageView2 = (ImageView) this.f14818a.findViewById(C6327f.jumpForwardButton);
        C12880j.m40222a((Object) imageView2, "activity.jumpForwardButton");
        ImageView imageView3 = (ImageView) this.f14818a.findViewById(C6327f.playPauseButton);
        C12880j.m40222a((Object) imageView3, "activity.playPauseButton");
        return C13185o.m40520c(textView, textView2, constraintLayout, imageView, imageView2, imageView3);
    }

    /* renamed from: t */
    public ImageView mo16825t() {
        ImageView imageView = (ImageView) this.f14818a.findViewById(C6327f.ff_speed);
        C12880j.m40222a((Object) imageView, "activity.ff_speed");
        return imageView;
    }

    /* renamed from: w */
    public ImageView mo16828w() {
        ImageView imageView = (ImageView) this.f14818a.findViewById(C6327f.rw_speed);
        C12880j.m40222a((Object) imageView, "activity.rw_speed");
        return imageView;
    }

    /* renamed from: x */
    public C5343a mo16829x() {
        return new C5348a(mo19212M(), null, mo19211L());
    }

    /* renamed from: z */
    public TextView mo16831z() {
        return (TextView) this.f14818a.findViewById(C6327f.parentTitle);
    }
}
