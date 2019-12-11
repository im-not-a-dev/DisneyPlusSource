package com.bamtechmedia.dominguez.app;

import android.app.ActivityManager;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import android.text.method.TransformationMethod;
import android.util.DisplayMetrics;
import androidx.fragment.app.C0532d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0721l;
import androidx.lifecycle.C0722m;
import androidx.lifecycle.C0741y;
import androidx.work.WorkerFactory;
import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.Market;
import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.account.UserProfileApi;
import com.bamtech.sdk4.bookmarks.BookmarksApi;
import com.bamtech.sdk4.content.SearchOverrides;
import com.bamtech.sdk4.content.custom.CustomContentApi;
import com.bamtech.sdk4.content.search.SearchApi;
import com.bamtech.sdk4.identity.bam.BamIdentityApi;
import com.bamtech.sdk4.media.MediaCapabilitiesProvider;
import com.bamtech.sdk4.paywall.PaywallApi;
import com.bamtech.sdk4.session.SessionInfo;
import com.bamtech.sdk4.session.SessionState;
import com.bamtech.sdk4.subscription.SubscriptionApi;
import com.bamtech.sdk4.useractivity.UserActivityApi;
import com.bamtechmedia.dominguez.about.AboutPresenter;
import com.bamtechmedia.dominguez.about.C2255b;
import com.bamtechmedia.dominguez.about.C2255b.C2256a;
import com.bamtechmedia.dominguez.about.C2257c;
import com.bamtechmedia.dominguez.about.C2258d;
import com.bamtechmedia.dominguez.about.C2261e;
import com.bamtechmedia.dominguez.about.C2262f;
import com.bamtechmedia.dominguez.about.C2262f.C2267e;
import com.bamtechmedia.dominguez.about.C2276i;
import com.bamtechmedia.dominguez.about.C2279k;
import com.bamtechmedia.dominguez.about.C2281l;
import com.bamtechmedia.dominguez.about.p052r.C2287a;
import com.bamtechmedia.dominguez.about.p052r.C2290b;
import com.bamtechmedia.dominguez.about.p052r.C2297c;
import com.bamtechmedia.dominguez.about.p052r.C2299d;
import com.bamtechmedia.dominguez.about.p052r.C2313f;
import com.bamtechmedia.dominguez.about.p052r.C2316g;
import com.bamtechmedia.dominguez.about.p052r.C2320h;
import com.bamtechmedia.dominguez.about.p052r.p053i.C2323a;
import com.bamtechmedia.dominguez.about.p052r.p053i.C2326b;
import com.bamtechmedia.dominguez.analytics.AnalyticsBackgroundResponder;
import com.bamtechmedia.dominguez.analytics.C2334a;
import com.bamtechmedia.dominguez.analytics.C2336b;
import com.bamtechmedia.dominguez.analytics.C2340b0;
import com.bamtechmedia.dominguez.analytics.C2345c0;
import com.bamtechmedia.dominguez.analytics.C2346d;
import com.bamtechmedia.dominguez.analytics.C2347d0;
import com.bamtechmedia.dominguez.analytics.C2348e;
import com.bamtechmedia.dominguez.analytics.C2351f;
import com.bamtechmedia.dominguez.analytics.C2360g;
import com.bamtechmedia.dominguez.analytics.C2361g0;
import com.bamtechmedia.dominguez.analytics.C2362h;
import com.bamtechmedia.dominguez.analytics.C2363h0;
import com.bamtechmedia.dominguez.analytics.C2364i;
import com.bamtechmedia.dominguez.analytics.C2366i0;
import com.bamtechmedia.dominguez.analytics.C2368j;
import com.bamtechmedia.dominguez.analytics.C2369j0;
import com.bamtechmedia.dominguez.analytics.C2370k;
import com.bamtechmedia.dominguez.analytics.C2372k0;
import com.bamtechmedia.dominguez.analytics.C2373l;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2436p;
import com.bamtechmedia.dominguez.analytics.C2447q;
import com.bamtechmedia.dominguez.analytics.C2468r;
import com.bamtechmedia.dominguez.analytics.C2470t;
import com.bamtechmedia.dominguez.analytics.C2471u;
import com.bamtechmedia.dominguez.analytics.C2472v;
import com.bamtechmedia.dominguez.analytics.C2473w;
import com.bamtechmedia.dominguez.analytics.C2474x;
import com.bamtechmedia.dominguez.analytics.C2475y;
import com.bamtechmedia.dominguez.analytics.C2476z;
import com.bamtechmedia.dominguez.analytics.p054l0.C2374a;
import com.bamtechmedia.dominguez.analytics.p054l0.C2377b;
import com.bamtechmedia.dominguez.analytics.p055m0.C2380a;
import com.bamtechmedia.dominguez.analytics.p055m0.C2382b;
import com.bamtechmedia.dominguez.analytics.p055m0.C2383c;
import com.bamtechmedia.dominguez.analytics.p055m0.C2385d;
import com.bamtechmedia.dominguez.analytics.p055m0.C2386e;
import com.bamtechmedia.dominguez.analytics.p055m0.C2389f;
import com.bamtechmedia.dominguez.analytics.p055m0.C2390g;
import com.bamtechmedia.dominguez.analytics.p055m0.C2392h;
import com.bamtechmedia.dominguez.analytics.p055m0.C2395j;
import com.bamtechmedia.dominguez.analytics.p055m0.C2396k;
import com.bamtechmedia.dominguez.analytics.p055m0.C2398l;
import com.bamtechmedia.dominguez.analytics.p055m0.C2399m;
import com.bamtechmedia.dominguez.analytics.p055m0.C2403o;
import com.bamtechmedia.dominguez.analytics.p055m0.C2404p;
import com.bamtechmedia.dominguez.analytics.p055m0.C2406q;
import com.bamtechmedia.dominguez.analytics.p055m0.C2407r;
import com.bamtechmedia.dominguez.analytics.p055m0.C2412s;
import com.bamtechmedia.dominguez.analytics.p056n0.C2414a;
import com.bamtechmedia.dominguez.analytics.p056n0.C2426c;
import com.bamtechmedia.dominguez.analytics.p056n0.C2427d;
import com.bamtechmedia.dominguez.analytics.p056n0.C2428e;
import com.bamtechmedia.dominguez.analytics.p056n0.C2429f;
import com.bamtechmedia.dominguez.analytics.p057o0.C2434c;
import com.bamtechmedia.dominguez.analytics.p057o0.C2435d;
import com.bamtechmedia.dominguez.analytics.p058p0.C2438a;
import com.bamtechmedia.dominguez.analytics.p058p0.C2441b;
import com.bamtechmedia.dominguez.analytics.p058p0.C2442c;
import com.bamtechmedia.dominguez.analytics.p058p0.C2445d;
import com.bamtechmedia.dominguez.analytics.p058p0.C2446e;
import com.bamtechmedia.dominguez.analytics.p059q0.C2451c;
import com.bamtechmedia.dominguez.analytics.p059q0.C2453e;
import com.bamtechmedia.dominguez.analytics.p059q0.C2455f;
import com.bamtechmedia.dominguez.analytics.p059q0.C2457h;
import com.bamtechmedia.dominguez.analytics.p059q0.C2458i;
import com.bamtechmedia.dominguez.analytics.p059q0.C2460j;
import com.bamtechmedia.dominguez.analytics.p059q0.C2461k;
import com.bamtechmedia.dominguez.analytics.p059q0.C2463l;
import com.bamtechmedia.dominguez.analytics.p059q0.C2464m;
import com.bamtechmedia.dominguez.analytics.p059q0.C2466n;
import com.bamtechmedia.dominguez.app.C2486c0.C2487a;
import com.bamtechmedia.dominguez.auth.C2693a0;
import com.bamtechmedia.dominguez.auth.C2702b;
import com.bamtechmedia.dominguez.auth.C2703b0;
import com.bamtechmedia.dominguez.auth.C2704c;
import com.bamtechmedia.dominguez.auth.C2706d;
import com.bamtechmedia.dominguez.auth.C2707d0;
import com.bamtechmedia.dominguez.auth.C2708e;
import com.bamtechmedia.dominguez.auth.C2710f;
import com.bamtechmedia.dominguez.auth.C2712g;
import com.bamtechmedia.dominguez.auth.C2715h;
import com.bamtechmedia.dominguez.auth.C2719j;
import com.bamtechmedia.dominguez.auth.C2719j.C2720a;
import com.bamtechmedia.dominguez.auth.C2722k;
import com.bamtechmedia.dominguez.auth.C2724l;
import com.bamtechmedia.dominguez.auth.C2726m;
import com.bamtechmedia.dominguez.auth.C2727m0;
import com.bamtechmedia.dominguez.auth.C2728n;
import com.bamtechmedia.dominguez.auth.C2738o;
import com.bamtechmedia.dominguez.auth.C2759p;
import com.bamtechmedia.dominguez.auth.C2779q;
import com.bamtechmedia.dominguez.auth.C2784r;
import com.bamtechmedia.dominguez.auth.C2851s;
import com.bamtechmedia.dominguez.auth.C2990u;
import com.bamtechmedia.dominguez.auth.C3031v;
import com.bamtechmedia.dominguez.auth.C3141x;
import com.bamtechmedia.dominguez.auth.C3145z;
import com.bamtechmedia.dominguez.auth.SessionStateObserver;
import com.bamtechmedia.dominguez.auth.p060n0.C2731c;
import com.bamtechmedia.dominguez.auth.p060n0.C2732d;
import com.bamtechmedia.dominguez.auth.p060n0.C2733e;
import com.bamtechmedia.dominguez.auth.p060n0.C2733e.C2734a;
import com.bamtechmedia.dominguez.auth.p060n0.C2735f;
import com.bamtechmedia.dominguez.auth.p060n0.C2736g;
import com.bamtechmedia.dominguez.auth.p060n0.C2737h;
import com.bamtechmedia.dominguez.auth.p061o0.C2739a;
import com.bamtechmedia.dominguez.auth.p061o0.C2740b;
import com.bamtechmedia.dominguez.auth.p061o0.C2743d;
import com.bamtechmedia.dominguez.auth.p061o0.C2744e;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2747a;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2750c;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2752a;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2754c;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2755d;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2756e;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2757f;
import com.bamtechmedia.dominguez.auth.p064p0.C2760a;
import com.bamtechmedia.dominguez.auth.p064p0.C2763b;
import com.bamtechmedia.dominguez.auth.p064p0.C2769c;
import com.bamtechmedia.dominguez.auth.p064p0.C2771e;
import com.bamtechmedia.dominguez.auth.p064p0.C2774f;
import com.bamtechmedia.dominguez.auth.p064p0.C2776h;
import com.bamtechmedia.dominguez.auth.p064p0.C2778i;
import com.bamtechmedia.dominguez.auth.p065q0.C2783b;
import com.bamtechmedia.dominguez.auth.p066r0.C2793c;
import com.bamtechmedia.dominguez.auth.p066r0.C2795d;
import com.bamtechmedia.dominguez.auth.p066r0.C2795d.C2796a;
import com.bamtechmedia.dominguez.auth.p066r0.C2797e;
import com.bamtechmedia.dominguez.auth.p066r0.C2807h;
import com.bamtechmedia.dominguez.auth.p066r0.C2808i;
import com.bamtechmedia.dominguez.auth.p066r0.C2809j;
import com.bamtechmedia.dominguez.auth.p066r0.C2811k;
import com.bamtechmedia.dominguez.auth.p066r0.C2813l;
import com.bamtechmedia.dominguez.auth.p067s0.C2853a0;
import com.bamtechmedia.dominguez.auth.p067s0.C2855b0;
import com.bamtechmedia.dominguez.auth.p067s0.C2857c0;
import com.bamtechmedia.dominguez.auth.p067s0.C2859d0;
import com.bamtechmedia.dominguez.auth.p067s0.C2862f;
import com.bamtechmedia.dominguez.auth.p067s0.C2864g;
import com.bamtechmedia.dominguez.auth.p067s0.C2865g0;
import com.bamtechmedia.dominguez.auth.p067s0.C2865g0.C2866a;
import com.bamtechmedia.dominguez.auth.p067s0.C2867h;
import com.bamtechmedia.dominguez.auth.p067s0.C2868h0;
import com.bamtechmedia.dominguez.auth.p067s0.C2869i;
import com.bamtechmedia.dominguez.auth.p067s0.C2870i0;
import com.bamtechmedia.dominguez.auth.p067s0.C2871j;
import com.bamtechmedia.dominguez.auth.p067s0.C2872j0;
import com.bamtechmedia.dominguez.auth.p067s0.C2873k;
import com.bamtechmedia.dominguez.auth.p067s0.C2873k.C2874a;
import com.bamtechmedia.dominguez.auth.p067s0.C2875k0;
import com.bamtechmedia.dominguez.auth.p067s0.C2876l;
import com.bamtechmedia.dominguez.auth.p067s0.C2879l0;
import com.bamtechmedia.dominguez.auth.p067s0.C2880m;
import com.bamtechmedia.dominguez.auth.p067s0.C2881m0;
import com.bamtechmedia.dominguez.auth.p067s0.C2887n;
import com.bamtechmedia.dominguez.auth.p067s0.C2888n0;
import com.bamtechmedia.dominguez.auth.p067s0.C2889o;
import com.bamtechmedia.dominguez.auth.p067s0.C2901o0;
import com.bamtechmedia.dominguez.auth.p067s0.C2919p;
import com.bamtechmedia.dominguez.auth.p067s0.C2922r;
import com.bamtechmedia.dominguez.auth.p067s0.C2922r.C2923a;
import com.bamtechmedia.dominguez.auth.p067s0.C2924s;
import com.bamtechmedia.dominguez.auth.p067s0.C2925t;
import com.bamtechmedia.dominguez.auth.p067s0.C2926u;
import com.bamtechmedia.dominguez.auth.p067s0.C2927v;
import com.bamtechmedia.dominguez.auth.p067s0.C2928w;
import com.bamtechmedia.dominguez.auth.p067s0.C2940x;
import com.bamtechmedia.dominguez.auth.p067s0.C2947z;
import com.bamtechmedia.dominguez.auth.p067s0.C2947z.C2948a;
import com.bamtechmedia.dominguez.auth.p068t0.C2951b;
import com.bamtechmedia.dominguez.auth.p068t0.C2954d;
import com.bamtechmedia.dominguez.auth.p068t0.C2954d.C2955a;
import com.bamtechmedia.dominguez.auth.p068t0.C2956e;
import com.bamtechmedia.dominguez.auth.p068t0.C2957f;
import com.bamtechmedia.dominguez.auth.p068t0.C2967g;
import com.bamtechmedia.dominguez.auth.p068t0.C2968h;
import com.bamtechmedia.dominguez.auth.p068t0.C2977j;
import com.bamtechmedia.dominguez.auth.p068t0.C2986k;
import com.bamtechmedia.dominguez.auth.p068t0.C2989m;
import com.bamtechmedia.dominguez.auth.p069u0.C2993c;
import com.bamtechmedia.dominguez.auth.p069u0.C2993c.C2994a;
import com.bamtechmedia.dominguez.auth.p069u0.C2995d;
import com.bamtechmedia.dominguez.auth.p069u0.C2996e;
import com.bamtechmedia.dominguez.auth.p069u0.C2997f;
import com.bamtechmedia.dominguez.auth.p069u0.C3004g;
import com.bamtechmedia.dominguez.auth.p069u0.C3015h;
import com.bamtechmedia.dominguez.auth.p069u0.C3017j;
import com.bamtechmedia.dominguez.auth.p070v0.C3033b;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3058c;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3061e;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3061e.C3062a;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3063f;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3064g;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3076h;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3077i;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3095d;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3105e;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3107f;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3109h;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3109h.C3110a;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3111i;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3112j;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3113k;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3114l;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3125m;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3126n;
import com.bamtechmedia.dominguez.auth.register.C2827b;
import com.bamtechmedia.dominguez.auth.register.C2830d;
import com.bamtechmedia.dominguez.auth.register.C2830d.C2831a;
import com.bamtechmedia.dominguez.auth.register.C2832e;
import com.bamtechmedia.dominguez.auth.register.C2833f;
import com.bamtechmedia.dominguez.auth.register.C2841g;
import com.bamtechmedia.dominguez.auth.register.C2842h;
import com.bamtechmedia.dominguez.auth.register.RegisterAccountAction;
import com.bamtechmedia.dominguez.background.C3146a;
import com.bamtechmedia.dominguez.background.MainActivityBackgroundResponder;
import com.bamtechmedia.dominguez.bookmarks.C3163a;
import com.bamtechmedia.dominguez.bookmarks.C3164b;
import com.bamtechmedia.dominguez.bookmarks.C3165c;
import com.bamtechmedia.dominguez.bookmarks.C3167e;
import com.bamtechmedia.dominguez.bookmarks.LocalBookmarksRegistry;
import com.bamtechmedia.dominguez.brand.BrandPageAnimationHelper;
import com.bamtechmedia.dominguez.brand.C3176e;
import com.bamtechmedia.dominguez.brand.C3188f;
import com.bamtechmedia.dominguez.brand.C3189g;
import com.bamtechmedia.dominguez.brand.C3192i;
import com.bamtechmedia.dominguez.brand.C3192i.C3193a;
import com.bamtechmedia.dominguez.brand.C3194j;
import com.bamtechmedia.dominguez.brand.C3195k;
import com.bamtechmedia.dominguez.brand.C3196l;
import com.bamtechmedia.dominguez.brand.C3197m;
import com.bamtechmedia.dominguez.brand.C3198n;
import com.bamtechmedia.dominguez.brand.C3199o;
import com.bamtechmedia.dominguez.channels.p073tv.C3204a;
import com.bamtechmedia.dominguez.channels.p073tv.C3206b;
import com.bamtechmedia.dominguez.channels.p073tv.C3208d;
import com.bamtechmedia.dominguez.channels.p073tv.C3209e;
import com.bamtechmedia.dominguez.channels.p073tv.C3210f;
import com.bamtechmedia.dominguez.channels.p073tv.C3210f.C3211a;
import com.bamtechmedia.dominguez.channels.p073tv.ChannelLifecycleObserver;
import com.bamtechmedia.dominguez.channels.p073tv.p074g.C3212a;
import com.bamtechmedia.dominguez.channels.p073tv.p074g.C3214b;
import com.bamtechmedia.dominguez.channels.p073tv.p074g.C3215c;
import com.bamtechmedia.dominguez.channels.p073tv.p075h.C3216a;
import com.bamtechmedia.dominguez.channels.p073tv.p075h.C3217b;
import com.bamtechmedia.dominguez.channels.p073tv.p075h.C3219c;
import com.bamtechmedia.dominguez.channels.p073tv.p076i.C3221a;
import com.bamtechmedia.dominguez.channels.p073tv.p076i.C3222b;
import com.bamtechmedia.dominguez.channels.p073tv.p077j.C3225a;
import com.bamtechmedia.dominguez.channels.p073tv.p077j.C3232c;
import com.bamtechmedia.dominguez.channels.p073tv.p077j.C3233d;
import com.bamtechmedia.dominguez.channels.p073tv.p077j.C3234e;
import com.bamtechmedia.dominguez.channels.p073tv.p077j.C3235f;
import com.bamtechmedia.dominguez.channels.p073tv.receiver.C3236a;
import com.bamtechmedia.dominguez.channels.p073tv.receiver.DeletedProgramBroadcastReceiver;
import com.bamtechmedia.dominguez.channels.p073tv.worker.C3249a;
import com.bamtechmedia.dominguez.channels.p073tv.worker.C3250b;
import com.bamtechmedia.dominguez.channels.p073tv.worker.C3252d;
import com.bamtechmedia.dominguez.channels.p073tv.worker.HideChannelsWorker.C3237a;
import com.bamtechmedia.dominguez.channels.p073tv.worker.HideChannelsWorker.C3238b;
import com.bamtechmedia.dominguez.channels.p073tv.worker.SyncChannelWorker.C3241b;
import com.bamtechmedia.dominguez.channels.p073tv.worker.SyncChannelWorker.C3243c;
import com.bamtechmedia.dominguez.channels.p073tv.worker.SyncPlayNextChannelWorker.C3246a;
import com.bamtechmedia.dominguez.channels.p073tv.worker.SyncPlayNextChannelWorker.C3247b;
import com.bamtechmedia.dominguez.collections.AssetStaticImageHandler;
import com.bamtechmedia.dominguez.collections.AssetTransitionHandler;
import com.bamtechmedia.dominguez.collections.C3280a;
import com.bamtechmedia.dominguez.collections.C3285a0;
import com.bamtechmedia.dominguez.collections.C3286b;
import com.bamtechmedia.dominguez.collections.C3287b0;
import com.bamtechmedia.dominguez.collections.C3289c0;
import com.bamtechmedia.dominguez.collections.C3317e;
import com.bamtechmedia.dominguez.collections.C3320f;
import com.bamtechmedia.dominguez.collections.C3324g;
import com.bamtechmedia.dominguez.collections.C3327g0;
import com.bamtechmedia.dominguez.collections.C3330h;
import com.bamtechmedia.dominguez.collections.C3408j.C3409a;
import com.bamtechmedia.dominguez.collections.C3416k0;
import com.bamtechmedia.dominguez.collections.C3419l;
import com.bamtechmedia.dominguez.collections.C3421m;
import com.bamtechmedia.dominguez.collections.C3428n;
import com.bamtechmedia.dominguez.collections.C3432o;
import com.bamtechmedia.dominguez.collections.C3454q;
import com.bamtechmedia.dominguez.collections.C3457r.C3464g;
import com.bamtechmedia.dominguez.collections.C3500v;
import com.bamtechmedia.dominguez.collections.C3501w;
import com.bamtechmedia.dominguez.collections.C3502x;
import com.bamtechmedia.dominguez.collections.C3504y;
import com.bamtechmedia.dominguez.collections.caching.C3291a;
import com.bamtechmedia.dominguez.collections.caching.C3292b;
import com.bamtechmedia.dominguez.collections.caching.C3293c;
import com.bamtechmedia.dominguez.collections.caching.C3295e;
import com.bamtechmedia.dominguez.collections.caching.C3314g;
import com.bamtechmedia.dominguez.collections.items.C3341a;
import com.bamtechmedia.dominguez.collections.items.C3346d;
import com.bamtechmedia.dominguez.collections.items.C3349f;
import com.bamtechmedia.dominguez.collections.items.C3350g.C3353c;
import com.bamtechmedia.dominguez.collections.items.C3355h.C3357b;
import com.bamtechmedia.dominguez.collections.items.C3364j;
import com.bamtechmedia.dominguez.collections.items.C3365k;
import com.bamtechmedia.dominguez.collections.items.C3366l.C3367a;
import com.bamtechmedia.dominguez.collections.items.C3374o;
import com.bamtechmedia.dominguez.collections.items.C3375p.C3376a;
import com.bamtechmedia.dominguez.collections.items.C3391u;
import com.bamtechmedia.dominguez.collections.items.C3392v.C3393a;
import com.bamtechmedia.dominguez.collections.items.C3394w;
import com.bamtechmedia.dominguez.collections.items.C3396x;
import com.bamtechmedia.dominguez.collections.items.C3397y.C3398a;
import com.bamtechmedia.dominguez.collections.items.C3402z.C3404b;
import com.bamtechmedia.dominguez.collections.items.ShelfFragmentHelper;
import com.bamtechmedia.dominguez.collections.p079n0.C3431b;
import com.bamtechmedia.dominguez.collections.p080o0.C3436c;
import com.bamtechmedia.dominguez.collections.p080o0.C3438d;
import com.bamtechmedia.dominguez.collections.p080o0.C3439e;
import com.bamtechmedia.dominguez.collections.p080o0.C3440f;
import com.bamtechmedia.dominguez.collections.p080o0.C3441g;
import com.bamtechmedia.dominguez.collections.p080o0.C3442h;
import com.bamtechmedia.dominguez.collections.p080o0.C3443i;
import com.bamtechmedia.dominguez.collections.p080o0.C3448m;
import com.bamtechmedia.dominguez.collections.p080o0.C3449n;
import com.bamtechmedia.dominguez.collections.p080o0.C3450o;
import com.bamtechmedia.dominguez.collections.p081ui.C3490a;
import com.bamtechmedia.dominguez.collections.p081ui.C3492b;
import com.bamtechmedia.dominguez.collections.p081ui.C3493c;
import com.bamtechmedia.dominguez.collections.p081ui.C3495d;
import com.bamtechmedia.dominguez.config.AppConfigRepository;
import com.bamtechmedia.dominguez.config.C3516a0;
import com.bamtechmedia.dominguez.config.C3517b;
import com.bamtechmedia.dominguez.config.C3518b0;
import com.bamtechmedia.dominguez.config.C3519c;
import com.bamtechmedia.dominguez.config.C3521c0;
import com.bamtechmedia.dominguez.config.C3522d;
import com.bamtechmedia.dominguez.config.C3523d0;
import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.config.C3528f;
import com.bamtechmedia.dominguez.config.C3532h.C3533a;
import com.bamtechmedia.dominguez.config.C3550h0;
import com.bamtechmedia.dominguez.config.C3551i;
import com.bamtechmedia.dominguez.config.C3552i0;
import com.bamtechmedia.dominguez.config.C3557k0;
import com.bamtechmedia.dominguez.config.C3559l0;
import com.bamtechmedia.dominguez.config.C3561m0;
import com.bamtechmedia.dominguez.config.C3563n;
import com.bamtechmedia.dominguez.config.C3564n0;
import com.bamtechmedia.dominguez.config.C3565o;
import com.bamtechmedia.dominguez.config.C3569q;
import com.bamtechmedia.dominguez.config.C3571r;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3574s;
import com.bamtechmedia.dominguez.config.C3576t;
import com.bamtechmedia.dominguez.config.C3578u;
import com.bamtechmedia.dominguez.config.C3579v;
import com.bamtechmedia.dominguez.config.C3580w;
import com.bamtechmedia.dominguez.config.C3581x;
import com.bamtechmedia.dominguez.config.C3582y;
import com.bamtechmedia.dominguez.config.C3583z;
import com.bamtechmedia.dominguez.config.p082t0.C3577a;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.C3585a;
import com.bamtechmedia.dominguez.core.C3586b;
import com.bamtechmedia.dominguez.core.C3590c;
import com.bamtechmedia.dominguez.core.C3796d;
import com.bamtechmedia.dominguez.core.content.C3653c;
import com.bamtechmedia.dominguez.core.content.C3716q;
import com.bamtechmedia.dominguez.core.content.C3718r;
import com.bamtechmedia.dominguez.core.content.C3723s;
import com.bamtechmedia.dominguez.core.content.assets.C3629d;
import com.bamtechmedia.dominguez.core.content.assets.C3631e;
import com.bamtechmedia.dominguez.core.content.collections.C3660c;
import com.bamtechmedia.dominguez.core.content.collections.C3661d;
import com.bamtechmedia.dominguez.core.content.collections.C3662e;
import com.bamtechmedia.dominguez.core.content.collections.C3663f;
import com.bamtechmedia.dominguez.core.content.collections.C3666g;
import com.bamtechmedia.dominguez.core.content.collections.C3668i;
import com.bamtechmedia.dominguez.core.content.collections.C3675j;
import com.bamtechmedia.dominguez.core.content.collections.C3676k;
import com.bamtechmedia.dominguez.core.content.collections.C3678l;
import com.bamtechmedia.dominguez.core.content.collections.C3679m;
import com.bamtechmedia.dominguez.core.content.playback.queryaction.C3712b;
import com.bamtechmedia.dominguez.core.content.playback.queryaction.C3713c;
import com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl;
import com.bamtechmedia.dominguez.core.content.search.C3727b;
import com.bamtechmedia.dominguez.core.content.search.C3731c;
import com.bamtechmedia.dominguez.core.content.search.C3732d;
import com.bamtechmedia.dominguez.core.content.search.C3733e;
import com.bamtechmedia.dominguez.core.content.search.C3741f;
import com.bamtechmedia.dominguez.core.content.search.C3742g;
import com.bamtechmedia.dominguez.core.content.search.C3743h;
import com.bamtechmedia.dominguez.core.content.search.C3748i;
import com.bamtechmedia.dominguez.core.content.search.C3751k;
import com.bamtechmedia.dominguez.core.content.search.C3753l;
import com.bamtechmedia.dominguez.core.content.sets.C3762a;
import com.bamtechmedia.dominguez.core.content.sets.C3764b;
import com.bamtechmedia.dominguez.core.content.sets.C3768d;
import com.bamtechmedia.dominguez.core.content.sets.C3775e;
import com.bamtechmedia.dominguez.core.content.sets.C3776f;
import com.bamtechmedia.dominguez.core.content.sets.C3777g;
import com.bamtechmedia.dominguez.core.content.sets.C3780j;
import com.bamtechmedia.dominguez.core.content.sets.C3780j.C3784d;
import com.bamtechmedia.dominguez.core.content.sets.C3786k;
import com.bamtechmedia.dominguez.core.content.sets.C3787l;
import com.bamtechmedia.dominguez.core.content.sets.RemoteContentSetDataSource;
import com.bamtechmedia.dominguez.core.design.widgets.p213e.C5681a;
import com.bamtechmedia.dominguez.core.framework.C5737c;
import com.bamtechmedia.dominguez.core.lifecycle.AppPresenceImpl;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a;
import com.bamtechmedia.dominguez.core.lifecycle.C5770b;
import com.bamtechmedia.dominguez.core.lifecycle.C5771c;
import com.bamtechmedia.dominguez.core.p084g.C3807b;
import com.bamtechmedia.dominguez.core.p087h.C3824a;
import com.bamtechmedia.dominguez.core.p087h.C3827c;
import com.bamtechmedia.dominguez.core.p087h.C3829e;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3848a;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3850c;
import com.bamtechmedia.dominguez.core.p214j.C5756a;
import com.bamtechmedia.dominguez.core.p214j.C5757b;
import com.bamtechmedia.dominguez.core.p215k.C5758a;
import com.bamtechmedia.dominguez.core.p215k.C5759b;
import com.bamtechmedia.dominguez.core.p218n.C5773a;
import com.bamtechmedia.dominguez.core.p218n.C5792f;
import com.bamtechmedia.dominguez.core.recycler.C5812b;
import com.bamtechmedia.dominguez.core.recycler.C5812b.C5813a;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper;
import com.bamtechmedia.dominguez.core.utils.C5821c0;
import com.bamtechmedia.dominguez.core.utils.C5824d0;
import com.bamtechmedia.dominguez.core.utils.C5825e;
import com.bamtechmedia.dominguez.core.utils.C5862q0;
import com.bamtechmedia.dominguez.core.utils.C5865r0;
import com.bamtechmedia.dominguez.core.utils.p222s0.C5868b;
import com.bamtechmedia.dominguez.core.utils.p222s0.C5869c;
import com.bamtechmedia.dominguez.core.utils.p222s0.C5871e;
import com.bamtechmedia.dominguez.core.utils.p222s0.C5872f;
import com.bamtechmedia.dominguez.core.utils.p222s0.C5873g;
import com.bamtechmedia.dominguez.ctvactivation.api.CtvActivationLifecycleObserver;
import com.bamtechmedia.dominguez.detail.common.C5918e;
import com.bamtechmedia.dominguez.detail.common.C5969i;
import com.bamtechmedia.dominguez.detail.common.C5985m;
import com.bamtechmedia.dominguez.detail.common.C5988n;
import com.bamtechmedia.dominguez.detail.common.C5996p;
import com.bamtechmedia.dominguez.detail.common.C5997q;
import com.bamtechmedia.dominguez.detail.common.C5998r;
import com.bamtechmedia.dominguez.detail.common.C6000s;
import com.bamtechmedia.dominguez.detail.common.C6002t;
import com.bamtechmedia.dominguez.detail.common.C6004v;
import com.bamtechmedia.dominguez.detail.common.C6009y;
import com.bamtechmedia.dominguez.detail.common.C6011z;
import com.bamtechmedia.dominguez.detail.common.formats.C5929b;
import com.bamtechmedia.dominguez.detail.common.formats.C5935c;
import com.bamtechmedia.dominguez.detail.common.formats.C5938d;
import com.bamtechmedia.dominguez.detail.common.offline.DetailOfflineStateMonitor;
import com.bamtechmedia.dominguez.detail.common.p226c0.C5910b;
import com.bamtechmedia.dominguez.detail.common.p226c0.C5911c;
import com.bamtechmedia.dominguez.detail.common.p226c0.C5912d;
import com.bamtechmedia.dominguez.detail.common.p228e0.C5921b;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5944a;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5947b;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5948c;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5950d;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5951e;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5955f;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5956g;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5957h;
import com.bamtechmedia.dominguez.detail.movie.data.C6019b;
import com.bamtechmedia.dominguez.detail.movie.data.MovieDetailRemoteDataSource;
import com.bamtechmedia.dominguez.detail.series.data.EpisodeDataSource;
import com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource;
import com.bamtechmedia.dominguez.dialogs.tier2.C6056a;
import com.bamtechmedia.dominguez.dialogs.tier2.C6061b;
import com.bamtechmedia.dominguez.dictionaries.C6063a;
import com.bamtechmedia.dominguez.dictionaries.C6064b;
import com.bamtechmedia.dominguez.dictionaries.C6065c;
import com.bamtechmedia.dominguez.dictionaries.C6067d;
import com.bamtechmedia.dominguez.dictionaries.C6068e;
import com.bamtechmedia.dominguez.dictionaries.C6071f;
import com.bamtechmedia.dominguez.dictionaries.C6072g;
import com.bamtechmedia.dominguez.dictionaries.C6081i;
import com.bamtechmedia.dominguez.dictionaries.C6082j;
import com.bamtechmedia.dominguez.dictionaries.C6086k;
import com.bamtechmedia.dominguez.dictionaries.C6087l.C6088a;
import com.bamtechmedia.dominguez.dictionaries.C6089m;
import com.bamtechmedia.dominguez.dictionaries.C6090n;
import com.bamtechmedia.dominguez.dictionaries.C6091o;
import com.bamtechmedia.dominguez.dictionaries.C6093p;
import com.bamtechmedia.dominguez.discover.C6097c;
import com.bamtechmedia.dominguez.discover.C6098d;
import com.bamtechmedia.dominguez.discover.C6099e;
import com.bamtechmedia.dominguez.discover.C6101f;
import com.bamtechmedia.dominguez.discover.C6103h;
import com.bamtechmedia.dominguez.discover.C6103h.C6104a;
import com.bamtechmedia.dominguez.discover.C6105i;
import com.bamtechmedia.dominguez.discover.C6106j;
import com.bamtechmedia.dominguez.discover.p233l.C6108a;
import com.bamtechmedia.dominguez.legal.DefaultLegalApi;
import com.bamtechmedia.dominguez.legal.FeatureLegalModule_LegalFragmentFactoryFactory;
import com.bamtechmedia.dominguez.legal.FeatureLegalModule_ProvideLegalApiConfigFactory;
import com.bamtechmedia.dominguez.legal.LegalApiConfig;
import com.bamtechmedia.dominguez.legal.LegalCenterAnalytics;
import com.bamtechmedia.dominguez.legal.LegalCenterBindingModule_FragmentModule_ViewModelFactory;
import com.bamtechmedia.dominguez.legal.LegalCenterBindingModule_LegalCenterFragment.LegalCenterFragmentSubcomponent;
import com.bamtechmedia.dominguez.legal.LegalCenterBindingModule_LegalCenterFragment.LegalCenterFragmentSubcomponent.Factory;
import com.bamtechmedia.dominguez.legal.LegalCenterFragment;
import com.bamtechmedia.dominguez.legal.LegalCenterFragment_MembersInjector;
import com.bamtechmedia.dominguez.legal.LegalCenterItemsFactory;
import com.bamtechmedia.dominguez.legal.LegalCenterViewModel;
import com.bamtechmedia.dominguez.legal.LegalDocumentFinder;
import com.bamtechmedia.dominguez.legal.LegalLinkHandler;
import com.bamtechmedia.dominguez.legal.OnboardingLegalRouter;
import com.bamtechmedia.dominguez.legal.api.LegalRouter;
import com.bamtechmedia.dominguez.main.C6127c;
import com.bamtechmedia.dominguez.main.C6129e;
import com.bamtechmedia.dominguez.main.C6130f;
import com.bamtechmedia.dominguez.main.C6131g;
import com.bamtechmedia.dominguez.main.C6133i;
import com.bamtechmedia.dominguez.main.C6135k;
import com.bamtechmedia.dominguez.main.C6136l;
import com.bamtechmedia.dominguez.main.C6140n;
import com.bamtechmedia.dominguez.main.C6141o;
import com.bamtechmedia.dominguez.main.C6142p;
import com.bamtechmedia.dominguez.main.C6142p.C6143a;
import com.bamtechmedia.dominguez.main.C6144q;
import com.bamtechmedia.dominguez.main.C6172s;
import com.bamtechmedia.dominguez.main.MainActivity;
import com.bamtechmedia.dominguez.main.p234w.C6206a;
import com.bamtechmedia.dominguez.main.p234w.C6215d;
import com.bamtechmedia.dominguez.main.p235x.C6217b;
import com.bamtechmedia.dominguez.main.p235x.C6218c;
import com.bamtechmedia.dominguez.main.p235x.C6234e;
import com.bamtechmedia.dominguez.main.p235x.C6236g;
import com.bamtechmedia.dominguez.main.p235x.C6237h;
import com.bamtechmedia.dominguez.main.p235x.C6238i;
import com.bamtechmedia.dominguez.main.startup.AppLaunchAnalyticsLifecycleObserver;
import com.bamtechmedia.dominguez.main.startup.C6177a;
import com.bamtechmedia.dominguez.main.startup.C6178b;
import com.bamtechmedia.dominguez.main.startup.C6180c;
import com.bamtechmedia.dominguez.main.startup.C6181d;
import com.bamtechmedia.dominguez.main.startup.C6188h;
import com.bamtechmedia.dominguez.main.startup.C6195i;
import com.bamtechmedia.dominguez.main.startup.C6196j;
import com.bamtechmedia.dominguez.main.startup.C6197k;
import com.bamtechmedia.dominguez.main.startup.C6198l;
import com.bamtechmedia.dominguez.main.startup.C6199m;
import com.bamtechmedia.dominguez.main.startup.C6202n;
import com.bamtechmedia.dominguez.offline.C6250g;
import com.bamtechmedia.dominguez.offline.C6251h;
import com.bamtechmedia.dominguez.offline.StreamingPreferences;
import com.bamtechmedia.dominguez.playback.C6266a;
import com.bamtechmedia.dominguez.playback.C6269b;
import com.bamtechmedia.dominguez.playback.common.background.PlaybackActivityBackgroundResponder;
import com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter;
import com.bamtechmedia.dominguez.playback.common.query.C6294a;
import com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction;
import com.bamtechmedia.dominguez.playback.common.tracks.C6312a;
import com.bamtechmedia.dominguez.playback.common.tracks.C6314b;
import com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter;
import com.bamtechmedia.dominguez.playback.mobile.LocalBookmarksMarker;
import com.bamtechmedia.dominguez.playback.p237m.C6342f;
import com.bamtechmedia.dominguez.playback.p237m.p238i.C6374a;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6381a;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6383b;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6384c;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6391e;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6392f;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6394h;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6409i;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6410j;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6413k;
import com.bamtechmedia.dominguez.playback.p237m.p240k.C6414a;
import com.bamtechmedia.dominguez.playback.p237m.p241l.C6419a;
import com.bamtechmedia.dominguez.playback.p237m.p242m.C6421a;
import com.bamtechmedia.dominguez.playback.p237m.p242m.C6423b;
import com.bamtechmedia.dominguez.playback.p237m.p242m.C6424c;
import com.bamtechmedia.dominguez.playback.p237m.p242m.C6425d;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p243e.C6427a;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p243e.C6433b;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p244f.C6434a;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p244f.C6439c;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p244f.C6446e;
import com.bamtechmedia.dominguez.playback.p237m.p245n.C6448b;
import com.bamtechmedia.dominguez.playback.p237m.p245n.C6453d;
import com.bamtechmedia.dominguez.playback.p237m.p245n.C6454e;
import com.bamtechmedia.dominguez.playback.p237m.p251p.C6493a;
import com.bamtechmedia.dominguez.playback.p237m.p251p.C6494b;
import com.bamtechmedia.dominguez.playback.p237m.p251p.C6495c;
import com.bamtechmedia.dominguez.playback.p237m.p251p.C6496d;
import com.bamtechmedia.dominguez.playback.p237m.p251p.C6497e;
import com.bamtechmedia.dominguez.playback.p237m.p251p.C6498f;
import com.bamtechmedia.dominguez.playback.p237m.p251p.C6499g;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6507c;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6510e;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6511f;
import com.bamtechmedia.dominguez.playback.p237m.p252q.p253g.C6512a;
import com.bamtechmedia.dominguez.playback.p254tv.C6530a;
import com.bamtechmedia.dominguez.playback.p254tv.C6531b;
import com.bamtechmedia.dominguez.playback.p254tv.TvPlaybackActivity;
import com.bamtechmedia.dominguez.playback.p254tv.p255c.C6539d;
import com.bamtechmedia.dominguez.playback.p254tv.p255c.C6539d.C6540a;
import com.bamtechmedia.dominguez.playback.p254tv.p255c.C6541e;
import com.bamtechmedia.dominguez.playback.p254tv.p255c.C6544h;
import com.bamtechmedia.dominguez.playback.p254tv.p255c.C6545i;
import com.bamtechmedia.dominguez.playback.p254tv.p255c.C6545i.C6546a;
import com.bamtechmedia.dominguez.playback.p254tv.p255c.C6547j;
import com.bamtechmedia.dominguez.playback.p254tv.p255c.C6549l;
import com.bamtechmedia.dominguez.playback.p254tv.p255c.C6550m;
import com.bamtechmedia.dominguez.playback.p254tv.p255c.C6551n;
import com.bamtechmedia.dominguez.playback.p254tv.p255c.C6552o;
import com.bamtechmedia.dominguez.playback.p254tv.p255c.C6553p;
import com.bamtechmedia.dominguez.playback.p254tv.p255c.C6554q;
import com.bamtechmedia.dominguez.playback.p254tv.p255c.C6555r;
import com.bamtechmedia.dominguez.playback.p254tv.p257e.C6561b;
import com.bamtechmedia.dominguez.playback.p254tv.upnext.C6577a;
import com.bamtechmedia.dominguez.playback.p254tv.upnext.C6580b;
import com.bamtechmedia.dominguez.playback.p254tv.upnext.C6581c;
import com.bamtechmedia.dominguez.playback.p254tv.upnext.C6583d;
import com.bamtechmedia.dominguez.playback.p254tv.upnext.C6585f;
import com.bamtechmedia.dominguez.playback.p254tv.web.C6589a;
import com.bamtechmedia.dominguez.playback.p254tv.web.C6589a.C6590a;
import com.bamtechmedia.dominguez.playback.p254tv.web.C6591b;
import com.bamtechmedia.dominguez.playback.p254tv.web.C6593c;
import com.bamtechmedia.dominguez.playback.p254tv.web.C6595e;
import com.bamtechmedia.dominguez.playback.p254tv.web.WebContentTvPresenter;
import com.bamtechmedia.dominguez.portability.availability.C6602a;
import com.bamtechmedia.dominguez.portability.availability.C6603b;
import com.bamtechmedia.dominguez.portability.availability.C6604c;
import com.bamtechmedia.dominguez.portability.availability.ServiceAvailabilityStateImpl;
import com.bamtechmedia.dominguez.profiles.C6606a0;
import com.bamtechmedia.dominguez.profiles.C6619a1;
import com.bamtechmedia.dominguez.profiles.C6623b0;
import com.bamtechmedia.dominguez.profiles.C6624b1;
import com.bamtechmedia.dominguez.profiles.C6627c1;
import com.bamtechmedia.dominguez.profiles.C6628d;
import com.bamtechmedia.dominguez.profiles.C6629d0;
import com.bamtechmedia.dominguez.profiles.C6630d1;
import com.bamtechmedia.dominguez.profiles.C6656e1;
import com.bamtechmedia.dominguez.profiles.C6657f;
import com.bamtechmedia.dominguez.profiles.C6661f1;
import com.bamtechmedia.dominguez.profiles.C6665g;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import com.bamtechmedia.dominguez.profiles.C6671h0;
import com.bamtechmedia.dominguez.profiles.C6675i;
import com.bamtechmedia.dominguez.profiles.C6677i1;
import com.bamtechmedia.dominguez.profiles.C6700j;
import com.bamtechmedia.dominguez.profiles.C6716k;
import com.bamtechmedia.dominguez.profiles.C6718k1;
import com.bamtechmedia.dominguez.profiles.C6719l;
import com.bamtechmedia.dominguez.profiles.C6719l.C6720a;
import com.bamtechmedia.dominguez.profiles.C6721l0;
import com.bamtechmedia.dominguez.profiles.C6722l1;
import com.bamtechmedia.dominguez.profiles.C6724m0;
import com.bamtechmedia.dominguez.profiles.C6725m1;
import com.bamtechmedia.dominguez.profiles.C6744n;
import com.bamtechmedia.dominguez.profiles.C6745n0;
import com.bamtechmedia.dominguez.profiles.C6746n1;
import com.bamtechmedia.dominguez.profiles.C6756o;
import com.bamtechmedia.dominguez.profiles.C6757o0;
import com.bamtechmedia.dominguez.profiles.C6759p;
import com.bamtechmedia.dominguez.profiles.C6759p.C6760a;
import com.bamtechmedia.dominguez.profiles.C6761p0;
import com.bamtechmedia.dominguez.profiles.C6763p1;
import com.bamtechmedia.dominguez.profiles.C6769r0;
import com.bamtechmedia.dominguez.profiles.C6782s;
import com.bamtechmedia.dominguez.profiles.C6783s0;
import com.bamtechmedia.dominguez.profiles.C6845t;
import com.bamtechmedia.dominguez.profiles.C6856u0;
import com.bamtechmedia.dominguez.profiles.C6856u0.C6857a;
import com.bamtechmedia.dominguez.profiles.C6866v;
import com.bamtechmedia.dominguez.profiles.C6867v0;
import com.bamtechmedia.dominguez.profiles.C6887w;
import com.bamtechmedia.dominguez.profiles.C6888w0;
import com.bamtechmedia.dominguez.profiles.C6904x;
import com.bamtechmedia.dominguez.profiles.C6905x0;
import com.bamtechmedia.dominguez.profiles.C6968y;
import com.bamtechmedia.dominguez.profiles.C6969y0;
import com.bamtechmedia.dominguez.profiles.C7022z0;
import com.bamtechmedia.dominguez.profiles.p258db.C6632a;
import com.bamtechmedia.dominguez.profiles.p258db.C6639c;
import com.bamtechmedia.dominguez.profiles.p258db.C6649e;
import com.bamtechmedia.dominguez.profiles.p258db.C6652f;
import com.bamtechmedia.dominguez.profiles.p258db.ProfilesDatabase;
import com.bamtechmedia.dominguez.profiles.p259s1.C6785b;
import com.bamtechmedia.dominguez.profiles.p259s1.C6787d;
import com.bamtechmedia.dominguez.profiles.p259s1.C6788e;
import com.bamtechmedia.dominguez.profiles.p259s1.C6789f;
import com.bamtechmedia.dominguez.profiles.p259s1.C6789f.C6790a;
import com.bamtechmedia.dominguez.profiles.p259s1.C6791g;
import com.bamtechmedia.dominguez.profiles.p259s1.C6807h;
import com.bamtechmedia.dominguez.profiles.p259s1.C6808i;
import com.bamtechmedia.dominguez.profiles.p259s1.C6829k;
import com.bamtechmedia.dominguez.profiles.p262t1.C6847a;
import com.bamtechmedia.dominguez.profiles.p262t1.C6848b;
import com.bamtechmedia.dominguez.profiles.p262t1.C6854c;
import com.bamtechmedia.dominguez.profiles.p263u1.C6859b;
import com.bamtechmedia.dominguez.profiles.p263u1.C6860c;
import com.bamtechmedia.dominguez.profiles.p266v1.C6869b;
import com.bamtechmedia.dominguez.profiles.p266v1.C6879e;
import com.bamtechmedia.dominguez.profiles.p266v1.C6880f;
import com.bamtechmedia.dominguez.profiles.p266v1.C6881g;
import com.bamtechmedia.dominguez.profiles.p266v1.C6882h;
import com.bamtechmedia.dominguez.profiles.p267w1.C6889a;
import com.bamtechmedia.dominguez.profiles.p267w1.C6889a.C6890a;
import com.bamtechmedia.dominguez.profiles.p267w1.C6891b;
import com.bamtechmedia.dominguez.profiles.p267w1.C6903c;
import com.bamtechmedia.dominguez.profiles.p268x1.C6906a;
import com.bamtechmedia.dominguez.profiles.p268x1.C6910b;
import com.bamtechmedia.dominguez.profiles.p268x1.C6911c;
import com.bamtechmedia.dominguez.profiles.p268x1.C6912d;
import com.bamtechmedia.dominguez.profiles.p268x1.C6913e;
import com.bamtechmedia.dominguez.profiles.p268x1.C6916f;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6919c;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6923d;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6924e;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6927f;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6928g;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6929h;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6930i;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6931j;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6932k;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6933l;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6934m;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6935n;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6937p;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6938q;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6939r;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6940s;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6941t;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6942u;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6943v;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6944w;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6945x;
import com.bamtechmedia.dominguez.profiles.p268x1.p269g.C6946y;
import com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6947a;
import com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6951b;
import com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6952c;
import com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6959d;
import com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6960e;
import com.bamtechmedia.dominguez.profiles.p271y1.C6985d;
import com.bamtechmedia.dominguez.profiles.p271y1.C6985d.C6986a;
import com.bamtechmedia.dominguez.profiles.p271y1.C6987e;
import com.bamtechmedia.dominguez.profiles.p271y1.C7004g;
import com.bamtechmedia.dominguez.profiles.p271y1.C7012k;
import com.bamtechmedia.dominguez.profiles.p272z1.C7023a;
import com.bamtechmedia.dominguez.profiles.p272z1.C7024b;
import com.bamtechmedia.dominguez.purchase.C7045c;
import com.bamtechmedia.dominguez.purchase.C7046d;
import com.bamtechmedia.dominguez.purchase.C7047e;
import com.bamtechmedia.dominguez.purchase.C7048f;
import com.bamtechmedia.dominguez.purchase.C7049g;
import com.bamtechmedia.dominguez.purchase.C7051i;
import com.bamtechmedia.dominguez.purchase.C7053k;
import com.bamtechmedia.dominguez.purchase.C7053k.C7054a;
import com.bamtechmedia.dominguez.purchase.C7055l;
import com.bamtechmedia.dominguez.purchase.C7055l.C7056a;
import com.bamtechmedia.dominguez.purchase.C7057m;
import com.bamtechmedia.dominguez.purchase.C7058n;
import com.bamtechmedia.dominguez.purchase.C7059o;
import com.bamtechmedia.dominguez.purchase.C7061p;
import com.bamtechmedia.dominguez.purchase.C7062q;
import com.bamtechmedia.dominguez.purchase.C7080r;
import com.bamtechmedia.dominguez.purchase.C7081s;
import com.bamtechmedia.dominguez.purchase.C7082t;
import com.bamtechmedia.dominguez.purchase.C7084v;
import com.bamtechmedia.dominguez.purchase.C7110x;
import com.bamtechmedia.dominguez.purchase.C7112z;
import com.bamtechmedia.dominguez.purchase.MarketHolder;
import com.bamtechmedia.dominguez.purchase.p273a0.C7026a;
import com.bamtechmedia.dominguez.purchase.p273a0.C7026a.C7027a;
import com.bamtechmedia.dominguez.purchase.p273a0.C7028b;
import com.bamtechmedia.dominguez.purchase.p273a0.C7038d;
import com.bamtechmedia.dominguez.purchase.p273a0.C7039e;
import com.bamtechmedia.dominguez.purchase.p274b0.C7041a;
import com.bamtechmedia.dominguez.purchase.p274b0.C7042b;
import com.bamtechmedia.dominguez.purchase.p274b0.C7043c;
import com.bamtechmedia.dominguez.purchase.p274b0.C7044d;
import com.bamtechmedia.dominguez.ripcut.cache.C7116a;
import com.bamtechmedia.dominguez.ripcut.cache.C7119b;
import com.bamtechmedia.dominguez.ripcut.cache.C7120c;
import com.bamtechmedia.dominguez.ripcut.cache.C7127e;
import com.bamtechmedia.dominguez.ripcut.cache.UriCachingWorker.C7113a;
import com.bamtechmedia.dominguez.ripcut.glide.C7136f;
import com.bamtechmedia.dominguez.ripcut.glide.C7138g;
import com.bamtechmedia.dominguez.sdk.vpn.C7141a;
import com.bamtechmedia.dominguez.sdk.vpn.C7145b;
import com.bamtechmedia.dominguez.sdk.vpn.VpnDialogLifecycleObserver;
import com.bamtechmedia.dominguez.search.C7965a0;
import com.bamtechmedia.dominguez.search.C7975b0;
import com.bamtechmedia.dominguez.search.C8025f;
import com.bamtechmedia.dominguez.search.C8026f0;
import com.bamtechmedia.dominguez.search.C8031g0;
import com.bamtechmedia.dominguez.search.C8033h0;
import com.bamtechmedia.dominguez.search.C8034i;
import com.bamtechmedia.dominguez.search.C8043i0;
import com.bamtechmedia.dominguez.search.C8052r;
import com.bamtechmedia.dominguez.search.C8059s;
import com.bamtechmedia.dominguez.search.C8060t;
import com.bamtechmedia.dominguez.search.C8063v;
import com.bamtechmedia.dominguez.search.C8065w;
import com.bamtechmedia.dominguez.search.C8065w.C8066a;
import com.bamtechmedia.dominguez.search.C8068y;
import com.bamtechmedia.dominguez.search.C8076z;
import com.bamtechmedia.dominguez.search.SearchRepository;
import com.bamtechmedia.dominguez.search.SpeechRecognizerHelper;
import com.bamtechmedia.dominguez.watchlist.remote.RemoteWatchlistDataSource;
import com.google.common.base.Optional;
import com.google.common.collect.C10387h;
import com.google.common.collect.C10387h.C10388a;
import com.google.common.collect.ImmutableSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p096e.p155q.p156a.p157a.C4342e;
import p163g.p171c.p172a.p173a.C4793a;
import p163g.p171c.p172a.p173a.C4794b;
import p163g.p174d.p175a.p176a.C4796b;
import p163g.p174d.p175a.p177b.C4812c;
import p163g.p174d.p175a.p177b.C4815e;
import p163g.p174d.p178b.C5273h;
import p163g.p174d.p178b.p180b0.C4922v2;
import p163g.p174d.p178b.p193j0.C5291e;
import p163g.p201e.p203b.C5368a;
import p163g.p201e.p203b.C5369b;
import p163g.p201e.p203b.p204d.C5372a0;
import p163g.p201e.p203b.p204d.C5376c0;
import p163g.p201e.p203b.p204d.C5377d;
import p163g.p201e.p203b.p204d.C5383d0;
import p163g.p201e.p203b.p204d.C5384e;
import p163g.p201e.p203b.p204d.C5385e0;
import p163g.p201e.p203b.p204d.C5386f;
import p163g.p201e.p203b.p204d.C5387f0;
import p163g.p201e.p203b.p204d.C5387f0.C5388a;
import p163g.p201e.p203b.p204d.C5389g;
import p163g.p201e.p203b.p204d.C5390g0;
import p163g.p201e.p203b.p204d.C5393h;
import p163g.p201e.p203b.p204d.C5396h0;
import p163g.p201e.p203b.p204d.C5397i;
import p163g.p201e.p203b.p204d.C5398i0;
import p163g.p201e.p203b.p204d.C5402j;
import p163g.p201e.p203b.p204d.C5405k0;
import p163g.p201e.p203b.p204d.C5408m;
import p163g.p201e.p203b.p204d.C5410n;
import p163g.p201e.p203b.p204d.C5412o;
import p163g.p201e.p203b.p204d.C5414p;
import p163g.p201e.p203b.p204d.C5416q;
import p163g.p201e.p203b.p204d.C5416q.C5417a;
import p163g.p201e.p203b.p204d.C5418q0;
import p163g.p201e.p203b.p204d.C5419r;
import p163g.p201e.p203b.p204d.C5429r0;
import p163g.p201e.p203b.p204d.C5433t0;
import p163g.p201e.p203b.p204d.C5434u;
import p163g.p201e.p203b.p204d.C5435u0;
import p163g.p201e.p203b.p204d.C5435u0.C5436a;
import p163g.p201e.p203b.p204d.C5437v;
import p163g.p201e.p203b.p204d.C5501x;
import p163g.p201e.p203b.p204d.C5501x.C5502a;
import p163g.p201e.p203b.p204d.C5552y;
import p163g.p201e.p203b.p204d.C5553z;
import p163g.p201e.p203b.p204d.p205v0.C5439a;
import p163g.p201e.p203b.p204d.p205v0.C5448b;
import p163g.p201e.p203b.p204d.p205v0.C5449c;
import p163g.p201e.p203b.p204d.p205v0.C5467d;
import p163g.p201e.p203b.p204d.p205v0.C5468e;
import p163g.p201e.p203b.p204d.p206w0.C5490a;
import p163g.p201e.p203b.p204d.p206w0.C5495b;
import p163g.p201e.p203b.p204d.p207x0.C5503a;
import p163g.p201e.p203b.p204d.p207x0.C5512b;
import p163g.p201e.p203b.p204d.p207x0.C5513c;
import p163g.p201e.p203b.p204d.p207x0.C5535d;
import p163g.p201e.p203b.p204d.p207x0.C5536e;
import p163g.p201e.p203b.p210g.C5559d;
import p163g.p201e.p203b.p210g.C5560e;
import p163g.p201e.p203b.p210g.C5560e.C5561a;
import p163g.p201e.p203b.p210g.C5562f;
import p163g.p201e.p203b.p210g.C5565g;
import p163g.p201e.p203b.p210g.C5567i;
import p163g.p201e.p203b.p210g.C5568j;
import p163g.p201e.p203b.p210g.C5569k;
import p163g.p201e.p203b.p210g.C5588o;
import p163g.p201e.p203b.p275a0.C7152e;
import p163g.p201e.p203b.p275a0.C7158f;
import p163g.p201e.p203b.p275a0.C7159g;
import p163g.p201e.p203b.p275a0.C7163h;
import p163g.p201e.p203b.p275a0.C7169j;
import p163g.p201e.p203b.p275a0.p276k.C7170a;
import p163g.p201e.p203b.p275a0.p276k.C7171b;
import p163g.p201e.p203b.p275a0.p276k.C7172c;
import p163g.p201e.p203b.p275a0.p276k.C7174d;
import p163g.p201e.p203b.p277b0.C7178a0;
import p163g.p201e.p203b.p277b0.C7193b0;
import p163g.p201e.p203b.p277b0.C7195c0;
import p163g.p201e.p203b.p277b0.C7204d;
import p163g.p201e.p203b.p277b0.C7205d0;
import p163g.p201e.p203b.p277b0.C7206e;
import p163g.p201e.p203b.p277b0.C7207f;
import p163g.p201e.p203b.p277b0.C7208g;
import p163g.p201e.p203b.p277b0.C7209h;
import p163g.p201e.p203b.p277b0.C7210i;
import p163g.p201e.p203b.p277b0.C7211j;
import p163g.p201e.p203b.p277b0.C7212k;
import p163g.p201e.p203b.p277b0.C7213l;
import p163g.p201e.p203b.p277b0.C7214m;
import p163g.p201e.p203b.p277b0.C7215n;
import p163g.p201e.p203b.p277b0.C7216o;
import p163g.p201e.p203b.p277b0.C7217p;
import p163g.p201e.p203b.p277b0.C7222q;
import p163g.p201e.p203b.p277b0.C7223r;
import p163g.p201e.p203b.p277b0.C7225s;
import p163g.p201e.p203b.p277b0.C7226t;
import p163g.p201e.p203b.p277b0.C7227u;
import p163g.p201e.p203b.p277b0.C7233y;
import p163g.p201e.p203b.p277b0.C7234z;
import p163g.p201e.p203b.p278h.C7236b;
import p163g.p201e.p203b.p278h.C7238d;
import p163g.p201e.p203b.p278h.C7239e;
import p163g.p201e.p203b.p278h.C7239e.C7240a;
import p163g.p201e.p203b.p278h.C7241f;
import p163g.p201e.p203b.p278h.p279k.C7246a;
import p163g.p201e.p203b.p278h.p279k.C7247b;
import p163g.p201e.p203b.p278h.p280l.C7252a;
import p163g.p201e.p203b.p278h.p280l.C7254b;
import p163g.p201e.p203b.p278h.p281m.C7255a;
import p163g.p201e.p203b.p278h.p282n.C7260a;
import p163g.p201e.p203b.p278h.p282n.C7281c;
import p163g.p201e.p203b.p278h.p282n.C7283d;
import p163g.p201e.p203b.p283i.p284a.p285a.C7284a;
import p163g.p201e.p203b.p283i.p284a.p285a.C7285b;
import p163g.p201e.p203b.p286j.C7287b;
import p163g.p201e.p203b.p286j.C7289c;
import p163g.p201e.p203b.p286j.C7290d;
import p163g.p201e.p203b.p286j.C7293f.C7294a;
import p163g.p201e.p203b.p286j.C7296g;
import p163g.p201e.p203b.p286j.C7298i;
import p163g.p201e.p203b.p286j.C7299j;
import p163g.p201e.p203b.p286j.C7300k;
import p163g.p201e.p203b.p286j.C7301l;
import p163g.p201e.p203b.p286j.C7302m;
import p163g.p201e.p203b.p286j.C7303n;
import p163g.p201e.p203b.p286j.C7305p;
import p163g.p201e.p203b.p286j.C7306q;
import p163g.p201e.p203b.p287k.p288j.C7316a;
import p163g.p201e.p203b.p287k.p288j.C7320c;
import p163g.p201e.p203b.p287k.p288j.C7323e;
import p163g.p201e.p203b.p287k.p288j.C7323e.C7324a;
import p163g.p201e.p203b.p287k.p288j.C7325f;
import p163g.p201e.p203b.p287k.p288j.p291j.C7338c;
import p163g.p201e.p203b.p287k.p288j.p291j.C7339d;
import p163g.p201e.p203b.p287k.p288j.p291j.C7340e;
import p163g.p201e.p203b.p287k.p288j.p291j.C7341f;
import p163g.p201e.p203b.p287k.p288j.p291j.C7348g;
import p163g.p201e.p203b.p287k.p288j.p291j.C7349h;
import p163g.p201e.p203b.p287k.p288j.p292k.C7352b;
import p163g.p201e.p203b.p287k.p293k.C7383c;
import p163g.p201e.p203b.p287k.p293k.C7391d;
import p163g.p201e.p203b.p287k.p293k.C7394e;
import p163g.p201e.p203b.p287k.p293k.C7398h;
import p163g.p201e.p203b.p287k.p293k.C7402k;
import p163g.p201e.p203b.p287k.p293k.C7402k.C7403a;
import p163g.p201e.p203b.p287k.p293k.C7404l;
import p163g.p201e.p203b.p287k.p293k.C7405m;
import p163g.p201e.p203b.p287k.p293k.C7406n;
import p163g.p201e.p203b.p287k.p293k.C7408p;
import p163g.p201e.p203b.p287k.p293k.p294q.C7410a.C7435b;
import p163g.p201e.p203b.p287k.p293k.p296s.C7440c;
import p163g.p201e.p203b.p287k.p293k.p296s.C7441d;
import p163g.p201e.p203b.p287k.p293k.p296s.C7442e;
import p163g.p201e.p203b.p287k.p293k.p296s.C7443f;
import p163g.p201e.p203b.p287k.p293k.p296s.C7444g;
import p163g.p201e.p203b.p287k.p293k.p296s.C7451h;
import p163g.p201e.p203b.p287k.p293k.p296s.C7452i;
import p163g.p201e.p203b.p287k.p293k.p296s.C7453j;
import p163g.p201e.p203b.p287k.p293k.p297t.C7454a;
import p163g.p201e.p203b.p298l.C7501b;
import p163g.p201e.p203b.p298l.C7503c;
import p163g.p201e.p203b.p298l.C7505e;
import p163g.p201e.p203b.p298l.C7505e.C7506a;
import p163g.p201e.p203b.p298l.C7507f;
import p163g.p201e.p203b.p298l.C7509h;
import p163g.p201e.p203b.p298l.C7513i;
import p163g.p201e.p203b.p298l.C7519j;
import p163g.p201e.p203b.p298l.C7520k;
import p163g.p201e.p203b.p298l.C7520k.C7521a;
import p163g.p201e.p203b.p298l.C7522l;
import p163g.p201e.p203b.p298l.C7529n;
import p163g.p201e.p203b.p298l.C7530o;
import p163g.p201e.p203b.p298l.C7531p;
import p163g.p201e.p203b.p299m.C7536a;
import p163g.p201e.p203b.p299m.C7540c;
import p163g.p201e.p203b.p299m.C7541d;
import p163g.p201e.p203b.p299m.C7542e;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p299m.C7548i;
import p163g.p201e.p203b.p299m.C7550j;
import p163g.p201e.p203b.p299m.C7552l;
import p163g.p201e.p203b.p299m.C7552l.C7553a;
import p163g.p201e.p203b.p299m.C7554m;
import p163g.p201e.p203b.p299m.C7555n;
import p163g.p201e.p203b.p299m.C7556o;
import p163g.p201e.p203b.p299m.C7556o.C7557a;
import p163g.p201e.p203b.p299m.p304z.C7582a;
import p163g.p201e.p203b.p305n.C7587a;
import p163g.p201e.p203b.p305n.C7588b;
import p163g.p201e.p203b.p305n.C7594c;
import p163g.p201e.p203b.p305n.C7595d;
import p163g.p201e.p203b.p305n.C7598f;
import p163g.p201e.p203b.p305n.C7598f.C7599a;
import p163g.p201e.p203b.p305n.C7600g;
import p163g.p201e.p203b.p305n.C7601h;
import p163g.p201e.p203b.p305n.C7602i;
import p163g.p201e.p203b.p305n.C7603j;
import p163g.p201e.p203b.p307o.C7611c;
import p163g.p201e.p203b.p307o.C7612d;
import p163g.p201e.p203b.p307o.C7612d.C7613a;
import p163g.p201e.p203b.p307o.C7614e;
import p163g.p201e.p203b.p307o.C7615f;
import p163g.p201e.p203b.p307o.C7616g;
import p163g.p201e.p203b.p307o.C7617h.C7618a;
import p163g.p201e.p203b.p307o.p308p.C7626a;
import p163g.p201e.p203b.p307o.p308p.C7630d;
import p163g.p201e.p203b.p307o.p309q.C7631a;
import p163g.p201e.p203b.p307o.p309q.C7635b;
import p163g.p201e.p203b.p307o.p309q.C7636c;
import p163g.p201e.p203b.p307o.p310r.C7641a;
import p163g.p201e.p203b.p307o.p310r.C7648d;
import p163g.p201e.p203b.p312q.C7654b;
import p163g.p201e.p203b.p312q.C7655b0;
import p163g.p201e.p203b.p312q.C7659c;
import p163g.p201e.p203b.p312q.C7662d;
import p163g.p201e.p203b.p312q.C7684f;
import p163g.p201e.p203b.p312q.C7687h;
import p163g.p201e.p203b.p312q.C7693l;
import p163g.p201e.p203b.p312q.C7694m;
import p163g.p201e.p203b.p312q.C7695n;
import p163g.p201e.p203b.p312q.C7696o;
import p163g.p201e.p203b.p312q.C7696o.C7697a;
import p163g.p201e.p203b.p312q.C7698p;
import p163g.p201e.p203b.p312q.C7702t;
import p163g.p201e.p203b.p312q.C7711u;
import p163g.p201e.p203b.p312q.C7713w;
import p163g.p201e.p203b.p312q.p313d0.C7664b;
import p163g.p201e.p203b.p312q.p313d0.C7667d;
import p163g.p201e.p203b.p312q.p313d0.C7668e;
import p163g.p201e.p203b.p312q.p313d0.C7669f;
import p163g.p201e.p203b.p312q.p313d0.C7670g;
import p163g.p201e.p203b.p312q.p313d0.C7670g.C7671a;
import p163g.p201e.p203b.p312q.p313d0.C7672h;
import p163g.p201e.p203b.p312q.p313d0.C7673i;
import p163g.p201e.p203b.p312q.p313d0.C7674j;
import p163g.p201e.p203b.p312q.p313d0.C7676k;
import p163g.p201e.p203b.p312q.p313d0.C7677l;
import p163g.p201e.p203b.p314r.C7720a;
import p163g.p201e.p203b.p314r.C7726b;
import p163g.p201e.p203b.p314r.C7728d;
import p163g.p201e.p203b.p314r.C7735e;
import p163g.p201e.p203b.p315s.C7742c;
import p163g.p201e.p203b.p315s.C7744d;
import p163g.p201e.p203b.p315s.C7745e;
import p163g.p201e.p203b.p315s.C7753f;
import p163g.p201e.p203b.p315s.C7754g;
import p163g.p201e.p203b.p315s.C7757i;
import p163g.p201e.p203b.p315s.C7757i.C7758a;
import p163g.p201e.p203b.p315s.C7759j;
import p163g.p201e.p203b.p315s.C7760k;
import p163g.p201e.p203b.p315s.C7761l;
import p163g.p201e.p203b.p315s.C7762m;
import p163g.p201e.p203b.p315s.C7770o;
import p163g.p201e.p203b.p316t.C7773b;
import p163g.p201e.p203b.p316t.C7776e;
import p163g.p201e.p203b.p316t.C7777f;
import p163g.p201e.p203b.p316t.C7779h;
import p163g.p201e.p203b.p316t.C7779h.C7780a;
import p163g.p201e.p203b.p316t.C7781i;
import p163g.p201e.p203b.p316t.C7782j;
import p163g.p201e.p203b.p316t.C7783k;
import p163g.p201e.p203b.p316t.C7784l;
import p163g.p201e.p203b.p316t.C7786m;
import p163g.p201e.p203b.p316t.C7787n;
import p163g.p201e.p203b.p316t.C7788o;
import p163g.p201e.p203b.p316t.C7793s;
import p163g.p201e.p203b.p316t.p317u.C7804a;
import p163g.p201e.p203b.p316t.p317u.C7805b;
import p163g.p201e.p203b.p316t.p317u.C7805b.C7806a;
import p163g.p201e.p203b.p316t.p317u.C7807c;
import p163g.p201e.p203b.p318u.C7810b;
import p163g.p201e.p203b.p318u.C7811c;
import p163g.p201e.p203b.p318u.C7811c.C7812a;
import p163g.p201e.p203b.p318u.C7813d;
import p163g.p201e.p203b.p318u.C7818e;
import p163g.p201e.p203b.p319v.C7862c;
import p163g.p201e.p203b.p319v.C7864d;
import p163g.p201e.p203b.p319v.C7872e;
import p163g.p201e.p203b.p319v.C7874g;
import p163g.p201e.p203b.p319v.C7877i;
import p163g.p201e.p203b.p319v.C7878j;
import p163g.p201e.p203b.p319v.C7880k;
import p163g.p201e.p203b.p319v.C7881l;
import p163g.p201e.p203b.p319v.C7883m;
import p163g.p201e.p203b.p319v.C7884n;
import p163g.p201e.p203b.p319v.C7885o;
import p163g.p201e.p203b.p319v.C7900q;
import p163g.p201e.p203b.p319v.C7908x;
import p163g.p201e.p203b.p319v.C7909y;
import p163g.p201e.p203b.p319v.C7911z;
import p163g.p201e.p203b.p319v.p321b0.C7831a;
import p163g.p201e.p203b.p319v.p321b0.C7831a.C7833b;
import p163g.p201e.p203b.p319v.p321b0.C7836c;
import p163g.p201e.p203b.p319v.p321b0.C7837d;
import p163g.p201e.p203b.p319v.p321b0.C7838e;
import p163g.p201e.p203b.p319v.p321b0.C7853g;
import p163g.p201e.p203b.p319v.p321b0.C7854h;
import p163g.p201e.p203b.p319v.p321b0.C7855i;
import p163g.p201e.p203b.p319v.p321b0.C7856j;
import p163g.p201e.p203b.p323w.p324a.C7912a;
import p163g.p201e.p203b.p323w.p325b.C7913a;
import p163g.p201e.p203b.p323w.p325b.C7915b;
import p163g.p201e.p203b.p326x.C7918c;
import p163g.p201e.p203b.p326x.C7919d;
import p163g.p201e.p203b.p326x.C7920e;
import p163g.p201e.p203b.p326x.C7921f;
import p163g.p201e.p203b.p326x.C7922g;
import p163g.p201e.p203b.p326x.C7923h;
import p163g.p201e.p203b.p327y.C7925b;
import p163g.p201e.p203b.p327y.p328g.C7930a;
import p163g.p201e.p203b.p327y.p328g.C7932c;
import p163g.p201e.p203b.p327y.p329h.C7933a;
import p163g.p201e.p203b.p327y.p329h.C7933a.C7934a;
import p163g.p201e.p203b.p327y.p329h.C7935b;
import p163g.p201e.p203b.p327y.p329h.C7940c;
import p163g.p201e.p203b.p327y.p329h.C7941d;
import p163g.p201e.p203b.p405c0.C10544a;
import p163g.p201e.p203b.p405c0.C10561c;
import p163g.p201e.p203b.p405c0.C10562d;
import p163g.p201e.p203b.p406d0.C10568e;
import p163g.p201e.p203b.p406d0.C10569f;
import p163g.p201e.p203b.p406d0.C10570g;
import p163g.p201e.p203b.p406d0.C10570g.C10571a;
import p163g.p201e.p203b.p406d0.C10572h;
import p163g.p201e.p203b.p406d0.C10581j;
import p163g.p201e.p203b.p406d0.C10583l;
import p163g.p201e.p203b.p407e0.C10592e;
import p163g.p201e.p203b.p407e0.C10594g;
import p163g.p201e.p203b.p407e0.C10595h;
import p163g.p201e.p203b.p407e0.C10595h.C10596a;
import p163g.p201e.p203b.p407e0.C10597i;
import p163g.p201e.p203b.p407e0.C10599j;
import p163g.p201e.p203b.p407e0.C10600k;
import p163g.p201e.p203b.p407e0.C10602m;
import p163g.p201e.p203b.p408f0.C10609c;
import p163g.p201e.p203b.p408f0.C10612e;
import p163g.p201e.p203b.p408f0.C10615f;
import p163g.p201e.p203b.p411h0.C10622f;
import p163g.p201e.p203b.p411h0.C10623g;
import p163g.p201e.p203b.p411h0.C10626i;
import p163g.p201e.p203b.p411h0.C10626i.C10627a;
import p163g.p201e.p203b.p411h0.C10628j;
import p163g.p201e.p203b.p411h0.C10629k;
import p163g.p201e.p203b.p411h0.C10637l;
import p163g.p201e.p203b.p411h0.C10638m;
import p163g.p201e.p203b.p411h0.C10640n;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;
import p163g.p509o.p510a.p511l.C11867b;
import p512h.p513c.C11871b.C11872a;
import p512h.p513c.C11874d;
import p512h.p513c.C11876f;
import p512h.p513c.C11878g;
import p512h.p513c.p514k.C11884c;
import p512h.p513c.p514k.C11886e;
import p512h.p513c.p514k.C11889h;
import p512h.p513c.p514k.C11891j;
import p512h.p515d.C11894b;
import p512h.p515d.C11896d;
import p512h.p515d.C11897e;
import p512h.p515d.C11898f;
import p512h.p515d.C11898f.C11900b;
import p512h.p515d.C11901g;
import p520io.reactivex.C11969r;
import p520io.reactivex.Observable;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.app.s */
/* compiled from: DaggerTvAppComponent */
public final class C2505s implements C2486c0 {

    /* renamed from: v2 */
    private static final Provider f6805v2 = C11896d.m38128a(Optional.m32792d());

    /* renamed from: A */
    private Provider<C6237h> f6806A;
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public Provider<C2407r> f6807A0;

    /* renamed from: A1 */
    private Provider<C6913e> f6808A1;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public Provider<C7141a> f6809B;

    /* renamed from: B0 */
    private Provider<SharedPreferences> f6810B0;
    /* access modifiers changed from: private */

    /* renamed from: B1 */
    public Provider<C6906a> f6811B1;

    /* renamed from: C */
    private Provider<C7178a0> f6812C;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public Provider<C2461k> f6813C0;

    /* renamed from: C1 */
    private Provider<Single<C10562d>> f6814C1;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public Provider<SearchApi> f6815D;

    /* renamed from: D0 */
    private Provider<C2404p> f6816D0;
    /* access modifiers changed from: private */

    /* renamed from: D1 */
    public Provider<C2776h> f6817D1;

    /* renamed from: E */
    private Provider<Optional<C3796d>> f6818E;

    /* renamed from: E0 */
    private Provider<C2453e> f6819E0;
    /* access modifiers changed from: private */

    /* renamed from: E1 */
    public Provider<C10544a> f6820E1;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public Provider<C2279k> f6821F;

    /* renamed from: F0 */
    private Provider<C2380a> f6822F0;
    /* access modifiers changed from: private */

    /* renamed from: F1 */
    public Provider<BamIdentityApi> f6823F1;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public Provider<SearchOverrides> f6824G;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public Provider<C2458i> f6825G0;

    /* renamed from: G1 */
    private Provider<C3572r0> f6826G1;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public Provider<SharedPreferences> f6827H;

    /* renamed from: H0 */
    private Provider<C2464m> f6828H0;
    /* access modifiers changed from: private */

    /* renamed from: H1 */
    public Provider<C7864d> f6829H1;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public Provider<C3751k> f6830I;

    /* renamed from: I0 */
    private Provider<C2396k> f6831I0;

    /* renamed from: I1 */
    private Provider<C3572r0> f6832I1;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public Provider<C3741f> f6833J;
    /* access modifiers changed from: private */

    /* renamed from: J0 */
    public Provider<C2451c> f6834J0;
    /* access modifiers changed from: private */

    /* renamed from: J1 */
    public Provider<C5821c0> f6835J1;

    /* renamed from: K */
    private Provider<Single<SessionInfo>> f6836K;

    /* renamed from: K0 */
    private Provider<C2390g> f6837K0;
    /* access modifiers changed from: private */

    /* renamed from: K1 */
    public Provider<C3718r> f6838K1;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public Provider<ProfilesDatabase> f6839L;
    /* access modifiers changed from: private */

    /* renamed from: L0 */
    public Provider<C6859b> f6840L0;

    /* renamed from: L1 */
    private Provider<C3243c> f6841L1;

    /* renamed from: M */
    private Provider<C6639c> f6842M;

    /* renamed from: M0 */
    private Provider<C6848b> f6843M0;

    /* renamed from: M1 */
    private Provider<C3247b> f6844M1;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public Provider<C6632a> f6845N;

    /* renamed from: N0 */
    private Provider<Set<C2434c>> f6846N0;

    /* renamed from: N1 */
    private Provider<C3238b> f6847N1;

    /* renamed from: O */
    private Provider<UserProfileApi> f6848O;

    /* renamed from: O0 */
    private Provider<C2360g> f6849O0;

    /* renamed from: O1 */
    private Provider<C3204a> f6850O1;

    /* renamed from: P */
    private Provider<C6746n1> f6851P;

    /* renamed from: P0 */
    private Provider<C2374a> f6852P0;
    /* access modifiers changed from: private */

    /* renamed from: P1 */
    public Provider<C3212a> f6853P1;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public Provider<C2336b> f6854Q;
    /* access modifiers changed from: private */

    /* renamed from: Q0 */
    public Provider<C2351f> f6855Q0;
    /* access modifiers changed from: private */

    /* renamed from: Q1 */
    public Provider<PaywallApi> f6856Q1;

    /* renamed from: R */
    private Provider<C2364i> f6857R;

    /* renamed from: R0 */
    private Provider<C2340b0> f6858R0;
    /* access modifiers changed from: private */

    /* renamed from: R1 */
    public Provider<C2704c> f6859R1;

    /* renamed from: S */
    private Provider<C2447q> f6860S;

    /* renamed from: S0 */
    private Provider<C5368a> f6861S0;
    /* access modifiers changed from: private */

    /* renamed from: S1 */
    public Provider<C2708e> f6862S1;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public Provider<C2436p> f6863T;
    /* access modifiers changed from: private */

    /* renamed from: T0 */
    public Provider<C3421m> f6864T0;

    /* renamed from: T1 */
    private Provider<C6602a> f6865T1;

    /* renamed from: U */
    private Provider<C6745n0> f6866U;
    /* access modifiers changed from: private */

    /* renamed from: U0 */
    public Provider<C3661d> f6867U0;
    /* access modifiers changed from: private */

    /* renamed from: U1 */
    public Provider<ServiceAvailabilityStateImpl> f6868U1;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public Provider<C6677i1> f6869V;
    /* access modifiers changed from: private */

    /* renamed from: V0 */
    public Provider<Boolean> f6870V0;
    /* access modifiers changed from: private */

    /* renamed from: V1 */
    public Provider<C7301l> f6871V1;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public Provider<C3743h> f6872W;
    /* access modifiers changed from: private */

    /* renamed from: W0 */
    public Provider<C3776f> f6873W0;

    /* renamed from: W1 */
    private Provider<C7252a> f6874W1;

    /* renamed from: X */
    private Provider<C3727b> f6875X;

    /* renamed from: X0 */
    private Provider<BookmarksApi> f6876X0;
    /* access modifiers changed from: private */

    /* renamed from: X1 */
    public Provider<C7281c> f6877X1;

    /* renamed from: Y */
    private Provider<Single<C6063a>> f6878Y;

    /* renamed from: Y0 */
    private Provider<C3163a> f6879Y0;
    /* access modifiers changed from: private */

    /* renamed from: Y1 */
    public Provider<C2986k> f6880Y1;

    /* renamed from: Z */
    private Provider<C6082j> f6881Z;
    /* access modifiers changed from: private */

    /* renamed from: Z0 */
    public Provider<Single<Session>> f6882Z0;
    /* access modifiers changed from: private */

    /* renamed from: Z1 */
    public Provider<C3449n> f6883Z1;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2481a f6884a;

    /* renamed from: a0 */
    private Provider<C6068e> f6885a0;
    /* access modifiers changed from: private */

    /* renamed from: a1 */
    public Provider<LocalBookmarksRegistry> f6886a1;
    /* access modifiers changed from: private */

    /* renamed from: a2 */
    public Provider<C11848c<C11867b>> f6887a2;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Provider<C3211a> f6888b;

    /* renamed from: b0 */
    private Provider<C7023a> f6889b0;

    /* renamed from: b1 */
    private Provider<String> f6890b1;
    /* access modifiers changed from: private */

    /* renamed from: b2 */
    public Provider<C3442h> f6891b2;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Provider<Factory> f6892c;

    /* renamed from: c0 */
    private Provider<C6911c> f6893c0;
    /* access modifiers changed from: private */

    /* renamed from: c1 */
    public Provider<C3678l> f6894c1;
    /* access modifiers changed from: private */

    /* renamed from: c2 */
    public Provider<C5911c> f6895c2;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Provider<C6143a> f6896d;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public Provider<C6072g> f6897d0;

    /* renamed from: d1 */
    private Provider<SharedPreferences> f6898d1;

    /* renamed from: d2 */
    private Provider<C3577a> f6899d2;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Provider<C6546a> f6900e;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public Provider<C6091o> f6901e0;

    /* renamed from: e1 */
    private Provider<C7913a> f6902e1;
    /* access modifiers changed from: private */

    /* renamed from: e2 */
    public Provider<C6009y> f6903e2;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Provider<C2481a> f6904f;

    /* renamed from: f0 */
    private Provider<C7152e> f6905f0;
    /* access modifiers changed from: private */

    /* renamed from: f1 */
    public Provider<Single<C3524e>> f6906f1;

    /* renamed from: f2 */
    private Provider<C6063a> f6907f2;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Provider<OkHttpClient> f6908g;

    /* renamed from: g0 */
    private Provider<C7172c> f6909g0;
    /* access modifiers changed from: private */

    /* renamed from: g1 */
    public Provider<C6199m> f6910g1;

    /* renamed from: g2 */
    private Provider<C3563n> f6911g2;

    /* renamed from: h */
    private Provider<C5756a> f6912h;

    /* renamed from: h0 */
    private Provider<C7116a> f6913h0;
    /* access modifiers changed from: private */

    /* renamed from: h1 */
    public Provider<SubscriptionApi> f6914h1;

    /* renamed from: h2 */
    private Provider<C6782s> f6915h2;

    /* renamed from: i */
    private Provider<C3561m0> f6916i;

    /* renamed from: i0 */
    private Provider<C7170a> f6917i0;
    /* access modifiers changed from: private */

    /* renamed from: i1 */
    public Provider<AppLaunchAnalyticsLifecycleObserver> f6918i1;
    /* access modifiers changed from: private */

    /* renamed from: i2 */
    public Provider<Single<Boolean>> f6919i2;

    /* renamed from: j */
    private Provider<C3533a> f6920j;

    /* renamed from: j0 */
    private Provider<ActivityManager> f6921j0;
    /* access modifiers changed from: private */

    /* renamed from: j1 */
    public Provider<C3436c> f6922j1;
    /* access modifiers changed from: private */

    /* renamed from: j2 */
    public Provider<C6266a> f6923j2;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Provider<BuildInfo> f6924k;

    /* renamed from: k0 */
    private Provider<C7120c> f6925k0;
    /* access modifiers changed from: private */

    /* renamed from: k1 */
    public Provider<C3557k0> f6926k1;
    /* access modifiers changed from: private */

    /* renamed from: k2 */
    public Provider<C5398i0> f6927k2;

    /* renamed from: l */
    private Provider<AppConfigRepository> f6928l;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public Provider<C7136f> f6929l0;
    /* access modifiers changed from: private */

    /* renamed from: l1 */
    public Provider<AccountApi> f6930l1;
    /* access modifiers changed from: private */

    /* renamed from: l2 */
    public Provider<C7217p> f6931l2;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Provider<C3524e> f6932m;

    /* renamed from: m0 */
    private Provider<C2686z> f6933m0;
    /* access modifiers changed from: private */

    /* renamed from: m1 */
    public Provider<C5377d> f6934m1;
    /* access modifiers changed from: private */

    /* renamed from: m2 */
    public Provider<C6423b> f6935m2;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Provider<C3586b> f6936n;

    /* renamed from: n0 */
    private Provider<C2426c> f6937n0;

    /* renamed from: n1 */
    private Provider<Boolean> f6938n1;
    /* access modifiers changed from: private */

    /* renamed from: n2 */
    public Provider<ConnectivityManager> f6939n2;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Provider<AppPresenceImpl> f6940o;

    /* renamed from: o0 */
    private Provider<UserActivityApi> f6941o0;
    /* access modifiers changed from: private */

    /* renamed from: o1 */
    public Provider<C7874g> f6942o1;
    /* access modifiers changed from: private */

    /* renamed from: o2 */
    public Provider<DisplayMetrics> f6943o2;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Provider<SharedPreferences> f6944p;

    /* renamed from: p0 */
    private Provider<C2428e> f6945p0;

    /* renamed from: p1 */
    private Provider<C7922g> f6946p1;

    /* renamed from: p2 */
    private Provider<C6941t> f6947p2;

    /* renamed from: q */
    private Provider<Resources> f6948q;

    /* renamed from: q0 */
    private Provider<Boolean> f6949q0;

    /* renamed from: q1 */
    private Provider<Market> f6950q1;

    /* renamed from: q2 */
    private Provider<C6928g> f6951q2;

    /* renamed from: r */
    private Provider<C7226t> f6952r;

    /* renamed from: r0 */
    private Provider<C2399m> f6953r0;
    /* access modifiers changed from: private */

    /* renamed from: r1 */
    public Provider<MarketHolder> f6954r1;

    /* renamed from: r2 */
    private Provider<C6932k> f6955r2;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Provider<C5862q0> f6956s;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public Provider<C2414a> f6957s0;
    /* access modifiers changed from: private */

    /* renamed from: s1 */
    public Provider<C4796b> f6958s1;
    /* access modifiers changed from: private */

    /* renamed from: s2 */
    public Provider<C6919c> f6959s2;

    /* renamed from: t */
    private Provider<C7223r> f6960t;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public Provider<C3519c> f6961t0;

    /* renamed from: t1 */
    private Provider<C4812c> f6962t1;
    /* access modifiers changed from: private */

    /* renamed from: t2 */
    public Provider<C6924e> f6963t2;

    /* renamed from: u */
    private Provider<MediaCapabilitiesProvider> f6964u;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public Provider<C4793a> f6965u0;
    /* access modifiers changed from: private */

    /* renamed from: u1 */
    public Provider<C4815e> f6966u1;
    /* access modifiers changed from: private */

    /* renamed from: u2 */
    public Provider<C3629d> f6967u2;

    /* renamed from: v */
    private Provider<C7195c0> f6968v;

    /* renamed from: v0 */
    private Provider<C2383c> f6969v0;

    /* renamed from: v1 */
    private Provider<C3572r0> f6970v1;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public Provider<Single<SessionState>> f6971w;

    /* renamed from: w0 */
    private Provider<LocationManager> f6972w0;
    /* access modifiers changed from: private */

    /* renamed from: w1 */
    public Provider<C7615f> f6973w1;

    /* renamed from: x */
    private Provider<C6065c> f6974x;

    /* renamed from: x0 */
    private Provider<Locale> f6975x0;

    /* renamed from: x1 */
    private Provider<C2361g0> f6976x1;

    /* renamed from: y */
    private Provider<C6088a> f6977y;

    /* renamed from: y0 */
    private Provider<TelephonyManager> f6978y0;
    /* access modifiers changed from: private */

    /* renamed from: y1 */
    public Provider<C2369j0> f6979y1;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public Provider<C6234e> f6980z;

    /* renamed from: z0 */
    private Provider<C2386e> f6981z0;

    /* renamed from: z1 */
    private Provider<C3572r0> f6982z1;

    /* renamed from: com.bamtechmedia.dominguez.app.s$a */
    /* compiled from: DaggerTvAppComponent */
    class C2506a implements Provider<C3211a> {
        C2506a() {
        }

        public C3211a get() {
            return new C2511f(C2505s.this, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.app.s$b */
    /* compiled from: DaggerTvAppComponent */
    class C2507b implements Provider<Factory> {
        C2507b() {
        }

        public Factory get() {
            return new C2513h(C2505s.this, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.app.s$c */
    /* compiled from: DaggerTvAppComponent */
    class C2508c implements Provider<C6143a> {
        C2508c() {
        }

        public C6143a get() {
            return new C2515j(C2505s.this, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.app.s$d */
    /* compiled from: DaggerTvAppComponent */
    class C2509d implements Provider<C6546a> {
        C2509d() {
        }

        public C6546a get() {
            return new C2668m(C2505s.this, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.app.s$e */
    /* compiled from: DaggerTvAppComponent */
    private static final class C2510e implements C2487a {

        /* renamed from: a */
        private C2481a f6987a;

        private C2510e() {
        }

        public C2486c0 build() {
            C11897e.m38132a(this.f6987a, C2481a.class);
            return new C2505s(this.f6987a, null);
        }

        /* synthetic */ C2510e(C2506a aVar) {
            this();
        }

        /* renamed from: a */
        public C2510e m9395a(C2481a aVar) {
            C11897e.m38129a(aVar);
            this.f6987a = aVar;
            return this;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.app.s$f */
    /* compiled from: DaggerTvAppComponent */
    private final class C2511f implements C3211a {
        private C2511f() {
        }

        /* synthetic */ C2511f(C2505s sVar, C2506a aVar) {
            this();
        }

        /* renamed from: a */
        public C3210f mo11605a(DeletedProgramBroadcastReceiver deletedProgramBroadcastReceiver) {
            C11897e.m38129a(deletedProgramBroadcastReceiver);
            return new C2512g(C2505s.this, deletedProgramBroadcastReceiver, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.app.s$g */
    /* compiled from: DaggerTvAppComponent */
    private final class C2512g implements C3210f {
        /* synthetic */ C2512g(C2505s sVar, DeletedProgramBroadcastReceiver deletedProgramBroadcastReceiver, C2506a aVar) {
            this(deletedProgramBroadcastReceiver);
        }

        /* renamed from: b */
        private DeletedProgramBroadcastReceiver m9398b(DeletedProgramBroadcastReceiver deletedProgramBroadcastReceiver) {
            C3236a.m11216a(deletedProgramBroadcastReceiver, C2505s.this.m9359t0());
            C3236a.m11215a(deletedProgramBroadcastReceiver, (C3221a) C2505s.this.m9201L());
            return deletedProgramBroadcastReceiver;
        }

        private C2512g(DeletedProgramBroadcastReceiver deletedProgramBroadcastReceiver) {
        }

        /* renamed from: a */
        public void mo11603a(DeletedProgramBroadcastReceiver deletedProgramBroadcastReceiver) {
            m9398b(deletedProgramBroadcastReceiver);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.app.s$h */
    /* compiled from: DaggerTvAppComponent */
    private final class C2513h implements Factory {
        private C2513h() {
        }

        /* synthetic */ C2513h(C2505s sVar, C2506a aVar) {
            this();
        }

        /* renamed from: a */
        public LegalCenterFragmentSubcomponent mo11605a(LegalCenterFragment legalCenterFragment) {
            C11897e.m38129a(legalCenterFragment);
            return new C2514i(C2505s.this, legalCenterFragment, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.app.s$i */
    /* compiled from: DaggerTvAppComponent */
    private final class C2514i implements LegalCenterFragmentSubcomponent {

        /* renamed from: a */
        private final LegalCenterFragment f6991a;

        /* synthetic */ C2514i(C2505s sVar, LegalCenterFragment legalCenterFragment, C2506a aVar) {
            this(legalCenterFragment);
        }

        /* renamed from: b */
        private LegalCenterItemsFactory m9405b() {
            return new LegalCenterItemsFactory(m9406c(), C2505s.this.f6884a);
        }

        /* renamed from: c */
        private LegalCenterViewModel m9406c() {
            return LegalCenterBindingModule_FragmentModule_ViewModelFactory.viewModel(this.f6991a, C2505s.this.m9196K(), m9403a(), C2505s.this.m9255Z(), new LegalDocumentFinder());
        }

        private C2514i(LegalCenterFragment legalCenterFragment) {
            this.f6991a = legalCenterFragment;
        }

        /* renamed from: a */
        private LegalCenterAnalytics m9403a() {
            return new LegalCenterAnalytics((C2334a) C2505s.this.f6854Q.get(), (C2348e) C2505s.this.f6855Q0.get());
        }

        /* renamed from: b */
        private LegalCenterFragment m9404b(LegalCenterFragment legalCenterFragment) {
            C11889h.m38118a(legalCenterFragment, C2505s.this.m9209N());
            LegalCenterFragment_MembersInjector.injectViewModel(legalCenterFragment, m9406c());
            LegalCenterFragment_MembersInjector.injectItemsFactory(legalCenterFragment, m9405b());
            LegalCenterFragment_MembersInjector.injectAdapter(legalCenterFragment, C2505s.this.m9228S());
            return legalCenterFragment;
        }

        /* renamed from: a */
        public void mo11603a(LegalCenterFragment legalCenterFragment) {
            m9404b(legalCenterFragment);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.app.s$j */
    /* compiled from: DaggerTvAppComponent */
    private final class C2515j implements C6143a {
        private C2515j() {
        }

        /* synthetic */ C2515j(C2505s sVar, C2506a aVar) {
            this();
        }

        /* renamed from: a */
        public C6142p mo11605a(MainActivity mainActivity) {
            C11897e.m38129a(mainActivity);
            return new C2516k(C2505s.this, mainActivity, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.app.s$k */
    /* compiled from: DaggerTvAppComponent */
    private final class C2516k implements C6142p {

        /* renamed from: A */
        private Provider<C5562f> f6994A;
        /* access modifiers changed from: private */

        /* renamed from: B */
        public Provider<C3796d> f6995B;

        /* renamed from: C */
        private Provider<Optional<C3796d>> f6996C;

        /* renamed from: D */
        private Provider<C3727b> f6997D;

        /* renamed from: E */
        private Provider<C6700j> f6998E;

        /* renamed from: F */
        private Provider<C3663f> f6999F;

        /* renamed from: G */
        private Provider<RemoteContentSetDataSource> f7000G;

        /* renamed from: H */
        private Provider<C6657f> f7001H;
        /* access modifiers changed from: private */

        /* renamed from: I */
        public Provider<C5773a> f7002I;

        /* renamed from: J */
        private Provider<C7548i> f7003J;

        /* renamed from: K */
        private Provider<C6725m1> f7004K;
        /* access modifiers changed from: private */

        /* renamed from: L */
        public Provider<C6630d1> f7005L;

        /* renamed from: M */
        private Provider<Optional<C6627c1>> f7006M;

        /* renamed from: N */
        private Provider<C3762a> f7007N;

        /* renamed from: O */
        private Provider<C3784d> f7008O;

        /* renamed from: P */
        private Provider<C3780j> f7009P;

        /* renamed from: Q */
        private Provider<Optional<C3780j>> f7010Q;
        /* access modifiers changed from: private */

        /* renamed from: R */
        public Provider<C3768d> f7011R;
        /* access modifiers changed from: private */

        /* renamed from: S */
        public Provider<C3330h> f7012S;
        /* access modifiers changed from: private */

        /* renamed from: T */
        public Provider<C3668i> f7013T;
        /* access modifiers changed from: private */

        /* renamed from: U */
        public Provider<C6606a0> f7014U;
        /* access modifiers changed from: private */

        /* renamed from: V */
        public Provider<C6217b> f7015V;

        /* renamed from: W */
        private Provider<Optional<C2760a>> f7016W;

        /* renamed from: X */
        private Provider<C2771e> f7017X;

        /* renamed from: Y */
        private Provider<C2763b> f7018Y;

        /* renamed from: Z */
        private Provider<C2693a0> f7019Z;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final MainActivity f7020a;
        /* access modifiers changed from: private */

        /* renamed from: a0 */
        public Provider<C7728d> f7021a0;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Provider<C2256a> f7022b;

        /* renamed from: b0 */
        private Provider<C6196j> f7023b0;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Provider<C2720a> f7024c;

        /* renamed from: c0 */
        private Provider<C6188h> f7025c0;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Provider<C7027a> f7026d;
        /* access modifiers changed from: private */

        /* renamed from: d0 */
        public Provider<C3292b> f7027d0;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Provider<C5561a> f7028e;

        /* renamed from: e0 */
        private Provider<C2442c> f7029e0;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Provider<C7553a> f7030f;

        /* renamed from: f0 */
        private Provider<C7833b> f7031f0;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Provider<C7557a> f7032g;

        /* renamed from: g0 */
        private Provider<C7062q> f7033g0;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public Provider<C2796a> f7034h;
        /* access modifiers changed from: private */

        /* renamed from: h0 */
        public Provider<C7885o> f7035h0;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public Provider<C7240a> f7036i;

        /* renamed from: i0 */
        private Provider<C7881l> f7037i0;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public Provider<C7506a> f7038j;

        /* renamed from: j0 */
        private Provider<C6649e> f7039j0;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public Provider<C7521a> f7040k;

        /* renamed from: k0 */
        private Provider<Set<C2793c>> f7041k0;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Provider<C7697a> f7042l;

        /* renamed from: l0 */
        private Provider<C7853g> f7043l0;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public Provider<C7806a> f7044m;

        /* renamed from: m0 */
        private Provider<C6761p0> f7045m0;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public Provider<C7054a> f7046n;

        /* renamed from: n0 */
        private Provider<C6206a> f7047n0;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public Provider<C7056a> f7048o;

        /* renamed from: o0 */
        private Provider<C7296g> f7049o0;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public Provider<C6857a> f7050p;

        /* renamed from: p0 */
        private Provider<C7246a> f7051p0;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public Provider<C7934a> f7052q;

        /* renamed from: q0 */
        private Provider<C7260a> f7053q0;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public Provider<C10571a> f7054r;

        /* renamed from: r0 */
        private Provider<MainActivityBackgroundResponder> f7055r0;

        /* renamed from: s */
        private Provider<C6178b> f7056s;

        /* renamed from: s0 */
        private Provider<C10612e> f7057s0;

        /* renamed from: t */
        private Provider<C2438a> f7058t;

        /* renamed from: t0 */
        private Provider<C7287b> f7059t0;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public Provider<MainActivity> f7060u;
        /* access modifiers changed from: private */

        /* renamed from: u0 */
        public Provider<C7305p> f7061u0;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public Provider<C7900q> f7062v;
        /* access modifiers changed from: private */

        /* renamed from: v0 */
        public Provider<C2811k> f7063v0;

        /* renamed from: w */
        private Provider<C7878j> f7064w;
        /* access modifiers changed from: private */

        /* renamed from: w0 */
        public Provider<C7909y> f7065w0;

        /* renamed from: x */
        private Provider<C6619a1> f7066x;
        /* access modifiers changed from: private */

        /* renamed from: x0 */
        public Provider<C3439e> f7067x0;

        /* renamed from: y */
        private Provider<Set<C2783b>> f7068y;

        /* renamed from: z */
        private Provider<C2783b> f7070z;

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$a */
        /* compiled from: DaggerTvAppComponent */
        class C2517a implements Provider<C7521a> {
            C2517a() {
            }

            public C7521a get() {
                return new C2520b0(C2516k.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$a0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2518a0 implements C7505e {

            /* renamed from: a */
            private final C7513i f7072a;

            /* synthetic */ C2518a0(C2516k kVar, C7513i iVar, C2506a aVar) {
                this(iVar);
            }

            /* renamed from: b */
            private C7051i m9524b() {
                return new C7051i((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get(), (C2476z) C2505s.this.f6957s0.get());
            }

            private C2518a0(C7513i iVar) {
                this.f7072a = iVar;
            }

            /* renamed from: a */
            private C7531p m9523a() {
                return C7507f.m22398a(this.f7072a, C2516k.this.m9417D());
            }

            /* renamed from: b */
            private C7513i m9525b(C7513i iVar) {
                C11886e.m38117a(iVar, C2516k.this.m9497o());
                C7519j.m22413a(iVar, (C6722l1) C2516k.this.f7014U.get());
                C7519j.m22416a(iVar, m9523a());
                C7519j.m22415a(iVar, new C7110x());
                C7519j.m22414a(iVar, m9524b());
                return iVar;
            }

            /* renamed from: a */
            public void mo11603a(C7513i iVar) {
                m9525b(iVar);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$b */
        /* compiled from: DaggerTvAppComponent */
        class C2519b implements Provider<C7697a> {
            C2519b() {
            }

            public C7697a get() {
                return new C2528f0(C2516k.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$b0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2520b0 implements C7521a {
            private C2520b0() {
            }

            /* synthetic */ C2520b0(C2516k kVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C7520k mo11605a(C7522l lVar) {
                C11897e.m38129a(lVar);
                return new C2522c0(C2516k.this, lVar, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$c */
        /* compiled from: DaggerTvAppComponent */
        class C2521c implements Provider<C7806a> {
            C2521c() {
            }

            public C7806a get() {
                return new C2589h0(C2516k.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$c0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2522c0 implements C7520k {

            /* renamed from: a */
            private Provider<C7501b> f7077a;

            /* synthetic */ C2522c0(C2516k kVar, C7522l lVar, C2506a aVar) {
                this(lVar);
            }

            /* renamed from: b */
            private void m9531b(C7522l lVar) {
                this.f7077a = C11901g.m38136a(C7503c.m22395a(C2505s.this.f6932m));
            }

            /* renamed from: c */
            private C7522l m9532c(C7522l lVar) {
                C11886e.m38117a(lVar, C2516k.this.m9497o());
                C7529n.m22429a(lVar, m9530a());
                C7529n.m22430a(lVar, new C7110x());
                C7529n.m22426a(lVar, (C3572r0) C2505s.this.f6901e0.get());
                C7529n.m22432a(lVar, (C7862c) C2505s.this.m9329n0());
                C7529n.m22427a(lVar, C2505s.this.m9341q());
                C7529n.m22431a(lVar, (C7501b) this.f7077a.get());
                C7529n.m22428a(lVar, (C6722l1) C2516k.this.f7014U.get());
                return lVar;
            }

            private C2522c0(C7522l lVar) {
                m9531b(lVar);
            }

            /* renamed from: a */
            private C7051i m9530a() {
                return new C7051i((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get(), (C2476z) C2505s.this.f6957s0.get());
            }

            /* renamed from: a */
            public void mo11603a(C7522l lVar) {
                m9532c(lVar);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$d */
        /* compiled from: DaggerTvAppComponent */
        class C2523d implements Provider<C7054a> {
            C2523d() {
            }

            public C7054a get() {
                return new C2593j0(C2516k.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$d0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2524d0 implements C7553a {
            private C2524d0() {
            }

            /* synthetic */ C2524d0(C2516k kVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C7552l mo11605a(C7582a aVar) {
                C11897e.m38129a(aVar);
                return new C2526e0(C2516k.this, aVar, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$e */
        /* compiled from: DaggerTvAppComponent */
        class C2525e implements Provider<C7056a> {
            C2525e() {
            }

            public C7056a get() {
                return new C2605p0(C2516k.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$e0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2526e0 implements C7552l {
            /* synthetic */ C2526e0(C2516k kVar, C7582a aVar, C2506a aVar2) {
                this(aVar);
            }

            /* renamed from: b */
            private C7582a m9537b(C7582a aVar) {
                C11886e.m38117a(aVar, C2516k.this.m9497o());
                return aVar;
            }

            private C2526e0(C7582a aVar) {
            }

            /* renamed from: a */
            public void mo11603a(C7582a aVar) {
                m9537b(aVar);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$f */
        /* compiled from: DaggerTvAppComponent */
        class C2527f implements Provider<C6857a> {
            C2527f() {
            }

            public C6857a get() {
                return new C2609r0(C2516k.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$f0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2528f0 implements C7697a {
            private C2528f0() {
            }

            /* synthetic */ C2528f0(C2516k kVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C7696o mo11605a(C7702t tVar) {
                C11897e.m38129a(tVar);
                return new C2530g0(C2516k.this, tVar, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$g */
        /* compiled from: DaggerTvAppComponent */
        class C2529g implements Provider<C7934a> {
            C2529g() {
            }

            public C7934a get() {
                return new C2628t0(C2516k.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2530g0 implements C7696o {

            /* renamed from: a */
            private final C7702t f7086a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public Provider<C7671a> f7087b;

            /* renamed from: c */
            private Provider<C7702t> f7088c;

            /* renamed from: d */
            private Provider<C7687h> f7089d;

            /* renamed from: e */
            private Provider<C7659c> f7090e;

            /* renamed from: f */
            private Provider<Boolean> f7091f;
            /* access modifiers changed from: private */

            /* renamed from: g */
            public Provider<C7720a> f7092g;

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$a */
            /* compiled from: DaggerTvAppComponent */
            class C2531a implements Provider<C7671a> {
                C2531a() {
                }

                public C7671a get() {
                    return new C2532b(C2530g0.this, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$b */
            /* compiled from: DaggerTvAppComponent */
            private final class C2532b implements C7671a {
                private C2532b() {
                }

                /* synthetic */ C2532b(C2530g0 g0Var, C2506a aVar) {
                    this();
                }

                /* renamed from: a */
                public C7670g mo11605a(C7664b bVar) {
                    C11897e.m38129a(bVar);
                    return new C2533c(C2530g0.this, bVar, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c */
            /* compiled from: DaggerTvAppComponent */
            private final class C2533c implements C7670g {

                /* renamed from: a */
                private final C7664b f7096a;
                /* access modifiers changed from: private */

                /* renamed from: b */
                public Provider<C3193a> f7097b;
                /* access modifiers changed from: private */

                /* renamed from: c */
                public Provider<C6104a> f7098c;
                /* access modifiers changed from: private */

                /* renamed from: d */
                public Provider<C7599a> f7099d;
                /* access modifiers changed from: private */

                /* renamed from: e */
                public Provider<C7812a> f7100e;
                /* access modifiers changed from: private */

                /* renamed from: f */
                public Provider<C7758a> f7101f;
                /* access modifiers changed from: private */

                /* renamed from: g */
                public Provider<C7324a> f7102g;
                /* access modifiers changed from: private */

                /* renamed from: h */
                public Provider<C2874a> f7103h;
                /* access modifiers changed from: private */

                /* renamed from: i */
                public Provider<C2734a> f7104i;
                /* access modifiers changed from: private */

                /* renamed from: j */
                public Provider<C5502a> f7105j;
                /* access modifiers changed from: private */

                /* renamed from: k */
                public Provider<C5388a> f7106k;
                /* access modifiers changed from: private */

                /* renamed from: l */
                public Provider<C2866a> f7107l;
                /* access modifiers changed from: private */

                /* renamed from: m */
                public Provider<C5417a> f7108m;
                /* access modifiers changed from: private */

                /* renamed from: n */
                public Provider<C5436a> f7109n;
                /* access modifiers changed from: private */

                /* renamed from: o */
                public Provider<C7780a> f7110o;
                /* access modifiers changed from: private */

                /* renamed from: p */
                public Provider<C8066a> f7111p;
                /* access modifiers changed from: private */

                /* renamed from: q */
                public Provider<C7403a> f7112q;
                /* access modifiers changed from: private */

                /* renamed from: r */
                public Provider<C10596a> f7113r;
                /* access modifiers changed from: private */

                /* renamed from: s */
                public Provider<C6590a> f7114s;

                /* renamed from: t */
                private Provider<C7664b> f7115t;
                /* access modifiers changed from: private */

                /* renamed from: u */
                public Provider<C5792f> f7116u;
                /* access modifiers changed from: private */

                /* renamed from: v */
                public Provider<C7674j> f7117v;

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$a */
                /* compiled from: DaggerTvAppComponent */
                class C2534a implements Provider<C5388a> {
                    C2534a() {
                    }

                    public C5388a get() {
                        return new C2541c0(C2533c.this, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$a0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2535a0 implements C5502a {
                    private C2535a0() {
                    }

                    /* synthetic */ C2535a0(C2533c cVar, C2506a aVar) {
                        this();
                    }

                    /* renamed from: a */
                    public C5501x mo11605a(C5449c cVar) {
                        C11897e.m38129a(cVar);
                        return new C2538b0(C2533c.this, cVar, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$a1 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2536a1 implements C6590a {
                    private C2536a1() {
                    }

                    /* synthetic */ C2536a1(C2533c cVar, C2506a aVar) {
                        this();
                    }

                    /* renamed from: a */
                    public C6589a mo11605a(C6591b bVar) {
                        C11897e.m38129a(bVar);
                        return new C2539b1(C2533c.this, bVar, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$b */
                /* compiled from: DaggerTvAppComponent */
                class C2537b implements Provider<C2866a> {
                    C2537b() {
                    }

                    public C2866a get() {
                        return new C2569q0(C2533c.this, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$b0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2538b0 implements C5501x {

                    /* renamed from: a */
                    private final C5449c f7123a;

                    /* synthetic */ C2538b0(C2533c cVar, C5449c cVar2, C2506a aVar) {
                        this(cVar2);
                    }

                    /* renamed from: b */
                    private C5448b m9608b() {
                        return new C5448b((C2348e) C2505s.this.f6855Q0.get());
                    }

                    /* renamed from: c */
                    private C5468e m9610c() {
                        return C5552y.m18361a(C2505s.this.m9276d(), this.f7123a, m9607a(), C2533c.this.m9562a(), C2533c.this.m9575f(), m9611d(), C5872f.m18926b(), C5873g.m18928b());
                    }

                    /* renamed from: d */
                    private C2755d m9611d() {
                        return C5372a0.m18113a((C5792f) C2533c.this.f7116u.get(), C5553z.m18362a());
                    }

                    private C2538b0(C5449c cVar) {
                        this.f7123a = cVar;
                    }

                    /* renamed from: a */
                    private C5439a m9607a() {
                        return new C5439a(C2505s.this.m9336p(), C2505s.this.m9276d(), (C7614e) C2505s.this.f6973w1.get());
                    }

                    /* renamed from: b */
                    private C5449c m9609b(C5449c cVar) {
                        C11891j.m38119a(cVar, C2533c.this.m9571d());
                        C5467d.m18237a(cVar, m9610c());
                        C5467d.m18236a(cVar, m9608b());
                        C5467d.m18235a(cVar, m9611d());
                        return cVar;
                    }

                    /* renamed from: a */
                    public void mo11603a(C5449c cVar) {
                        m9609b(cVar);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$b1 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2539b1 implements C6589a {

                    /* renamed from: a */
                    private final C6591b f7125a;

                    /* synthetic */ C2539b1(C2533c cVar, C6591b bVar, C2506a aVar) {
                        this(bVar);
                    }

                    /* renamed from: b */
                    private WebContentTvPresenter m9615b() {
                        WebContentTvPresenter webContentTvPresenter = new WebContentTvPresenter(this.f7125a, (OkHttpClient) C2505s.this.f6908g.get(), m9614a(), C5872f.m18926b(), C5873g.m18928b());
                        return webContentTvPresenter;
                    }

                    private C2539b1(C6591b bVar) {
                        this.f7125a = bVar;
                    }

                    /* renamed from: a */
                    private String m9614a() {
                        return C6595e.m20497a(this.f7125a);
                    }

                    /* renamed from: b */
                    private C6591b m9616b(C6591b bVar) {
                        C11891j.m38119a(bVar, C2533c.this.m9571d());
                        C6593c.m20495a(bVar, m9615b());
                        return bVar;
                    }

                    /* renamed from: a */
                    public void mo11603a(C6591b bVar) {
                        m9616b(bVar);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$c */
                /* compiled from: DaggerTvAppComponent */
                class C2540c implements Provider<C5417a> {
                    C2540c() {
                    }

                    public C5417a get() {
                        return new C2580w(C2533c.this, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$c0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2541c0 implements C5388a {
                    private C2541c0() {
                    }

                    /* synthetic */ C2541c0(C2533c cVar, C2506a aVar) {
                        this();
                    }

                    /* renamed from: a */
                    public C5387f0 mo11605a(C5513c cVar) {
                        C11897e.m38129a(cVar);
                        return new C2543d0(C2533c.this, cVar, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$d */
                /* compiled from: DaggerTvAppComponent */
                class C2542d implements Provider<C5436a> {
                    C2542d() {
                    }

                    public C5436a get() {
                        return new C2581w0(C2533c.this, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$d0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2543d0 implements C5387f0 {

                    /* renamed from: a */
                    private final C5513c f7130a;

                    /* synthetic */ C2543d0(C2533c cVar, C5513c cVar2, C2506a aVar) {
                        this(cVar2);
                    }

                    /* renamed from: b */
                    private C5512b m9622b() {
                        return new C5512b((C2348e) C2505s.this.f6855Q0.get());
                    }

                    /* renamed from: c */
                    private C5536e m9624c() {
                        return C5385e0.m18128a(this.f7130a, C2505s.this.m9276d(), (C2750c) C2505s.this.f6880Y1.get(), m9621a(), C2533c.this.m9562a(), C2533c.this.m9575f(), m9625d(), Optional.m32791c(C2505s.this.f6820E1.get()));
                    }

                    /* renamed from: d */
                    private C2755d m9625d() {
                        return C5383d0.m18126a((C5792f) C2533c.this.f7116u.get(), C5376c0.m18118a());
                    }

                    private C2543d0(C5513c cVar) {
                        this.f7130a = cVar;
                    }

                    /* renamed from: a */
                    private C5503a m9621a() {
                        return new C5503a(C2505s.this.m9336p(), C2505s.this.m9276d(), (C2750c) C2505s.this.f6880Y1.get(), (C7614e) C2505s.this.f6973w1.get());
                    }

                    /* renamed from: b */
                    private C5513c m9623b(C5513c cVar) {
                        C11891j.m38119a(cVar, C2533c.this.m9571d());
                        C5535d.m18325a(cVar, m9624c());
                        C5535d.m18324a(cVar, m9622b());
                        C5535d.m18323a(cVar, m9625d());
                        return cVar;
                    }

                    /* renamed from: a */
                    public void mo11603a(C5513c cVar) {
                        m9623b(cVar);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$e */
                /* compiled from: DaggerTvAppComponent */
                class C2544e implements Provider<C7780a> {
                    C2544e() {
                    }

                    public C7780a get() {
                        return new C2561m0(C2533c.this, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$e0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2545e0 implements C6104a {
                    private C2545e0() {
                    }

                    /* synthetic */ C2545e0(C2533c cVar, C2506a aVar) {
                        this();
                    }

                    /* renamed from: a */
                    public C6103h mo11605a(C6099e eVar) {
                        C11897e.m38129a(eVar);
                        return new C2547f0(C2533c.this, eVar, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$f */
                /* compiled from: DaggerTvAppComponent */
                class C2546f implements Provider<C8066a> {
                    C2546f() {
                    }

                    public C8066a get() {
                        return new C2573s0(C2533c.this, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$f0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2547f0 implements C6103h {

                    /* renamed from: a */
                    private final C6099e f7135a;

                    /* renamed from: b */
                    private Provider<C3364j> f7136b;

                    /* renamed from: c */
                    private Provider<C3493c> f7137c;

                    /* renamed from: d */
                    private Provider<C6099e> f7138d;

                    /* renamed from: e */
                    private Provider<C3416k0> f7139e;

                    /* renamed from: f */
                    private Provider<C3394w> f7140f;

                    /* renamed from: g */
                    private Provider<ShelfFragmentHelper> f7141g;

                    /* renamed from: h */
                    private Provider<C3431b> f7142h;

                    /* synthetic */ C2547f0(C2533c cVar, C6099e eVar, C2506a aVar) {
                        this(eVar);
                    }

                    /* renamed from: b */
                    private C3324g m9631b() {
                        C3324g gVar = new C3324g((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get(), (C2476z) C2505s.this.f6957s0.get(), C2505s.this.m9376x(), C5872f.m18926b(), new C6250g());
                        return gVar;
                    }

                    /* renamed from: c */
                    private C3346d m9633c() {
                        C3346d dVar = new C3346d((C3653c) C2533c.this.f7117v.get(), C2533c.this.m9578h(), C2505s.this.f6884a, (C3678l) C2505s.this.f6894c1.get(), (C3439e) C2516k.this.f7067x0.get(), Optional.m32792d());
                        return dVar;
                    }

                    /* renamed from: d */
                    private C3349f m9635d() {
                        C3349f fVar = new C3349f((C3448m) C2505s.this.f6883Z1.get(), m9650s(), m9636e(), m9643l(), C2505s.this.m9255Z());
                        return fVar;
                    }

                    /* renamed from: e */
                    private C3353c m9636e() {
                        C3353c cVar = new C3353c(m9631b(), m9633c(), (C3364j) this.f7136b.get(), (C4793a) C2505s.this.f6965u0.get(), m9638g(), (C3716q) C2505s.this.f6838K1.get(), (C5821c0) C2505s.this.f6835J1.get());
                        return cVar;
                    }

                    /* renamed from: f */
                    private C3432o m9637f() {
                        return new C3432o(new C5758a(), (C3441g) C2505s.this.f6891b2.get());
                    }

                    /* renamed from: g */
                    private C3454q m9638g() {
                        return C3500v.m11873a(m9639h(), this.f7135a, m9656y());
                    }

                    /* renamed from: h */
                    private C3464g m9639h() {
                        C3464g gVar = new C3464g(C2516k.this.f7013T, C2516k.this.f7011R, C2516k.this.f7067x0, C2505s.this.f6864T0, C2516k.this.f6995B, Optional.m32791c(m9646o()), C2505s.this.f6979y1);
                        return gVar;
                    }

                    /* renamed from: i */
                    private C3504y m9640i() {
                        return new C3504y(m9635d(), Optional.m32792d());
                    }

                    /* renamed from: j */
                    private C3357b m9641j() {
                        C3357b bVar = new C3357b(m9633c(), m9655x(), C2505s.this.m9255Z(), m9631b(), (C3364j) this.f7136b.get(), (C3394w) this.f7140f.get());
                        return bVar;
                    }

                    /* renamed from: k */
                    private C6108a m9642k() {
                        return new C6108a((C2348e) C2505s.this.f6855Q0.get());
                    }

                    /* renamed from: l */
                    private C3367a m9643l() {
                        C3367a aVar = new C3367a(Optional.m32791c(this.f7135a), m9633c(), m9652u(), (C3441g) C2505s.this.f6891b2.get(), Optional.m32791c(this.f7142h.get()));
                        return aVar;
                    }

                    /* renamed from: m */
                    private C5588o m9644m() {
                        return C3287b0.m11356a(this.f7135a);
                    }

                    /* renamed from: n */
                    private RecyclerViewSnapScrollHelper m9645n() {
                        return new RecyclerViewSnapScrollHelper(new C5758a(), C2505s.this.m9255Z());
                    }

                    /* renamed from: o */
                    private C3314g m9646o() {
                        return C3501w.m11874a((C3419l) C2505s.this.f6864T0.get(), C2516k.this.m9470e());
                    }

                    /* renamed from: p */
                    private C5813a m9647p() {
                        return C6106j.m19521a(this.f7135a);
                    }

                    /* renamed from: q */
                    private C3409a m9648q() {
                        return new C3409a(m9638g(), m9640i(), m9644m(), C2505s.this.m9228S());
                    }

                    /* renamed from: r */
                    private C3376a m9649r() {
                        return new C3376a(m9633c(), m9631b());
                    }

                    /* renamed from: s */
                    private C3391u m9650s() {
                        C3391u uVar = new C3391u(m9653v(), m9641j(), m9649r(), m9651t(), C2505s.this.m9255Z(), new C3341a(), new C5825e(), Optional.m32791c(this.f7142h.get()));
                        return uVar;
                    }

                    /* renamed from: t */
                    private C3393a m9651t() {
                        C3393a aVar = new C3393a(m9638g(), m9652u(), (ShelfFragmentHelper) this.f7141g.get(), m9631b(), C2505s.this.f6887a2, m9638g(), new C5825e(), (C3441g) C2505s.this.f6891b2.get());
                        return aVar;
                    }

                    /* renamed from: u */
                    private C3416k0 m9652u() {
                        return C3289c0.m11360a((Fragment) this.f7135a);
                    }

                    /* renamed from: v */
                    private C3398a m9653v() {
                        C3398a aVar = new C3398a(m9631b(), m9633c(), (C3364j) this.f7136b.get(), m9654w(), m9638g());
                        return aVar;
                    }

                    /* renamed from: w */
                    private C3404b m9654w() {
                        return new C3404b(this.f7137c, Optional.m32791c(m9630a()), this.f7140f, Optional.m32792d());
                    }

                    /* renamed from: x */
                    private C3493c m9655x() {
                        return new C3493c(new C3490a());
                    }

                    /* renamed from: y */
                    private C3676k m9656y() {
                        return C6098d.m19505a((C3678l) C2505s.this.f6894c1.get());
                    }

                    private C2547f0(C6099e eVar) {
                        this.f7135a = eVar;
                        m9632b(eVar);
                    }

                    /* renamed from: a */
                    private C3317e m9630a() {
                        return C6105i.m19520a(this.f7135a);
                    }

                    /* renamed from: b */
                    private void m9632b(C6099e eVar) {
                        this.f7136b = C11901g.m38136a(C3365k.m11555a(C2505s.this.f6924k));
                        this.f7137c = C3495d.m11868a(C3492b.m11863a());
                        this.f7138d = C11896d.m38128a(eVar);
                        this.f7139e = C3289c0.m11359a(this.f7138d);
                        this.f7140f = C11901g.m38136a(C3396x.m11639a(this.f7139e));
                        this.f7141g = C11894b.m38127b(C3285a0.m11345a(this.f7138d));
                        this.f7142h = C11894b.m38127b(C6097c.m19504a((Provider) this.f7138d, C2505s.this.f6870V0));
                    }

                    /* renamed from: c */
                    private C6099e m9634c(C6099e eVar) {
                        C11891j.m38119a(eVar, C2533c.this.m9571d());
                        C3286b.m11348a((C3280a) eVar, m9648q());
                        C3286b.m11349a((C3280a) eVar, m9637f());
                        C3286b.m11352a((C3280a) eVar, m9645n());
                        C3286b.m11355c(eVar, Optional.m32791c(m9630a()));
                        C3286b.m11354b(eVar, Optional.m32792d());
                        C3286b.m11353a((C3280a) eVar, Optional.m32792d());
                        C3286b.m11350a((C3280a) eVar, m9638g());
                        C3286b.m11347a((C3280a) eVar, (C2366i0) C2505s.this.f6979y1.get());
                        C3286b.m11351a((C3280a) eVar, m9656y());
                        C6101f.m19513a(eVar, m9647p());
                        C6101f.m19514a(eVar, new C5812b());
                        C6101f.m19510a(eVar, (C3291a) C2516k.this.f7027d0.get());
                        C6101f.m19515a(eVar, m9642k());
                        C6101f.m19512a(eVar, (C3848a) C2530g0.this.m9542a());
                        C6101f.m19511a(eVar, (C3431b) this.f7142h.get());
                        C6101f.m19517b(eVar, Optional.m32792d());
                        C6101f.m19516a(eVar, Optional.m32792d());
                        return eVar;
                    }

                    /* renamed from: a */
                    public void mo11603a(C6099e eVar) {
                        m9634c(eVar);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$g */
                /* compiled from: DaggerTvAppComponent */
                class C2548g implements Provider<C7403a> {
                    C2548g() {
                    }

                    public C7403a get() {
                        return new C2577u0(C2533c.this, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$g0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2549g0 implements C7599a {
                    private C2549g0() {
                    }

                    /* synthetic */ C2549g0(C2533c cVar, C2506a aVar) {
                        this();
                    }

                    /* renamed from: a */
                    public C7598f mo11605a(C7588b bVar) {
                        C11897e.m38129a(bVar);
                        return new C2551h0(C2533c.this, bVar, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$h */
                /* compiled from: DaggerTvAppComponent */
                class C2550h implements Provider<C10596a> {
                    C2550h() {
                    }

                    public C10596a get() {
                        return new C2585y0(C2533c.this, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$h0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2551h0 implements C7598f {

                    /* renamed from: a */
                    private final C7588b f7147a;

                    /* renamed from: b */
                    private Provider<C3364j> f7148b;

                    /* renamed from: c */
                    private Provider<C3493c> f7149c;

                    /* renamed from: d */
                    private Provider<C7588b> f7150d;

                    /* renamed from: e */
                    private Provider<C3416k0> f7151e;

                    /* renamed from: f */
                    private Provider<C3394w> f7152f;

                    /* renamed from: g */
                    private Provider<ShelfFragmentHelper> f7153g;

                    /* synthetic */ C2551h0(C2533c cVar, C7588b bVar, C2506a aVar) {
                        this(bVar);
                    }

                    /* renamed from: b */
                    private C3346d m9662b() {
                        C3346d dVar = new C3346d((C3653c) C2533c.this.f7117v.get(), C2533c.this.m9578h(), C2505s.this.f6884a, (C3678l) C2505s.this.f6894c1.get(), (C3439e) C2516k.this.f7067x0.get(), Optional.m32792d());
                        return dVar;
                    }

                    /* renamed from: c */
                    private C3349f m9664c() {
                        C3349f fVar = new C3349f((C3448m) C2505s.this.f6883Z1.get(), m9681s(), m9666d(), m9675m(), C2505s.this.m9255Z());
                        return fVar;
                    }

                    /* renamed from: d */
                    private C3353c m9666d() {
                        C3353c cVar = new C3353c(m9661a(), m9662b(), (C3364j) this.f7148b.get(), (C4793a) C2505s.this.f6965u0.get(), m9668f(), (C3716q) C2505s.this.f6838K1.get(), (C5821c0) C2505s.this.f6835J1.get());
                        return cVar;
                    }

                    /* renamed from: e */
                    private C3432o m9667e() {
                        return new C3432o(new C5758a(), (C3441g) C2505s.this.f6891b2.get());
                    }

                    /* renamed from: f */
                    private C3454q m9668f() {
                        return C3500v.m11873a(m9669g(), this.f7147a, m9687y());
                    }

                    /* renamed from: g */
                    private C3464g m9669g() {
                        C3464g gVar = new C3464g(C2516k.this.f7013T, C2516k.this.f7011R, C2516k.this.f7067x0, C2505s.this.f6864T0, C2516k.this.f6995B, Optional.m32791c(m9678p()), C2505s.this.f6979y1);
                        return gVar;
                    }

                    /* renamed from: h */
                    private C3504y m9670h() {
                        return new C3504y(m9664c(), Optional.m32792d());
                    }

                    /* renamed from: i */
                    private C5948c m9671i() {
                        return new C5948c(C2505s.this.m9301i(), Optional.m32792d());
                    }

                    /* renamed from: j */
                    private C3357b m9672j() {
                        C3357b bVar = new C3357b(m9662b(), m9686x(), C2505s.this.m9255Z(), m9661a(), (C3364j) this.f7148b.get(), (C3394w) this.f7152f.get());
                        return bVar;
                    }

                    /* renamed from: k */
                    private C7587a m9673k() {
                        return C7601h.m22570a(this.f7147a, (C7159g) C2505s.this.f6929l0.get(), m9671i());
                    }

                    /* renamed from: l */
                    private C7603j m9674l() {
                        return C7600g.m22569a(this.f7147a, m9671i());
                    }

                    /* renamed from: m */
                    private C3367a m9675m() {
                        C3367a aVar = new C3367a(Optional.m32792d(), m9662b(), m9683u(), (C3441g) C2505s.this.f6891b2.get(), Optional.m32792d());
                        return aVar;
                    }

                    /* renamed from: n */
                    private C5588o m9676n() {
                        return C3287b0.m11356a(this.f7147a);
                    }

                    /* renamed from: o */
                    private RecyclerViewSnapScrollHelper m9677o() {
                        return new RecyclerViewSnapScrollHelper(new C5758a(), C2505s.this.m9255Z());
                    }

                    /* renamed from: p */
                    private C3314g m9678p() {
                        return C3501w.m11874a((C3419l) C2505s.this.f6864T0.get(), C2516k.this.m9470e());
                    }

                    /* renamed from: q */
                    private C3409a m9679q() {
                        return new C3409a(m9668f(), m9670h(), m9676n(), C2505s.this.m9228S());
                    }

                    /* renamed from: r */
                    private C3376a m9680r() {
                        return new C3376a(m9662b(), m9661a());
                    }

                    /* renamed from: s */
                    private C3391u m9681s() {
                        C3391u uVar = new C3391u(m9684v(), m9672j(), m9680r(), m9682t(), C2505s.this.m9255Z(), new C3341a(), new C5825e(), Optional.m32792d());
                        return uVar;
                    }

                    /* renamed from: t */
                    private C3393a m9682t() {
                        C3393a aVar = new C3393a(m9668f(), m9683u(), (ShelfFragmentHelper) this.f7153g.get(), m9661a(), C2505s.this.f6887a2, m9668f(), new C5825e(), (C3441g) C2505s.this.f6891b2.get());
                        return aVar;
                    }

                    /* renamed from: u */
                    private C3416k0 m9683u() {
                        return C3289c0.m11360a((Fragment) this.f7147a);
                    }

                    /* renamed from: v */
                    private C3398a m9684v() {
                        C3398a aVar = new C3398a(m9661a(), m9662b(), (C3364j) this.f7148b.get(), m9685w(), m9668f());
                        return aVar;
                    }

                    /* renamed from: w */
                    private C3404b m9685w() {
                        return new C3404b(this.f7149c, Optional.m32792d(), this.f7152f, Optional.m32792d());
                    }

                    /* renamed from: x */
                    private C3493c m9686x() {
                        return new C3493c(new C3490a());
                    }

                    /* renamed from: y */
                    private C3676k m9687y() {
                        return C7602i.m22571a(this.f7147a);
                    }

                    private C2551h0(C7588b bVar) {
                        this.f7147a = bVar;
                        m9663b(bVar);
                    }

                    /* renamed from: a */
                    private C3324g m9661a() {
                        C3324g gVar = new C3324g((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get(), (C2476z) C2505s.this.f6957s0.get(), C2505s.this.m9376x(), C5872f.m18926b(), new C6250g());
                        return gVar;
                    }

                    /* renamed from: b */
                    private void m9663b(C7588b bVar) {
                        this.f7148b = C11901g.m38136a(C3365k.m11555a(C2505s.this.f6924k));
                        this.f7149c = C3495d.m11868a(C3492b.m11863a());
                        this.f7150d = C11896d.m38128a(bVar);
                        this.f7151e = C3289c0.m11359a(this.f7150d);
                        this.f7152f = C11901g.m38136a(C3396x.m11639a(this.f7151e));
                        this.f7153g = C11894b.m38127b(C3285a0.m11345a(this.f7150d));
                    }

                    /* renamed from: c */
                    private C7588b m9665c(C7588b bVar) {
                        C11891j.m38119a(bVar, C2533c.this.m9571d());
                        C3286b.m11348a((C3280a) bVar, m9679q());
                        C3286b.m11349a((C3280a) bVar, m9667e());
                        C3286b.m11352a((C3280a) bVar, m9677o());
                        C3286b.m11355c(bVar, Optional.m32792d());
                        C3286b.m11354b(bVar, Optional.m32792d());
                        C3286b.m11353a((C3280a) bVar, Optional.m32792d());
                        C3286b.m11350a((C3280a) bVar, m9668f());
                        C3286b.m11347a((C3280a) bVar, (C2366i0) C2505s.this.f6979y1.get());
                        C3286b.m11351a((C3280a) bVar, m9687y());
                        C7594c.m22564a(bVar, (C7540c) C2516k.this.m9491l());
                        C7594c.m22563a(bVar, (C7159g) C2505s.this.f6929l0.get());
                        C7594c.m22562a(bVar, Optional.m32791c(m9674l()));
                        C7594c.m22561a(bVar, new C5759b());
                        C7594c.m22565a(bVar, m9673k());
                        return bVar;
                    }

                    /* renamed from: a */
                    public void mo11603a(C7588b bVar) {
                        m9665c(bVar);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$i */
                /* compiled from: DaggerTvAppComponent */
                class C2552i implements Provider<C6590a> {
                    C2552i() {
                    }

                    public C6590a get() {
                        return new C2536a1(C2533c.this, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$i0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2553i0 implements C7758a {
                    private C2553i0() {
                    }

                    /* synthetic */ C2553i0(C2533c cVar, C2506a aVar) {
                        this();
                    }

                    /* renamed from: a */
                    public C7757i mo11605a(C7745e eVar) {
                        C11897e.m38129a(eVar);
                        return new C2555j0(C2533c.this, eVar, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$j */
                /* compiled from: DaggerTvAppComponent */
                class C2554j implements Provider<C3193a> {
                    C2554j() {
                    }

                    public C3193a get() {
                        return new C2584y(C2533c.this, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$j0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2555j0 implements C7757i {

                    /* renamed from: a */
                    private final C7745e f7158a;

                    /* renamed from: b */
                    private Provider<C3364j> f7159b;

                    /* renamed from: c */
                    private Provider<C3493c> f7160c;

                    /* renamed from: d */
                    private Provider<C7745e> f7161d;

                    /* renamed from: e */
                    private Provider<C3416k0> f7162e;

                    /* renamed from: f */
                    private Provider<C3394w> f7163f;

                    /* renamed from: g */
                    private Provider<ShelfFragmentHelper> f7164g;

                    /* renamed from: h */
                    private Provider<C7742c> f7165h;

                    /* synthetic */ C2555j0(C2533c cVar, C7745e eVar, C2506a aVar) {
                        this(eVar);
                    }

                    /* renamed from: b */
                    private C3346d m9693b() {
                        C3346d dVar = new C3346d((C3653c) C2533c.this.f7117v.get(), C2533c.this.m9578h(), C2505s.this.f6884a, (C3678l) C2505s.this.f6894c1.get(), (C3439e) C2516k.this.f7067x0.get(), Optional.m32792d());
                        return dVar;
                    }

                    /* renamed from: c */
                    private C3349f m9695c() {
                        C3349f fVar = new C3349f((C3448m) C2505s.this.f6883Z1.get(), m9710q(), m9697d(), m9703j(), C2505s.this.m9255Z());
                        return fVar;
                    }

                    /* renamed from: d */
                    private C3353c m9697d() {
                        C3353c cVar = new C3353c(m9692a(), m9693b(), (C3364j) this.f7159b.get(), (C4793a) C2505s.this.f6965u0.get(), m9699f(), (C3716q) C2505s.this.f6838K1.get(), (C5821c0) C2505s.this.f6835J1.get());
                        return cVar;
                    }

                    /* renamed from: e */
                    private C3432o m9698e() {
                        return new C3432o(new C5758a(), (C3441g) C2505s.this.f6891b2.get());
                    }

                    /* renamed from: f */
                    private C3454q m9699f() {
                        return C3500v.m11873a(m9700g(), this.f7158a, m9716w());
                    }

                    /* renamed from: g */
                    private C3464g m9700g() {
                        C3464g gVar = new C3464g(C2516k.this.f7013T, C2516k.this.f7011R, C2516k.this.f7067x0, C2505s.this.f6864T0, C2516k.this.f6995B, Optional.m32791c(m9707n()), C2505s.this.f6979y1);
                        return gVar;
                    }

                    /* renamed from: h */
                    private C3504y m9701h() {
                        return new C3504y(m9695c(), Optional.m32792d());
                    }

                    /* renamed from: i */
                    private C3357b m9702i() {
                        C3357b bVar = new C3357b(m9693b(), m9715v(), C2505s.this.m9255Z(), m9692a(), (C3364j) this.f7159b.get(), (C3394w) this.f7163f.get());
                        return bVar;
                    }

                    /* renamed from: j */
                    private C3367a m9703j() {
                        C3367a aVar = new C3367a(Optional.m32792d(), m9693b(), m9712s(), (C3441g) C2505s.this.f6891b2.get(), Optional.m32792d());
                        return aVar;
                    }

                    /* renamed from: k */
                    private C7762m m9704k() {
                        return C7759j.m22829a(this.f7158a, m9699f(), C7760k.m22830a());
                    }

                    /* renamed from: l */
                    private C5588o m9705l() {
                        return C3287b0.m11356a(this.f7158a);
                    }

                    /* renamed from: m */
                    private RecyclerViewSnapScrollHelper m9706m() {
                        return new RecyclerViewSnapScrollHelper(new C5758a(), C2505s.this.m9255Z());
                    }

                    /* renamed from: n */
                    private C3314g m9707n() {
                        return C3501w.m11874a((C3419l) C2505s.this.f6864T0.get(), C2516k.this.m9470e());
                    }

                    /* renamed from: o */
                    private C3409a m9708o() {
                        return new C3409a(m9699f(), m9701h(), m9705l(), C2505s.this.m9228S());
                    }

                    /* renamed from: p */
                    private C3376a m9709p() {
                        return new C3376a(m9693b(), m9692a());
                    }

                    /* renamed from: q */
                    private C3391u m9710q() {
                        C3391u uVar = new C3391u(m9713t(), m9702i(), m9709p(), m9711r(), C2505s.this.m9255Z(), new C3341a(), new C5825e(), Optional.m32792d());
                        return uVar;
                    }

                    /* renamed from: r */
                    private C3393a m9711r() {
                        C3393a aVar = new C3393a(m9699f(), m9712s(), (ShelfFragmentHelper) this.f7164g.get(), m9692a(), C2505s.this.f6887a2, m9699f(), new C5825e(), (C3441g) C2505s.this.f6891b2.get());
                        return aVar;
                    }

                    /* renamed from: s */
                    private C3416k0 m9712s() {
                        return C3289c0.m11360a((Fragment) this.f7158a);
                    }

                    /* renamed from: t */
                    private C3398a m9713t() {
                        C3398a aVar = new C3398a(m9692a(), m9693b(), (C3364j) this.f7159b.get(), m9714u(), m9699f());
                        return aVar;
                    }

                    /* renamed from: u */
                    private C3404b m9714u() {
                        return new C3404b(this.f7160c, Optional.m32792d(), this.f7163f, Optional.m32792d());
                    }

                    /* renamed from: v */
                    private C3493c m9715v() {
                        return new C3493c(new C3490a());
                    }

                    /* renamed from: w */
                    private C3676k m9716w() {
                        return C7761l.m22831a(this.f7158a);
                    }

                    private C2555j0(C7745e eVar) {
                        this.f7158a = eVar;
                        m9694b(eVar);
                    }

                    /* renamed from: a */
                    private C3324g m9692a() {
                        C3324g gVar = new C3324g((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get(), (C2476z) C2505s.this.f6957s0.get(), C2505s.this.m9376x(), C5872f.m18926b(), new C6250g());
                        return gVar;
                    }

                    /* renamed from: b */
                    private void m9694b(C7745e eVar) {
                        this.f7159b = C11901g.m38136a(C3365k.m11555a(C2505s.this.f6924k));
                        this.f7160c = C3495d.m11868a(C3492b.m11863a());
                        this.f7161d = C11896d.m38128a(eVar);
                        this.f7162e = C3289c0.m11359a(this.f7161d);
                        this.f7163f = C11901g.m38136a(C3396x.m11639a(this.f7162e));
                        this.f7164g = C11894b.m38127b(C3285a0.m11345a(this.f7161d));
                        this.f7165h = C11901g.m38136a(C7744d.m22807a(C2505s.this.f6870V0));
                    }

                    /* renamed from: c */
                    private C7745e m9696c(C7745e eVar) {
                        C11891j.m38119a(eVar, C2533c.this.m9571d());
                        C3286b.m11348a((C3280a) eVar, m9708o());
                        C3286b.m11349a((C3280a) eVar, m9698e());
                        C3286b.m11352a((C3280a) eVar, m9706m());
                        C3286b.m11355c(eVar, Optional.m32792d());
                        C3286b.m11354b(eVar, Optional.m32792d());
                        C3286b.m11353a((C3280a) eVar, Optional.m32792d());
                        C3286b.m11350a((C3280a) eVar, m9699f());
                        C3286b.m11347a((C3280a) eVar, (C2366i0) C2505s.this.f6979y1.get());
                        C3286b.m11351a((C3280a) eVar, m9716w());
                        C7753f.m22823a(eVar, m9704k());
                        C7753f.m22820a(eVar, new C5681a());
                        C7753f.m22821a(eVar, (C3848a) C2530g0.this.m9542a());
                        C7753f.m22822a(eVar, (C7742c) this.f7165h.get());
                        return eVar;
                    }

                    /* renamed from: a */
                    public void mo11603a(C7745e eVar) {
                        m9696c(eVar);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$k */
                /* compiled from: DaggerTvAppComponent */
                class C2556k implements Provider<C6104a> {
                    C2556k() {
                    }

                    public C6104a get() {
                        return new C2545e0(C2533c.this, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$k0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2557k0 implements C7324a {
                    private C2557k0() {
                    }

                    /* synthetic */ C2557k0(C2533c cVar, C2506a aVar) {
                        this();
                    }

                    /* renamed from: a */
                    public C7323e mo11605a(C7341f fVar) {
                        C11897e.m38129a(fVar);
                        return new C2559l0(C2533c.this, fVar, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$l */
                /* compiled from: DaggerTvAppComponent */
                class C2558l implements Provider<C7599a> {
                    C2558l() {
                    }

                    public C7599a get() {
                        return new C2549g0(C2533c.this, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$l0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2559l0 implements C7323e {

                    /* renamed from: a */
                    private final C7341f f7170a;

                    /* renamed from: b */
                    private Provider<C6000s> f7171b;

                    /* renamed from: c */
                    private Provider<C5996p> f7172c;

                    /* renamed from: d */
                    private Provider<C3364j> f7173d;

                    /* renamed from: e */
                    private Provider<C3493c> f7174e;

                    /* renamed from: f */
                    private Provider<C7341f> f7175f;

                    /* renamed from: g */
                    private Provider<C3416k0> f7176g;

                    /* renamed from: h */
                    private Provider<C3394w> f7177h;

                    /* renamed from: i */
                    private Provider<C5985m> f7178i;

                    /* renamed from: j */
                    private Provider<ShelfFragmentHelper> f7179j;

                    /* renamed from: k */
                    private Provider<C5944a> f7180k;

                    /* synthetic */ C2559l0(C2533c cVar, C7341f fVar, C2506a aVar) {
                        this(fVar);
                    }

                    /* renamed from: A */
                    private C3376a m9721A() {
                        return new C3376a(m9735d(), m9733c());
                    }

                    /* renamed from: B */
                    private C3391u m9722B() {
                        C3391u uVar = new C3391u(m9725E(), m9740i(), m9721A(), m9723C(), C2505s.this.m9255Z(), new C3341a(), new C5825e(), Optional.m32792d());
                        return uVar;
                    }

                    /* renamed from: C */
                    private C3393a m9723C() {
                        C3393a aVar = new C3393a((C3374o) this.f7178i.get(), m9724D(), (ShelfFragmentHelper) this.f7179j.get(), m9733c(), C2505s.this.f6887a2, m9753v(), new C5825e(), (C3441g) C2505s.this.f6891b2.get());
                        return aVar;
                    }

                    /* renamed from: D */
                    private C3416k0 m9724D() {
                        return C3289c0.m11360a((Fragment) this.f7170a);
                    }

                    /* renamed from: E */
                    private C3398a m9725E() {
                        C3398a aVar = new C3398a(m9733c(), m9735d(), (C3364j) this.f7173d.get(), m9726F(), m9753v());
                        return aVar;
                    }

                    /* renamed from: F */
                    private C3404b m9726F() {
                        return new C3404b(this.f7174e, Optional.m32792d(), this.f7177h, Optional.m32792d());
                    }

                    /* renamed from: G */
                    private C3493c m9727G() {
                        return new C3493c(new C3490a());
                    }

                    /* renamed from: H */
                    private C5956g m9728H() {
                        return new C5956g(this.f7170a);
                    }

                    /* renamed from: I */
                    private C5957h m9729I() {
                        C5957h hVar = new C5957h((C3448m) C2505s.this.f6883Z1.get(), m9723C(), m9727G(), (C4793a) C2505s.this.f6965u0.get(), (C3653c) C2533c.this.f7117v.get(), m9749r(), (C3572r0) C2505s.this.f6901e0.get(), m9753v());
                        return hVar;
                    }

                    /* renamed from: b */
                    private C5935c m9731b() {
                        return new C5935c((C3572r0) C2505s.this.f6901e0.get(), (C7159g) C2505s.this.f6929l0.get(), C2505s.this.m9383y0());
                    }

                    /* renamed from: c */
                    private C3324g m9733c() {
                        C3324g gVar = new C3324g((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get(), (C2476z) C2505s.this.f6957s0.get(), C2505s.this.m9376x(), C5872f.m18926b(), new C6250g());
                        return gVar;
                    }

                    /* renamed from: d */
                    private C3346d m9735d() {
                        C3346d dVar = new C3346d((C3653c) C2533c.this.f7117v.get(), C2533c.this.m9578h(), C2505s.this.f6884a, (C3678l) C2505s.this.f6894c1.get(), (C3439e) C2516k.this.f7067x0.get(), Optional.m32792d());
                        return dVar;
                    }

                    /* renamed from: e */
                    private C3349f m9736e() {
                        C3349f fVar = new C3349f((C3448m) C2505s.this.f6883Z1.get(), m9722B(), m9737f(), m9747p(), C2505s.this.m9255Z());
                        return fVar;
                    }

                    /* renamed from: f */
                    private C3353c m9737f() {
                        C3353c cVar = new C3353c(m9733c(), m9735d(), (C3364j) this.f7173d.get(), (C4793a) C2505s.this.f6965u0.get(), m9753v(), (C3716q) C2505s.this.f6838K1.get(), (C5821c0) C2505s.this.f6835J1.get());
                        return cVar;
                    }

                    /* renamed from: g */
                    private C3432o m9738g() {
                        return new C3432o(new C5758a(), (C3441g) C2505s.this.f6891b2.get());
                    }

                    /* renamed from: h */
                    private C5948c m9739h() {
                        return new C5948c(C2505s.this.m9301i(), Optional.m32792d());
                    }

                    /* renamed from: i */
                    private C3357b m9740i() {
                        C3357b bVar = new C3357b(m9735d(), m9727G(), C2505s.this.m9255Z(), m9733c(), (C3364j) this.f7173d.get(), (C3394w) this.f7177h.get());
                        return bVar;
                    }

                    /* renamed from: j */
                    private C5918e m9741j() {
                        return new C5918e((C6000s) this.f7171b.get());
                    }

                    /* renamed from: k */
                    private C5910b m9742k() {
                        return new C5910b(C2516k.this.m9491l());
                    }

                    /* renamed from: l */
                    private C5951e m9743l() {
                        return new C5951e((C7159g) C2505s.this.f6929l0.get(), m9739h());
                    }

                    /* renamed from: m */
                    private C5938d m9744m() {
                        return new C5938d(C2505s.this.m9303i0(), C2505s.this.f6884a, C2505s.this.m9348r0(), m9739h());
                    }

                    /* renamed from: n */
                    private DetailOfflineStateMonitor m9745n() {
                        return C7325f.m21958a(m9754w(), C2516k.this.m9415C(), this.f7170a, m9753v());
                    }

                    /* renamed from: o */
                    private C5969i m9746o() {
                        return new C5969i(C2516k.this.m9444Q(), C2516k.this.m9495n());
                    }

                    /* renamed from: p */
                    private C3367a m9747p() {
                        C3367a aVar = new C3367a(Optional.m32792d(), m9735d(), m9724D(), (C3441g) C2505s.this.f6891b2.get(), Optional.m32792d());
                        return aVar;
                    }

                    /* renamed from: q */
                    private C5921b m9748q() {
                        return new C5921b(m9730a(), (C5821c0) C2505s.this.f6835J1.get(), (C3572r0) C2505s.this.f6901e0.get(), (C3716q) C2505s.this.f6838K1.get());
                    }

                    /* renamed from: r */
                    private C7316a m9749r() {
                        C7316a aVar = new C7316a((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get(), (C2476z) C2505s.this.f6957s0.get(), C2505s.this.m9376x(), C5872f.m18926b(), new C6250g());
                        return aVar;
                    }

                    /* renamed from: s */
                    private MovieDetailRemoteDataSource m9750s() {
                        return new MovieDetailRemoteDataSource(C2516k.this.m9501q(), (C5911c) C2505s.this.f6895c2.get(), (C3165c) C2505s.this.f6886a1.get(), m9739h());
                    }

                    /* renamed from: t */
                    private C6019b m9751t() {
                        return new C6019b(m9750s());
                    }

                    /* renamed from: u */
                    private C7349h m9752u() {
                        C7349h hVar = new C7349h((C3716q) C2505s.this.f6838K1.get(), (C5821c0) C2505s.this.f6835J1.get(), (C3653c) C2533c.this.f7117v.get(), m9753v(), m9741j(), m9749r(), Optional.m32792d(), m9755x(), (C6000s) this.f7171b.get(), m9739h(), (C3850c) C2505s.this.f6903e2.get(), m9753v(), m9736e(), m9729I());
                        return hVar;
                    }

                    /* renamed from: v */
                    private C7352b m9753v() {
                        return C7339d.m21998a(this.f7170a, m9751t(), m9746o(), m9757z(), m9749r(), m9748q(), (C3572r0) C2505s.this.f6901e0.get(), m9739h(), (C2366i0) C2505s.this.f6979y1.get(), C5872f.m18926b());
                    }

                    /* renamed from: w */
                    private C5588o m9754w() {
                        return C3287b0.m11356a(this.f7170a);
                    }

                    /* renamed from: x */
                    private C5998r m9755x() {
                        return new C5998r((C3572r0) C2505s.this.f6901e0.get(), (C5996p) this.f7172c.get());
                    }

                    /* renamed from: y */
                    private RecyclerViewSnapScrollHelper m9756y() {
                        return new RecyclerViewSnapScrollHelper(new C5758a(), C2505s.this.m9255Z());
                    }

                    /* renamed from: z */
                    private C6004v m9757z() {
                        return new C6004v(C2516k.this.m9501q(), C5872f.m18926b());
                    }

                    private C2559l0(C7341f fVar) {
                        this.f7170a = fVar;
                        m9732b(fVar);
                    }

                    /* renamed from: a */
                    private C5929b m9730a() {
                        return new C5929b(C2505s.this.m9321m(), m9731b(), (C6667g1) C2505s.this.f6869V.get(), m9744m());
                    }

                    /* renamed from: b */
                    private void m9732b(C7341f fVar) {
                        this.f7171b = C11901g.m38136a(C6002t.m19223a());
                        this.f7172c = C11901g.m38136a(C5997q.m19212a(C2505s.this.f6932m, C2505s.this.f6824G));
                        this.f7173d = C11901g.m38136a(C3365k.m11555a(C2505s.this.f6924k));
                        this.f7174e = C3495d.m11868a(C3492b.m11863a());
                        this.f7175f = C11896d.m38128a(fVar);
                        this.f7176g = C3289c0.m11359a(this.f7175f);
                        this.f7177h = C11901g.m38136a(C3396x.m11639a(this.f7176g));
                        this.f7178i = C11901g.m38136a(C5988n.m19182a());
                        this.f7179j = C11894b.m38127b(C3285a0.m11345a(this.f7175f));
                        this.f7180k = C11901g.m38136a(C5947b.m19078a(C2505s.this.f6870V0));
                    }

                    /* renamed from: c */
                    private C7341f m9734c(C7341f fVar) {
                        C11891j.m38119a(fVar, C2533c.this.m9571d());
                        C7348g.m22035a(fVar, m9753v());
                        C7348g.m22036a(fVar, C2505s.this.m9228S());
                        C7348g.m22034a(fVar, m9752u());
                        C7348g.m22025a(fVar, (C5821c0) C2505s.this.f6835J1.get());
                        C7348g.m22030a(fVar, new C5955f());
                        C7348g.m22031a(fVar, m9728H());
                        C7348g.m22023a(fVar, m9738g());
                        C7348g.m22028a(fVar, new C5950d());
                        C7348g.m22026a(fVar, m9742k());
                        C7348g.m22024a(fVar, m9756y());
                        C7348g.m22033a(fVar, m9745n());
                        C7348g.m22032a(fVar, C7340e.m21999a());
                        C7348g.m22029a(fVar, m9743l());
                        C7348g.m22027a(fVar, (C5944a) this.f7180k.get());
                        return fVar;
                    }

                    /* renamed from: a */
                    public void mo11603a(C7341f fVar) {
                        m9734c(fVar);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$m */
                /* compiled from: DaggerTvAppComponent */
                class C2560m implements Provider<C7812a> {
                    C2560m() {
                    }

                    public C7812a get() {
                        return new C2565o0(C2533c.this, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$m0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2561m0 implements C7780a {
                    private C2561m0() {
                    }

                    /* synthetic */ C2561m0(C2533c cVar, C2506a aVar) {
                        this();
                    }

                    /* renamed from: a */
                    public C7779h mo11605a(C7784l lVar) {
                        C11897e.m38129a(lVar);
                        return new C2563n0(C2533c.this, lVar, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$n */
                /* compiled from: DaggerTvAppComponent */
                class C2562n implements Provider<C7758a> {
                    C2562n() {
                    }

                    public C7758a get() {
                        return new C2553i0(C2533c.this, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$n0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2563n0 implements C7779h {

                    /* renamed from: a */
                    private final C7784l f7185a;

                    /* renamed from: b */
                    private Provider<C7787n> f7186b;

                    /* renamed from: c */
                    private Provider<C7776e> f7187c;

                    /* synthetic */ C2563n0(C2533c cVar, C7784l lVar, C2506a aVar) {
                        this(lVar);
                    }

                    /* renamed from: b */
                    private LegalRouter m9763b() {
                        return C7781i.m22867a((C5792f) C2533c.this.f7116u.get(), FeatureLegalModule_LegalFragmentFactoryFactory.legalFragmentFactory());
                    }

                    /* renamed from: c */
                    private Map<Class<?>, Provider<C11872a<?>>> m9766c() {
                        C10388a a = C10387h.m32860a(40);
                        a.mo27182a(DeletedProgramBroadcastReceiver.class, C2505s.this.f6888b);
                        a.mo27182a(LegalCenterFragment.class, C2505s.this.f6892c);
                        a.mo27182a(MainActivity.class, C2505s.this.f6896d);
                        a.mo27182a(TvPlaybackActivity.class, C2505s.this.f6900e);
                        a.mo27182a(C2258d.class, C2516k.this.f7022b);
                        a.mo27182a(C2712g.class, C2516k.this.f7024c);
                        a.mo27182a(C7028b.class, C2516k.this.f7026d);
                        a.mo27182a(C7641a.class, C2516k.this.f7028e);
                        a.mo27182a(C7582a.class, C2516k.this.f7030f);
                        a.mo27182a(C6056a.class, C2516k.this.f7032g);
                        a.mo27182a(C2797e.class, C2516k.this.f7034h);
                        a.mo27182a(C7255a.class, C2516k.this.f7036i);
                        a.mo27182a(C7513i.class, C2516k.this.f7038j);
                        a.mo27182a(C7522l.class, C2516k.this.f7040k);
                        a.mo27182a(C7702t.class, C2516k.this.f7042l);
                        a.mo27182a(C7807c.class, C2516k.this.f7044m);
                        a.mo27182a(C7831a.class, C2516k.this.f7046n);
                        a.mo27182a(C7838e.class, C2516k.this.f7048o);
                        a.mo27182a(C6769r0.class, C2516k.this.f7050p);
                        a.mo27182a(C7935b.class, C2516k.this.f7052q);
                        a.mo27182a(C10572h.class, C2516k.this.f7054r);
                        a.mo27182a(C7664b.class, C2530g0.this.f7087b);
                        a.mo27182a(C3176e.class, C2533c.this.f7097b);
                        a.mo27182a(C6099e.class, C2533c.this.f7098c);
                        a.mo27182a(C7588b.class, C2533c.this.f7099d);
                        a.mo27182a(C7813d.class, C2533c.this.f7100e);
                        a.mo27182a(C7745e.class, C2533c.this.f7101f);
                        a.mo27182a(C7341f.class, C2533c.this.f7102g);
                        a.mo27182a(C2876l.class, C2533c.this.f7103h);
                        a.mo27182a(C2735f.class, C2533c.this.f7104i);
                        a.mo27182a(C5449c.class, C2533c.this.f7105j);
                        a.mo27182a(C5513c.class, C2533c.this.f7106k);
                        a.mo27182a(C2881m0.class, C2533c.this.f7107l);
                        a.mo27182a(C5393h.class, C2533c.this.f7108m);
                        a.mo27182a(C5418q0.class, C2533c.this.f7109n);
                        a.mo27182a(C7784l.class, C2533c.this.f7110o);
                        a.mo27182a(C8068y.class, C2533c.this.f7111p);
                        a.mo27182a(C7444g.class, C2533c.this.f7112q);
                        a.mo27182a(C10597i.class, C2533c.this.f7113r);
                        a.mo27182a(C6591b.class, C2533c.this.f7114s);
                        return a.mo27183a();
                    }

                    /* renamed from: d */
                    private C7777f m9767d() {
                        return C7782j.m22868a(C2505s.this.f6884a, m9763b(), (C5792f) C2533c.this.f7116u.get(), C2516k.this.m9507t());
                    }

                    /* renamed from: e */
                    private C7793s m9768e() {
                        return C7783k.m22869a(this.f7185a, m9767d(), (C6667g1) C2505s.this.f6869V.get(), C2505s.this.m9276d(), (C7776e) this.f7187c.get(), Boolean.valueOf(C2505s.this.m9255Z()), C2505s.this.m9341q(), C2505s.this.m9281e());
                    }

                    private C2563n0(C7784l lVar) {
                        this.f7185a = lVar;
                        m9764b(lVar);
                    }

                    /* renamed from: a */
                    private C11876f<Object> m9762a() {
                        return C11878g.m38111a(m9766c(), C10387h.m32863d());
                    }

                    /* renamed from: b */
                    private void m9764b(C7784l lVar) {
                        this.f7186b = C7788o.m22873a(C2491g.m9123a());
                        this.f7187c = C11894b.m38127b(this.f7186b);
                    }

                    /* renamed from: c */
                    private C7784l m9765c(C7784l lVar) {
                        C11891j.m38119a(lVar, m9762a());
                        C7786m.m22871a(lVar, m9768e());
                        return lVar;
                    }

                    /* renamed from: a */
                    public void mo11603a(C7784l lVar) {
                        m9765c(lVar);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$o */
                /* compiled from: DaggerTvAppComponent */
                class C2564o implements Provider<C7324a> {
                    C2564o() {
                    }

                    public C7324a get() {
                        return new C2557k0(C2533c.this, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$o0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2565o0 implements C7812a {
                    private C2565o0() {
                    }

                    /* synthetic */ C2565o0(C2533c cVar, C2506a aVar) {
                        this();
                    }

                    /* renamed from: a */
                    public C7811c mo11605a(C7813d dVar) {
                        C11897e.m38129a(dVar);
                        return new C2567p0(C2533c.this, dVar, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$p */
                /* compiled from: DaggerTvAppComponent */
                class C2566p implements Provider<C2874a> {
                    C2566p() {
                    }

                    public C2874a get() {
                        return new C2572s(C2533c.this, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$p0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2567p0 implements C7811c {

                    /* renamed from: a */
                    private final C7813d f7192a;

                    /* renamed from: b */
                    private Provider<C3364j> f7193b;

                    /* renamed from: c */
                    private Provider<C3493c> f7194c;

                    /* renamed from: d */
                    private Provider<C7813d> f7195d;

                    /* renamed from: e */
                    private Provider<C3416k0> f7196e;

                    /* renamed from: f */
                    private Provider<C3394w> f7197f;

                    /* renamed from: g */
                    private Provider<ShelfFragmentHelper> f7198g;

                    /* synthetic */ C2567p0(C2533c cVar, C7813d dVar, C2506a aVar) {
                        this(dVar);
                    }

                    /* renamed from: b */
                    private C3346d m9774b() {
                        C3346d dVar = new C3346d((C3653c) C2533c.this.f7117v.get(), C2533c.this.m9578h(), C2505s.this.f6884a, (C3678l) C2505s.this.f6894c1.get(), (C3439e) C2516k.this.f7067x0.get(), Optional.m32792d());
                        return dVar;
                    }

                    /* renamed from: c */
                    private C3349f m9776c() {
                        C3349f fVar = new C3349f((C3448m) C2505s.this.f6883Z1.get(), m9790p(), m9778d(), m9784j(), C2505s.this.m9255Z());
                        return fVar;
                    }

                    /* renamed from: d */
                    private C3353c m9778d() {
                        C3353c cVar = new C3353c(m9773a(), m9774b(), (C3364j) this.f7193b.get(), (C4793a) C2505s.this.f6965u0.get(), m9780f(), (C3716q) C2505s.this.f6838K1.get(), (C5821c0) C2505s.this.f6835J1.get());
                        return cVar;
                    }

                    /* renamed from: e */
                    private C3432o m9779e() {
                        return new C3432o(new C5758a(), (C3441g) C2505s.this.f6891b2.get());
                    }

                    /* renamed from: f */
                    private C3454q m9780f() {
                        return C3500v.m11873a(m9781g(), this.f7192a, m9796v());
                    }

                    /* renamed from: g */
                    private C3464g m9781g() {
                        C3464g gVar = new C3464g(C2516k.this.f7013T, C2516k.this.f7011R, C2516k.this.f7067x0, C2505s.this.f6864T0, C2516k.this.f6995B, Optional.m32791c(m9787m()), C2505s.this.f6979y1);
                        return gVar;
                    }

                    /* renamed from: h */
                    private C3504y m9782h() {
                        return new C3504y(m9776c(), Optional.m32792d());
                    }

                    /* renamed from: i */
                    private C3357b m9783i() {
                        C3357b bVar = new C3357b(m9774b(), m9795u(), C2505s.this.m9255Z(), m9773a(), (C3364j) this.f7193b.get(), (C3394w) this.f7197f.get());
                        return bVar;
                    }

                    /* renamed from: j */
                    private C3367a m9784j() {
                        C3367a aVar = new C3367a(Optional.m32792d(), m9774b(), m9792r(), (C3441g) C2505s.this.f6891b2.get(), Optional.m32792d());
                        return aVar;
                    }

                    /* renamed from: k */
                    private C5588o m9785k() {
                        return C3287b0.m11356a(this.f7192a);
                    }

                    /* renamed from: l */
                    private RecyclerViewSnapScrollHelper m9786l() {
                        return new RecyclerViewSnapScrollHelper(new C5758a(), C2505s.this.m9255Z());
                    }

                    /* renamed from: m */
                    private C3314g m9787m() {
                        return C3501w.m11874a((C3419l) C2505s.this.f6864T0.get(), C2516k.this.m9470e());
                    }

                    /* renamed from: n */
                    private C3409a m9788n() {
                        return new C3409a(m9780f(), m9782h(), m9785k(), C2505s.this.m9228S());
                    }

                    /* renamed from: o */
                    private C3376a m9789o() {
                        return new C3376a(m9774b(), m9773a());
                    }

                    /* renamed from: p */
                    private C3391u m9790p() {
                        C3391u uVar = new C3391u(m9793s(), m9783i(), m9789o(), m9791q(), C2505s.this.m9255Z(), new C3341a(), new C5825e(), Optional.m32792d());
                        return uVar;
                    }

                    /* renamed from: q */
                    private C3393a m9791q() {
                        C3393a aVar = new C3393a(m9780f(), m9792r(), (ShelfFragmentHelper) this.f7198g.get(), m9773a(), C2505s.this.f6887a2, m9780f(), new C5825e(), (C3441g) C2505s.this.f6891b2.get());
                        return aVar;
                    }

                    /* renamed from: r */
                    private C3416k0 m9792r() {
                        return C3289c0.m11360a((Fragment) this.f7192a);
                    }

                    /* renamed from: s */
                    private C3398a m9793s() {
                        C3398a aVar = new C3398a(m9773a(), m9774b(), (C3364j) this.f7193b.get(), m9794t(), m9780f());
                        return aVar;
                    }

                    /* renamed from: t */
                    private C3404b m9794t() {
                        return new C3404b(this.f7194c, Optional.m32792d(), this.f7197f, Optional.m32792d());
                    }

                    /* renamed from: u */
                    private C3493c m9795u() {
                        return new C3493c(new C3490a());
                    }

                    /* renamed from: v */
                    private C3676k m9796v() {
                        return C7810b.m22897a(this.f7192a);
                    }

                    private C2567p0(C7813d dVar) {
                        this.f7192a = dVar;
                        m9775b(dVar);
                    }

                    /* renamed from: a */
                    private C3324g m9773a() {
                        C3324g gVar = new C3324g((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get(), (C2476z) C2505s.this.f6957s0.get(), C2505s.this.m9376x(), C5872f.m18926b(), new C6250g());
                        return gVar;
                    }

                    /* renamed from: b */
                    private void m9775b(C7813d dVar) {
                        this.f7193b = C11901g.m38136a(C3365k.m11555a(C2505s.this.f6924k));
                        this.f7194c = C3495d.m11868a(C3492b.m11863a());
                        this.f7195d = C11896d.m38128a(dVar);
                        this.f7196e = C3289c0.m11359a(this.f7195d);
                        this.f7197f = C11901g.m38136a(C3396x.m11639a(this.f7196e));
                        this.f7198g = C11894b.m38127b(C3285a0.m11345a(this.f7195d));
                    }

                    /* renamed from: c */
                    private C7813d m9777c(C7813d dVar) {
                        C11891j.m38119a(dVar, C2533c.this.m9571d());
                        C3286b.m11348a((C3280a) dVar, m9788n());
                        C3286b.m11349a((C3280a) dVar, m9779e());
                        C3286b.m11352a((C3280a) dVar, m9786l());
                        C3286b.m11355c(dVar, Optional.m32792d());
                        C3286b.m11354b(dVar, Optional.m32792d());
                        C3286b.m11353a((C3280a) dVar, Optional.m32792d());
                        C3286b.m11350a((C3280a) dVar, m9780f());
                        C3286b.m11347a((C3280a) dVar, (C2366i0) C2505s.this.f6979y1.get());
                        C3286b.m11351a((C3280a) dVar, m9796v());
                        C7818e.m22905a(dVar, C2530g0.this.m9542a());
                        return dVar;
                    }

                    /* renamed from: a */
                    public void mo11603a(C7813d dVar) {
                        m9777c(dVar);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$q */
                /* compiled from: DaggerTvAppComponent */
                class C2568q implements Provider<C2734a> {
                    C2568q() {
                    }

                    public C2734a get() {
                        return new C2576u(C2533c.this, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$q0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2569q0 implements C2866a {
                    private C2569q0() {
                    }

                    /* synthetic */ C2569q0(C2533c cVar, C2506a aVar) {
                        this();
                    }

                    /* renamed from: a */
                    public C2865g0 mo11605a(C2881m0 m0Var) {
                        C11897e.m38129a(m0Var);
                        return new C2571r0(C2533c.this, m0Var, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$r */
                /* compiled from: DaggerTvAppComponent */
                class C2570r implements Provider<C5502a> {
                    C2570r() {
                    }

                    public C5502a get() {
                        return new C2535a0(C2533c.this, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$r0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2571r0 implements C2865g0 {

                    /* renamed from: a */
                    private final C2881m0 f7203a;

                    /* synthetic */ C2571r0(C2533c cVar, C2881m0 m0Var, C2506a aVar) {
                        this(m0Var);
                    }

                    /* renamed from: b */
                    private C2887n m9803b() {
                        return new C2887n((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get());
                    }

                    /* renamed from: c */
                    private C2928w m9804c() {
                        return new C2928w(C2505s.this.m9336p(), C2505s.this.m9276d(), m9801a(), (C7614e) C2505s.this.f6973w1.get());
                    }

                    /* renamed from: d */
                    private C2940x m9805d() {
                        return new C2940x(C2505s.this.m9336p(), C2872j0.m10588a(), (C7614e) C2505s.this.f6973w1.get());
                    }

                    /* renamed from: e */
                    private C2901o0 m9806e() {
                        return C2879l0.m10595a(this.f7203a, m9801a(), m9805d(), m9804c(), C2868h0.m10584a(), C2533c.this.m9575f(), C2516k.this.m9495n(), Boolean.valueOf(C2505s.this.m9255Z()), m9803b());
                    }

                    /* renamed from: f */
                    private C2756e m9807f() {
                        return C2875k0.m10589a((C5792f) C2533c.this.f7116u.get());
                    }

                    private C2571r0(C2881m0 m0Var) {
                        this.f7203a = m0Var;
                    }

                    /* renamed from: a */
                    private String m9801a() {
                        return C2870i0.m10586a(this.f7203a);
                    }

                    /* renamed from: b */
                    private C2881m0 m9802b(C2881m0 m0Var) {
                        C11891j.m38119a(m0Var, C2533c.this.m9571d());
                        C2919p.m10681a((C2889o) m0Var, m9806e());
                        C2919p.m10680a((C2889o) m0Var, m9803b());
                        C2919p.m10684a((C2889o) m0Var, (C7773b) C2516k.this.m9507t());
                        C2919p.m10683a((C2889o) m0Var, C6140n.m19574b());
                        C2919p.m10682a((C2889o) m0Var, C2516k.this.m9415C());
                        C2919p.m10685a((C2889o) m0Var, m9801a());
                        C2888n0.m10615a(m0Var, m9807f());
                        C2888n0.m10614a(m0Var, (C2752a) C2533c.this.m9562a());
                        C2888n0.m10616a(m0Var, C5872f.m18926b());
                        C2888n0.m10617b(m0Var, C5873g.m18928b());
                        return m0Var;
                    }

                    /* renamed from: a */
                    public void mo11603a(C2881m0 m0Var) {
                        m9802b(m0Var);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$s */
                /* compiled from: DaggerTvAppComponent */
                private final class C2572s implements C2874a {
                    private C2572s() {
                    }

                    /* synthetic */ C2572s(C2533c cVar, C2506a aVar) {
                        this();
                    }

                    /* renamed from: a */
                    public C2873k mo11605a(C2876l lVar) {
                        C11897e.m38129a(lVar);
                        return new C2574t(C2533c.this, lVar, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$s0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2573s0 implements C8066a {
                    private C2573s0() {
                    }

                    /* synthetic */ C2573s0(C2533c cVar, C2506a aVar) {
                        this();
                    }

                    /* renamed from: a */
                    public C8065w mo11605a(C8068y yVar) {
                        C11897e.m38129a(yVar);
                        return new C2575t0(C2533c.this, yVar, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$t */
                /* compiled from: DaggerTvAppComponent */
                private final class C2574t implements C2873k {

                    /* renamed from: a */
                    private final C2876l f7207a;

                    /* synthetic */ C2574t(C2533c cVar, C2876l lVar, C2506a aVar) {
                        this(lVar);
                    }

                    /* renamed from: b */
                    private C2887n m9816b() {
                        return new C2887n((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get());
                    }

                    /* renamed from: c */
                    private C2928w m9817c() {
                        return new C2928w(C2505s.this.m9336p(), C2505s.this.m9276d(), m9814a(), (C7614e) C2505s.this.f6973w1.get());
                    }

                    /* renamed from: d */
                    private C2940x m9818d() {
                        return new C2940x(C2505s.this.m9336p(), C2867h.m10583a(), (C7614e) C2505s.this.f6973w1.get());
                    }

                    /* renamed from: e */
                    private C2901o0 m9819e() {
                        return C2871j.m10587a(this.f7207a, m9814a(), m9818d(), m9817c(), C2862f.m10575a(), C2533c.this.m9575f(), C2516k.this.m9495n(), Boolean.valueOf(C2505s.this.m9255Z()), m9816b());
                    }

                    /* renamed from: f */
                    private C2756e m9820f() {
                        return C2869i.m10585a((C5792f) C2533c.this.f7116u.get());
                    }

                    private C2574t(C2876l lVar) {
                        this.f7207a = lVar;
                    }

                    /* renamed from: a */
                    private String m9814a() {
                        return C2864g.m10582a(this.f7207a);
                    }

                    /* renamed from: b */
                    private C2876l m9815b(C2876l lVar) {
                        C11891j.m38119a(lVar, C2533c.this.m9571d());
                        C2919p.m10681a((C2889o) lVar, m9819e());
                        C2919p.m10680a((C2889o) lVar, m9816b());
                        C2919p.m10684a((C2889o) lVar, (C7773b) C2516k.this.m9507t());
                        C2919p.m10683a((C2889o) lVar, C6140n.m19574b());
                        C2919p.m10682a((C2889o) lVar, C2516k.this.m9415C());
                        C2919p.m10685a((C2889o) lVar, m9814a());
                        C2880m.m10596a(lVar, m9820f());
                        return lVar;
                    }

                    /* renamed from: a */
                    public void mo11603a(C2876l lVar) {
                        m9815b(lVar);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$t0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2575t0 implements C8065w {

                    /* renamed from: a */
                    private final C8068y f7209a;

                    /* renamed from: b */
                    private Provider<C3364j> f7210b;

                    /* renamed from: c */
                    private Provider<C3493c> f7211c;

                    /* renamed from: d */
                    private Provider<C8068y> f7212d;

                    /* renamed from: e */
                    private Provider<C3416k0> f7213e;

                    /* renamed from: f */
                    private Provider<C3394w> f7214f;

                    /* renamed from: g */
                    private Provider<ShelfFragmentHelper> f7215g;

                    /* synthetic */ C2575t0(C2533c cVar, C8068y yVar, C2506a aVar) {
                        this(yVar);
                    }

                    /* renamed from: b */
                    private C3346d m9824b() {
                        C3346d dVar = new C3346d((C3653c) C2533c.this.f7117v.get(), C2533c.this.m9578h(), C2505s.this.f6884a, (C3678l) C2505s.this.f6894c1.get(), (C3439e) C2516k.this.f7067x0.get(), Optional.m32792d());
                        return dVar;
                    }

                    /* renamed from: c */
                    private C3349f m9826c() {
                        C3349f fVar = new C3349f((C3448m) C2505s.this.f6883Z1.get(), m9842r(), m9828d(), m9831g(), C2505s.this.m9255Z());
                        return fVar;
                    }

                    /* renamed from: d */
                    private C3353c m9828d() {
                        C3353c cVar = new C3353c(m9823a(), m9824b(), (C3364j) this.f7210b.get(), (C4793a) C2505s.this.f6965u0.get(), m9840p(), (C3716q) C2505s.this.f6838K1.get(), (C5821c0) C2505s.this.f6835J1.get());
                        return cVar;
                    }

                    /* renamed from: e */
                    private C3432o m9829e() {
                        return new C3432o(new C5758a(), (C3441g) C2505s.this.f6891b2.get());
                    }

                    /* renamed from: f */
                    private C3357b m9830f() {
                        C3357b bVar = new C3357b(m9824b(), m9847w(), C2505s.this.m9255Z(), m9823a(), (C3364j) this.f7210b.get(), (C3394w) this.f7214f.get());
                        return bVar;
                    }

                    /* renamed from: g */
                    private C3367a m9831g() {
                        C3367a aVar = new C3367a(Optional.m32792d(), m9824b(), m9844t(), (C3441g) C2505s.this.f6891b2.get(), Optional.m32792d());
                        return aVar;
                    }

                    /* renamed from: h */
                    private C5588o m9832h() {
                        return C3287b0.m11356a(this.f7209a);
                    }

                    /* renamed from: i */
                    private C8034i m9833i() {
                        return new C8034i(C8026f0.m23339a(), C2494j.m9130b(), C5872f.m18926b(), (C6667g1) C2505s.this.f6869V.get());
                    }

                    /* renamed from: j */
                    private C8052r m9834j() {
                        return new C8052r(m9833i());
                    }

                    /* renamed from: k */
                    private RecyclerViewSnapScrollHelper m9835k() {
                        return new RecyclerViewSnapScrollHelper(new C5758a(), C2505s.this.m9255Z());
                    }

                    /* renamed from: l */
                    private C8060t m9836l() {
                        return new C8060t((C2348e) C2505s.this.f6855Q0.get(), (C2476z) C2505s.this.f6957s0.get());
                    }

                    /* renamed from: m */
                    private C8063v m9837m() {
                        return new C8063v(new C8025f(), m9826c(), (C3572r0) C2505s.this.f6901e0.get(), C2505s.this.m9255Z());
                    }

                    /* renamed from: n */
                    private SearchRepository m9838n() {
                        return new SearchRepository(C2516k.this.m9501q());
                    }

                    /* renamed from: o */
                    private C7965a0 m9839o() {
                        return C8043i0.m23361a(this.f7209a);
                    }

                    /* renamed from: p */
                    private C7975b0 m9840p() {
                        return C8031g0.m23344a(this.f7209a, C2516k.this.m9476g(), (C3678l) C2505s.this.f6894c1.get(), m9838n(), m9834j(), C2516k.this.m9482i(), m9836l(), (C2366i0) C2505s.this.f6979y1.get(), Optional.m32792d());
                    }

                    /* renamed from: q */
                    private C3376a m9841q() {
                        return new C3376a(m9824b(), m9823a());
                    }

                    /* renamed from: r */
                    private C3391u m9842r() {
                        C3391u uVar = new C3391u(m9845u(), m9830f(), m9841q(), m9843s(), C2505s.this.m9255Z(), new C3341a(), new C5825e(), Optional.m32792d());
                        return uVar;
                    }

                    /* renamed from: s */
                    private C3393a m9843s() {
                        C3393a aVar = new C3393a(m9840p(), m9844t(), (ShelfFragmentHelper) this.f7215g.get(), m9823a(), C2505s.this.f6887a2, m9840p(), new C5825e(), (C3441g) C2505s.this.f6891b2.get());
                        return aVar;
                    }

                    /* renamed from: t */
                    private C3416k0 m9844t() {
                        return C3289c0.m11360a((Fragment) this.f7209a);
                    }

                    /* renamed from: u */
                    private C3398a m9845u() {
                        C3398a aVar = new C3398a(m9823a(), m9824b(), (C3364j) this.f7210b.get(), m9846v(), m9840p());
                        return aVar;
                    }

                    /* renamed from: v */
                    private C3404b m9846v() {
                        return new C3404b(this.f7211c, Optional.m32792d(), this.f7214f, Optional.m32792d());
                    }

                    /* renamed from: w */
                    private C3493c m9847w() {
                        return new C3493c(new C3490a());
                    }

                    /* renamed from: x */
                    private SpeechRecognizerHelper m9848x() {
                        return C8033h0.m23346a(this.f7209a);
                    }

                    private C2575t0(C8068y yVar) {
                        this.f7209a = yVar;
                        m9825b(yVar);
                    }

                    /* renamed from: a */
                    private C3324g m9823a() {
                        C3324g gVar = new C3324g((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get(), (C2476z) C2505s.this.f6957s0.get(), C2505s.this.m9376x(), C5872f.m18926b(), new C6250g());
                        return gVar;
                    }

                    /* renamed from: b */
                    private void m9825b(C8068y yVar) {
                        this.f7210b = C11901g.m38136a(C3365k.m11555a(C2505s.this.f6924k));
                        this.f7211c = C3495d.m11868a(C3492b.m11863a());
                        this.f7212d = C11896d.m38128a(yVar);
                        this.f7213e = C3289c0.m11359a(this.f7212d);
                        this.f7214f = C11901g.m38136a(C3396x.m11639a(this.f7213e));
                        this.f7215g = C11894b.m38127b(C3285a0.m11345a(this.f7212d));
                    }

                    /* renamed from: c */
                    private C8068y m9827c(C8068y yVar) {
                        C11891j.m38119a(yVar, C2533c.this.m9571d());
                        C8076z.m23422a(yVar, m9840p());
                        C8076z.m23424a(yVar, m9837m());
                        C8076z.m23426a(yVar, C2505s.this.m9228S());
                        C8076z.m23413a(yVar, m9829e());
                        C8076z.m23419a(yVar, m9835k());
                        C8076z.m23425a(yVar, m9832h());
                        C8076z.m23417a(yVar, C2516k.this.m9415C());
                        C8076z.m23416a(yVar, (C3732d) C2516k.this.m9503r());
                        C8076z.m23415a(yVar, C2505s.this.m9341q());
                        C8076z.m23420a(yVar, m9848x());
                        C8076z.m23414a(yVar, C2505s.this.m9261a0());
                        C8076z.m23421a(yVar, m9839o());
                        C8076z.m23418a(yVar, new C5759b());
                        C8076z.m23423a(yVar, new C8059s());
                        return yVar;
                    }

                    /* renamed from: a */
                    public void mo11603a(C8068y yVar) {
                        m9827c(yVar);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$u */
                /* compiled from: DaggerTvAppComponent */
                private final class C2576u implements C2734a {
                    private C2576u() {
                    }

                    /* synthetic */ C2576u(C2533c cVar, C2506a aVar) {
                        this();
                    }

                    /* renamed from: a */
                    public C2733e mo11605a(C2735f fVar) {
                        C11897e.m38129a(fVar);
                        return new C2578v(C2533c.this, fVar, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$u0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2577u0 implements C7403a {
                    private C2577u0() {
                    }

                    /* synthetic */ C2577u0(C2533c cVar, C2506a aVar) {
                        this();
                    }

                    /* renamed from: a */
                    public C7402k mo11605a(C7444g gVar) {
                        C11897e.m38129a(gVar);
                        return new C2579v0(C2533c.this, gVar, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$v */
                /* compiled from: DaggerTvAppComponent */
                private final class C2578v implements C2733e {

                    /* renamed from: a */
                    private final C2735f f7219a;

                    /* synthetic */ C2578v(C2533c cVar, C2735f fVar, C2506a aVar) {
                        this(fVar);
                    }

                    /* renamed from: b */
                    private C2997f m9857b() {
                        return new C2997f((C2750c) C2505s.this.f6880Y1.get(), C2505s.this.m9336p(), (C7614e) C2505s.this.f6973w1.get());
                    }

                    /* renamed from: c */
                    private C3017j m9858c() {
                        return C2732d.m10368a(this.f7219a, (C2750c) C2505s.this.f6880Y1.get(), m9857b(), C2731c.m10367a(), C2505s.this.m9276d(), Optional.m32791c(C2505s.this.f6820E1.get()), C2533c.this.m9575f(), m9855a());
                    }

                    private C2578v(C2735f fVar) {
                        this.f7219a = fVar;
                    }

                    /* renamed from: a */
                    private C2887n m9855a() {
                        return new C2887n((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get());
                    }

                    /* renamed from: b */
                    private C2735f m9856b(C2735f fVar) {
                        C11891j.m38119a(fVar, C2533c.this.m9571d());
                        C3015h.m10807a((C3004g) fVar, m9858c());
                        C3015h.m10806a((C3004g) fVar, m9855a());
                        C2736g.m10371a(fVar, C2533c.this.m9562a());
                        return fVar;
                    }

                    /* renamed from: a */
                    public void mo11603a(C2735f fVar) {
                        m9856b(fVar);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$v0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2579v0 implements C7402k {

                    /* renamed from: a */
                    private final C7444g f7221a;

                    /* renamed from: b */
                    private Provider<C6000s> f7222b;

                    /* renamed from: c */
                    private Provider<C5996p> f7223c;

                    /* renamed from: d */
                    private Provider<C3364j> f7224d;

                    /* renamed from: e */
                    private Provider<C3493c> f7225e;

                    /* renamed from: f */
                    private Provider<C7444g> f7226f;

                    /* renamed from: g */
                    private Provider<C3416k0> f7227g;

                    /* renamed from: h */
                    private Provider<C3394w> f7228h;

                    /* renamed from: i */
                    private Provider<C5985m> f7229i;

                    /* renamed from: j */
                    private Provider<ShelfFragmentHelper> f7230j;

                    /* renamed from: k */
                    private Provider<C5944a> f7231k;

                    /* synthetic */ C2579v0(C2533c cVar, C7444g gVar, C2506a aVar) {
                        this(gVar);
                    }

                    /* renamed from: A */
                    private C7454a m9861A() {
                        return C7441d.m22233a(this.f7221a, C2516k.this.m9429J(), m9888n(), m9895u(), C2505s.this.f6884a, C2505s.this.m9255Z(), m9897w(), m9891q(), (C3572r0) C2505s.this.f6901e0.get(), C2505s.this.m9382y(), (C2366i0) C2505s.this.f6979y1.get(), m9896v());
                    }

                    /* renamed from: B */
                    private C7408p m9862B() {
                        return C7405m.m22155a((C3572r0) C2505s.this.f6901e0.get(), (C4793a) C2505s.this.f6965u0.get(), (C3716q) C2505s.this.f6838K1.get());
                    }

                    /* renamed from: C */
                    private C3376a m9863C() {
                        return new C3376a(m9878d(), m9876c());
                    }

                    /* renamed from: D */
                    private C3391u m9864D() {
                        C3391u uVar = new C3391u(m9867G(), m9882h(), m9863C(), m9865E(), C2505s.this.m9255Z(), new C3341a(), new C5825e(), Optional.m32792d());
                        return uVar;
                    }

                    /* renamed from: E */
                    private C3393a m9865E() {
                        C3393a aVar = new C3393a((C3374o) this.f7229i.get(), m9866F(), (ShelfFragmentHelper) this.f7230j.get(), m9876c(), C2505s.this.f6887a2, m9861A(), new C5825e(), (C3441g) C2505s.this.f6891b2.get());
                        return aVar;
                    }

                    /* renamed from: F */
                    private C3416k0 m9866F() {
                        return C3289c0.m11360a((Fragment) this.f7221a);
                    }

                    /* renamed from: G */
                    private C3398a m9867G() {
                        C3398a aVar = new C3398a(m9876c(), m9878d(), (C3364j) this.f7224d.get(), m9868H(), m9861A());
                        return aVar;
                    }

                    /* renamed from: H */
                    private C3404b m9868H() {
                        return new C3404b(this.f7225e, Optional.m32792d(), this.f7228h, Optional.m32792d());
                    }

                    /* renamed from: I */
                    private C3493c m9869I() {
                        return new C3493c(new C3490a());
                    }

                    /* renamed from: J */
                    private C5956g m9870J() {
                        return new C5956g(this.f7221a);
                    }

                    /* renamed from: K */
                    private C7453j m9871K() {
                        C7453j jVar = new C7453j((C3448m) C2505s.this.f6883Z1.get(), m9865E(), (C4793a) C2505s.this.f6965u0.get(), m9869I(), m9861A(), (C3653c) C2533c.this.f7117v.get(), m9897w());
                        return jVar;
                    }

                    /* renamed from: L */
                    private C5957h m9872L() {
                        C5957h hVar = new C5957h((C3448m) C2505s.this.f6883Z1.get(), m9865E(), m9869I(), (C4793a) C2505s.this.f6965u0.get(), (C3653c) C2533c.this.f7117v.get(), m9897w(), (C3572r0) C2505s.this.f6901e0.get(), m9861A());
                        return hVar;
                    }

                    /* renamed from: b */
                    private C5935c m9874b() {
                        return new C5935c((C3572r0) C2505s.this.f6901e0.get(), (C7159g) C2505s.this.f6929l0.get(), C2505s.this.m9383y0());
                    }

                    /* renamed from: c */
                    private C3324g m9876c() {
                        C3324g gVar = new C3324g((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get(), (C2476z) C2505s.this.f6957s0.get(), C2505s.this.m9376x(), C5872f.m18926b(), new C6250g());
                        return gVar;
                    }

                    /* renamed from: d */
                    private C3346d m9878d() {
                        C3346d dVar = new C3346d((C3653c) C2533c.this.f7117v.get(), C2533c.this.m9578h(), C2505s.this.f6884a, (C3678l) C2505s.this.f6894c1.get(), (C3439e) C2516k.this.f7067x0.get(), Optional.m32792d());
                        return dVar;
                    }

                    /* renamed from: e */
                    private C3349f m9879e() {
                        C3349f fVar = new C3349f((C3448m) C2505s.this.f6883Z1.get(), m9864D(), m9880f(), m9890p(), C2505s.this.m9255Z());
                        return fVar;
                    }

                    /* renamed from: f */
                    private C3353c m9880f() {
                        C3353c cVar = new C3353c(m9876c(), m9878d(), (C3364j) this.f7224d.get(), (C4793a) C2505s.this.f6965u0.get(), m9861A(), (C3716q) C2505s.this.f6838K1.get(), (C5821c0) C2505s.this.f6835J1.get());
                        return cVar;
                    }

                    /* renamed from: g */
                    private C3432o m9881g() {
                        return new C3432o(new C5758a(), (C3441g) C2505s.this.f6891b2.get());
                    }

                    /* renamed from: h */
                    private C3357b m9882h() {
                        C3357b bVar = new C3357b(m9878d(), m9869I(), C2505s.this.m9255Z(), m9876c(), (C3364j) this.f7224d.get(), (C3394w) this.f7228h.get());
                        return bVar;
                    }

                    /* renamed from: i */
                    private C5918e m9883i() {
                        return new C5918e((C6000s) this.f7222b.get());
                    }

                    /* renamed from: j */
                    private C5910b m9884j() {
                        return new C5910b(C2516k.this.m9491l());
                    }

                    /* renamed from: k */
                    private C5951e m9885k() {
                        return new C5951e((C7159g) C2505s.this.f6929l0.get(), C2505s.this.m9382y());
                    }

                    /* renamed from: l */
                    private C5938d m9886l() {
                        return new C5938d(C2505s.this.m9303i0(), C2505s.this.f6884a, C2505s.this.m9348r0(), C2505s.this.m9382y());
                    }

                    /* renamed from: m */
                    private DetailOfflineStateMonitor m9887m() {
                        return C7404l.m22154a(m9892r(), C2516k.this.m9415C(), this.f7221a, m9861A());
                    }

                    /* renamed from: n */
                    private C5969i m9888n() {
                        return new C5969i(C2516k.this.m9444Q(), C2516k.this.m9495n());
                    }

                    /* renamed from: o */
                    private EpisodeDataSource m9889o() {
                        return new EpisodeDataSource(C2516k.this.m9501q());
                    }

                    /* renamed from: p */
                    private C3367a m9890p() {
                        C3367a aVar = new C3367a(Optional.m32792d(), m9878d(), m9866F(), (C3441g) C2505s.this.f6891b2.get(), Optional.m32792d());
                        return aVar;
                    }

                    /* renamed from: q */
                    private C5921b m9891q() {
                        return new C5921b(m9873a(), (C5821c0) C2505s.this.f6835J1.get(), (C3572r0) C2505s.this.f6901e0.get(), (C3716q) C2505s.this.f6838K1.get());
                    }

                    /* renamed from: r */
                    private C5588o m9892r() {
                        return C3287b0.m11356a(this.f7221a);
                    }

                    /* renamed from: s */
                    private C5998r m9893s() {
                        return new C5998r((C3572r0) C2505s.this.f6901e0.get(), (C5996p) this.f7223c.get());
                    }

                    /* renamed from: t */
                    private RecyclerViewSnapScrollHelper m9894t() {
                        return new RecyclerViewSnapScrollHelper(new C5758a(), C2505s.this.m9255Z());
                    }

                    /* renamed from: u */
                    private C6004v m9895u() {
                        return new C6004v(C2516k.this.m9501q(), C5872f.m18926b());
                    }

                    /* renamed from: v */
                    private C7383c m9896v() {
                        C7383c cVar = new C7383c(Optional.m32792d(), C2516k.this.m9444Q(), m9889o(), m9898x(), new C7452i(), C2505s.this.m9255Z());
                        return cVar;
                    }

                    /* renamed from: w */
                    private C7391d m9897w() {
                        C7391d dVar = new C7391d((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get(), (C2476z) C2505s.this.f6957s0.get(), C2505s.this.m9376x(), C5872f.m18926b(), new C6250g());
                        return dVar;
                    }

                    /* renamed from: x */
                    private C7394e m9898x() {
                        return C7442e.m22234a(this.f7221a);
                    }

                    /* renamed from: y */
                    private C7435b m9899y() {
                        C7435b bVar = new C7435b((C3850c) C2505s.this.f6903e2.get(), m9861A(), m9883i(), (C3653c) C2533c.this.f7117v.get(), m9862B(), m9897w(), (C3572r0) C2505s.this.f6901e0.get(), m9893s(), C2505s.this.m9382y());
                        return bVar;
                    }

                    /* renamed from: z */
                    private C7443f m9900z() {
                        C7443f fVar = new C7443f(m9899y(), (C3653c) C2533c.this.f7117v.get(), m9897w(), m9879e(), m9871K(), m9872L(), m9861A(), C7406n.m22156a(), (C6000s) this.f7222b.get());
                        return fVar;
                    }

                    private C2579v0(C7444g gVar) {
                        this.f7221a = gVar;
                        m9875b(gVar);
                    }

                    /* renamed from: a */
                    private C5929b m9873a() {
                        return new C5929b(C2505s.this.m9321m(), m9874b(), (C6667g1) C2505s.this.f6869V.get(), m9886l());
                    }

                    /* renamed from: b */
                    private void m9875b(C7444g gVar) {
                        this.f7222b = C11901g.m38136a(C6002t.m19223a());
                        this.f7223c = C11901g.m38136a(C5997q.m19212a(C2505s.this.f6932m, C2505s.this.f6824G));
                        this.f7224d = C11901g.m38136a(C3365k.m11555a(C2505s.this.f6924k));
                        this.f7225e = C3495d.m11868a(C3492b.m11863a());
                        this.f7226f = C11896d.m38128a(gVar);
                        this.f7227g = C3289c0.m11359a(this.f7226f);
                        this.f7228h = C11901g.m38136a(C3396x.m11639a(this.f7227g));
                        this.f7229i = C11901g.m38136a(C5988n.m19182a());
                        this.f7230j = C11894b.m38127b(C3285a0.m11345a(this.f7226f));
                        this.f7231k = C11901g.m38136a(C5947b.m19078a(C2505s.this.f6870V0));
                    }

                    /* renamed from: c */
                    private C7444g m9877c(C7444g gVar) {
                        C11891j.m38119a(gVar, C2533c.this.m9571d());
                        C7451h.m22266a(gVar, m9861A());
                        C7451h.m22265a(gVar, m9900z());
                        C7451h.m22267a(gVar, C2505s.this.m9228S());
                        C7451h.m22262a(gVar, new C5955f());
                        C7451h.m22256a(gVar, m9881g());
                        C7451h.m22263a(gVar, m9870J());
                        C7451h.m22258a(gVar, m9884j());
                        C7451h.m22260a(gVar, new C5950d());
                        C7451h.m22257a(gVar, m9894t());
                        C7451h.m22264a(gVar, m9887m());
                        C7451h.m22261a(gVar, m9885k());
                        C7451h.m22259a(gVar, (C5944a) this.f7231k.get());
                        return gVar;
                    }

                    /* renamed from: a */
                    public void mo11603a(C7444g gVar) {
                        m9877c(gVar);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$w */
                /* compiled from: DaggerTvAppComponent */
                private final class C2580w implements C5417a {
                    private C2580w() {
                    }

                    /* synthetic */ C2580w(C2533c cVar, C2506a aVar) {
                        this();
                    }

                    /* renamed from: a */
                    public C5416q mo11605a(C5393h hVar) {
                        C11897e.m38129a(hVar);
                        return new C2582x(C2533c.this, hVar, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$w0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2581w0 implements C5436a {
                    private C2581w0() {
                    }

                    /* synthetic */ C2581w0(C2533c cVar, C2506a aVar) {
                        this();
                    }

                    /* renamed from: a */
                    public C5435u0 mo11605a(C5418q0 q0Var) {
                        C11897e.m38129a(q0Var);
                        return new C2583x0(C2533c.this, q0Var, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$x */
                /* compiled from: DaggerTvAppComponent */
                private final class C2582x implements C5416q {

                    /* renamed from: a */
                    private final C5393h f7235a;

                    /* synthetic */ C2582x(C2533c cVar, C5393h hVar, C2506a aVar) {
                        this(hVar);
                    }

                    /* renamed from: b */
                    private C5495b m9909b() {
                        return new C5495b(m9910c(), m9913f(), (C3572r0) C2505s.this.f6901e0.get(), new C5386f());
                    }

                    /* renamed from: c */
                    private C5402j m9910c() {
                        return C5412o.m18175a(m9907a(), C2516k.this.m9495n(), (C5792f) C2533c.this.f7116u.get(), C2516k.this.m9447S(), (C3517b) C2505s.this.f6961t0.get());
                    }

                    /* renamed from: d */
                    private C5419r m9911d() {
                        return C5414p.m18176a(this.f7235a, C2505s.this.m9276d(), C2505s.this.m9218P0(), C2516k.this.m9415C());
                    }

                    /* renamed from: e */
                    private C5512b m9912e() {
                        return new C5512b((C2348e) C2505s.this.f6855Q0.get());
                    }

                    /* renamed from: f */
                    private C2755d m9913f() {
                        return C5410n.m18174a((C5792f) C2533c.this.f7116u.get(), C5408m.m18173a());
                    }

                    private C2582x(C5393h hVar) {
                        this.f7235a = hVar;
                    }

                    /* renamed from: a */
                    private C5389g m9907a() {
                        return new C5389g((C2348e) C2505s.this.f6855Q0.get());
                    }

                    /* renamed from: b */
                    private C5393h m9908b(C5393h hVar) {
                        C11891j.m38119a(hVar, C2533c.this.m9571d());
                        C5397i.m18145a(hVar, m9911d());
                        C5397i.m18149a(hVar, C2505s.this.m9228S());
                        C5397i.m18148a(hVar, m9912e());
                        C5397i.m18144a(hVar, m9913f());
                        C5397i.m18147a(hVar, (C5490a) m9909b());
                        C5397i.m18146a(hVar, (C5434u) C2505s.this.m9281e());
                        return hVar;
                    }

                    /* renamed from: a */
                    public void mo11603a(C5393h hVar) {
                        m9908b(hVar);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$x0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2583x0 implements C5435u0 {
                    /* synthetic */ C2583x0(C2533c cVar, C5418q0 q0Var, C2506a aVar) {
                        this(q0Var);
                    }

                    /* renamed from: b */
                    private C5402j m9917b() {
                        return C5433t0.m18197a(m9916a(), C2516k.this.m9495n(), C2516k.this.m9447S(), (C5792f) C2533c.this.f7116u.get(), (C3517b) C2505s.this.f6961t0.get());
                    }

                    private C2583x0(C5418q0 q0Var) {
                    }

                    /* renamed from: a */
                    private C5389g m9916a() {
                        return new C5389g((C2348e) C2505s.this.f6855Q0.get());
                    }

                    /* renamed from: b */
                    private C5418q0 m9918b(C5418q0 q0Var) {
                        C11891j.m38119a(q0Var, C2533c.this.m9571d());
                        C5429r0.m18195a(q0Var, m9917b());
                        return q0Var;
                    }

                    /* renamed from: a */
                    public void mo11603a(C5418q0 q0Var) {
                        m9918b(q0Var);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$y */
                /* compiled from: DaggerTvAppComponent */
                private final class C2584y implements C3193a {
                    private C2584y() {
                    }

                    /* synthetic */ C2584y(C2533c cVar, C2506a aVar) {
                        this();
                    }

                    /* renamed from: a */
                    public C3192i mo11605a(C3176e eVar) {
                        C11897e.m38129a(eVar);
                        return new C2586z(C2533c.this, eVar, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$y0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2585y0 implements C10596a {
                    private C2585y0() {
                    }

                    /* synthetic */ C2585y0(C2533c cVar, C2506a aVar) {
                        this();
                    }

                    /* renamed from: a */
                    public C10595h mo11605a(C10597i iVar) {
                        C11897e.m38129a(iVar);
                        return new C2587z0(C2533c.this, iVar, null);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$z */
                /* compiled from: DaggerTvAppComponent */
                private final class C2586z implements C3192i {

                    /* renamed from: a */
                    private final C3176e f7240a;

                    /* renamed from: b */
                    private Provider<C3364j> f7241b;

                    /* renamed from: c */
                    private Provider<C3493c> f7242c;

                    /* renamed from: d */
                    private Provider<C3176e> f7243d;

                    /* renamed from: e */
                    private Provider<C3416k0> f7244e;

                    /* renamed from: f */
                    private Provider<C3394w> f7245f;

                    /* renamed from: g */
                    private Provider<AssetStaticImageHandler> f7246g;

                    /* renamed from: h */
                    private Provider<C3317e> f7247h;

                    /* renamed from: i */
                    private Provider<AssetTransitionHandler> f7248i;

                    /* renamed from: j */
                    private Provider<ShelfFragmentHelper> f7249j;

                    /* synthetic */ C2586z(C2533c cVar, C3176e eVar, C2506a aVar) {
                        this(eVar);
                    }

                    /* renamed from: b */
                    private C3317e m9926b() {
                        return C3195k.m11131a(this.f7240a);
                    }

                    /* renamed from: c */
                    private BrandPageAnimationHelper m9928c() {
                        return C3194j.m11129a(this.f7240a);
                    }

                    /* renamed from: d */
                    private C3324g m9930d() {
                        C3324g gVar = new C3324g((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get(), (C2476z) C2505s.this.f6957s0.get(), C2505s.this.m9376x(), C5872f.m18926b(), new C6250g());
                        return gVar;
                    }

                    /* renamed from: e */
                    private C3346d m9931e() {
                        C3346d dVar = new C3346d((C3653c) C2533c.this.f7117v.get(), C2533c.this.m9578h(), C2505s.this.f6884a, (C3678l) C2505s.this.f6894c1.get(), (C3439e) C2516k.this.f7067x0.get(), Optional.m32792d());
                        return dVar;
                    }

                    /* renamed from: f */
                    private C3349f m9932f() {
                        C3349f fVar = new C3349f((C3448m) C2505s.this.f6883Z1.get(), m9946t(), m9933g(), m9939m(), C2505s.this.m9255Z());
                        return fVar;
                    }

                    /* renamed from: g */
                    private C3353c m9933g() {
                        C3353c cVar = new C3353c(m9930d(), m9931e(), (C3364j) this.f7241b.get(), (C4793a) C2505s.this.f6965u0.get(), m9935i(), (C3716q) C2505s.this.f6838K1.get(), (C5821c0) C2505s.this.f6835J1.get());
                        return cVar;
                    }

                    /* renamed from: h */
                    private C3432o m9934h() {
                        return new C3432o(new C5758a(), (C3441g) C2505s.this.f6891b2.get());
                    }

                    /* renamed from: i */
                    private C3454q m9935i() {
                        return C3500v.m11873a(m9936j(), this.f7240a, m9952z());
                    }

                    /* renamed from: j */
                    private C3464g m9936j() {
                        C3464g gVar = new C3464g(C2516k.this.f7013T, C2516k.this.f7011R, C2516k.this.f7067x0, C2505s.this.f6864T0, C2516k.this.f6995B, Optional.m32791c(m9943q()), C2505s.this.f6979y1);
                        return gVar;
                    }

                    /* renamed from: k */
                    private C3504y m9937k() {
                        return new C3504y(m9932f(), Optional.m32792d());
                    }

                    /* renamed from: l */
                    private C3357b m9938l() {
                        C3357b bVar = new C3357b(m9931e(), m9951y(), C2505s.this.m9255Z(), m9930d(), (C3364j) this.f7241b.get(), (C3394w) this.f7245f.get());
                        return bVar;
                    }

                    /* renamed from: m */
                    private C3367a m9939m() {
                        C3367a aVar = new C3367a(Optional.m32792d(), m9931e(), m9948v(), (C3441g) C2505s.this.f6891b2.get(), Optional.m32792d());
                        return aVar;
                    }

                    /* renamed from: n */
                    private C3327g0 m9940n() {
                        return C3198n.m11136a(this.f7240a);
                    }

                    /* renamed from: o */
                    private C5588o m9941o() {
                        return C3287b0.m11356a(this.f7240a);
                    }

                    /* renamed from: p */
                    private RecyclerViewSnapScrollHelper m9942p() {
                        return new RecyclerViewSnapScrollHelper(new C5758a(), C2505s.this.m9255Z());
                    }

                    /* renamed from: q */
                    private C3314g m9943q() {
                        return C3501w.m11874a((C3419l) C2505s.this.f6864T0.get(), C2516k.this.m9470e());
                    }

                    /* renamed from: r */
                    private C3409a m9944r() {
                        return new C3409a(m9935i(), m9937k(), m9941o(), C2505s.this.m9228S());
                    }

                    /* renamed from: s */
                    private C3376a m9945s() {
                        return new C3376a(m9931e(), m9930d());
                    }

                    /* renamed from: t */
                    private C3391u m9946t() {
                        C3391u uVar = new C3391u(m9949w(), m9938l(), m9945s(), m9947u(), C2505s.this.m9255Z(), new C3341a(), new C5825e(), Optional.m32792d());
                        return uVar;
                    }

                    /* renamed from: u */
                    private C3393a m9947u() {
                        C3393a aVar = new C3393a(m9935i(), m9948v(), (ShelfFragmentHelper) this.f7249j.get(), m9930d(), C2505s.this.f6887a2, m9935i(), new C5825e(), (C3441g) C2505s.this.f6891b2.get());
                        return aVar;
                    }

                    /* renamed from: v */
                    private C3416k0 m9948v() {
                        return C3289c0.m11360a((Fragment) this.f7240a);
                    }

                    /* renamed from: w */
                    private C3398a m9949w() {
                        C3398a aVar = new C3398a(m9930d(), m9931e(), (C3364j) this.f7241b.get(), m9950x(), m9935i());
                        return aVar;
                    }

                    /* renamed from: x */
                    private C3404b m9950x() {
                        return new C3404b(this.f7242c, Optional.m32791c(m9926b()), this.f7245f, Optional.m32791c(this.f7248i.get()));
                    }

                    /* renamed from: y */
                    private C3493c m9951y() {
                        return new C3493c(new C3490a());
                    }

                    /* renamed from: z */
                    private C3676k m9952z() {
                        return C3199o.m11137a(this.f7240a);
                    }

                    private C2586z(C3176e eVar) {
                        this.f7240a = eVar;
                        m9927b(eVar);
                    }

                    /* renamed from: a */
                    private AssetStaticImageHandler m9925a() {
                        return C3197m.m11135a(this.f7240a, (Context) C2505s.this.f6884a, (C7159g) C2505s.this.f6929l0.get(), (C3848a) C2530g0.this.m9542a());
                    }

                    /* renamed from: b */
                    private void m9927b(C3176e eVar) {
                        this.f7241b = C11901g.m38136a(C3365k.m11555a(C2505s.this.f6924k));
                        this.f7242c = C3495d.m11868a(C3492b.m11863a());
                        this.f7243d = C11896d.m38128a(eVar);
                        this.f7244e = C3289c0.m11359a(this.f7243d);
                        this.f7245f = C11901g.m38136a(C3396x.m11639a(this.f7244e));
                        this.f7246g = C3197m.m11134a(this.f7243d, C2505s.this.f6904f, C2505s.this.f6929l0, C2530g0.this.f7092g);
                        this.f7247h = C3195k.m11130a(this.f7243d);
                        this.f7248i = C11894b.m38127b(C3196l.m11132a(this.f7243d, this.f7246g, this.f7247h, C2516k.this.f7005L));
                        this.f7249j = C11894b.m38127b(C3285a0.m11345a(this.f7243d));
                    }

                    /* renamed from: c */
                    private C3176e m9929c(C3176e eVar) {
                        C11891j.m38119a(eVar, C2533c.this.m9571d());
                        C3286b.m11348a((C3280a) eVar, m9944r());
                        C3286b.m11349a((C3280a) eVar, m9934h());
                        C3286b.m11352a((C3280a) eVar, m9942p());
                        C3286b.m11355c(eVar, Optional.m32791c(m9926b()));
                        C3286b.m11354b(eVar, Optional.m32791c(this.f7248i.get()));
                        C3286b.m11353a((C3280a) eVar, Optional.m32791c(m9925a()));
                        C3286b.m11350a((C3280a) eVar, m9935i());
                        C3286b.m11347a((C3280a) eVar, (C2366i0) C2505s.this.f6979y1.get());
                        C3286b.m11351a((C3280a) eVar, m9952z());
                        C3188f.m11120a(eVar, (C7540c) C2516k.this.m9491l());
                        C3188f.m11115a(eVar, m9940n());
                        C3188f.m11119a(eVar, Optional.m32791c(m9928c()));
                        C3188f.m11118a(eVar, (C6627c1) C2516k.this.m9419E());
                        C3188f.m11117a(eVar, new C5759b());
                        C3188f.m11116a(eVar, new C3807b());
                        C3188f.m11114a(eVar, (C3320f) m9930d());
                        return eVar;
                    }

                    /* renamed from: a */
                    public void mo11603a(C3176e eVar) {
                        m9929c(eVar);
                    }
                }

                /* renamed from: com.bamtechmedia.dominguez.app.s$k$g0$c$z0 */
                /* compiled from: DaggerTvAppComponent */
                private final class C2587z0 implements C10595h {

                    /* renamed from: a */
                    private final C10597i f7251a;

                    /* renamed from: b */
                    private Provider<C3364j> f7252b;

                    /* renamed from: c */
                    private Provider<C3493c> f7253c;

                    /* renamed from: d */
                    private Provider<C10597i> f7254d;

                    /* renamed from: e */
                    private Provider<C3416k0> f7255e;

                    /* renamed from: f */
                    private Provider<C3394w> f7256f;

                    /* renamed from: g */
                    private Provider<ShelfFragmentHelper> f7257g;

                    /* synthetic */ C2587z0(C2533c cVar, C10597i iVar, C2506a aVar) {
                        this(iVar);
                    }

                    /* renamed from: b */
                    private C3346d m9956b() {
                        C3346d dVar = new C3346d((C3653c) C2533c.this.f7117v.get(), C2533c.this.m9578h(), C2505s.this.f6884a, (C3678l) C2505s.this.f6894c1.get(), (C3439e) C2516k.this.f7067x0.get(), Optional.m32792d());
                        return dVar;
                    }

                    /* renamed from: c */
                    private C3349f m9958c() {
                        C3349f fVar = new C3349f((C3448m) C2505s.this.f6883Z1.get(), m9972p(), m9960d(), m9966j(), C2505s.this.m9255Z());
                        return fVar;
                    }

                    /* renamed from: d */
                    private C3353c m9960d() {
                        C3353c cVar = new C3353c(m9955a(), m9956b(), (C3364j) this.f7252b.get(), (C4793a) C2505s.this.f6965u0.get(), m9962f(), (C3716q) C2505s.this.f6838K1.get(), (C5821c0) C2505s.this.f6835J1.get());
                        return cVar;
                    }

                    /* renamed from: e */
                    private C3432o m9961e() {
                        return new C3432o(new C5758a(), (C3441g) C2505s.this.f6891b2.get());
                    }

                    /* renamed from: f */
                    private C3454q m9962f() {
                        return C3500v.m11873a(m9963g(), this.f7251a, m9978v());
                    }

                    /* renamed from: g */
                    private C3464g m9963g() {
                        C3464g gVar = new C3464g(C2516k.this.f7013T, C2516k.this.f7011R, C2516k.this.f7067x0, C2505s.this.f6864T0, C2516k.this.f6995B, Optional.m32791c(m9969m()), C2505s.this.f6979y1);
                        return gVar;
                    }

                    /* renamed from: h */
                    private C3504y m9964h() {
                        return new C3504y(m9958c(), Optional.m32792d());
                    }

                    /* renamed from: i */
                    private C3357b m9965i() {
                        C3357b bVar = new C3357b(m9956b(), m9977u(), C2505s.this.m9255Z(), m9955a(), (C3364j) this.f7252b.get(), (C3394w) this.f7256f.get());
                        return bVar;
                    }

                    /* renamed from: j */
                    private C3367a m9966j() {
                        C3367a aVar = new C3367a(Optional.m32792d(), m9956b(), m9974r(), (C3441g) C2505s.this.f6891b2.get(), Optional.m32792d());
                        return aVar;
                    }

                    /* renamed from: k */
                    private C5588o m9967k() {
                        return C3287b0.m11356a(this.f7251a);
                    }

                    /* renamed from: l */
                    private RecyclerViewSnapScrollHelper m9968l() {
                        return new RecyclerViewSnapScrollHelper(new C5758a(), C2505s.this.m9255Z());
                    }

                    /* renamed from: m */
                    private C3314g m9969m() {
                        return C3501w.m11874a((C3419l) C2505s.this.f6864T0.get(), C2516k.this.m9470e());
                    }

                    /* renamed from: n */
                    private C3409a m9970n() {
                        return new C3409a(m9962f(), m9964h(), m9967k(), C2505s.this.m9228S());
                    }

                    /* renamed from: o */
                    private C3376a m9971o() {
                        return new C3376a(m9956b(), m9955a());
                    }

                    /* renamed from: p */
                    private C3391u m9972p() {
                        C3391u uVar = new C3391u(m9975s(), m9965i(), m9971o(), m9973q(), C2505s.this.m9255Z(), new C3341a(), new C5825e(), Optional.m32792d());
                        return uVar;
                    }

                    /* renamed from: q */
                    private C3393a m9973q() {
                        C3393a aVar = new C3393a(m9962f(), m9974r(), (ShelfFragmentHelper) this.f7257g.get(), m9955a(), C2505s.this.f6887a2, m9962f(), new C5825e(), (C3441g) C2505s.this.f6891b2.get());
                        return aVar;
                    }

                    /* renamed from: r */
                    private C3416k0 m9974r() {
                        return C3289c0.m11360a((Fragment) this.f7251a);
                    }

                    /* renamed from: s */
                    private C3398a m9975s() {
                        C3398a aVar = new C3398a(m9955a(), m9956b(), (C3364j) this.f7252b.get(), m9976t(), m9962f());
                        return aVar;
                    }

                    /* renamed from: t */
                    private C3404b m9976t() {
                        return new C3404b(this.f7253c, Optional.m32792d(), this.f7256f, Optional.m32792d());
                    }

                    /* renamed from: u */
                    private C3493c m9977u() {
                        return new C3493c(new C3490a());
                    }

                    /* renamed from: v */
                    private C3676k m9978v() {
                        return C10594g.m33318a((C3678l) C2505s.this.f6894c1.get());
                    }

                    /* renamed from: w */
                    private C10592e m9979w() {
                        return new C10592e((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get());
                    }

                    private C2587z0(C10597i iVar) {
                        this.f7251a = iVar;
                        m9957b(iVar);
                    }

                    /* renamed from: a */
                    private C3324g m9955a() {
                        C3324g gVar = new C3324g((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get(), (C2476z) C2505s.this.f6957s0.get(), C2505s.this.m9376x(), C5872f.m18926b(), new C6250g());
                        return gVar;
                    }

                    /* renamed from: b */
                    private void m9957b(C10597i iVar) {
                        this.f7252b = C11901g.m38136a(C3365k.m11555a(C2505s.this.f6924k));
                        this.f7253c = C3495d.m11868a(C3492b.m11863a());
                        this.f7254d = C11896d.m38128a(iVar);
                        this.f7255e = C3289c0.m11359a(this.f7254d);
                        this.f7256f = C11901g.m38136a(C3396x.m11639a(this.f7255e));
                        this.f7257g = C11894b.m38127b(C3285a0.m11345a(this.f7254d));
                    }

                    /* renamed from: c */
                    private C10597i m9959c(C10597i iVar) {
                        C11891j.m38119a(iVar, C2533c.this.m9571d());
                        C3286b.m11348a((C3280a) iVar, m9970n());
                        C3286b.m11349a((C3280a) iVar, m9961e());
                        C3286b.m11352a((C3280a) iVar, m9968l());
                        C3286b.m11355c(iVar, Optional.m32792d());
                        C3286b.m11354b(iVar, Optional.m32792d());
                        C3286b.m11353a((C3280a) iVar, Optional.m32792d());
                        C3286b.m11350a((C3280a) iVar, m9962f());
                        C3286b.m11347a((C3280a) iVar, (C2366i0) C2505s.this.f6979y1.get());
                        C3286b.m11351a((C3280a) iVar, m9978v());
                        C10599j.m33325a(iVar, m9979w());
                        C10599j.m33324a(iVar, (C3848a) C2530g0.this.m9542a());
                        return iVar;
                    }

                    /* renamed from: a */
                    public void mo11603a(C10597i iVar) {
                        m9959c(iVar);
                    }
                }

                /* synthetic */ C2533c(C2530g0 g0Var, C7664b bVar, C2506a aVar) {
                    this(bVar);
                }

                private C2533c(C7664b bVar) {
                    this.f7096a = bVar;
                    m9566b(bVar);
                }

                /* renamed from: b */
                private C3189g m9564b() {
                    return new C3189g((C3678l) C2505s.this.f6894c1.get());
                }

                /* renamed from: c */
                private C7294a m9567c() {
                    C7294a aVar = new C7294a(m9572e(), C2516k.this.m9493m(), (C6667g1) C2505s.this.f6869V.get(), C2516k.this.m9488k(), C2516k.this.m9447S());
                    return aVar;
                }

                /* access modifiers changed from: private */
                /* renamed from: d */
                public C11876f<Object> m9571d() {
                    return C11878g.m38111a(m9580i(), C10387h.m32863d());
                }

                /* renamed from: e */
                private C7303n m9572e() {
                    return C7299j.m21931a(m9586l());
                }

                /* access modifiers changed from: private */
                /* renamed from: f */
                public C7626a m9575f() {
                    return C7667d.m22665a(this.f7096a, C2516k.this.m9424G());
                }

                /* renamed from: g */
                private C7754g m9576g() {
                    return new C7754g((C3678l) C2505s.this.f6894c1.get(), C2505s.this.f6884a, C2516k.this.m9493m());
                }

                /* access modifiers changed from: private */
                /* renamed from: h */
                public C7770o m9578h() {
                    return new C7770o((C5792f) this.f7116u.get(), C2505s.this.m9255Z());
                }

                /* renamed from: i */
                private Map<Class<?>, Provider<C11872a<?>>> m9580i() {
                    C10388a a = C10387h.m32860a(40);
                    a.mo27182a(DeletedProgramBroadcastReceiver.class, C2505s.this.f6888b);
                    a.mo27182a(LegalCenterFragment.class, C2505s.this.f6892c);
                    a.mo27182a(MainActivity.class, C2505s.this.f6896d);
                    a.mo27182a(TvPlaybackActivity.class, C2505s.this.f6900e);
                    a.mo27182a(C2258d.class, C2516k.this.f7022b);
                    a.mo27182a(C2712g.class, C2516k.this.f7024c);
                    a.mo27182a(C7028b.class, C2516k.this.f7026d);
                    a.mo27182a(C7641a.class, C2516k.this.f7028e);
                    a.mo27182a(C7582a.class, C2516k.this.f7030f);
                    a.mo27182a(C6056a.class, C2516k.this.f7032g);
                    a.mo27182a(C2797e.class, C2516k.this.f7034h);
                    a.mo27182a(C7255a.class, C2516k.this.f7036i);
                    a.mo27182a(C7513i.class, C2516k.this.f7038j);
                    a.mo27182a(C7522l.class, C2516k.this.f7040k);
                    a.mo27182a(C7702t.class, C2516k.this.f7042l);
                    a.mo27182a(C7807c.class, C2516k.this.f7044m);
                    a.mo27182a(C7831a.class, C2516k.this.f7046n);
                    a.mo27182a(C7838e.class, C2516k.this.f7048o);
                    a.mo27182a(C6769r0.class, C2516k.this.f7050p);
                    a.mo27182a(C7935b.class, C2516k.this.f7052q);
                    a.mo27182a(C10572h.class, C2516k.this.f7054r);
                    a.mo27182a(C7664b.class, C2530g0.this.f7087b);
                    a.mo27182a(C3176e.class, this.f7097b);
                    a.mo27182a(C6099e.class, this.f7098c);
                    a.mo27182a(C7588b.class, this.f7099d);
                    a.mo27182a(C7813d.class, this.f7100e);
                    a.mo27182a(C7745e.class, this.f7101f);
                    a.mo27182a(C7341f.class, this.f7102g);
                    a.mo27182a(C2876l.class, this.f7103h);
                    a.mo27182a(C2735f.class, this.f7104i);
                    a.mo27182a(C5449c.class, this.f7105j);
                    a.mo27182a(C5513c.class, this.f7106k);
                    a.mo27182a(C2881m0.class, this.f7107l);
                    a.mo27182a(C5393h.class, this.f7108m);
                    a.mo27182a(C5418q0.class, this.f7109n);
                    a.mo27182a(C7784l.class, this.f7110o);
                    a.mo27182a(C8068y.class, this.f7111p);
                    a.mo27182a(C7444g.class, this.f7112q);
                    a.mo27182a(C10597i.class, this.f7113r);
                    a.mo27182a(C6591b.class, this.f7114s);
                    return a.mo27183a();
                }

                /* renamed from: j */
                private C7320c m9582j() {
                    return new C7320c(C7338c.m21997a());
                }

                /* renamed from: k */
                private C7398h m9584k() {
                    return new C7398h(C7440c.m22231a());
                }

                /* renamed from: l */
                private Set<C7290d> m9586l() {
                    return ImmutableSet.m32842a(new LegalLinkHandler(), C2530g0.this.m9556i(), m9564b(), new C7595d(), m9576g(), m9582j(), m9584k(), new C10600k());
                }

                /* renamed from: m */
                private C7677l m9588m() {
                    return C7669f.m22668a(this.f7096a, (C7673i) this.f7117v.get(), (C7930a) C2505s.this.f6868U1.get(), m9567c(), (C5792f) this.f7116u.get());
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public C2737h m9562a() {
                    return new C2737h((C5792f) this.f7116u.get(), C2516k.this.m9495n());
                }

                /* renamed from: b */
                private void m9566b(C7664b bVar) {
                    this.f7097b = new C2554j();
                    this.f7098c = new C2556k();
                    this.f7099d = new C2558l();
                    this.f7100e = new C2560m();
                    this.f7101f = new C2562n();
                    this.f7102g = new C2564o();
                    this.f7103h = new C2566p();
                    this.f7104i = new C2568q();
                    this.f7105j = new C2570r();
                    this.f7106k = new C2534a();
                    this.f7107l = new C2537b();
                    this.f7108m = new C2540c();
                    this.f7109n = new C2542d();
                    this.f7110o = new C2544e();
                    this.f7111p = new C2546f();
                    this.f7112q = new C2548g();
                    this.f7113r = new C2550h();
                    this.f7114s = new C2552i();
                    this.f7115t = C11896d.m38128a(bVar);
                    this.f7116u = C11901g.m38136a(C7668e.m22667a((Provider) this.f7115t));
                    this.f7117v = C11901g.m38136a(C7676k.m22687a(this.f7116u, C6544h.m20367a(), C7440c.m22232b(), C2516k.this.f7012S, C7925b.m23147a()));
                }

                /* renamed from: c */
                private C7664b m9568c(C7664b bVar) {
                    C11891j.m38119a(bVar, m9571d());
                    C7672h.m22673a(bVar, (C7673i) this.f7117v.get());
                    C7672h.m22670a(bVar, (C3653c) this.f7117v.get());
                    C7672h.m22671a(bVar, (C7300k) C2516k.this.m9493m());
                    C7672h.m22674a(bVar, m9588m());
                    C7672h.m22669a(bVar, (C2334a) C2505s.this.f6854Q.get());
                    C7672h.m22672a(bVar, (C7547h) C2516k.this.m9495n());
                    return bVar;
                }

                /* renamed from: a */
                public void mo11603a(C7664b bVar) {
                    m9568c(bVar);
                }
            }

            /* synthetic */ C2530g0(C2516k kVar, C7702t tVar, C2506a aVar) {
                this(tVar);
            }

            /* renamed from: e */
            private C7684f m9552e() {
                return new C7684f(new C5758a());
            }

            /* renamed from: f */
            private C7713w m9553f() {
                return new C7713w((C7687h) this.f7089d.get(), C2516k.this.m9493m(), new C7654b());
            }

            /* renamed from: g */
            private boolean m9554g() {
                return C7693l.m22717a(this.f7086a);
            }

            /* renamed from: h */
            private Map<Class<?>, Provider<C11872a<?>>> m9555h() {
                C10388a a = C10387h.m32860a(22);
                a.mo27182a(DeletedProgramBroadcastReceiver.class, C2505s.this.f6888b);
                a.mo27182a(LegalCenterFragment.class, C2505s.this.f6892c);
                a.mo27182a(MainActivity.class, C2505s.this.f6896d);
                a.mo27182a(TvPlaybackActivity.class, C2505s.this.f6900e);
                a.mo27182a(C2258d.class, C2516k.this.f7022b);
                a.mo27182a(C2712g.class, C2516k.this.f7024c);
                a.mo27182a(C7028b.class, C2516k.this.f7026d);
                a.mo27182a(C7641a.class, C2516k.this.f7028e);
                a.mo27182a(C7582a.class, C2516k.this.f7030f);
                a.mo27182a(C6056a.class, C2516k.this.f7032g);
                a.mo27182a(C2797e.class, C2516k.this.f7034h);
                a.mo27182a(C7255a.class, C2516k.this.f7036i);
                a.mo27182a(C7513i.class, C2516k.this.f7038j);
                a.mo27182a(C7522l.class, C2516k.this.f7040k);
                a.mo27182a(C7702t.class, C2516k.this.f7042l);
                a.mo27182a(C7807c.class, C2516k.this.f7044m);
                a.mo27182a(C7831a.class, C2516k.this.f7046n);
                a.mo27182a(C7838e.class, C2516k.this.f7048o);
                a.mo27182a(C6769r0.class, C2516k.this.f7050p);
                a.mo27182a(C7935b.class, C2516k.this.f7052q);
                a.mo27182a(C10572h.class, C2516k.this.f7054r);
                a.mo27182a(C7664b.class, this.f7087b);
                return a.mo27183a();
            }

            /* access modifiers changed from: private */
            /* renamed from: i */
            public C6419a m9556i() {
                return new C6419a(C2505s.this.f6884a, C6544h.m20368b());
            }

            /* renamed from: j */
            private C7655b0 m9557j() {
                return C7695n.m22720a(m9553f(), this.f7086a, C2516k.this.m9417D(), C2516k.this.m9415C(), m9547c(), C2516k.this.m9495n(), (C7659c) this.f7090e.get(), (C3678l) C2505s.this.f6894c1.get(), C2516k.this.m9419E());
            }

            private C2530g0(C7702t tVar) {
                this.f7086a = tVar;
                m9546b(tVar);
            }

            /* renamed from: b */
            private C11876f<Object> m9545b() {
                return C11878g.m38111a(m9555h(), C10387h.m32863d());
            }

            /* renamed from: c */
            private C7509h m9547c() {
                C7509h hVar = new C7509h(C2505s.this.m9206M0(), (C6722l1) C2516k.this.f7014U.get(), (C7908x) C2516k.this.f7065w0.get(), C2505s.this.m9339p0(), C2505s.this.m9341q(), m9550d());
                return hVar;
            }

            /* renamed from: d */
            private C7530o m9550d() {
                return new C7530o((C5773a) C2516k.this.f7002I.get());
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C7720a m9542a() {
                return new C7720a(m9554g(), C2516k.this.m9467d(), C2516k.this.f7020a);
            }

            /* renamed from: b */
            private void m9546b(C7702t tVar) {
                this.f7087b = new C2531a();
                this.f7088c = C11896d.m38128a(tVar);
                this.f7089d = C11901g.m38136a(C7694m.m22719a((Provider) this.f7088c));
                this.f7090e = C11901g.m38136a(C7662d.m22653a(C2505s.this.f6932m, C2505s.this.f6870V0));
                this.f7091f = C7693l.m22716a((Provider) this.f7088c);
                this.f7092g = C7726b.m22779a(this.f7091f, C2516k.this.f7021a0, C2516k.this.f7060u);
            }

            /* renamed from: c */
            private C7702t m9548c(C7702t tVar) {
                C11891j.m38119a(tVar, m9545b());
                C7711u.m22748a(tVar, m9557j());
                C7711u.m22745a(tVar, C2516k.this.m9422F());
                C7711u.m22749a(tVar, m9552e());
                C7711u.m22750a(tVar, (C7908x) C2516k.this.f7065w0.get());
                C7711u.m22747a(tVar, m9550d());
                C7711u.m22744a(tVar, C2516k.this.m9459b());
                C7711u.m22742a(tVar, C2505s.this.m9361u());
                C7711u.m22743a(tVar, (C3848a) m9542a());
                C7711u.m22746a(tVar, (C6859b) C2505s.this.f6840L0.get());
                return tVar;
            }

            /* renamed from: a */
            public void mo11603a(C7702t tVar) {
                m9548c(tVar);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$h */
        /* compiled from: DaggerTvAppComponent */
        class C2588h implements Provider<C10571a> {
            C2588h() {
            }

            public C10571a get() {
                return new C2659v0(C2516k.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$h0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2589h0 implements C7806a {
            private C2589h0() {
            }

            /* synthetic */ C2589h0(C2516k kVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C7805b mo11605a(C7807c cVar) {
                C11897e.m38129a(cVar);
                return new C2591i0(C2516k.this, cVar, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$i */
        /* compiled from: DaggerTvAppComponent */
        class C2590i implements Provider<C2256a> {
            C2590i() {
            }

            public C2256a get() {
                return new C2608r(C2516k.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$i0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2591i0 implements C7805b {
            /* synthetic */ C2591i0(C2516k kVar, C7807c cVar, C2506a aVar) {
                this(cVar);
            }

            /* renamed from: b */
            private C7807c m9984b(C7807c cVar) {
                C11889h.m38118a(cVar, C2516k.this.m9497o());
                return cVar;
            }

            private C2591i0(C7807c cVar) {
            }

            /* renamed from: a */
            public void mo11603a(C7807c cVar) {
                m9984b(cVar);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$j */
        /* compiled from: DaggerTvAppComponent */
        class C2592j implements Provider<C2720a> {
            C2592j() {
            }

            public C2720a get() {
                return new C2627t(C2516k.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$j0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2593j0 implements C7054a {
            private C2593j0() {
            }

            /* synthetic */ C2593j0(C2516k kVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C7053k mo11605a(C7831a aVar) {
                C11897e.m38129a(aVar);
                return new C2595k0(C2516k.this, aVar, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$k */
        /* compiled from: DaggerTvAppComponent */
        class C2594k implements Provider<C7027a> {
            C2594k() {
            }

            public C7027a get() {
                return new C2658v(C2516k.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$k0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2595k0 implements C7053k {
            /* synthetic */ C2595k0(C2516k kVar, C7831a aVar, C2506a aVar2) {
                this(aVar);
            }

            /* renamed from: b */
            private C7831a m9989b(C7831a aVar) {
                C11891j.m38119a(aVar, C2516k.this.m9497o());
                C7837d.m22953a(aVar, (C7900q) C2516k.this.f7062v.get());
                C7837d.m22952a(aVar, (MarketHolder) C2505s.this.f6954r1.get());
                return aVar;
            }

            private C2595k0(C7831a aVar) {
            }

            /* renamed from: a */
            public void mo11603a(C7831a aVar) {
                m9989b(aVar);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$l */
        /* compiled from: DaggerTvAppComponent */
        class C2596l implements Provider<C5561a> {
            C2596l() {
            }

            public C5561a get() {
                return new C2601n0(C2516k.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$l0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2597l0 implements C2796a {
            private C2597l0() {
            }

            /* synthetic */ C2597l0(C2516k kVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C2795d mo11605a(C2797e eVar) {
                C11897e.m38129a(eVar);
                return new C2599m0(C2516k.this, eVar, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$m */
        /* compiled from: DaggerTvAppComponent */
        class C2598m implements Provider<C7553a> {
            C2598m() {
            }

            public C7553a get() {
                return new C2524d0(C2516k.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$m0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2599m0 implements C2795d {
            /* synthetic */ C2599m0(C2516k kVar, C2797e eVar, C2506a aVar) {
                this(eVar);
            }

            /* renamed from: b */
            private C2797e m9994b(C2797e eVar) {
                C11886e.m38117a(eVar, C2516k.this.m9497o());
                C2807h.m10478a(eVar, C2516k.this.m9511v());
                C2807h.m10477a(eVar, (C2743d) C2516k.this.f7015V.get());
                C2807h.m10479a(eVar, (C6090n) C2505s.this.f6897d0.get());
                C2807h.m10480a(eVar, (C6859b) C2505s.this.f6840L0.get());
                C2807h.m10481a(eVar, C5872f.m18926b());
                return eVar;
            }

            private C2599m0(C2797e eVar) {
            }

            /* renamed from: a */
            public void mo11603a(C2797e eVar) {
                m9994b(eVar);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$n */
        /* compiled from: DaggerTvAppComponent */
        class C2600n implements Provider<C7557a> {
            C2600n() {
            }

            public C7557a get() {
                return new C2663x0(C2516k.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$n0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2601n0 implements C5561a {
            private C2601n0() {
            }

            /* synthetic */ C2601n0(C2516k kVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C5560e mo11605a(C7641a aVar) {
                C11897e.m38129a(aVar);
                return new C2603o0(C2516k.this, aVar, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$o */
        /* compiled from: DaggerTvAppComponent */
        class C2602o implements Provider<C2796a> {
            C2602o() {
            }

            public C2796a get() {
                return new C2597l0(C2516k.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$o0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2603o0 implements C5560e {

            /* renamed from: a */
            private final C7641a f7274a;

            /* synthetic */ C2603o0(C2516k kVar, C7641a aVar, C2506a aVar2) {
                this(aVar);
            }

            /* renamed from: b */
            private C7641a m10000b(C7641a aVar) {
                C11891j.m38119a(aVar, C2516k.this.m9497o());
                C7648d.m22638a(aVar, m9999a());
                C7648d.m22637a(aVar, C2516k.this.m9415C());
                C7648d.m22639a(aVar, (C7630d) C2516k.this.m9517y());
                return aVar;
            }

            private C2603o0(C7641a aVar) {
                this.f7274a = aVar;
            }

            /* renamed from: a */
            private C5588o m9999a() {
                return C5559d.m18364a(this.f7274a);
            }

            /* renamed from: a */
            public void mo11603a(C7641a aVar) {
                m10000b(aVar);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$p */
        /* compiled from: DaggerTvAppComponent */
        class C2604p implements Provider<C7240a> {
            C2604p() {
            }

            public C7240a get() {
                return new C2662x(C2516k.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$p0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2605p0 implements C7056a {
            private C2605p0() {
            }

            /* synthetic */ C2605p0(C2516k kVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C7055l mo11605a(C7838e eVar) {
                C11897e.m38129a(eVar);
                return new C2607q0(C2516k.this, eVar, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$q */
        /* compiled from: DaggerTvAppComponent */
        class C2606q implements Provider<C7506a> {
            C2606q() {
            }

            public C7506a get() {
                return new C2666z(C2516k.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$q0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2607q0 implements C7055l {

            /* renamed from: a */
            private final C7838e f7279a;

            /* synthetic */ C2607q0(C2516k kVar, C7838e eVar, C2506a aVar) {
                this(eVar);
            }

            /* renamed from: b */
            private C7042b m10007b() {
                C7042b a = C7043c.m21373a((C5773a) C2516k.this.f7002I.get());
                m10005a(a);
                return a;
            }

            /* renamed from: c */
            private C7051i m10009c() {
                return new C7051i((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get(), (C2476z) C2505s.this.f6957s0.get());
            }

            /* renamed from: d */
            private C7059o m10010d() {
                return new C7059o(C2505s.this.m9339p0());
            }

            /* renamed from: e */
            private C7061p m10011e() {
                return new C7061p(C2516k.this.m9495n(), m10006a(), (C7614e) C2505s.this.f6973w1.get(), (C3572r0) C2505s.this.f6901e0.get());
            }

            /* renamed from: f */
            private C7856j m10012f() {
                C7856j jVar = new C7856j(C2516k.this.f7020a, C2505s.this.m9318l0(), (C3572r0) C2505s.this.f6901e0.get(), m10014h(), C2505s.this.m9255Z(), m10010d(), C2505s.this.m9339p0(), m10009c());
                return jVar;
            }

            /* renamed from: g */
            private C7082t m10013g() {
                return new C7082t(C2516k.this.m9495n());
            }

            /* renamed from: h */
            private C7084v m10014h() {
                return C7058n.m21403a(this.f7279a, (C7884n) C2516k.this.f7015V.get(), (MarketHolder) C2505s.this.f6954r1.get(), C5873g.m18928b(), (C7908x) C2516k.this.f7065w0.get(), (C7885o) C2516k.this.f7035h0.get(), Optional.m32792d(), C3516a0.m11918b(), m10011e(), m10009c());
            }

            private C2607q0(C7838e eVar) {
                this.f7279a = eVar;
            }

            /* renamed from: a */
            private C7626a m10006a() {
                return C7057m.m21402a(this.f7279a, C2516k.this.m9424G());
            }

            /* renamed from: b */
            private C7838e m10008b(C7838e eVar) {
                C11891j.m38119a(eVar, C2516k.this.m9497o());
                C7855i.m23004a(eVar, (C7081s) m10013g());
                C7855i.m23002a(eVar, (C7041a) m10007b());
                C7855i.m23005a(eVar, m10014h());
                C7855i.m23006a(eVar, C6140n.m19574b());
                C7855i.m23007a(eVar, m10012f());
                C7855i.m23001a(eVar, new C3807b());
                C7855i.m22999a(eVar, (TransformationMethod) C2516k.this.m9445R());
                C7855i.m23000a(eVar, C2516k.this.m9415C());
                C7855i.m23003a(eVar, m10009c());
                return eVar;
            }

            /* renamed from: a */
            public void mo11603a(C7838e eVar) {
                m10008b(eVar);
            }

            /* renamed from: a */
            private C7042b m10005a(C7042b bVar) {
                C7044d.m21374a(bVar, C2516k.this.m9415C());
                return bVar;
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$r */
        /* compiled from: DaggerTvAppComponent */
        private final class C2608r implements C2256a {
            private C2608r() {
            }

            /* synthetic */ C2608r(C2516k kVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C2255b mo11605a(C2258d dVar) {
                C11897e.m38129a(dVar);
                return new C2610s(C2516k.this, dVar, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$r0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2609r0 implements C6857a {
            private C2609r0() {
            }

            /* synthetic */ C2609r0(C2516k kVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C6856u0 mo11605a(C6769r0 r0Var) {
                C11897e.m38129a(r0Var);
                return new C2611s0(C2516k.this, r0Var, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$s */
        /* compiled from: DaggerTvAppComponent */
        private final class C2610s implements C2255b {

            /* renamed from: a */
            private final C2258d f7283a;

            /* renamed from: b */
            private Provider<C2323a> f7284b;

            /* synthetic */ C2610s(C2516k kVar, C2258d dVar, C2506a aVar) {
                this(dVar);
            }

            /* renamed from: b */
            private C2262f m10022b() {
                return C2257c.m8674a(m10032j(), this.f7283a);
            }

            /* renamed from: c */
            private C2287a m10025c() {
                return new C2287a((C2323a) this.f7284b.get(), (C5773a) C2516k.this.f7002I.get());
            }

            /* renamed from: d */
            private C2290b m10026d() {
                C2290b bVar = new C2290b((C2323a) this.f7284b.get(), C2505s.this.f6884a, this.f7283a, C3516a0.m11918b(), Optional.m32792d(), (SharedPreferences) C2505s.this.f6944p.get());
                return bVar;
            }

            /* renamed from: e */
            private C2297c m10027e() {
                return new C2297c((C2323a) this.f7284b.get(), (C5862q0) C2505s.this.f6956s.get(), C2505s.this.f6884a);
            }

            /* renamed from: f */
            private C2299d m10028f() {
                C2299d dVar = new C2299d((C2323a) this.f7284b.get(), C2505s.this.f6884a, m10031i(), m10029g(), (C2743d) C2516k.this.f7015V.get(), C2516k.this.m9511v(), Optional.m32791c(C2505s.this.f6820E1.get()));
                return dVar;
            }

            /* renamed from: g */
            private C2313f m10029g() {
                return new C2313f((C2279k) C2505s.this.f6821F.get(), (C3419l) C2505s.this.f6864T0.get(), this.f7283a);
            }

            /* renamed from: h */
            private C2316g m10030h() {
                return new C2316g((C2323a) this.f7284b.get(), C2505s.this.f6884a);
            }

            /* renamed from: i */
            private C2320h m10031i() {
                return new C2320h((C2279k) C2505s.this.f6821F.get(), (C3419l) C2505s.this.f6864T0.get(), this.f7283a);
            }

            /* renamed from: j */
            private C2267e m10032j() {
                return new C2267e(C2516k.this.f7005L, C2505s.this.f6882Z0, C2505s.this.f6932m);
            }

            private C2610s(C2258d dVar) {
                this.f7283a = dVar;
                m10023b(dVar);
            }

            /* renamed from: a */
            private AboutPresenter m10021a() {
                AboutPresenter aboutPresenter = new AboutPresenter(C2505s.this.f6884a, m10027e(), m10028f(), m10026d(), m10025c(), m10030h());
                return aboutPresenter;
            }

            /* renamed from: b */
            private void m10023b(C2258d dVar) {
                this.f7284b = C11901g.m38136a(C2326b.m8775a(C2505s.this.f6901e0, C2505s.this.f6944p));
            }

            /* renamed from: c */
            private C2258d m10024c(C2258d dVar) {
                C11891j.m38119a(dVar, C2516k.this.m9497o());
                C2261e.m8679a(dVar, m10022b());
                C2261e.m8678a(dVar, m10021a());
                C2261e.m8680a(dVar, C2505s.this.m9228S());
                return dVar;
            }

            /* renamed from: a */
            public void mo11603a(C2258d dVar) {
                m10024c(dVar);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$s0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2611s0 implements C6856u0 {

            /* renamed from: a */
            private final C6769r0 f7286a;

            /* renamed from: b */
            private Provider<C6790a> f7287b;

            /* renamed from: c */
            private Provider<C6720a> f7288c;

            /* renamed from: d */
            private Provider<C6760a> f7289d;

            /* renamed from: e */
            private Provider<C6890a> f7290e;

            /* renamed from: f */
            private Provider<C6986a> f7291f;

            /* renamed from: g */
            private Provider<C6769r0> f7292g;
            /* access modifiers changed from: private */

            /* renamed from: h */
            public Provider<C6969y0> f7293h;

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$s0$a */
            /* compiled from: DaggerTvAppComponent */
            class C2612a implements Provider<C6790a> {
                C2612a() {
                }

                public C6790a get() {
                    return new C2617f(C2611s0.this, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$s0$b */
            /* compiled from: DaggerTvAppComponent */
            class C2613b implements Provider<C6720a> {
                C2613b() {
                }

                public C6720a get() {
                    return new C2619h(C2611s0.this, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$s0$c */
            /* compiled from: DaggerTvAppComponent */
            class C2614c implements Provider<C6760a> {
                C2614c() {
                }

                public C6760a get() {
                    return new C2621j(C2611s0.this, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$s0$d */
            /* compiled from: DaggerTvAppComponent */
            class C2615d implements Provider<C6890a> {
                C2615d() {
                }

                public C6890a get() {
                    return new C2623l(C2611s0.this, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$s0$e */
            /* compiled from: DaggerTvAppComponent */
            class C2616e implements Provider<C6986a> {
                C2616e() {
                }

                public C6986a get() {
                    return new C2625n(C2611s0.this, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$s0$f */
            /* compiled from: DaggerTvAppComponent */
            private final class C2617f implements C6790a {
                private C2617f() {
                }

                /* synthetic */ C2617f(C2611s0 s0Var, C2506a aVar) {
                    this();
                }

                /* renamed from: a */
                public C6789f mo11605a(C6791g gVar) {
                    C11897e.m38129a(gVar);
                    return new C2618g(C2611s0.this, gVar, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$s0$g */
            /* compiled from: DaggerTvAppComponent */
            private final class C2618g implements C6789f {

                /* renamed from: a */
                private final C6791g f7301a;

                /* synthetic */ C2618g(C2611s0 s0Var, C6791g gVar, C2506a aVar) {
                    this(gVar);
                }

                /* renamed from: b */
                private C6785b m10051b() {
                    return new C6785b((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get());
                }

                /* renamed from: c */
                private C6808i m10053c() {
                    return C6787d.m20889a(this.f7301a, C2611s0.this.m10045e(), C2516k.this.m9417D(), (C6667g1) C2505s.this.f6869V.get(), C2516k.this.m9465c(), C2516k.this.m9422F(), (C6969y0) C2611s0.this.f7293h.get(), (C6090n) C2505s.this.f6897d0.get(), C2505s.this.m9175F(), m10050a(), (C7614e) C2505s.this.f6973w1.get(), (C3572r0) C2505s.this.f6901e0.get());
                }

                /* renamed from: d */
                private C6829k m10054d() {
                    return C6788e.m20890a(C2505s.this.m9255Z());
                }

                private C2618g(C6791g gVar) {
                    this.f7301a = gVar;
                }

                /* renamed from: a */
                private C6628d m10050a() {
                    return new C6628d((C2348e) C2505s.this.f6855Q0.get());
                }

                /* renamed from: b */
                private C6791g m10052b(C6791g gVar) {
                    C11891j.m38119a(gVar, C2611s0.this.m10037b());
                    C6807h.m20913a(gVar, m10053c());
                    C6807h.m20914a(gVar, m10054d());
                    C6807h.m20916a(gVar, (C6969y0) C2611s0.this.f7293h.get());
                    C6807h.m20912a(gVar, m10051b());
                    C6807h.m20915a(gVar, C2505s.this.m9269b0());
                    C6807h.m20917a(gVar, (C7547h) C2516k.this.m9495n());
                    C6807h.m20911a(gVar, C2516k.this.m9459b());
                    C6807h.m20910a(gVar, new C6629d0());
                    return gVar;
                }

                /* renamed from: a */
                public void mo11603a(C6791g gVar) {
                    m10052b(gVar);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$s0$h */
            /* compiled from: DaggerTvAppComponent */
            private final class C2619h implements C6720a {
                private C2619h() {
                }

                /* synthetic */ C2619h(C2611s0 s0Var, C2506a aVar) {
                    this();
                }

                /* renamed from: a */
                public C6719l mo11605a(C6869b bVar) {
                    C11897e.m38129a(bVar);
                    return new C2620i(C2611s0.this, bVar, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$s0$i */
            /* compiled from: DaggerTvAppComponent */
            private final class C2620i implements C6719l {

                /* renamed from: a */
                private final C6869b f7304a;

                /* renamed from: b */
                private Provider<C3364j> f7305b;

                /* renamed from: c */
                private Provider<C3493c> f7306c;

                /* renamed from: d */
                private Provider<C6869b> f7307d;

                /* renamed from: e */
                private Provider<C3416k0> f7308e;

                /* renamed from: f */
                private Provider<C3394w> f7309f;

                /* renamed from: g */
                private Provider<ShelfFragmentHelper> f7310g;

                /* synthetic */ C2620i(C2611s0 s0Var, C6869b bVar, C2506a aVar) {
                    this(bVar);
                }

                /* renamed from: b */
                private C3324g m10060b() {
                    C3324g gVar = new C3324g((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get(), (C2476z) C2505s.this.f6957s0.get(), C2505s.this.m9376x(), C5872f.m18926b(), new C6250g());
                    return gVar;
                }

                /* renamed from: c */
                private C3349f m10062c() {
                    C3349f fVar = new C3349f((C3448m) C2505s.this.f6883Z1.get(), m10074n(), m10064d(), m10070j(), C2505s.this.m9255Z());
                    return fVar;
                }

                /* renamed from: d */
                private C3353c m10064d() {
                    C3353c cVar = new C3353c(m10060b(), m10059a(), (C3364j) this.f7305b.get(), (C4793a) C2505s.this.f6965u0.get(), m10066f(), (C3716q) C2505s.this.f6838K1.get(), (C5821c0) C2505s.this.f6835J1.get());
                    return cVar;
                }

                /* renamed from: e */
                private C3432o m10065e() {
                    return new C3432o(new C5758a(), (C3441g) C2505s.this.f6891b2.get());
                }

                /* renamed from: f */
                private C3454q m10066f() {
                    return C3500v.m11873a(m10067g(), this.f7304a, m10080t());
                }

                /* renamed from: g */
                private C3464g m10067g() {
                    C3464g gVar = new C3464g(C2516k.this.f7013T, C2516k.this.f7011R, C2516k.this.f7067x0, C2505s.this.f6864T0, C2516k.this.f6995B, Optional.m32791c(m10072l()), C2505s.this.f6979y1);
                    return gVar;
                }

                /* renamed from: h */
                private C3504y m10068h() {
                    return new C3504y(m10062c(), Optional.m32792d());
                }

                /* renamed from: i */
                private C3357b m10069i() {
                    C3357b bVar = new C3357b(m10059a(), m10079s(), C2505s.this.m9255Z(), m10060b(), (C3364j) this.f7305b.get(), (C3394w) this.f7309f.get());
                    return bVar;
                }

                /* renamed from: j */
                private C3367a m10070j() {
                    C3367a aVar = new C3367a(Optional.m32792d(), m10059a(), m10076p(), (C3441g) C2505s.this.f6891b2.get(), Optional.m32792d());
                    return aVar;
                }

                /* renamed from: k */
                private RecyclerViewSnapScrollHelper m10071k() {
                    return new RecyclerViewSnapScrollHelper(new C5758a(), C2505s.this.m9255Z());
                }

                /* renamed from: l */
                private C3314g m10072l() {
                    return C3501w.m11874a((C3419l) C2505s.this.f6864T0.get(), C2516k.this.m9470e());
                }

                /* renamed from: m */
                private C3376a m10073m() {
                    return new C3376a(m10059a(), m10060b());
                }

                /* renamed from: n */
                private C3391u m10074n() {
                    C3391u uVar = new C3391u(m10077q(), m10069i(), m10073m(), m10075o(), C2505s.this.m9255Z(), new C3341a(), new C5825e(), Optional.m32792d());
                    return uVar;
                }

                /* renamed from: o */
                private C3393a m10075o() {
                    C3393a aVar = new C3393a(m10066f(), m10076p(), (ShelfFragmentHelper) this.f7310g.get(), m10060b(), C2505s.this.f6887a2, m10066f(), new C5825e(), (C3441g) C2505s.this.f6891b2.get());
                    return aVar;
                }

                /* renamed from: p */
                private C3416k0 m10076p() {
                    return C3289c0.m11360a((Fragment) this.f7304a);
                }

                /* renamed from: q */
                private C3398a m10077q() {
                    C3398a aVar = new C3398a(m10060b(), m10059a(), (C3364j) this.f7305b.get(), m10078r(), m10066f());
                    return aVar;
                }

                /* renamed from: r */
                private C3404b m10078r() {
                    return new C3404b(this.f7306c, Optional.m32792d(), this.f7309f, Optional.m32792d());
                }

                /* renamed from: s */
                private C3493c m10079s() {
                    return new C3493c(new C3490a());
                }

                /* renamed from: t */
                private C3676k m10080t() {
                    return C6880f.m21065a((C3678l) C2505s.this.f6894c1.get());
                }

                private C2620i(C6869b bVar) {
                    this.f7304a = bVar;
                    m10061b(bVar);
                }

                /* renamed from: a */
                private C6882h m10059a() {
                    return C6879e.m21064a(this.f7304a, C2611s0.this.m10045e());
                }

                /* renamed from: b */
                private void m10061b(C6869b bVar) {
                    this.f7305b = C11901g.m38136a(C3365k.m11555a(C2505s.this.f6924k));
                    this.f7306c = C3495d.m11868a(C3492b.m11863a());
                    this.f7307d = C11896d.m38128a(bVar);
                    this.f7308e = C3289c0.m11359a(this.f7307d);
                    this.f7309f = C11901g.m38136a(C3396x.m11639a(this.f7308e));
                    this.f7310g = C11894b.m38127b(C3285a0.m11345a(this.f7307d));
                }

                /* renamed from: c */
                private C6869b m10063c(C6869b bVar) {
                    C11891j.m38119a(bVar, C2611s0.this.m10037b());
                    C6881g.m21067a(bVar, m10066f());
                    C6881g.m21075a(bVar, m10059a());
                    C6881g.m21072a(bVar, (C6627c1) C2516k.this.m9419E());
                    C6881g.m21068a(bVar, (C3502x) m10068h());
                    C6881g.m21076a(bVar, C2505s.this.m9228S());
                    C6881g.m21066a(bVar, m10065e());
                    C6881g.m21073a(bVar, new C6629d0());
                    C6881g.m21071a(bVar, m10071k());
                    C6881g.m21069a(bVar, (C3848a) C2611s0.this.m10036a());
                    C6881g.m21070a(bVar, new C5759b());
                    C6881g.m21074a(bVar, C2516k.this.m9459b());
                    return bVar;
                }

                /* renamed from: a */
                public void mo11603a(C6869b bVar) {
                    m10063c(bVar);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$s0$j */
            /* compiled from: DaggerTvAppComponent */
            private final class C2621j implements C6760a {
                private C2621j() {
                }

                /* synthetic */ C2621j(C2611s0 s0Var, C2506a aVar) {
                    this();
                }

                /* renamed from: a */
                public C6759p mo11605a(C6947a aVar) {
                    C11897e.m38129a(aVar);
                    return new C2622k(C2611s0.this, aVar, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$s0$k */
            /* compiled from: DaggerTvAppComponent */
            private final class C2622k implements C6759p {

                /* renamed from: a */
                private final C6947a f7313a;

                /* synthetic */ C2622k(C2611s0 s0Var, C6947a aVar, C2506a aVar2) {
                    this(aVar);
                }

                /* renamed from: b */
                private C6959d m10087b() {
                    return C6744n.m20821a(C2505s.this.m9255Z());
                }

                private C2622k(C6947a aVar) {
                    this.f7313a = aVar;
                }

                /* renamed from: a */
                private C6952c m10085a() {
                    return C6756o.m20848a(this.f7313a, C2611s0.this.m10045e(), C2505s.this.m9269b0());
                }

                /* renamed from: b */
                private C6947a m10086b(C6947a aVar) {
                    C11891j.m38119a(aVar, C2611s0.this.m10037b());
                    C6951b.m21205a(aVar, m10085a());
                    C6951b.m21206a(aVar, m10087b());
                    C6951b.m21207a(aVar, (C6960e) m10085a());
                    return aVar;
                }

                /* renamed from: a */
                public void mo11603a(C6947a aVar) {
                    m10086b(aVar);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$s0$l */
            /* compiled from: DaggerTvAppComponent */
            private final class C2623l implements C6890a {
                private C2623l() {
                }

                /* synthetic */ C2623l(C2611s0 s0Var, C2506a aVar) {
                    this();
                }

                /* renamed from: a */
                public C6889a mo11605a(C6891b bVar) {
                    C11897e.m38129a(bVar);
                    return new C2624m(C2611s0.this, bVar, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$s0$m */
            /* compiled from: DaggerTvAppComponent */
            private final class C2624m implements C6889a {
                /* synthetic */ C2624m(C2611s0 s0Var, C6891b bVar, C2506a aVar) {
                    this(bVar);
                }

                /* renamed from: b */
                private C6661f1 m10093b() {
                    C6661f1 f1Var = new C6661f1(C2505s.this.f6884a, m10092a(), C2516k.this.m9459b(), new C6629d0(), C2516k.this.m9419E());
                    return f1Var;
                }

                private C2624m(C6891b bVar) {
                }

                /* renamed from: a */
                private C6847a m10092a() {
                    return new C6847a((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get());
                }

                /* renamed from: b */
                private C6891b m10094b(C6891b bVar) {
                    C11891j.m38119a(bVar, C2611s0.this.m10037b());
                    C6903c.m21106a(bVar, C2516k.this.m9422F());
                    C6903c.m21104a(bVar, m10093b());
                    C6903c.m21105a(bVar, C2611s0.this.m10045e());
                    C6903c.m21108a(bVar, C2505s.this.m9228S());
                    C6903c.m21107a(bVar, (C6969y0) C2611s0.this.f7293h.get());
                    C6903c.m21103a(bVar, new C6629d0());
                    return bVar;
                }

                /* renamed from: a */
                public void mo11603a(C6891b bVar) {
                    m10094b(bVar);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$s0$n */
            /* compiled from: DaggerTvAppComponent */
            private final class C2625n implements C6986a {
                private C2625n() {
                }

                /* synthetic */ C2625n(C2611s0 s0Var, C2506a aVar) {
                    this();
                }

                /* renamed from: a */
                public C6985d mo11605a(C6987e eVar) {
                    C11897e.m38129a(eVar);
                    return new C2626o(C2611s0.this, eVar, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$s0$o */
            /* compiled from: DaggerTvAppComponent */
            private final class C2626o implements C6985d {
                /* synthetic */ C2626o(C2611s0 s0Var, C6987e eVar, C2506a aVar) {
                    this(eVar);
                }

                /* renamed from: b */
                private C7012k m10101b() {
                    return new C7012k(C2505s.this.f6884a, new C6629d0(), C2516k.this.m9419E(), C2516k.this.m9459b());
                }

                private C2626o(C6987e eVar) {
                }

                /* renamed from: a */
                private C6847a m10099a() {
                    return new C6847a((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get());
                }

                /* renamed from: b */
                private C6987e m10100b(C6987e eVar) {
                    C11891j.m38119a(eVar, C2611s0.this.m10037b());
                    C7004g.m21296a(eVar, m10101b());
                    C7004g.m21293a(eVar, C2516k.this.m9422F());
                    C7004g.m21290a(eVar, (C6627c1) C2516k.this.m9419E());
                    C7004g.m21292a(eVar, C2611s0.this.m10045e());
                    C7004g.m21297a(eVar, (C7022z0) C2516k.this.f7015V.get());
                    C7004g.m21295a(eVar, (C6969y0) C2611s0.this.f7293h.get());
                    C7004g.m21298a(eVar, (C7908x) C2516k.this.f7065w0.get());
                    C7004g.m21294a(eVar, m10099a());
                    C7004g.m21291a(eVar, new C6629d0());
                    C7004g.m21289a(eVar, (C2809j) C2516k.this.f7063v0.get());
                    return eVar;
                }

                /* renamed from: a */
                public void mo11603a(C6987e eVar) {
                    m10100b(eVar);
                }
            }

            /* synthetic */ C2611s0(C2516k kVar, C6769r0 r0Var, C2506a aVar) {
                this(r0Var);
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public C6671h0 m10045e() {
                return C6888w0.m21090a(this.f7286a, (C6969y0) this.f7293h.get(), C2516k.this.m9495n(), C2505s.this.m9175F(), C2505s.this.m9255Z());
            }

            private C2611s0(C6769r0 r0Var) {
                this.f7286a = r0Var;
                m10039b(r0Var);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public C11876f<Object> m10037b() {
                return C11878g.m38111a(m10044d(), C10387h.m32863d());
            }

            /* renamed from: c */
            private boolean m10042c() {
                return C6867v0.m21045a(this.f7286a);
            }

            /* renamed from: d */
            private Map<Class<?>, Provider<C11872a<?>>> m10044d() {
                C10388a a = C10387h.m32860a(26);
                a.mo27182a(DeletedProgramBroadcastReceiver.class, C2505s.this.f6888b);
                a.mo27182a(LegalCenterFragment.class, C2505s.this.f6892c);
                a.mo27182a(MainActivity.class, C2505s.this.f6896d);
                a.mo27182a(TvPlaybackActivity.class, C2505s.this.f6900e);
                a.mo27182a(C2258d.class, C2516k.this.f7022b);
                a.mo27182a(C2712g.class, C2516k.this.f7024c);
                a.mo27182a(C7028b.class, C2516k.this.f7026d);
                a.mo27182a(C7641a.class, C2516k.this.f7028e);
                a.mo27182a(C7582a.class, C2516k.this.f7030f);
                a.mo27182a(C6056a.class, C2516k.this.f7032g);
                a.mo27182a(C2797e.class, C2516k.this.f7034h);
                a.mo27182a(C7255a.class, C2516k.this.f7036i);
                a.mo27182a(C7513i.class, C2516k.this.f7038j);
                a.mo27182a(C7522l.class, C2516k.this.f7040k);
                a.mo27182a(C7702t.class, C2516k.this.f7042l);
                a.mo27182a(C7807c.class, C2516k.this.f7044m);
                a.mo27182a(C7831a.class, C2516k.this.f7046n);
                a.mo27182a(C7838e.class, C2516k.this.f7048o);
                a.mo27182a(C6769r0.class, C2516k.this.f7050p);
                a.mo27182a(C7935b.class, C2516k.this.f7052q);
                a.mo27182a(C10572h.class, C2516k.this.f7054r);
                a.mo27182a(C6791g.class, this.f7287b);
                a.mo27182a(C6869b.class, this.f7288c);
                a.mo27182a(C6947a.class, this.f7289d);
                a.mo27182a(C6891b.class, this.f7290e);
                a.mo27182a(C6987e.class, this.f7291f);
                return a.mo27183a();
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C7720a m10036a() {
                return new C7720a(m10042c(), C2516k.this.m9467d(), C2516k.this.f7020a);
            }

            /* renamed from: b */
            private void m10039b(C6769r0 r0Var) {
                this.f7287b = new C2612a();
                this.f7288c = new C2613b();
                this.f7289d = new C2614c();
                this.f7290e = new C2615d();
                this.f7291f = new C2616e();
                this.f7292g = C11896d.m38128a(r0Var);
                this.f7293h = C11894b.m38127b(C6905x0.m21111a((Provider) this.f7292g));
            }

            /* renamed from: c */
            private C6769r0 m10040c(C6769r0 r0Var) {
                C11891j.m38119a(r0Var, m10037b());
                C6783s0.m20881a(r0Var, m10045e());
                C6783s0.m20883a(r0Var, (C6969y0) this.f7293h.get());
                C6783s0.m20880a(r0Var, (C3848a) m10036a());
                C6783s0.m20882a(r0Var, (C6859b) C2505s.this.f6840L0.get());
                return r0Var;
            }

            /* renamed from: a */
            public void mo11603a(C6769r0 r0Var) {
                m10040c(r0Var);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$t */
        /* compiled from: DaggerTvAppComponent */
        private final class C2627t implements C2720a {
            private C2627t() {
            }

            /* synthetic */ C2627t(C2516k kVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C2719j mo11605a(C2712g gVar) {
                C11897e.m38129a(gVar);
                return new C2629u(C2516k.this, gVar, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$t0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2628t0 implements C7934a {
            private C2628t0() {
            }

            /* synthetic */ C2628t0(C2516k kVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C7933a mo11605a(C7935b bVar) {
                C11897e.m38129a(bVar);
                return new C2657u0(C2516k.this, bVar, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$u */
        /* compiled from: DaggerTvAppComponent */
        private final class C2629u implements C2719j {

            /* renamed from: a */
            private final C2712g f7321a;

            /* renamed from: b */
            private Provider<C7613a> f7322b;

            /* renamed from: c */
            private Provider<C3062a> f7323c;

            /* renamed from: d */
            private Provider<C2955a> f7324d;

            /* renamed from: e */
            private Provider<C2994a> f7325e;

            /* renamed from: f */
            private Provider<C2923a> f7326f;

            /* renamed from: g */
            private Provider<C2948a> f7327g;

            /* renamed from: h */
            private Provider<C2831a> f7328h;

            /* renamed from: i */
            private Provider<C3110a> f7329i;

            /* renamed from: j */
            private Provider<C10627a> f7330j;

            /* renamed from: k */
            private Provider<C2712g> f7331k;
            /* access modifiers changed from: private */

            /* renamed from: l */
            public Provider<C2784r> f7332l;

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$a */
            /* compiled from: DaggerTvAppComponent */
            class C2630a implements Provider<C7613a> {
                C2630a() {
                }

                public C7613a get() {
                    return new C2640j(C2629u.this, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$a0 */
            /* compiled from: DaggerTvAppComponent */
            private final class C2631a0 implements C10626i {

                /* renamed from: a */
                private Provider<C10629k> f7335a;

                /* renamed from: b */
                private Provider<C10640n> f7336b;

                /* synthetic */ C2631a0(C2629u uVar, C10629k kVar, C2506a aVar) {
                    this(kVar);
                }

                /* renamed from: b */
                private C10638m m10132b() {
                    return new C10638m((C3572r0) C2505s.this.f6901e0.get(), C2505s.this.m9339p0());
                }

                /* renamed from: c */
                private C10629k m10134c(C10629k kVar) {
                    C11891j.m38119a(kVar, C2629u.this.m10115c());
                    C10637l.m33379a(kVar, (C10640n) this.f7336b.get());
                    C10637l.m33382a(kVar, C2505s.this.m9228S());
                    C10637l.m33380a(kVar, C6140n.m19574b());
                    C10637l.m33372a(kVar, (C2757f) C2629u.this.m10110b());
                    C10637l.m33371a(kVar, (C2744e) C2629u.this.f7332l.get());
                    C10637l.m33377a(kVar, m10131a());
                    C10637l.m33375a(kVar, (C7236b) C2505s.this.m9180G());
                    C10637l.m33374a(kVar, C2516k.this.m9415C());
                    C10637l.m33381a(kVar, (C7862c) C2505s.this.m9329n0());
                    C10637l.m33373a(kVar, (C3572r0) C2505s.this.f6901e0.get());
                    C10637l.m33376a(kVar, new C10622f());
                    C10637l.m33378a(kVar, m10132b());
                    return kVar;
                }

                private C2631a0(C10629k kVar) {
                    m10133b(kVar);
                }

                /* renamed from: a */
                private C10623g m10131a() {
                    return new C10623g((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get());
                }

                /* renamed from: b */
                private void m10133b(C10629k kVar) {
                    this.f7335a = C11896d.m38128a(kVar);
                    this.f7336b = C11894b.m38127b(C10628j.m33350a((Provider) this.f7335a, C2516k.this.f7035h0, C2505s.this.f6942o1));
                }

                /* renamed from: a */
                public void mo11603a(C10629k kVar) {
                    m10134c(kVar);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$b */
            /* compiled from: DaggerTvAppComponent */
            class C2632b implements Provider<C3062a> {
                C2632b() {
                }

                public C3062a get() {
                    return new C2642l(C2629u.this, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$c */
            /* compiled from: DaggerTvAppComponent */
            class C2633c implements Provider<C2955a> {
                C2633c() {
                }

                public C2955a get() {
                    return new C2644n(C2629u.this, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$d */
            /* compiled from: DaggerTvAppComponent */
            class C2634d implements Provider<C2994a> {
                C2634d() {
                }

                public C2994a get() {
                    return new C2646p(C2629u.this, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$e */
            /* compiled from: DaggerTvAppComponent */
            class C2635e implements Provider<C2923a> {
                C2635e() {
                }

                public C2923a get() {
                    return new C2648r(C2629u.this, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$f */
            /* compiled from: DaggerTvAppComponent */
            class C2636f implements Provider<C2948a> {
                C2636f() {
                }

                public C2948a get() {
                    return new C2650t(C2629u.this, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$g */
            /* compiled from: DaggerTvAppComponent */
            class C2637g implements Provider<C2831a> {
                C2637g() {
                }

                public C2831a get() {
                    return new C2652v(C2629u.this, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$h */
            /* compiled from: DaggerTvAppComponent */
            class C2638h implements Provider<C3110a> {
                C2638h() {
                }

                public C3110a get() {
                    return new C2654x(C2629u.this, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$i */
            /* compiled from: DaggerTvAppComponent */
            class C2639i implements Provider<C10627a> {
                C2639i() {
                }

                public C10627a get() {
                    return new C2656z(C2629u.this, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$j */
            /* compiled from: DaggerTvAppComponent */
            private final class C2640j implements C7613a {
                private C2640j() {
                }

                /* synthetic */ C2640j(C2629u uVar, C2506a aVar) {
                    this();
                }

                /* renamed from: a */
                public C7612d mo11605a(C7631a aVar) {
                    C11897e.m38129a(aVar);
                    return new C2641k(C2629u.this, aVar, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$k */
            /* compiled from: DaggerTvAppComponent */
            private final class C2641k implements C7612d {

                /* renamed from: a */
                private final C7631a f7347a;

                /* synthetic */ C2641k(C2629u uVar, C7631a aVar, C2506a aVar2) {
                    this(aVar);
                }

                /* renamed from: b */
                private C7631a m10140b(C7631a aVar) {
                    C11891j.m38119a(aVar, C2629u.this.m10115c());
                    C7635b.m22622a(aVar, (C3572r0) C2505s.this.f6901e0.get());
                    C7635b.m22623a(aVar, m10139a());
                    return aVar;
                }

                private C2641k(C7631a aVar) {
                    this.f7347a = aVar;
                }

                /* renamed from: a */
                private C7636c m10139a() {
                    return C7611c.m22591a(this.f7347a, C2505s.this.m9170E());
                }

                /* renamed from: a */
                public void mo11603a(C7631a aVar) {
                    m10140b(aVar);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$l */
            /* compiled from: DaggerTvAppComponent */
            private final class C2642l implements C3062a {
                private C2642l() {
                }

                /* synthetic */ C2642l(C2629u uVar, C2506a aVar) {
                    this();
                }

                /* renamed from: a */
                public C3061e mo11605a(C3064g gVar) {
                    C11897e.m38129a(gVar);
                    return new C2643m(C2629u.this, gVar, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$m */
            /* compiled from: DaggerTvAppComponent */
            private final class C2643m implements C3061e {

                /* renamed from: a */
                private final C3064g f7350a;

                /* synthetic */ C2643m(C2629u uVar, C3064g gVar, C2506a aVar) {
                    this(gVar);
                }

                /* renamed from: b */
                private C3058c m10146b() {
                    return new C3058c((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get());
                }

                /* renamed from: c */
                private C3077i m10148c() {
                    return C3063f.m10869a(this.f7350a, m10145a(), C2629u.this.m10118e(), C2629u.this.m10110b(), C2629u.this.m10126i(), (C2784r) C2629u.this.f7332l.get(), Boolean.valueOf(C2505s.this.m9255Z()), (C7930a) C2505s.this.f6868U1.get());
                }

                private C2643m(C3064g gVar) {
                    this.f7350a = gVar;
                }

                /* renamed from: a */
                private C3048b m10145a() {
                    return new C3048b(C2505s.this.m9336p(), C2516k.this.m9415C(), (C7614e) C2505s.this.f6973w1.get());
                }

                /* renamed from: b */
                private C3064g m10147b(C3064g gVar) {
                    C11891j.m38119a(gVar, C2629u.this.m10115c());
                    C3076h.m10887a(gVar, m10148c());
                    C3076h.m10886a(gVar, m10146b());
                    C3076h.m10890a(gVar, C6140n.m19574b());
                    C3076h.m10889a(gVar, (C7547h) C2516k.this.m9495n());
                    C3076h.m10888a(gVar, C2516k.this.m9415C());
                    return gVar;
                }

                /* renamed from: a */
                public void mo11603a(C3064g gVar) {
                    m10147b(gVar);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$n */
            /* compiled from: DaggerTvAppComponent */
            private final class C2644n implements C2955a {
                private C2644n() {
                }

                /* synthetic */ C2644n(C2629u uVar, C2506a aVar) {
                    this();
                }

                /* renamed from: a */
                public C2954d mo11605a(C2957f fVar) {
                    C11897e.m38129a(fVar);
                    return new C2645o(C2629u.this, fVar, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$o */
            /* compiled from: DaggerTvAppComponent */
            private final class C2645o implements C2954d {

                /* renamed from: a */
                private final C2957f f7353a;

                /* synthetic */ C2645o(C2629u uVar, C2957f fVar, C2506a aVar) {
                    this(fVar);
                }

                /* renamed from: b */
                private C2951b m10154b() {
                    return new C2951b((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get());
                }

                /* renamed from: c */
                private C2968h m10156c() {
                    return C2956e.m10726a(this.f7353a, m10157d(), C2629u.this.m10108a(), m10153a(), C2629u.this.m10118e(), C2629u.this.m10127j(), Optional.m32791c(C2505s.this.f6820E1.get()), C2629u.this.m10110b(), m10154b());
                }

                /* renamed from: d */
                private C2977j m10157d() {
                    return new C2977j(C2505s.this.m9336p(), C2505s.this.m9276d(), m10153a(), (C7614e) C2505s.this.f6973w1.get());
                }

                private C2645o(C2957f fVar) {
                    this.f7353a = fVar;
                }

                /* renamed from: a */
                private String m10153a() {
                    return C2707d0.m10342a((C2784r) C2629u.this.f7332l.get());
                }

                /* renamed from: b */
                private C2957f m10155b(C2957f fVar) {
                    C11891j.m38119a(fVar, C2629u.this.m10115c());
                    C2967g.m10744a(fVar, m10156c());
                    C2967g.m10743a(fVar, m10154b());
                    C2967g.m10746a(fVar, C6140n.m19574b());
                    C2967g.m10742a(fVar, C2629u.this.m10126i());
                    C2967g.m10745a(fVar, C2516k.this.m9415C());
                    return fVar;
                }

                /* renamed from: a */
                public void mo11603a(C2957f fVar) {
                    m10155b(fVar);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$p */
            /* compiled from: DaggerTvAppComponent */
            private final class C2646p implements C2994a {
                private C2646p() {
                }

                /* synthetic */ C2646p(C2629u uVar, C2506a aVar) {
                    this();
                }

                /* renamed from: a */
                public C2993c mo11605a(C2996e eVar) {
                    C11897e.m38129a(eVar);
                    return new C2647q(C2629u.this, eVar, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$q */
            /* compiled from: DaggerTvAppComponent */
            private final class C2647q implements C2993c {

                /* renamed from: a */
                private final C2996e f7356a;

                /* synthetic */ C2647q(C2629u uVar, C2996e eVar, C2506a aVar) {
                    this(eVar);
                }

                /* renamed from: b */
                private C2997f m10164b() {
                    return new C2997f((C2750c) C2505s.this.f6880Y1.get(), C2505s.this.m9336p(), (C7614e) C2505s.this.f6973w1.get());
                }

                /* renamed from: c */
                private C3017j m10165c() {
                    return C2995d.m10784a(this.f7356a, (C2750c) C2505s.this.f6880Y1.get(), m10164b(), C2629u.this.m10108a(), C2505s.this.m9276d(), Optional.m32791c(C2505s.this.f6820E1.get()), C2629u.this.m10118e(), m10162a());
                }

                private C2647q(C2996e eVar) {
                    this.f7356a = eVar;
                }

                /* renamed from: a */
                private C2887n m10162a() {
                    return new C2887n((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get());
                }

                /* renamed from: b */
                private C2996e m10163b(C2996e eVar) {
                    C11891j.m38119a(eVar, C2629u.this.m10115c());
                    C3015h.m10807a((C3004g) eVar, m10165c());
                    C3015h.m10806a((C3004g) eVar, m10162a());
                    return eVar;
                }

                /* renamed from: a */
                public void mo11603a(C2996e eVar) {
                    m10163b(eVar);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$r */
            /* compiled from: DaggerTvAppComponent */
            private final class C2648r implements C2923a {
                private C2648r() {
                }

                /* synthetic */ C2648r(C2629u uVar, C2506a aVar) {
                    this();
                }

                /* renamed from: a */
                public C2922r mo11605a(C2926u uVar) {
                    C11897e.m38129a(uVar);
                    return new C2649s(C2629u.this, uVar, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$s */
            /* compiled from: DaggerTvAppComponent */
            private final class C2649s implements C2922r {

                /* renamed from: a */
                private final C2926u f7359a;

                /* synthetic */ C2649s(C2629u uVar, C2926u uVar2, C2506a aVar) {
                    this(uVar2);
                }

                /* renamed from: b */
                private C2887n m10171b() {
                    return new C2887n((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get());
                }

                /* renamed from: c */
                private C2928w m10173c() {
                    return new C2928w(C2505s.this.m9336p(), C2505s.this.m9276d(), m10170a(), (C7614e) C2505s.this.f6973w1.get());
                }

                /* renamed from: d */
                private C2940x m10174d() {
                    return new C2940x(C2505s.this.m9336p(), C2924s.m10689a(), (C7614e) C2505s.this.f6973w1.get());
                }

                /* renamed from: e */
                private C2901o0 m10175e() {
                    return C2925t.m10690a(this.f7359a, m10170a(), m10174d(), m10173c(), C2629u.this.m10108a(), C2629u.this.m10118e(), C2516k.this.m9495n(), Boolean.valueOf(C2505s.this.m9255Z()), m10171b());
                }

                private C2649s(C2926u uVar) {
                    this.f7359a = uVar;
                }

                /* renamed from: a */
                private String m10170a() {
                    return C2707d0.m10342a((C2784r) C2629u.this.f7332l.get());
                }

                /* renamed from: b */
                private C2926u m10172b(C2926u uVar) {
                    C11891j.m38119a(uVar, C2629u.this.m10115c());
                    C2919p.m10681a((C2889o) uVar, m10175e());
                    C2919p.m10680a((C2889o) uVar, m10171b());
                    C2919p.m10684a((C2889o) uVar, (C7773b) C2516k.this.m9507t());
                    C2919p.m10683a((C2889o) uVar, C6140n.m19574b());
                    C2919p.m10682a((C2889o) uVar, C2516k.this.m9415C());
                    C2919p.m10685a((C2889o) uVar, m10170a());
                    C2927v.m10695a(uVar, C2629u.this.m10127j());
                    C2927v.m10694a(uVar, (C2754c) C2629u.this.m10110b());
                    return uVar;
                }

                /* renamed from: a */
                public void mo11603a(C2926u uVar) {
                    m10172b(uVar);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$t */
            /* compiled from: DaggerTvAppComponent */
            private final class C2650t implements C2948a {
                private C2650t() {
                }

                /* synthetic */ C2650t(C2629u uVar, C2506a aVar) {
                    this();
                }

                /* renamed from: a */
                public C2947z mo11605a(C2857c0 c0Var) {
                    C11897e.m38129a(c0Var);
                    return new C2651u(C2629u.this, c0Var, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$u */
            /* compiled from: DaggerTvAppComponent */
            private final class C2651u implements C2947z {

                /* renamed from: a */
                private final C2857c0 f7362a;

                /* synthetic */ C2651u(C2629u uVar, C2857c0 c0Var, C2506a aVar) {
                    this(c0Var);
                }

                /* renamed from: b */
                private C2887n m10182b() {
                    return new C2887n((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get());
                }

                /* renamed from: c */
                private C2928w m10183c() {
                    return new C2928w(C2505s.this.m9336p(), C2505s.this.m9276d(), m10180a(), (C7614e) C2505s.this.f6973w1.get());
                }

                /* renamed from: d */
                private C2940x m10184d() {
                    return new C2940x(C2505s.this.m9336p(), C2853a0.m10555a(), (C7614e) C2505s.this.f6973w1.get());
                }

                /* renamed from: e */
                private C2901o0 m10185e() {
                    return C2855b0.m10556a(this.f7362a, m10180a(), m10184d(), m10183c(), C2629u.this.m10108a(), C2629u.this.m10118e(), C2516k.this.m9495n(), Boolean.valueOf(C2505s.this.m9255Z()), m10182b());
                }

                private C2651u(C2857c0 c0Var) {
                    this.f7362a = c0Var;
                }

                /* renamed from: a */
                private String m10180a() {
                    return C2707d0.m10342a((C2784r) C2629u.this.f7332l.get());
                }

                /* renamed from: b */
                private C2857c0 m10181b(C2857c0 c0Var) {
                    C11891j.m38119a(c0Var, C2629u.this.m10115c());
                    C2919p.m10681a((C2889o) c0Var, m10185e());
                    C2919p.m10680a((C2889o) c0Var, m10182b());
                    C2919p.m10684a((C2889o) c0Var, (C7773b) C2516k.this.m9507t());
                    C2919p.m10683a((C2889o) c0Var, C6140n.m19574b());
                    C2919p.m10682a((C2889o) c0Var, C2516k.this.m9415C());
                    C2919p.m10685a((C2889o) c0Var, m10180a());
                    C2859d0.m10563a(c0Var, (C2784r) C2629u.this.f7332l.get());
                    C2859d0.m10562a(c0Var, C2629u.this.m10127j());
                    C2859d0.m10561a(c0Var, (C2754c) C2629u.this.m10110b());
                    return c0Var;
                }

                /* renamed from: a */
                public void mo11603a(C2857c0 c0Var) {
                    m10181b(c0Var);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$v */
            /* compiled from: DaggerTvAppComponent */
            private final class C2652v implements C2831a {
                private C2652v() {
                }

                /* synthetic */ C2652v(C2629u uVar, C2506a aVar) {
                    this();
                }

                /* renamed from: a */
                public C2830d mo11605a(C2833f fVar) {
                    C11897e.m38129a(fVar);
                    return new C2653w(C2629u.this, fVar, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$w */
            /* compiled from: DaggerTvAppComponent */
            private final class C2653w implements C2830d {

                /* renamed from: a */
                private final C2833f f7365a;

                /* synthetic */ C2653w(C2629u uVar, C2833f fVar, C2506a aVar) {
                    this(fVar);
                }

                /* renamed from: b */
                private RegisterAccountAction m10191b() {
                    RegisterAccountAction registerAccountAction = new RegisterAccountAction(C2505s.this.m9336p(), C2505s.this.m9276d(), (C2750c) C2505s.this.f6880Y1.get(), C2505s.this.m9196K(), (C7614e) C2505s.this.f6973w1.get());
                    return registerAccountAction;
                }

                /* renamed from: c */
                private C2827b m10193c() {
                    return new C2827b((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get());
                }

                /* renamed from: d */
                private C2842h m10194d() {
                    return C2832e.m10514a(this.f7365a, m10191b(), (C2740b) C2516k.this.f7015V.get(), m10190a(), (C2750c) C2505s.this.f6880Y1.get(), C2629u.this.m10118e(), Optional.m32791c(C2505s.this.f6820E1.get()), m10193c());
                }

                private C2653w(C2833f fVar) {
                    this.f7365a = fVar;
                }

                /* renamed from: a */
                private String m10190a() {
                    return C2707d0.m10342a((C2784r) C2629u.this.f7332l.get());
                }

                /* renamed from: b */
                private C2833f m10192b(C2833f fVar) {
                    C11891j.m38119a(fVar, C2629u.this.m10115c());
                    C2841g.m10529a(fVar, m10194d());
                    C2841g.m10527a(fVar, (C2784r) C2629u.this.f7332l.get());
                    C2841g.m10528a(fVar, m10193c());
                    C2841g.m10531a(fVar, C6140n.m19574b());
                    C2841g.m10530a(fVar, C2516k.this.m9415C());
                    return fVar;
                }

                /* renamed from: a */
                public void mo11603a(C2833f fVar) {
                    m10192b(fVar);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$x */
            /* compiled from: DaggerTvAppComponent */
            private final class C2654x implements C3110a {
                private C2654x() {
                }

                /* synthetic */ C2654x(C2629u uVar, C2506a aVar) {
                    this();
                }

                /* renamed from: a */
                public C3109h mo11605a(C3114l lVar) {
                    C11897e.m38129a(lVar);
                    return new C2655y(C2629u.this, lVar, null);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$y */
            /* compiled from: DaggerTvAppComponent */
            private final class C2655y implements C3109h {

                /* renamed from: a */
                private final C3114l f7368a;

                /* synthetic */ C2655y(C2629u uVar, C3114l lVar, C2506a aVar) {
                    this(lVar);
                }

                /* renamed from: b */
                private C3048b m10200b() {
                    return new C3048b(C2505s.this.m9336p(), C2516k.this.m9415C(), (C7614e) C2505s.this.f6973w1.get());
                }

                /* renamed from: c */
                private C3095d m10202c() {
                    return new C3095d(C2505s.this.m9196K());
                }

                /* renamed from: d */
                private C3105e m10203d() {
                    return new C3105e((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get());
                }

                /* renamed from: e */
                private C3107f m10204e() {
                    return new C3107f(m10200b(), C2505s.this.m9196K());
                }

                /* renamed from: f */
                private C3126n m10205f() {
                    return C3113k.m10947a(this.f7368a, m10204e(), m10202c(), C2629u.this.m10110b(), C2629u.this.m10118e(), C2629u.this.m10126i(), (C2784r) C2629u.this.f7332l.get(), m10199a(), C3112j.m10946a(), m10203d(), C2516k.this.m9447S());
                }

                private C2655y(C3114l lVar) {
                    this.f7368a = lVar;
                }

                /* renamed from: a */
                private C3033b m10199a() {
                    return C3111i.m10945a(C2629u.this.m10124h(), m10203d());
                }

                /* renamed from: b */
                private C3114l m10201b(C3114l lVar) {
                    C11891j.m38119a(lVar, C2629u.this.m10115c());
                    C3125m.m10964a(lVar, m10205f());
                    C3125m.m10968a(lVar, C2505s.this.m9228S());
                    C3125m.m10963a(lVar, m10203d());
                    C3125m.m10967a(lVar, C6140n.m19574b());
                    C3125m.m10966a(lVar, (LegalRouter) C2629u.this.m10124h());
                    C3125m.m10965a(lVar, C2516k.this.m9415C());
                    return lVar;
                }

                /* renamed from: a */
                public void mo11603a(C3114l lVar) {
                    m10201b(lVar);
                }
            }

            /* renamed from: com.bamtechmedia.dominguez.app.s$k$u$z */
            /* compiled from: DaggerTvAppComponent */
            private final class C2656z implements C10627a {
                private C2656z() {
                }

                /* synthetic */ C2656z(C2629u uVar, C2506a aVar) {
                    this();
                }

                /* renamed from: a */
                public C10626i mo11605a(C10629k kVar) {
                    C11897e.m38129a(kVar);
                    return new C2631a0(C2629u.this, kVar, null);
                }
            }

            /* synthetic */ C2629u(C2516k kVar, C2712g gVar, C2506a aVar) {
                this(gVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: i */
            public C2755d m10126i() {
                return C2738o.m10376a(this.f7321a, m10116d());
            }

            /* access modifiers changed from: private */
            /* renamed from: j */
            public C2756e m10127j() {
                return C2759p.m10408a(this.f7321a);
            }

            /* renamed from: k */
            private C2727m0 m10128k() {
                C2727m0 m0Var = new C2727m0(C2516k.this.m9495n(), (C2702b) C2505s.this.f6859R1.get(), (C3572r0) C2505s.this.f6901e0.get(), C2516k.this.m9447S(), C2505s.this.m9255Z());
                return m0Var;
            }

            private C2629u(C2712g gVar) {
                this.f7321a = gVar;
                m10112b(gVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public C3145z m10110b() {
                return C2724l.m10359a(this.f7321a, m10128k());
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public C11876f<Object> m10115c() {
                return C11878g.m38111a(m10121f(), C10387h.m32863d());
            }

            /* renamed from: d */
            private C2378m m10116d() {
                return C2779q.m10436a((C2784r) this.f7332l.get());
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public C7626a m10118e() {
                return C2726m.m10361a(this.f7321a, C2516k.this.m9424G());
            }

            /* renamed from: f */
            private Map<Class<?>, Provider<C11872a<?>>> m10121f() {
                C10388a a = C10387h.m32860a(30);
                a.mo27182a(DeletedProgramBroadcastReceiver.class, C2505s.this.f6888b);
                a.mo27182a(LegalCenterFragment.class, C2505s.this.f6892c);
                a.mo27182a(MainActivity.class, C2505s.this.f6896d);
                a.mo27182a(TvPlaybackActivity.class, C2505s.this.f6900e);
                a.mo27182a(C2258d.class, C2516k.this.f7022b);
                a.mo27182a(C2712g.class, C2516k.this.f7024c);
                a.mo27182a(C7028b.class, C2516k.this.f7026d);
                a.mo27182a(C7641a.class, C2516k.this.f7028e);
                a.mo27182a(C7582a.class, C2516k.this.f7030f);
                a.mo27182a(C6056a.class, C2516k.this.f7032g);
                a.mo27182a(C2797e.class, C2516k.this.f7034h);
                a.mo27182a(C7255a.class, C2516k.this.f7036i);
                a.mo27182a(C7513i.class, C2516k.this.f7038j);
                a.mo27182a(C7522l.class, C2516k.this.f7040k);
                a.mo27182a(C7702t.class, C2516k.this.f7042l);
                a.mo27182a(C7807c.class, C2516k.this.f7044m);
                a.mo27182a(C7831a.class, C2516k.this.f7046n);
                a.mo27182a(C7838e.class, C2516k.this.f7048o);
                a.mo27182a(C6769r0.class, C2516k.this.f7050p);
                a.mo27182a(C7935b.class, C2516k.this.f7052q);
                a.mo27182a(C10572h.class, C2516k.this.f7054r);
                a.mo27182a(C7631a.class, this.f7322b);
                a.mo27182a(C3064g.class, this.f7323c);
                a.mo27182a(C2957f.class, this.f7324d);
                a.mo27182a(C2996e.class, this.f7325e);
                a.mo27182a(C2926u.class, this.f7326f);
                a.mo27182a(C2857c0.class, this.f7327g);
                a.mo27182a(C2833f.class, this.f7328h);
                a.mo27182a(C3114l.class, this.f7329i);
                a.mo27182a(C10629k.class, this.f7330j);
                return a.mo27183a();
            }

            /* renamed from: g */
            private boolean m10123g() {
                return C2728n.m10363a((C2784r) this.f7332l.get());
            }

            /* access modifiers changed from: private */
            /* renamed from: h */
            public OnboardingLegalRouter m10124h() {
                return new OnboardingLegalRouter((C5773a) C2516k.this.f7002I.get(), FeatureLegalModule_LegalFragmentFactoryFactory.legalFragmentFactory());
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C3141x m10108a() {
                return new C3141x((C2740b) C2516k.this.f7015V.get(), C2516k.this.m9509u(), m10123g());
            }

            /* renamed from: b */
            private void m10112b(C2712g gVar) {
                this.f7322b = new C2630a();
                this.f7323c = new C2632b();
                this.f7324d = new C2633c();
                this.f7325e = new C2634d();
                this.f7326f = new C2635e();
                this.f7327g = new C2636f();
                this.f7328h = new C2637g();
                this.f7329i = new C2638h();
                this.f7330j = new C2639i();
                this.f7331k = C11896d.m38128a(gVar);
                this.f7332l = C11894b.m38127b(C2722k.m10357a(this.f7331k, C2516k.this.f7061u0));
            }

            /* renamed from: c */
            private C2712g m10113c(C2712g gVar) {
                C11891j.m38119a(gVar, m10115c());
                C2715h.m10348a(gVar, m10110b());
                return gVar;
            }

            /* renamed from: a */
            public void mo11603a(C2712g gVar) {
                m10113c(gVar);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$u0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2657u0 implements C7933a {
            /* synthetic */ C2657u0(C2516k kVar, C7935b bVar, C2506a aVar) {
                this(bVar);
            }

            /* renamed from: b */
            private C7935b m10210b(C7935b bVar) {
                C11891j.m38119a(bVar, C2516k.this.m9497o());
                C7940c.m23164a(bVar, (C7932c) C2516k.this.m9434L());
                C7940c.m23163a(bVar, (C3572r0) C2505s.this.f6901e0.get());
                C7940c.m23162a(bVar, (C2747a) C2516k.this.m9513w());
                return bVar;
            }

            private C2657u0(C7935b bVar) {
            }

            /* renamed from: a */
            public void mo11603a(C7935b bVar) {
                m10210b(bVar);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$v */
        /* compiled from: DaggerTvAppComponent */
        private final class C2658v implements C7027a {
            private C2658v() {
            }

            /* synthetic */ C2658v(C2516k kVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C7026a mo11605a(C7028b bVar) {
                C11897e.m38129a(bVar);
                return new C2660w(C2516k.this, bVar, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$v0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2659v0 implements C10571a {
            private C2659v0() {
            }

            /* synthetic */ C2659v0(C2516k kVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C10570g mo11605a(C10572h hVar) {
                C11897e.m38129a(hVar);
                return new C2661w0(C2516k.this, hVar, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$w */
        /* compiled from: DaggerTvAppComponent */
        private final class C2660w implements C7026a {
            /* synthetic */ C2660w(C2516k kVar, C7028b bVar, C2506a aVar) {
                this(bVar);
            }

            /* renamed from: b */
            private C7112z m10219b() {
                return new C7112z((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get());
            }

            private C2660w(C7028b bVar) {
            }

            /* renamed from: a */
            private C7039e m10217a() {
                return new C7039e((C5773a) C2516k.this.f7002I.get());
            }

            /* renamed from: b */
            private C7028b m10218b(C7028b bVar) {
                C11891j.m38119a(bVar, C2516k.this.m9497o());
                C7038d.m21358a(bVar, (C2809j) C2516k.this.f7063v0.get());
                C7038d.m21361a(bVar, m10217a());
                C7038d.m21362a(bVar, m10219b());
                C7038d.m21363a(bVar, C6140n.m19574b());
                C7038d.m21359a(bVar, (C3572r0) C2505s.this.f6901e0.get());
                C7038d.m21360a(bVar, C2516k.this.m9415C());
                C7038d.m21364a(bVar, (C7862c) C2505s.this.m9329n0());
                return bVar;
            }

            /* renamed from: a */
            public void mo11603a(C7028b bVar) {
                m10218b(bVar);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$w0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2661w0 implements C10570g {

            /* renamed from: a */
            private final C10572h f7375a;

            /* synthetic */ C2661w0(C2516k kVar, C10572h hVar, C2506a aVar) {
                this(hVar);
            }

            /* renamed from: b */
            private C10572h m10223b(C10572h hVar) {
                C11891j.m38119a(hVar, C2516k.this.m9497o());
                C10581j.m33308a(hVar, m10222a());
                C10581j.m33307a(hVar, C2505s.this.m9341q());
                return hVar;
            }

            private C2661w0(C10572h hVar) {
                this.f7375a = hVar;
            }

            /* renamed from: a */
            private C10583l m10222a() {
                return C10568e.m33300a(this.f7375a, C2516k.this.m9517y());
            }

            /* renamed from: a */
            public void mo11603a(C10572h hVar) {
                m10223b(hVar);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$x */
        /* compiled from: DaggerTvAppComponent */
        private final class C2662x implements C7240a {
            private C2662x() {
            }

            /* synthetic */ C2662x(C2516k kVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C7239e mo11605a(C7255a aVar) {
                C11897e.m38129a(aVar);
                return new C2664y(C2516k.this, aVar, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$x0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2663x0 implements C7557a {
            private C2663x0() {
            }

            /* synthetic */ C2663x0(C2516k kVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C7556o mo11605a(C6056a aVar) {
                C11897e.m38129a(aVar);
                return new C2665y0(C2516k.this, aVar, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$y */
        /* compiled from: DaggerTvAppComponent */
        private final class C2664y implements C7239e {
            /* synthetic */ C2664y(C2516k kVar, C7255a aVar, C2506a aVar2) {
                this(aVar);
            }

            /* renamed from: b */
            private C7255a m10230b(C7255a aVar) {
                C11886e.m38117a(aVar, C2516k.this.m9497o());
                return aVar;
            }

            private C2664y(C7255a aVar) {
            }

            /* renamed from: a */
            public void mo11603a(C7255a aVar) {
                m10230b(aVar);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$y0 */
        /* compiled from: DaggerTvAppComponent */
        private final class C2665y0 implements C7556o {
            /* synthetic */ C2665y0(C2516k kVar, C6056a aVar, C2506a aVar2) {
                this(aVar);
            }

            /* renamed from: b */
            private C6056a m10234b(C6056a aVar) {
                C11886e.m38117a(aVar, C2516k.this.m9497o());
                C6061b.m19421a(aVar, (C2334a) C2505s.this.f6854Q.get());
                C6061b.m19422a(aVar, m10233a());
                return aVar;
            }

            private C2665y0(C6056a aVar) {
            }

            /* renamed from: a */
            private C7542e m10233a() {
                return new C7542e((C2348e) C2505s.this.f6855Q0.get());
            }

            /* renamed from: a */
            public void mo11603a(C6056a aVar) {
                m10234b(aVar);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$k$z */
        /* compiled from: DaggerTvAppComponent */
        private final class C2666z implements C7506a {
            private C2666z() {
            }

            /* synthetic */ C2666z(C2516k kVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C7505e mo11605a(C7513i iVar) {
                C11897e.m38129a(iVar);
                return new C2518a0(C2516k.this, iVar, null);
            }
        }

        /* synthetic */ C2516k(C2505s sVar, MainActivity mainActivity, C2506a aVar) {
            this(mainActivity);
        }

        private C2516k(MainActivity mainActivity) {
            this.f7020a = mainActivity;
            m9461b(mainActivity);
        }

        /* renamed from: A */
        private C5562f m9411A() {
            return new C5562f(C2505s.this.f6908g);
        }

        /* renamed from: B */
        private C3780j m9413B() {
            return C3295e.m11380a(m9425H());
        }

        /* access modifiers changed from: private */
        /* renamed from: C */
        public C3796d m9415C() {
            return C5567i.m18372a((C0532d) this.f7020a, (C3585a) C2505s.this.m9160C(), (C5765a) C2505s.this.f6940o.get(), new C5568j(), m9411A(), C5871e.m18924b());
        }

        /* access modifiers changed from: private */
        /* renamed from: D */
        public C6761p0 m9417D() {
            return C6721l0.m20777a((C5773a) this.f7002I.get(), (C6627c1) m9419E());
        }

        /* access modifiers changed from: private */
        /* renamed from: E */
        public C6630d1 m9419E() {
            return new C6630d1(m9422F());
        }

        /* access modifiers changed from: private */
        /* renamed from: F */
        public C6725m1 m9422F() {
            return C6724m0.m20787a((C0532d) this.f7020a, (C6667g1) C2505s.this.f6869V.get(), (C6675i) m9465c(), m9459b(), (C6090n) C2505s.this.f6897d0.get(), (C3419l) C2505s.this.f6864T0.get(), (C7614e) C2505s.this.f6973w1.get(), (C7547h) m9495n());
        }

        /* access modifiers changed from: private */
        /* renamed from: G */
        public C7618a m9424G() {
            return new C7618a(C7554m.m22516a(), (C7614e) C2505s.this.f6973w1.get(), m9495n());
        }

        /* renamed from: H */
        private C3784d m9425H() {
            return new C3784d(this.f7020a, m9419E(), (C3419l) C2505s.this.f6864T0.get());
        }

        /* renamed from: I */
        private RemoteContentSetDataSource m9427I() {
            return new RemoteContentSetDataSource(m9501q(), (C3776f) C2505s.this.f6873W0.get(), (C3165c) C2505s.this.f6886a1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: J */
        public RemoteSeriesDetailDataSource m9429J() {
            return new RemoteSeriesDetailDataSource(m9501q(), (C5911c) C2505s.this.f6895c2.get(), (C3165c) C2505s.this.f6886a1.get(), C2505s.this.m9382y());
        }

        /* renamed from: K */
        private RemoteWatchlistDataSource m9432K() {
            return new RemoteWatchlistDataSource(m9501q());
        }

        /* access modifiers changed from: private */
        /* renamed from: L */
        public C7941d m9434L() {
            return new C7941d((C5773a) this.f7002I.get(), m9447S(), (C2739a) C2505s.this.f6862S1.get());
        }

        /* renamed from: M */
        private Set<C0721l> m9436M() {
            return ImmutableSet.m32840a(m9485j(), this.f7055r0.get(), m9442P());
        }

        /* renamed from: N */
        private Single<C7252a> m9437N() {
            return C7238d.m21849a(C2505s.this.m9198K0(), C2505s.this.m9341q());
        }

        /* renamed from: O */
        private C6198l m9439O() {
            return new C6198l(C2505s.this.m9301i());
        }

        /* renamed from: P */
        private VpnDialogLifecycleObserver m9442P() {
            return new VpnDialogLifecycleObserver((C7141a) C2505s.this.f6809B.get(), (C7614e) C2505s.this.f6973w1.get(), this.f7020a);
        }

        /* access modifiers changed from: private */
        /* renamed from: Q */
        public C10602m m9444Q() {
            return new C10602m(m9432K(), (C3419l) C2505s.this.f6864T0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: R */
        public C10609c m9445R() {
            return new C10609c(m9447S());
        }

        /* access modifiers changed from: private */
        /* renamed from: S */
        public C10612e m9447S() {
            return new C10612e(C2505s.this.f6884a, (C5773a) this.f7002I.get(), m9495n());
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C6657f m9459b() {
            return new C6657f(C2505s.this.f6884a, (C7159g) C2505s.this.f6929l0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C6700j m9465c() {
            return new C6700j(C2505s.this.m9332o(), m9501q(), C5872f.m18926b());
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public C7728d m9467d() {
            return new C7728d(this.f7020a, C5872f.m18926b());
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public C3330h m9470e() {
            return C6130f.m19546a(this.f7020a, (C6667g1) C2505s.this.f6869V.get(), (C3419l) C2505s.this.f6864T0.get(), (C2366i0) C2505s.this.f6979y1.get());
        }

        /* renamed from: f */
        private C3663f m9473f() {
            return new C3663f(m9501q(), (C3660c) C2505s.this.f6867U0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public C3668i m9476g() {
            C3668i iVar = new C3668i(m9473f(), m9482i(), m9470e(), m9479h(), (C3660c) C2505s.this.f6867U0.get());
            return iVar;
        }

        /* renamed from: h */
        private C3762a m9479h() {
            return new C3762a(C2505s.this.f6884a, Optional.m32791c(m9419E()), (C6667g1) C2505s.this.f6869V.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public C3768d m9482i() {
            return new C3768d(m9427I(), m9479h(), Optional.m32791c(m9413B()));
        }

        /* renamed from: j */
        private CtvActivationLifecycleObserver m9485j() {
            return new CtvActivationLifecycleObserver(C11894b.m38125a(this.f7053q0), m9437N(), this.f7020a);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public C7287b m9488k() {
            return new C7287b(C2505s.this.m9301i());
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public C7541d m9491l() {
            return new C7541d(m9495n());
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public C7296g m9493m() {
            return C7298i.m21929a((C0532d) this.f7020a, (C2348e) C2505s.this.f6855Q0.get(), (C2451c) C2505s.this.f6834J0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public C7548i m9495n() {
            return new C7548i((C5773a) this.f7002I.get(), C7555n.m22518b());
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public C11876f<Object> m9497o() {
            return C11878g.m38111a(m9520z(), C10387h.m32863d());
        }

        /* renamed from: p */
        private C6127c m9499p() {
            return C6131g.m19548a(m9436M());
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public C3727b m9501q() {
            C3727b bVar = new C3727b(C2505s.this.m9167D0(), Optional.m32791c(m9415C()), C2505s.this.f6824G, C2505s.this.m9230S0(), C2505s.this.m9215O0(), C2505s.this.m9172E0());
            return bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public C3733e m9503r() {
            return new C3733e(C2505s.this.m9184H(), C2505s.this.m9230S0(), C2494j.m9130b());
        }

        /* renamed from: s */
        private C6181d m9505s() {
            C6181d dVar = new C6181d(C11894b.m38125a(this.f7056s), C11894b.m38125a(this.f7023b0), C11894b.m38125a(this.f7025c0), m9439O(), (C6234e) C2505s.this.f6980z.get(), C5871e.m18924b());
            return dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public C7804a m9507t() {
            return new C7804a((C5773a) this.f7002I.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public C2783b m9509u() {
            return C3031v.m10840b(this.f7068y);
        }

        /* access modifiers changed from: private */
        /* renamed from: v */
        public C2793c m9511v() {
            return C2990u.m10781a(this.f7041k0, C2505s.this.m9202L0(), (C2702b) C2505s.this.f6859R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public C2808i m9513w() {
            return new C2808i((C2809j) this.f7063v0.get());
        }

        /* renamed from: x */
        private C6136l m9515x() {
            C6136l lVar = new C6136l(this.f7003J, C6140n.m19573a(), this.f7002I, C10569f.m33301a(), C2505s.this.f6862S1, this.f7043l0, C7698p.m22721a(), this.f7045m0, C7925b.m23147a(), C2505s.this.m9255Z());
            return lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: y */
        public C6144q m9517y() {
            return C6135k.m19553a(this.f7020a, m9505s(), (C6234e) C2505s.this.f6980z.get(), this.f7014U, this.f7027d0, m9511v(), m9515x(), C2505s.this.m9206M0(), C2505s.this.f6811B1, this.f7014U, C5873g.m18928b(), (C7930a) C2505s.this.f6868U1.get(), m9456a(), C11894b.m38125a(this.f7047n0), this.f7049o0, (C7301l) C2505s.this.f6871V1.get());
        }

        /* renamed from: z */
        private Map<Class<?>, Provider<C11872a<?>>> m9520z() {
            C10388a a = C10387h.m32860a(21);
            a.mo27182a(DeletedProgramBroadcastReceiver.class, C2505s.this.f6888b);
            a.mo27182a(LegalCenterFragment.class, C2505s.this.f6892c);
            a.mo27182a(MainActivity.class, C2505s.this.f6896d);
            a.mo27182a(TvPlaybackActivity.class, C2505s.this.f6900e);
            a.mo27182a(C2258d.class, this.f7022b);
            a.mo27182a(C2712g.class, this.f7024c);
            a.mo27182a(C7028b.class, this.f7026d);
            a.mo27182a(C7641a.class, this.f7028e);
            a.mo27182a(C7582a.class, this.f7030f);
            a.mo27182a(C6056a.class, this.f7032g);
            a.mo27182a(C2797e.class, this.f7034h);
            a.mo27182a(C7255a.class, this.f7036i);
            a.mo27182a(C7513i.class, this.f7038j);
            a.mo27182a(C7522l.class, this.f7040k);
            a.mo27182a(C7702t.class, this.f7042l);
            a.mo27182a(C7807c.class, this.f7044m);
            a.mo27182a(C7831a.class, this.f7046n);
            a.mo27182a(C7838e.class, this.f7048o);
            a.mo27182a(C6769r0.class, this.f7050p);
            a.mo27182a(C7935b.class, this.f7052q);
            a.mo27182a(C10572h.class, this.f7054r);
            return a.mo27183a();
        }

        /* renamed from: a */
        private C2446e m9456a() {
            return new C2446e(C2505s.this.m9368v0());
        }

        /* renamed from: b */
        private void m9461b(MainActivity mainActivity) {
            this.f7022b = new C2590i();
            this.f7024c = new C2592j();
            this.f7026d = new C2594k();
            this.f7028e = new C2596l();
            this.f7030f = new C2598m();
            this.f7032g = new C2600n();
            this.f7034h = new C2602o();
            this.f7036i = new C2604p();
            this.f7038j = new C2606q();
            this.f7040k = new C2517a();
            this.f7042l = new C2519b();
            this.f7044m = new C2521c();
            this.f7046n = new C2523d();
            this.f7048o = new C2525e();
            this.f7050p = new C2527f();
            this.f7052q = new C2529g();
            this.f7054r = new C2588h();
            this.f7056s = C6180c.m19645a(C2505s.this.f6906f1, C2505s.this.f6918i1, C2505s.this.f6910g1);
            this.f7058t = C2441b.m9002a(C2505s.this.f6825G0, C5872f.m18925a());
            this.f7060u = C11896d.m38128a(mainActivity);
            this.f7062v = C11894b.m38127b(C6141o.m19575a(C2505s.this.f6954r1, C2505s.this.f6958s1, C2505s.this.f6966u1, C2505s.this.f6914h1, this.f7060u, C2505s.this.f6973w1, C2505s.this.f6813C0));
            this.f7064w = C7880k.m23090a(this.f7062v);
            this.f7066x = C6624b1.m20555a(C2505s.this.f6869V);
            C11900b a = C11898f.m38133a(4, 0);
            a.mo30024a(C2505s.this.f6934m1);
            a.mo30024a(this.f7058t);
            a.mo30024a(this.f7064w);
            a.mo30024a(this.f7066x);
            this.f7068y = a.mo30025a();
            this.f7070z = C3031v.m10839a(this.f7068y);
            this.f6994A = C5565g.m18369a(C2505s.this.f6908g);
            this.f6995B = C5567i.m18373a(this.f7060u, C2505s.this.f6936n, C2505s.this.f6940o, (Provider<C5568j>) C5569k.m18379a(), this.f6994A, (Provider<C11969r>) C5871e.m18923a());
            this.f6996C = C2667l.m10240b(this.f6995B);
            this.f6997D = C3731c.m12672a(C2505s.this.f6815D, this.f6996C, C2505s.this.f6824G, C2505s.this.f6830I, C2505s.this.f6872W, C2505s.this.f6833J);
            this.f6998E = C6716k.m20771a(C2505s.this.f6845N, this.f6997D, C5872f.m18925a());
            this.f6999F = C3666g.m12495a(this.f6997D, C2505s.this.f6867U0);
            this.f7000G = C3787l.m12807a(this.f6997D, C2505s.this.f6873W0, C2505s.this.f6886a1);
            this.f7001H = C6665g.m20661a(C2505s.this.f6904f, C2505s.this.f6929l0);
            this.f7002I = C11901g.m38136a(C6129e.m19545a(this.f7060u));
            this.f7003J = C7550j.m22513a(this.f7002I, C7555n.m22517a());
            this.f7004K = C6724m0.m20786a(this.f7060u, C2505s.this.f6869V, this.f6998E, this.f7001H, C2505s.this.f6897d0, C2505s.this.f6864T0, C2505s.this.f6973w1, this.f7003J);
            this.f7005L = C6656e1.m20640a(this.f7004K);
            this.f7006M = C2667l.m10240b(this.f7005L);
            this.f7007N = C3764b.m12765a(C2505s.this.f6904f, this.f7006M, C2505s.this.f6869V);
            this.f7008O = C3786k.m12806a(this.f7060u, this.f7005L, C2505s.this.f6864T0);
            this.f7009P = C3295e.m11379a(this.f7008O);
            this.f7010Q = C2667l.m10240b(this.f7009P);
            this.f7011R = C3775e.m12781a(this.f7000G, this.f7007N, this.f7010Q);
            this.f7012S = C6130f.m19547a(this.f7060u, C2505s.this.f6869V, C2505s.this.f6864T0, C2505s.this.f6979y1);
            this.f7013T = C3675j.m12509a(this.f6999F, this.f7011R, this.f7012S, this.f7007N, C2505s.this.f6867U0);
            this.f7014U = C11901g.m38136a(C6623b0.m20554a(C2505s.this.f6827H, C2505s.this.f6869V, this.f6998E, this.f7013T, C2505s.this.f6811B1, C2505s.this.f6830I, C2505s.this.f6894c1, C2505s.this.f6904f, C2505s.this.f6901e0, this.f7005L, C5873g.m18927a()));
            Provider O = C2505s.this.f6980z;
            Provider<C6606a0> provider = this.f7014U;
            this.f7015V = C11901g.m38136a(C6218c.m19709a(O, provider, provider));
            this.f7016W = C2667l.m10240b(C2505s.this.f6820E1);
            this.f7017X = C2774f.m10432a(C3516a0.m11917a());
            this.f7018Y = C2769c.m10425a(this.f7016W, this.f7017X, C2505s.this.f6823F1, C2505s.this.f6930l1, this.f7003J, C2505s.this.f6817D1);
            this.f7019Z = C2703b0.m10336a(C2505s.this.f6971w, this.f7070z, this.f7015V, this.f7018Y);
            this.f7021a0 = C7735e.m22798a(this.f7060u, C5872f.m18925a());
            this.f7023b0 = C6197k.m19668a(C2505s.this.f6926k1, this.f7019Z, C2505s.this.f6829H1, this.f7021a0, C2505s.this.f6838K1);
            this.f7025c0 = C6195i.m19666a(C2505s.this.f6882Z0, C2505s.this.f6869V, C2505s.this.f6980z);
            this.f7027d0 = C11901g.m38136a(C3293c.m11377a(this.f7013T, C2505s.this.f6894c1));
            this.f7029e0 = C2445d.m9007a(C2505s.this.f6825G0, C5872f.m18925a());
            this.f7031f0 = C7836c.m22951a(this.f7002I);
            this.f7033g0 = C7080r.m21453a(C2505s.this.f6856Q1, C2505s.this.f6942o1, C5873g.m18927a(), C5871e.m18923a(), this.f7062v, this.f7031f0, C2491g.m9123a());
            this.f7035h0 = C11894b.m38127b(this.f7033g0);
            this.f7037i0 = C7883m.m23095a(this.f7035h0);
            this.f7039j0 = C6652f.m20630a(C2505s.this.f6839L, C5872f.m18925a());
            C11900b a2 = C11898f.m38133a(5, 0);
            a2.mo30024a(C2505s.this.f6853P1);
            a2.mo30024a(this.f7007N);
            a2.mo30024a(this.f7029e0);
            a2.mo30024a(this.f7037i0);
            a2.mo30024a(this.f7039j0);
            this.f7041k0 = a2.mo30025a();
            this.f7043l0 = C11901g.m38136a(C7854h.m22998a(C2505s.this.f6870V0));
            this.f7045m0 = C6721l0.m20776a(this.f7002I, this.f7005L);
            this.f7047n0 = C6215d.m19702a(this.f7035h0, this.f7062v);
            this.f7049o0 = C7298i.m21930a(this.f7060u, C2505s.this.f6855Q0, C2505s.this.f6834J0);
            this.f7051p0 = C7247b.m21853a(this.f7002I);
            this.f7053q0 = C7241f.m21850a(C2505s.this.f6882Z0, C2505s.this.f6877X1, C2505s.this.f6823F1, C2505s.this.f6930l1, this.f7070z, this.f7015V, this.f7003J, this.f7051p0);
            this.f7055r0 = C11894b.m38127b(C3146a.m11015a(this.f7015V, this.f7049o0, C2505s.this.f6940o, C2505s.this.f6871V1));
            this.f7057s0 = C10615f.m33344a(C2505s.this.f6904f, this.f7002I, this.f7003J);
            this.f7059t0 = C7289c.m21908a(C2505s.this.f6932m);
            this.f7061u0 = C7306q.m21943a(this.f7057s0, this.f7049o0, this.f7059t0);
            this.f7063v0 = C11901g.m38136a(C2813l.m10490a(this.f7002I, this.f7003J));
            this.f7065w0 = C11901g.m38136a(C7911z.m23127a(C2505s.this.f6827H, this.f7003J));
            this.f7067x0 = C11901g.m38136a(C3440f.m11732a(C2505s.this.f6922j1));
        }

        /* renamed from: c */
        private MainActivity m9464c(MainActivity mainActivity) {
            C11884c.m38116a(mainActivity, m9497o());
            C5737c.m18667a(mainActivity, C3581x.m12049a());
            C6172s.m19619a(mainActivity, (C0741y) m9517y());
            C6172s.m19625a(mainActivity, (C7536a) C2505s.this.m9239U0());
            C6172s.m19623a(mainActivity, m9499p());
            C6172s.m19626a(mainActivity, C11894b.m38125a(this.f7015V));
            C6172s.m19622a(mainActivity, (C3517b) C2505s.this.f6961t0.get());
            C6172s.m19620a(mainActivity, (MainActivityBackgroundResponder) this.f7055r0.get());
            C6172s.m19624a(mainActivity, Optional.m32791c(C2505s.this.f6820E1.get()));
            C6172s.m19621a(mainActivity, m9470e());
            C6172s.m19627a(mainActivity, this.f7062v);
            return mainActivity;
        }

        /* renamed from: a */
        public void mo11603a(MainActivity mainActivity) {
            m9464c(mainActivity);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.app.s$l */
    /* compiled from: DaggerTvAppComponent */
    private static final class C2667l<T> implements Provider<Optional<T>> {

        /* renamed from: a */
        private final Provider<T> f7382a;

        private C2667l(Provider<T> provider) {
            C11897e.m38129a(provider);
            this.f7382a = provider;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static <T> Provider<Optional<T>> m10240b(Provider<T> provider) {
            return new C2667l(provider);
        }

        public Optional<T> get() {
            return Optional.m32791c(this.f7382a.get());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.app.s$m */
    /* compiled from: DaggerTvAppComponent */
    private final class C2668m implements C6546a {
        private C2668m() {
        }

        /* synthetic */ C2668m(C2505s sVar, C2506a aVar) {
            this();
        }

        /* renamed from: a */
        public C6545i mo11605a(TvPlaybackActivity tvPlaybackActivity) {
            C11897e.m38129a(tvPlaybackActivity);
            return new C2669n(C2505s.this, tvPlaybackActivity, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.app.s$n */
    /* compiled from: DaggerTvAppComponent */
    private final class C2669n implements C6545i {

        /* renamed from: A */
        private Provider<C6510e> f7384A;

        /* renamed from: B */
        private Provider<C6342f> f7385B;

        /* renamed from: C */
        private Provider<C7285b> f7386C;

        /* renamed from: D */
        private Provider<C7284a> f7387D;

        /* renamed from: E */
        private Provider<C6410j> f7388E;

        /* renamed from: F */
        private Provider<C6498f> f7389F;

        /* renamed from: G */
        private Provider<C5773a> f7390G;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final TvPlaybackActivity f7392a;

        /* renamed from: b */
        private Provider<C7553a> f7393b;

        /* renamed from: c */
        private Provider<C7557a> f7394c;

        /* renamed from: d */
        private Provider<C6540a> f7395d;

        /* renamed from: e */
        private Provider<TvPlaybackActivity> f7396e;

        /* renamed from: f */
        private Provider<C6512a> f7397f;

        /* renamed from: g */
        private Provider<C6577a> f7398g;

        /* renamed from: h */
        private Provider<C6581c> f7399h;

        /* renamed from: i */
        private Provider<C6507c> f7400i;

        /* renamed from: j */
        private Provider<C5390g0> f7401j;

        /* renamed from: k */
        private Provider<Set<C2435d>> f7402k;

        /* renamed from: l */
        private Provider<C6381a> f7403l;

        /* renamed from: m */
        private Provider<C6384c> f7404m;

        /* renamed from: n */
        private Provider<C4922v2> f7405n;

        /* renamed from: o */
        private Provider<C5562f> f7406o;

        /* renamed from: p */
        private Provider<C3796d> f7407p;

        /* renamed from: q */
        private Provider<Optional<C3796d>> f7408q;

        /* renamed from: r */
        private Provider<C3727b> f7409r;

        /* renamed from: s */
        private Provider<PlayableQueryAction> f7410s;

        /* renamed from: t */
        private Provider<UpNextQueryActionImpl> f7411t;

        /* renamed from: u */
        private Provider<C6391e> f7412u;

        /* renamed from: v */
        private Provider<C6394h> f7413v;

        /* renamed from: w */
        private Provider<Optional<StreamingPreferences>> f7414w;

        /* renamed from: x */
        private Provider<C6439c> f7415x;

        /* renamed from: y */
        private Provider<C6427a> f7416y;

        /* renamed from: z */
        private Provider<C6453d> f7417z;

        /* renamed from: com.bamtechmedia.dominguez.app.s$n$a */
        /* compiled from: DaggerTvAppComponent */
        class C2670a implements Provider<C7553a> {
            C2670a() {
            }

            public C7553a get() {
                return new C2673d(C2669n.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$n$b */
        /* compiled from: DaggerTvAppComponent */
        class C2671b implements Provider<C7557a> {
            C2671b() {
            }

            public C7557a get() {
                return new C2675f(C2669n.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$n$c */
        /* compiled from: DaggerTvAppComponent */
        class C2672c implements Provider<C6540a> {
            C2672c() {
            }

            public C6540a get() {
                return new C2677h(C2669n.this, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$n$d */
        /* compiled from: DaggerTvAppComponent */
        private final class C2673d implements C7553a {
            private C2673d() {
            }

            /* synthetic */ C2673d(C2669n nVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C7552l mo11605a(C7582a aVar) {
                C11897e.m38129a(aVar);
                return new C2674e(C2669n.this, aVar, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$n$e */
        /* compiled from: DaggerTvAppComponent */
        private final class C2674e implements C7552l {
            /* synthetic */ C2674e(C2669n nVar, C7582a aVar, C2506a aVar2) {
                this(aVar);
            }

            /* renamed from: b */
            private C7582a m10282b(C7582a aVar) {
                C11886e.m38117a(aVar, C2669n.this.m10257f());
                return aVar;
            }

            private C2674e(C7582a aVar) {
            }

            /* renamed from: a */
            public void mo11603a(C7582a aVar) {
                m10282b(aVar);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$n$f */
        /* compiled from: DaggerTvAppComponent */
        private final class C2675f implements C7557a {
            private C2675f() {
            }

            /* synthetic */ C2675f(C2669n nVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C7556o mo11605a(C6056a aVar) {
                C11897e.m38129a(aVar);
                return new C2676g(C2669n.this, aVar, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$n$g */
        /* compiled from: DaggerTvAppComponent */
        private final class C2676g implements C7556o {
            /* synthetic */ C2676g(C2669n nVar, C6056a aVar, C2506a aVar2) {
                this(aVar);
            }

            /* renamed from: b */
            private C6056a m10288b(C6056a aVar) {
                C11886e.m38117a(aVar, C2669n.this.m10257f());
                C6061b.m19421a(aVar, (C2334a) C2505s.this.f6854Q.get());
                C6061b.m19422a(aVar, m10287a());
                return aVar;
            }

            private C2676g(C6056a aVar) {
            }

            /* renamed from: a */
            private C7542e m10287a() {
                return new C7542e((C2348e) C2505s.this.f6855Q0.get());
            }

            /* renamed from: a */
            public void mo11603a(C6056a aVar) {
                m10288b(aVar);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$n$h */
        /* compiled from: DaggerTvAppComponent */
        private final class C2677h implements C6540a {
            private C2677h() {
            }

            /* synthetic */ C2677h(C2669n nVar, C2506a aVar) {
                this();
            }

            /* renamed from: a */
            public C6539d mo11605a(C6561b bVar) {
                C11897e.m38129a(bVar);
                return new C2678i(C2669n.this, bVar, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.app.s$n$i */
        /* compiled from: DaggerTvAppComponent */
        private final class C2678i implements C6539d {

            /* renamed from: a */
            private final C6561b f7426a;

            /* synthetic */ C2678i(C2669n nVar, C6561b bVar, C2506a aVar) {
                this(bVar);
            }

            /* renamed from: b */
            private Observable<C5291e> m10295b() {
                return C6541e.m20364a(C2669n.this.f7392a);
            }

            /* renamed from: c */
            private PlaybackAudioAndSubtitlesPresenter m10296c() {
                return new PlaybackAudioAndSubtitlesPresenter(m10295b(), this.f7426a, (C6667g1) C2505s.this.f6869V.get(), C2505s.this.m9255Z());
            }

            private C2678i(C6561b bVar) {
                this.f7426a = bVar;
            }

            /* renamed from: a */
            private C3432o m10293a() {
                return new C3432o(new C5758a(), (C3441g) C2505s.this.f6891b2.get());
            }

            /* renamed from: b */
            private C6561b m10294b(C6561b bVar) {
                C11886e.m38117a(bVar, C2669n.this.m10257f());
                C6314b.m19885a((C6312a) bVar, m10296c());
                C6314b.m19882a((C6312a) bVar, (OnDismissListener) C2669n.this.f7392a);
                C6314b.m19883a((C6312a) bVar, (OnShowListener) C2669n.this.f7392a);
                C6314b.m19884a((C6312a) bVar, m10293a());
                return bVar;
            }

            /* renamed from: a */
            public void mo11603a(C6561b bVar) {
                m10294b(bVar);
            }
        }

        /* synthetic */ C2669n(C2505s sVar, TvPlaybackActivity tvPlaybackActivity, C2506a aVar) {
            this(tvPlaybackActivity);
        }

        /* renamed from: A */
        private C6410j m10243A() {
            C6410j jVar = new C6410j((C2348e) C2505s.this.f6855Q0.get(), (C2476z) C2505s.this.f6957s0.get(), C2505s.this.m9376x(), C5872f.m18926b(), new C6250g());
            return jVar;
        }

        /* renamed from: B */
        private C6510e m10244B() {
            return new C6510e(C2505s.this.m9301i());
        }

        /* renamed from: C */
        private UpNextQueryActionImpl m10245C() {
            return new UpNextQueryActionImpl(m10258g());
        }

        /* renamed from: D */
        private C6531b m10246D() {
            return new C6531b(m10248a(), C5873g.m18928b());
        }

        /* renamed from: E */
        private C6342f m10247E() {
            return C6553p.m20386a((C0532d) this.f7392a, m10266o(), (C3712b) m10245C(), (C6507c) this.f7400i.get(), m10272u(), m10274w(), m10259h(), m10271t(), m10250b(), (C6667g1) C2505s.this.f6869V.get(), m10244B());
        }

        /* renamed from: c */
        private C6494b m10253c() {
            return new C6494b(m10247E());
        }

        /* renamed from: d */
        private ContentRatingPresenter m10255d() {
            ContentRatingPresenter contentRatingPresenter = new ContentRatingPresenter(C2505s.this.m9383y0(), (C3716q) C2505s.this.f6838K1.get(), C2505s.this.m9323m0(), (C3572r0) C2505s.this.f6901e0.get(), C5873g.m18928b());
            return contentRatingPresenter;
        }

        /* renamed from: e */
        private C7548i m10256e() {
            return new C7548i((C5773a) this.f7390G.get(), C7555n.m22518b());
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public C11876f<Object> m10257f() {
            return C11878g.m38111a(m10262k(), C10387h.m32863d());
        }

        /* renamed from: g */
        private C3727b m10258g() {
            C3727b bVar = new C3727b(C2505s.this.m9167D0(), Optional.m32791c(m10264m()), C2505s.this.f6824G, C2505s.this.m9230S0(), C2505s.this.m9215O0(), C2505s.this.m9172E0());
            return bVar;
        }

        /* renamed from: h */
        private C6427a m10259h() {
            return new C6427a(C2505s.this.m9321m(), C2505s.this.m9346r());
        }

        /* renamed from: i */
        private C0722m m10260i() {
            return C6551n.m20384a(this.f7392a);
        }

        /* renamed from: j */
        private LocalBookmarksMarker m10261j() {
            return new LocalBookmarksMarker((C3165c) C2505s.this.f6886a1.get(), C5871e.m18924b());
        }

        /* renamed from: k */
        private Map<Class<?>, Provider<C11872a<?>>> m10262k() {
            C10388a a = C10387h.m32860a(7);
            a.mo27182a(DeletedProgramBroadcastReceiver.class, C2505s.this.f6888b);
            a.mo27182a(LegalCenterFragment.class, C2505s.this.f6892c);
            a.mo27182a(MainActivity.class, C2505s.this.f6896d);
            a.mo27182a(TvPlaybackActivity.class, C2505s.this.f6900e);
            a.mo27182a(C7582a.class, this.f7393b);
            a.mo27182a(C6056a.class, this.f7394c);
            a.mo27182a(C6561b.class, this.f7395d);
            return a.mo27183a();
        }

        /* renamed from: l */
        private C5562f m10263l() {
            return new C5562f(C2505s.this.f6908g);
        }

        /* renamed from: m */
        private C3796d m10264m() {
            return C5567i.m18372a((C0532d) this.f7392a, (C3585a) C2505s.this.m9160C(), (C5765a) C2505s.this.f6940o.get(), new C5568j(), m10263l(), C5871e.m18924b());
        }

        /* renamed from: n */
        private C6374a m10265n() {
            return new C6374a(C2505s.this.f6884a, (C3572r0) C2505s.this.f6901e0.get());
        }

        /* renamed from: o */
        private PlayableQueryAction m10266o() {
            return new PlayableQueryAction(m10258g());
        }

        /* renamed from: p */
        private PlaybackActivityBackgroundResponder m10267p() {
            PlaybackActivityBackgroundResponder playbackActivityBackgroundResponder = new PlaybackActivityBackgroundResponder(this.f7392a, (C5765a) C2505s.this.f6940o.get(), C6133i.m19550a(), m10248a(), (C6384c) this.f7404m.get());
            return playbackActivityBackgroundResponder;
        }

        /* renamed from: q */
        private C6391e m10268q() {
            return new C6391e((C2348e) C2505s.this.f6855Q0.get(), (C2436p) C2505s.this.f6863T.get(), (C2476z) C2505s.this.f6957s0.get());
        }

        /* renamed from: r */
        private C6421a m10269r() {
            return C6552o.m20385a(this.f7392a, m10248a(), (C4922v2) this.f7405n.get(), C2505s.this.m9344q0(), m10260i(), m10275x(), (SharedPreferences) C2505s.this.f6944p.get());
        }

        /* renamed from: s */
        private C6448b m10270s() {
            return new C6448b(m10271t(), m10256e(), C2505s.this.m9344q0());
        }

        /* renamed from: t */
        private C6453d m10271t() {
            return new C6453d((C7614e) C2505s.this.f6973w1.get(), (C3572r0) C2505s.this.f6901e0.get());
        }

        /* renamed from: u */
        private C6394h m10272u() {
            return new C6394h(m10268q());
        }

        /* renamed from: v */
        private C6434a m10273v() {
            return new C6434a(C2505s.this.m9303i0(), C2505s.this.f6884a, C5872f.m18926b());
        }

        /* renamed from: w */
        private C6439c m10274w() {
            C6439c cVar = new C6439c(C2505s.this.m9274c0(), (C6384c) this.f7404m.get(), C2505s.this.m9348r0(), Optional.m32792d(), C2505s.this.m9371w(), C2505s.this.m9216P(), m10268q(), (C3165c) C2505s.this.f6886a1.get(), C2505s.this.m9344q0(), C5873g.m18928b(), C5872f.m18926b());
            return cVar;
        }

        /* renamed from: x */
        private C6425d m10275x() {
            return new C6425d(C2505s.this.m9371w(), C2505s.this.m9344q0());
        }

        /* renamed from: y */
        private C6414a m10276y() {
            return new C6414a(this.f7392a, C2505s.this.m9383y0(), (C3572r0) C2505s.this.f6901e0.get());
        }

        /* renamed from: z */
        private C6496d m10277z() {
            return new C6496d(m10247E());
        }

        private C2669n(TvPlaybackActivity tvPlaybackActivity) {
            this.f7392a = tvPlaybackActivity;
            m10252b(tvPlaybackActivity);
        }

        /* renamed from: b */
        private C6512a m10250b() {
            return C6549l.m20380a((C0532d) this.f7392a, C2505s.this.m9344q0());
        }

        /* renamed from: c */
        private TvPlaybackActivity m10254c(TvPlaybackActivity tvPlaybackActivity) {
            C11884c.m38116a(tvPlaybackActivity, m10257f());
            C5737c.m18667a(tvPlaybackActivity, C3581x.m12049a());
            C6530a.m20336a(tvPlaybackActivity, m10247E());
            C6530a.m20342a(tvPlaybackActivity, m10269r());
            C6530a.m20349a(tvPlaybackActivity, m10246D());
            C6530a.m20341a(tvPlaybackActivity, m10276y());
            C6530a.m20335a(tvPlaybackActivity, m10255d());
            C6530a.m20345a(tvPlaybackActivity, (C6493a) m10253c());
            C6530a.m20334a(tvPlaybackActivity, m10267p());
            C6530a.m20331a(tvPlaybackActivity, (C3572r0) C2505s.this.f6901e0.get());
            C6530a.m20347a(tvPlaybackActivity, (C6497e) this.f7389F.get());
            C6530a.m20340a(tvPlaybackActivity, m10243A());
            C6530a.m20332a(tvPlaybackActivity, (C3716q) C2505s.this.f6838K1.get());
            C6530a.m20333a(tvPlaybackActivity, (C3850c) C2505s.this.f6903e2.get());
            C6530a.m20346a(tvPlaybackActivity, (C6495c) m10277z());
            C6530a.m20339a(tvPlaybackActivity, m10268q());
            C6530a.m20348a(tvPlaybackActivity, m10261j());
            C6530a.m20344a(tvPlaybackActivity, m10270s());
            C6530a.m20343a(tvPlaybackActivity, m10273v());
            C6530a.m20337a(tvPlaybackActivity, m10265n());
            C6530a.m20338a(tvPlaybackActivity, (C6384c) this.f7404m.get());
            return tvPlaybackActivity;
        }

        /* renamed from: a */
        private C5273h m10248a() {
            return C6554q.m20388a(this.f7392a);
        }

        /* renamed from: b */
        private void m10252b(TvPlaybackActivity tvPlaybackActivity) {
            this.f7393b = new C2670a();
            this.f7394c = new C2671b();
            this.f7395d = new C2672c();
            this.f7396e = C11896d.m38128a(tvPlaybackActivity);
            this.f7397f = C6549l.m20381a(this.f7396e, C2505s.this.f6923j2);
            this.f7398g = C6580b.m20468a(C2505s.this.f6919i2, this.f7397f);
            this.f7399h = C6583d.m20474a(this.f7398g);
            this.f7400i = C11901g.m38136a(this.f7399h);
            this.f7401j = C5396h0.m18143a(C2505s.this.f6927k2);
            C11900b a = C11898f.m38133a(3, 0);
            a.mo30024a(this.f7401j);
            a.mo30024a(C2505s.this.f6807A0);
            a.mo30024a(C2395j.m8938a());
            this.f7402k = a.mo30025a();
            this.f7403l = C6383b.m20004a(C2505s.this.f6932m, C2505s.this.f6924k);
            this.f7404m = C11894b.m38127b(C6555r.m20390a(this.f7402k, this.f7403l, C2505s.this.f6923j2, C2505s.this.f6904f));
            this.f7405n = C11894b.m38127b(C6550m.m20382a());
            this.f7406o = C5565g.m18369a(C2505s.this.f6908g);
            this.f7407p = C5567i.m18373a(this.f7396e, C2505s.this.f6936n, C2505s.this.f6940o, (Provider<C5568j>) C5569k.m18379a(), this.f7406o, (Provider<C11969r>) C5871e.m18923a());
            this.f7408q = C2667l.m10240b(this.f7407p);
            this.f7409r = C3731c.m12672a(C2505s.this.f6815D, this.f7408q, C2505s.this.f6824G, C2505s.this.f6830I, C2505s.this.f6872W, C2505s.this.f6833J);
            this.f7410s = C6294a.m19835a(this.f7409r);
            this.f7411t = C3713c.m12619a(this.f7409r);
            this.f7412u = C6392f.m20039a(C2505s.this.f6855Q0, C2505s.this.f6863T, C2505s.this.f6957s0);
            this.f7413v = C6409i.m20059a(this.f7412u);
            this.f7414w = C2505s.m9257a();
            this.f7415x = C6446e.m20129a(C2505s.this.f6931l2, this.f7404m, C2505s.this.f6935m2, this.f7414w, C2505s.this.f6939n2, C2505s.this.f6943o2, this.f7412u, C2505s.this.f6886a1, C2505s.this.f6923j2, C5873g.m18927a(), C5872f.m18925a());
            this.f7416y = C6433b.m20102a(C2505s.this.f6959s2, C2505s.this.f6963t2);
            this.f7417z = C6454e.m20142a(C2505s.this.f6973w1, C2505s.this.f6901e0);
            this.f7384A = C6511f.m20258a(C2505s.this.f6932m);
            this.f7385B = C6553p.m20387a(this.f7396e, this.f7410s, this.f7411t, this.f7400i, this.f7413v, this.f7415x, this.f7416y, this.f7417z, this.f7397f, C2505s.this.f6869V, this.f7384A);
            this.f7386C = C11901g.m38136a(C6585f.m20476a());
            this.f7387D = C11901g.m38136a(C6585f.m20476a());
            this.f7388E = C6413k.m20066a(C2505s.this.f6855Q0, C2505s.this.f6957s0, C2505s.this.f6967u2, C5872f.m18925a(), C6251h.m19739a());
            this.f7389F = C11901g.m38136a(C6499g.m20246a(this.f7385B, this.f7386C, this.f7387D, this.f7415x, this.f7416y, this.f7388E, C2505s.this.f6869V));
            this.f7390G = C11901g.m38136a(C6547j.m20370a(this.f7396e));
        }

        /* renamed from: a */
        public void mo11603a(TvPlaybackActivity tvPlaybackActivity) {
            m10254c(tvPlaybackActivity);
        }
    }

    /* synthetic */ C2505s(C2481a aVar, C2506a aVar2) {
        this(aVar);
    }

    private C2505s(C2481a aVar) {
        this.f6884a = aVar;
        m9259a(aVar);
        m9267b(aVar);
    }

    /* renamed from: A */
    private C3768d m9150A() {
        return new C3768d(m9379x0(), m9386z(), Optional.m32792d());
    }

    /* renamed from: A0 */
    private C7163h m9152A0() {
        return new C7163h(C11894b.m38125a(this.f6929l0));
    }

    /* renamed from: B */
    private C3232c m9156B() {
        return new C3232c(m9367v(), m9150A(), m9316l(), (C3678l) this.f6894c1.get());
    }

    /* renamed from: B0 */
    private C7169j m9157B0() {
        return new C7169j(this.f6884a, m9248X());
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public C3586b m9160C() {
        return new C3586b(m9301i());
    }

    /* renamed from: C0 */
    private C7178a0 m9162C0() {
        return new C7178a0((C7195c0) this.f6968v.get(), m9182G0(), (C7141a) this.f6809B.get());
    }

    /* renamed from: D */
    private C2502r m9165D() {
        C2502r rVar = new C2502r((SharedPreferences) this.f6944p.get(), m9152A0(), C3574s.m12038a(), m9364u0(), (C4793a) this.f6965u0.get(), m9341q());
        return rVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: D0 */
    public SearchApi m9167D0() {
        return C7209h.m21809a((C7234z) m9162C0());
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public C5398i0 m9170E() {
        return new C5398i0(m9210N0(), m9206M0(), m9276d());
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public C3741f m9172E0() {
        return new C3741f(m9301i());
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public C6906a m9175F() {
        return new C6906a(m9204M(), m9269b0(), (C6667g1) this.f6869V.get(), C5873g.m18928b());
    }

    /* renamed from: F0 */
    private SentryConfigSetup m9177F0() {
        return new SentryConfigSetup(this.f6884a, m9198K0(), (C2686z) this.f6933m0.get());
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public C7252a m9180G() {
        return new C7252a(m9301i(), m9341q());
    }

    /* renamed from: G0 */
    private C6237h m9182G0() {
        return new C6237h((C6234e) this.f6980z.get());
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public CustomContentApi m9184H() {
        return C7210i.m21811a(m9162C0());
    }

    /* renamed from: H0 */
    private SessionStateObserver m9186H0() {
        return new SessionStateObserver(m9202L0(), m9182G0());
    }

    /* renamed from: I */
    private C6928g m9188I() {
        return new C6928g(m9269b0());
    }

    /* renamed from: I0 */
    private Set<C3824a> m9190I0() {
        return ImmutableSet.m32842a(m9311k(), m9165D(), m9296h(), m9252Y(), m9326n(), m9351s(), new C3824a[0]);
    }

    /* renamed from: J */
    private C3217b m9192J() {
        return new C3217b(this.f6884a, m9359t0());
    }

    /* renamed from: J0 */
    private Set<WorkerFactory> m9194J0() {
        return ImmutableSet.m32841a(m9223Q0(), m9226R0(), m9244W(), m9235T0());
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public DefaultLegalApi m9196K() {
        DefaultLegalApi defaultLegalApi = new DefaultLegalApi(m9278d0(), m9170E(), (OkHttpClient) this.f6908g.get(), this.f6975x0, C2494j.m9130b());
        return defaultLegalApi;
    }

    /* access modifiers changed from: private */
    /* renamed from: K0 */
    public Single<C3524e> m9198K0() {
        return C3571r.m12030a((AppConfigRepository) this.f6928l.get());
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public C3222b m9201L() {
        return new C3222b((SharedPreferences) this.f6898d1.get());
    }

    /* access modifiers changed from: private */
    /* renamed from: L0 */
    public Single<Session> m9202L0() {
        return C7212k.m21815a((C7195c0) this.f6968v.get());
    }

    /* renamed from: M */
    private C7023a m9204M() {
        return new C7023a(this.f6884a);
    }

    /* access modifiers changed from: private */
    /* renamed from: M0 */
    public Single<SessionInfo> m9206M0() {
        return C7211j.m21813a((C7195c0) this.f6968v.get());
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public C11876f<Object> m9209N() {
        return C11878g.m38111a(m9284e0(), C10387h.m32863d());
    }

    /* renamed from: N0 */
    private Single<SessionState> m9210N0() {
        return C7213l.m21817a((C7195c0) this.f6968v.get());
    }

    /* renamed from: O */
    private C3829e m9212O() {
        return C3827c.m12915a(m9190I0());
    }

    /* access modifiers changed from: private */
    /* renamed from: O0 */
    public C3743h m9215O0() {
        C3743h hVar = new C3743h(m9172E0(), m9206M0(), (C6667g1) this.f6869V.get(), this.f6908g, C2494j.m9129a());
        return hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public DisplayMetrics m9216P() {
        return C2500p.m9141a(m9383y0());
    }

    /* access modifiers changed from: private */
    /* renamed from: P0 */
    public SubscriptionApi m9218P0() {
        return C7214m.m21818a((C7234z) m9162C0());
    }

    /* renamed from: Q */
    private C3727b m9220Q() {
        C3727b bVar = new C3727b(m9167D0(), Optional.m32792d(), this.f6824G, m9230S0(), m9215O0(), m9172E0());
        return bVar;
    }

    /* renamed from: Q0 */
    private C3241b m9223Q0() {
        return new C3241b(m9289f0(), m9294g0(), m9359t0(), m9361u());
    }

    /* renamed from: R */
    private C6932k m9224R() {
        return new C6932k(m9269b0());
    }

    /* renamed from: R0 */
    private C3246a m9226R0() {
        return new C3246a(m9156B(), m9359t0(), m9361u());
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public C11848c<C11863k> m9228S() {
        return C5868b.m18917a((C7912a) this.f6902e1.get());
    }

    /* access modifiers changed from: private */
    /* renamed from: S0 */
    public C3751k m9230S0() {
        return new C3751k(m9308j0());
    }

    /* renamed from: T */
    private C3243c m9232T() {
        return new C3243c(C2498n.m9137a());
    }

    /* renamed from: T0 */
    private C7113a m9235T0() {
        return new C7113a(this.f6925k0);
    }

    /* renamed from: U */
    private C3247b m9236U() {
        return new C3247b(C2498n.m9137a());
    }

    /* access modifiers changed from: private */
    /* renamed from: U0 */
    public C6199m m9239U0() {
        C6199m mVar = new C6199m((C3517b) this.f6961t0.get(), this.f6884a, m9341q(), (C6234e) this.f6980z.get(), (SharedPreferences) this.f6944p.get());
        return mVar;
    }

    /* renamed from: V */
    private C3238b m9240V() {
        return new C3238b(C2498n.m9137a());
    }

    /* renamed from: V0 */
    private C3219c m9242V0() {
        return new C3219c(this.f6884a, m9359t0());
    }

    /* renamed from: W */
    private C3237a m9244W() {
        return new C3237a(m9192J(), m9242V0(), m9359t0(), m9361u());
    }

    /* renamed from: W0 */
    private C3235f m9246W0() {
        return new C3235f(m9367v(), m9150A(), m9316l(), (C3678l) this.f6894c1.get());
    }

    /* renamed from: X */
    private C7172c m9248X() {
        return new C7172c((C3572r0) this.f6901e0.get(), m9388z0());
    }

    /* renamed from: Y */
    private C5369b m9252Y() {
        return new C5369b((C5368a) this.f6861S0.get());
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public boolean m9255Z() {
        return C2483b.m9110e(this.f6884a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public C3552i0 m9261a0() {
        return C3579v.m12046a((C6063a) this.f6907f2.get(), C3550h0.m11978a(), this.f6911g2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public C6913e m9269b0() {
        return new C6913e(m9314k0());
    }

    /* renamed from: c */
    public static C2487a m9271c() {
        return new C2510e(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public C7217p m9274c0() {
        return new C7217p((C7195c0) this.f6968v.get());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public AccountApi m9276d() {
        return C7204d.m21800a((C7234z) m9162C0());
    }

    /* renamed from: d0 */
    private LegalApiConfig m9278d0() {
        return FeatureLegalModule_ProvideLegalApiConfigFactory.provideLegalApiConfig(this.f6884a);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C5437v m9281e() {
        return new C5437v(m9308j0());
    }

    /* renamed from: e0 */
    private Map<Class<?>, Provider<C11872a<?>>> m9284e0() {
        return C10387h.m32862a(DeletedProgramBroadcastReceiver.class, this.f6888b, LegalCenterFragment.class, this.f6892c, MainActivity.class, this.f6896d, TvPlaybackActivity.class, this.f6900e);
    }

    /* renamed from: f */
    private ActivityManager m9286f() {
        return C2485c.m9113a((Context) this.f6884a);
    }

    /* renamed from: f0 */
    private Map<String, C3216a> m9289f0() {
        return C10387h.m32861a("default_channel", m9192J(), "watchlist_channel", m9242V0());
    }

    /* renamed from: g */
    private AnalyticsBackgroundResponder m9291g() {
        return new AnalyticsBackgroundResponder(C11894b.m38125a(this.f6855Q0), (C5765a) this.f6940o.get());
    }

    /* renamed from: g0 */
    private Map<String, C3233d> m9294g0() {
        return C10387h.m32861a("default_channel", m9373w0(), "watchlist_channel", m9246W0());
    }

    /* renamed from: h */
    private C2370k m9296h() {
        C2370k kVar = new C2370k(m9291g(), new C2373l(), m9333o0(), m9341q(), m9255Z());
        return kVar;
    }

    /* renamed from: h0 */
    private C7223r m9298h0() {
        return new C7223r(m9301i(), (C5862q0) this.f6956s.get());
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public C3524e m9301i() {
        return C3569q.m12027a((AppConfigRepository) this.f6928l.get());
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public MediaCapabilitiesProvider m9303i0() {
        return C7208g.m21807a((Context) this.f6884a, m9298h0());
    }

    /* renamed from: j */
    private AppLaunchAnalyticsLifecycleObserver m9306j() {
        AppLaunchAnalyticsLifecycleObserver appLaunchAnalyticsLifecycleObserver = new AppLaunchAnalyticsLifecycleObserver((C2476z) this.f6957s0.get(), m9341q(), m9239U0(), m9218P0(), C5872f.m18926b());
        return appLaunchAnalyticsLifecycleObserver;
    }

    /* renamed from: j0 */
    private SharedPreferences m9308j0() {
        return C2490f.m9121a((Context) this.f6884a);
    }

    /* renamed from: k */
    private C5771c m9311k() {
        return new C5771c((C5765a) this.f6940o.get());
    }

    /* renamed from: k0 */
    private C3572r0 m9314k0() {
        return C3580w.m12047a((C6072g) this.f6897d0.get());
    }

    /* renamed from: l */
    private C3225a m9316l() {
        return new C3225a(m9157B0());
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public C3572r0 m9318l0() {
        return C3583z.m12052a((C6072g) this.f6897d0.get());
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public C6919c m9321m() {
        C6919c cVar = new C6919c((C6667g1) this.f6869V.get(), m9204M(), new C6930i(), m9354s0(), new C6939r(), m9188I(), m9224R());
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public C3572r0 m9323m0() {
        return C3521c0.m11929a((C6072g) this.f6897d0.get());
    }

    /* renamed from: n */
    private C2851s m9326n() {
        return new C2851s(m9186H0());
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public C7864d m9329n0() {
        return new C7864d(m9383y0(), this.f6826G1, (C7159g) this.f6929l0.get(), C5872f.m18926b());
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public C6632a m9332o() {
        return C6866v.m21043a((ProfilesDatabase) this.f6839L.get());
    }

    /* renamed from: o0 */
    private C2345c0 m9333o0() {
        return new C2345c0(C11894b.m38125a(this.f6858R0));
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public BamIdentityApi m9336p() {
        return C7206e.m21803a((C7234z) m9162C0());
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public C7874g m9339p0() {
        return new C7874g(m9301i(), m9341q());
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public BuildInfo m9341q() {
        return C2488d.m9118a(this.f6884a);
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public C6266a m9344q0() {
        C6266a aVar = new C6266a(m9301i(), (C5862q0) this.f6956s.get(), m9286f(), m9341q(), (C3577a) this.f6899d2.get());
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public C6924e m9346r() {
        C6924e eVar = new C6924e((C6667g1) this.f6869V.get(), m9269b0(), new C6945x(), new C6937p(), new C6943v(), new C6934m());
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public C6423b m9348r0() {
        return new C6423b((C5862q0) this.f6956s.get(), m9344q0());
    }

    /* renamed from: s */
    private C3215c m9351s() {
        return new C3215c(m9356t());
    }

    /* renamed from: s0 */
    private C6941t m9354s0() {
        return new C6941t(m9269b0());
    }

    /* renamed from: t */
    private ChannelLifecycleObserver m9356t() {
        return new ChannelLifecycleObserver((C3419l) this.f6864T0.get(), m9361u(), C5872f.m18926b(), C5873g.m18928b());
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public C4342e m9359t0() {
        return C3209e.m11161a(this.f6884a);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public C3204a m9361u() {
        return new C3204a(this.f6884a, m9232T(), m9236U(), m9240V());
    }

    /* renamed from: u0 */
    private Set<C0721l> m9364u0() {
        return ImmutableSet.m32839a(m9177F0(), m9306j());
    }

    /* renamed from: v */
    private C3663f m9367v() {
        return new C3663f(m9220Q(), (C3660c) this.f6867U0.get());
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public C2464m m9368v0() {
        return new C2464m((SharedPreferences) this.f6810B0.get());
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public ConnectivityManager m9371w() {
        return C2489e.m9119a((Context) this.f6884a);
    }

    /* renamed from: w0 */
    private C3234e m9373w0() {
        return new C3234e(m9367v(), m9150A(), m9316l(), (C3678l) this.f6894c1.get());
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public C3629d m9376x() {
        return new C3629d((C3572r0) this.f6901e0.get());
    }

    /* renamed from: x0 */
    private RemoteContentSetDataSource m9379x0() {
        return new RemoteContentSetDataSource(m9220Q(), (C3776f) this.f6873W0.get(), (C3165c) this.f6886a1.get());
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public C5948c m9382y() {
        return new C5948c(m9301i(), Optional.m32792d());
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public Resources m9383y0() {
        return C2497m.m9135a((Context) this.f6884a);
    }

    /* renamed from: z */
    private C3762a m9386z() {
        return new C3762a(this.f6884a, Optional.m32792d(), (C6667g1) this.f6869V.get());
    }

    /* renamed from: z0 */
    private C7152e m9388z0() {
        return new C7152e(m9301i());
    }

    /* renamed from: a */
    private void m9259a(C2481a aVar) {
        this.f6888b = new C2506a();
        this.f6892c = new C2507b();
        this.f6896d = new C2508c();
        this.f6900e = new C2509d();
        this.f6904f = C11896d.m38128a(aVar);
        this.f6908g = C11894b.m38127b(C2495k.m9131a(this.f6904f));
        this.f6912h = C5757b.m18687a(this.f6904f, C2494j.m9129a());
        this.f6916i = C3564n0.m12010a(this.f6904f);
        this.f6920j = C3551i.m11979a(this.f6908g, C2494j.m9129a(), this.f6912h, this.f6916i);
        this.f6924k = C2488d.m9117a(this.f6904f);
        this.f6928l = C11894b.m38127b(C3528f.m11943a(C2496l.m9133a(), this.f6920j, this.f6904f, this.f6924k));
        this.f6932m = C3569q.m12028a(this.f6928l);
        this.f6936n = C3590c.m12077a(this.f6932m);
        this.f6940o = C11894b.m38127b(C5770b.m18715a(this.f6936n));
        this.f6944p = C11901g.m38136a(C2499o.m9140a(this.f6904f));
        this.f6948q = C2497m.m9136a(this.f6904f);
        this.f6952r = C7227u.m21840a(C2494j.m9129a());
        this.f6956s = C11901g.m38136a(C5865r0.m18912a());
        this.f6960t = C7225s.m21839a(this.f6932m, this.f6956s);
        this.f6964u = C7208g.m21808a(this.f6904f, this.f6960t);
        this.f6968v = C11894b.m38127b(C7205d0.m21802a(this.f6904f, this.f6924k, C3516a0.m11917a(), this.f6952r, this.f6964u, C5872f.m18925a(), this.f6944p));
        this.f6971w = C7213l.m21816a(this.f6968v);
        this.f6974x = C6067d.m19437a(this.f6944p);
        this.f6977y = C6089m.m19483a(this.f6948q, this.f6974x);
        this.f6980z = C11894b.m38127b(C6236g.m19728a());
        this.f6806A = C6238i.m19731a(this.f6980z);
        this.f6809B = C11894b.m38127b(C7145b.m21679a());
        this.f6812C = C7193b0.m21772a(this.f6968v, this.f6806A, this.f6809B);
        this.f6815D = C7209h.m21810a(this.f6812C);
        this.f6818E = m9257a();
        this.f6821F = C11901g.m38136a(C2281l.m8713a(this.f6944p));
        this.f6824G = C2276i.m8706a(this.f6821F);
        this.f6827H = C2490f.m9122a(this.f6904f);
        this.f6830I = C3753l.m12705a(this.f6827H);
        this.f6833J = C3742g.m12682a(this.f6932m);
        this.f6836K = C7211j.m21812a(this.f6968v);
        this.f6839L = C11894b.m38127b(C6904x.m21110a(this.f6904f));
        this.f6842M = C6887w.m21089a(this.f6839L);
        this.f6845N = C6866v.m21044a(this.f6839L);
        this.f6848O = C7216o.m21823a(this.f6812C);
        this.f6851P = C6763p1.m20855a(this.f6848O);
        this.f6854Q = C11894b.m38127b(C2346d.m8849a());
        this.f6857R = C2368j.m8889a(this.f6932m);
        this.f6860S = C2468r.m9056a(this.f6904f, this.f6854Q, this.f6857R);
        this.f6863T = C11894b.m38127b(this.f6860S);
        this.f6866U = C6757o0.m20849a(this.f6932m);
        this.f6869V = C11901g.m38136a(C6718k1.m20775a(this.f6842M, this.f6845N, this.f6851P, this.f6863T, this.f6866U, C5872f.m18925a()));
        this.f6872W = C3748i.m12695a(this.f6833J, this.f6836K, this.f6869V, this.f6908g, C2494j.m9129a());
        this.f6875X = C3731c.m12672a(this.f6815D, this.f6818E, this.f6824G, this.f6830I, this.f6872W, this.f6833J);
        this.f6878Y = C3578u.m12044a(this.f6928l, this.f6924k);
        this.f6881Z = C6086k.m19473a(this.f6875X, this.f6878Y, this.f6924k);
        this.f6885a0 = C6071f.m19448a(this.f6881Z, this.f6912h);
        this.f6889b0 = C7024b.m21326a(this.f6904f);
        this.f6893c0 = C6912d.m21124a(this.f6889b0);
        this.f6897d0 = C11894b.m38127b(C6081i.m19465a(this.f6971w, this.f6977y, this.f6885a0, this.f6893c0, this.f6830I, C5872f.m18925a()));
        this.f6901e0 = C11901g.m38136a(C6093p.m19490a(this.f6948q, this.f6897d0));
        this.f6905f0 = C7158f.m21687a(this.f6932m);
        this.f6909g0 = C7174d.m21739a(this.f6901e0, this.f6905f0);
        this.f6913h0 = C7119b.m21520a(this.f6904f);
        this.f6917i0 = C7171b.m21735a(this.f6909g0, this.f6913h0);
        this.f6921j0 = C2485c.m9114a(this.f6904f);
        this.f6925k0 = C7127e.m21530a(this.f6913h0, this.f6908g, C5872f.m18925a());
        this.f6929l0 = C11901g.m38136a(C7138g.m21661a(this.f6904f, this.f6917i0, this.f6921j0, this.f6925k0, this.f6905f0, C5872f.m18925a()));
        this.f6933m0 = C11894b.m38127b(C2482a0.m9097a(C2484b0.m9112a()));
        this.f6937n0 = C2427d.m8987a(this.f6904f);
        this.f6941o0 = C7215n.m21821a(this.f6812C);
        this.f6945p0 = C2429f.m8989a(this.f6941o0);
        this.f6949q0 = C2492h.m9125a(this.f6904f);
        this.f6953r0 = C2403o.m8947a(this.f6904f, this.f6924k, this.f6949q0, C5872f.m18925a());
        this.f6957s0 = C11894b.m38127b(C2471u.m9066a(this.f6937n0, this.f6945p0, this.f6854Q, this.f6953r0, this.f6857R));
        this.f6961t0 = C11901g.m38136a(C3522d.m11930a(this.f6932m, this.f6924k));
        this.f6965u0 = C11901g.m38136a(C4794b.m16707a(this.f6901e0));
        this.f6969v0 = C11894b.m38127b(C2385d.m8922a(this.f6904f, C2494j.m9129a(), C5872f.m18925a()));
        this.f6972w0 = C2473w.m9070a(this.f6904f);
        this.f6975x0 = C3582y.m12050a(this.f6830I);
        this.f6978y0 = C2475y.m9074a(this.f6904f);
        this.f6981z0 = C2389f.m8933a(this.f6972w0, this.f6975x0, this.f6978y0, C5872f.m18925a());
        this.f6807A0 = C2412s.m8959a(this.f6836K, C5872f.m18925a());
        this.f6810B0 = C11901g.m38136a(C2474x.m9072a(this.f6904f));
        this.f6813C0 = C2463l.m9046a(this.f6810B0);
        this.f6816D0 = C2406q.m8953a(this.f6813C0, this.f6924k, C5872f.m18925a());
        this.f6819E0 = C2455f.m9028a(this.f6810B0);
        this.f6822F0 = C2382b.m8918a(this.f6819E0, C5872f.m18925a());
        this.f6825G0 = C2460j.m9034a(this.f6810B0);
        this.f6828H0 = C2466n.m9051a(this.f6810B0);
        this.f6831I0 = C2398l.m8942a(this.f6825G0, this.f6828H0, C5872f.m18925a());
        this.f6834J0 = C11894b.m38127b(C2457h.m9031a());
        this.f6837K0 = C2392h.m8936a(this.f6834J0, C5872f.m18925a());
        this.f6840L0 = C11894b.m38127b(C6860c.m21030a());
        this.f6843M0 = C6854c.m21016a(this.f6869V, C5872f.m18925a(), this.f6840L0);
        C11900b a = C11898f.m38133a(9, 0);
        a.mo30024a(this.f6969v0);
        a.mo30024a(this.f6981z0);
        a.mo30024a(this.f6953r0);
        a.mo30024a(this.f6807A0);
        a.mo30024a(this.f6816D0);
        a.mo30024a(this.f6822F0);
        a.mo30024a(this.f6831I0);
        a.mo30024a(this.f6837K0);
        a.mo30024a(this.f6843M0);
        this.f6846N0 = a.mo30025a();
        this.f6849O0 = C11901g.m38136a(C2362h.m8882a());
        this.f6852P0 = C2377b.m8909a(this.f6904f);
        this.f6855Q0 = C11894b.m38127b(C2470t.m9064a(this.f6846N0, this.f6849O0, this.f6852P0, this.f6854Q, this.f6857R));
        this.f6858R0 = C2347d0.m8850a(this.f6854Q, this.f6855Q0, this.f6863T, this.f6957s0);
        this.f6861S0 = C11894b.m38127b(C2472v.m9067a(this.f6863T));
        this.f6864T0 = C11894b.m38127b(C3428n.m11710a());
        this.f6867U0 = C11901g.m38136a(C3662e.m12489a(this.f6932m));
        this.f6870V0 = C2493i.m9127a(this.f6904f);
        this.f6873W0 = C11901g.m38136a(C3777g.m12785a(this.f6932m, this.f6870V0));
    }

    /* renamed from: b */
    private void m9267b(C2481a aVar) {
        this.f6876X0 = C7207f.m21806a(this.f6812C);
        this.f6879Y0 = C3164b.m11064a(this.f6932m);
        this.f6882Z0 = C7212k.m21814a(this.f6968v);
        this.f6886a1 = C11894b.m38127b(C3167e.m11071a(this.f6876X0, this.f6827H, this.f6879Y0, C5871e.m18923a(), C2494j.m9129a(), this.f6882Z0));
        this.f6890b1 = C3576t.m12041a(this.f6975x0);
        this.f6894c1 = C11894b.m38127b(C3679m.m12525a(this.f6890b1));
        this.f6898d1 = C11901g.m38136a(C3208d.m11160a(this.f6904f));
        this.f6902e1 = C11901g.m38136a(C7915b.m23131a(this.f6932m));
        this.f6906f1 = C3571r.m12029a(this.f6928l);
        this.f6910g1 = C6202n.m19684a(this.f6961t0, this.f6904f, this.f6924k, this.f6980z, this.f6944p);
        this.f6914h1 = C7214m.m21819a(this.f6812C);
        this.f6918i1 = C6177a.m19641a(this.f6957s0, this.f6924k, this.f6910g1, this.f6914h1, C5872f.m18925a());
        this.f6922j1 = C11894b.m38127b(C3438d.m11730a(this.f6904f, this.f6920j, this.f6924k));
        this.f6926k1 = C3559l0.m12000a(this.f6922j1, this.f6897d0);
        this.f6930l1 = C7204d.m21801a(this.f6812C);
        this.f6934m1 = C5384e.m18127a(this.f6882Z0, this.f6930l1);
        this.f6938n1 = C7918c.m23136a(this.f6904f);
        this.f6942o1 = C7877i.m23087a(this.f6932m, this.f6924k);
        this.f6946p1 = C7923h.m23145a(this.f6938n1, C2491g.m9123a(), this.f6942o1);
        this.f6950q1 = C7919d.m23139a(this.f6946p1);
        this.f6954r1 = C11894b.m38127b(C7049g.m21383a(this.f6950q1, this.f6942o1));
        this.f6958s1 = C7045c.m21375a(this.f6954r1, this.f6942o1);
        this.f6962t1 = C7047e.m21379a(this.f6904f, this.f6882Z0, (Provider<Class<? extends BamnetIAPPurchase>>) C7920e.m23140a());
        this.f6966u1 = C7048f.m21381a(this.f6882Z0, this.f6962t1);
        this.f6970v1 = C3523d0.m11931a(this.f6897d0);
        this.f6973w1 = C11901g.m38136a(C7616g.m22600a(this.f6970v1));
        this.f6976x1 = C11894b.m38127b(C2363h0.m8883a());
        this.f6979y1 = C11894b.m38127b(C2372k0.m8899a(this.f6976x1));
        this.f6982z1 = C3580w.m12048a(this.f6897d0);
        this.f6808A1 = C6916f.m21139a(this.f6982z1);
        this.f6811B1 = C6910b.m21122a(this.f6889b0, this.f6808A1, this.f6869V, C5873g.m18927a());
        this.f6814C1 = C7921f.m23142a(this.f6906f1);
        this.f6817D1 = C2778i.m10435a(this.f6827H);
        this.f6820E1 = C11894b.m38127b(C10561c.m33295a(this.f6904f, this.f6814C1, this.f6817D1));
        this.f6823F1 = C7206e.m21804a(this.f6812C);
        this.f6826G1 = C3583z.m12053a(this.f6897d0);
        this.f6829H1 = C7872e.m23066a(this.f6948q, this.f6826G1, this.f6929l0, C5872f.m18925a());
        this.f6832I1 = C3521c0.m11928a(this.f6897d0);
        this.f6835J1 = C11901g.m38136a(C5824d0.m18817a(this.f6901e0));
        this.f6838K1 = C11901g.m38136a(C3723s.m12650a(this.f6832I1, this.f6901e0, this.f6835J1, this.f6929l0, this.f6948q));
        this.f6841L1 = C3250b.m11252a(C2498n.m9137a());
        this.f6844M1 = C3252d.m11253a(C2498n.m9137a());
        this.f6847N1 = C3249a.m11251a(C2498n.m9137a());
        this.f6850O1 = C3206b.m11156a(this.f6904f, this.f6841L1, this.f6844M1, this.f6847N1);
        this.f6853P1 = C3214b.m11166a(this.f6850O1, C5873g.m18927a());
        this.f6856Q1 = C7046d.m21378a(this.f6812C);
        this.f6859R1 = C11901g.m38136a(C2706d.m10341a(this.f6932m));
        this.f6862S1 = C11901g.m38136a(C2710f.m10346a());
        this.f6865T1 = C11901g.m38136a(C6603b.m20517a(this.f6932m));
        this.f6868U1 = C11894b.m38127b(C6604c.m20518a(this.f6882Z0, this.f6865T1, C2496l.m9133a()));
        this.f6871V1 = C11894b.m38127b(C7302m.m21939a());
        this.f6874W1 = C7254b.m21865a(this.f6932m, this.f6924k);
        this.f6877X1 = C11894b.m38127b(C7283d.m21904a(this.f6874W1));
        this.f6880Y1 = C11894b.m38127b(C2989m.m10780a(this.f6965u0));
        this.f6883Z1 = C11901g.m38136a(C3450o.m11767a(this.f6948q, this.f6922j1));
        this.f6887a2 = C5869c.m18918a(this.f6902e1);
        this.f6891b2 = C11901g.m38136a(C3443i.m11739a(this.f6932m));
        this.f6895c2 = C11894b.m38127b(C5912d.m19000a());
        this.f6899d2 = C11894b.m38127b(C3518b0.m11922a(this.f6827H));
        this.f6903e2 = C11901g.m38136a(C6011z.m19241a(this.f6948q, this.f6929l0));
        this.f6907f2 = C11901g.m38136a(C6064b.m19435a(this.f6932m, this.f6924k));
        this.f6911g2 = C3565o.m12011a(this.f6901e0);
        this.f6915h2 = C6845t.m20993a(this.f6869V);
        this.f6919i2 = C6968y.m21226a(this.f6915h2);
        this.f6923j2 = C6269b.m19780a(this.f6932m, this.f6956s, this.f6921j0, this.f6924k, this.f6899d2);
        this.f6927k2 = C5405k0.m18165a(this.f6971w, this.f6836K, this.f6930l1);
        this.f6931l2 = C7222q.m21829a(this.f6968v);
        this.f6935m2 = C6424c.m20085a(this.f6956s, this.f6923j2);
        this.f6939n2 = C2489e.m9120a(this.f6904f);
        this.f6943o2 = C2500p.m9142a(this.f6948q);
        this.f6947p2 = C6942u.m21192a(this.f6808A1);
        this.f6951q2 = C6929h.m21170a(this.f6808A1);
        this.f6955r2 = C6933l.m21177a(this.f6808A1);
        this.f6959s2 = C6923d.m21161a(this.f6869V, this.f6889b0, C6931j.m21174a(), this.f6947p2, C6940s.m21189a(), this.f6951q2, this.f6955r2);
        this.f6963t2 = C6927f.m21167a(this.f6869V, this.f6808A1, C6946y.m21200a(), C6938q.m21186a(), C6944w.m21196a(), C6935n.m21181a());
        this.f6967u2 = C3631e.m12353a(this.f6901e0);
    }

    /* renamed from: b */
    private DominguezTvApplication m9263b(DominguezTvApplication dominguezTvApplication) {
        C11874d.m38106a(dominguezTvApplication, m9209N());
        C2501q.m9144a((C2481a) dominguezTvApplication, m9212O());
        C2501q.m9143a((C2481a) dominguezTvApplication, C3516a0.m11918b());
        C2501q.m9145a((C2481a) dominguezTvApplication, (C7233y) this.f6968v.get());
        C2679t.m10299a(dominguezTvApplication, this);
        return dominguezTvApplication;
    }

    /* renamed from: b */
    private C2680u m9264b(C2680u uVar) {
        C2681v.m10302a(uVar, m9194J0());
        return uVar;
    }

    /* renamed from: a */
    public void mo11603a(DominguezTvApplication dominguezTvApplication) {
        m9263b(dominguezTvApplication);
    }

    /* renamed from: a */
    public void mo11597a(C2680u uVar) {
        m9264b(uVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static <T> Provider<Optional<T>> m9257a() {
        return f6805v2;
    }
}
