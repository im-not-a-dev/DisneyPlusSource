package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p573a0.C12688f;
import kotlin.p573a0.C12688f.C12691b;
import kotlin.p573a0.C12688f.C12693c;
import kotlinx.coroutines.C13324k1.C13325a;
import kotlinx.coroutines.internal.C13256d;
import kotlinx.coroutines.internal.C13267h;
import kotlinx.coroutines.internal.C13268i;
import kotlinx.coroutines.internal.C13268i.C13269a;
import kotlinx.coroutines.internal.C13274l;
import kotlinx.coroutines.internal.C13278p;
import kotlinx.coroutines.p596n2.C13366a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006Ð\u0001Ñ\u0001Ò\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u0004\u0018\u00010\tH@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u0004\u0018\u00010\tH@ø\u0001\u0000¢\u0006\u0004\b$\u0010\"J\u0019\u0010&\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b&\u0010'J\u001f\u0010&\u001a\u00020\u00152\u000e\u0010%\u001a\n\u0018\u00010(j\u0004\u0018\u0001`)H\u0016¢\u0006\u0004\b&\u0010*J\u0017\u0010+\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b+\u0010'J\u0019\u0010.\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b/\u0010'J\u0019\u00100\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b0\u0010-J\u0017\u00101\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0011H\u0002¢\u0006\u0004\b1\u0010'J\u0017\u00102\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b2\u0010'J)\u00105\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b5\u00106J)\u0010;\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u0002072\u0006\u00109\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010B\u001a\u0004\u0018\u0001082\u0006\u0010\u0018\u001a\u000203H\u0002¢\u0006\u0004\bB\u0010CJ\u0011\u0010D\u001a\u00060(j\u0002`)¢\u0006\u0004\bD\u0010EJ\u0013\u0010F\u001a\u00060(j\u0002`)H\u0016¢\u0006\u0004\bF\u0010EJ\u0011\u0010I\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\bG\u0010HJ\u000f\u0010J\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\bJ\u0010KJ'\u0010L\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u0002072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\bL\u0010MJ\u0019\u0010N\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u000203H\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\u0011H\u0014¢\u0006\u0004\bQ\u0010'J\u0017\u0010T\u001a\u00020\u00152\u0006\u0010P\u001a\u00020\u0011H\u0010¢\u0006\u0004\bR\u0010SJ\u0019\u0010X\u001a\u00020\u00152\b\u0010U\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\bV\u0010WJF\u0010a\u001a\u00020`2\u0006\u0010Y\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020\u00052'\u0010_\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\\\u0012\b\b]\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00150[j\u0002`^¢\u0006\u0004\ba\u0010bJ6\u0010a\u001a\u00020`2'\u0010_\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\\\u0012\b\b]\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00150[j\u0002`^¢\u0006\u0004\ba\u0010cJ\u0013\u0010d\u001a\u00020\u0015H@ø\u0001\u0000¢\u0006\u0004\bd\u0010\"J\u000f\u0010e\u001a\u00020\u0005H\u0002¢\u0006\u0004\be\u0010fJ\u0013\u0010g\u001a\u00020\u0015H@ø\u0001\u0000¢\u0006\u0004\bg\u0010\"J&\u0010j\u001a\u00020i2\u0014\u0010h\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00150[H\b¢\u0006\u0004\bj\u0010kJ\u0019\u0010l\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bl\u0010-J\u0019\u0010n\u001a\u00020\u00052\b\u0010:\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\bm\u0010-J!\u0010q\u001a\u00020\u00052\b\u0010:\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\bo\u0010pJD\u0010r\u001a\u0006\u0012\u0002\b\u00030\r2'\u0010_\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\\\u0012\b\b]\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00150[j\u0002`^2\u0006\u0010Y\u001a\u00020\u0005H\u0002¢\u0006\u0004\br\u0010sJ\u000f\u0010w\u001a\u00020tH\u0010¢\u0006\u0004\bu\u0010vJ\u001f\u0010x\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0011H\u0002¢\u0006\u0004\bx\u0010yJ2\u0010{\u001a\u00020\u0015\"\u000e\b\u0000\u0010z\u0018\u0001*\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0011H\b¢\u0006\u0004\b{\u0010yJ\u0019\u0010Y\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\bY\u0010SJ\u0019\u0010|\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b|\u0010}J\u0010\u0010\u0001\u001a\u00020\u0015H\u0010¢\u0006\u0004\b~\u0010J\u0019\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010
\u0001\u001a\u00020\u00152\u0007\u0010\u0018\u001a\u00030\u0001H\u0002¢\u0006\u0006\b
\u0001\u0010\u0001J\u001e\u0010\u0001\u001a\u00020\u00152\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0006\b\u0001\u0010\u0001JI\u0010\u0001\u001a\u00020\u0015\"\u0005\b\u0000\u0010\u00012\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010h\u001a\u0019\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0006\u0012\u0004\u0018\u00010\t0[ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001JX\u0010\u0001\u001a\u00020\u0015\"\u0004\b\u0000\u0010z\"\u0005\b\u0001\u0010\u00012\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u00012$\u0010h\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u001e\u0010\u0001\u001a\u00020\u00152\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0000¢\u0006\u0006\b\u0001\u0010\u0001JX\u0010\u0001\u001a\u00020\u0015\"\u0004\b\u0000\u0010z\"\u0005\b\u0001\u0010\u00012\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u00012$\u0010h\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0001\u001a\u00020\u0005¢\u0006\u0005\b\u0001\u0010fJ\u001c\u0010\u0001\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020t2\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020tH\u0007¢\u0006\u0005\b\u0001\u0010vJ\u0011\u0010\u0001\u001a\u00020tH\u0016¢\u0006\u0005\b\u0001\u0010vJ,\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J,\u0010 \u0001\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J\"\u0010¢\u0001\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u0002032\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J.\u0010¤\u0001\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\u0010:\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J,\u0010¦\u0001\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u0002032\b\u0010:\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001J-\u0010¨\u0001\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u0002072\u0006\u0010\u001d\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\tH\u0010¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0019\u0010«\u0001\u001a\u0004\u0018\u000108*\u00030ª\u0001H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001f\u0010­\u0001\u001a\u00020\u0015*\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0005\b­\u0001\u0010yJ'\u0010¯\u0001\u001a\u00060(j\u0002`)*\u00020\u00112\u000b\b\u0002\u0010®\u0001\u001a\u0004\u0018\u00010tH\u0004¢\u0006\u0006\b¯\u0001\u0010°\u0001R\u001d\u0010´\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010±\u00018F@\u0006¢\u0006\b\u001a\u0006\b²\u0001\u0010³\u0001R\u001a\u0010¶\u0001\u001a\u0004\u0018\u00010\u00118D@\u0004X\u0004¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010KR\u0018\u0010¸\u0001\u001a\u00020\u00058D@\u0004X\u0004¢\u0006\u0007\u001a\u0005\b·\u0001\u0010fR\u0018\u0010º\u0001\u001a\u00020\u00058P@\u0010X\u0004¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010fR\u0018\u0010»\u0001\u001a\u00020\u00058V@\u0016X\u0004¢\u0006\u0007\u001a\u0005\b»\u0001\u0010fR\u0015\u0010¼\u0001\u001a\u00020\u00058F@\u0006¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010fR\u0015\u0010½\u0001\u001a\u00020\u00058F@\u0006¢\u0006\u0007\u001a\u0005\b½\u0001\u0010fR\u0015\u0010¾\u0001\u001a\u00020\u00058F@\u0006¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010fR\u0018\u0010¿\u0001\u001a\u00020\u00058T@\u0014X\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010fR\u001b\u0010Ã\u0001\u001a\u0007\u0012\u0002\b\u00030À\u00018F@\u0006¢\u0006\b\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u0018\u0010Å\u0001\u001a\u00020\u00058P@\u0010X\u0004¢\u0006\u0007\u001a\u0005\bÄ\u0001\u0010fR\u0016\u0010È\u0001\u001a\u00020\u00048F@\u0006¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u001b\u0010É\u0001\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\t8@@\u0000X\u0004¢\u0006\u0007\u001a\u0005\bË\u0001\u0010HR \u0010Í\u0001\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\t8B@\u0002X\u0004¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010>R\u001d\u0010Î\u0001\u001a\u00020\u0005*\u0002038B@\u0002X\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ï\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006Ó\u0001"}, mo31007d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/ParentJob;", "Lkotlinx/coroutines/selects/SelectClause0;", "", "active", "<init>", "(Z)V", "", "expect", "Lkotlinx/coroutines/NodeList;", "list", "Lkotlinx/coroutines/JobNode;", "node", "addLastAtomic", "(Ljava/lang/Object;Lkotlinx/coroutines/NodeList;Lkotlinx/coroutines/JobNode;)Z", "", "rootCause", "", "exceptions", "", "addSuppressedExceptions", "(Ljava/lang/Throwable;Ljava/util/List;)V", "state", "", "mode", "afterCompletionInternal", "(Ljava/lang/Object;I)V", "child", "Lkotlinx/coroutines/ChildHandle;", "attachChild", "(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;", "awaitInternal$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitInternal", "awaitSuspend", "cause", "cancel", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "cancelCoroutine", "cancelImpl$kotlinx_coroutines_core", "(Ljava/lang/Object;)Z", "cancelImpl", "cancelInternal", "cancelMakeCompleting", "cancelParent", "childCancelled", "Lkotlinx/coroutines/Incomplete;", "update", "completeStateFinalization", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;I)V", "Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/ChildHandleNode;", "lastChild", "proposedUpdate", "continueCompleting", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "createCauseException", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "Lkotlinx/coroutines/JobCancellationException;", "createJobCancellationException", "()Lkotlinx/coroutines/JobCancellationException;", "firstChild", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/ChildHandleNode;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "getChildJobCancellationCause", "getCompletedInternal$kotlinx_coroutines_core", "()Ljava/lang/Object;", "getCompletedInternal", "getCompletionExceptionOrNull", "()Ljava/lang/Throwable;", "getFinalRootCause", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/util/List;)Ljava/lang/Throwable;", "getOrPromoteCancellingList", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/NodeList;", "exception", "handleJobException", "handleOnCompletionException$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)V", "handleOnCompletionException", "parent", "initParentJobInternal$kotlinx_coroutines_core", "(Lkotlinx/coroutines/Job;)V", "initParentJobInternal", "onCancelling", "invokeImmediately", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "join", "joinInternal", "()Z", "joinSuspend", "block", "", "loopOnState", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "makeCancelling", "makeCompleting$kotlinx_coroutines_core", "makeCompleting", "makeCompletingOnce$kotlinx_coroutines_core", "(Ljava/lang/Object;I)Z", "makeCompletingOnce", "makeNode", "(Lkotlin/jvm/functions/Function1;Z)Lkotlinx/coroutines/JobNode;", "", "nameString$kotlinx_coroutines_core", "()Ljava/lang/String;", "nameString", "notifyCancelling", "(Lkotlinx/coroutines/NodeList;Ljava/lang/Throwable;)V", "T", "notifyHandlers", "onCompletionInternal", "(Ljava/lang/Object;)V", "onStartInternal$kotlinx_coroutines_core", "()V", "onStartInternal", "parentJob", "parentCancelled", "(Lkotlinx/coroutines/ParentJob;)V", "Lkotlinx/coroutines/Empty;", "promoteEmptyToNodeList", "(Lkotlinx/coroutines/Empty;)V", "promoteSingleToNodeList", "(Lkotlinx/coroutines/JobNode;)V", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/coroutines/Continuation;", "registerSelectClause0", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "registerSelectClause1Internal$kotlinx_coroutines_core", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "registerSelectClause1Internal", "removeNode$kotlinx_coroutines_core", "removeNode", "selectAwaitCompletion$kotlinx_coroutines_core", "selectAwaitCompletion", "start", "startInternal", "(Ljava/lang/Object;)I", "stateString", "(Ljava/lang/Object;)Ljava/lang/String;", "toDebugString", "toString", "tryFinalizeFinishingState", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/lang/Object;I)Z", "tryFinalizeSimpleState", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;I)Z", "tryMakeCancelling", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Throwable;)Z", "tryMakeCompleting", "(Ljava/lang/Object;Ljava/lang/Object;I)I", "tryMakeCompletingSlowPath", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;I)I", "tryWaitForChild", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "nextChild", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/ChildHandleNode;", "notifyCompletion", "message", "toCancellationException", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "children", "getCompletionCause", "completionCause", "getCompletionCauseHandled", "completionCauseHandled", "getHandlesException$kotlinx_coroutines_core", "handlesException", "isActive", "isCancelled", "isCompleted", "isCompletedExceptionally", "isScopedCoroutine", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "getOnCancelComplete$kotlinx_coroutines_core", "onCancelComplete", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "onJoin", "parentHandle", "Lkotlinx/coroutines/ChildHandle;", "getState$kotlinx_coroutines_core", "getExceptionOrNull", "exceptionOrNull", "isCancelling", "(Lkotlinx/coroutines/Incomplete;)Z", "AwaitContinuation", "ChildCompletion", "Finishing", "kotlinx-coroutines-core"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.r1 */
/* compiled from: JobSupport.kt */
public class C13391r1 implements C13324k1, C13368o, C13417y1, C13366a {

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater f29883c = AtomicReferenceFieldUpdater.newUpdater(C13391r1.class, Object.class, "_state");
    private volatile Object _state;
    public volatile C13342m parentHandle;

