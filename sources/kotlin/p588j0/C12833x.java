package kotlin.p588j0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.p586h0.C12754b;
import kotlin.p586h0.C12757d;
import kotlin.p587i0.C12775h;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a\u001c\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010\u000e\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001f\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\rH\u0002\u001a\u001f\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\rH\u0002\u001a\u0015\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\n\u001a\u001c\u0010\u0014\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010\u0014\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a:\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001aE\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0002\b\u001c\u001a:\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0012\u0010\u001e\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0006\u001a4\u0010 \u001a\u0002H!\"\f\b\u0000\u0010\"*\u00020\u0002*\u0002H!\"\u0004\b\u0001\u0010!*\u0002H\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H!0$H\b¢\u0006\u0002\u0010%\u001a4\u0010&\u001a\u0002H!\"\f\b\u0000\u0010\"*\u00020\u0002*\u0002H!\"\u0004\b\u0001\u0010!*\u0002H\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H!0$H\b¢\u0006\u0002\u0010%\u001a&\u0010'\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a;\u0010'\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0002\b)\u001a&\u0010'\u001a\u00020\u0006*\u00020\u00022\u0006\u0010*\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u0010+\u001a\u00020\u0006*\u00020\u00022\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a,\u0010+\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\r\u0010.\u001a\u00020\r*\u00020\u0002H\b\u001a\r\u0010/\u001a\u00020\r*\u00020\u0002H\b\u001a\r\u00100\u001a\u00020\r*\u00020\u0002H\b\u001a \u00101\u001a\u00020\r*\u0004\u0018\u00010\u0002H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a \u00102\u001a\u00020\r*\u0004\u0018\u00010\u0002H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u00103\u001a\u000204*\u00020\u0002H\u0002\u001a&\u00105\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u00105\u001a\u00020\u0006*\u00020\u00022\u0006\u0010*\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u00106\u001a\u00020\u0006*\u00020\u00022\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a,\u00106\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0010\u00107\u001a\b\u0012\u0004\u0012\u00020\n08*\u00020\u0002\u001a\u0010\u00109\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u0002\u001a\u0015\u0010;\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\f\u001a\u000f\u0010<\u001a\u00020\n*\u0004\u0018\u00010\nH\b\u001a\u001c\u0010=\u001a\u00020\u0002*\u00020\u00022\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u0011\u001a\u001c\u0010=\u001a\u00020\n*\u00020\n2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u0011\u001a\u001c\u0010@\u001a\u00020\u0002*\u00020\u00022\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u0011\u001a\u001c\u0010@\u001a\u00020\n*\u00020\n2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u0011\u001aG\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000108*\u00020\u00022\u000e\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0C2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006H\u0002¢\u0006\u0004\bE\u0010F\u001a=\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000108*\u00020\u00022\u0006\u0010B\u001a\u00020-2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006H\u0002¢\u0006\u0002\bE\u001a4\u0010G\u001a\u00020\r*\u00020\u00022\u0006\u0010H\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0012\u0010J\u001a\u00020\u0002*\u00020\u00022\u0006\u0010K\u001a\u00020\u0002\u001a\u0012\u0010J\u001a\u00020\n*\u00020\n2\u0006\u0010K\u001a\u00020\u0002\u001a\u001a\u0010L\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006\u001a\u0012\u0010L\u001a\u00020\u0002*\u00020\u00022\u0006\u0010M\u001a\u00020\u0001\u001a\u001d\u0010L\u001a\u00020\n*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\b\u001a\u0015\u0010L\u001a\u00020\n*\u00020\n2\u0006\u0010M\u001a\u00020\u0001H\b\u001a\u0012\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010N\u001a\u00020\n*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010O\u001a\u00020\u0002*\u00020\u00022\u0006\u0010P\u001a\u00020\u0002\u001a\u001a\u0010O\u001a\u00020\u0002*\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u0002\u001a\u001a\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010K\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a+\u0010Q\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0014\b\b\u0010R\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\u00020SH\b\u001a\u001d\u0010Q\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\nH\b\u001a$\u0010V\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010V\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010X\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010X\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010Y\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010Y\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010Z\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010Z\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001d\u0010[\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\nH\b\u001a\"\u0010\\\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0002\u001a\u001a\u0010\\\u001a\u00020\u0002*\u00020\u00022\u0006\u0010M\u001a\u00020\u00012\u0006\u0010U\u001a\u00020\u0002\u001a%\u0010\\\u001a\u00020\n*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0002H\b\u001a\u001d\u0010\\\u001a\u00020\n*\u00020\n2\u0006\u0010M\u001a\u00020\u00012\u0006\u0010U\u001a\u00020\u0002H\b\u001a=\u0010]\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\u0012\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0C\"\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006¢\u0006\u0002\u0010^\u001a0\u0010]\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\n\u0010B\u001a\u00020-\"\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006\u001a/\u0010]\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\u0006\u0010P\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010D\u001a\u00020\u0006H\u0002¢\u0006\u0002\b_\u001a%\u0010]\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010D\u001a\u00020\u0006H\b\u001a=\u0010`\u001a\b\u0012\u0004\u0012\u00020\n08*\u00020\u00022\u0012\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0C\"\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006¢\u0006\u0002\u0010a\u001a0\u0010`\u001a\b\u0012\u0004\u0012\u00020\n08*\u00020\u00022\n\u0010B\u001a\u00020-\"\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006\u001a\u001c\u0010b\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010b\u001a\u00020\r*\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a$\u0010b\u001a\u00020\r*\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0012\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010M\u001a\u00020\u0001\u001a\u001d\u0010c\u001a\u00020\u0002*\u00020\n2\u0006\u0010d\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u0006H\b\u001a\u001f\u0010f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010(\u001a\u00020\u0006H\b\u001a\u0012\u0010f\u001a\u00020\n*\u00020\u00022\u0006\u0010M\u001a\u00020\u0001\u001a\u0012\u0010f\u001a\u00020\n*\u00020\n2\u0006\u0010M\u001a\u00020\u0001\u001a\u001c\u0010g\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010g\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010h\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010h\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010i\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010i\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010j\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010j\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\n\u0010k\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010k\u001a\u00020\u0002*\u00020\u00022\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010k\u001a\u00020\u0002*\u00020\u00022\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\r\u0010k\u001a\u00020\n*\u00020\nH\b\u001a!\u0010k\u001a\u00020\n*\u00020\n2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010k\u001a\u00020\n*\u00020\n2\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\n\u0010m\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010m\u001a\u00020\u0002*\u00020\u00022\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010m\u001a\u00020\u0002*\u00020\u00022\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\r\u0010m\u001a\u00020\n*\u00020\nH\b\u001a!\u0010m\u001a\u00020\n*\u00020\n2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010m\u001a\u00020\n*\u00020\n2\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\n\u0010n\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010n\u001a\u00020\u0002*\u00020\u00022\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010n\u001a\u00020\u0002*\u00020\u00022\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\r\u0010n\u001a\u00020\n*\u00020\nH\b\u001a!\u0010n\u001a\u00020\n*\u00020\n2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010n\u001a\u00020\n*\u00020\n2\n\u0010,\u001a\u00020-\"\u00020\u0011\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006o"}, mo31007d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "", "getLastIndex", "(Ljava/lang/CharSequence;)I", "commonPrefixWith", "", "other", "ignoreCase", "", "commonSuffixWith", "contains", "char", "", "regex", "Lkotlin/text/Regex;", "endsWith", "suffix", "findAnyOf", "Lkotlin/Pair;", "strings", "", "startIndex", "last", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", "index", "ifBlank", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifEmpty", "indexOf", "endIndex", "indexOf$StringsKt__StringsKt", "string", "indexOfAny", "chars", "", "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "iterator", "Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", "lines", "", "matches", "orEmpty", "padEnd", "length", "padChar", "padStart", "rangesDelimitedBy", "delimiters", "", "limit", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", "delimiter", "replace", "transform", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "startsWith", "subSequence", "start", "end", "substring", "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "trim", "predicate", "trimEnd", "trimStart", "kotlin-stdlib"}, mo31008k = 5, mo31009mv = {1, 1, 15}, mo31011xi = 1, mo31012xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.j0.x */
/* compiled from: Strings.kt */
class C12833x extends C12832w {

