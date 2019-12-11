package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.C0489m;
import androidx.lifecycle.C0707b0;
import androidx.lifecycle.C0709c0;
import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0715i.C0717b;
import androidx.lifecycle.C0720k;
import androidx.lifecycle.C0721l;
import androidx.lifecycle.C0722m;
import androidx.lifecycle.C0723n;
import androidx.lifecycle.C0730s;
import androidx.lifecycle.LiveData;
import androidx.savedstate.C0956a;
import androidx.savedstate.C0957b;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p096e.p121h.p134r.C4109a;
import p096e.p121h.p135s.C4144g;
import p096e.p150n.p151a.C4237a;

public class Fragment implements ComponentCallbacks, OnCreateContextMenuListener, C0722m, C0709c0, C0957b {
    static final int ACTIVITY_CREATED = 2;
    static final int CREATED = 1;
    static final int INITIALIZING = 0;
    static final int RESUMED = 4;
    static final int STARTED = 3;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    boolean mAdded;
    C0522d mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    private boolean mCalled;
    C0542j mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    C0542j mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    C0537h mHost;
    boolean mInLayout;
    View mInnerView;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C0723n mLifecycleRegistry;
    C0717b mMaxState;
    boolean mMenuVisible;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    Runnable mPostponedDurationRunnable;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    C0956a mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    C0581s mViewLifecycleOwner;
    C0730s<C0722m> mViewLifecycleOwnerLiveData;
    String mWho;

