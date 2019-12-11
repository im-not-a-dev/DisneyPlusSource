package androidx.leanback.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.leanback.widget.SearchEditText.C0632a;
import androidx.leanback.widget.SearchOrbView.C0635c;
import java.util.ArrayList;
import p096e.p146l.C4224b;
import p096e.p146l.C4225c;
import p096e.p146l.C4228f;
import p096e.p146l.C4229g;
import p096e.p146l.C4230h;
import p096e.p146l.C4231i;
import p096e.p146l.C4232j;

public class SearchBar extends RelativeLayout {

    /* renamed from: x0 */
    static final String f2665x0 = SearchBar.class.getSimpleName();

    /* renamed from: U */
    SearchEditText f2666U;

    /* renamed from: V */
    SpeechOrbView f2667V;

    /* renamed from: W */
    private ImageView f2668W;

    /* renamed from: a0 */
    String f2669a0;

    /* renamed from: b0 */
    private String f2670b0;

    /* renamed from: c */
    C0630k f2671c;

    /* renamed from: c0 */
    private String f2672c0;

    /* renamed from: d0 */
    private Drawable f2673d0;

    /* renamed from: e0 */
    final Handler f2674e0;

    /* renamed from: f0 */
    private final InputMethodManager f2675f0;

    /* renamed from: g0 */
    boolean f2676g0;

    /* renamed from: h0 */
    private Drawable f2677h0;

    /* renamed from: i0 */
    private final int f2678i0;

    /* renamed from: j0 */
    private final int f2679j0;

    /* renamed from: k0 */
    private final int f2680k0;

    /* renamed from: l0 */
    private final int f2681l0;

    /* renamed from: m0 */
    private int f2682m0;

    /* renamed from: n0 */
    private int f2683n0;

    /* renamed from: o0 */
    private int f2684o0;

    /* renamed from: p0 */
    private SpeechRecognizer f2685p0;

    /* renamed from: q0 */
    private C0688t f2686q0;

    /* renamed from: r0 */
    private boolean f2687r0;

    /* renamed from: s0 */
    SoundPool f2688s0;

    /* renamed from: t0 */
    SparseIntArray f2689t0;

    /* renamed from: u0 */
    boolean f2690u0;

    /* renamed from: v0 */
    private final Context f2691v0;

    /* renamed from: w0 */
    private C0631l f2692w0;

    /* renamed from: androidx.leanback.widget.SearchBar$a */
    class C0617a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ int f2694c;

        C0617a(int i) {
            this.f2694c = i;
        }

        public void run() {
            SearchBar.this.f2688s0.play(SearchBar.this.f2689t0.get(this.f2694c), 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }

    /* renamed from: androidx.leanback.widget.SearchBar$b */
    class C0618b implements OnFocusChangeListener {
        C0618b() {
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                SearchBar.this.mo3541e();
            } else {
                SearchBar.this.mo3536a();
            }
            SearchBar.this.mo3537a(z);
        }
    }

    /* renamed from: androidx.leanback.widget.SearchBar$c */
    class C0619c implements Runnable {
        C0619c() {
        }

        public void run() {
            SearchBar searchBar = SearchBar.this;
            searchBar.setSearchQueryInternal(searchBar.f2666U.getText().toString());
        }
    }

    /* renamed from: androidx.leanback.widget.SearchBar$d */
    class C0620d implements TextWatcher {

        /* renamed from: c */
        final /* synthetic */ Runnable f2698c;

        C0620d(Runnable runnable) {
            this.f2698c = runnable;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchBar searchBar = SearchBar.this;
            if (!searchBar.f2690u0) {
                searchBar.f2674e0.removeCallbacks(this.f2698c);
                SearchBar.this.f2674e0.post(this.f2698c);
            }
        }
    }

    /* renamed from: androidx.leanback.widget.SearchBar$e */
    class C0621e implements C0632a {
        C0621e() {
        }

