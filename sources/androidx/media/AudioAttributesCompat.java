package androidx.media;

import android.media.AudioAttributes;
import android.os.Build.VERSION;
import android.util.SparseIntArray;
import androidx.media.C0751a.C0752a;
import androidx.versionedparcelable.C0992d;

public class AudioAttributesCompat implements C0992d {

    /* renamed from: b */
    private static final SparseIntArray f3038b = new SparseIntArray();

    /* renamed from: c */
    static boolean f3039c;

    /* renamed from: a */
    public C0751a f3040a;

    /* renamed from: androidx.media.AudioAttributesCompat$a */
    public static class C0747a {

        /* renamed from: a */
        final C0752a f3041a;

        public C0747a() {
            if (AudioAttributesCompat.f3039c) {
                this.f3041a = new C0750a();
                return;
            }
            int i = VERSION.SDK_INT;
            if (i >= 26) {
                this.f3041a = new C0749a();
            } else if (i >= 21) {
                this.f3041a = new C0748a();
            } else {
                this.f3041a = new C0750a();
            }
        }

        /* renamed from: a */
        public AudioAttributesCompat mo4187a() {
            return new AudioAttributesCompat(this.f3041a.build());
        }

        /* renamed from: a */
        public C0747a mo4186a(int i) {
            this.f3041a.mo4191a(i);
            return this;
        }
    }

    static {
        f3038b.put(5, 1);
        f3038b.put(6, 2);
        f3038b.put(7, 2);
        f3038b.put(8, 1);
        f3038b.put(9, 1);
        f3038b.put(10, 1);
    }

    AudioAttributesCompat() {
    }

    /* renamed from: a */
    public static AudioAttributesCompat m3818a(Object obj) {
        if (f3039c) {
            return null;
        }
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj));
        }
        if (i >= 21) {
            return new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes) obj));
        }
        return null;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        C0751a aVar = this.f3040a;
        if (aVar != null) {
            return aVar.equals(audioAttributesCompat.f3040a);
        }
        if (audioAttributesCompat.f3040a == null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.f3040a.hashCode();
    }

    public String toString() {
        return this.f3040a.toString();
    }

    AudioAttributesCompat(C0751a aVar) {
        this.f3040a = aVar;
    }

    /* renamed from: a */
    static String m3819a(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 16:
                return "USAGE_ASSISTANT";
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("unknown usage ");
                sb.append(i);
                return sb.toString();
        }
    }

    /* renamed from: a */
    static int m3817a(boolean z, int i, int i2) {
        int i3 = 1;
        if ((i & 1) == 1) {
            if (!z) {
                i3 = 7;
            }
            return i3;
        }
        int i4 = 0;
        if ((i & 4) == 4) {
            if (!z) {
                i4 = 6;
            }
            return i4;
        }
        switch (i2) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                break;
            case 3:
                if (!z) {
                    i4 = 8;
                    break;
                }
                break;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            default:
                if (!z) {
                    return 3;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown usage value ");
                sb.append(i2);
                sb.append(" in audio attributes");
                throw new IllegalArgumentException(sb.toString());
        }
        return i4;
    }
}