    /* renamed from: kotlin.j0.x$a */
    /* compiled from: Strings.kt */
    static final class C12834a extends C12881k implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: U */
        final /* synthetic */ boolean f29506U;

        /* renamed from: c */
        final /* synthetic */ char[] f29507c;

        C12834a(char[] cArr, boolean z) {
            this.f29507c = cArr;
            this.f29506U = z;
            super(2);
        }

        /* renamed from: a */
        public final Pair<Integer, Integer> mo31147a(CharSequence charSequence, int i) {
            int a = C12833x.m40133a(charSequence, this.f29507c, i, this.f29506U);
            if (a < 0) {
                return null;
            }
            return C12907r.m40244a(Integer.valueOf(a), Integer.valueOf(1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo31147a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: kotlin.j0.x$b */
    /* compiled from: Strings.kt */
    static final class C12835b extends C12881k implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: U */
        final /* synthetic */ boolean f29508U;

        /* renamed from: c */
        final /* synthetic */ List f29509c;

        C12835b(List list, boolean z) {
            this.f29509c = list;
            this.f29508U = z;
            super(2);
        }

        /* renamed from: a */
        public final Pair<Integer, Integer> mo31148a(CharSequence charSequence, int i) {
            Pair a = C12833x.m40164b(charSequence, (Collection<String>) this.f29509c, i, this.f29508U, false);
            if (a != null) {
                return C12907r.m40244a(a.mo31015c(), Integer.valueOf(((String) a.mo31016d()).length()));
            }
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo31148a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: kotlin.j0.x$c */
    /* compiled from: Strings.kt */
    static final class C12836c extends C12881k implements Function1<C12757d, String> {

        /* renamed from: c */
        final /* synthetic */ CharSequence f29510c;

        C12836c(CharSequence charSequence) {
            this.f29510c = charSequence;
            super(1);
        }

        /* renamed from: a */
        public final String invoke(C12757d dVar) {
            return C12833x.m40134a(this.f29510c, dVar);
        }
    }

    /* renamed from: kotlin.j0.x$d */
    /* compiled from: Strings.kt */
    static final class C12837d extends C12881k implements Function1<C12757d, String> {

        /* renamed from: c */
        final /* synthetic */ CharSequence f29511c;

        C12837d(CharSequence charSequence) {
            this.f29511c = charSequence;
            super(1);
        }

        /* renamed from: a */
        public final String invoke(C12757d dVar) {
            return C12833x.m40134a(this.f29511c, dVar);
        }
    }

    /* renamed from: b */
    public static C12757d m40165b(CharSequence charSequence) {
        return new C12757d(0, charSequence.length() - 1);
    }

    /* renamed from: c */
    public static int m40172c(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    /* renamed from: d */
    public static String m40178d(String str, char c, String str2) {
        int b = m40156b((CharSequence) str, c, 0, false, 6, (Object) null);
        if (b == -1) {
            return str2;
        }
        String substring = str.substring(0, b);
        C12880j.m40222a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: e */
    public static final List<String> m40180e(CharSequence charSequence) {
        return C12788p.m39999g(m40179d(charSequence));
    }

    /* renamed from: f */
    public static CharSequence m40181f(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean a = C12798a.m40012a(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!a) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!a) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: a */
    public static final String m40134a(CharSequence charSequence, C12757d dVar) {
        return charSequence.subSequence(dVar.mo31082f().intValue(), dVar.mo31081e().intValue() + 1).toString();
    }

    /* renamed from: b */
    public static /* synthetic */ String m40163b(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m40162b(str, str2, str3);
    }

    /* renamed from: c */
    public static /* synthetic */ String m40174c(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m40173c(str, c, str2);
    }

    /* renamed from: a */
    public static /* synthetic */ String m40136a(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m40135a(str, c, str2);
    }

    /* renamed from: b */
    public static final String m40162b(String str, String str2, String str3) {
        int a = m40132a((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (a == -1) {
            return str3;
        }
        String substring = str.substring(0, a);
        C12880j.m40222a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: c */
    public static final String m40173c(String str, char c, String str2) {
        int a = m40128a((CharSequence) str, c, 0, false, 6, (Object) null);
        if (a == -1) {
            return str2;
        }
        String substring = str.substring(0, a);
        C12880j.m40222a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: d */
    public static final C12775h<String> m40179d(CharSequence charSequence) {
        return m40167b(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    /* renamed from: a */
    public static final String m40135a(String str, char c, String str2) {
        int a = m40128a((CharSequence) str, c, 0, false, 6, (Object) null);
        if (a == -1) {
            return str2;
        }
        String substring = str.substring(a + 1, str.length());
        C12880j.m40222a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b */
    public static /* synthetic */ String m40161b(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m40160b(str, c, str2);
    }

    /* renamed from: c */
    public static String m40175c(String str, String str2, String str3) {
        int b = m40158b((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (b == -1) {
            return str3;
        }
        String substring = str.substring(0, b);
        C12880j.m40222a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static /* synthetic */ String m40139a(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m40138a(str, str2, str3);
    }

    /* renamed from: b */
    public static String m40160b(String str, char c, String str2) {
        int b = m40156b((CharSequence) str, c, 0, false, 6, (Object) null);
        if (b == -1) {
            return str2;
        }
        String substring = str.substring(b + 1, str.length());
        C12880j.m40222a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static String m40138a(String str, String str2, String str3) {
        int a = m40132a((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (a == -1) {
            return str3;
        }
        String substring = str.substring(a + str2.length(), str.length());
        C12880j.m40222a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m40177c(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m40176c(charSequence, c, z);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m40169b(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m40168b(charSequence, c, z);
    }

    /* renamed from: c */
    public static final boolean m40176c(CharSequence charSequence, char c, boolean z) {
        return charSequence.length() > 0 && C12800b.m40013a(charSequence.charAt(0), c, z);
    }

    /* renamed from: a */
    public static String m40137a(String str, CharSequence charSequence) {
        if (!m40171b((CharSequence) str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C12880j.m40222a((Object) substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: b */
    public static final boolean m40168b(CharSequence charSequence, char c, boolean z) {
        return charSequence.length() > 0 && C12800b.m40013a(charSequence.charAt(m40172c(charSequence)), c, z);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m40171b(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m40170b(charSequence, charSequence2, z);
    }

    /* renamed from: a */
    public static final boolean m40152a(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C12800b.m40013a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m40170b(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C12832w.m40123b((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return m40152a(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: a */
    public static final int m40133a(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int a = C12762h.m39913a(i, 0);
            int c = m40172c(charSequence);
            if (a <= c) {
                while (true) {
                    char charAt = charSequence.charAt(a);
                    int length = cArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z2 = false;
                            break;
                        } else if (C12800b.m40013a(cArr[i2], charAt, z)) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z2) {
                        if (a == c) {
                            break;
                        }
                        a++;
                    } else {
                        return a;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C13174k.m40366a(cArr), i);
    }

    /* renamed from: b */
    public static final int m40159b(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int b = C12762h.m39917b(i, m40172c(charSequence)); b >= 0; b--) {
                char charAt = charSequence.charAt(b);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C12800b.m40013a(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return b;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C13174k.m40366a(cArr), i);
    }

    /* renamed from: a */
    static /* synthetic */ int m40130a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return m40129a(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* renamed from: a */
    private static final int m40129a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C12754b bVar;
        if (!z2) {
            bVar = new C12757d(C12762h.m39913a(i, 0), C12762h.m39917b(i2, charSequence.length()));
        } else {
            bVar = C12762h.m39919c(C12762h.m39917b(i, m40172c(charSequence)), C12762h.m39913a(i2, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int b = bVar.mo31070b();
            int c = bVar.mo31071c();
            int d = bVar.mo31072d();
            if (d < 0 ? b >= c : b <= c) {
                while (true) {
                    if (!m40152a(charSequence2, 0, charSequence, b, charSequence2.length(), z)) {
                        if (b == c) {
                            break;
                        }
                        b += d;
                    } else {
                        return b;
                    }
                }
            }
        } else {
            int b2 = bVar.mo31070b();
            int c2 = bVar.mo31071c();
            int d2 = bVar.mo31072d();
            if (d2 < 0 ? b2 >= c2 : b2 <= c2) {
                while (true) {
                    if (!C12832w.m40119a((String) charSequence2, 0, (String) charSequence, b2, charSequence2.length(), z)) {
                        if (b2 == c2) {
                            break;
                        }
                        b2 += d2;
                    } else {
                        return b2;
                    }
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final Pair<Integer, String> m40164b(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        Object obj;
        Object obj2;
        Pair<Integer, String> pair = null;
        if (z || collection.size() != 1) {
            C12754b dVar = !z2 ? new C12757d(C12762h.m39913a(i, 0), charSequence.length()) : C12762h.m39919c(C12762h.m39917b(i, m40172c(charSequence)), 0);
            if (charSequence instanceof String) {
                int b = dVar.mo31070b();
                int c = dVar.mo31071c();
                int d = dVar.mo31072d();
                if (d < 0 ? b >= c : b <= c) {
                    while (true) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (C12832w.m40119a(str, 0, (String) charSequence, b, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (b == c) {
                                break;
                            }
                            b += d;
                        } else {
                            return C12907r.m40244a(Integer.valueOf(b), str2);
                        }
                    }
                }
            } else {
                int b2 = dVar.mo31070b();
                int c2 = dVar.mo31071c();
                int d2 = dVar.mo31072d();
                if (d2 < 0 ? b2 >= c2 : b2 <= c2) {
                    while (true) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (m40152a((CharSequence) str3, 0, charSequence, b2, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (b2 == c2) {
                                break;
                            }
                            b2 += d2;
                        } else {
                            return C12907r.m40244a(Integer.valueOf(b2), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) C13199w.m40602m(collection);
        CharSequence charSequence2 = charSequence;
        String str6 = str5;
        int i2 = i;
        int a = !z2 ? m40132a(charSequence2, str6, i2, false, 4, (Object) null) : m40158b(charSequence2, str6, i2, false, 4, (Object) null);
        if (a >= 0) {
            pair = C12907r.m40244a(Integer.valueOf(a), str5);
        }
        return pair;
    }

    /* renamed from: a */
    public static /* synthetic */ int m40128a(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m40127a(charSequence, c, i, z);
    }

    /* renamed from: a */
    public static final int m40127a(CharSequence charSequence, char c, int i, boolean z) {
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m40133a(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: a */
    public static /* synthetic */ int m40132a(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m40131a(charSequence, str, i, z);
    }

    /* renamed from: a */
    public static final int m40131a(CharSequence charSequence, String str, int i, boolean z) {
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m40130a(charSequence, str, i, charSequence.length(), z, false, 16, null);
    }

    /* renamed from: b */
    public static /* synthetic */ int m40156b(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m40172c(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m40155b(charSequence, c, i, z);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m40154a(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m40153a(charSequence, charSequence2, z);
    }

    /* renamed from: b */
    public static final int m40155b(CharSequence charSequence, char c, int i, boolean z) {
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m40159b(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: a */
    public static final boolean m40153a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (m40132a(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (m40130a(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static /* synthetic */ int m40158b(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m40172c(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m40157b(charSequence, str, i, z);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m40151a(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m40150a(charSequence, c, z);
    }

    /* renamed from: b */
    public static final int m40157b(CharSequence charSequence, String str, int i, boolean z) {
        if (z || !(charSequence instanceof String)) {
            return m40129a(charSequence, (CharSequence) str, i, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: a */
    public static final boolean m40150a(CharSequence charSequence, char c, boolean z) {
        return m40128a(charSequence, c, 0, z, 2, (Object) null) >= 0;
    }

    /* renamed from: a */
    static /* synthetic */ C12775h m40145a(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m40144a(charSequence, cArr, i, z, i2);
    }

    /* renamed from: a */
    private static final C12775h<C12757d> m40144a(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new C12802d(charSequence, i, i2, new C12834a(cArr, z));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: b */
    public static /* synthetic */ C12775h m40167b(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m40166b(charSequence, strArr, z, i);
    }

    /* renamed from: b */
    public static final C12775h<String> m40166b(CharSequence charSequence, String[] strArr, boolean z, int i) {
        return C12788p.m39994d(m40149a(charSequence, strArr, 0, z, i, 2, (Object) null), new C12836c(charSequence));
    }

    /* renamed from: a */
    static /* synthetic */ C12775h m40149a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m40148a(charSequence, strArr, i, z, i2);
    }

    /* renamed from: a */
    private static final C12775h<C12757d> m40148a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new C12802d(charSequence, i, i2, new C12835b(C13171j.m40336a((Object[]) strArr), z));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public static /* synthetic */ List m40142a(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m40141a(charSequence, strArr, z, i);
    }

    /* renamed from: a */
    public static final List<String> m40141a(CharSequence charSequence, String[] strArr, boolean z, int i) {
        if (strArr.length == 1) {
            boolean z2 = false;
            String str = strArr[0];
            if (str.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                return m40140a(charSequence, str, z, i);
            }
        }
        Iterable<C12757d> c = C12788p.m39991c(m40149a(charSequence, strArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) c, 10));
        for (C12757d a : c) {
            arrayList.add(m40134a(charSequence, a));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static /* synthetic */ C12775h m40147a(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m40146a(charSequence, cArr, z, i);
    }

    /* renamed from: a */
    public static final C12775h<String> m40146a(CharSequence charSequence, char[] cArr, boolean z, int i) {
        return C12788p.m39994d(m40145a(charSequence, cArr, 0, z, i, 2, (Object) null), new C12837d(charSequence));
    }

    /* renamed from: a */
    private static final List<String> m40140a(CharSequence charSequence, String str, boolean z, int i) {
        int i2 = 0;
        if (i >= 0) {
            int a = m40131a(charSequence, str, 0, z);
            if (a == -1 || i == 1) {
                return C13183n.m40498a(charSequence.toString());
            }
            boolean z2 = i > 0;
            int i3 = 10;
            if (z2) {
                i3 = C12762h.m39917b(i, 10);
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, a).toString());
                i2 = str.length() + a;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                a = m40131a(charSequence, str, i2, z);
            } while (a != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
