package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.internal.C12863c;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal;
import kotlin.reflect.jvm.internal.ReflectProperties.LazyVal;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0006\b \u0018\u0000 >*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004=>?@B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eB3\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0011J\n\u00104\u001a\u0004\u0018\u00010\u0017H\u0004J\u0013\u00105\u001a\u00020)2\b\u00106\u001a\u0004\u0018\u00010\nH\u0002J\u001e\u00107\u001a\u0004\u0018\u00010\n2\b\u00108\u001a\u0004\u0018\u00010\u00172\b\u00109\u001a\u0004\u0018\u00010\nH\u0004J\b\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020\u0007H\u0016R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\r0\r0\u0013X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010*R\u0014\u0010+\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0013\u0010.\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u00102¨\u0006A"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl;", "R", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "descriptorInitialValue", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "_descriptor", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin.jvm.PlatformType", "_javaField", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Ljava/lang/reflect/Field;", "getBoundReceiver", "()Ljava/lang/Object;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "getter", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "getGetter", "()Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "isBound", "", "()Z", "isConst", "isLateinit", "isSuspend", "javaField", "getJavaField", "()Ljava/lang/reflect/Field;", "getName", "()Ljava/lang/String;", "getSignature", "computeDelegateField", "equals", "other", "getDelegate", "field", "receiver", "hashCode", "", "toString", "Accessor", "Companion", "Getter", "Setter", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: KPropertyImpl.kt */
public abstract class KPropertyImpl<R> extends KCallableImpl<R> implements KProperty<R> {
    public static final Companion Companion = new Companion(null);
    /* access modifiers changed from: private */
    public static final Object EXTENSION_PROPERTY_DELEGATE = new Object();
    private final LazySoftVal<PropertyDescriptor> _descriptor;
    private final LazyVal<Field> _javaField;
    private final KDeclarationContainerImpl container;
    private final String name;
    private final Object rawBoundReceiver;
    private final String signature;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;", "()V", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getDefaultCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyAccessorDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "isBound", "", "()Z", "isExternal", "isInfix", "isInline", "isOperator", "isSuspend", "property", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "getProperty", "()Lkotlin/reflect/jvm/internal/KPropertyImpl;", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: KPropertyImpl.kt */
    public static abstract class Accessor<PropertyType, ReturnType> extends KCallableImpl<ReturnType> implements KFunction<ReturnType>, kotlin.reflect.KProperty.Accessor<PropertyType> {
        public KDeclarationContainerImpl getContainer() {
            return getProperty().getContainer();
        }

        public Caller<?> getDefaultCaller() {
            return null;
        }

        public abstract PropertyAccessorDescriptor getDescriptor();

        public abstract KPropertyImpl<PropertyType> getProperty();

        public boolean isBound() {
            return getProperty().isBound();
        }

        public boolean isExternal() {
            return getDescriptor().isExternal();
        }

        public boolean isInfix() {
            return getDescriptor().isInfix();
        }

        public boolean isInline() {
            return getDescriptor().isInline();
        }

        public boolean isOperator() {
            return getDescriptor().isOperator();
        }

