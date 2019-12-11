package p161f.p162a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.appboy.p033s.C1557c;
import com.bamtech.sdk4.internal.media.StreamSampleTelemetryData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;

@Deprecated
/* renamed from: f.a.b3 */
public class C4406b3 implements C4630y2 {

    /* renamed from: d */
    private static final String f10972d = C1557c.m7461a(C4406b3.class);

    /* renamed from: e */
    private static final String[] f10973e = {"session_id", "user_id", "event_type", "event_data", "event_guid", StreamSampleTelemetryData.TIMESTAMP_KEY};

    /* renamed from: a */
    private SQLiteDatabase f10974a;

    /* renamed from: b */
    private boolean f10975b = false;

    /* renamed from: c */
    private final C4568r2 f10976c;

    public C4406b3(C4568r2 r2Var) {
        this.f10976c = r2Var;
    }

    /* renamed from: a */
    public void mo15464a(C4432e1 e1Var) {
        if (this.f10975b) {
            String str = f10972d;
            StringBuilder sb = new StringBuilder();
            sb.append("Storage provider is closed. Not adding event: ");
            sb.append(e1Var);
            C1557c.m7473e(str, sb.toString());
            return;
        }
        if (mo15466b().insert("ab_events", null, m15205b(e1Var)) == -1) {
            String str2 = f10972d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to add event [");
            sb2.append(e1Var.toString());
            sb2.append("] to storage");
            C1557c.m7473e(str2, sb2.toString());
        }
    }

    /* renamed from: b */
    public synchronized SQLiteDatabase mo15466b() {
        if (this.f10974a == null || !this.f10974a.isOpen()) {
            this.f10974a = this.f10976c.getWritableDatabase();
        }
        return this.f10974a;
    }

    /* renamed from: d */
    public void mo15468d() {
        C1557c.m7473e(f10972d, "Closing SQL database and setting this provider to closed.");
        this.f10975b = true;
        mo15466b().close();
    }

    /* renamed from: b */
    public void mo15467b(List<C4432e1> list) {
        if (this.f10975b) {
            String str = f10972d;
            StringBuilder sb = new StringBuilder();
            sb.append("Storage provider is closed. Not deleting events: ");
            sb.append(list);
            C1557c.m7473e(str, sb.toString());
            return;
        }
        C1557c.m7458a(f10972d, "Running batch deletion for SQL table.");
        mo15466b().beginTransaction();
        try {
            StringBuilder sb2 = new StringBuilder("event_guid");
            sb2.append(" in (");
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = ((C4432e1) list.get(i)).mo15524g();
                sb2.append('?');
                if (i < list.size() - 1) {
                    sb2.append(',');
                }
            }
            sb2.append(')');
            int delete = mo15466b().delete("ab_events", sb2.toString(), strArr);
            String str2 = f10972d;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Deleting events removed ");
            sb3.append(delete);
            sb3.append(" row(s).");
            C1557c.m7460a(str2, sb3.toString(), false);
            mo15466b().setTransactionSuccessful();
        } finally {
            mo15466b().endTransaction();
        }
    }

    /* renamed from: a */
    public void mo15465a(List<C4432e1> list) {
        throw new UnsupportedOperationException("Batch SQL event add is not supported");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.database.Cursor, java.util.Collection<f.a.e1>] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0, types: [android.database.Cursor, java.util.Collection<f.a.e1>]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.database.Cursor, java.util.Collection<f.a.e1>]
      mth insns count: 20
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<p161f.p162a.C4432e1> mo15463a() {
        /*
            r11 = this;
            boolean r0 = r11.f10975b
            r1 = 0
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = f10972d
            java.lang.String r2 = "Storage provider is closed. Not getting all events."
            com.appboy.p033s.C1557c.m7473e(r0, r2)
            return r1
        L_0x000d:
            android.database.sqlite.SQLiteDatabase r3 = r11.mo15466b()     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "ab_events"
            java.lang.String[] r5 = f10973e     // Catch:{ all -> 0x0028 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0028 }
            java.util.Collection r0 = r11.m15204a(r1)     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0027
            r1.close()
        L_0x0027:
            return r0
        L_0x0028:
            r0 = move-exception
            if (r1 == 0) goto L_0x002e
            r1.close()
        L_0x002e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4406b3.mo15463a():java.util.Collection");
    }

    /* renamed from: a */
    private Collection<C4432e1> m15204a(Cursor cursor) {
        Cursor cursor2 = cursor;
        ArrayList arrayList = new ArrayList();
        int columnIndex = cursor2.getColumnIndex("session_id");
        int columnIndex2 = cursor2.getColumnIndex("user_id");
        int columnIndex3 = cursor2.getColumnIndex("event_type");
        int columnIndex4 = cursor2.getColumnIndex("event_data");
        int columnIndex5 = cursor2.getColumnIndex("event_guid");
        int columnIndex6 = cursor2.getColumnIndex(StreamSampleTelemetryData.TIMESTAMP_KEY);
        while (cursor.moveToNext()) {
            String string = cursor2.getString(columnIndex3);
            String string2 = cursor2.getString(columnIndex4);
            double d = cursor2.getDouble(columnIndex6);
            String string3 = cursor2.getString(columnIndex5);
            String string4 = cursor2.getString(columnIndex2);
            String str = string;
            String string5 = cursor2.getString(columnIndex);
            String str2 = string3;
            String str3 = string4;
            int i = columnIndex;
            int i2 = columnIndex2;
            double d2 = d;
            String str4 = string2;
            try {
                arrayList.add(C4548p1.m15766a(str, string2, d, str2, str3, string5));
            } catch (JSONException unused) {
                String str5 = f10972d;
                StringBuilder sb = new StringBuilder();
                sb.append("Could not create AppboyEvent from [type=");
                sb.append(string);
                sb.append(", data=");
                sb.append(str4);
                sb.append(", timestamp=");
                sb.append(d2);
                sb.append(", uniqueId=");
                sb.append(str2);
                sb.append(", userId=");
                sb.append(str3);
                sb.append(", sessionId=");
                sb.append(string5);
                sb.append("] ... Skipping");
                C1557c.m7465b(str5, sb.toString());
            }
            cursor2 = cursor;
            columnIndex = i;
            columnIndex2 = i2;
        }
        return arrayList;
    }

    /* renamed from: b */
    private ContentValues m15205b(C4432e1 e1Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_type", e1Var.mo15521d().mo6750b());
        contentValues.put("event_data", e1Var.mo15520c().toString());
        contentValues.put(StreamSampleTelemetryData.TIMESTAMP_KEY, Double.valueOf(e1Var.mo15517a()));
        if (e1Var.mo15525h() != null) {
            contentValues.put("session_id", e1Var.mo15525h().toString());
        }
        if (e1Var.mo15523f() != null) {
            contentValues.put("user_id", e1Var.mo15523f());
        }
        if (e1Var.mo15524g() != null) {
            contentValues.put("event_guid", e1Var.mo15524g());
        }
        return contentValues;
    }
}
