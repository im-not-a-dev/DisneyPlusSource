package androidx.core.app;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.RemoteInput;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.C0478i.C0479a;
import androidx.core.app.C0478i.C0483d;
import androidx.core.app.C0478i.C0485f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.danlew.android.joda.DateUtils;

/* renamed from: androidx.core.app.j */
/* compiled from: NotificationCompatBuilder */
class C0486j implements C0477h {

    /* renamed from: a */
    private final Builder f2171a;

    /* renamed from: b */
    private final C0483d f2172b;

    /* renamed from: c */
    private RemoteViews f2173c;

    /* renamed from: d */
    private RemoteViews f2174d;

    /* renamed from: e */
    private final List<Bundle> f2175e = new ArrayList();

    /* renamed from: f */
    private final Bundle f2176f = new Bundle();

    /* renamed from: g */
    private int f2177g;

    /* renamed from: h */
    private RemoteViews f2178h;

    C0486j(C0483d dVar) {
        this.f2172b = dVar;
        if (VERSION.SDK_INT >= 26) {
            this.f2171a = new Builder(dVar.f2141a, dVar.f2134I);
        } else {
            this.f2171a = new Builder(dVar.f2141a);
        }
        Notification notification = dVar.f2139N;
        this.f2171a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f2148h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f2144d).setContentText(dVar.f2145e).setContentInfo(dVar.f2150j).setContentIntent(dVar.f2146f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f2147g, (notification.flags & 128) != 0).setLargeIcon(dVar.f2149i).setNumber(dVar.f2151k).setProgress(dVar.f2158r, dVar.f2159s, dVar.f2160t);
        if (VERSION.SDK_INT < 21) {
            this.f2171a.setSound(notification.sound, notification.audioStreamType);
        }
        if (VERSION.SDK_INT >= 16) {
            this.f2171a.setSubText(dVar.f2156p).setUsesChronometer(dVar.f2154n).setPriority(dVar.f2152l);
            Iterator it = dVar.f2142b.iterator();
            while (it.hasNext()) {
                m2599a((C0479a) it.next());
            }
            Bundle bundle = dVar.f2127B;
            if (bundle != null) {
                this.f2176f.putAll(bundle);
            }
            if (VERSION.SDK_INT < 20) {
                if (dVar.f2164x) {
                    this.f2176f.putBoolean("android.support.localOnly", true);
                }
                String str = dVar.f2161u;
                if (str != null) {
                    this.f2176f.putString("android.support.groupKey", str);
                    if (dVar.f2162v) {
                        this.f2176f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f2176f.putBoolean(NotificationManagerCompat.EXTRA_USE_SIDE_CHANNEL, true);
                    }
                }
                String str2 = dVar.f2163w;
                if (str2 != null) {
                    this.f2176f.putString("android.support.sortKey", str2);
                }
            }
            this.f2173c = dVar.f2131F;
            this.f2174d = dVar.f2132G;
        }
        if (VERSION.SDK_INT >= 19) {
            this.f2171a.setShowWhen(dVar.f2153m);
            if (VERSION.SDK_INT < 21) {
                ArrayList<String> arrayList = dVar.f2140O;
                if (arrayList != null && !arrayList.isEmpty()) {
                    Bundle bundle2 = this.f2176f;
                    ArrayList<String> arrayList2 = dVar.f2140O;
                    bundle2.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
                }
            }
        }
        if (VERSION.SDK_INT >= 20) {
            this.f2171a.setLocalOnly(dVar.f2164x).setGroup(dVar.f2161u).setGroupSummary(dVar.f2162v).setSortKey(dVar.f2163w);
            this.f2177g = dVar.f2138M;
        }
        if (VERSION.SDK_INT >= 21) {
            this.f2171a.setCategory(dVar.f2126A).setColor(dVar.f2128C).setVisibility(dVar.f2129D).setPublicVersion(dVar.f2130E).setSound(notification.sound, notification.audioAttributes);
            Iterator it2 = dVar.f2140O.iterator();
            while (it2.hasNext()) {
                this.f2171a.addPerson((String) it2.next());
            }
            this.f2178h = dVar.f2133H;
            if (dVar.f2143c.size() > 0) {
                String str3 = "android.car.EXTENSIONS";
                Bundle bundle3 = dVar.mo2672e().getBundle(str3);
                if (bundle3 == null) {
                    bundle3 = new Bundle();
                }
                Bundle bundle4 = new Bundle();
                for (int i = 0; i < dVar.f2143c.size(); i++) {
                    bundle4.putBundle(Integer.toString(i), C0487k.m2605a((C0479a) dVar.f2143c.get(i)));
                }
                bundle3.putBundle("invisible_actions", bundle4);
                dVar.mo2672e().putBundle(str3, bundle3);
                this.f2176f.putBundle(str3, bundle3);
            }
        }
        if (VERSION.SDK_INT >= 24) {
            this.f2171a.setExtras(dVar.f2127B).setRemoteInputHistory(dVar.f2157q);
            RemoteViews remoteViews = dVar.f2131F;
            if (remoteViews != null) {
                this.f2171a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = dVar.f2132G;
            if (remoteViews2 != null) {
                this.f2171a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.f2133H;
            if (remoteViews3 != null) {
                this.f2171a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (VERSION.SDK_INT >= 26) {
            this.f2171a.setBadgeIconType(dVar.f2135J).setShortcutId(dVar.f2136K).setTimeoutAfter(dVar.f2137L).setGroupAlertBehavior(dVar.f2138M);
            if (dVar.f2166z) {
                this.f2171a.setColorized(dVar.f2165y);
            }
            if (!TextUtils.isEmpty(dVar.f2134I)) {
                this.f2171a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }

    /* renamed from: a */
    public Builder mo2624a() {
        return this.f2171a;
    }

    /* renamed from: b */
    public Notification mo2686b() {
        C0485f fVar = this.f2172b.f2155o;
        if (fVar != null) {
            fVar.mo2638a((C0477h) this);
        }
        RemoteViews c = fVar != null ? fVar.mo2679c(this) : null;
        Notification c2 = mo2687c();
        if (c != null) {
            c2.contentView = c;
        } else {
            RemoteViews remoteViews = this.f2172b.f2131F;
            if (remoteViews != null) {
                c2.contentView = remoteViews;
            }
        }
        if (VERSION.SDK_INT >= 16 && fVar != null) {
            RemoteViews b = fVar.mo2678b(this);
            if (b != null) {
                c2.bigContentView = b;
            }
        }
        if (VERSION.SDK_INT >= 21 && fVar != null) {
            RemoteViews d = this.f2172b.f2155o.mo2680d(this);
            if (d != null) {
                c2.headsUpContentView = d;
            }
        }
        if (VERSION.SDK_INT >= 16 && fVar != null) {
            Bundle a = C0478i.m2520a(c2);
            if (a != null) {
                fVar.mo2683a(a);
            }
        }
        return c2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Notification mo2687c() {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            return this.f2171a.build();
        }
        if (i >= 24) {
            Notification build = this.f2171a.build();
            if (this.f2177g != 0) {
                if (!(build.getGroup() == null || (build.flags & DateUtils.FORMAT_NO_NOON) == 0 || this.f2177g != 2)) {
                    m2598a(build);
                }
                if (build.getGroup() != null && (build.flags & DateUtils.FORMAT_NO_NOON) == 0 && this.f2177g == 1) {
                    m2598a(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f2171a.setExtras(this.f2176f);
            Notification build2 = this.f2171a.build();
            RemoteViews remoteViews = this.f2173c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f2174d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f2178h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f2177g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & DateUtils.FORMAT_NO_NOON) == 0 || this.f2177g != 2)) {
                    m2598a(build2);
                }
                if (build2.getGroup() != null && (build2.flags & DateUtils.FORMAT_NO_NOON) == 0 && this.f2177g == 1) {
                    m2598a(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f2171a.setExtras(this.f2176f);
            Notification build3 = this.f2171a.build();
            RemoteViews remoteViews4 = this.f2173c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f2174d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f2177g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & DateUtils.FORMAT_NO_NOON) == 0 || this.f2177g != 2)) {
                    m2598a(build3);
                }
                if (build3.getGroup() != null && (build3.flags & DateUtils.FORMAT_NO_NOON) == 0 && this.f2177g == 1) {
                    m2598a(build3);
                }
            }
            return build3;
        } else {
            String str = "android.support.actionExtras";
            if (i >= 19) {
                SparseArray a = C0487k.m2607a(this.f2175e);
                if (a != null) {
                    this.f2176f.putSparseParcelableArray(str, a);
                }
                this.f2171a.setExtras(this.f2176f);
                Notification build4 = this.f2171a.build();
                RemoteViews remoteViews6 = this.f2173c;
                if (remoteViews6 != null) {
                    build4.contentView = remoteViews6;
                }
                RemoteViews remoteViews7 = this.f2174d;
                if (remoteViews7 != null) {
                    build4.bigContentView = remoteViews7;
                }
                return build4;
            } else if (i < 16) {
                return this.f2171a.getNotification();
            } else {
                Notification build5 = this.f2171a.build();
                Bundle a2 = C0478i.m2520a(build5);
                Bundle bundle = new Bundle(this.f2176f);
                for (String str2 : this.f2176f.keySet()) {
                    if (a2.containsKey(str2)) {
                        bundle.remove(str2);
                    }
                }
                a2.putAll(bundle);
                SparseArray a3 = C0487k.m2607a(this.f2175e);
                if (a3 != null) {
                    C0478i.m2520a(build5).putSparseParcelableArray(str, a3);
                }
                RemoteViews remoteViews8 = this.f2173c;
                if (remoteViews8 != null) {
                    build5.contentView = remoteViews8;
                }
                RemoteViews remoteViews9 = this.f2174d;
                if (remoteViews9 != null) {
                    build5.bigContentView = remoteViews9;
                }
                return build5;
            }
        }
    }

    /* renamed from: a */
    private void m2599a(C0479a aVar) {
        Bundle bundle;
        int i = VERSION.SDK_INT;
        if (i >= 20) {
            Action.Builder builder = new Action.Builder(aVar.mo2629e(), aVar.mo2633i(), aVar.mo2625a());
            if (aVar.mo2630f() != null) {
                for (RemoteInput addRemoteInput : C0488l.m2610a(aVar.mo2630f())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (aVar.mo2628d() != null) {
                bundle = new Bundle(aVar.mo2628d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo2626b());
            if (VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.mo2626b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.mo2631g());
            if (VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.mo2631g());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.mo2632h());
            builder.addExtras(bundle);
            this.f2171a.addAction(builder.build());
        } else if (i >= 16) {
            this.f2175e.add(C0487k.m2603a(this.f2171a, aVar));
        }
    }

    /* renamed from: a */
    private void m2598a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
