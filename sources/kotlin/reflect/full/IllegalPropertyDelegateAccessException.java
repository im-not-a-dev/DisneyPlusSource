package kotlin.reflect.full;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo31007d2 = {"Lkotlin/reflect/full/IllegalPropertyDelegateAccessException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "Ljava/lang/IllegalAccessException;", "(Ljava/lang/IllegalAccessException;)V", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: exceptions.kt */
public final class IllegalPropertyDelegateAccessException extends Exception {
    public IllegalPropertyDelegateAccessException(IllegalAccessException illegalAccessException) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", illegalAccessException);
    }
}
