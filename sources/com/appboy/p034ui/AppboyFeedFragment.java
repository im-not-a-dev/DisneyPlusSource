package com.appboy.p034ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.fragment.app.C0532d;
import androidx.fragment.app.C0582t;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C0981j;
import com.appboy.C1440a;
import com.appboy.p025o.C1493b;
import com.appboy.p027p.C1517b;
import com.appboy.p027p.C1518c;
import com.appboy.p030r.p031o.C1547c;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.adapters.AppboyListAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import p096e.p121h.p135s.C4130d;

/* renamed from: com.appboy.ui.AppboyFeedFragment */
public class AppboyFeedFragment extends C0582t implements C0981j {
    /* access modifiers changed from: private */
    public static final String TAG = C1557c.m7461a(AppboyFeedFragment.class);
    /* access modifiers changed from: private */
    public AppboyListAdapter mAdapter;
    /* access modifiers changed from: private */
    public EnumSet<C1493b> mCategories;
    int mCurrentCardIndexAtBottomOfScreen = 0;
    /* access modifiers changed from: private */
    public LinearLayout mEmptyFeedLayout;
    private RelativeLayout mFeedRootLayout;
    /* access modifiers changed from: private */
    public SwipeRefreshLayout mFeedSwipeLayout;
    private C1518c<C1517b> mFeedUpdatedSubscriber;
    /* access modifiers changed from: private */
    public C4130d mGestureDetector;
    /* access modifiers changed from: private */
    public ProgressBar mLoadingSpinner;
    /* access modifiers changed from: private */
    public final Handler mMainThreadLooper = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public LinearLayout mNetworkErrorLayout;
    int mPreviousVisibleHeadCardIndex = 0;
    /* access modifiers changed from: private */
    public final Runnable mShowNetworkError = new Runnable() {
        public void run() {
            if (AppboyFeedFragment.this.mLoadingSpinner != null) {
                AppboyFeedFragment.this.mLoadingSpinner.setVisibility(8);
            }
            if (AppboyFeedFragment.this.mNetworkErrorLayout != null) {
                AppboyFeedFragment.this.mNetworkErrorLayout.setVisibility(0);
            }
        }
    };
    boolean mSkipCardImpressionsReset = false;
    /* access modifiers changed from: private */
    public boolean mSortEnabled = false;
    /* access modifiers changed from: private */
    public View mTransparentFullBoundsContainerView;

