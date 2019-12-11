package android.support.p001v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.MediaSessionCompat.QueueItem;
import java.util.List;

/* renamed from: android.support.v4.media.session.a */
/* compiled from: IMediaControllerCallback */
public interface C0048a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a */
    /* compiled from: IMediaControllerCallback */
    public static abstract class C0049a extends Binder implements C0048a {

        /* renamed from: android.support.v4.media.session.a$a$a */
        /* compiled from: IMediaControllerCallback */
        private static class C0050a implements C0048a {

            /* renamed from: a */
            private IBinder f151a;

            C0050a(IBinder iBinder) {
                this.f151a = iBinder;
            }

            /* renamed from: a */
            public void mo106a(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f151a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f151a;
            }

            /* renamed from: d */
            public void mo87d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.f151a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onRepeatModeChanged(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i);
                    this.f151a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo110d(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i);
                    this.f151a.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo83a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f151a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0049a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        /* renamed from: a */
        public static C0048a m332a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0048a)) {
                return new C0050a(iBinder);
            }
            return (C0048a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v1, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r3v3, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r3v4, types: [android.support.v4.media.session.PlaybackStateCompat] */
        /* JADX WARNING: type inference failed for: r3v6, types: [android.support.v4.media.session.PlaybackStateCompat] */
        /* JADX WARNING: type inference failed for: r3v7, types: [android.support.v4.media.MediaMetadataCompat] */
        /* JADX WARNING: type inference failed for: r3v9, types: [android.support.v4.media.MediaMetadataCompat] */
        /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r3v12, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r3v13, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r3v15, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r3v16, types: [android.support.v4.media.session.ParcelableVolumeInfo] */
        /* JADX WARNING: type inference failed for: r3v18, types: [android.support.v4.media.session.ParcelableVolumeInfo] */
        /* JADX WARNING: type inference failed for: r3v19 */
        /* JADX WARNING: type inference failed for: r3v20 */
        /* JADX WARNING: type inference failed for: r3v21 */
        /* JADX WARNING: type inference failed for: r3v22 */
        /* JADX WARNING: type inference failed for: r3v23 */
        /* JADX WARNING: type inference failed for: r3v24 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.support.v4.media.session.PlaybackStateCompat, android.os.Bundle, android.support.v4.media.MediaMetadataCompat, java.lang.CharSequence, android.support.v4.media.session.ParcelableVolumeInfo]
          uses: [android.os.Bundle, android.support.v4.media.session.PlaybackStateCompat, android.support.v4.media.MediaMetadataCompat, java.lang.CharSequence, android.support.v4.media.session.ParcelableVolumeInfo]
          mth insns count: 101
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
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 7 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                if (r5 == r0) goto L_0x00e7
                r0 = 0
                r3 = 0
                switch(r5) {
                    case 1: goto L_0x00cd;
                    case 2: goto L_0x00c6;
                    case 3: goto L_0x00b0;
                    case 4: goto L_0x009a;
                    case 5: goto L_0x008d;
                    case 6: goto L_0x0077;
                    case 7: goto L_0x0061;
                    case 8: goto L_0x004b;
                    case 9: goto L_0x0040;
                    case 10: goto L_0x0032;
                    case 11: goto L_0x0024;
                    case 12: goto L_0x0019;
                    case 13: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0012:
                r6.enforceInterface(r2)
                r4.mo109c()
                return r1
            L_0x0019:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.mo110d(r5)
                return r1
            L_0x0024:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x002e
                r0 = 1
            L_0x002e:
                r4.mo107a(r0)
                return r1
            L_0x0032:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x003c
                r0 = 1
            L_0x003c:
                r4.mo108b(r0)
                return r1
            L_0x0040:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.onRepeatModeChanged(r5)
                return r1
            L_0x004b:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x005d
                android.os.Parcelable$Creator<android.support.v4.media.session.ParcelableVolumeInfo> r5 = android.support.p001v4.media.session.ParcelableVolumeInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.session.ParcelableVolumeInfo r3 = (android.support.p001v4.media.session.ParcelableVolumeInfo) r3
            L_0x005d:
                r4.mo84a(r3)
                return r1
            L_0x0061:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0073
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0073:
                r4.mo82a(r3)
                return r1
            L_0x0077:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0089
                android.os.Parcelable$Creator r5 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            L_0x0089:
                r4.mo85a(r3)
                return r1
            L_0x008d:
                r6.enforceInterface(r2)
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> r5 = android.support.p001v4.media.session.MediaSessionCompat.QueueItem.CREATOR
                java.util.ArrayList r5 = r6.createTypedArrayList(r5)
                r4.mo86a(r5)
                return r1
            L_0x009a:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00ac
                android.os.Parcelable$Creator<android.support.v4.media.MediaMetadataCompat> r5 = android.support.p001v4.media.MediaMetadataCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.MediaMetadataCompat r3 = (android.support.p001v4.media.MediaMetadataCompat) r3
            L_0x00ac:
                r4.mo83a(r3)
                return r1
            L_0x00b0:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00c2
                android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat> r5 = android.support.p001v4.media.session.PlaybackStateCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.session.PlaybackStateCompat r3 = (android.support.p001v4.media.session.PlaybackStateCompat) r3
            L_0x00c2:
                r4.mo106a(r3)
                return r1
            L_0x00c6:
                r6.enforceInterface(r2)
                r4.mo87d()
                return r1
            L_0x00cd:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r7 = r6.readInt()
                if (r7 == 0) goto L_0x00e3
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r7.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x00e3:
                r4.mo111f(r5, r3)
                return r1
            L_0x00e7:
                r7.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.media.session.C0048a.C0049a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo82a(Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo83a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    /* renamed from: a */
    void mo84a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    /* renamed from: a */
    void mo106a(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    /* renamed from: a */
    void mo85a(CharSequence charSequence) throws RemoteException;

    /* renamed from: a */
    void mo86a(List<QueueItem> list) throws RemoteException;

    /* renamed from: a */
    void mo107a(boolean z) throws RemoteException;

    /* renamed from: b */
    void mo108b(boolean z) throws RemoteException;

    /* renamed from: c */
    void mo109c() throws RemoteException;

    /* renamed from: d */
    void mo87d() throws RemoteException;

    /* renamed from: d */
    void mo110d(int i) throws RemoteException;

    /* renamed from: f */
    void mo111f(String str, Bundle bundle) throws RemoteException;

    void onRepeatModeChanged(int i) throws RemoteException;
}