        public boolean isSuspend() {
            return getDescriptor().isSuspend();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Companion;", "", "()V", "EXTENSION_PROPERTY_DELEGATE", "getEXTENSION_PROPERTY_DELEGATE", "()Ljava/lang/Object;", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: KPropertyImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Object getEXTENSION_PROPERTY_DELEGATE() {
            return KPropertyImpl.EXTENSION_PROPERTY_DELEGATE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004R\u001f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8VX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "Lkotlin/reflect/KProperty$Getter;", "()V", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyGetterDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "name", "", "getName", "()Ljava/lang/String;", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: KPropertyImpl.kt */
    public static abstract class Getter<R> extends Accessor<R, R> implements kotlin.reflect.KProperty.Getter<R> {
        static final /* synthetic */ KProperty[] $$delegatedProperties;
        private final LazyVal caller$delegate = ReflectProperties.lazy(new KPropertyImpl$Getter$caller$2(this));
        private final LazySoftVal descriptor$delegate = ReflectProperties.lazySoft(new KPropertyImpl$Getter$descriptor$2(this));

        static {
            Class<Getter> cls = Getter.class;
            $$delegatedProperties = new KProperty[]{C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
        }

        public Caller<?> getCaller() {
            return (Caller) this.caller$delegate.getValue(this, $$delegatedProperties[1]);
        }

        public PropertyGetterDescriptor getDescriptor() {
            return (PropertyGetterDescriptor) this.descriptor$delegate.getValue(this, $$delegatedProperties[0]);
        }

        public String getName() {
            StringBuilder sb = new StringBuilder();
            sb.append("<get-");
            sb.append(getProperty().getName());
            sb.append('>');
            return sb.toString();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005¢\u0006\u0002\u0010\u0005R\u001f\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00078VX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8VX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "", "Lkotlin/reflect/KMutableProperty$Setter;", "()V", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertySetterDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "name", "", "getName", "()Ljava/lang/String;", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: KPropertyImpl.kt */
    public static abstract class Setter<R> extends Accessor<R, C13145v> implements kotlin.reflect.KMutableProperty.Setter<R> {
        static final /* synthetic */ KProperty[] $$delegatedProperties;
        private final LazyVal caller$delegate = ReflectProperties.lazy(new KPropertyImpl$Setter$caller$2(this));
        private final LazySoftVal descriptor$delegate = ReflectProperties.lazySoft(new KPropertyImpl$Setter$descriptor$2(this));

        static {
            Class<Setter> cls = Setter.class;
            $$delegatedProperties = new KProperty[]{C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
        }

        public Caller<?> getCaller() {
            return (Caller) this.caller$delegate.getValue(this, $$delegatedProperties[1]);
        }

        public PropertySetterDescriptor getDescriptor() {
            return (PropertySetterDescriptor) this.descriptor$delegate.getValue(this, $$delegatedProperties[0]);
        }

        public String getName() {
            StringBuilder sb = new StringBuilder();
            sb.append("<set-");
            sb.append(getProperty().getName());
            sb.append('>');
            return sb.toString();
        }
    }

    private KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, PropertyDescriptor propertyDescriptor, Object obj) {
        this.container = kDeclarationContainerImpl;
        this.name = str;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        LazyVal<Field> lazy = ReflectProperties.lazy(new KPropertyImpl$_javaField$1(this));
        C12880j.m40222a((Object) lazy, "ReflectProperties.lazy {…y -> null\n        }\n    }");
        this._javaField = lazy;
        LazySoftVal<PropertyDescriptor> lazySoft = ReflectProperties.lazySoft(propertyDescriptor, new KPropertyImpl$_descriptor$1(this));
        C12880j.m40222a((Object) lazySoft, "ReflectProperties.lazySo…or(name, signature)\n    }");
        this._descriptor = lazySoft;
    }

    /* access modifiers changed from: protected */
    public final Field computeDelegateField() {
        if (getDescriptor().isDelegated()) {
            return getJavaField();
        }
        return null;
    }

    public boolean equals(Object obj) {
        KPropertyImpl asKPropertyImpl = UtilKt.asKPropertyImpl(obj);
        if (asKPropertyImpl == null || !C12880j.m40224a((Object) getContainer(), (Object) asKPropertyImpl.getContainer()) || !C12880j.m40224a((Object) getName(), (Object) asKPropertyImpl.getName()) || !C12880j.m40224a((Object) this.signature, (Object) asKPropertyImpl.signature) || !C12880j.m40224a(this.rawBoundReceiver, asKPropertyImpl.rawBoundReceiver)) {
            return false;
        }
        return true;
    }

    public final Object getBoundReceiver() {
        return InlineClassAwareCallerKt.coerceToExpectedReceiverType(this.rawBoundReceiver, getDescriptor());
    }

    public Caller<?> getCaller() {
        return getGetter().getCaller();
    }

    public KDeclarationContainerImpl getContainer() {
        return this.container;
    }

    public Caller<?> getDefaultCaller() {
        return getGetter().getDefaultCaller();
    }

    /* access modifiers changed from: protected */
    public final Object getDelegate(Field field, Object obj) {
        try {
            if (obj == EXTENSION_PROPERTY_DELEGATE) {
                if (getDescriptor().getExtensionReceiverParameter() == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('\'');
                    sb.append(this);
                    sb.append("' is not an extension property and thus getExtensionDelegate() ");
                    sb.append("is not going to work, use getDelegate() instead");
                    throw new RuntimeException(sb.toString());
                }
            }
            if (field != null) {
                return field.get(obj);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new IllegalPropertyDelegateAccessException(e);
        }
    }

    public abstract Getter<R> getGetter();

    public final Field getJavaField() {
        return (Field) this._javaField.invoke();
    }

    public String getName() {
        return this.name;
    }

    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + this.signature.hashCode();
    }

    public boolean isBound() {
        return !C12880j.m40224a(this.rawBoundReceiver, C12863c.NO_RECEIVER);
    }

    public boolean isConst() {
        return getDescriptor().isConst();
    }

    public boolean isLateinit() {
        return getDescriptor().isLateInit();
    }

    public boolean isSuspend() {
        return false;
    }

    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.renderProperty(getDescriptor());
    }

    public PropertyDescriptor getDescriptor() {
        Object invoke = this._descriptor.invoke();
        C12880j.m40222a(invoke, "_descriptor()");
        return (PropertyDescriptor) invoke;
    }

    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        this(kDeclarationContainerImpl, str, str2, null, obj);
    }

    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, PropertyDescriptor propertyDescriptor) {
        String asString = propertyDescriptor.getName().asString();
        C12880j.m40222a((Object) asString, "descriptor.name.asString()");
        this(kDeclarationContainerImpl, asString, RuntimeTypeMapper.INSTANCE.mapPropertySignature(propertyDescriptor).asString(), propertyDescriptor, C12863c.NO_RECEIVER);
    }
}
