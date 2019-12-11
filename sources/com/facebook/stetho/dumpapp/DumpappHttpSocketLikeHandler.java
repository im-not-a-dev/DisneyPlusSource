package com.facebook.stetho.dumpapp;

import com.facebook.stetho.server.SocketLike;
import com.facebook.stetho.server.SocketLikeHandler;
import com.facebook.stetho.server.http.ExactPathMatcher;
import com.facebook.stetho.server.http.HandlerRegistry;
import com.facebook.stetho.server.http.HttpHandler;
import com.facebook.stetho.server.http.LightHttpServer;
import java.io.IOException;

@Deprecated
public class DumpappHttpSocketLikeHandler implements SocketLikeHandler {
    private final LightHttpServer mServer;

    private static class DumpappLegacyHttpHandler implements HttpHandler {
        private static final String CONTENT_TYPE = "application/octet-stream";
        private static final String QUERY_PARAM_ARGV = "argv";
        private static final String RESPONSE_HEADER_ALLOW_ORIGIN = "Access-Control-Allow-Origin";
        private final Dumper mDumper;

        public DumpappLegacyHttpHandler(Dumper dumper) {
            this.mDumper = dumper;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0093  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean handleRequest(com.facebook.stetho.server.SocketLike r8, com.facebook.stetho.server.http.LightHttpRequest r9, com.facebook.stetho.server.http.LightHttpResponse r10) throws java.io.IOException {
            /*
                r7 = this;
                java.lang.String r8 = r9.method
                java.lang.String r0 = "POST"
                boolean r8 = r0.equals(r8)
                r0 = 0
                r1 = 1
                if (r8 != 0) goto L_0x0018
                java.lang.String r2 = r9.method
                java.lang.String r3 = "GET"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L_0x0018
                r2 = 1
                goto L_0x0019
            L_0x0018:
                r2 = 0
            L_0x0019:
                if (r2 != 0) goto L_0x0042
                if (r8 == 0) goto L_0x001e
                goto L_0x0042
            L_0x001e:
                r8 = 501(0x1f5, float:7.02E-43)
                r10.code = r8
                java.lang.String r8 = "Not implemented"
                r10.reasonPhrase = r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = r9.method
                r8.append(r9)
                java.lang.String r9 = " not implemented"
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                java.lang.String r9 = "text/plain"
                com.facebook.stetho.server.http.LightHttpBody r8 = com.facebook.stetho.server.http.LightHttpBody.create(r8, r9)
                r10.body = r8
                goto L_0x00b1
            L_0x0042:
                android.net.Uri r9 = r9.uri
                java.lang.String r3 = "argv"
                java.util.List r9 = r9.getQueryParameters(r3)
                java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
                r3.<init>()
                com.facebook.stetho.dumpapp.Framer r4 = new com.facebook.stetho.dumpapp.Framer
                java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
                byte[] r0 = new byte[r0]
                r5.<init>(r0)
                r4.<init>(r5, r3)
                if (r8 == 0) goto L_0x0060
                java.lang.String r8 = "ERROR"
                goto L_0x0062
            L_0x0060:
                java.lang.String r8 = "WARNING"
            L_0x0062:
                java.io.PrintStream r0 = r4.getStderr()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "*** "
                r5.append(r6)
                r5.append(r8)
                java.lang.String r8 = ": Using legacy HTTP protocol; update dumpapp script! ***"
                r5.append(r8)
                java.lang.String r8 = r5.toString()
                r0.println(r8)
                if (r2 == 0) goto L_0x0093
                com.facebook.stetho.dumpapp.Dumper r8 = r7.mDumper
                int r0 = r9.size()
                java.lang.String[] r0 = new java.lang.String[r0]
                java.lang.Object[] r9 = r9.toArray(r0)
                java.lang.String[] r9 = (java.lang.String[]) r9
                com.facebook.stetho.dumpapp.DumpappSocketLikeHandler.dump(r8, r4, r9)
                goto L_0x0096
            L_0x0093:
                r4.writeExitCode(r1)
            L_0x0096:
                r8 = 200(0xc8, float:2.8E-43)
                r10.code = r8
                java.lang.String r8 = "OK"
                r10.reasonPhrase = r8
                java.lang.String r8 = "Access-Control-Allow-Origin"
                java.lang.String r9 = "*"
                r10.addHeader(r8, r9)
                byte[] r8 = r3.toByteArray()
                java.lang.String r9 = "application/octet-stream"
                com.facebook.stetho.server.http.LightHttpBody r8 = com.facebook.stetho.server.http.LightHttpBody.create(r8, r9)
                r10.body = r8
            L_0x00b1:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.dumpapp.DumpappHttpSocketLikeHandler.DumpappLegacyHttpHandler.handleRequest(com.facebook.stetho.server.SocketLike, com.facebook.stetho.server.http.LightHttpRequest, com.facebook.stetho.server.http.LightHttpResponse):boolean");
        }
    }

    public DumpappHttpSocketLikeHandler(Dumper dumper) {
        HandlerRegistry handlerRegistry = new HandlerRegistry();
        handlerRegistry.register(new ExactPathMatcher("/dumpapp"), new DumpappLegacyHttpHandler(dumper));
        this.mServer = new LightHttpServer(handlerRegistry);
    }

    public void onAccepted(SocketLike socketLike) throws IOException {
        this.mServer.serve(socketLike);
    }
}
