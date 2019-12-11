package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C0990b;
import androidx.versionedparcelable.C0992d;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C0990b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2073a = (IconCompat) bVar.mo5452a(remoteActionCompat.f2073a, 1);
        remoteActionCompat.f2074b = bVar.mo5454a(remoteActionCompat.f2074b, 2);
        remoteActionCompat.f2075c = bVar.mo5454a(remoteActionCompat.f2075c, 3);
        remoteActionCompat.f2076d = (PendingIntent) bVar.mo5451a(remoteActionCompat.f2076d, 4);
        remoteActionCompat.f2077e = bVar.mo5466a(remoteActionCompat.f2077e, 5);
        remoteActionCompat.f2078f = bVar.mo5466a(remoteActionCompat.f2078f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C0990b bVar) {
        bVar.mo5463a(false, false);
        bVar.mo5472b((C0992d) remoteActionCompat.f2073a, 1);
        bVar.mo5473b(remoteActionCompat.f2074b, 2);
        bVar.mo5473b(remoteActionCompat.f2075c, 3);
        bVar.mo5471b((Parcelable) remoteActionCompat.f2076d, 4);
        bVar.mo5475b(remoteActionCompat.f2077e, 5);
        bVar.mo5475b(remoteActionCompat.f2078f, 6);
    }
}
