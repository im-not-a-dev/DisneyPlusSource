package p161f.p162a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import org.json.JSONException;

/* renamed from: f.a.f3 */
public class C4447f3 implements C4630y2 {

    /* renamed from: c */
    private static final String f11051c = C1557c.m7461a(C4447f3.class);

    /* renamed from: a */
    private boolean f11052a = false;

    /* renamed from: b */
    private final SharedPreferences f11053b;

    public C4447f3(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.storage.appboy_event_storage");
        sb.append(C1563i.m7484a(context, str, str2));
        this.f11053b = context.getSharedPreferences(sb.toString(), 0);
    }

    /* renamed from: a */
    public void mo15464a(C4432e1 e1Var) {
        if (this.f11052a) {
            String str = f11051c;
            StringBuilder sb = new StringBuilder();
            sb.append("Storage provider is closed. Not adding event: ");
            sb.append(e1Var);
            C1557c.m7473e(str, sb.toString());
            return;
        }
        Editor edit = this.f11053b.edit();
        String str2 = f11051c;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Adding event to storage with uid ");
        sb2.append(e1Var.mo15524g());
        C1557c.m7460a(str2, sb2.toString(), false);
        edit.putString(e1Var.mo15524g(), e1Var.mo15522e());
        edit.apply();
    }

    /* renamed from: b */
    public void mo15467b(List<C4432e1> list) {
        if (this.f11052a) {
            String str = f11051c;
            StringBuilder sb = new StringBuilder();
            sb.append("Storage provider is closed. Not deleting events: ");
            sb.append(list);
            C1557c.m7473e(str, sb.toString());
            return;
        }
        Editor edit = this.f11053b.edit();
        for (C4432e1 g : list) {
            String g2 = g.mo15524g();
            String str2 = f11051c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Deleting event from storage with uid ");
            sb2.append(g2);
            C1557c.m7460a(str2, sb2.toString(), false);
            edit.remove(g2);
        }
        edit.apply();
    }

    /* renamed from: d */
    public void mo15468d() {
        C1557c.m7473e(f11051c, "Setting this provider to closed.");
        this.f11052a = true;
    }

    /* renamed from: a */
    public void mo15465a(List<C4432e1> list) {
        if (this.f11052a) {
            String str = f11051c;
            StringBuilder sb = new StringBuilder();
            sb.append("Storage provider is closed. Not adding events: ");
            sb.append(list);
            C1557c.m7473e(str, sb.toString());
            return;
        }
        Editor edit = this.f11053b.edit();
        for (C4432e1 e1Var : list) {
            String str2 = f11051c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Adding event to storage with uid ");
            sb2.append(e1Var.mo15524g());
            C1557c.m7460a(str2, sb2.toString(), false);
            edit.putString(e1Var.mo15524g(), e1Var.mo15522e());
        }
        edit.apply();
    }

    /* renamed from: a */
    public Collection<C4432e1> mo15463a() {
        if (this.f11052a) {
            C1557c.m7473e(f11051c, "Storage provider is closed. Not getting all events.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Entry entry : this.f11053b.getAll().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            try {
                arrayList.add(C4548p1.m15785d(str2, str));
            } catch (JSONException unused) {
                String str3 = f11051c;
                StringBuilder sb = new StringBuilder();
                sb.append("Could not create AppboyEvent from [serialized event string=");
                sb.append(str2);
                sb.append(", unique identifier=");
                sb.append(str);
                sb.append("] ... Deleting!");
                C1557c.m7465b(str3, sb.toString());
                mo15551a(str);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15551a(String str) {
        Editor edit = this.f11053b.edit();
        edit.remove(str);
        edit.apply();
    }
}
