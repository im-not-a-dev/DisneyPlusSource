package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;

/* renamed from: g.j.a.a.d.g.b8 */
public final class C11044b8 extends IOException {
    public C11044b8(String str) {
        super(str);
    }

    /* renamed from: a */
    static C11044b8 m34810a() {
        return new C11044b8("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C11044b8 m34811b() {
        return new C11044b8("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C11044b8 m34812c() {
        return new C11044b8("CodedInputStream encountered a malformed varint.");
    }

    public C11044b8(String str, Exception exc) {
        super(str, exc);
    }
}
