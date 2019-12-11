package com.bamtechmedia.dominguez.search;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.core.p084g.C3800a;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p122j.C4027b;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\tH\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\u0012\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0016\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*J\u0012\u0010+\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010-\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0010H\u0002J\u000e\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\u0016J\u0006\u00104\u001a\u00020\tJ\u0018\u00105\u001a\u00020\u00102\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0016H\u0002J\b\u00109\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/search/SpeechRecognizerHelper;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/speech/RecognitionListener;", "fragment", "Lcom/bamtechmedia/dominguez/search/SearchTvFragment;", "(Lcom/bamtechmedia/dominguez/search/SearchTvFragment;)V", "context", "Landroid/content/Context;", "isListening", "", "()Z", "setListening", "(Z)V", "speechRecognizer", "Landroid/speech/SpeechRecognizer;", "cancelListening", "", "endMicrophoneAnimation", "hasRecordAudioPermission", "mapSpeechRecognizerError", "", "error", "", "onBeginningOfSpeech", "onBufferReceived", "buffer", "", "onEndOfSpeech", "onError", "onEvent", "eventType", "params", "Landroid/os/Bundle;", "onPartialResults", "partialResults", "onPause", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onReadyForSpeech", "onRequestPermissionResult", "requestCode", "grantResults", "", "onResults", "results", "onResume", "onRmsChanged", "rmsdB", "", "onVoiceButtonClick", "shouldConsumeBackKey", "keyCode", "shouldShowMicrophone", "startAnimation", "imageView", "Landroid/widget/ImageView;", "id", "startMicrophoneAnimation", "Companion", "search_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SpeechRecognizerHelper.kt */
public final class SpeechRecognizerHelper implements C0710d, RecognitionListener {

    /* renamed from: U */
    private SpeechRecognizer f17112U;

    /* renamed from: V */
    private boolean f17113V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final C8068y f17114W;

    /* renamed from: c */
    private final Context f17115c;

    /* renamed from: com.bamtechmedia.dominguez.search.SpeechRecognizerHelper$a */
    /* compiled from: SpeechRecognizerHelper.kt */
    public static final class C7959a {
        private C7959a() {
        }

        public /* synthetic */ C7959a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.SpeechRecognizerHelper$b */
    /* compiled from: SpeechRecognizerHelper.kt */
    static final class C7960b implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ SpeechRecognizerHelper f17116c;

        C7960b(SpeechRecognizerHelper speechRecognizerHelper) {
            this.f17116c = speechRecognizerHelper;
        }

