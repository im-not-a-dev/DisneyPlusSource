package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C0061c;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.C0460a;
import androidx.core.app.C0460a.C0462b;
import androidx.core.app.C0460a.C0463c;
import androidx.core.app.C0460a.C0464d;
import androidx.lifecycle.C0707b0;
import androidx.lifecycle.C0709c0;
import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0715i.C0717b;
import androidx.lifecycle.C0723n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p096e.p113e.C3942j;
import p096e.p150n.p151a.C4237a;

/* renamed from: androidx.fragment.app.d */
/* compiled from: FragmentActivity */
public class C0532d extends ComponentActivity implements C0462b, C0464d {
    boolean mCreated;
    final C0723n mFragmentLifecycleRegistry = new C0723n(this);
    final C0535f mFragments = C0535f.m2836a((C0537h<?>) new C0533a<Object>());
    int mNextCandidateRequestIndex;
    C3942j<String> mPendingFragmentActivityResults;
    boolean mRequestedPermissionsFromFragment;
    boolean mResumed;
    boolean mStartedActivityFromFragment;
    boolean mStartedIntentSenderFromFragment;
    boolean mStopped = true;

    /* renamed from: androidx.fragment.app.d$a */
    /* compiled from: FragmentActivity */
    class C0533a extends C0537h<C0532d> implements C0709c0, C0061c {
        public C0533a() {
            super(C0532d.this);
        }

        /* renamed from: a */
        public void mo3108a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            C0532d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: b */
        public boolean mo3110b(Fragment fragment) {
            return !C0532d.this.isFinishing();
        }

        /* renamed from: f */
        public LayoutInflater mo3112f() {
            return C0532d.this.getLayoutInflater().cloneInContext(C0532d.this);
        }

        /* renamed from: g */
        public int mo3113g() {
            Window window = C0532d.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        public C0715i getLifecycle() {
            return C0532d.this.mFragmentLifecycleRegistry;
        }

        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return C0532d.this.getOnBackPressedDispatcher();
        }

        public C0707b0 getViewModelStore() {
            return C0532d.this.getViewModelStore();
        }

        /* renamed from: h */
        public boolean mo3114h() {
            return C0532d.this.getWindow() != null;
        }

        /* renamed from: i */
        public void mo3115i() {
            C0532d.this.supportInvalidateOptionsMenu();
        }

        /* renamed from: a */
        public void mo3105a(Fragment fragment, Intent intent, int i, Bundle bundle) {
            C0532d.this.startActivityFromFragment(fragment, intent, i, bundle);
        }

        /* renamed from: e */
        public C0532d m2828e() {
            return C0532d.this;
        }

        /* renamed from: a */
        public void mo3106a(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
            C0532d.this.startIntentSenderFromFragment(fragment, intentSender, i, intent, i2, i3, i4, bundle);
        }

        /* renamed from: a */
        public void mo3107a(Fragment fragment, String[] strArr, int i) {
            C0532d.this.requestPermissionsFromFragment(fragment, strArr, i);
        }

        /* renamed from: a */
        public boolean mo3109a(String str) {
            return C0460a.m2493a(C0532d.this, str);
        }

        /* renamed from: a */
        public void mo3104a(Fragment fragment) {
            C0532d.this.onAttachFragment(fragment);
        }

        /* renamed from: a */
        public View mo3021a(int i) {
            return C0532d.this.findViewById(i);
        }

        /* renamed from: a */
        public boolean mo3022a() {
            Window window = C0532d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    private int allocateRequestIndex(Fragment fragment) {
        if (this.mPendingFragmentActivityResults.mo14175b() < 65534) {
            while (this.mPendingFragmentActivityResults.mo14176b(this.mNextCandidateRequestIndex) >= 0) {
                this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 65534;
            }
            int i = this.mNextCandidateRequestIndex;
            this.mPendingFragmentActivityResults.mo14179c(i, fragment.mWho);
            this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    static void checkForValidRequestCode(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), C0717b.CREATED));
    }

