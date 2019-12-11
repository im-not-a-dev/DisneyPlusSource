package android.support.p001v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.media.session.PlaybackState.CustomAction.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Creator<PlaybackStateCompat> CREATOR = new C0046a();

    /* renamed from: U */
    final long f123U;

    /* renamed from: V */
    final long f124V;

    /* renamed from: W */
    final float f125W;

    /* renamed from: X */
    final long f126X;

    /* renamed from: Y */
    final int f127Y;

    /* renamed from: Z */
    final CharSequence f128Z;

    /* renamed from: a0 */
    final long f129a0;

    /* renamed from: b0 */
    List<CustomAction> f130b0;

    /* renamed from: c */
    final int f131c;

    /* renamed from: c0 */
    final long f132c0;

    /* renamed from: d0 */
    final Bundle f133d0;

    /* renamed from: e0 */
    private PlaybackState f134e0;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Creator<CustomAction> CREATOR = new C0045a();

        /* renamed from: U */
        private final CharSequence f135U;

        /* renamed from: V */
        private final int f136V;

        /* renamed from: W */
        private final Bundle f137W;

        /* renamed from: X */
        private android.media.session.PlaybackState.CustomAction f138X;

        /* renamed from: c */
        private final String f139c;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        static class C0045a implements Creator<CustomAction> {
            C0045a() {
            }

            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f139c = str;
            this.f135U = charSequence;
            this.f136V = i;
            this.f137W = bundle;
        }

        /* renamed from: a */
        public static CustomAction m309a(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            android.media.session.PlaybackState.CustomAction customAction = (android.media.session.PlaybackState.CustomAction) obj;
            CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), customAction.getExtras());
            customAction2.f138X = customAction;
            return customAction2;
        }

        /* renamed from: X */
        public String mo298X() {
            return this.f139c;
        }

        /* renamed from: Y */
        public Object mo299Y() {
            if (this.f138X != null || VERSION.SDK_INT < 21) {
                return this.f138X;
            }
            Builder builder = new Builder(this.f139c, this.f135U, this.f136V);
            builder.setExtras(this.f137W);
            return builder.build();
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Action:mName='");
            sb.append(this.f135U);
            sb.append(", mIcon=");
            sb.append(this.f136V);
            sb.append(", mExtras=");
            sb.append(this.f137W);
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f139c);
            TextUtils.writeToParcel(this.f135U, parcel, i);
            parcel.writeInt(this.f136V);
            parcel.writeBundle(this.f137W);
        }

        CustomAction(Parcel parcel) {
            this.f139c = parcel.readString();
            this.f135U = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f136V = parcel.readInt();
            this.f137W = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    static class C0046a implements Creator<PlaybackStateCompat> {
        C0046a() {
        }

        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$b */
    public static final class C0047b {

        /* renamed from: a */
        private final List<CustomAction> f140a = new ArrayList();

        /* renamed from: b */
        private int f141b;

        /* renamed from: c */
        private long f142c;

        /* renamed from: d */
        private long f143d;

        /* renamed from: e */
        private float f144e;

        /* renamed from: f */
        private long f145f;

        /* renamed from: g */
        private int f146g;

        /* renamed from: h */
        private CharSequence f147h;

        /* renamed from: i */
        private long f148i;

        /* renamed from: j */
        private long f149j = -1;

        /* renamed from: k */
        private Bundle f150k;

        public C0047b() {
        }

        /* renamed from: a */
        public C0047b mo307a(int i, long j, float f, long j2) {
            this.f141b = i;
            this.f142c = j;
            this.f148i = j2;
            this.f144e = f;
            return this;
        }

        /* renamed from: b */
        public C0047b mo313b(long j) {
            this.f149j = j;
            return this;
        }

        /* renamed from: c */
        public C0047b mo314c(long j) {
            this.f143d = j;
            return this;
        }

        public C0047b(PlaybackStateCompat playbackStateCompat) {
            this.f141b = playbackStateCompat.f131c;
            this.f142c = playbackStateCompat.f123U;
            this.f144e = playbackStateCompat.f125W;
            this.f148i = playbackStateCompat.f129a0;
            this.f143d = playbackStateCompat.f124V;
            this.f145f = playbackStateCompat.f126X;
            this.f146g = playbackStateCompat.f127Y;
            this.f147h = playbackStateCompat.f128Z;
            List<CustomAction> list = playbackStateCompat.f130b0;
            if (list != null) {
                this.f140a.addAll(list);
            }
            this.f149j = playbackStateCompat.f132c0;
            this.f150k = playbackStateCompat.f133d0;
        }

        /* renamed from: a */
        public C0047b mo309a(long j) {
            this.f145f = j;
            return this;
        }

        /* renamed from: a */
        public C0047b mo311a(CustomAction customAction) {
            if (customAction != null) {
                this.f140a.add(customAction);
                return this;
            }
            throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
        }

        /* renamed from: a */
        public C0047b mo308a(int i, CharSequence charSequence) {
            this.f146g = i;
            this.f147h = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0047b mo310a(Bundle bundle) {
            this.f150k = bundle;
            return this;
        }

        /* renamed from: a */
        public PlaybackStateCompat mo312a() {
            PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(this.f141b, this.f142c, this.f143d, this.f144e, this.f145f, this.f146g, this.f147h, this.f148i, this.f140a, this.f149j, this.f150k);
            return playbackStateCompat;
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f131c = i;
        this.f123U = j;
        this.f124V = j2;
        this.f125W = f;
        this.f126X = j3;
        this.f127Y = i2;
        this.f128Z = charSequence;
        this.f129a0 = j4;
        this.f130b0 = new ArrayList(list);
        this.f132c0 = j5;
        this.f133d0 = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m301a(Object obj) {
        List list;
        Bundle bundle = null;
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<Object> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList = new ArrayList(customActions.size());
            for (Object a : customActions) {
                arrayList.add(CustomAction.m309a(a));
            }
            list = arrayList;
        } else {
            list = null;
        }
        if (VERSION.SDK_INT >= 22) {
            bundle = playbackState.getExtras();
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), list, playbackState.getActiveQueueItemId(), bundle);
        playbackStateCompat.f134e0 = playbackState;
        return playbackStateCompat;
    }

    /* renamed from: X */
    public long mo288X() {
        return this.f126X;
    }

    /* renamed from: Y */
    public long mo289Y() {
        return this.f132c0;
    }

    /* renamed from: Z */
    public long mo290Z() {
        return this.f129a0;
    }

    /* renamed from: a0 */
    public float mo291a0() {
        return this.f125W;
    }

    /* renamed from: b0 */
    public Object mo292b0() {
        if (this.f134e0 == null && VERSION.SDK_INT >= 21) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(this.f131c, this.f123U, this.f125W, this.f129a0);
            builder.setBufferedPosition(this.f124V);
            builder.setActions(this.f126X);
            builder.setErrorMessage(this.f128Z);
            for (CustomAction Y : this.f130b0) {
                builder.addCustomAction((android.media.session.PlaybackState.CustomAction) Y.mo299Y());
            }
            builder.setActiveQueueItemId(this.f132c0);
            if (VERSION.SDK_INT >= 22) {
                builder.setExtras(this.f133d0);
            }
            this.f134e0 = builder.build();
        }
        return this.f134e0;
    }

    /* renamed from: c0 */
    public long mo293c0() {
        return this.f123U;
    }

    /* renamed from: d0 */
    public int mo294d0() {
        return this.f131c;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.f131c);
        sb.append(", position=");
        sb.append(this.f123U);
        sb.append(", buffered position=");
        sb.append(this.f124V);
        sb.append(", speed=");
        sb.append(this.f125W);
        sb.append(", updated=");
        sb.append(this.f129a0);
        sb.append(", actions=");
        sb.append(this.f126X);
        sb.append(", error code=");
        sb.append(this.f127Y);
        sb.append(", error message=");
        sb.append(this.f128Z);
        sb.append(", custom actions=");
        sb.append(this.f130b0);
        sb.append(", active item id=");
        sb.append(this.f132c0);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f131c);
        parcel.writeLong(this.f123U);
        parcel.writeFloat(this.f125W);
        parcel.writeLong(this.f129a0);
        parcel.writeLong(this.f124V);
        parcel.writeLong(this.f126X);
        TextUtils.writeToParcel(this.f128Z, parcel, i);
        parcel.writeTypedList(this.f130b0);
        parcel.writeLong(this.f132c0);
        parcel.writeBundle(this.f133d0);
        parcel.writeInt(this.f127Y);
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f131c = parcel.readInt();
        this.f123U = parcel.readLong();
        this.f125W = parcel.readFloat();
        this.f129a0 = parcel.readLong();
        this.f124V = parcel.readLong();
        this.f126X = parcel.readLong();
        this.f128Z = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f130b0 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f132c0 = parcel.readLong();
        this.f133d0 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f127Y = parcel.readInt();
    }
}