        public final void onClick(View view) {
            this.f17116c.m23210g();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.SpeechRecognizerHelper$c */
    /* compiled from: SpeechRecognizerHelper.kt */
    static final class C7961c extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ SpeechRecognizerHelper f17117c;

        C7961c(SpeechRecognizerHelper speechRecognizerHelper) {
            this.f17117c = speechRecognizerHelper;
            super(0);
        }

        public final void invoke() {
            SpeechRecognizerHelper speechRecognizerHelper = this.f17117c;
            ImageView imageView = (ImageView) speechRecognizerHelper.f17114W._$_findCachedViewById(C8048n.microphoneOvalOneImageView);
            C12880j.m40222a((Object) imageView, "fragment.microphoneOvalOneImageView");
            speechRecognizerHelper.m23203a(imageView, C8044j.rotate_counter_clockwise);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.SpeechRecognizerHelper$d */
    /* compiled from: SpeechRecognizerHelper.kt */
    static final class C7962d extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ SpeechRecognizerHelper f17118c;

        C7962d(SpeechRecognizerHelper speechRecognizerHelper) {
            this.f17118c = speechRecognizerHelper;
            super(0);
        }

        public final void invoke() {
            SpeechRecognizerHelper speechRecognizerHelper = this.f17118c;
            ImageView imageView = (ImageView) speechRecognizerHelper.f17114W._$_findCachedViewById(C8048n.microphoneOvalTwoImageView);
            C12880j.m40222a((Object) imageView, "fragment.microphoneOvalTwoImageView");
            speechRecognizerHelper.m23203a(imageView, C8044j.rotate_clockwise);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.SpeechRecognizerHelper$e */
    /* compiled from: SpeechRecognizerHelper.kt */
    static final class C7963e extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ SpeechRecognizerHelper f17119c;

        C7963e(SpeechRecognizerHelper speechRecognizerHelper) {
            this.f17119c = speechRecognizerHelper;
            super(0);
        }

        public final void invoke() {
            SpeechRecognizerHelper speechRecognizerHelper = this.f17119c;
            ImageView imageView = (ImageView) speechRecognizerHelper.f17114W._$_findCachedViewById(C8048n.microphoneOvalThreeImageView);
            C12880j.m40222a((Object) imageView, "fragment.microphoneOvalThreeImageView");
            speechRecognizerHelper.m23203a(imageView, C8044j.rotate_clockwise);
        }
    }

    static {
        new C7959a(null);
    }

    public SpeechRecognizerHelper(C8068y yVar) {
        this.f17114W = yVar;
        Context requireContext = this.f17114W.requireContext();
        C12880j.m40222a((Object) requireContext, "fragment.requireContext()");
        this.f17115c = requireContext;
    }

    /* renamed from: b */
    private final String m23205b(int i) {
        switch (i) {
            case 1:
                return "Network operation timed out";
            case 2:
                return "Other network related errors";
            case 3:
                return "Audio recording error";
            case 4:
                return "Server sends error status";
            case 5:
                return "Other client side errors";
            case 6:
                return "No speech input";
            case 7:
                return "No recognition result matched";
            case 8:
                return "RecognitionService busy";
            case 9:
                return "Insufficient permissions";
            default:
                return "Unknown error";
        }
    }

    /* renamed from: d */
    private final void m23207d() {
        SpeechRecognizer speechRecognizer = this.f17112U;
        if (speechRecognizer != null) {
            speechRecognizer.cancel();
        }
        SpeechRecognizer speechRecognizer2 = this.f17112U;
        if (speechRecognizer2 != null) {
            speechRecognizer2.setRecognitionListener(null);
        }
        m23208e();
    }

    /* renamed from: e */
    private final void m23208e() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f17114W.getContext(), C8044j.voice_indicator_scale_down);
        C12880j.m40222a((Object) loadAnimation, "scaleDownAnimation");
        loadAnimation.setFillEnabled(true);
        loadAnimation.setFillAfter(true);
        ((ImageView) this.f17114W._$_findCachedViewById(C8048n.microphoneOvalOneImageView)).startAnimation(loadAnimation);
        ((ImageView) this.f17114W._$_findCachedViewById(C8048n.microphoneOvalTwoImageView)).startAnimation(loadAnimation);
        ((ImageView) this.f17114W._$_findCachedViewById(C8048n.microphoneOvalThreeImageView)).startAnimation(loadAnimation);
        this.f17113V = false;
    }

    /* renamed from: f */
    private final boolean m23209f() {
        return C4027b.m13800a(this.f17115c, "android.permission.RECORD_AUDIO") == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m23210g() {
        if (m23209f()) {
            if (this.f17112U == null) {
                this.f17112U = SpeechRecognizer.createSpeechRecognizer(this.f17115c);
            }
            SpeechRecognizer speechRecognizer = this.f17112U;
            if (speechRecognizer != null) {
                speechRecognizer.setRecognitionListener(null);
            }
            SpeechRecognizer speechRecognizer2 = this.f17112U;
            if (speechRecognizer2 != null) {
                speechRecognizer2.setRecognitionListener(this);
            }
            ((EditText) this.f17114W._$_findCachedViewById(C8048n.searchEditText)).setText("");
            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
            intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
            intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
            SpeechRecognizer speechRecognizer3 = this.f17112U;
            if (speechRecognizer3 != null) {
                speechRecognizer3.startListening(intent);
            }
        } else if (VERSION.SDK_INT >= 23) {
            this.f17114W.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 107);
        }
    }

