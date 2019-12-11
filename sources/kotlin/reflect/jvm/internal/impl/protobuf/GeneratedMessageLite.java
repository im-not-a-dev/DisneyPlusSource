package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType;

public abstract class GeneratedMessageLite extends AbstractMessageLite implements Serializable {

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$1 */
    static /* synthetic */ class C130711 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType = new int[JavaType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$protobuf$WireFormat$JavaType = r0
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch:{ NoSuchFieldError -> 0x0014 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch:{ NoSuchFieldError -> 0x001f }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.C130711.<clinit>():void");
        }
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite, BuilderType extends Builder> extends kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder<BuilderType> {
        private ByteString unknownFields = ByteString.EMPTY;

        protected Builder() {
        }

        public abstract MessageType getDefaultInstanceForType();

        public final ByteString getUnknownFields() {
            return this.unknownFields;
        }

        public abstract BuilderType mergeFrom(MessageType messagetype);

        public final BuilderType setUnknownFields(ByteString byteString) {
            this.unknownFields = byteString;
            return this;
        }

        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType> {
        private FieldSet<ExtensionDescriptor> extensions = FieldSet.emptySet();
        private boolean extensionsIsMutable;

        protected ExtendableBuilder() {
        }

        /* access modifiers changed from: private */
        public FieldSet<ExtensionDescriptor> buildExtensions() {
            this.extensions.makeImmutable();
            this.extensionsIsMutable = false;
            return this.extensions;
        }

        private void ensureExtensionsIsMutable() {
            if (!this.extensionsIsMutable) {
                this.extensions = this.extensions.clone();
                this.extensionsIsMutable = true;
            }
        }

        /* access modifiers changed from: protected */
        public boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        /* access modifiers changed from: protected */
        public final void mergeExtensionFields(MessageType messagetype) {
            ensureExtensionsIsMutable();
            this.extensions.mergeFrom(messagetype.extensions);
        }

        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements ExtendableMessageOrBuilder<MessageType> {
        /* access modifiers changed from: private */
        public final FieldSet<ExtensionDescriptor> extensions;

        protected class ExtensionWriter {
            private final Iterator<Entry<ExtensionDescriptor, Object>> iter;
            private final boolean messageSetWireFormat;
            private Entry<ExtensionDescriptor, Object> next;

            /* synthetic */ ExtensionWriter(ExtendableMessage extendableMessage, boolean z, C130711 r3) {
                this(z);
            }

            public void writeUntil(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Entry<ExtensionDescriptor, Object> entry = this.next;
                    if (entry != null && ((ExtensionDescriptor) entry.getKey()).getNumber() < i) {
                        ExtensionDescriptor extensionDescriptor = (ExtensionDescriptor) this.next.getKey();
                        if (!this.messageSetWireFormat || extensionDescriptor.getLiteJavaType() != JavaType.MESSAGE || extensionDescriptor.isRepeated()) {
                            FieldSet.writeField(extensionDescriptor, this.next.getValue(), codedOutputStream);
                        } else {
                            codedOutputStream.writeMessageSetExtension(extensionDescriptor.getNumber(), (MessageLite) this.next.getValue());
                        }
                        if (this.iter.hasNext()) {
                            this.next = (Entry) this.iter.next();
                        } else {
                            this.next = null;
                        }
                    } else {
                        return;
                    }
                }
            }

            private ExtensionWriter(boolean z) {
                this.iter = ExtendableMessage.this.extensions.iterator();
                if (this.iter.hasNext()) {
                    this.next = (Entry) this.iter.next();
                }
                this.messageSetWireFormat = z;
            }
        }

        protected ExtendableMessage() {
            this.extensions = FieldSet.newFieldSet();
        }

        private void verifyExtensionContainingType(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* access modifiers changed from: protected */
        public boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        /* access modifiers changed from: protected */
        public int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        public final <Type> Type getExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            Object field = this.extensions.getField(generatedExtension.descriptor);
            if (field == null) {
                return generatedExtension.defaultValue;
            }
            return generatedExtension.fromFieldSetType(field);
        }

        public final <Type> int getExtensionCount(GeneratedExtension<MessageType, List<Type>> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            return this.extensions.getRepeatedFieldCount(generatedExtension.descriptor);
        }

        public final <Type> boolean hasExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            return this.extensions.hasField(generatedExtension.descriptor);
        }

        /* access modifiers changed from: protected */
        public void makeExtensionsImmutable() {
            this.extensions.makeImmutable();
        }

        /* access modifiers changed from: protected */
        public ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter<>(this, false, null);
        }

        /* access modifiers changed from: protected */
        public boolean parseUnknownField(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            return GeneratedMessageLite.parseUnknownField(this.extensions, getDefaultInstanceForType(), codedInputStream, codedOutputStream, extensionRegistryLite, i);
        }

        protected ExtendableMessage(ExtendableBuilder<MessageType, ?> extendableBuilder) {
            this.extensions = extendableBuilder.buildExtensions();
        }

        public final <Type> Type getExtension(GeneratedExtension<MessageType, List<Type>> generatedExtension, int i) {
            verifyExtensionContainingType(generatedExtension);
            return generatedExtension.singularFromFieldSetType(this.extensions.getRepeatedField(generatedExtension.descriptor, i));
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage> extends MessageLiteOrBuilder {
    }

    static final class ExtensionDescriptor implements FieldDescriptorLite<ExtensionDescriptor> {
        final EnumLiteMap<?> enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final FieldType type;

        ExtensionDescriptor(EnumLiteMap<?> enumLiteMap, int i, FieldType fieldType, boolean z, boolean z2) {
            this.enumTypeMap = enumLiteMap;
            this.number = i;
            this.type = fieldType;
            this.isRepeated = z;
            this.isPacked = z2;
        }

        public EnumLiteMap<?> getEnumType() {
            return this.enumTypeMap;
        }

        public JavaType getLiteJavaType() {
            return this.type.getJavaType();
        }

        public FieldType getLiteType() {
            return this.type;
        }

        public int getNumber() {
            return this.number;
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder internalMergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mergeFrom((GeneratedMessageLite) messageLite);
        }

        public boolean isPacked() {
            return this.isPacked;
        }

        public boolean isRepeated() {
            return this.isRepeated;
        }

        public int compareTo(ExtensionDescriptor extensionDescriptor) {
            return this.number - extensionDescriptor.number;
        }
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> {
        final ContainingType containingTypeDefaultInstance;
        final Type defaultValue;
        final ExtensionDescriptor descriptor;
        final Method enumValueOf;
        final MessageLite messageDefaultInstance;
        final Class singularType;

        GeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, ExtensionDescriptor extensionDescriptor, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (extensionDescriptor.getLiteType() == FieldType.MESSAGE && messageLite == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.containingTypeDefaultInstance = containingtype;
                this.defaultValue = type;
                this.messageDefaultInstance = messageLite;
                this.descriptor = extensionDescriptor;
                this.singularType = cls;
                if (EnumLite.class.isAssignableFrom(cls)) {
                    this.enumValueOf = GeneratedMessageLite.getMethodOrDie(cls, "valueOf", Integer.TYPE);
                    return;
                }
                this.enumValueOf = null;
            }
        }

        /* access modifiers changed from: 0000 */
        public Object fromFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularFromFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object singularFromFieldSetType : (List) obj) {
                arrayList.add(singularFromFieldSetType(singularFromFieldSetType));
            }
            return arrayList;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        public MessageLite getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        public int getNumber() {
            return this.descriptor.getNumber();
        }

        /* access modifiers changed from: 0000 */
        public Object singularFromFieldSetType(Object obj) {
            if (this.descriptor.getLiteJavaType() != JavaType.ENUM) {
                return obj;
            }
            return GeneratedMessageLite.invokeOrDie(this.enumValueOf, null, (Integer) obj);
        }

        /* access modifiers changed from: 0000 */
        public Object singularToFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == JavaType.ENUM ? Integer.valueOf(((EnumLite) obj).getNumber()) : obj;
        }
    }

