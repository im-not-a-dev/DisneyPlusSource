package android.support.p001v4.media.session;

import android.app.Activity;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.C0048a.C0049a;
import android.support.p001v4.media.session.C0051b.C0052a;
import android.support.p001v4.media.session.MediaSessionCompat.QueueItem;
import android.support.p001v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import androidx.core.app.C0472e;
import androidx.core.app.C0474f;
import androidx.core.app.C0474f.C0475a;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesCompat.C0747a;
import androidx.versionedparcelable.C0989a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: a */
    private final C0019c f35a;

    /* renamed from: b */
    private final Token f36b;

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    static class MediaControllerImplApi21 implements C0019c {

        /* renamed from: a */
        protected final MediaController f37a;

        /* renamed from: b */
        final Object f38b = new Object();

        /* renamed from: c */
        private final List<C0014a> f39c = new ArrayList();

        /* renamed from: d */
        private HashMap<C0014a, C0013a> f40d = new HashMap<>();

        /* renamed from: e */
        final Token f41e;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: c */
            private WeakReference<MediaControllerImplApi21> f42c;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f42c = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f42c.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f38b) {
                        mediaControllerImplApi21.f41e.mo138a(C0052a.m380a(C0472e.m2509a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f41e.mo139a(C0989a.m5310a(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                        mediaControllerImplApi21.mo78a();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        private static class C0013a extends C0017c {
            C0013a(C0014a aVar) {
                super(aVar);
            }

            /* renamed from: a */
            public void mo83a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: d */
            public void mo87d() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo86a(List<QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo85a(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo82a(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo84a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, Token token) throws RemoteException {
            this.f41e = token;
            this.f37a = new MediaController(context, (MediaSession.Token) this.f41e.mo137Z());
            if (this.f37a == null) {
                throw new RemoteException();
            } else if (this.f41e.mo135X() == null) {
                m63b();
            }
        }

        /* renamed from: b */
        private void m63b() {
            mo79a("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        /* renamed from: Z */
        public List<QueueItem> mo77Z() {
            List queue = this.f37a.getQueue();
            if (queue != null) {
                return QueueItem.m110a(queue);
            }
            return null;
        }

        /* renamed from: a */
        public void mo79a(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f37a.sendCommand(str, bundle, resultReceiver);
        }

        public PlaybackStateCompat getPlaybackState() {
            if (this.f41e.mo135X() != null) {
                try {
                    return this.f41e.mo135X().getPlaybackState();
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
                }
            }
            PlaybackState playbackState = this.f37a.getPlaybackState();
            return playbackState != null ? PlaybackStateCompat.m301a(playbackState) : null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo78a() {
            if (this.f41e.mo135X() != null) {
                for (C0014a aVar : this.f39c) {
                    C0013a aVar2 = new C0013a(aVar);
                    this.f40d.put(aVar, aVar2);
                    aVar.f44b = aVar2;
                    try {
                        this.f41e.mo135X().mo233a((C0048a) aVar2);
                        aVar.mo89a(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                }
                this.f39c.clear();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0014a implements DeathRecipient {

        /* renamed from: a */
        C0016b f43a;

        /* renamed from: b */
        C0048a f44b;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        private static class C0015a extends Callback {

            /* renamed from: a */
            private final WeakReference<C0014a> f45a;

            C0015a(C0014a aVar) {
                this.f45a = new WeakReference<>(aVar);
            }

            public void onAudioInfoChanged(PlaybackInfo playbackInfo) {
                C0014a aVar = (C0014a) this.f45a.get();
                if (aVar != null) {
                    C0021e eVar = new C0021e(playbackInfo.getPlaybackType(), AudioAttributesCompat.m3818a((Object) playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
                    aVar.mo92a(eVar);
                }
            }

            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.m97a(bundle);
                C0014a aVar = (C0014a) this.f45a.get();
                if (aVar != null) {
                    aVar.mo90a(bundle);
                }
            }

            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                C0014a aVar = (C0014a) this.f45a.get();
                if (aVar != null) {
                    aVar.mo91a(MediaMetadataCompat.m28a((Object) mediaMetadata));
                }
            }

            public void onPlaybackStateChanged(PlaybackState playbackState) {
                C0014a aVar = (C0014a) this.f45a.get();
                if (aVar != null && aVar.f44b == null) {
                    aVar.mo93a(PlaybackStateCompat.m301a(playbackState));
                }
            }

            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                C0014a aVar = (C0014a) this.f45a.get();
                if (aVar != null) {
                    aVar.mo96a(QueueItem.m110a(list));
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) {
                C0014a aVar = (C0014a) this.f45a.get();
                if (aVar != null) {
                    aVar.mo94a(charSequence);
                }
            }

            public void onSessionDestroyed() {
                C0014a aVar = (C0014a) this.f45a.get();
                if (aVar != null) {
                    aVar.mo88a();
                }
            }

            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.m97a(bundle);
                C0014a aVar = (C0014a) this.f45a.get();
                if (aVar == null) {
                    return;
                }
                if (aVar.f44b == null || VERSION.SDK_INT >= 23) {
                    aVar.mo95a(str, bundle);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        private class C0016b extends Handler {
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        private static class C0017c extends C0049a {

            /* renamed from: a */
            private final WeakReference<C0014a> f46a;

            C0017c(C0014a aVar) {
                this.f46a = new WeakReference<>(aVar);
            }

            /* renamed from: a */
            public void mo106a(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                C0014a aVar = (C0014a) this.f46a.get();
                if (aVar != null) {
                    aVar.mo89a(2, playbackStateCompat, null);
                }
            }

            /* renamed from: b */
            public void mo108b(boolean z) throws RemoteException {
            }

            /* renamed from: c */
            public void mo109c() throws RemoteException {
                C0014a aVar = (C0014a) this.f46a.get();
                if (aVar != null) {
                    aVar.mo89a(13, null, null);
                }
            }

            /* renamed from: d */
            public void mo87d() throws RemoteException {
                C0014a aVar = (C0014a) this.f46a.get();
                if (aVar != null) {
                    aVar.mo89a(8, null, null);
                }
            }

            /* renamed from: f */
            public void mo111f(String str, Bundle bundle) throws RemoteException {
                C0014a aVar = (C0014a) this.f46a.get();
                if (aVar != null) {
                    aVar.mo89a(1, str, bundle);
                }
            }

            public void onRepeatModeChanged(int i) throws RemoteException {
                C0014a aVar = (C0014a) this.f46a.get();
                if (aVar != null) {
                    aVar.mo89a(9, Integer.valueOf(i), null);
                }
            }

            /* renamed from: a */
            public void mo83a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                C0014a aVar = (C0014a) this.f46a.get();
                if (aVar != null) {
                    aVar.mo89a(3, mediaMetadataCompat, null);
                }
            }

            /* renamed from: d */
            public void mo110d(int i) throws RemoteException {
                C0014a aVar = (C0014a) this.f46a.get();
                if (aVar != null) {
                    aVar.mo89a(12, Integer.valueOf(i), null);
                }
            }

            /* renamed from: a */
            public void mo86a(List<QueueItem> list) throws RemoteException {
                C0014a aVar = (C0014a) this.f46a.get();
                if (aVar != null) {
                    aVar.mo89a(5, list, null);
                }
            }

            /* renamed from: a */
            public void mo85a(CharSequence charSequence) throws RemoteException {
                C0014a aVar = (C0014a) this.f46a.get();
                if (aVar != null) {
                    aVar.mo89a(6, charSequence, null);
                }
            }

            /* renamed from: a */
            public void mo107a(boolean z) throws RemoteException {
                C0014a aVar = (C0014a) this.f46a.get();
                if (aVar != null) {
                    aVar.mo89a(11, Boolean.valueOf(z), null);
                }
            }

            /* renamed from: a */
            public void mo82a(Bundle bundle) throws RemoteException {
                C0014a aVar = (C0014a) this.f46a.get();
                if (aVar != null) {
                    aVar.mo89a(7, bundle, null);
                }
            }

            /* renamed from: a */
            public void mo84a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                C0014a aVar = (C0014a) this.f46a.get();
                if (aVar != null) {
                    aVar.mo89a(4, parcelableVolumeInfo != null ? new C0021e(parcelableVolumeInfo.f122c, parcelableVolumeInfo.f118U, parcelableVolumeInfo.f119V, parcelableVolumeInfo.f120W, parcelableVolumeInfo.f121X) : null, null);
                }
            }
        }

        public C0014a() {
            if (VERSION.SDK_INT >= 21) {
                new C0015a(this);
            } else {
                this.f44b = new C0017c(this);
            }
        }

        /* renamed from: a */
        public void mo88a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo89a(int i, Object obj, Bundle bundle) {
            C0016b bVar = this.f43a;
            if (bVar != null) {
                Message obtainMessage = bVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* renamed from: a */
        public void mo90a(Bundle bundle) {
        }

        /* renamed from: a */
        public void mo91a(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: a */
        public void mo92a(C0021e eVar) {
        }

        /* renamed from: a */
        public void mo93a(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: a */
        public void mo94a(CharSequence charSequence) {
        }

        /* renamed from: a */
        public void mo95a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo96a(List<QueueItem> list) {
        }

        public void binderDied() {
            mo89a(8, null, null);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    private static class C0018b extends C0475a {
        C0018b(MediaControllerCompat mediaControllerCompat) {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    interface C0019c {
        /* renamed from: Z */
        List<QueueItem> mo77Z();

        PlaybackStateCompat getPlaybackState();
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    static class C0020d implements C0019c {

        /* renamed from: a */
        private C0051b f47a;

        public C0020d(Token token) {
            this.f47a = C0052a.m380a((IBinder) token.mo137Z());
        }

        /* renamed from: Z */
        public List<QueueItem> mo77Z() {
            try {
                return this.f47a.mo222Z();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getQueue.", e);
                return null;
            }
        }

        public PlaybackStateCompat getPlaybackState() {
            try {
                return this.f47a.getPlaybackState();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
                return null;
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$e */
    public static final class C0021e {
        C0021e(int i, int i2, int i3, int i4, int i5) {
            C0747a aVar = new C0747a();
            aVar.mo4186a(i2);
            this(i, aVar.mo4187a(), i3, i4, i5);
        }

        C0021e(int i, AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        new ConcurrentHashMap();
        if (mediaSessionCompat != null) {
            this.f36b = mediaSessionCompat.mo120b();
            C0019c cVar = null;
            try {
                if (VERSION.SDK_INT >= 21) {
                    cVar = new MediaControllerImplApi21(context, this.f36b);
                } else {
                    cVar = new C0020d(this.f36b);
                }
            } catch (RemoteException e) {
                Log.w("MediaControllerCompat", "Failed to create MediaControllerImpl.", e);
            }
            this.f35a = cVar;
            return;
        }
        throw new IllegalArgumentException("session must not be null");
    }

    /* renamed from: a */
    public static void m59a(Activity activity, MediaControllerCompat mediaControllerCompat) {
        if (activity instanceof C0474f) {
            ((C0474f) activity).putExtraData(new C0018b(mediaControllerCompat));
        }
        if (VERSION.SDK_INT >= 21) {
            MediaController mediaController = null;
            if (mediaControllerCompat != null) {
                mediaController = new MediaController(activity, (MediaSession.Token) mediaControllerCompat.mo76c().mo137Z());
            }
            activity.setMediaController(mediaController);
        }
    }

    /* renamed from: b */
    public List<QueueItem> mo75b() {
        return this.f35a.mo77Z();
    }

    /* renamed from: c */
    public Token mo76c() {
        return this.f36b;
    }

    /* renamed from: a */
    public PlaybackStateCompat mo74a() {
        return this.f35a.getPlaybackState();
    }
}
