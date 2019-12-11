package p161f.p162a;

import android.content.Context;
import com.appboy.p024n.C1491c;

/* renamed from: f.a.m6 */
public class C4514m6 extends C1491c {
    public C4514m6(Context context) {
        super(context);
    }

    /* renamed from: a */
    public long mo15696a() {
        return (long) (mo6734a("com_appboy_data_flush_interval_bad_network", 60) * 1000);
    }

    /* renamed from: b */
    public long mo15697b() {
        return (long) (mo6734a("com_appboy_data_flush_interval_good_network", 30) * 1000);
    }

    /* renamed from: c */
    public long mo15698c() {
        return (long) (mo6734a("com_appboy_data_flush_interval_great_network", 10) * 1000);
    }
}