        /* renamed from: a */
        public void mo3569a() {
            SearchBar searchBar = SearchBar.this;
            C0630k kVar = searchBar.f2671c;
            if (kVar != null) {
                kVar.mo3588c(searchBar.f2669a0);
            }
        }
    }

    /* renamed from: androidx.leanback.widget.SearchBar$f */
    class C0622f implements OnEditorActionListener {

        /* renamed from: androidx.leanback.widget.SearchBar$f$a */
        class C0623a implements Runnable {
            C0623a() {
            }

            public void run() {
                SearchBar.this.mo3547h();
            }
        }

        /* renamed from: androidx.leanback.widget.SearchBar$f$b */
        class C0624b implements Runnable {
            C0624b() {
            }

            public void run() {
                SearchBar searchBar = SearchBar.this;
                searchBar.f2671c.mo3588c(searchBar.f2669a0);
            }
        }

        /* renamed from: androidx.leanback.widget.SearchBar$f$c */
        class C0625c implements Runnable {
            C0625c() {
            }

            public void run() {
                SearchBar searchBar = SearchBar.this;
                searchBar.f2676g0 = true;
                searchBar.f2667V.requestFocus();
            }
        }

        C0622f() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (3 == i || i == 0) {
                SearchBar searchBar = SearchBar.this;
                if (searchBar.f2671c != null) {
                    searchBar.mo3536a();
                    SearchBar.this.f2674e0.postDelayed(new C0623a(), 500);
                    return true;
                }
            }
            if (1 == i) {
                SearchBar searchBar2 = SearchBar.this;
                if (searchBar2.f2671c != null) {
                    searchBar2.mo3536a();
                    SearchBar.this.f2674e0.postDelayed(new C0624b(), 500);
                    return true;
                }
            }
            if (2 != i) {
                return false;
            }
            SearchBar.this.mo3536a();
            SearchBar.this.f2674e0.postDelayed(new C0625c(), 500);
            return true;
        }
    }

    /* renamed from: androidx.leanback.widget.SearchBar$g */
    class C0626g implements OnClickListener {
        C0626g() {
        }

        public void onClick(View view) {
            SearchBar.this.mo3548i();
        }
    }

    /* renamed from: androidx.leanback.widget.SearchBar$h */
    class C0627h implements OnFocusChangeListener {
        C0627h() {
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                SearchBar.this.mo3536a();
                SearchBar searchBar = SearchBar.this;
                if (searchBar.f2676g0) {
                    searchBar.mo3542f();
                    SearchBar.this.f2676g0 = false;
                }
            } else {
                SearchBar.this.mo3543g();
            }
            SearchBar.this.mo3537a(z);
        }
    }

    /* renamed from: androidx.leanback.widget.SearchBar$i */
    class C0628i implements Runnable {
        C0628i() {
        }

        public void run() {
            SearchBar.this.f2666U.requestFocusFromTouch();
            SearchBar.this.f2666U.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, (float) SearchBar.this.f2666U.getWidth(), (float) SearchBar.this.f2666U.getHeight(), 0));
            SearchBar.this.f2666U.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, (float) SearchBar.this.f2666U.getWidth(), (float) SearchBar.this.f2666U.getHeight(), 0));
        }
    }

    /* renamed from: androidx.leanback.widget.SearchBar$j */
    class C0629j implements RecognitionListener {
        C0629j() {
        }

        public void onBeginningOfSpeech() {
        }

        public void onBufferReceived(byte[] bArr) {
        }

        public void onEndOfSpeech() {
        }

        public void onError(int i) {
            switch (i) {
                case 1:
                    Log.w(SearchBar.f2665x0, "recognizer network timeout");
                    break;
                case 2:
                    Log.w(SearchBar.f2665x0, "recognizer network error");
                    break;
                case 3:
                    Log.w(SearchBar.f2665x0, "recognizer audio error");
                    break;
                case 4:
                    Log.w(SearchBar.f2665x0, "recognizer server error");
                    break;
                case 5:
                    Log.w(SearchBar.f2665x0, "recognizer client error");
                    break;
                case 6:
                    Log.w(SearchBar.f2665x0, "recognizer speech timeout");
                    break;
                case 7:
                    Log.w(SearchBar.f2665x0, "recognizer no match");
                    break;
                case 8:
                    Log.w(SearchBar.f2665x0, "recognizer busy");
                    break;
                case 9:
                    Log.w(SearchBar.f2665x0, "recognizer insufficient permissions");
                    break;
                default:
                    Log.d(SearchBar.f2665x0, "recognizer other error");
                    break;
            }
            SearchBar.this.mo3543g();
            SearchBar.this.mo3538b();
        }

        public void onEvent(int i, Bundle bundle) {
        }

        public void onPartialResults(Bundle bundle) {
            ArrayList stringArrayList = bundle.getStringArrayList("results_recognition");
            if (stringArrayList != null && stringArrayList.size() != 0) {
                SearchBar.this.f2666U.mo4067a((String) stringArrayList.get(0), stringArrayList.size() > 1 ? (String) stringArrayList.get(1) : null);
            }
        }

        public void onReadyForSpeech(Bundle bundle) {
            SearchBar.this.f2667V.mo3634a();
            SearchBar.this.mo3539c();
        }

        public void onResults(Bundle bundle) {
            ArrayList stringArrayList = bundle.getStringArrayList("results_recognition");
            if (stringArrayList != null) {
                SearchBar.this.f2669a0 = (String) stringArrayList.get(0);
                SearchBar searchBar = SearchBar.this;
                searchBar.f2666U.setText(searchBar.f2669a0);
                SearchBar.this.mo3547h();
            }
            SearchBar.this.mo3543g();
            SearchBar.this.mo3540d();
        }

        public void onRmsChanged(float f) {
            SearchBar.this.f2667V.setSoundLevel(f < 0.0f ? 0 : (int) (f * 10.0f));
        }
    }

    /* renamed from: androidx.leanback.widget.SearchBar$k */
    public interface C0630k {
        /* renamed from: a */
        void mo3586a(String str);

        /* renamed from: b */
        void mo3587b(String str);

        /* renamed from: c */
        void mo3588c(String str);
    }

    /* renamed from: androidx.leanback.widget.SearchBar$l */
    public interface C0631l {
        /* renamed from: a */
        void mo3589a();
    }

    public SearchBar(Context context) {
        this(context, null);
    }

    /* renamed from: j */
    private boolean m3241j() {
        return this.f2667V.isFocused();
    }

    /* renamed from: k */
    private void m3242k() {
        String string = getResources().getString(C4232j.lb_search_bar_hint);
        if (!TextUtils.isEmpty(this.f2672c0)) {
            if (m3241j()) {
                string = getResources().getString(C4232j.lb_search_bar_hint_with_title_speech, new Object[]{this.f2672c0});
            } else {
                string = getResources().getString(C4232j.lb_search_bar_hint_with_title, new Object[]{this.f2672c0});
            }
        } else if (m3241j()) {
            string = getResources().getString(C4232j.lb_search_bar_hint_speech);
        }
        this.f2670b0 = string;
        SearchEditText searchEditText = this.f2666U;
        if (searchEditText != null) {
            searchEditText.setHint(this.f2670b0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3536a() {
        this.f2675f0.hideSoftInputFromWindow(this.f2666U.getWindowToken(), 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3538b() {
        m3239a(C4231i.lb_voice_failure);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo3539c() {
        m3239a(C4231i.lb_voice_open);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo3540d() {
        m3239a(C4231i.lb_voice_success);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo3541e() {
        this.f2674e0.post(new C0628i());
    }

    /* renamed from: f */
    public void mo3542f() {
        if (!this.f2690u0) {
            if (!hasFocus()) {
                requestFocus();
            }
            String str = "";
            if (this.f2686q0 != null) {
                this.f2666U.setText(str);
                this.f2666U.setHint(str);
                this.f2686q0.mo4056a();
                this.f2690u0 = true;
            } else if (this.f2685p0 != null) {
                if (getContext().checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    if (VERSION.SDK_INT >= 23) {
                        C0631l lVar = this.f2692w0;
                        if (lVar != null) {
                            lVar.mo3589a();
                            return;
                        }
                    }
                    throw new IllegalStateException("android.permission.RECORD_AUDIO required for search");
                }
                this.f2690u0 = true;
                this.f2666U.setText(str);
                Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
                intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
                this.f2685p0.setRecognitionListener(new C0629j());
                this.f2687r0 = true;
                this.f2685p0.startListening(intent);
            }
        }
    }

    /* renamed from: g */
    public void mo3543g() {
        if (this.f2690u0) {
            this.f2666U.setText(this.f2669a0);
            this.f2666U.setHint(this.f2670b0);
            this.f2690u0 = false;
            if (this.f2686q0 == null && this.f2685p0 != null) {
                this.f2667V.mo3635b();
                if (this.f2687r0) {
                    this.f2685p0.cancel();
                    this.f2687r0 = false;
                }
                this.f2685p0.setRecognitionListener(null);
            }
        }
    }

    public Drawable getBadgeDrawable() {
        return this.f2673d0;
    }

    public CharSequence getHint() {
        return this.f2670b0;
    }

    public String getTitle() {
        return this.f2672c0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo3547h() {
        if (!TextUtils.isEmpty(this.f2669a0)) {
            C0630k kVar = this.f2671c;
            if (kVar != null) {
                kVar.mo3587b(this.f2669a0);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo3548i() {
        if (this.f2690u0) {
            mo3543g();
        } else {
            mo3542f();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2688s0 = new SoundPool(2, 1, 0);
        m3240a(this.f2691v0);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        mo3543g();
        this.f2688s0.release();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2677h0 = ((RelativeLayout) findViewById(C4228f.lb_search_bar_items)).getBackground();
        this.f2666U = (SearchEditText) findViewById(C4228f.lb_search_text_editor);
        this.f2668W = (ImageView) findViewById(C4228f.lb_search_bar_badge);
        Drawable drawable = this.f2673d0;
        if (drawable != null) {
            this.f2668W.setImageDrawable(drawable);
        }
        this.f2666U.setOnFocusChangeListener(new C0618b());
        this.f2666U.addTextChangedListener(new C0620d(new C0619c()));
        this.f2666U.setOnKeyboardDismissListener(new C0621e());
        this.f2666U.setOnEditorActionListener(new C0622f());
        this.f2666U.setPrivateImeOptions("escapeNorth,voiceDismiss");
        this.f2667V = (SpeechOrbView) findViewById(C4228f.lb_search_bar_speech_orb);
        this.f2667V.setOnOrbClickedListener(new C0626g());
        this.f2667V.setOnFocusChangeListener(new C0627h());
        mo3537a(hasFocus());
        m3242k();
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.f2673d0 = drawable;
        ImageView imageView = this.f2668W;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            if (drawable != null) {
                this.f2668W.setVisibility(0);
            } else {
                this.f2668W.setVisibility(8);
            }
        }
    }

    public void setNextFocusDownId(int i) {
        this.f2667V.setNextFocusDownId(i);
        this.f2666U.setNextFocusDownId(i);
    }

    public void setPermissionListener(C0631l lVar) {
        this.f2692w0 = lVar;
    }

    public void setSearchAffordanceColors(C0635c cVar) {
        SpeechOrbView speechOrbView = this.f2667V;
        if (speechOrbView != null) {
            speechOrbView.setNotListeningOrbColors(cVar);
        }
    }

    public void setSearchAffordanceColorsInListening(C0635c cVar) {
        SpeechOrbView speechOrbView = this.f2667V;
        if (speechOrbView != null) {
            speechOrbView.setListeningOrbColors(cVar);
        }
    }

    public void setSearchBarListener(C0630k kVar) {
        this.f2671c = kVar;
    }

    public void setSearchQuery(String str) {
        mo3543g();
        this.f2666U.setText(str);
        setSearchQueryInternal(str);
    }

    /* access modifiers changed from: 0000 */
    public void setSearchQueryInternal(String str) {
        if (!TextUtils.equals(this.f2669a0, str)) {
            this.f2669a0 = str;
            C0630k kVar = this.f2671c;
            if (kVar != null) {
                kVar.mo3586a(this.f2669a0);
            }
        }
    }

    @Deprecated
    public void setSpeechRecognitionCallback(C0688t tVar) {
        this.f2686q0 = tVar;
        if (this.f2686q0 != null && this.f2685p0 != null) {
            throw new IllegalStateException("Can't have speech recognizer and request");
        }
    }

    public void setSpeechRecognizer(SpeechRecognizer speechRecognizer) {
        mo3543g();
        SpeechRecognizer speechRecognizer2 = this.f2685p0;
        if (speechRecognizer2 != null) {
            speechRecognizer2.setRecognitionListener(null);
            if (this.f2687r0) {
                this.f2685p0.cancel();
                this.f2687r0 = false;
            }
        }
        this.f2685p0 = speechRecognizer;
        if (this.f2686q0 != null && this.f2685p0 != null) {
            throw new IllegalStateException("Can't have speech recognizer and request");
        }
    }

    public void setTitle(String str) {
        this.f2672c0 = str;
        m3242k();
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3537a(boolean z) {
        if (z) {
            this.f2677h0.setAlpha(this.f2683n0);
            if (m3241j()) {
                this.f2666U.setTextColor(this.f2681l0);
                this.f2666U.setHintTextColor(this.f2681l0);
            } else {
                this.f2666U.setTextColor(this.f2679j0);
                this.f2666U.setHintTextColor(this.f2681l0);
            }
        } else {
            this.f2677h0.setAlpha(this.f2682m0);
            this.f2666U.setTextColor(this.f2678i0);
            this.f2666U.setHintTextColor(this.f2680k0);
        }
        m3242k();
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2674e0 = new Handler();
        this.f2676g0 = false;
        this.f2689t0 = new SparseIntArray();
        this.f2690u0 = false;
        this.f2691v0 = context;
        Resources resources = getResources();
        LayoutInflater.from(getContext()).inflate(C4230h.lb_search_bar, this, true);
        this.f2684o0 = getResources().getDimensionPixelSize(C4225c.lb_search_bar_height);
        LayoutParams layoutParams = new LayoutParams(-1, this.f2684o0);
        layoutParams.addRule(10, -1);
        setLayoutParams(layoutParams);
        setBackgroundColor(0);
        setClipChildren(false);
        this.f2669a0 = "";
        this.f2675f0 = (InputMethodManager) context.getSystemService("input_method");
        this.f2679j0 = resources.getColor(C4224b.lb_search_bar_text_speech_mode);
        this.f2678i0 = resources.getColor(C4224b.lb_search_bar_text);
        this.f2683n0 = resources.getInteger(C4229g.lb_search_bar_speech_mode_background_alpha);
        this.f2682m0 = resources.getInteger(C4229g.lb_search_bar_text_mode_background_alpha);
        this.f2681l0 = resources.getColor(C4224b.lb_search_bar_hint_speech_mode);
        this.f2680k0 = resources.getColor(C4224b.lb_search_bar_hint);
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
    }

    /* renamed from: a */
    private void m3240a(Context context) {
        int[] iArr;
        for (int i : new int[]{C4231i.lb_voice_failure, C4231i.lb_voice_open, C4231i.lb_voice_no_input, C4231i.lb_voice_success}) {
            this.f2689t0.put(i, this.f2688s0.load(context, i, 1));
        }
    }

    /* renamed from: a */
    private void m3239a(int i) {
        this.f2674e0.post(new C0617a(i));
    }
}