    private static boolean markState(C0538i iVar, C0717b bVar) {
        boolean z = false;
        for (Fragment fragment : iVar.mo3159e()) {
            if (fragment != null) {
                if (fragment.getLifecycle().mo4133a().mo4136a(C0717b.STARTED)) {
                    fragment.mLifecycleRegistry.mo4141b(bVar);
                    z = true;
                }
                if (fragment.getHost() != null) {
                    z |= markState(fragment.getChildFragmentManager(), bVar);
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.mo3117a(view, str, context, attributeSet);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String sb2 = sb.toString();
        printWriter.print(sb2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            C4237a.m14568a(this).mo14919a(sb2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.mo3138j().mo3153a(str, fileDescriptor, printWriter, strArr);
    }

    public C0538i getSupportFragmentManager() {
        return this.mFragments.mo3138j();
    }

    @Deprecated
    public C4237a getSupportLoaderManager() {
        return C4237a.m14568a(this);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.mo3139k();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = (String) this.mPendingFragmentActivityResults.mo14172a(i4);
            this.mPendingFragmentActivityResults.mo14181d(i4);
            String str2 = "FragmentActivity";
            if (str == null) {
                Log.w(str2, "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a = this.mFragments.mo3118a(str);
            if (a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity result no fragment exists for who: ");
                sb.append(str);
                Log.w(str2, sb.toString());
            } else {
                a.onActivityResult(i & 65535, i2, intent);
            }
            return;
        }
        C0463c a2 = C0460a.m2488a();
        if (a2 == null || !a2.mo2609a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.mo3139k();
        this.mFragments.mo3120a(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.mFragments.mo3123a((Fragment) null);
        if (bundle != null) {
            this.mFragments.mo3121a(bundle.getParcelable("android:support:fragments"));
            String str = "android:support:next_request_index";
            if (bundle.containsKey(str)) {
                this.mNextCandidateRequestIndex = bundle.getInt(str);
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.mPendingFragmentActivityResults = new C3942j<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.mPendingFragmentActivityResults.mo14179c(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.mPendingFragmentActivityResults == null) {
            this.mPendingFragmentActivityResults = new C3942j<>();
            this.mNextCandidateRequestIndex = 0;
        }
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.mo4139a(C0716a.ON_CREATE);
        this.mFragments.mo3127b();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.mFragments.mo3125a(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.mo3131c();
        this.mFragmentLifecycleRegistry.mo4139a(C0716a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.mo3132d();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.mo3130b(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.mo3126a(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.mo3124a(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.mo3139k();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.mo3122a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.mo3133e();
        this.mFragmentLifecycleRegistry.mo4139a(C0716a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.mo3128b(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.mo3129b(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.mo3139k();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String str = (String) this.mPendingFragmentActivityResults.mo14172a(i3);
            this.mPendingFragmentActivityResults.mo14181d(i3);
            String str2 = "FragmentActivity";
            if (str == null) {
                Log.w(str2, "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a = this.mFragments.mo3118a(str);
            if (a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity result no fragment exists for who: ");
                sb.append(str);
                Log.w(str2, sb.toString());
            } else {
                a.onRequestPermissionsResult(i & 65535, strArr, iArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.mo3139k();
        this.mFragments.mo3137i();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.mo4139a(C0716a.ON_RESUME);
        this.mFragments.mo3134f();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.mo4139a(C0716a.ON_STOP);
        Parcelable l = this.mFragments.mo3140l();
        if (l != null) {
            bundle.putParcelable("android:support:fragments", l);
        }
        if (this.mPendingFragmentActivityResults.mo14175b() > 0) {
            bundle.putInt("android:support:next_request_index", this.mNextCandidateRequestIndex);
            int[] iArr = new int[this.mPendingFragmentActivityResults.mo14175b()];
            String[] strArr = new String[this.mPendingFragmentActivityResults.mo14175b()];
            for (int i = 0; i < this.mPendingFragmentActivityResults.mo14175b(); i++) {
                iArr[i] = this.mPendingFragmentActivityResults.mo14178c(i);
                strArr[i] = (String) this.mPendingFragmentActivityResults.mo14182e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.mo3119a();
        }
        this.mFragments.mo3139k();
        this.mFragments.mo3137i();
        this.mFragmentLifecycleRegistry.mo4139a(C0716a.ON_START);
        this.mFragments.mo3135g();
    }

    public void onStateNotSaved() {
        this.mFragments.mo3139k();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.mo3136h();
        this.mFragmentLifecycleRegistry.mo4139a(C0716a.ON_STOP);
    }

    /* access modifiers changed from: 0000 */
    public void requestPermissionsFromFragment(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            C0460a.m2492a(this, strArr, i);
            return;
        }
        checkForValidRequestCode(i);
        try {
            this.mRequestedPermissionsFromFragment = true;
            C0460a.m2492a(this, strArr, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535));
        } finally {
            this.mRequestedPermissionsFromFragment = false;
        }
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        this.mStartedActivityFromFragment = true;
        if (i == -1) {
            try {
                C0460a.m2490a(this, intent, -1, bundle);
            } finally {
                this.mStartedActivityFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            C0460a.m2490a(this, intent, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535), bundle);
            this.mStartedActivityFromFragment = false;
        }
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        int i5 = i;
        this.mStartedIntentSenderFromFragment = true;
        if (i5 == -1) {
            try {
                C0460a.m2491a(this, intentSender, i, intent, i2, i3, i4, bundle);
            } finally {
                this.mStartedIntentSenderFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            C0460a.m2491a(this, intentSender, ((allocateRequestIndex(fragment) + 1) << 16) + (i5 & 65535), intent, i2, i3, i4, bundle);
            this.mStartedIntentSenderFromFragment = false;
        }
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public final void validateRequestPermissionsRequestCode(int i) {
        if (!this.mRequestedPermissionsFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
