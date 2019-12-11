package com.facebook.stetho.inspector.elements.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import com.facebook.stetho.common.Util;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class ActivityTracker {
    private static final ActivityTracker sInstance = new ActivityTracker();
    private final ArrayList<WeakReference<Activity>> mActivities = new ArrayList<>();
    private final List<WeakReference<Activity>> mActivitiesUnmodifiable = Collections.unmodifiableList(this.mActivities);
    private AutomaticTracker mAutomaticTracker;
    private final List<Listener> mListeners = new CopyOnWriteArrayList();

    private static abstract class AutomaticTracker {

        @TargetApi(14)
        private static class AutomaticTrackerICSAndBeyond extends AutomaticTracker {
            private final Application mApplication;
            private final ActivityLifecycleCallbacks mLifecycleCallbacks = new ActivityLifecycleCallbacks() {
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    AutomaticTrackerICSAndBeyond.this.mTracker.add(activity);
                }

                public void onActivityDestroyed(Activity activity) {
                    AutomaticTrackerICSAndBeyond.this.mTracker.remove(activity);
                }

                public void onActivityPaused(Activity activity) {
                }

                public void onActivityResumed(Activity activity) {
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public void onActivityStarted(Activity activity) {
                }

                public void onActivityStopped(Activity activity) {
                }
            };
            /* access modifiers changed from: private */
            public final ActivityTracker mTracker;

            public AutomaticTrackerICSAndBeyond(Application application, ActivityTracker activityTracker) {
                super();
                this.mApplication = application;
                this.mTracker = activityTracker;
            }

            public void register() {
                this.mApplication.registerActivityLifecycleCallbacks(this.mLifecycleCallbacks);
            }

            public void unregister() {
                this.mApplication.unregisterActivityLifecycleCallbacks(this.mLifecycleCallbacks);
            }
        }

        private AutomaticTracker() {
        }

        public static AutomaticTracker newInstanceIfPossible(Application application, ActivityTracker activityTracker) {
            if (VERSION.SDK_INT >= 14) {
                return new AutomaticTrackerICSAndBeyond(application, activityTracker);
            }
            return null;
        }

        public abstract void register();

        public abstract void unregister();
    }

    public interface Listener {
        void onActivityAdded(Activity activity);

        void onActivityRemoved(Activity activity);
    }

    public static ActivityTracker get() {
        return sInstance;
    }

    private static <T> boolean removeFromWeakList(ArrayList<WeakReference<T>> arrayList, T t) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((WeakReference) arrayList.get(i)).get() == t) {
                arrayList.remove(i);
                return true;
            }
        }
        return false;
    }

    public void add(Activity activity) {
        Util.throwIfNull(activity);
        Util.throwIfNot(Looper.myLooper() == Looper.getMainLooper());
        this.mActivities.add(new WeakReference(activity));
        for (Listener onActivityAdded : this.mListeners) {
            onActivityAdded.onActivityAdded(activity);
        }
    }

    public boolean beginTrackingIfPossible(Application application) {
        if (this.mAutomaticTracker == null) {
            AutomaticTracker newInstanceIfPossible = AutomaticTracker.newInstanceIfPossible(application, this);
            if (newInstanceIfPossible != null) {
                newInstanceIfPossible.register();
                this.mAutomaticTracker = newInstanceIfPossible;
                return true;
            }
        }
        return false;
    }

    public boolean endTracking() {
        AutomaticTracker automaticTracker = this.mAutomaticTracker;
        if (automaticTracker == null) {
            return false;
        }
        automaticTracker.unregister();
        this.mAutomaticTracker = null;
        return true;
    }

    public List<WeakReference<Activity>> getActivitiesView() {
        return this.mActivitiesUnmodifiable;
    }

    public void registerListener(Listener listener) {
        this.mListeners.add(listener);
    }

    public void remove(Activity activity) {
        Util.throwIfNull(activity);
        Util.throwIfNot(Looper.myLooper() == Looper.getMainLooper());
        if (removeFromWeakList(this.mActivities, activity)) {
            for (Listener onActivityRemoved : this.mListeners) {
                onActivityRemoved.onActivityRemoved(activity);
            }
        }
    }

    public Activity tryGetTopActivity() {
        if (this.mActivitiesUnmodifiable.isEmpty()) {
            return null;
        }
        for (int size = this.mActivitiesUnmodifiable.size() - 1; size >= 0; size--) {
            Activity activity = (Activity) ((WeakReference) this.mActivitiesUnmodifiable.get(size)).get();
            if (activity != null) {
                return activity;
            }
        }
        return null;
    }

    public void unregisterListener(Listener listener) {
        this.mListeners.remove(listener);
    }
}
