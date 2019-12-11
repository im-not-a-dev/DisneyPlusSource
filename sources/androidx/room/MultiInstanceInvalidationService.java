package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C0922c.C0923a;
import p096e.p113e.C3942j;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: U */
    final C3942j<String> f3687U = new C3942j<>();

    /* renamed from: V */
    final RemoteCallbackList<C0919b> f3688V = new C0913a();

    /* renamed from: W */
    private final C0923a f3689W = new C0914b();

    /* renamed from: c */
    int f3690c = 0;

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    class C0913a extends RemoteCallbackList<C0919b> {
        C0913a() {
        }

        /* renamed from: a */
        public void onCallbackDied(C0919b bVar, Object obj) {
            MultiInstanceInvalidationService.this.f3687U.mo14181d(((Integer) obj).intValue());
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    class C0914b extends C0923a {
        C0914b() {
        }

        /* renamed from: a */
        public int mo5202a(C0919b bVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f3688V) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f3690c + 1;
                multiInstanceInvalidationService.f3690c = i;
                if (MultiInstanceInvalidationService.this.f3688V.register(bVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f3687U.mo14174a(i, str);
                    return i;
                }
                MultiInstanceInvalidationService.this.f3690c--;
                return 0;
            }
        }

        /* renamed from: a */
        public void mo5204a(C0919b bVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.f3688V) {
                MultiInstanceInvalidationService.this.f3688V.unregister(bVar);
                MultiInstanceInvalidationService.this.f3687U.mo14181d(i);
            }
        }

        /* renamed from: a */
        public void mo5203a(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f3688V) {
                String str = (String) MultiInstanceInvalidationService.this.f3687U.mo14172a(i);
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f3688V.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f3688V.getBroadcastCookie(i2)).intValue();
                        String str2 = (String) MultiInstanceInvalidationService.this.f3687U.mo14172a(intValue);
                        if (i != intValue && str.equals(str2)) {
                            ((C0919b) MultiInstanceInvalidationService.this.f3688V.getBroadcastItem(i2)).mo5248a(strArr);
                        }
                    } catch (RemoteException e) {
                        Log.w("ROOM", "Error invoking a remote callback", e);
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.f3688V.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.f3688V.finishBroadcast();
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f3689W;
    }
}