    /* renamed from: kotlinx.coroutines.r1$a */
    /* compiled from: JobSupport.kt */
    private static final class C13392a extends C13388q1<C13324k1> {

        /* renamed from: X */
        private final C13391r1 f29884X;

        /* renamed from: Y */
        private final C13393b f29885Y;

        /* renamed from: Z */
        private final C13363n f29886Z;

        /* renamed from: a0 */
        private final Object f29887a0;

        public C13392a(C13391r1 r1Var, C13393b bVar, C13363n nVar, Object obj) {
            super(nVar.f29850X);
            this.f29884X = r1Var;
            this.f29885Y = bVar;
            this.f29886Z = nVar;
            this.f29887a0 = obj;
        }

        /* renamed from: b */
        public void mo34401b(Throwable th) {
            this.f29884X.m41157a(this.f29885Y, this.f29886Z, this.f29887a0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo34401b((Throwable) obj);
            return C13145v.f29587a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChildCompletion[");
            sb.append(this.f29886Z);
            sb.append(", ");
            sb.append(this.f29887a0);
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.r1$b */
    /* compiled from: JobSupport.kt */
    private static final class C13393b implements C13238f1 {
        private volatile Object _exceptionsHolder;

        /* renamed from: c */
        private final C13408v1 f29888c;
        public volatile boolean isCompleting;
        public volatile Throwable rootCause;

        public C13393b(C13408v1 v1Var, boolean z, Throwable th) {
            this.f29888c = v1Var;
            this.isCompleting = z;
            this.rootCause = th;
        }

        /* renamed from: e */
        private final ArrayList<Throwable> m41209e() {
            return new ArrayList<>(4);
        }

        /* renamed from: a */
        public boolean mo34370a() {
            return this.rootCause == null;
        }

        /* renamed from: b */
        public C13408v1 mo34371b() {
            return this.f29888c;
        }

        /* renamed from: c */
        public final boolean mo34602c() {
            return this.rootCause != null;
        }

        /* renamed from: d */
        public final boolean mo34603d() {
            return this._exceptionsHolder == C13397s1.f29891a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Finishing[cancelling=");
            sb.append(mo34602c());
            sb.append(", completing=");
            sb.append(this.isCompleting);
            sb.append(", rootCause=");
            sb.append(this.rootCause);
            sb.append(", exceptions=");
            sb.append(this._exceptionsHolder);
            sb.append(", list=");
            sb.append(mo34371b());
            sb.append(']');
            return sb.toString();
        }

        /* renamed from: a */
        public final void mo34600a(Throwable th) {
            Throwable th2 = this.rootCause;
            if (th2 == null) {
                this.rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList e = m41209e();
                        e.add(obj);
                        e.add(th);
                        this._exceptionsHolder = e;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("State is ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
        }

        /* renamed from: b */
        public final List<Throwable> mo34601b(Throwable th) {
            ArrayList arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = m41209e();
            } else if (obj instanceof Throwable) {
                ArrayList e = m41209e();
                e.add(obj);
                arrayList = e;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("State is ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
            Throwable th2 = this.rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && (!Intrinsics.areEqual((Object) th, (Object) th2))) {
                arrayList.add(th);
            }
            this._exceptionsHolder = C13397s1.f29891a;
            return arrayList;
        }
    }

    /* renamed from: kotlinx.coroutines.r1$c */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C13394c extends C13269a {

        /* renamed from: d */
        final /* synthetic */ C13391r1 f29889d;

        /* renamed from: e */
        final /* synthetic */ Object f29890e;

        public C13394c(C13268i iVar, C13268i iVar2, C13391r1 r1Var, Object obj) {
            this.f29889d = r1Var;
            this.f29890e = obj;
            super(iVar2);
        }

        /* renamed from: a */
        public Object mo34408b(C13268i iVar) {
            if (this.f29889d.mo34596l() == this.f29890e) {
                return null;
            }
            return C13267h.m40756a();
        }
    }

    public C13391r1(boolean z) {
        this._state = z ? C13397s1.f29893c : C13397s1.f29892b;
    }

    /* renamed from: b */
    private final boolean m41167b(C13238f1 f1Var, Object obj, int i) {
        if (C13292j0.m40863a()) {
            if (!((f1Var instanceof C13399t0) || (f1Var instanceof C13388q1))) {
                throw new AssertionError();
            }
        }
        if (C13292j0.m40863a() && !(!(obj instanceof C13389r))) {
            throw new AssertionError();
        } else if (!f29883c.compareAndSet(this, f1Var, C13397s1.m41219a(obj))) {
            return false;
        } else {
            mo34593g((Throwable) null);
            mo34331d(obj);
            m41156a(f1Var, obj, i);
            return true;
        }
    }

    /* renamed from: e */
    private final boolean mo34333e(Object obj) {
        int a;
        do {
            Object l = mo34596l();
            if ((l instanceof C13238f1) && (!(l instanceof C13393b) || !((C13393b) l).isCompleting)) {
                a = m41149a(l, (Object) new C13389r(m41171f(obj), false, 2, null), 0);
                if (a != 0) {
                    if (a == 1 || a == 2) {
                        return true;
                    }
                }
            }
            return false;
        } while (a == 3);
        throw new IllegalStateException("unexpected result".toString());
    }

    /* renamed from: f */
    private final Throwable m41171f(Object obj) {
        if (obj != null ? obj instanceof Throwable : true) {
            return obj != null ? (Throwable) obj : mo34337r();
        }
        if (obj != null) {
            return ((C13417y1) obj).mo34591d();
        }
        throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    /* renamed from: g */
    private final Throwable m41172g(Object obj) {
        if (!(obj instanceof C13389r)) {
            obj = null;
        }
        C13389r rVar = (C13389r) obj;
        if (rVar != null) {
            return rVar.f29880a;
        }
        return null;
    }

    /* renamed from: h */
    private final boolean m41174h(Throwable th) {
        boolean z = true;
        if (mo34447n()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        C13342m mVar = this.parentHandle;
        if (mVar == null || mVar == C13411w1.f29910c) {
            return z2;
        }
        if (!mVar.mo34519a(th) && !z2) {
            z = false;
        }
        return z;
    }

    /* renamed from: i */
    private final int m41175i(Object obj) {
        if (obj instanceof C13399t0) {
            if (((C13399t0) obj).mo34370a()) {
                return 0;
            }
            if (!f29883c.compareAndSet(this, obj, C13397s1.f29893c)) {
                return -1;
            }
            mo34336p();
            return 1;
        } else if (!(obj instanceof C13234e1)) {
            return 0;
        } else {
            if (!f29883c.compareAndSet(this, obj, ((C13234e1) obj).mo34371b())) {
                return -1;
            }
            mo34336p();
            return 1;
        }
    }

    /* renamed from: j */
    private final String m41176j(Object obj) {
        String str = "Active";
        if (obj instanceof C13393b) {
            C13393b bVar = (C13393b) obj;
            if (bVar.mo34602c()) {
                return "Cancelling";
            }
            if (bVar.isCompleting) {
                return "Completing";
            }
            return str;
        } else if (!(obj instanceof C13238f1)) {
            return obj instanceof C13389r ? "Cancelled" : "Completed";
        } else {
            if (((C13238f1) obj).mo34370a()) {
                return str;
            }
            return "New";
        }
    }

    /* renamed from: r */
    private final C13331l1 mo34337r() {
        return new C13331l1("Job was cancelled", null, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34446a(Object obj, int i) {
    }

    /* renamed from: c */
    public final CancellationException mo34507c() {
        Object l = mo34596l();
        String str = "Job is still new or active: ";
        if (l instanceof C13393b) {
            Throwable th = ((C13393b) l).rootCause;
            if (th != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(C13323k0.m40937a((Object) this));
                sb.append(" is cancelling");
                CancellationException a = mo34584a(th, sb.toString());
                if (a != null) {
                    return a;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this);
            throw new IllegalStateException(sb2.toString().toString());
        } else if (l instanceof C13238f1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(this);
            throw new IllegalStateException(sb3.toString().toString());
        } else if (l instanceof C13389r) {
            return m41151a(this, ((C13389r) l).f29880a, null, 1, null);
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(C13323k0.m40937a((Object) this));
            sb4.append(" has completed normally");
            return new C13331l1(sb4.toString(), null, this);
        }
    }

    public /* synthetic */ void cancel() {
        mo34506a((CancellationException) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo34331d(Object obj) {
    }

    /* renamed from: d */
    public boolean mo34592d(Throwable th) {
        boolean z = true;
        if (th instanceof CancellationException) {
            return true;
        }
        if (!mo34587a((Object) th) || !mo34561j()) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo34354e(Throwable th) {
        return false;
    }

    public <R> R fold(R r, Function2<? super R, ? super C12691b, ? extends R> function2) {
        return C13325a.m40945a(this, r, function2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo34593g(Throwable th) {
    }

    public <E extends C12691b> E get(C12693c<E> cVar) {
        return C13325a.m40946a((C13324k1) this, cVar);
    }

    public final C12693c<?> getKey() {
        return C13324k1.f29761e;
    }

    /* renamed from: j */
    public boolean mo34561j() {
        return true;
    }

    /* renamed from: k */
    public boolean mo34562k() {
        return false;
    }

    /* renamed from: l */
    public final Object mo34596l() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C13274l)) {
                return obj;
            }
            ((C13274l) obj).mo34406a(this);
        }
    }

    /* renamed from: m */
    public final boolean mo34597m() {
        return !(mo34596l() instanceof C13238f1);
    }

    public C12688f minusKey(C12693c<?> cVar) {
        return C13325a.m40951b(this, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo34447n() {
        return false;
    }

    /* renamed from: o */
    public String mo34335o() {
        return C13323k0.m40937a((Object) this);
    }

    /* renamed from: p */
    public void mo34336p() {
    }

    public C12688f plus(C12688f fVar) {
        return C13325a.m40947a((C13324k1) this, fVar);
    }

    /* renamed from: q */
    public final String mo34598q() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo34335o());
        sb.append('{');
        sb.append(m41176j(mo34596l()));
        sb.append('}');
        return sb.toString();
    }

    public final boolean start() {
        int i;
        do {
            i = m41175i(mo34596l());
            if (i == 0) {
                return false;
            }
        } while (i != 1);
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo34598q());
        sb.append('@');
        sb.append(C13323k0.m40939b(this));
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo34585a(C13324k1 k1Var) {
        if (C13292j0.m40863a()) {
            if (!(this.parentHandle == null)) {
                throw new AssertionError();
            }
        }
        if (k1Var == null) {
            this.parentHandle = C13411w1.f29910c;
            return;
        }
        k1Var.start();
        C13342m a = k1Var.mo34504a((C13368o) this);
        this.parentHandle = a;
        if (mo34597m()) {
            a.dispose();
            this.parentHandle = C13411w1.f29910c;
        }
    }

    /* renamed from: d */
    public CancellationException mo34591d() {
        Throwable th;
        Object l = mo34596l();
        CancellationException cancellationException = null;
        if (l instanceof C13393b) {
            th = ((C13393b) l).rootCause;
        } else if (l instanceof C13389r) {
            th = ((C13389r) l).f29880a;
        } else if (!(l instanceof C13238f1)) {
            th = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot be cancelling child in this state: ");
            sb.append(l);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Parent job is ");
        sb2.append(m41176j(l));
        return new C13331l1(sb2.toString(), th, this);
    }

    /* renamed from: f */
    public void mo34334f(Throwable th) {
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final Throwable mo34594h() {
        Object l = mo34596l();
        String str = "Job is still new or active: ";
        if (l instanceof C13393b) {
            Throwable th = ((C13393b) l).rootCause;
            if (th != null) {
                return th;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this);
            throw new IllegalStateException(sb.toString().toString());
        } else if (l instanceof C13238f1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this);
            throw new IllegalStateException(sb2.toString().toString());
        } else if (l instanceof C13389r) {
            return ((C13389r) l).f29880a;
        } else {
            return null;
        }
    }

    /* renamed from: b */
    private final void m41165b(C13388q1<?> q1Var) {
        q1Var.mo34420a(new C13408v1());
        f29883c.compareAndSet(this, q1Var, q1Var.mo34423e());
    }

    /* renamed from: c */
    public boolean mo34590c(Throwable th) {
        return mo34587a((Object) th) && mo34561j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo34595i() {
        Object l = mo34596l();
        return (l instanceof C13389r) && ((C13389r) l).mo34581a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0054, code lost:
        if (r3 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0056, code lost:
        m41160a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0059, code lost:
        r8 = m41152a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005d, code lost:
        if (r8 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0063, code lost:
        if (m41168b(r2, r8, r9) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0066, code lost:
        return 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x006b, code lost:
        if (m41163a(r2, r9, r10) == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006d, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x006e, code lost:
        return 3;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m41169c(kotlinx.coroutines.C13238f1 r8, java.lang.Object r9, int r10) {
        /*
            r7 = this;
            kotlinx.coroutines.v1 r0 = r7.m41164b(r8)
            r1 = 3
            if (r0 == 0) goto L_0x007e
            boolean r2 = r8 instanceof kotlinx.coroutines.C13391r1.C13393b
            r3 = 0
            if (r2 != 0) goto L_0x000e
            r2 = r3
            goto L_0x000f
        L_0x000e:
            r2 = r8
        L_0x000f:
            kotlinx.coroutines.r1$b r2 = (kotlinx.coroutines.C13391r1.C13393b) r2
            r4 = 0
            if (r2 == 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            kotlinx.coroutines.r1$b r2 = new kotlinx.coroutines.r1$b
            r2.<init>(r0, r4, r3)
        L_0x001a:
            monitor-enter(r2)
            boolean r5 = r2.isCompleting     // Catch:{ all -> 0x007b }
            if (r5 == 0) goto L_0x0021
            monitor-exit(r2)
            return r4
        L_0x0021:
            r4 = 1
            r2.isCompleting = r4     // Catch:{ all -> 0x007b }
            if (r2 == r8) goto L_0x0030
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f29883c     // Catch:{ all -> 0x007b }
            boolean r5 = r5.compareAndSet(r7, r8, r2)     // Catch:{ all -> 0x007b }
            if (r5 != 0) goto L_0x0030
            monitor-exit(r2)
            return r1
        L_0x0030:
            boolean r5 = r2.mo34603d()     // Catch:{ all -> 0x007b }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x006f
            boolean r5 = r2.mo34602c()     // Catch:{ all -> 0x007b }
            boolean r6 = r9 instanceof kotlinx.coroutines.C13389r     // Catch:{ all -> 0x007b }
            if (r6 != 0) goto L_0x0041
            r6 = r3
            goto L_0x0042
        L_0x0041:
            r6 = r9
        L_0x0042:
            kotlinx.coroutines.r r6 = (kotlinx.coroutines.C13389r) r6     // Catch:{ all -> 0x007b }
            if (r6 == 0) goto L_0x004b
            java.lang.Throwable r6 = r6.f29880a     // Catch:{ all -> 0x007b }
            r2.mo34600a(r6)     // Catch:{ all -> 0x007b }
        L_0x004b:
            java.lang.Throwable r6 = r2.rootCause     // Catch:{ all -> 0x007b }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x0051
            r3 = r6
        L_0x0051:
            kotlin.v r5 = kotlin.C13145v.f29587a     // Catch:{ all -> 0x007b }
            monitor-exit(r2)
            if (r3 == 0) goto L_0x0059
            r7.m41160a(r0, r3)
        L_0x0059:
            kotlinx.coroutines.n r8 = r7.m41152a(r8)
            if (r8 == 0) goto L_0x0067
            boolean r8 = r7.m41168b(r2, r8, r9)
            if (r8 == 0) goto L_0x0067
            r8 = 2
            return r8
        L_0x0067:
            boolean r8 = r7.m41163a(r2, r9, r10)
            if (r8 == 0) goto L_0x006e
            return r4
        L_0x006e:
            return r1
        L_0x006f:
            java.lang.String r8 = "Failed requirement."
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007b }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x007b }
            r9.<init>(r8)     // Catch:{ all -> 0x007b }
            throw r9     // Catch:{ all -> 0x007b }
        L_0x007b:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13391r1.m41169c(kotlinx.coroutines.f1, java.lang.Object, int):int");
    }

    /* renamed from: a */
    public boolean mo34330a() {
        Object l = mo34596l();
        return (l instanceof C13238f1) && ((C13238f1) l).mo34370a();
    }

    /* renamed from: b */
    public final boolean mo34589b(Throwable th) {
        return mo34587a((Object) th);
    }

    /* renamed from: b */
    private final C13408v1 m41164b(C13238f1 f1Var) {
        C13408v1 b = f1Var.mo34371b();
        if (b != null) {
            return b;
        }
        if (f1Var instanceof C13399t0) {
            return new C13408v1();
        }
        if (f1Var instanceof C13388q1) {
            m41165b((C13388q1) f1Var);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("State should have list: ");
        sb.append(f1Var);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: a */
    private final boolean m41163a(C13393b bVar, Object obj, int i) {
        boolean c;
        Throwable a;
        boolean z = false;
        if (!(mo34596l() == bVar)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!(!bVar.mo34603d())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (bVar.isCompleting) {
            C13389r rVar = (C13389r) (!(obj instanceof C13389r) ? null : obj);
            Throwable th = rVar != null ? rVar.f29880a : null;
            synchronized (bVar) {
                c = bVar.mo34602c();
                List b = bVar.mo34601b(th);
                a = m41150a(bVar, b);
                if (a != null) {
                    m41155a(a, b);
                }
            }
            if (!(a == null || a == th)) {
                obj = new C13389r(a, false, 2, null);
            }
            if (a != null) {
                if (m41174h(a) || mo34354e(a)) {
                    z = true;
                }
                if (z) {
                    if (obj != null) {
                        ((C13389r) obj).mo34582b();
                    } else {
                        throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    }
                }
            }
            if (!c) {
                mo34593g(a);
            }
            mo34331d(obj);
            if (f29883c.compareAndSet(this, bVar, C13397s1.m41219a(obj))) {
                m41156a((C13238f1) bVar, obj, i);
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected state: ");
            sb.append(this._state);
            sb.append(", expected: ");
            sb.append(bVar);
            sb.append(", update: ");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString().toString());
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r8 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        m41160a(((kotlinx.coroutines.C13391r1.C13393b) r2).mo34371b(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        return true;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m41173h(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r7.mo34596l()
            boolean r3 = r2 instanceof kotlinx.coroutines.C13391r1.C13393b
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x004b
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.r1$b r3 = (kotlinx.coroutines.C13391r1.C13393b) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.mo34603d()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0018
            monitor-exit(r2)
            return r4
        L_0x0018:
            r3 = r2
            kotlinx.coroutines.r1$b r3 = (kotlinx.coroutines.C13391r1.C13393b) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.mo34602c()     // Catch:{ all -> 0x0048 }
            if (r8 != 0) goto L_0x0023
            if (r3 != 0) goto L_0x0030
        L_0x0023:
            if (r1 == 0) goto L_0x0026
            goto L_0x002a
        L_0x0026:
            java.lang.Throwable r1 = r7.m41171f(r8)     // Catch:{ all -> 0x0048 }
        L_0x002a:
            r8 = r2
            kotlinx.coroutines.r1$b r8 = (kotlinx.coroutines.C13391r1.C13393b) r8     // Catch:{ all -> 0x0048 }
            r8.mo34600a(r1)     // Catch:{ all -> 0x0048 }
        L_0x0030:
            r8 = r2
            kotlinx.coroutines.r1$b r8 = (kotlinx.coroutines.C13391r1.C13393b) r8     // Catch:{ all -> 0x0048 }
            java.lang.Throwable r8 = r8.rootCause     // Catch:{ all -> 0x0048 }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r8 = r0
        L_0x003b:
            monitor-exit(r2)
            if (r8 == 0) goto L_0x0047
            kotlinx.coroutines.r1$b r2 = (kotlinx.coroutines.C13391r1.C13393b) r2
            kotlinx.coroutines.v1 r0 = r2.mo34371b()
            r7.m41160a(r0, r8)
        L_0x0047:
            return r5
        L_0x0048:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x004b:
            boolean r3 = r2 instanceof kotlinx.coroutines.C13238f1
            if (r3 == 0) goto L_0x00a2
            if (r1 == 0) goto L_0x0052
            goto L_0x0056
        L_0x0052:
            java.lang.Throwable r1 = r7.m41171f(r8)
        L_0x0056:
            r3 = r2
            kotlinx.coroutines.f1 r3 = (kotlinx.coroutines.C13238f1) r3
            boolean r6 = r3.mo34370a()
            if (r6 == 0) goto L_0x0066
            boolean r2 = r7.m41162a(r3, r1)
            if (r2 == 0) goto L_0x0002
            return r5
        L_0x0066:
            kotlinx.coroutines.r r3 = new kotlinx.coroutines.r
            r6 = 2
            r3.<init>(r1, r4, r6, r0)
            int r3 = r7.m41149a(r2, r3, r4)
            if (r3 == 0) goto L_0x0087
            if (r3 == r5) goto L_0x0086
            if (r3 == r6) goto L_0x0086
            r2 = 3
            if (r3 != r2) goto L_0x007a
            goto L_0x0002
        L_0x007a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected result"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x0086:
            return r5
        L_0x0087:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Cannot happen in "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L_0x00a2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13391r1.m41173h(java.lang.Object):boolean");
    }

    /* renamed from: b */
    private final boolean m41168b(C13393b bVar, C13363n nVar, Object obj) {
        while (C13325a.m40948a(nVar.f29850X, false, false, new C13392a(this, bVar, nVar, obj), 1, null) == C13411w1.f29910c) {
            nVar = m41153a((C13268i) nVar);
            if (nVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private final void m41166b(C13408v1 v1Var, Throwable th) {
        Object d = v1Var.mo34422d();
        if (d != null) {
            C13409w wVar = null;
            for (C13268i iVar = (C13268i) d; !Intrinsics.areEqual((Object) iVar, (Object) v1Var); iVar = iVar.mo34423e()) {
                if (iVar instanceof C13388q1) {
                    C13388q1 q1Var = (C13388q1) iVar;
                    try {
                        q1Var.mo34401b(th);
                    } catch (Throwable th2) {
                        if (wVar != null) {
                            C12722c.m39860a(wVar, th2);
                            if (wVar != null) {
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Exception in completion handler ");
                        sb.append(q1Var);
                        sb.append(" for ");
                        sb.append(this);
                        wVar = new C13409w(sb.toString(), th2);
                        C13145v vVar = C13145v.f29587a;
                    }
                }
            }
            if (wVar != null) {
                mo34334f((Throwable) wVar);
                return;
            }
            return;
        }
        throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: b */
    public final boolean mo34588b(Object obj, int i) {
        int a;
        do {
            a = m41149a(mo34596l(), obj, i);
            if (a == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Job ");
                sb.append(this);
                sb.append(" is already complete or completing, ");
                sb.append("but is being completed with ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString(), m41172g(obj));
            } else if (a == 1) {
                return true;
            } else {
                if (a == 2) {
                    return false;
                }
            }
        } while (a == 3);
        throw new IllegalStateException("unexpected result".toString());
    }

    /* renamed from: a */
    private final Throwable m41150a(C13393b bVar, List<? extends Throwable> list) {
        Object obj;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th = (Throwable) obj;
            if (th == null) {
                th = (Throwable) list.get(0);
            }
            return th;
        } else if (bVar.mo34602c()) {
            return mo34337r();
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private final void m41155a(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set a = C13256d.m40746a(list.size());
            Throwable d = C13278p.m40820d(th);
            for (Throwable d2 : list) {
                Throwable d3 = C13278p.m40820d(d2);
                if (d3 != th && d3 != d && !(d3 instanceof CancellationException) && a.add(d3)) {
                    C12722c.m39860a(th, d3);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m41156a(C13238f1 f1Var, Object obj, int i) {
        C13342m mVar = this.parentHandle;
        if (mVar != null) {
            mVar.dispose();
            this.parentHandle = C13411w1.f29910c;
        }
        Throwable th = null;
        C13389r rVar = (C13389r) (!(obj instanceof C13389r) ? null : obj);
        if (rVar != null) {
            th = rVar.f29880a;
        }
        if (f1Var instanceof C13388q1) {
            try {
                ((C13388q1) f1Var).mo34401b(th);
            } catch (Throwable th2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in completion handler ");
                sb.append(f1Var);
                sb.append(" for ");
                sb.append(this);
                mo34334f((Throwable) new C13409w(sb.toString(), th2));
            }
        } else {
            C13408v1 b = f1Var.mo34371b();
            if (b != null) {
                m41166b(b, th);
            }
        }
        mo34446a(obj, i);
    }

    /* renamed from: a */
    private final void m41160a(C13408v1 v1Var, Throwable th) {
        mo34593g(th);
        Object d = v1Var.mo34422d();
        if (d != null) {
            C13409w wVar = null;
            for (C13268i iVar = (C13268i) d; !Intrinsics.areEqual((Object) iVar, (Object) v1Var); iVar = iVar.mo34423e()) {
                if (iVar instanceof C13344m1) {
                    C13388q1 q1Var = (C13388q1) iVar;
                    try {
                        q1Var.mo34401b(th);
                    } catch (Throwable th2) {
                        if (wVar != null) {
                            C12722c.m39860a(wVar, th2);
                            if (wVar != null) {
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Exception in completion handler ");
                        sb.append(q1Var);
                        sb.append(" for ");
                        sb.append(this);
                        wVar = new C13409w(sb.toString(), th2);
                        C13145v vVar = C13145v.f29587a;
                    }
                }
            }
            if (wVar != null) {
                mo34334f((Throwable) wVar);
            }
            m41174h(th);
            return;
        }
        throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: a */
    public static /* synthetic */ CancellationException m41151a(C13391r1 r1Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return r1Var.mo34584a(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final CancellationException mo34584a(Throwable th, String str) {
        CancellationException cancellationException = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (cancellationException == null) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(C13323k0.m40937a((Object) th));
                sb.append(" was cancelled");
                str = sb.toString();
            }
            cancellationException = new C13331l1(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: a */
    private final C13388q1<?> m41154a(Function1<? super Throwable, C13145v> function1, boolean z) {
        String str = "Failed requirement.";
        boolean z2 = true;
        C13344m1 m1Var = null;
        if (z) {
            if (function1 instanceof C13344m1) {
                m1Var = function1;
            }
            C13344m1 m1Var2 = m1Var;
            if (m1Var2 != null) {
                if (m1Var2.f29878W != this) {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalArgumentException(str.toString());
                } else if (m1Var2 != null) {
                    return m1Var2;
                }
            }
            return new C13251i1(this, function1);
        }
        if (function1 instanceof C13388q1) {
            m1Var = function1;
        }
        C13388q1<?> q1Var = m1Var;
        if (q1Var != null) {
            if (q1Var.f29878W != this || (q1Var instanceof C13344m1)) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(str.toString());
            } else if (q1Var != null) {
                return q1Var;
            }
        }
        return new C13293j1(this, function1);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kotlinx.coroutines.e1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m41159a(kotlinx.coroutines.C13399t0 r3) {
        /*
            r2 = this;
            kotlinx.coroutines.v1 r0 = new kotlinx.coroutines.v1
            r0.<init>()
            boolean r1 = r3.mo34370a()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            kotlinx.coroutines.e1 r1 = new kotlinx.coroutines.e1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f29883c
            r1.compareAndSet(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13391r1.m41159a(kotlinx.coroutines.t0):void");
    }

    /* renamed from: a */
    public void mo34506a(CancellationException cancellationException) {
        mo34590c(cancellationException);
    }

    /* renamed from: a */
    public final void mo34563a(C13417y1 y1Var) {
        mo34587a((Object) y1Var);
    }

    /* renamed from: a */
    public final boolean mo34587a(Object obj) {
        if (!mo34562k() || !mo34333e(obj)) {
            return m41173h(obj);
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m41162a(C13238f1 f1Var, Throwable th) {
        if (C13292j0.m40863a() && !(!(f1Var instanceof C13393b))) {
            throw new AssertionError();
        } else if (!C13292j0.m40863a() || f1Var.mo34370a()) {
            C13408v1 b = m41164b(f1Var);
            if (b == null) {
                return false;
            }
            if (!f29883c.compareAndSet(this, f1Var, new C13393b(b, false, th))) {
                return false;
            }
            m41160a(b, th);
            return true;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private final int m41149a(Object obj, Object obj2, int i) {
        if (!(obj instanceof C13238f1)) {
            return 0;
        }
        if (((obj instanceof C13399t0) || (obj instanceof C13388q1)) && !(obj instanceof C13363n) && !(obj2 instanceof C13389r)) {
            return !m41167b((C13238f1) obj, obj2, i) ? 3 : 1;
        }
        return m41169c((C13238f1) obj, obj2, i);
    }

    /* renamed from: a */
    private final C13363n m41152a(C13238f1 f1Var) {
        C13363n nVar = (C13363n) (!(f1Var instanceof C13363n) ? null : f1Var);
        if (nVar != null) {
            return nVar;
        }
        C13408v1 b = f1Var.mo34371b();
        if (b != null) {
            return m41153a((C13268i) b);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m41157a(C13393b bVar, C13363n nVar, Object obj) {
        if (mo34596l() == bVar) {
            C13363n a = m41153a((C13268i) nVar);
            if ((a == null || !m41168b(bVar, a, obj)) && m41163a(bVar, obj, 0)) {
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: a */
    private final C13363n m41153a(C13268i iVar) {
        while (iVar.mo34428j()) {
            iVar = iVar.mo34425g();
        }
        while (true) {
            iVar = iVar.mo34423e();
            if (!iVar.mo34428j()) {
                if (iVar instanceof C13363n) {
                    return (C13363n) iVar;
                }
                if (iVar instanceof C13408v1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: a */
    public final C13342m mo34504a(C13368o oVar) {
        C13396s0 a = C13325a.m40948a(this, true, false, new C13363n(this, oVar), 2, null);
        if (a != null) {
            return (C13342m) a;
        }
        throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r4v0, types: [kotlinx.coroutines.w1] */
    /* JADX WARNING: type inference failed for: r4v1, types: [kotlinx.coroutines.s0] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [kotlinx.coroutines.s0, kotlinx.coroutines.q1] */
    /* JADX WARNING: type inference failed for: r1v5, types: [kotlinx.coroutines.q1] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7, types: [kotlinx.coroutines.s0, kotlinx.coroutines.q1] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r1v8, types: [kotlinx.coroutines.q1] */
    /* JADX WARNING: type inference failed for: r1v9, types: [kotlinx.coroutines.s0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v10, types: [kotlinx.coroutines.q1] */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0002, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v2
      assigns: []
      uses: []
      mth insns count: 89
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.C13396s0 mo34505a(boolean r8, boolean r9, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.C13145v> r10) {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r7.mo34596l()
            boolean r3 = r2 instanceof kotlinx.coroutines.C13399t0
            if (r3 == 0) goto L_0x0027
            r3 = r2
            kotlinx.coroutines.t0 r3 = (kotlinx.coroutines.C13399t0) r3
            boolean r4 = r3.mo34370a()
            if (r4 == 0) goto L_0x0023
            if (r1 == 0) goto L_0x0016
            goto L_0x001a
        L_0x0016:
            kotlinx.coroutines.q1 r1 = r7.m41154a(r10, r8)
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f29883c
            boolean r2 = r3.compareAndSet(r7, r2, r1)
            if (r2 == 0) goto L_0x0002
            return r1
        L_0x0023:
            r7.m41159a(r3)
            goto L_0x0002
        L_0x0027:
            boolean r3 = r2 instanceof kotlinx.coroutines.C13238f1
            if (r3 == 0) goto L_0x0091
            r3 = r2
            kotlinx.coroutines.f1 r3 = (kotlinx.coroutines.C13238f1) r3
            kotlinx.coroutines.v1 r3 = r3.mo34371b()
            if (r3 != 0) goto L_0x0044
            if (r2 == 0) goto L_0x003c
            kotlinx.coroutines.q1 r2 = (kotlinx.coroutines.C13388q1) r2
            r7.m41165b(r2)
            goto L_0x0002
        L_0x003c:
            kotlin.s r8 = new kotlin.s
            java.lang.String r9 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>"
            r8.<init>(r9)
            throw r8
        L_0x0044:
            kotlinx.coroutines.w1 r4 = kotlinx.coroutines.C13411w1.f29910c
            if (r8 == 0) goto L_0x007a
            boolean r5 = r2 instanceof kotlinx.coroutines.C13391r1.C13393b
            if (r5 == 0) goto L_0x007a
            monitor-enter(r2)
            r5 = r2
            kotlinx.coroutines.r1$b r5 = (kotlinx.coroutines.C13391r1.C13393b) r5     // Catch:{ all -> 0x0077 }
            java.lang.Throwable r5 = r5.rootCause     // Catch:{ all -> 0x0077 }
            if (r5 == 0) goto L_0x005f
            boolean r6 = r10 instanceof kotlinx.coroutines.C13363n     // Catch:{ all -> 0x0077 }
            if (r6 == 0) goto L_0x0073
            r6 = r2
            kotlinx.coroutines.r1$b r6 = (kotlinx.coroutines.C13391r1.C13393b) r6     // Catch:{ all -> 0x0077 }
            boolean r6 = r6.isCompleting     // Catch:{ all -> 0x0077 }
            if (r6 != 0) goto L_0x0073
        L_0x005f:
            if (r1 == 0) goto L_0x0062
            goto L_0x0066
        L_0x0062:
            kotlinx.coroutines.q1 r1 = r7.m41154a(r10, r8)     // Catch:{ all -> 0x0077 }
        L_0x0066:
            boolean r4 = r7.m41161a(r2, r3, r1)     // Catch:{ all -> 0x0077 }
            if (r4 != 0) goto L_0x006e
            monitor-exit(r2)
            goto L_0x0002
        L_0x006e:
            if (r5 != 0) goto L_0x0072
            monitor-exit(r2)
            return r1
        L_0x0072:
            r4 = r1
        L_0x0073:
            kotlin.v r6 = kotlin.C13145v.f29587a     // Catch:{ all -> 0x0077 }
            monitor-exit(r2)
            goto L_0x007b
        L_0x0077:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x007a:
            r5 = r0
        L_0x007b:
            if (r5 == 0) goto L_0x0083
            if (r9 == 0) goto L_0x0082
            r10.invoke(r5)
        L_0x0082:
            return r4
        L_0x0083:
            if (r1 == 0) goto L_0x0086
            goto L_0x008a
        L_0x0086:
            kotlinx.coroutines.q1 r1 = r7.m41154a(r10, r8)
        L_0x008a:
            boolean r2 = r7.m41161a(r2, r3, r1)
            if (r2 == 0) goto L_0x0002
            return r1
        L_0x0091:
            if (r9 == 0) goto L_0x00a1
            boolean r8 = r2 instanceof kotlinx.coroutines.C13389r
            if (r8 != 0) goto L_0x0098
            r2 = r0
        L_0x0098:
            kotlinx.coroutines.r r2 = (kotlinx.coroutines.C13389r) r2
            if (r2 == 0) goto L_0x009e
            java.lang.Throwable r0 = r2.f29880a
        L_0x009e:
            r10.invoke(r0)
        L_0x00a1:
            kotlinx.coroutines.w1 r8 = kotlinx.coroutines.C13411w1.f29910c
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13391r1.mo34505a(boolean, boolean, kotlin.jvm.functions.Function1):kotlinx.coroutines.s0");
    }

    /* renamed from: a */
    private final boolean m41161a(Object obj, C13408v1 v1Var, C13388q1<?> q1Var) {
        int a;
        C13394c cVar = new C13394c(q1Var, q1Var, this, obj);
        do {
            Object f = v1Var.mo34424f();
            if (f != null) {
                a = ((C13268i) f).mo34419a(q1Var, v1Var, cVar);
                if (a == 1) {
                    return true;
                }
            } else {
                throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (a != 2);
        return false;
    }

    /* renamed from: a */
    public final void mo34586a(C13388q1<?> q1Var) {
        Object l;
        do {
            l = mo34596l();
            if (!(l instanceof C13388q1)) {
                if ((l instanceof C13238f1) && ((C13238f1) l).mo34371b() != null) {
                    q1Var.mo34417k();
                }
                return;
            } else if (l != q1Var) {
                return;
            }
        } while (!f29883c.compareAndSet(this, l, C13397s1.f29893c));
    }
}