    protected GeneratedMessageLite() {
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String valueOf = String.valueOf(String.valueOf(cls.getName()));
            String valueOf2 = String.valueOf(String.valueOf(str));
            StringBuilder sb = new StringBuilder(valueOf.length() + 45 + valueOf2.length());
            sb.append("Generated message class \"");
            sb.append(valueOf);
            sb.append("\" missing method \"");
            sb.append(valueOf2);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, EnumLiteMap<?> enumLiteMap, int i, FieldType fieldType, boolean z, Class cls) {
        List emptyList = Collections.emptyList();
        ExtensionDescriptor extensionDescriptor = new ExtensionDescriptor(enumLiteMap, i, fieldType, true, z);
        GeneratedExtension generatedExtension = new GeneratedExtension(containingtype, emptyList, messageLite, extensionDescriptor, cls);
        return generatedExtension;
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, EnumLiteMap<?> enumLiteMap, int i, FieldType fieldType, Class cls) {
        ExtensionDescriptor extensionDescriptor = new ExtensionDescriptor(enumLiteMap, i, fieldType, false, false);
        GeneratedExtension generatedExtension = new GeneratedExtension(containingtype, type, messageLite, extensionDescriptor, cls);
        return generatedExtension;
    }

    public Parser<? extends MessageLite> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* access modifiers changed from: protected */
    public void makeExtensionsImmutable() {
    }

    /* access modifiers changed from: protected */
    public boolean parseUnknownField(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
        return codedInputStream.skipField(i, codedOutputStream);
    }

