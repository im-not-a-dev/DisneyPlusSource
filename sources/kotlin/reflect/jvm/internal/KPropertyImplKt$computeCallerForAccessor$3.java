package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.KPropertyImpl.Accessor;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.BoundInstance;
import kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.BoundJvmStaticInObject;
import kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.Instance;
import kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.JvmStaticInObject;
import kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.Static;
import kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"computeFieldCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KPropertyImpl.kt */
final class KPropertyImplKt$computeCallerForAccessor$3 extends C12881k implements Function1<Field, CallerImpl<? extends Field>> {
    final /* synthetic */ boolean $isGetter;
    final /* synthetic */ KPropertyImplKt$computeCallerForAccessor$1 $isJvmStaticProperty$1;
    final /* synthetic */ KPropertyImplKt$computeCallerForAccessor$2 $isNotNullProperty$2;
    final /* synthetic */ Accessor $this_computeCallerForAccessor;

    KPropertyImplKt$computeCallerForAccessor$3(Accessor accessor, boolean z, KPropertyImplKt$computeCallerForAccessor$2 kPropertyImplKt$computeCallerForAccessor$2, KPropertyImplKt$computeCallerForAccessor$1 kPropertyImplKt$computeCallerForAccessor$1) {
        this.$this_computeCallerForAccessor = accessor;
        this.$isGetter = z;
        this.$isNotNullProperty$2 = kPropertyImplKt$computeCallerForAccessor$2;
        this.$isJvmStaticProperty$1 = kPropertyImplKt$computeCallerForAccessor$1;
        super(1);
    }

    public final CallerImpl<Field> invoke(Field field) {
        if (KPropertyImplKt.isJvmFieldPropertyInCompanionObject(this.$this_computeCallerForAccessor.getProperty().getDescriptor()) || !Modifier.isStatic(field.getModifiers())) {
            if (this.$isGetter) {
                if (this.$this_computeCallerForAccessor.isBound()) {
                    return new BoundInstance(field, KPropertyImplKt.getBoundReceiver(this.$this_computeCallerForAccessor));
                }
                return new Instance(field);
            } else if (this.$this_computeCallerForAccessor.isBound()) {
                return new FieldSetter.BoundInstance(field, this.$isNotNullProperty$2.invoke(), KPropertyImplKt.getBoundReceiver(this.$this_computeCallerForAccessor));
            } else {
                return new FieldSetter.Instance(field, this.$isNotNullProperty$2.invoke());
            }
        } else if (this.$isJvmStaticProperty$1.invoke()) {
            if (this.$isGetter) {
                if (this.$this_computeCallerForAccessor.isBound()) {
                    return new BoundJvmStaticInObject(field);
                }
                return new JvmStaticInObject(field);
            } else if (this.$this_computeCallerForAccessor.isBound()) {
                return new FieldSetter.BoundJvmStaticInObject(field, this.$isNotNullProperty$2.invoke());
            } else {
                return new FieldSetter.JvmStaticInObject(field, this.$isNotNullProperty$2.invoke());
            }
        } else if (this.$isGetter) {
            return new Static(field);
        } else {
            return new FieldSetter.Static(field, this.$isNotNullProperty$2.invoke());
        }
    }
}
