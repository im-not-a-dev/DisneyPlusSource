package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.Format;

/* renamed from: com.google.android.exoplayer2.metadata.c */
/* compiled from: MetadataDecoderFactory */
public interface C8740c {

    /* renamed from: a */
    public static final C8740c f18556a = new C8741a();

    /* renamed from: com.google.android.exoplayer2.metadata.c$a */
    /* compiled from: MetadataDecoderFactory */
    static class C8741a implements C8740c {
        C8741a() {
        }

        /* renamed from: a */
        public boolean mo22876a(Format format) {
            String str = format.f18349b0;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str);
        }

        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.exoplayer2.metadata.C8739b mo22877b(com.google.android.exoplayer2.Format r5) {
            /*
                r4 = this;
                java.lang.String r5 = r5.f18349b0
                int r0 = r5.hashCode()
                r1 = 3
                r2 = 2
                r3 = 1
                switch(r0) {
                    case -1348231605: goto L_0x002b;
                    case -1248341703: goto L_0x0021;
                    case 1154383568: goto L_0x0017;
                    case 1652648887: goto L_0x000d;
                    default: goto L_0x000c;
                }
            L_0x000c:
                goto L_0x0035
            L_0x000d:
                java.lang.String r0 = "application/x-scte35"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0035
                r5 = 2
                goto L_0x0036
            L_0x0017:
                java.lang.String r0 = "application/x-emsg"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0035
                r5 = 1
                goto L_0x0036
            L_0x0021:
                java.lang.String r0 = "application/id3"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0035
                r5 = 0
                goto L_0x0036
            L_0x002b:
                java.lang.String r0 = "application/x-icy"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0035
                r5 = 3
                goto L_0x0036
            L_0x0035:
                r5 = -1
            L_0x0036:
                if (r5 == 0) goto L_0x0058
                if (r5 == r3) goto L_0x0052
                if (r5 == r2) goto L_0x004c
                if (r5 != r1) goto L_0x0044
                com.google.android.exoplayer2.metadata.i.a r5 = new com.google.android.exoplayer2.metadata.i.a
                r5.<init>()
                return r5
            L_0x0044:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Attempted to create decoder for unsupported format"
                r5.<init>(r0)
                throw r5
            L_0x004c:
                com.google.android.exoplayer2.metadata.k.c r5 = new com.google.android.exoplayer2.metadata.k.c
                r5.<init>()
                return r5
            L_0x0052:
                com.google.android.exoplayer2.metadata.g.b r5 = new com.google.android.exoplayer2.metadata.g.b
                r5.<init>()
                return r5
            L_0x0058:
                com.google.android.exoplayer2.metadata.j.h r5 = new com.google.android.exoplayer2.metadata.j.h
                r5.<init>()
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.C8740c.C8741a.mo22877b(com.google.android.exoplayer2.Format):com.google.android.exoplayer2.metadata.b");
        }
    }

    /* renamed from: a */
    boolean mo22876a(Format format);

    /* renamed from: b */
    C8739b mo22877b(Format format);
}
