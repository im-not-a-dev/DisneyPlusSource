package com.appboy.p034ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C0872i;
import androidx.recyclerview.widget.C0900t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0797g;
import androidx.recyclerview.widget.RecyclerView.C0802l;
import androidx.recyclerview.widget.RecyclerView.C0807n;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C0981j;
import com.appboy.C1440a;
import com.appboy.p027p.C1516a;
import com.appboy.p027p.C1518c;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.contentcards.AppboyCardAdapter;
import com.appboy.p034ui.contentcards.AppboyEmptyContentCardsAdapter;
import com.appboy.p034ui.contentcards.handlers.DefaultContentCardsUpdateHandler;
import com.appboy.p034ui.contentcards.handlers.DefaultContentCardsViewBindingHandler;
import com.appboy.p034ui.contentcards.handlers.IContentCardsUpdateHandler;
import com.appboy.p034ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.appboy.p034ui.contentcards.recycler.ContentCardsDividerItemDecoration;
import com.appboy.p034ui.contentcards.recycler.SimpleItemTouchHelperCallback;
import java.util.ArrayList;

/* renamed from: com.appboy.ui.AppboyContentCardsFragment */
public class AppboyContentCardsFragment extends Fragment implements C0981j {
    /* access modifiers changed from: private */
    public static final String TAG = C1557c.m7461a(AppboyContentCardsFragment.class);
    /* access modifiers changed from: private */
    public AppboyCardAdapter mCardAdapter;
    /* access modifiers changed from: private */
    public SwipeRefreshLayout mContentCardsSwipeLayout;
    private C1518c<C1516a> mContentCardsUpdatedSubscriber;
    private IContentCardsUpdateHandler mCustomContentCardUpdateHandler;
    private IContentCardsViewBindingHandler mCustomContentCardsViewBindingHandler;
    private IContentCardsUpdateHandler mDefaultContentCardUpdateHandler = new DefaultContentCardsUpdateHandler();
    private IContentCardsViewBindingHandler mDefaultContentCardsViewBindingHandler = new DefaultContentCardsViewBindingHandler();
    /* access modifiers changed from: private */
    public AppboyEmptyContentCardsAdapter mEmptyContentCardsAdapter;
    /* access modifiers changed from: private */
    public final Handler mMainThreadLooper = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public RecyclerView mRecyclerView;
    /* access modifiers changed from: private */
    public Runnable mShowNetworkUnavailableRunnable;

    /* renamed from: com.appboy.ui.AppboyContentCardsFragment$ContentCardsUpdateRunnable */
    private class ContentCardsUpdateRunnable implements Runnable {
        private final C1516a mEvent;

        ContentCardsUpdateRunnable(C1516a aVar) {
            this.mEvent = aVar;
        }

        public void run() {
            String access$300 = AppboyContentCardsFragment.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Updating Content Cards views in response to ContentCardsUpdatedEvent: ");
            sb.append(this.mEvent);
            C1557c.m7471d(access$300, sb.toString());
            AppboyContentCardsFragment.this.mCardAdapter.replaceCards(AppboyContentCardsFragment.this.getContentCardUpdateHandler().handleCardUpdate(this.mEvent));
            AppboyContentCardsFragment.this.mMainThreadLooper.removeCallbacks(AppboyContentCardsFragment.this.mShowNetworkUnavailableRunnable);
            if (this.mEvent.mo6755d() && (this.mEvent.mo6753b() + 60) * 1000 < System.currentTimeMillis()) {
                C1557c.m7469c(AppboyContentCardsFragment.TAG, "ContentCards received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.");
                C1440a.m6921c(AppboyContentCardsFragment.this.getContext()).mo6577b(false);
                if (this.mEvent.mo6754c()) {
                    AppboyContentCardsFragment.this.mContentCardsSwipeLayout.setRefreshing(true);
                    C1557c.m7458a(AppboyContentCardsFragment.TAG, "Old Content Cards was empty, putting up a network spinner and registering the network error message on a delay of 5000ms.");
                    AppboyContentCardsFragment.this.mMainThreadLooper.postDelayed(AppboyContentCardsFragment.this.mShowNetworkUnavailableRunnable, 5000);
                    return;
                }
            }
            if (!this.mEvent.mo6754c()) {
                AppboyContentCardsFragment appboyContentCardsFragment = AppboyContentCardsFragment.this;
                appboyContentCardsFragment.swapRecyclerViewAdapter(appboyContentCardsFragment.mCardAdapter);
            } else {
                AppboyContentCardsFragment appboyContentCardsFragment2 = AppboyContentCardsFragment.this;
                appboyContentCardsFragment2.swapRecyclerViewAdapter(appboyContentCardsFragment2.mEmptyContentCardsAdapter);
            }
            AppboyContentCardsFragment.this.mContentCardsSwipeLayout.setRefreshing(false);
        }
    }

    /* renamed from: com.appboy.ui.AppboyContentCardsFragment$NetworkUnavailableRunnable */
    private class NetworkUnavailableRunnable implements Runnable {
        private final Context mApplicationContext;

        public void run() {
            C1557c.m7471d(AppboyContentCardsFragment.TAG, "Displaying network unavailable toast.");
            Context context = this.mApplicationContext;
            Toast.makeText(context, context.getString(R$string.com_appboy_feed_connection_error_title), 1).show();
            AppboyContentCardsFragment appboyContentCardsFragment = AppboyContentCardsFragment.this;
            appboyContentCardsFragment.swapRecyclerViewAdapter(appboyContentCardsFragment.mEmptyContentCardsAdapter);
            AppboyContentCardsFragment.this.mContentCardsSwipeLayout.setRefreshing(false);
        }