    /* renamed from: androidx.fragment.app.Fragment$a */
    class C0519a implements Runnable {
        C0519a() {
        }

        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    class C0520b implements Runnable {
        C0520b() {
        }

        public void run() {
            Fragment.this.callStartTransitionListener();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    class C0521c extends C0534e {
        C0521c() {
        }

        /* renamed from: a */
        public View mo3021a(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" does not have a view");
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: a */
        public boolean mo3022a() {
            return Fragment.this.mView != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    static class C0522d {

        /* renamed from: a */
        View f2297a;

        /* renamed from: b */
        Animator f2298b;

        /* renamed from: c */
        int f2299c;

        /* renamed from: d */
        int f2300d;

        /* renamed from: e */
        int f2301e;

        /* renamed from: f */
        int f2302f;

        /* renamed from: g */
        Object f2303g = null;

        /* renamed from: h */
        Object f2304h;

        /* renamed from: i */
        Object f2305i;

        /* renamed from: j */
        Object f2306j;

        /* renamed from: k */
        Object f2307k;

        /* renamed from: l */
        Object f2308l;

        /* renamed from: m */
        Boolean f2309m;

        /* renamed from: n */
        Boolean f2310n;

        /* renamed from: o */
        C0489m f2311o;

        /* renamed from: p */
        C0489m f2312p;

        /* renamed from: q */
        boolean f2313q;

        /* renamed from: r */
        C0524f f2314r;

        /* renamed from: s */
        boolean f2315s;

        C0522d() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f2304h = obj;
            this.f2305i = null;
            this.f2306j = obj;
            this.f2307k = null;
            this.f2308l = obj;
            this.f2311o = null;
            this.f2312p = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    public static class C0523e extends RuntimeException {
        public C0523e(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    interface C0524f {
        /* renamed from: a */
        void mo3023a();

        /* renamed from: b */
        void mo3024b();
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.fragment.app.Fragment$g */
    public static class C0525g implements Parcelable {
        public static final Creator<C0525g> CREATOR = new C0526a();

        /* renamed from: c */
        final Bundle f2316c;

        /* renamed from: androidx.fragment.app.Fragment$g$a */
        static class C0526a implements ClassLoaderCreator<C0525g> {
            C0526a() {
            }

            public C0525g[] newArray(int i) {
                return new C0525g[i];
            }

            public C0525g createFromParcel(Parcel parcel) {
                return new C0525g(parcel, null);
            }

            public C0525g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0525g(parcel, classLoader);
            }
        }

        C0525g(Parcel parcel, ClassLoader classLoader) {
            this.f2316c = parcel.readBundle();
            if (classLoader != null) {
                Bundle bundle = this.f2316c;
                if (bundle != null) {
                    bundle.setClassLoader(classLoader);
                }
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f2316c);
        }
    }

    public Fragment() {
        this.mState = 0;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C0542j();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new C0519a();
        this.mMaxState = C0717b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C0730s<>();
        initLifecycle();
    }

    private C0522d ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C0522d();
        }
        return this.mAnimationInfo;
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C0723n(this);
        this.mSavedStateRegistryController = C0956a.m5180a((C0957b) this);
        if (VERSION.SDK_INT >= 19) {
            this.mLifecycleRegistry.mo4134a((C0721l) new C0720k() {
                /* renamed from: a */
                public void mo330a(C0722m mVar, C0716a aVar) {
                    if (aVar == C0716a.ON_STOP) {
                        View view = Fragment.this.mView;
                        if (view != null) {
                            view.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    /* access modifiers changed from: 0000 */
    public void callStartTransitionListener() {
        C0522d dVar = this.mAnimationInfo;
        C0524f fVar = null;
        if (dVar != null) {
            dVar.f2313q = false;
            C0524f fVar2 = dVar.f2314r;
            dVar.f2314r = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.mo3024b();
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (this.mInnerView != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(getStateAfterAnimating());
        }
        if (getContext() != null) {
            C4237a.m14568a(this).mo14919a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        StringBuilder sb = new StringBuilder();
        sb.append("Child ");
        sb.append(this.mChildFragmentManager);
        sb.append(":");
        printWriter.println(sb.toString());
        C0542j jVar = this.mChildFragmentManager;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("  ");
        jVar.mo3153a(sb2.toString(), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: 0000 */
    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.mo3206b(str);
    }

    public final C0532d getActivity() {
        C0537h hVar = this.mHost;
        if (hVar == null) {
            return null;
        }
        return (C0532d) hVar.mo3142b();
    }

    public boolean getAllowEnterTransitionOverlap() {
        C0522d dVar = this.mAnimationInfo;
        if (dVar != null) {
            Boolean bool = dVar.f2310n;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        C0522d dVar = this.mAnimationInfo;
        if (dVar != null) {
            Boolean bool = dVar.f2309m;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public View getAnimatingAway() {
        C0522d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f2297a;
    }

    /* access modifiers changed from: 0000 */
    public Animator getAnimator() {
        C0522d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f2298b;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final C0538i getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" has not been attached yet.");
        throw new IllegalStateException(sb.toString());
    }

    public Context getContext() {
        C0537h hVar = this.mHost;
        if (hVar == null) {
            return null;
        }
        return hVar.mo3143c();
    }

    public Object getEnterTransition() {
        C0522d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f2303g;
    }

    /* access modifiers changed from: 0000 */
    public C0489m getEnterTransitionCallback() {
        C0522d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f2311o;
    }

    public Object getExitTransition() {
        C0522d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f2305i;
    }

    /* access modifiers changed from: 0000 */
    public C0489m getExitTransitionCallback() {
        C0522d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f2312p;
    }

    public final C0538i getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        C0537h hVar = this.mHost;
        if (hVar == null) {
            return null;
        }
        return hVar.mo3111e();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    public C0715i getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public C4237a getLoaderManager() {
        return C4237a.m14568a(this);
    }

    /* access modifiers changed from: 0000 */
    public int getNextAnim() {
        C0522d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return 0;
        }
        return dVar.f2300d;
    }

    /* access modifiers changed from: 0000 */
    public int getNextTransition() {
        C0522d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return 0;
        }
        return dVar.f2301e;
    }

    /* access modifiers changed from: 0000 */
    public int getNextTransitionStyle() {
        C0522d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return 0;
        }
        return dVar.f2302f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public Object getReenterTransition() {
        C0522d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f2306j;
        if (obj == USE_DEFAULT_TRANSITION) {
            obj = getExitTransition();
        }
        return obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C0522d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f2304h;
        if (obj == USE_DEFAULT_TRANSITION) {
            obj = getEnterTransition();
        }
        return obj;
    }

    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.mo5302a();
    }

    public Object getSharedElementEnterTransition() {
        C0522d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f2307k;
    }

    public Object getSharedElementReturnTransition() {
        C0522d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f2308l;
        if (obj == USE_DEFAULT_TRANSITION) {
            obj = getSharedElementEnterTransition();
        }
        return obj;
    }

    /* access modifiers changed from: 0000 */
    public int getStateAfterAnimating() {
        C0522d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return 0;
        }
        return dVar.f2299c;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    public final Fragment getTargetFragment() {
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        C0542j jVar = this.mFragmentManager;
        if (jVar != null) {
            String str = this.mTargetWho;
            if (str != null) {
                return (Fragment) jVar.f2353Z.get(str);
            }
        }
        return null;
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public C0722m getViewLifecycleOwner() {
        C0581s sVar = this.mViewLifecycleOwner;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<C0722m> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public C0707b0 getViewModelStore() {
        C0542j jVar = this.mFragmentManager;
        if (jVar != null) {
            return jVar.mo3227g(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: 0000 */
    public void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C0542j();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    /* access modifiers changed from: 0000 */
    public boolean isHideReplaced() {
        C0522d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return false;
        }
        return dVar.f2315s;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    /* access modifiers changed from: 0000 */
    public boolean isPostponed() {
        C0522d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return false;
        }
        return dVar.f2313q;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 4;
    }

    public final boolean isStateSaved() {
        C0542j jVar = this.mFragmentManager;
        if (jVar == null) {
            return false;
        }
        return jVar.mo3262y();
    }

    public final boolean isVisible() {
        if (isAdded() && !isHidden()) {
            View view = this.mView;
            if (!(view == null || view.getWindowToken() == null || this.mView.getVisibility() != 0)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void noteStateNotSaved() {
        this.mChildFragmentManager.mo3263z();
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        C0537h hVar = this.mHost;
        Activity b = hVar == null ? null : hVar.mo3142b();
        if (b != null) {
            this.mCalled = false;
            onAttach(b);
        }
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (!this.mChildFragmentManager.mo3222d(1)) {
            this.mChildFragmentManager.mo3235k();
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        C0537h hVar = this.mHost;
        Activity b = hVar == null ? null : hVar.mo3142b();
        if (b != null) {
            this.mCalled = false;
            onInflate(b, attributeSet, bundle);
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    /* access modifiers changed from: 0000 */
    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.mo3263z();
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            this.mChildFragmentManager.mo3233j();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onActivityCreated()");
        throw new C0585u(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performAttach() {
        this.mChildFragmentManager.mo3199a(this.mHost, (C0534e) new C0521c(), this);
        this.mCalled = false;
        onAttach(this.mHost.mo3143c());
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onAttach()");
            throw new C0585u(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.mo3186a(configuration);
    }

    /* access modifiers changed from: 0000 */
    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden || (!onContextItemSelected(menuItem) && !this.mChildFragmentManager.mo3203a(menuItem))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.mo3263z();
        this.mState = 1;
        this.mCalled = false;
        this.mSavedStateRegistryController.mo5303a(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.mo4139a(C0716a.ON_CREATE);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onCreate()");
        throw new C0585u(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.mo3202a(menu, menuInflater);
    }

    /* access modifiers changed from: 0000 */
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.mo3263z();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C0581s();
        this.mView = onCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo3364c();
            this.mViewLifecycleOwnerLiveData.mo4096b(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.mo3365d()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: 0000 */
    public void performDestroy() {
        this.mChildFragmentManager.mo3237l();
        this.mLifecycleRegistry.mo4139a(C0716a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onDestroy()");
            throw new C0585u(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void performDestroyView() {
        this.mChildFragmentManager.mo3239m();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo3363a(C0716a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            C4237a.m14568a(this).mo14918a();
            this.mPerformedCreateView = false;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroyView()");
        throw new C0585u(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performDetach() {
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onDetach()");
            throw new C0585u(sb.toString());
        } else if (!this.mChildFragmentManager.mo3261x()) {
            this.mChildFragmentManager.mo3237l();
            this.mChildFragmentManager = new C0542j();
        }
    }

    /* access modifiers changed from: 0000 */
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        this.mLayoutInflater = onGetLayoutInflater(bundle);
        return this.mLayoutInflater;
    }

    /* access modifiers changed from: 0000 */
    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.mo3241n();
    }

    /* access modifiers changed from: 0000 */
    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.mo3201a(z);
    }

    /* access modifiers changed from: 0000 */
    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden || ((!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) && !this.mChildFragmentManager.mo3214b(menuItem))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.mo3189a(menu);
        }
    }

    /* access modifiers changed from: 0000 */
    public void performPause() {
        this.mChildFragmentManager.mo3243o();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo3363a(C0716a.ON_PAUSE);
        }
        this.mLifecycleRegistry.mo4139a(C0716a.ON_PAUSE);
        this.mState = 3;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onPause()");
            throw new C0585u(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.mo3212b(z);
    }

    /* access modifiers changed from: 0000 */
    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.mo3213b(menu);
    }

    /* access modifiers changed from: 0000 */
    public void performPrimaryNavigationFragmentChanged() {
        boolean i = this.mFragmentManager.mo3232i(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != i) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(i);
            onPrimaryNavigationFragmentChanged(i);
            this.mChildFragmentManager.mo3247p();
        }
    }

    /* access modifiers changed from: 0000 */
    public void performResume() {
        this.mChildFragmentManager.mo3263z();
        this.mChildFragmentManager.mo3258u();
        this.mState = 4;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            this.mLifecycleRegistry.mo4139a(C0716a.ON_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo3363a(C0716a.ON_RESUME);
            }
            this.mChildFragmentManager.mo3250q();
            this.mChildFragmentManager.mo3258u();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onResume()");
        throw new C0585u(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo5304b(bundle);
        Parcelable B = this.mChildFragmentManager.mo3179B();
        if (B != null) {
            bundle.putParcelable("android:support:fragments", B);
        }
    }

    /* access modifiers changed from: 0000 */
    public void performStart() {
        this.mChildFragmentManager.mo3263z();
        this.mChildFragmentManager.mo3258u();
        this.mState = 3;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            this.mLifecycleRegistry.mo4139a(C0716a.ON_START);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo3363a(C0716a.ON_START);
            }
            this.mChildFragmentManager.mo3251r();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStart()");
        throw new C0585u(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performStop() {
        this.mChildFragmentManager.mo3253s();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo3363a(C0716a.ON_STOP);
        }
        this.mLifecycleRegistry.mo4139a(C0716a.ON_STOP);
        this.mState = 2;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onStop()");
            throw new C0585u(sb.toString());
        }
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f2313q = true;
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public final void requestPermissions(String[] strArr, int i) {
        C0537h hVar = this.mHost;
        if (hVar != null) {
            hVar.mo3107a(this, strArr, i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public final C0532d requireActivity() {
        C0532d activity = getActivity();
        if (activity != null) {
            return activity;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" does not have any arguments.");
        throw new IllegalStateException(sb.toString());
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }

    public final C0538i requireFragmentManager() {
        C0538i fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            return fragmentManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a host.");
        throw new IllegalStateException(sb.toString());
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        String str = "Fragment ";
        if (getContext() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this);
            sb.append(" is not attached to any Fragment or host");
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this);
        sb2.append(" is not a child Fragment, it is directly attached to ");
        sb2.append(getContext());
        throw new IllegalStateException(sb2.toString());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void restoreChildFragmentState(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                this.mChildFragmentManager.mo3188a(parcelable);
                this.mChildFragmentManager.mo3235k();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mInnerView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onViewStateRestored()");
            throw new C0585u(sb.toString());
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.mo3363a(C0716a.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f2310n = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f2309m = Boolean.valueOf(z);
    }

    /* access modifiers changed from: 0000 */
    public void setAnimatingAway(View view) {
        ensureAnimationInfo().f2297a = view;
    }

    /* access modifiers changed from: 0000 */
    public void setAnimator(Animator animator) {
        ensureAnimationInfo().f2298b = animator;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterSharedElementCallback(C0489m mVar) {
        ensureAnimationInfo().f2311o = mVar;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f2303g = obj;
    }

    public void setExitSharedElementCallback(C0489m mVar) {
        ensureAnimationInfo().f2312p = mVar;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f2305i = obj;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.mo3115i();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().f2315s = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        if (r2 != null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setInitialSavedState(androidx.fragment.app.Fragment.C0525g r2) {
        /*
            r1 = this;
            androidx.fragment.app.j r0 = r1.mFragmentManager
            if (r0 != 0) goto L_0x000f
            if (r2 == 0) goto L_0x000b
            android.os.Bundle r2 = r2.f2316c
            if (r2 == 0) goto L_0x000b
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            r1.mSavedFragmentState = r2
            return
        L_0x000f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Fragment already added"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.setInitialSavedState(androidx.fragment.app.Fragment$g):void");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo3115i();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setNextAnim(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo().f2300d = i;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setNextTransition(int i, int i2) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0) {
            ensureAnimationInfo();
            C0522d dVar = this.mAnimationInfo;
            dVar.f2301e = i;
            dVar.f2302f = i2;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setOnStartEnterTransitionListener(C0524f fVar) {
        ensureAnimationInfo();
        C0524f fVar2 = this.mAnimationInfo.f2314r;
        if (fVar != fVar2) {
            if (fVar == null || fVar2 == null) {
                C0522d dVar = this.mAnimationInfo;
                if (dVar.f2313q) {
                    dVar.f2314r = fVar;
                }
                if (fVar != null) {
                    fVar.mo3023a();
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to set a replacement startPostponedEnterTransition on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f2306j = obj;
    }

    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        C0542j jVar = this.mFragmentManager;
        if (jVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            jVar.mo3190a(this);
        } else {
            jVar.mo3248p(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f2304h = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f2307k = obj;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f2308l = obj;
    }

    /* access modifiers changed from: 0000 */
    public void setStateAfterAnimating(int i) {
        ensureAnimationInfo().f2299c = i;
    }

    public void setTargetFragment(Fragment fragment, int i) {
        C0538i fragmentManager = getFragmentManager();
        C0538i fragmentManager2 = fragment != null ? fragment.getFragmentManager() : null;
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (fragment2 != this) {
                    fragment2 = fragment2.getTargetFragment();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Setting ");
                    sb.append(fragment);
                    sb.append(" as the target of ");
                    sb.append(this);
                    sb.append(" would create a target cycle");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = i;
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fragment ");
        sb2.append(fragment);
        sb2.append(" must share the same FragmentManager to be set as a target fragment");
        throw new IllegalArgumentException(sb2.toString());
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 3 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            this.mFragmentManager.mo3242n(this);
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 3 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        C0537h hVar = this.mHost;
        if (hVar != null) {
            return hVar.mo3109a(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        C0537h hVar = this.mHost;
        if (hVar != null) {
            hVar.mo3106a(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public void startPostponedEnterTransition() {
        C0542j jVar = this.mFragmentManager;
        if (jVar == null || jVar.f2363j0 == null) {
            ensureAnimationInfo().f2313q = false;
        } else if (Looper.myLooper() != this.mFragmentManager.f2363j0.mo3144d().getLooper()) {
            this.mFragmentManager.f2363j0.mo3144d().postAtFrontOfQueue(new C0520b());
        } else {
            callStartTransitionListener();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C4109a.m14083a(this, sb);
        sb.append(" (");
        sb.append(this.mWho);
        sb.append(")");
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" ");
            sb.append(this.mTag);
        }
        sb.append('}');
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        String str2 = ": make sure class name exists, is public, and has an empty constructor that is public";
        String str3 = "Unable to instantiate fragment ";
        try {
            Fragment fragment = (Fragment) C0536g.m2863d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str);
            sb.append(str2);
            throw new C0523e(sb.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(str);
            sb2.append(str2);
            throw new C0523e(sb2.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(str);
            sb3.append(": could not find Fragment constructor");
            throw new C0523e(sb3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str3);
            sb4.append(str);
            sb4.append(": calling Fragment constructor caused an exception");
            throw new C0523e(sb4.toString(), e4);
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().f2313q = true;
        C0542j jVar = this.mFragmentManager;
        if (jVar != null) {
            handler = jVar.f2363j0.mo3144d();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        C0537h hVar = this.mHost;
        if (hVar != null) {
            hVar.mo3105a(this, intent, -1, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        C0537h hVar = this.mHost;
        if (hVar != null) {
            hVar.mo3105a(this, intent, i, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        C0537h hVar = this.mHost;
        if (hVar != null) {
            LayoutInflater f = hVar.mo3112f();
            C0542j jVar = this.mChildFragmentManager;
            jVar.mo3259v();
            C4144g.m14187b(f, jVar);
            return f;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
