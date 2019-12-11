package android.support.p001v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.RemoteControlClient.MetadataEditor;
import android.media.RemoteControlClient.OnMetadataUpdateListener;
import android.media.RemoteControlClient.OnPlaybackPositionUpdateListener;
import android.media.session.MediaSession;
import android.media.session.MediaSession.Callback;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p001v4.media.MediaDescriptionCompat;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.MediaMetadataCompat.C0008b;
import android.support.p001v4.media.RatingCompat;
import android.support.p001v4.media.session.C0051b.C0052a;
import android.support.p001v4.media.session.PlaybackStateCompat.C0047b;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.C0753b;
import androidx.media.C0757f;
import androidx.media.C0757f.C0758a;
import androidx.media.p002g.C0759a;
import androidx.versionedparcelable.C0992d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.danlew.android.joda.DateUtils;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: d */
    static int f48d;

    /* renamed from: a */
    private final C0030d f49a;

    /* renamed from: b */
    private final MediaControllerCompat f50b;

    /* renamed from: c */
    private final ArrayList<C0043j> f51c;

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Creator<QueueItem> CREATOR = new C0022a();

        /* renamed from: U */
        private final long f52U;

        /* renamed from: c */
        private final MediaDescriptionCompat f53c;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        static class C0022a implements Creator<QueueItem> {
            C0022a() {
            }

            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        private QueueItem(android.media.session.MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j != -1) {
                this.f53c = mediaDescriptionCompat;
                this.f52U = j;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        /* renamed from: a */
        public static QueueItem m109a(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            android.media.session.MediaSession.QueueItem queueItem = (android.media.session.MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.m11a(queueItem.getDescription()), queueItem.getQueueId());
        }

        /* renamed from: X */
        public long mo124X() {
            return this.f52U;
        }

        public int describeContents() {
            return 0;
        }

        public MediaDescriptionCompat getDescription() {
            return this.f53c;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaSession.QueueItem {Description=");
            sb.append(this.f53c);
            sb.append(", Id=");
            sb.append(this.f52U);
            sb.append(" }");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f53c.writeToParcel(parcel, i);
            parcel.writeLong(this.f52U);
        }

        QueueItem(Parcel parcel) {
            this.f53c = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f52U = parcel.readLong();
        }

        /* renamed from: a */
        public static List<QueueItem> m110a(List<?> list) {
            if (list == null || VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a : list) {
                arrayList.add(m109a(a));
            }
            return arrayList;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Creator<ResultReceiverWrapper> CREATOR = new C0023a();

        /* renamed from: c */
        ResultReceiver f54c;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        static class C0023a implements Creator<ResultReceiverWrapper> {
            C0023a() {
            }

            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f54c = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f54c.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Creator<Token> CREATOR = new C0024a();

        /* renamed from: U */
        private C0051b f55U;

        /* renamed from: V */
        private C0992d f56V;

        /* renamed from: c */
        private final Object f57c;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        static class C0024a implements Creator<Token> {
            C0024a() {
            }

            public Token createFromParcel(Parcel parcel) {
                Object obj;
                if (VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable(null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }

            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        /* renamed from: X */
        public C0051b mo135X() {
            return this.f55U;
        }

        /* renamed from: Y */
        public C0992d mo136Y() {
            return this.f56V;
        }

        /* renamed from: Z */
        public Object mo137Z() {
            return this.f57c;
        }

        /* renamed from: a */
        public void mo138a(C0051b bVar) {
            this.f55U = bVar;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f57c;
            if (obj2 == null) {
                if (token.f57c != null) {
                    z = false;
                }
                return z;
            }
            Object obj3 = token.f57c;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f57c;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f57c, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f57c);
            }
        }

        Token(Object obj, C0051b bVar, C0992d dVar) {
            this.f57c = obj;
            this.f55U = bVar;
            this.f56V = dVar;
        }

        /* renamed from: a */
        public void mo139a(C0992d dVar) {
            this.f56V = dVar;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$a */
    class C0025a extends C0027c {
        C0025a(MediaSessionCompat mediaSessionCompat) {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$b */
    class C0026b extends C0027c {
        C0026b(MediaSessionCompat mediaSessionCompat) {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$c */
    public static abstract class C0027c {

        /* renamed from: U */
        WeakReference<C0030d> f58U;

        /* renamed from: V */
        private C0028a f59V = null;

        /* renamed from: W */
        private boolean f60W;

        /* renamed from: c */
        final Callback f61c;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$c$a */
        private class C0028a extends Handler {
            C0028a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                if (message.what == 1) {
                    C0030d dVar = (C0030d) C0027c.this.f58U.get();
                    if (dVar != null) {
                        dVar.mo205a((C0753b) message.obj);
                        C0027c.this.mo146a();
                        dVar.mo205a((C0753b) null);
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$c$b */
        private class C0029b extends Callback {
            C0029b() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo177a() {
                WeakReference<C0030d> weakReference = C0027c.this.f58U;
                C0030d dVar = weakReference != null ? (C0030d) weakReference.get() : null;
                if (dVar != null) {
                    dVar.mo205a((C0753b) null);
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public void mo178b() {
                if (VERSION.SDK_INT < 28) {
                    WeakReference<C0030d> weakReference = C0027c.this.f58U;
                    C0030d dVar = weakReference != null ? (C0030d) weakReference.get() : null;
                    if (dVar != null) {
                        String b = dVar.mo207b();
                        if (TextUtils.isEmpty(b)) {
                            b = "android.media.session.MediaController";
                        }
                        dVar.mo205a(new C0753b(b, -1, -1));
                    }
                }
            }

            /* JADX WARNING: type inference failed for: r1v0 */
            /* JADX WARNING: type inference failed for: r1v1, types: [android.support.v4.media.session.MediaSessionCompat$QueueItem] */
            /* JADX WARNING: type inference failed for: r1v3, types: [android.support.v4.media.session.MediaSessionCompat$QueueItem] */
            /* JADX WARNING: type inference failed for: r1v4, types: [android.os.IBinder] */
            /* JADX WARNING: type inference failed for: r1v5, types: [android.os.IBinder] */
            /* JADX WARNING: type inference failed for: r1v6 */
            /* JADX WARNING: type inference failed for: r1v7 */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
              assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.os.IBinder, android.support.v4.media.session.MediaSessionCompat$QueueItem]
              uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.support.v4.media.session.MediaSessionCompat$QueueItem, android.os.IBinder]
              mth insns count: 86
            	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
            	at jadx.core.ProcessClass.process(ProcessClass.java:35)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
             */
            /* JADX WARNING: Unknown variable types count: 3 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCommand(java.lang.String r5, android.os.Bundle r6, android.os.ResultReceiver r7) {
                /*
                    r4 = this;
                    android.support.p001v4.media.session.MediaSessionCompat.m97a(r6)
                    r4.mo178b()
                    java.lang.String r0 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00ca }
                    r1 = 0
                    if (r0 == 0) goto L_0x0043
                    android.support.v4.media.session.MediaSessionCompat$c r5 = android.support.p001v4.media.session.MediaSessionCompat.C0027c.this     // Catch:{ BadParcelableException -> 0x00ca }
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$d> r5 = r5.f58U     // Catch:{ BadParcelableException -> 0x00ca }
                    java.lang.Object r5 = r5.get()     // Catch:{ BadParcelableException -> 0x00ca }
                    android.support.v4.media.session.MediaSessionCompat$g r5 = (android.support.p001v4.media.session.MediaSessionCompat.C0035g) r5     // Catch:{ BadParcelableException -> 0x00ca }
                    if (r5 == 0) goto L_0x00d1
                    android.os.Bundle r6 = new android.os.Bundle     // Catch:{ BadParcelableException -> 0x00ca }
                    r6.<init>()     // Catch:{ BadParcelableException -> 0x00ca }
                    android.support.v4.media.session.MediaSessionCompat$Token r5 = r5.getSessionToken()     // Catch:{ BadParcelableException -> 0x00ca }
                    android.support.v4.media.session.b r0 = r5.mo135X()     // Catch:{ BadParcelableException -> 0x00ca }
                    java.lang.String r2 = "android.support.v4.media.session.EXTRA_BINDER"
                    if (r0 != 0) goto L_0x002d
                    goto L_0x0031
                L_0x002d:
                    android.os.IBinder r1 = r0.asBinder()     // Catch:{ BadParcelableException -> 0x00ca }
                L_0x0031:
                    androidx.core.app.C0472e.m2510a(r6, r2, r1)     // Catch:{ BadParcelableException -> 0x00ca }
                    java.lang.String r0 = "android.support.v4.media.session.SESSION_TOKEN2"
                    androidx.versionedparcelable.d r5 = r5.mo136Y()     // Catch:{ BadParcelableException -> 0x00ca }
                    androidx.versionedparcelable.C0989a.m5312a(r6, r0, r5)     // Catch:{ BadParcelableException -> 0x00ca }
                    r5 = 0
                    r7.send(r5, r6)     // Catch:{ BadParcelableException -> 0x00ca }
                    goto L_0x00d1
                L_0x0043:
                    java.lang.String r0 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00ca }
                    java.lang.String r2 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    if (r0 == 0) goto L_0x005a
                    android.support.v4.media.session.MediaSessionCompat$c r5 = android.support.p001v4.media.session.MediaSessionCompat.C0027c.this     // Catch:{ BadParcelableException -> 0x00ca }
                    android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00ca }
                    android.support.v4.media.MediaDescriptionCompat r6 = (android.support.p001v4.media.MediaDescriptionCompat) r6     // Catch:{ BadParcelableException -> 0x00ca }
                    r5.mo151a(r6)     // Catch:{ BadParcelableException -> 0x00ca }
                    goto L_0x00d1
                L_0x005a:
                    java.lang.String r0 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00ca }
                    java.lang.String r3 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                    if (r0 == 0) goto L_0x0074
                    android.support.v4.media.session.MediaSessionCompat$c r5 = android.support.p001v4.media.session.MediaSessionCompat.C0027c.this     // Catch:{ BadParcelableException -> 0x00ca }
                    android.os.Parcelable r7 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00ca }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.p001v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00ca }
                    int r6 = r6.getInt(r3)     // Catch:{ BadParcelableException -> 0x00ca }
                    r5.mo152a(r7, r6)     // Catch:{ BadParcelableException -> 0x00ca }
                    goto L_0x00d1
                L_0x0074:
                    java.lang.String r0 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00ca }
                    if (r0 == 0) goto L_0x0088
                    android.support.v4.media.session.MediaSessionCompat$c r5 = android.support.p001v4.media.session.MediaSessionCompat.C0027c.this     // Catch:{ BadParcelableException -> 0x00ca }
                    android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00ca }
                    android.support.v4.media.MediaDescriptionCompat r6 = (android.support.p001v4.media.MediaDescriptionCompat) r6     // Catch:{ BadParcelableException -> 0x00ca }
                    r5.mo163b(r6)     // Catch:{ BadParcelableException -> 0x00ca }
                    goto L_0x00d1
                L_0x0088:
                    java.lang.String r0 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00ca }
                    if (r0 == 0) goto L_0x00c4
                    android.support.v4.media.session.MediaSessionCompat$c r5 = android.support.p001v4.media.session.MediaSessionCompat.C0027c.this     // Catch:{ BadParcelableException -> 0x00ca }
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$d> r5 = r5.f58U     // Catch:{ BadParcelableException -> 0x00ca }
                    java.lang.Object r5 = r5.get()     // Catch:{ BadParcelableException -> 0x00ca }
                    android.support.v4.media.session.MediaSessionCompat$g r5 = (android.support.p001v4.media.session.MediaSessionCompat.C0035g) r5     // Catch:{ BadParcelableException -> 0x00ca }
                    if (r5 == 0) goto L_0x00d1
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r5.f74h     // Catch:{ BadParcelableException -> 0x00ca }
                    if (r7 == 0) goto L_0x00d1
                    r7 = -1
                    int r6 = r6.getInt(r3, r7)     // Catch:{ BadParcelableException -> 0x00ca }
                    if (r6 < 0) goto L_0x00b8
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r5.f74h     // Catch:{ BadParcelableException -> 0x00ca }
                    int r7 = r7.size()     // Catch:{ BadParcelableException -> 0x00ca }
                    if (r6 >= r7) goto L_0x00b8
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r5 = r5.f74h     // Catch:{ BadParcelableException -> 0x00ca }
                    java.lang.Object r5 = r5.get(r6)     // Catch:{ BadParcelableException -> 0x00ca }
                    r1 = r5
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r1 = (android.support.p001v4.media.session.MediaSessionCompat.QueueItem) r1     // Catch:{ BadParcelableException -> 0x00ca }
                L_0x00b8:
                    if (r1 == 0) goto L_0x00d1
                    android.support.v4.media.session.MediaSessionCompat$c r5 = android.support.p001v4.media.session.MediaSessionCompat.C0027c.this     // Catch:{ BadParcelableException -> 0x00ca }
                    android.support.v4.media.MediaDescriptionCompat r6 = r1.getDescription()     // Catch:{ BadParcelableException -> 0x00ca }
                    r5.mo163b(r6)     // Catch:{ BadParcelableException -> 0x00ca }
                    goto L_0x00d1
                L_0x00c4:
                    android.support.v4.media.session.MediaSessionCompat$c r0 = android.support.p001v4.media.session.MediaSessionCompat.C0027c.this     // Catch:{ BadParcelableException -> 0x00ca }
                    r0.mo157a(r5, r6, r7)     // Catch:{ BadParcelableException -> 0x00ca }
                    goto L_0x00d1
                L_0x00ca:
                    java.lang.String r5 = "MediaSessionCompat"
                    java.lang.String r6 = "Could not unparcel the extra data."
                    android.util.Log.e(r5, r6)
                L_0x00d1:
                    r4.mo177a()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.media.session.MediaSessionCompat.C0027c.C0029b.onCommand(java.lang.String, android.os.Bundle, android.os.ResultReceiver):void");
            }

            public void onCustomAction(String str, Bundle bundle) {
                MediaSessionCompat.m97a(bundle);
                mo178b();
                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                MediaSessionCompat.m97a(bundle2);
                String str2 = "android.support.v4.media.session.action.ARGUMENT_URI";
                if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                    C0027c.this.mo150a((Uri) bundle.getParcelable(str2), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                    C0027c.this.mo170e();
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    C0027c.this.mo169d(bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    C0027c.this.mo171e(bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    C0027c.this.mo162b((Uri) bundle.getParcelable(str2), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    C0027c.this.mo165b(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    C0027c.this.mo148a(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    C0027c.this.mo160b(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    C0027c.this.mo154a((RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                    C0027c.this.mo147a(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                } else {
                    C0027c.this.mo156a(str, bundle);
                }
                mo177a();
            }

            public void onFastForward() {
                mo178b();
                C0027c.this.mo159b();
                mo177a();
            }

            public boolean onMediaButtonEvent(Intent intent) {
                mo178b();
                boolean a = C0027c.this.mo158a(intent);
                mo177a();
                return a || super.onMediaButtonEvent(intent);
            }

            public void onPause() {
                mo178b();
                C0027c.this.mo166c();
                mo177a();
            }

            public void onPlay() {
                mo178b();
                C0027c.this.mo168d();
                mo177a();
            }

            public void onPlayFromMediaId(String str, Bundle bundle) {
                MediaSessionCompat.m97a(bundle);
                mo178b();
                C0027c.this.mo164b(str, bundle);
                mo177a();
            }

            public void onPlayFromSearch(String str, Bundle bundle) {
                MediaSessionCompat.m97a(bundle);
                mo178b();
                C0027c.this.mo167c(str, bundle);
                mo177a();
            }

            public void onPlayFromUri(Uri uri, Bundle bundle) {
                MediaSessionCompat.m97a(bundle);
                mo178b();
                C0027c.this.mo150a(uri, bundle);
                mo177a();
            }

            public void onPrepare() {
                mo178b();
                C0027c.this.mo170e();
                mo177a();
            }

            public void onPrepareFromMediaId(String str, Bundle bundle) {
                MediaSessionCompat.m97a(bundle);
                mo178b();
                C0027c.this.mo169d(str, bundle);
                mo177a();
            }

            public void onPrepareFromSearch(String str, Bundle bundle) {
                MediaSessionCompat.m97a(bundle);
                mo178b();
                C0027c.this.mo171e(str, bundle);
                mo177a();
            }

            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                MediaSessionCompat.m97a(bundle);
                mo178b();
                C0027c.this.mo162b(uri, bundle);
                mo177a();
            }

            public void onRewind() {
                mo178b();
                C0027c.this.mo172f();
                mo177a();
            }

            public void onSeekTo(long j) {
                mo178b();
                C0027c.this.mo149a(j);
                mo177a();
            }

            public void onSetRating(Rating rating) {
                mo178b();
                C0027c.this.mo153a(RatingCompat.m43a((Object) rating));
                mo177a();
            }

            public void onSkipToNext() {
                mo178b();
                C0027c.this.mo173g();
                mo177a();
            }

            public void onSkipToPrevious() {
                mo178b();
                C0027c.this.mo174h();
                mo177a();
            }

            public void onSkipToQueueItem(long j) {
                mo178b();
                C0027c.this.mo161b(j);
                mo177a();
            }

            public void onStop() {
                mo178b();
                C0027c.this.mo175i();
                mo177a();
            }
        }

        public C0027c() {
            if (VERSION.SDK_INT >= 21) {
                this.f61c = new C0029b();
            } else {
                this.f61c = null;
            }
        }

        /* renamed from: a */
        public void mo147a(float f) {
        }

        /* renamed from: a */
        public void mo148a(int i) {
        }

        /* renamed from: a */
        public void mo149a(long j) {
        }

        /* renamed from: a */
        public void mo150a(Uri uri, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo151a(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        /* renamed from: a */
        public void mo152a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        /* renamed from: a */
        public void mo153a(RatingCompat ratingCompat) {
        }

        /* renamed from: a */
        public void mo154a(RatingCompat ratingCompat, Bundle bundle) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo155a(C0030d dVar, Handler handler) {
            this.f58U = new WeakReference<>(dVar);
            C0028a aVar = this.f59V;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            this.f59V = new C0028a(handler.getLooper());
        }

        /* renamed from: a */
        public void mo156a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo157a(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        /* renamed from: b */
        public void mo159b() {
        }

        /* renamed from: b */
        public void mo160b(int i) {
        }

        /* renamed from: b */
        public void mo161b(long j) {
        }

        /* renamed from: b */
        public void mo162b(Uri uri, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo163b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        /* renamed from: b */
        public void mo164b(String str, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo165b(boolean z) {
        }

        /* renamed from: c */
        public void mo166c() {
        }

        /* renamed from: c */
        public void mo167c(String str, Bundle bundle) {
        }

        /* renamed from: d */
        public void mo168d() {
        }

        /* renamed from: d */
        public void mo169d(String str, Bundle bundle) {
        }

        /* renamed from: e */
        public void mo170e() {
        }

        /* renamed from: e */
        public void mo171e(String str, Bundle bundle) {
        }

        /* renamed from: f */
        public void mo172f() {
        }

        /* renamed from: g */
        public void mo173g() {
        }

        /* renamed from: h */
        public void mo174h() {
        }

        /* renamed from: i */
        public void mo175i() {
        }

        /* renamed from: a */
        public boolean mo158a(Intent intent) {
            long j;
            if (VERSION.SDK_INT >= 27) {
                return false;
            }
            C0030d dVar = (C0030d) this.f58U.get();
            if (!(dVar == null || this.f59V == null)) {
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    C0753b c = dVar.mo209c();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 79 || keyCode == 85) {
                        if (keyEvent.getRepeatCount() > 0) {
                            mo146a();
                        } else if (this.f60W) {
                            this.f59V.removeMessages(1);
                            this.f60W = false;
                            PlaybackStateCompat playbackState = dVar.getPlaybackState();
                            if (playbackState == null) {
                                j = 0;
                            } else {
                                j = playbackState.mo288X();
                            }
                            if ((j & 32) != 0) {
                                mo173g();
                            }
                        } else {
                            this.f60W = true;
                            C0028a aVar = this.f59V;
                            aVar.sendMessageDelayed(aVar.obtainMessage(1, c), (long) ViewConfiguration.getDoubleTapTimeout());
                        }
                        return true;
                    }
                    mo146a();
                    return false;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo146a() {
            long j;
            if (this.f60W) {
                boolean z = false;
                this.f60W = false;
                this.f59V.removeMessages(1);
                C0030d dVar = (C0030d) this.f58U.get();
                if (dVar != null) {
                    PlaybackStateCompat playbackState = dVar.getPlaybackState();
                    if (playbackState == null) {
                        j = 0;
                    } else {
                        j = playbackState.mo288X();
                    }
                    boolean z2 = playbackState != null && playbackState.mo294d0() == 3;
                    boolean z3 = (516 & j) != 0;
                    if ((j & 514) != 0) {
                        z = true;
                    }
                    if (z2 && z) {
                        mo166c();
                    } else if (!z2 && z3) {
                        mo168d();
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$d */
    interface C0030d {
        /* renamed from: a */
        void mo199a();

        /* renamed from: a */
        void mo200a(int i);

        /* renamed from: a */
        void mo201a(PendingIntent pendingIntent);

        /* renamed from: a */
        void mo202a(MediaMetadataCompat mediaMetadataCompat);

        /* renamed from: a */
        void mo203a(C0027c cVar, Handler handler);

        /* renamed from: a */
        void mo204a(PlaybackStateCompat playbackStateCompat);

        /* renamed from: a */
        void mo205a(C0753b bVar);

        /* renamed from: a */
        void mo206a(boolean z);

        /* renamed from: b */
        String mo207b();

        /* renamed from: b */
        void mo208b(int i);

        /* renamed from: c */
        C0753b mo209c();

        PlaybackStateCompat getPlaybackState();

        Token getSessionToken();

        void setRepeatMode(int i);
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$e */
    static class C0031e extends C0038i {

        /* renamed from: F */
        private static boolean f64F = true;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$e$a */
        class C0032a implements OnPlaybackPositionUpdateListener {
            C0032a() {
            }

            public void onPlaybackPositionUpdate(long j) {
                C0031e.this.mo272a(18, -1, -1, Long.valueOf(j), null);
            }
        }

        C0031e(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
            super(context, str, componentName, pendingIntent, bundle);
        }

        /* renamed from: a */
        public void mo203a(C0027c cVar, Handler handler) {
            super.mo203a(cVar, handler);
            if (cVar == null) {
                this.f96j.setPlaybackPositionUpdateListener(null);
                return;
            }
            this.f96j.setPlaybackPositionUpdateListener(new C0032a());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo216b(PlaybackStateCompat playbackStateCompat) {
            long c0 = playbackStateCompat.mo293c0();
            float a0 = playbackStateCompat.mo291a0();
            long Z = playbackStateCompat.mo290Z();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.mo294d0() == 3) {
                long j = 0;
                if (c0 > 0) {
                    if (Z > 0) {
                        j = elapsedRealtime - Z;
                        if (a0 > 0.0f && a0 != 1.0f) {
                            j = (long) (((float) j) * a0);
                        }
                    }
                    c0 += j;
                }
            }
            this.f96j.setPlaybackState(mo275d(playbackStateCompat.mo294d0()), c0, a0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo213a(long j) {
            int a = super.mo213a(j);
            return (j & 256) != 0 ? a | 256 : a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo214a(PendingIntent pendingIntent, ComponentName componentName) {
            if (f64F) {
                try {
                    this.f95i.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    f64F = false;
                }
            }
            if (!f64F) {
                super.mo214a(pendingIntent, componentName);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo215b(PendingIntent pendingIntent, ComponentName componentName) {
            if (f64F) {
                this.f95i.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.mo215b(pendingIntent, componentName);
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$f */
    static class C0033f extends C0031e {

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$f$a */
        class C0034a implements OnMetadataUpdateListener {
            C0034a() {
            }

            public void onMetadataUpdate(int i, Object obj) {
                if (i == 268435457 && (obj instanceof Rating)) {
                    C0033f.this.mo272a(19, -1, -1, RatingCompat.m43a(obj), null);
                }
            }
        }

        C0033f(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
            super(context, str, componentName, pendingIntent, bundle);
        }

        /* renamed from: a */
        public void mo203a(C0027c cVar, Handler handler) {
            super.mo203a(cVar, handler);
            if (cVar == null) {
                this.f96j.setMetadataUpdateListener(null);
                return;
            }
            this.f96j.setMetadataUpdateListener(new C0034a());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo213a(long j) {
            int a = super.mo213a(j);
            return (j & 128) != 0 ? a | DateUtils.FORMAT_NO_NOON : a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public MetadataEditor mo218a(Bundle bundle) {
            MetadataEditor a = super.mo218a(bundle);
            PlaybackStateCompat playbackStateCompat = this.f106t;
            if (((playbackStateCompat == null ? 0 : playbackStateCompat.mo288X()) & 128) != 0) {
                a.addEditableKey(268435457);
            }
            if (bundle == null) {
                return a;
            }
            String str = "android.media.metadata.YEAR";
            if (bundle.containsKey(str)) {
                a.putLong(8, bundle.getLong(str));
            }
            String str2 = "android.media.metadata.RATING";
            if (bundle.containsKey(str2)) {
                a.putObject(101, bundle.getParcelable(str2));
            }
            String str3 = "android.media.metadata.USER_RATING";
            if (bundle.containsKey(str3)) {
                a.putObject(268435457, bundle.getParcelable(str3));
            }
            return a;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$g */
    static class C0035g implements C0030d {

        /* renamed from: a */
        final MediaSession f67a;

        /* renamed from: b */
        final Token f68b;

        /* renamed from: c */
        final Object f69c = new Object();

        /* renamed from: d */
        final Bundle f70d;

        /* renamed from: e */
        boolean f71e = false;

        /* renamed from: f */
        final RemoteCallbackList<C0048a> f72f = new RemoteCallbackList<>();

        /* renamed from: g */
        PlaybackStateCompat f73g;

        /* renamed from: h */
        List<QueueItem> f74h;

        /* renamed from: i */
        MediaMetadataCompat f75i;

        /* renamed from: j */
        int f76j;

        /* renamed from: k */
        boolean f77k;

        /* renamed from: l */
        int f78l;

        /* renamed from: m */
        int f79m;

        /* renamed from: n */
        C0753b f80n;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$g$a */
        class C0036a extends C0052a {
            C0036a() {
            }

            /* renamed from: X */
            public MediaMetadataCompat mo220X() {
                throw new AssertionError();
            }

            /* renamed from: Y */
            public void mo221Y() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: Z */
            public List<QueueItem> mo222Z() {
                return null;
            }

            /* renamed from: a */
            public void mo235a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            /* renamed from: a0 */
            public boolean mo237a0() {
                return false;
            }

            /* renamed from: b */
            public void mo243b(C0048a aVar) {
                C0035g.this.f72f.unregister(aVar);
            }

            /* renamed from: b0 */
            public boolean mo245b0() {
                throw new AssertionError();
            }

            /* renamed from: c */
            public void mo247c(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: c0 */
            public PendingIntent mo249c0() {
                throw new AssertionError();
            }

            /* renamed from: d */
            public void mo250d(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: d */
            public void mo251d(boolean z) throws RemoteException {
            }

            /* renamed from: d0 */
            public int mo252d0() {
                return C0035g.this.f76j;
            }

            /* renamed from: e */
            public void mo253e(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: e0 */
            public void mo254e0() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: f0 */
            public CharSequence mo255f0() {
                throw new AssertionError();
            }

            /* renamed from: g0 */
            public void mo256g0() throws RemoteException {
                throw new AssertionError();
            }

            public Bundle getExtras() {
                throw new AssertionError();
            }

            public PlaybackStateCompat getPlaybackState() {
                C0035g gVar = C0035g.this;
                return MediaSessionCompat.m96a(gVar.f73g, gVar.f75i);
            }

            public int getRepeatMode() {
                return C0035g.this.f78l;
            }

            public Bundle getSessionInfo() {
                Bundle bundle = C0035g.this.f70d;
                if (bundle == null) {
                    return null;
                }
                return new Bundle(bundle);
            }

            /* renamed from: h0 */
            public int mo261h0() {
                return C0035g.this.f79m;
            }

            /* renamed from: i0 */
            public boolean mo262i0() {
                return C0035g.this.f77k;
            }

            /* renamed from: j0 */
            public void mo263j0() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: k0 */
            public long mo264k0() {
                throw new AssertionError();
            }

            /* renamed from: l0 */
            public ParcelableVolumeInfo mo265l0() {
                throw new AssertionError();
            }

            /* renamed from: m0 */
            public String mo266m0() {
                throw new AssertionError();
            }

            public void next() throws RemoteException {
                throw new AssertionError();
            }

            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            public void setRepeatMode(int i) throws RemoteException {
                throw new AssertionError();
            }

            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public boolean mo236a(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public void mo239b(int i, int i2, String str) {
                throw new AssertionError();
            }

            /* renamed from: c */
            public void mo248c(boolean z) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo233a(C0048a aVar) {
                if (!C0035g.this.f71e) {
                    C0035g.this.f72f.register(aVar, new C0753b("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            /* renamed from: b */
            public void mo244b(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: c */
            public void mo246c(int i) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public void mo241b(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: b */
            public void mo240b(long j) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public void mo238b() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public String mo223a() {
                throw new AssertionError();
            }

            /* renamed from: b */
            public void mo242b(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo226a(int i, int i2, String str) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo228a(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo227a(long j) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo231a(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo232a(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo224a(float f) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo225a(int i) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo234a(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo230a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo229a(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }
        }

        C0035g(Context context, String str, C0992d dVar, Bundle bundle) {
            this.f67a = new MediaSession(context, str);
            this.f68b = new Token(this.f67a.getSessionToken(), new C0036a(), dVar);
            this.f70d = bundle;
            mo208b(3);
        }

        /* renamed from: a */
        public void mo203a(C0027c cVar, Handler handler) {
            this.f67a.setCallback(cVar == null ? null : cVar.f61c, handler);
            if (cVar != null) {
                cVar.mo155a((C0030d) this, handler);
            }
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: b */
        public void mo208b(int i) {
            this.f67a.setFlags(i | 1 | 2);
        }

        /* renamed from: c */
        public C0753b mo209c() {
            C0753b bVar;
            synchronized (this.f69c) {
                bVar = this.f80n;
            }
            return bVar;
        }

        public PlaybackStateCompat getPlaybackState() {
            return this.f73g;
        }

        public Token getSessionToken() {
            return this.f68b;
        }

        public void setRepeatMode(int i) {
            if (this.f78l != i) {
                this.f78l = i;
                for (int beginBroadcast = this.f72f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((C0048a) this.f72f.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.f72f.finishBroadcast();
            }
        }

        /* renamed from: b */
        public String mo207b() {
            if (VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.f67a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.f67a, new Object[0]);
            } catch (Exception e) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
                return null;
            }
        }

        /* renamed from: a */
        public void mo206a(boolean z) {
            this.f67a.setActive(z);
        }

        /* renamed from: a */
        public void mo199a() {
            this.f71e = true;
            this.f67a.release();
        }

        /* renamed from: a */
        public void mo204a(PlaybackStateCompat playbackStateCompat) {
            PlaybackState playbackState;
            this.f73g = playbackStateCompat;
            for (int beginBroadcast = this.f72f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((C0048a) this.f72f.getBroadcastItem(beginBroadcast)).mo106a(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f72f.finishBroadcast();
            MediaSession mediaSession = this.f67a;
            if (playbackStateCompat == null) {
                playbackState = null;
            } else {
                playbackState = (PlaybackState) playbackStateCompat.mo292b0();
            }
            mediaSession.setPlaybackState(playbackState);
        }

        /* renamed from: a */
        public void mo202a(MediaMetadataCompat mediaMetadataCompat) {
            MediaMetadata mediaMetadata;
            this.f75i = mediaMetadataCompat;
            MediaSession mediaSession = this.f67a;
            if (mediaMetadataCompat == null) {
                mediaMetadata = null;
            } else {
                mediaMetadata = (MediaMetadata) mediaMetadataCompat.mo42B();
            }
            mediaSession.setMetadata(mediaMetadata);
        }

        /* renamed from: a */
        public void mo201a(PendingIntent pendingIntent) {
            this.f67a.setMediaButtonReceiver(pendingIntent);
        }

        /* renamed from: a */
        public void mo200a(int i) {
            if (this.f79m != i) {
                this.f79m = i;
                for (int beginBroadcast = this.f72f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((C0048a) this.f72f.getBroadcastItem(beginBroadcast)).mo110d(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.f72f.finishBroadcast();
            }
        }

        /* renamed from: a */
        public void mo205a(C0753b bVar) {
            synchronized (this.f69c) {
                this.f80n = bVar;
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$h */
    static class C0037h extends C0035g {
        C0037h(Context context, String str, C0992d dVar, Bundle bundle) {
            super(context, str, dVar, bundle);
        }

        /* renamed from: a */
        public void mo205a(C0753b bVar) {
        }

        /* renamed from: c */
        public final C0753b mo209c() {
            return new C0753b(this.f67a.getCurrentControllerInfo());
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$i */
    static class C0038i implements C0030d {

        /* renamed from: A */
        int f82A;

        /* renamed from: B */
        Bundle f83B;

        /* renamed from: C */
        int f84C;

        /* renamed from: D */
        int f85D;

        /* renamed from: E */
        C0757f f86E;

        /* renamed from: a */
        private final Context f87a;

        /* renamed from: b */
        private final ComponentName f88b;

        /* renamed from: c */
        private final PendingIntent f89c;

        /* renamed from: d */
        private final C0041c f90d;

        /* renamed from: e */
        private final Token f91e;

        /* renamed from: f */
        final String f92f;

        /* renamed from: g */
        final Bundle f93g;

        /* renamed from: h */
        final String f94h;

        /* renamed from: i */
        final AudioManager f95i;

        /* renamed from: j */
        final RemoteControlClient f96j;

        /* renamed from: k */
        final Object f97k = new Object();

        /* renamed from: l */
        final RemoteCallbackList<C0048a> f98l = new RemoteCallbackList<>();

        /* renamed from: m */
        private C0042d f99m;

        /* renamed from: n */
        boolean f100n = false;

        /* renamed from: o */
        boolean f101o = false;

        /* renamed from: p */
        volatile C0027c f102p;

        /* renamed from: q */
        private C0753b f103q;

        /* renamed from: r */
        int f104r = 3;

        /* renamed from: s */
        MediaMetadataCompat f105s;

        /* renamed from: t */
        PlaybackStateCompat f106t;

        /* renamed from: u */
        PendingIntent f107u;

        /* renamed from: v */
        List<QueueItem> f108v;

        /* renamed from: w */
        CharSequence f109w;

        /* renamed from: x */
        int f110x;

        /* renamed from: y */
        boolean f111y;

        /* renamed from: z */
        int f112z;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$i$a */
        class C0039a extends C0758a {
            C0039a(C0038i iVar) {
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$i$b */
        private static final class C0040b {

            /* renamed from: a */
            public final String f113a;

            /* renamed from: b */
            public final Bundle f114b;

            /* renamed from: c */
            public final ResultReceiver f115c;

            public C0040b(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f113a = str;
                this.f114b = bundle;
                this.f115c = resultReceiver;
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$i$c */
        class C0041c extends C0052a {
            C0041c() {
            }

            /* renamed from: X */
            public MediaMetadataCompat mo220X() {
                return C0038i.this.f105s;
            }

            /* renamed from: Y */
            public void mo221Y() throws RemoteException {
                mo281b(7);
            }

            /* renamed from: Z */
            public List<QueueItem> mo222Z() {
                List<QueueItem> list;
                synchronized (C0038i.this.f97k) {
                    list = C0038i.this.f108v;
                }
                return list;
            }

            /* renamed from: a */
            public void mo235a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                mo278a(1, (Object) new C0040b(str, bundle, resultReceiverWrapper == null ? null : resultReceiverWrapper.f54c));
            }

            /* renamed from: a0 */
            public boolean mo237a0() {
                return false;
            }

            /* renamed from: b */
            public void mo243b(C0048a aVar) {
                C0038i.this.f98l.unregister(aVar);
            }

            /* renamed from: b0 */
            public boolean mo245b0() {
                return true;
            }

            /* renamed from: c */
            public void mo247c(String str, Bundle bundle) throws RemoteException {
                mo280a(4, (Object) str, bundle);
            }

            /* renamed from: c0 */
            public PendingIntent mo249c0() {
                PendingIntent pendingIntent;
                synchronized (C0038i.this.f97k) {
                    pendingIntent = C0038i.this.f107u;
                }
                return pendingIntent;
            }

            /* renamed from: d */
            public void mo250d(String str, Bundle bundle) throws RemoteException {
                mo280a(8, (Object) str, bundle);
            }

            /* renamed from: d */
            public void mo251d(boolean z) throws RemoteException {
            }

            /* renamed from: d0 */
            public int mo252d0() {
                return C0038i.this.f110x;
            }

            /* renamed from: e */
            public void mo253e(String str, Bundle bundle) throws RemoteException {
                mo280a(9, (Object) str, bundle);
            }

            /* renamed from: e0 */
            public void mo254e0() throws RemoteException {
                mo281b(3);
            }

            /* renamed from: f0 */
            public CharSequence mo255f0() {
                return C0038i.this.f109w;
            }

            /* renamed from: g0 */
            public void mo256g0() throws RemoteException {
                mo281b(16);
            }

            public Bundle getExtras() {
                Bundle bundle;
                synchronized (C0038i.this.f97k) {
                    bundle = C0038i.this.f83B;
                }
                return bundle;
            }

            public PlaybackStateCompat getPlaybackState() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (C0038i.this.f97k) {
                    playbackStateCompat = C0038i.this.f106t;
                    mediaMetadataCompat = C0038i.this.f105s;
                }
                return MediaSessionCompat.m96a(playbackStateCompat, mediaMetadataCompat);
            }

            public int getRepeatMode() {
                return C0038i.this.f112z;
            }

            public Bundle getSessionInfo() {
                Bundle bundle = C0038i.this.f93g;
                if (bundle == null) {
                    return null;
                }
                return new Bundle(bundle);
            }

            /* renamed from: h0 */
            public int mo261h0() {
                return C0038i.this.f82A;
            }

            /* renamed from: i0 */
            public boolean mo262i0() {
                return C0038i.this.f111y;
            }

            /* renamed from: j0 */
            public void mo263j0() throws RemoteException {
                mo281b(17);
            }

            /* renamed from: k0 */
            public long mo264k0() {
                long j;
                synchronized (C0038i.this.f97k) {
                    j = (long) C0038i.this.f104r;
                }
                return j;
            }

            /* renamed from: l0 */
            public ParcelableVolumeInfo mo265l0() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                synchronized (C0038i.this.f97k) {
                    i = C0038i.this.f84C;
                    i2 = C0038i.this.f85D;
                    C0757f fVar = C0038i.this.f86E;
                    if (i == 2) {
                        int c = fVar.mo4208c();
                        int b = fVar.mo4206b();
                        i3 = fVar.mo4204a();
                        i4 = b;
                        i5 = c;
                    } else {
                        i4 = C0038i.this.f95i.getStreamMaxVolume(i2);
                        i3 = C0038i.this.f95i.getStreamVolume(i2);
                        i5 = 2;
                    }
                }
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo(i, i2, i5, i4, i3);
                return parcelableVolumeInfo;
            }

            /* renamed from: m0 */
            public String mo266m0() {
                return C0038i.this.f92f;
            }

            public void next() throws RemoteException {
                mo281b(14);
            }

            public void previous() throws RemoteException {
                mo281b(15);
            }

            public void setRepeatMode(int i) throws RemoteException {
                mo277a(23, i);
            }

            public void stop() throws RemoteException {
                mo281b(13);
            }

            /* renamed from: a */
            public boolean mo236a(KeyEvent keyEvent) {
                mo278a(21, (Object) keyEvent);
                return true;
            }

            /* renamed from: b */
            public void mo239b(int i, int i2, String str) {
                C0038i.this.mo271a(i, i2);
            }

            /* renamed from: c */
            public void mo248c(boolean z) throws RemoteException {
                mo278a(29, (Object) Boolean.valueOf(z));
            }

            /* renamed from: a */
            public void mo233a(C0048a aVar) {
                if (C0038i.this.f100n) {
                    try {
                        aVar.mo87d();
                    } catch (Exception unused) {
                    }
                    return;
                }
                C0038i.this.f98l.register(aVar, new C0753b(C0038i.this.mo274c(Binder.getCallingUid()), Binder.getCallingPid(), Binder.getCallingUid()));
            }

            /* renamed from: b */
            public void mo244b(String str, Bundle bundle) throws RemoteException {
                mo280a(5, (Object) str, bundle);
            }

            /* renamed from: c */
            public void mo246c(int i) {
                mo277a(28, i);
            }

            /* renamed from: b */
            public void mo241b(Uri uri, Bundle bundle) throws RemoteException {
                mo280a(10, (Object) uri, bundle);
            }

            /* renamed from: b */
            public void mo240b(long j) {
                mo278a(11, (Object) Long.valueOf(j));
            }

            /* renamed from: b */
            public void mo238b() throws RemoteException {
                mo281b(12);
            }

            /* renamed from: b */
            public void mo242b(MediaDescriptionCompat mediaDescriptionCompat) {
                mo278a(25, (Object) mediaDescriptionCompat);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public void mo281b(int i) {
                C0038i.this.mo272a(i, 0, 0, null, null);
            }

            /* renamed from: a */
            public String mo223a() {
                return C0038i.this.f94h;
            }

            /* renamed from: a */
            public void mo226a(int i, int i2, String str) {
                C0038i.this.mo273b(i, i2);
            }

            /* renamed from: a */
            public void mo228a(Uri uri, Bundle bundle) throws RemoteException {
                mo280a(6, (Object) uri, bundle);
            }

            /* renamed from: a */
            public void mo227a(long j) throws RemoteException {
                mo278a(18, (Object) Long.valueOf(j));
            }

            /* renamed from: a */
            public void mo231a(RatingCompat ratingCompat) throws RemoteException {
                mo278a(19, (Object) ratingCompat);
            }

            /* renamed from: a */
            public void mo232a(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                mo280a(31, (Object) ratingCompat, bundle);
            }

            /* renamed from: a */
            public void mo224a(float f) throws RemoteException {
                mo278a(32, (Object) Float.valueOf(f));
            }

            /* renamed from: a */
            public void mo225a(int i) throws RemoteException {
                mo277a(30, i);
            }

            /* renamed from: a */
            public void mo234a(String str, Bundle bundle) throws RemoteException {
                mo280a(20, (Object) str, bundle);
            }

            /* renamed from: a */
            public void mo230a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                mo279a(26, (Object) mediaDescriptionCompat, i);
            }

            /* renamed from: a */
            public void mo229a(MediaDescriptionCompat mediaDescriptionCompat) {
                mo278a(27, (Object) mediaDescriptionCompat);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo277a(int i, int i2) {
                C0038i.this.mo272a(i, i2, 0, null, null);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo278a(int i, Object obj) {
                C0038i.this.mo272a(i, 0, 0, obj, null);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo279a(int i, Object obj, int i2) {
                C0038i.this.mo272a(i, i2, 0, obj, null);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo280a(int i, Object obj, Bundle bundle) {
                C0038i.this.mo272a(i, 0, 0, obj, bundle);
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$i$d */
        class C0042d extends Handler {
            public C0042d(Looper looper) {
                super(looper);
            }

            /* renamed from: a */
            private void m299a(KeyEvent keyEvent, C0027c cVar) {
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    PlaybackStateCompat playbackStateCompat = C0038i.this.f106t;
                    long X = playbackStateCompat == null ? 0 : playbackStateCompat.mo288X();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 79) {
                        if (keyCode != 126) {
                            if (keyCode != 127) {
                                switch (keyCode) {
                                    case 85:
                                        break;
                                    case 86:
                                        if ((X & 1) != 0) {
                                            cVar.mo175i();
                                            return;
                                        }
                                        return;
                                    case 87:
                                        if ((X & 32) != 0) {
                                            cVar.mo173g();
                                            return;
                                        }
                                        return;
                                    case 88:
                                        if ((X & 16) != 0) {
                                            cVar.mo174h();
                                            return;
                                        }
                                        return;
                                    case 89:
                                        if ((X & 8) != 0) {
                                            cVar.mo172f();
                                            return;
                                        }
                                        return;
                                    case 90:
                                        if ((X & 64) != 0) {
                                            cVar.mo159b();
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            } else if ((X & 2) != 0) {
                                cVar.mo166c();
                                return;
                            } else {
                                return;
                            }
                        } else if ((X & 4) != 0) {
                            cVar.mo168d();
                            return;
                        } else {
                            return;
                        }
                    }
                    Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
                }
            }

            public void handleMessage(Message message) {
                C0027c cVar = C0038i.this.f102p;
                if (cVar != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.m97a(data);
                    C0038i.this.mo205a(new C0753b(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                    Bundle bundle = data.getBundle("data_extras");
                    MediaSessionCompat.m97a(bundle);
                    try {
                        switch (message.what) {
                            case 1:
                                C0040b bVar = (C0040b) message.obj;
                                cVar.mo157a(bVar.f113a, bVar.f114b, bVar.f115c);
                                break;
                            case 2:
                                C0038i.this.mo271a(message.arg1, 0);
                                break;
                            case 3:
                                cVar.mo170e();
                                break;
                            case 4:
                                cVar.mo169d((String) message.obj, bundle);
                                break;
                            case 5:
                                cVar.mo171e((String) message.obj, bundle);
                                break;
                            case 6:
                                cVar.mo162b((Uri) message.obj, bundle);
                                break;
                            case 7:
                                cVar.mo168d();
                                break;
                            case 8:
                                cVar.mo164b((String) message.obj, bundle);
                                break;
                            case 9:
                                cVar.mo167c((String) message.obj, bundle);
                                break;
                            case 10:
                                cVar.mo150a((Uri) message.obj, bundle);
                                break;
                            case 11:
                                cVar.mo161b(((Long) message.obj).longValue());
                                break;
                            case 12:
                                cVar.mo166c();
                                break;
                            case 13:
                                cVar.mo175i();
                                break;
                            case 14:
                                cVar.mo173g();
                                break;
                            case 15:
                                cVar.mo174h();
                                break;
                            case 16:
                                cVar.mo159b();
                                break;
                            case 17:
                                cVar.mo172f();
                                break;
                            case 18:
                                cVar.mo149a(((Long) message.obj).longValue());
                                break;
                            case 19:
                                cVar.mo153a((RatingCompat) message.obj);
                                break;
                            case 20:
                                cVar.mo156a((String) message.obj, bundle);
                                break;
                            case 21:
                                KeyEvent keyEvent = (KeyEvent) message.obj;
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                                if (!cVar.mo158a(intent)) {
                                    m299a(keyEvent, cVar);
                                    break;
                                }
                                break;
                            case 22:
                                C0038i.this.mo273b(message.arg1, 0);
                                break;
                            case 23:
                                cVar.mo148a(message.arg1);
                                break;
                            case 25:
                                cVar.mo151a((MediaDescriptionCompat) message.obj);
                                break;
                            case 26:
                                cVar.mo152a((MediaDescriptionCompat) message.obj, message.arg1);
                                break;
                            case 27:
                                cVar.mo163b((MediaDescriptionCompat) message.obj);
                                break;
                            case 28:
                                if (C0038i.this.f108v != null) {
                                    QueueItem queueItem = (message.arg1 < 0 || message.arg1 >= C0038i.this.f108v.size()) ? null : (QueueItem) C0038i.this.f108v.get(message.arg1);
                                    if (queueItem != null) {
                                        cVar.mo163b(queueItem.getDescription());
                                        break;
                                    }
                                }
                                break;
                            case 29:
                                cVar.mo165b(((Boolean) message.obj).booleanValue());
                                break;
                            case 30:
                                cVar.mo160b(message.arg1);
                                break;
                            case 31:
                                cVar.mo154a((RatingCompat) message.obj, bundle);
                                break;
                            case 32:
                                cVar.mo147a(((Float) message.obj).floatValue());
                                break;
                        }
                    } finally {
                        C0038i.this.mo205a((C0753b) null);
                    }
                }
            }
        }

        public C0038i(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
            new C0039a(this);
            if (componentName != null) {
                this.f87a = context;
                this.f92f = context.getPackageName();
                this.f93g = bundle;
                this.f95i = (AudioManager) context.getSystemService("audio");
                this.f94h = str;
                this.f88b = componentName;
                this.f89c = pendingIntent;
                this.f90d = new C0041c();
                this.f91e = new Token(this.f90d);
                this.f110x = 0;
                this.f84C = 1;
                this.f85D = 3;
                this.f96j = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
        }

        /* renamed from: e */
        private void m226e() {
            for (int beginBroadcast = this.f98l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((C0048a) this.f98l.getBroadcastItem(beginBroadcast)).mo87d();
                } catch (RemoteException unused) {
                }
            }
            this.f98l.finishBroadcast();
            this.f98l.kill();
        }

        /* renamed from: f */
        private void m228f(int i) {
            for (int beginBroadcast = this.f98l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((C0048a) this.f98l.getBroadcastItem(beginBroadcast)).mo110d(i);
                } catch (RemoteException unused) {
                }
            }
            this.f98l.finishBroadcast();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo213a(long j) {
            int i = (1 & j) != 0 ? 32 : 0;
            if ((2 & j) != 0) {
                i |= 16;
            }
            if ((4 & j) != 0) {
                i |= 4;
            }
            if ((8 & j) != 0) {
                i |= 2;
            }
            if ((16 & j) != 0) {
                i |= 1;
            }
            if ((32 & j) != 0) {
                i |= 128;
            }
            if ((64 & j) != 0) {
                i |= 64;
            }
            return (j & 512) != 0 ? i | 8 : i;
        }

        /* renamed from: a */
        public void mo201a(PendingIntent pendingIntent) {
        }

        /* renamed from: a */
        public void mo203a(C0027c cVar, Handler handler) {
            this.f102p = cVar;
            if (cVar != null) {
                if (handler == null) {
                    handler = new Handler();
                }
                synchronized (this.f97k) {
                    if (this.f99m != null) {
                        this.f99m.removeCallbacksAndMessages(null);
                    }
                    this.f99m = new C0042d(handler.getLooper());
                    this.f102p.mo155a((C0030d) this, handler);
                }
            }
        }

        /* renamed from: b */
        public String mo207b() {
            return null;
        }

        /* renamed from: b */
        public void mo208b(int i) {
            synchronized (this.f97k) {
                this.f104r = i | 1 | 2;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public String mo274c(int i) {
            String nameForUid = this.f87a.getPackageManager().getNameForUid(i);
            return TextUtils.isEmpty(nameForUid) ? "android.media.session.MediaController" : nameForUid;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo275d(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo276d() {
            if (this.f101o) {
                mo214a(this.f89c, this.f88b);
                this.f95i.registerRemoteControlClient(this.f96j);
                mo202a(this.f105s);
                mo204a(this.f106t);
                return;
            }
            mo215b(this.f89c, this.f88b);
            this.f96j.setPlaybackState(0);
            this.f95i.unregisterRemoteControlClient(this.f96j);
        }

        public PlaybackStateCompat getPlaybackState() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f97k) {
                playbackStateCompat = this.f106t;
            }
            return playbackStateCompat;
        }

        public Token getSessionToken() {
            return this.f91e;
        }

        public void setRepeatMode(int i) {
            if (this.f112z != i) {
                this.f112z = i;
                m227e(i);
            }
        }

        /* renamed from: c */
        public C0753b mo209c() {
            C0753b bVar;
            synchronized (this.f97k) {
                bVar = this.f103q;
            }
            return bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo216b(PlaybackStateCompat playbackStateCompat) {
            this.f96j.setPlaybackState(mo275d(playbackStateCompat.mo294d0()));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo215b(PendingIntent pendingIntent, ComponentName componentName) {
            this.f95i.unregisterMediaButtonEventReceiver(componentName);
        }

        /* renamed from: c */
        private void m225c(PlaybackStateCompat playbackStateCompat) {
            for (int beginBroadcast = this.f98l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((C0048a) this.f98l.getBroadcastItem(beginBroadcast)).mo106a(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f98l.finishBroadcast();
        }

        /* renamed from: e */
        private void m227e(int i) {
            for (int beginBroadcast = this.f98l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((C0048a) this.f98l.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(i);
                } catch (RemoteException unused) {
                }
            }
            this.f98l.finishBroadcast();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo273b(int i, int i2) {
            if (this.f84C == 2) {
                C0757f fVar = this.f86E;
                if (fVar != null) {
                    fVar.mo4207b(i);
                    return;
                }
                return;
            }
            this.f95i.setStreamVolume(this.f85D, i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo272a(int i, int i2, int i3, Object obj, Bundle bundle) {
            synchronized (this.f97k) {
                if (this.f99m != null) {
                    Message obtainMessage = this.f99m.obtainMessage(i, i2, i3, obj);
                    Bundle bundle2 = new Bundle();
                    int callingUid = Binder.getCallingUid();
                    bundle2.putInt("data_calling_uid", callingUid);
                    bundle2.putString("data_calling_pkg", mo274c(callingUid));
                    int callingPid = Binder.getCallingPid();
                    if (callingPid > 0) {
                        bundle2.putInt("data_calling_pid", callingPid);
                    } else {
                        bundle2.putInt("data_calling_pid", -1);
                    }
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        /* renamed from: b */
        private void m224b(MediaMetadataCompat mediaMetadataCompat) {
            for (int beginBroadcast = this.f98l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((C0048a) this.f98l.getBroadcastItem(beginBroadcast)).mo83a(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f98l.finishBroadcast();
        }

        /* renamed from: a */
        public void mo206a(boolean z) {
            if (z != this.f101o) {
                this.f101o = z;
                mo276d();
            }
        }

        /* renamed from: a */
        public void mo199a() {
            this.f101o = false;
            this.f100n = true;
            mo276d();
            m226e();
        }

        /* renamed from: a */
        public void mo204a(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f97k) {
                this.f106t = playbackStateCompat;
            }
            m225c(playbackStateCompat);
            if (this.f101o) {
                if (playbackStateCompat == null) {
                    this.f96j.setPlaybackState(0);
                    this.f96j.setTransportControlFlags(0);
                } else {
                    mo216b(playbackStateCompat);
                    this.f96j.setTransportControlFlags(mo213a(playbackStateCompat.mo288X()));
                }
            }
        }

        /* renamed from: a */
        public void mo202a(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new C0008b(mediaMetadataCompat, MediaSessionCompat.f48d).mo55a();
            }
            synchronized (this.f97k) {
                this.f105s = mediaMetadataCompat;
            }
            m224b(mediaMetadataCompat);
            if (this.f101o) {
                if (mediaMetadataCompat == null) {
                    bundle = null;
                } else {
                    bundle = mediaMetadataCompat.mo43X();
                }
                mo218a(bundle).apply();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public MetadataEditor mo218a(Bundle bundle) {
            MetadataEditor editMetadata = this.f96j.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            String str = "android.media.metadata.ART";
            if (bundle.containsKey(str)) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable(str);
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else {
                String str2 = "android.media.metadata.ALBUM_ART";
                if (bundle.containsKey(str2)) {
                    Bitmap bitmap2 = (Bitmap) bundle.getParcelable(str2);
                    if (bitmap2 != null) {
                        bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                    }
                    editMetadata.putBitmap(100, bitmap2);
                }
            }
            String str3 = "android.media.metadata.ALBUM";
            if (bundle.containsKey(str3)) {
                editMetadata.putString(1, bundle.getString(str3));
            }
            String str4 = "android.media.metadata.ALBUM_ARTIST";
            if (bundle.containsKey(str4)) {
                editMetadata.putString(13, bundle.getString(str4));
            }
            String str5 = "android.media.metadata.ARTIST";
            if (bundle.containsKey(str5)) {
                editMetadata.putString(2, bundle.getString(str5));
            }
            String str6 = "android.media.metadata.AUTHOR";
            if (bundle.containsKey(str6)) {
                editMetadata.putString(3, bundle.getString(str6));
            }
            String str7 = "android.media.metadata.COMPILATION";
            if (bundle.containsKey(str7)) {
                editMetadata.putString(15, bundle.getString(str7));
            }
            String str8 = "android.media.metadata.COMPOSER";
            if (bundle.containsKey(str8)) {
                editMetadata.putString(4, bundle.getString(str8));
            }
            String str9 = "android.media.metadata.DATE";
            if (bundle.containsKey(str9)) {
                editMetadata.putString(5, bundle.getString(str9));
            }
            String str10 = "android.media.metadata.DISC_NUMBER";
            if (bundle.containsKey(str10)) {
                editMetadata.putLong(14, bundle.getLong(str10));
            }
            String str11 = "android.media.metadata.DURATION";
            if (bundle.containsKey(str11)) {
                editMetadata.putLong(9, bundle.getLong(str11));
            }
            String str12 = "android.media.metadata.GENRE";
            if (bundle.containsKey(str12)) {
                editMetadata.putString(6, bundle.getString(str12));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                editMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                editMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                editMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
            return editMetadata;
        }

        /* renamed from: a */
        public void mo200a(int i) {
            if (this.f82A != i) {
                this.f82A = i;
                m228f(i);
            }
        }

        /* renamed from: a */
        public void mo205a(C0753b bVar) {
            synchronized (this.f97k) {
                this.f103q = bVar;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo214a(PendingIntent pendingIntent, ComponentName componentName) {
            this.f95i.registerMediaButtonEventReceiver(componentName);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo271a(int i, int i2) {
            if (this.f84C == 2) {
                C0757f fVar = this.f86E;
                if (fVar != null) {
                    fVar.mo4205a(i);
                    return;
                }
                return;
            }
            this.f95i.adjustStreamVolume(this.f85D, i, i2);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$j */
    public interface C0043j {
        /* renamed from: a */
        void mo283a();
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    /* renamed from: a */
    public void mo116a(C0027c cVar) {
        mo117a(cVar, (Handler) null);
    }

    /* renamed from: b */
    public Token mo120b() {
        return this.f49a.getSessionToken();
    }

    /* renamed from: c */
    public void mo122c() {
        this.f49a.mo199a();
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    /* renamed from: a */
    public void mo117a(C0027c cVar, Handler handler) {
        if (cVar == null) {
            this.f49a.mo203a(null, null);
            return;
        }
        C0030d dVar = this.f49a;
        if (handler == null) {
            handler = new Handler();
        }
        dVar.mo203a(cVar, handler);
    }

    /* renamed from: b */
    public void mo121b(int i) {
        this.f49a.setRepeatMode(i);
    }

    /* renamed from: c */
    public void mo123c(int i) {
        this.f49a.mo200a(i);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, C0992d dVar) {
        this.f51c = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                componentName = C0759a.m3836a(context);
                if (componentName == null) {
                    Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
            }
            ComponentName componentName2 = componentName;
            if (componentName2 != null && pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName2);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
            }
            PendingIntent pendingIntent2 = pendingIntent;
            int i = VERSION.SDK_INT;
            if (i >= 28) {
                this.f49a = new C0037h(context, str, dVar, bundle);
                mo116a((C0027c) new C0025a(this));
                this.f49a.mo201a(pendingIntent2);
            } else if (i >= 21) {
                this.f49a = new C0035g(context, str, dVar, bundle);
                mo116a((C0027c) new C0026b(this));
                this.f49a.mo201a(pendingIntent2);
            } else if (i >= 19) {
                C0033f fVar = new C0033f(context, str, componentName2, pendingIntent2, bundle);
                this.f49a = fVar;
            } else if (i >= 18) {
                C0031e eVar = new C0031e(context, str, componentName2, pendingIntent2, bundle);
                this.f49a = eVar;
            } else {
                C0038i iVar = new C0038i(context, str, componentName2, pendingIntent2, bundle);
                this.f49a = iVar;
            }
            this.f50b = new MediaControllerCompat(context, this);
            if (f48d == 0) {
                f48d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }

    /* renamed from: a */
    public void mo114a(int i) {
        this.f49a.mo208b(i);
    }

    /* renamed from: a */
    public void mo119a(boolean z) {
        this.f49a.mo206a(z);
        Iterator it = this.f51c.iterator();
        while (it.hasNext()) {
            ((C0043j) it.next()).mo283a();
        }
    }

    /* renamed from: a */
    public MediaControllerCompat mo113a() {
        return this.f50b;
    }

    /* renamed from: a */
    public void mo118a(PlaybackStateCompat playbackStateCompat) {
        this.f49a.mo204a(playbackStateCompat);
    }

    /* renamed from: a */
    public void mo115a(MediaMetadataCompat mediaMetadataCompat) {
        this.f49a.mo202a(mediaMetadataCompat);
    }

    /* renamed from: a */
    public static void m97a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: a */
    static PlaybackStateCompat m96a(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j = -1;
        if (playbackStateCompat.mo293c0() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.mo294d0() != 3 && playbackStateCompat.mo294d0() != 4 && playbackStateCompat.mo294d0() != 5) {
            return playbackStateCompat;
        }
        long Z = playbackStateCompat.mo290Z();
        if (Z <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long a0 = ((long) (playbackStateCompat.mo291a0() * ((float) (elapsedRealtime - Z)))) + playbackStateCompat.mo293c0();
        if (mediaMetadataCompat != null) {
            String str = "android.media.metadata.DURATION";
            if (mediaMetadataCompat.mo44a(str)) {
                j = mediaMetadataCompat.mo45b(str);
            }
        }
        long j2 = (j < 0 || a0 <= j) ? a0 < 0 ? 0 : a0 : j;
        C0047b bVar = new C0047b(playbackStateCompat);
        bVar.mo307a(playbackStateCompat.mo294d0(), j2, playbackStateCompat.mo291a0(), elapsedRealtime);
        return bVar.mo312a();
    }
}