        private NetworkUnavailableRunnable(Context context) {
            this.mApplicationContext = context;
        }
    }

    /* access modifiers changed from: private */
    public void swapRecyclerViewAdapter(C0797g gVar) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null && recyclerView.getAdapter() != gVar) {
            this.mRecyclerView.setAdapter(gVar);
        }
    }

    public IContentCardsUpdateHandler getContentCardUpdateHandler() {
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.mCustomContentCardUpdateHandler;
        return iContentCardsUpdateHandler != null ? iContentCardsUpdateHandler : this.mDefaultContentCardUpdateHandler;
    }

    public IContentCardsViewBindingHandler getContentCardsViewBindingHandler() {
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.mCustomContentCardsViewBindingHandler;
        return iContentCardsViewBindingHandler != null ? iContentCardsViewBindingHandler : this.mDefaultContentCardsViewBindingHandler;
    }

    public void initializeRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        this.mCardAdapter = new AppboyCardAdapter(getContext(), linearLayoutManager, new ArrayList(), getContentCardsViewBindingHandler());
        this.mRecyclerView.setAdapter(this.mCardAdapter);
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        new C0872i(new SimpleItemTouchHelperCallback(this.mCardAdapter)).mo5044a(this.mRecyclerView);
        C0802l itemAnimator = this.mRecyclerView.getItemAnimator();
        if (itemAnimator instanceof C0900t) {
            ((C0900t) itemAnimator).mo5132a(false);
        }
        this.mRecyclerView.mo4381a((C0807n) new ContentCardsDividerItemDecoration(getContext()));
        this.mEmptyContentCardsAdapter = new AppboyEmptyContentCardsAdapter();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mShowNetworkUnavailableRunnable = new NetworkUnavailableRunnable(getContext());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R$layout.com_appboy_content_cards, viewGroup, false);
        this.mRecyclerView = (RecyclerView) inflate.findViewById(R$id.com_appboy_content_cards_recycler);
        initializeRecyclerView();
        this.mContentCardsSwipeLayout = (SwipeRefreshLayout) inflate.findViewById(R$id.appboy_content_cards_swipe_container);
        this.mContentCardsSwipeLayout.setOnRefreshListener(this);
        this.mContentCardsSwipeLayout.setColorSchemeResources(R$color.com_appboy_content_cards_swipe_refresh_color_1, R$color.com_appboy_content_cards_swipe_refresh_color_2, R$color.com_appboy_content_cards_swipe_refresh_color_3, R$color.com_appboy_content_cards_swipe_refresh_color_4);
        return inflate;
    }

    public void onPause() {
        super.onPause();
        C1440a.m6921c(getContext()).mo6561a(this.mContentCardsUpdatedSubscriber, C1516a.class);
        this.mMainThreadLooper.removeCallbacks(this.mShowNetworkUnavailableRunnable);
        this.mCardAdapter.markOnScreenCardsAsRead();
    }

    public void onRefresh() {
        C1440a.m6921c(getContext()).mo6577b(false);
        this.mMainThreadLooper.postDelayed(new Runnable() {
            public void run() {
                AppboyContentCardsFragment.this.mContentCardsSwipeLayout.setRefreshing(false);
            }
        }, 2500);
    }

    public void onResume() {
        super.onResume();
        C1440a.m6921c(getContext()).mo6561a(this.mContentCardsUpdatedSubscriber, C1516a.class);
        if (this.mContentCardsUpdatedSubscriber == null) {
            this.mContentCardsUpdatedSubscriber = new C1518c<C1516a>() {
                public void trigger(C1516a aVar) {
                    AppboyContentCardsFragment.this.mMainThreadLooper.post(new ContentCardsUpdateRunnable(aVar));
                }
            };
        }
        C1440a.m6921c(getContext()).mo6560a(this.mContentCardsUpdatedSubscriber);
        C1440a.m6921c(getContext()).mo6577b(true);
        C1440a.m6921c(getContext()).mo6583e();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        RecyclerView recyclerView = this.mRecyclerView;
        if (!(recyclerView == null || recyclerView.getLayoutManager() == null)) {
            bundle.putParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY", this.mRecyclerView.getLayoutManager().mo3930z());
        }
        AppboyCardAdapter appboyCardAdapter = this.mCardAdapter;
        if (appboyCardAdapter != null) {
            bundle.putStringArrayList("KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY", (ArrayList) appboyCardAdapter.getImpressedCardIds());
        }
    }

    public void onViewStateRestored(final Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.mMainThreadLooper.post(new Runnable() {
                public void run() {
                    Parcelable parcelable = bundle.getParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY");
                    C0808o layoutManager = AppboyContentCardsFragment.this.mRecyclerView.getLayoutManager();
                    if (!(parcelable == null || layoutManager == null)) {
                        layoutManager.mo3845a(parcelable);
                    }
                    ArrayList stringArrayList = bundle.getStringArrayList("KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY");
                    if (stringArrayList != null) {
                        AppboyContentCardsFragment.this.mCardAdapter.setImpressedCardIds(stringArrayList);
                    }
                }
            });
        }
    }
}