    /* renamed from: com.appboy.ui.AppboyFeedFragment$FeedGestureListener */
    public class FeedGestureListener extends SimpleOnGestureListener {
        public FeedGestureListener() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            long eventTime = (motionEvent2.getEventTime() - motionEvent.getEventTime()) * 2;
            AppboyFeedFragment.this.getListView().smoothScrollBy(-((int) ((f2 * ((float) eventTime)) / 1000.0f)), (int) (eventTime * 2));
            return true;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            AppboyFeedFragment.this.getListView().smoothScrollBy((int) f2, 0);
            return true;
        }
    }

    private void setOnScreenCardsToRead() {
        this.mAdapter.batchSetCardsToRead(this.mPreviousVisibleHeadCardIndex, this.mCurrentCardIndexAtBottomOfScreen);
    }

    /* access modifiers changed from: 0000 */
    public void loadFragmentStateFromSavedInstanceState(Bundle bundle) {
        if (bundle != null) {
            if (this.mCategories == null) {
                this.mCategories = C1493b.m7139a();
            }
            this.mPreviousVisibleHeadCardIndex = bundle.getInt("PREVIOUS_VISIBLE_HEAD_CARD_INDEX", 0);
            this.mCurrentCardIndexAtBottomOfScreen = bundle.getInt("CURRENT_CARD_INDEX_AT_BOTTOM_OF_SCREEN", 0);
            this.mSkipCardImpressionsReset = bundle.getBoolean("SKIP_CARD_IMPRESSIONS_RESET", false);
            ArrayList stringArrayList = bundle.getStringArrayList("CARD_CATEGORY");
            if (stringArrayList != null) {
                this.mCategories.clear();
                Iterator it = stringArrayList.iterator();
                while (it.hasNext()) {
                    this.mCategories.add(C1493b.valueOf((String) it.next()));
                }
            }
        }
    }

    @SuppressLint({"InflateParams"})
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        loadFragmentStateFromSavedInstanceState(bundle);
        if (this.mSkipCardImpressionsReset) {
            this.mSkipCardImpressionsReset = false;
        } else {
            this.mAdapter.resetCardImpressionTracker();
            C1557c.m7458a(TAG, "Resetting card impressions.");
        }
        LayoutInflater from = LayoutInflater.from(getActivity());
        final ListView listView = getListView();
        listView.addHeaderView(from.inflate(R$layout.com_appboy_feed_header, null));
        listView.addFooterView(from.inflate(R$layout.com_appboy_feed_footer, null));
        this.mFeedRootLayout.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return AppboyFeedFragment.this.mGestureDetector.mo14699a(motionEvent);
            }
        });
        listView.setOnScrollListener(new OnScrollListener() {
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                AppboyFeedFragment.this.mFeedSwipeLayout.setEnabled(i == 0);
                if (i2 != 0) {
                    int i4 = i - 1;
                    AppboyFeedFragment appboyFeedFragment = AppboyFeedFragment.this;
                    if (i4 > appboyFeedFragment.mPreviousVisibleHeadCardIndex) {
                        appboyFeedFragment.mAdapter.batchSetCardsToRead(AppboyFeedFragment.this.mPreviousVisibleHeadCardIndex, i4);
                    }
                    AppboyFeedFragment appboyFeedFragment2 = AppboyFeedFragment.this;
                    appboyFeedFragment2.mPreviousVisibleHeadCardIndex = i4;
                    appboyFeedFragment2.mCurrentCardIndexAtBottomOfScreen = i + i2;
                }
            }

            public void onScrollStateChanged(AbsListView absListView, int i) {
            }
        });
        this.mTransparentFullBoundsContainerView.setOnTouchListener(new OnTouchListener(this) {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return view.getVisibility() == 0;
            }
        });
        C1440a.m6921c(getContext()).mo6561a(this.mFeedUpdatedSubscriber, C1517b.class);
        this.mFeedUpdatedSubscriber = new C1518c<C1517b>() {
            public void trigger(final C1517b bVar) {
                C0532d activity = AppboyFeedFragment.this.getActivity();
                if (activity != null) {
                    activity.runOnUiThread(new Runnable() {
                        public void run() {
                            String access$500 = AppboyFeedFragment.TAG;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Updating feed views in response to FeedUpdatedEvent: ");
                            sb.append(bVar);
                            C1557c.m7471d(access$500, sb.toString());
                            AppboyFeedFragment.this.mMainThreadLooper.removeCallbacks(AppboyFeedFragment.this.mShowNetworkError);
                            AppboyFeedFragment.this.mNetworkErrorLayout.setVisibility(8);
                            if (bVar.mo6757a(AppboyFeedFragment.this.mCategories) == 0) {
                                listView.setVisibility(8);
                                AppboyFeedFragment.this.mAdapter.clear();
                            } else {
                                AppboyFeedFragment.this.mEmptyFeedLayout.setVisibility(8);
                                AppboyFeedFragment.this.mLoadingSpinner.setVisibility(8);
                                AppboyFeedFragment.this.mTransparentFullBoundsContainerView.setVisibility(8);
                            }
                            if (bVar.mo6758a() && (bVar.mo6759b() + 60) * 1000 < System.currentTimeMillis()) {
                                C1557c.m7469c(AppboyFeedFragment.TAG, "Feed received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.");
                                C1440a.m6921c(AppboyFeedFragment.this.getContext()).mo6586h();
                                if (bVar.mo6757a(AppboyFeedFragment.this.mCategories) == 0) {
                                    C1557c.m7458a(AppboyFeedFragment.TAG, "Old feed was empty, putting up a network spinner and registering the network error message with a delay of 5000ms.");
                                    AppboyFeedFragment.this.mEmptyFeedLayout.setVisibility(8);
                                    AppboyFeedFragment.this.mLoadingSpinner.setVisibility(0);
                                    AppboyFeedFragment.this.mTransparentFullBoundsContainerView.setVisibility(0);
                                    AppboyFeedFragment.this.mMainThreadLooper.postDelayed(AppboyFeedFragment.this.mShowNetworkError, 5000);
                                    return;
                                }
                            }
                            if (bVar.mo6757a(AppboyFeedFragment.this.mCategories) == 0) {
                                AppboyFeedFragment.this.mLoadingSpinner.setVisibility(8);
                                AppboyFeedFragment.this.mEmptyFeedLayout.setVisibility(0);
                                AppboyFeedFragment.this.mTransparentFullBoundsContainerView.setVisibility(0);
                            } else {
                                if (!AppboyFeedFragment.this.mSortEnabled || bVar.mo6757a(AppboyFeedFragment.this.mCategories) == bVar.mo6761c(AppboyFeedFragment.this.mCategories)) {
                                    AppboyFeedFragment.this.mAdapter.replaceFeed(bVar.mo6760b(AppboyFeedFragment.this.mCategories));
                                } else {
                                    AppboyListAdapter access$400 = AppboyFeedFragment.this.mAdapter;
                                    AppboyFeedFragment appboyFeedFragment = AppboyFeedFragment.this;
                                    access$400.replaceFeed(appboyFeedFragment.sortFeedCards(bVar.mo6760b(appboyFeedFragment.mCategories)));
                                }
                                listView.setVisibility(0);
                            }
                            AppboyFeedFragment.this.mFeedSwipeLayout.setRefreshing(false);
                        }
                    });
                }
            }
        };
        C1440a.m6921c(getContext()).mo6573b(this.mFeedUpdatedSubscriber);
        listView.setAdapter(this.mAdapter);
        C1440a.m6921c(getContext()).mo6587i();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.mAdapter == null) {
            this.mAdapter = new AppboyListAdapter(context, R$id.tag, new ArrayList());
            this.mCategories = C1493b.m7139a();
        }
        this.mGestureDetector = new C4130d(context, new FeedGestureListener());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R$layout.com_appboy_feed, viewGroup, false);
        this.mNetworkErrorLayout = (LinearLayout) inflate.findViewById(R$id.com_appboy_feed_network_error);
        this.mLoadingSpinner = (ProgressBar) inflate.findViewById(R$id.com_appboy_feed_loading_spinner);
        this.mEmptyFeedLayout = (LinearLayout) inflate.findViewById(R$id.com_appboy_feed_empty_feed);
        this.mFeedRootLayout = (RelativeLayout) inflate.findViewById(R$id.com_appboy_feed_root);
        this.mFeedSwipeLayout = (SwipeRefreshLayout) inflate.findViewById(R$id.appboy_feed_swipe_container);
        this.mFeedSwipeLayout.setOnRefreshListener(this);
        this.mFeedSwipeLayout.setEnabled(false);
        this.mFeedSwipeLayout.setColorSchemeResources(R$color.com_appboy_newsfeed_swipe_refresh_color_1, R$color.com_appboy_newsfeed_swipe_refresh_color_2, R$color.com_appboy_newsfeed_swipe_refresh_color_3, R$color.com_appboy_newsfeed_swipe_refresh_color_4);
        this.mTransparentFullBoundsContainerView = inflate.findViewById(R$id.com_appboy_feed_transparent_full_bounds_container_view);
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        C1440a.m6921c(getContext()).mo6561a(this.mFeedUpdatedSubscriber, C1517b.class);
        setOnScreenCardsToRead();
    }

    public void onDetach() {
        super.onDetach();
        setListAdapter(null);
    }

    public void onPause() {
        super.onPause();
        setOnScreenCardsToRead();
    }

    public void onRefresh() {
        C1440a.m6921c(getContext()).mo6586h();
        this.mMainThreadLooper.postDelayed(new Runnable() {
            public void run() {
                AppboyFeedFragment.this.mFeedSwipeLayout.setRefreshing(false);
            }
        }, 2500);
    }

    public void onResume() {
        super.onResume();
        C1440a.m6921c(getContext()).mo6584f();
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("PREVIOUS_VISIBLE_HEAD_CARD_INDEX", this.mPreviousVisibleHeadCardIndex);
        bundle.putInt("CURRENT_CARD_INDEX_AT_BOTTOM_OF_SCREEN", this.mCurrentCardIndexAtBottomOfScreen);
        bundle.putBoolean("SKIP_CARD_IMPRESSIONS_RESET", this.mSkipCardImpressionsReset);
        if (this.mCategories == null) {
            this.mCategories = C1493b.m7139a();
        }
        ArrayList arrayList = new ArrayList(this.mCategories.size());
        Iterator it = this.mCategories.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1493b) it.next()).name());
        }
        bundle.putStringArrayList("CARD_CATEGORY", arrayList);
        super.onSaveInstanceState(bundle);
        if (isVisible()) {
            this.mSkipCardImpressionsReset = true;
        }
    }

    public List<C1547c> sortFeedCards(List<C1547c> list) {
        Collections.sort(list, new Comparator<C1547c>(this) {
            public int compare(C1547c cVar, C1547c cVar2) {
                if (cVar.mo6872R() == cVar2.mo6872R()) {
                    return 0;
                }
                return cVar.mo6872R() ? 1 : -1;
            }
        });
        return list;
    }
}
