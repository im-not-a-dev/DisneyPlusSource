package okhttp3.p688d0.p693k;

/* renamed from: okhttp3.d0.k.b */
/* compiled from: ErrorCode */
public enum C14179b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: c */
    public final int f31542c;

    private C14179b(int i) {
        this.f31542c = i;
    }

    /* renamed from: a */
    public static C14179b m45090a(int i) {
        C14179b[] values;
        for (C14179b bVar : values()) {
            if (bVar.f31542c == i) {
                return bVar;
            }
        }
        return null;
    }
}