    /* renamed from: h */
    private final void m23211h() {
        this.f17113V = true;
        ImageView imageView = (ImageView) this.f17114W._$_findCachedViewById(C8048n.microphoneOvalOneImageView);
        ImageView imageView2 = imageView;
        C12880j.m40222a((Object) imageView, "fragment.microphoneOvalOneImageView");
        C7961c cVar = r1;
        C7961c cVar2 = new C7961c(this);
        C3800a.m12829a(imageView2, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, null, cVar, null, 196606, null);
        ImageView imageView3 = (ImageView) this.f17114W._$_findCachedViewById(C8048n.microphoneOvalTwoImageView);
        ImageView imageView4 = imageView3;
        C12880j.m40222a((Object) imageView3, "fragment.microphoneOvalTwoImageView");
        C7962d dVar = r1;
        C7962d dVar2 = new C7962d(this);
        C3800a.m12829a(imageView4, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, null, dVar, null, 196606, null);
        ImageView imageView5 = (ImageView) this.f17114W._$_findCachedViewById(C8048n.microphoneOvalThreeImageView);
        ImageView imageView6 = imageView5;
        C12880j.m40222a((Object) imageView5, "fragment.microphoneOvalThreeImageView");
        C7963e eVar = r1;
        C7963e eVar2 = new C7963e(this);
        C3800a.m12829a(imageView6, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, null, eVar, null, 196606, null);
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: c */
    public void mo4128c(C0722m mVar) {
        SpeechRecognizer speechRecognizer = this.f17112U;
        if (speechRecognizer != null) {
            speechRecognizer.setRecognitionListener(null);
        }
        SpeechRecognizer speechRecognizer2 = this.f17112U;
        if (speechRecognizer2 != null) {
            speechRecognizer2.stopListening();
        }
        SpeechRecognizer speechRecognizer3 = this.f17112U;
        if (speechRecognizer3 != null) {
            speechRecognizer3.destroy();
        }
        this.f17112U = null;
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: e */
    public /* synthetic */ void mo4130e(C0722m mVar) {
        C0708c.m3733b(this, mVar);
    }

    /* renamed from: f */
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }

    public void onBeginningOfSpeech() {
    }

    public void onBufferReceived(byte[] bArr) {
    }

    public void onEndOfSpeech() {
        m23208e();
    }

    public void onError(int i) {
        C14100a.m44522a("Error using speech recognition: %s", m23205b(i));
        if (i == 8) {
            SpeechRecognizer speechRecognizer = this.f17112U;
            if (speechRecognizer != null) {
                speechRecognizer.cancel();
            }
            SpeechRecognizer speechRecognizer2 = this.f17112U;
            if (speechRecognizer2 != null) {
                speechRecognizer2.setRecognitionListener(null);
            }
        }
        m23208e();
    }

    public void onEvent(int i, Bundle bundle) {
    }

    public void onPartialResults(Bundle bundle) {
        ArrayList stringArrayList = bundle != null ? bundle.getStringArrayList("results_recognition") : null;
        if (stringArrayList != null && (!stringArrayList.isEmpty())) {
            Object f = C13199w.m40589f((List) stringArrayList);
            if (f != null) {
                String str = (String) f;
                ((EditText) this.f17114W._$_findCachedViewById(C8048n.searchEditText)).setText(str);
                if (((EditText) this.f17114W._$_findCachedViewById(C8048n.searchEditText)).length() > 0) {
                    ((EditText) this.f17114W._$_findCachedViewById(C8048n.searchEditText)).setSelection(((EditText) this.f17114W._$_findCachedViewById(C8048n.searchEditText)).length() - 1);
                }
                this.f17114W.mo1302a(str);
                return;
            }
            throw new C13142s("null cannot be cast to non-null type kotlin.String");
        }
    }

    public void onReadyForSpeech(Bundle bundle) {
        m23211h();
    }

    public void onResults(Bundle bundle) {
    }

    public void onRmsChanged(float f) {
    }

    /* renamed from: b */
    public final boolean mo20921b() {
        return SpeechRecognizer.isRecognitionAvailable(this.f17115c);
    }

    /* renamed from: a */
    public void mo4126a(C0722m mVar) {
        String str = "fragment.microphoneImageViewContainer";
        if (mo20921b()) {
            FrameLayout frameLayout = (FrameLayout) this.f17114W._$_findCachedViewById(C8048n.microphoneImageViewContainer);
            C12880j.m40222a((Object) frameLayout, str);
            C5852n0.m18890c(frameLayout);
            if (this.f17112U == null) {
                this.f17112U = SpeechRecognizer.createSpeechRecognizer(this.f17115c);
            }
            ((ImageView) this.f17114W._$_findCachedViewById(C8048n.microphoneImageView)).setTag(C8048n.focusHelperExpandNavOnFocusSearchLeft, Boolean.valueOf(true));
            ((ImageView) this.f17114W._$_findCachedViewById(C8048n.microphoneImageView)).setOnClickListener(new C7960b(this));
            return;
        }
        FrameLayout frameLayout2 = (FrameLayout) this.f17114W._$_findCachedViewById(C8048n.microphoneImageViewContainer);
        C12880j.m40222a((Object) frameLayout2, str);
        C5852n0.m18887b(frameLayout2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23203a(ImageView imageView, int i) {
        imageView.startAnimation(AnimationUtils.loadAnimation(this.f17114W.getContext(), i));
    }

    /* renamed from: a */
    public final boolean mo20920a(int i) {
        if (!this.f17113V) {
            return false;
        }
        if (i == 97 || i == 4) {
            m23207d();
        }
        return true;
    }

    /* renamed from: a */
    public final void mo20919a(int i, int[] iArr) {
        if (i == 107) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                m23210g();
            }
        }
    }
}