    protected GeneratedMessageLite(Builder builder) {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite> boolean parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtensionDescriptor> r5, MessageType r6, kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r7, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r9, int r10) throws java.io.IOException {
        /*
            int r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.getTagWireType(r10)
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.getTagFieldNumber(r10)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$GeneratedExtension r6 = r9.findLiteExtensionByNumber(r6, r1)
            r1 = 0
            r2 = 1
            if (r6 != 0) goto L_0x0013
        L_0x0010:
            r0 = 1
        L_0x0011:
            r3 = 0
            goto L_0x003d
        L_0x0013:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtensionDescriptor r3 = r6.descriptor
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r3 = r3.getLiteType()
            int r3 = kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.getWireFormatForFieldType(r3, r1)
            if (r0 != r3) goto L_0x0021
            r0 = 0
            goto L_0x0011
        L_0x0021:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtensionDescriptor r3 = r6.descriptor
            boolean r4 = r3.isRepeated
            if (r4 == 0) goto L_0x0010
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r3 = r3.type
            boolean r3 = r3.isPackable()
            if (r3 == 0) goto L_0x0010
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtensionDescriptor r3 = r6.descriptor
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r3 = r3.getLiteType()
            int r3 = kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.getWireFormatForFieldType(r3, r2)
            if (r0 != r3) goto L_0x0010
            r0 = 0
            r3 = 1
        L_0x003d:
            if (r0 == 0) goto L_0x0044
            boolean r5 = r7.skipField(r10, r8)
            return r5
        L_0x0044:
            if (r3 == 0) goto L_0x0094
            int r8 = r7.readRawVarint32()
            int r8 = r7.pushLimit(r8)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r6.descriptor
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r9 = r9.getLiteType()
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.ENUM
            if (r9 != r10) goto L_0x0079
        L_0x0058:
            int r9 = r7.getBytesUntilLimit()
            if (r9 <= 0) goto L_0x008f
            int r9 = r7.readEnum()
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtensionDescriptor r10 = r6.descriptor
            kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLiteMap r10 = r10.getEnumType()
            kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLite r9 = r10.findValueByNumber(r9)
            if (r9 != 0) goto L_0x006f
            return r2
        L_0x006f:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtensionDescriptor r10 = r6.descriptor
            java.lang.Object r9 = r6.singularToFieldSetType(r9)
            r5.addRepeatedField(r10, r9)
            goto L_0x0058
        L_0x0079:
            int r9 = r7.getBytesUntilLimit()
            if (r9 <= 0) goto L_0x008f
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r6.descriptor
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r9 = r9.getLiteType()
            java.lang.Object r9 = kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.readPrimitiveField(r7, r9, r1)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtensionDescriptor r10 = r6.descriptor
            r5.addRepeatedField(r10, r9)
            goto L_0x0079
        L_0x008f:
            r7.popLimit(r8)
            goto L_0x0120
        L_0x0094:
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.C130711.$SwitchMap$com$google$protobuf$WireFormat$JavaType
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtensionDescriptor r3 = r6.descriptor
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r3 = r3.getLiteJavaType()
            int r3 = r3.ordinal()
            r0 = r0[r3]
            if (r0 == r2) goto L_0x00cb
            r9 = 2
            if (r0 == r9) goto L_0x00b2
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtensionDescriptor r8 = r6.descriptor
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r8 = r8.getLiteType()
            java.lang.Object r7 = kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.readPrimitiveField(r7, r8, r1)
            goto L_0x0105
        L_0x00b2:
            int r7 = r7.readEnum()
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r6.descriptor
            kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLiteMap r9 = r9.getEnumType()
            kotlin.reflect.jvm.internal.impl.protobuf.Internal$EnumLite r9 = r9.findValueByNumber(r7)
            if (r9 != 0) goto L_0x00c9
            r8.writeRawVarint32(r10)
            r8.writeUInt32NoTag(r7)
            return r2
        L_0x00c9:
            r7 = r9
            goto L_0x0105
        L_0x00cb:
            r8 = 0
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtensionDescriptor r10 = r6.descriptor
            boolean r10 = r10.isRepeated()
            if (r10 != 0) goto L_0x00e2
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtensionDescriptor r10 = r6.descriptor
            java.lang.Object r10 = r5.getField(r10)
            kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r10 = (kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) r10
            if (r10 == 0) goto L_0x00e2
            kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder r8 = r10.toBuilder()
        L_0x00e2:
            if (r8 != 0) goto L_0x00ec
            kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r8 = r6.getMessageDefaultInstance()
            kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder r8 = r8.newBuilderForType()
        L_0x00ec:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtensionDescriptor r10 = r6.descriptor
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = r10.getLiteType()
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP
            if (r10 != r0) goto L_0x00fe
            int r10 = r6.getNumber()
            r7.readGroup(r10, r8, r9)
            goto L_0x0101
        L_0x00fe:
            r7.readMessage(r8, r9)
        L_0x0101:
            kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r7 = r8.build()
        L_0x0105:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtensionDescriptor r8 = r6.descriptor
            boolean r8 = r8.isRepeated()
            if (r8 == 0) goto L_0x0117
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtensionDescriptor r8 = r6.descriptor
            java.lang.Object r6 = r6.singularToFieldSetType(r7)
            r5.addRepeatedField(r8, r6)
            goto L_0x0120
        L_0x0117:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtensionDescriptor r8 = r6.descriptor
            java.lang.Object r6 = r6.singularToFieldSetType(r7)
            r5.setField(r8, r6)
        L_0x0120:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.FieldSet, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite, int):boolean");
    }
}
