package androidx.room;

/* renamed from: androidx.room.g */
/* compiled from: RoomMasterTable */
public class C0935g {
    /* renamed from: a */
    public static String m5139a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        sb.append(str);
        sb.append("')");
        return sb.toString();
    }
}
