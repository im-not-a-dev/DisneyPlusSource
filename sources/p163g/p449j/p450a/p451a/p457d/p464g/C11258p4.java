package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;

/* renamed from: g.j.a.a.d.g.p4 */
public class C11258p4 extends IOException {
    public C11258p4(String str) {
        super(str);
    }

    /* renamed from: a */
    static C11258p4 m35930a() {
        return new C11258p4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C11258p4 m35931b() {
        return new C11258p4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C11258p4 m35932c() {
        return new C11258p4("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static C11258p4 m35933d() {
        return new C11258p4("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    static C11258p4 m35934e() {
        return new C11258p4("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    static C11244o4 m35935f() {
        return new C11244o4("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    static C11258p4 m35936g() {
        return new C11258p4("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: h */
    static C11258p4 m35937h() {
        return new C11258p4("Failed to parse the message.");
    }

    /* renamed from: i */
    static C11258p4 m35938i() {
        return new C11258p4("Protocol message had invalid UTF-8.");
    }

    /* renamed from: a */
    public final C11258p4 mo28827a(C11259p5 p5Var) {
        return this;
    }
}
