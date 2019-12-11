package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType;

public final class JvmProtoBuf {
    public static final GeneratedExtension<Class, Integer> anonymousObjectOriginName;
    public static final GeneratedExtension<Class, List<Property>> classLocalVariable = GeneratedMessageLite.newRepeatedGeneratedExtension(Class.getDefaultInstance(), Property.getDefaultInstance(), null, 102, FieldType.MESSAGE, false, Property.class);
    public static final GeneratedExtension<Class, Integer> classModuleName;
    public static final GeneratedExtension<Constructor, JvmMethodSignature> constructorSignature = GeneratedMessageLite.newSingularGeneratedExtension(Constructor.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), null, 100, FieldType.MESSAGE, JvmMethodSignature.class);
    public static final GeneratedExtension<Property, Integer> flags;
    public static final GeneratedExtension<Type, Boolean> isRaw = GeneratedMessageLite.newSingularGeneratedExtension(Type.getDefaultInstance(), Boolean.valueOf(false), null, null, 101, FieldType.BOOL, Boolean.class);
    public static final GeneratedExtension<Function, Integer> lambdaClassOriginName;
    public static final GeneratedExtension<Function, JvmMethodSignature> methodSignature = GeneratedMessageLite.newSingularGeneratedExtension(Function.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), null, 100, FieldType.MESSAGE, JvmMethodSignature.class);
    public static final GeneratedExtension<Package, List<Property>> packageLocalVariable = GeneratedMessageLite.newRepeatedGeneratedExtension(Package.getDefaultInstance(), Property.getDefaultInstance(), null, 102, FieldType.MESSAGE, false, Property.class);
    public static final GeneratedExtension<Package, Integer> packageModuleName;
    public static final GeneratedExtension<Property, JvmPropertySignature> propertySignature = GeneratedMessageLite.newSingularGeneratedExtension(Property.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), null, 100, FieldType.MESSAGE, JvmPropertySignature.class);
    public static final GeneratedExtension<Type, List<Annotation>> typeAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(Type.getDefaultInstance(), Annotation.getDefaultInstance(), null, 100, FieldType.MESSAGE, false, Annotation.class);
    public static final GeneratedExtension<TypeParameter, List<Annotation>> typeParameterAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(TypeParameter.getDefaultInstance(), Annotation.getDefaultInstance(), null, 100, FieldType.MESSAGE, false, Annotation.class);

    public static final class JvmFieldSignature extends GeneratedMessageLite implements JvmFieldSignatureOrBuilder {
        public static Parser<JvmFieldSignature> PARSER = new AbstractParser<JvmFieldSignature>() {
            public JvmFieldSignature parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new JvmFieldSignature(codedInputStream, extensionRegistryLite);
            }
        };
        private static final JvmFieldSignature defaultInstance = new JvmFieldSignature(true);
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int name_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<JvmFieldSignature, Builder> implements JvmFieldSignatureOrBuilder {
            private int bitField0_;
            private int desc_;
            private int name_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void maybeForceBuilderInitialization() {
            }

            public JvmFieldSignature buildPartial() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                jvmFieldSignature.name_ = this.name_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmFieldSignature.desc_ = this.desc_;
                jvmFieldSignature.bitField0_ = i2;
                return jvmFieldSignature;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder setDesc(int i) {
                this.bitField0_ |= 2;
                this.desc_ = i;
                return this;
            }

            public Builder setName(int i) {
                this.bitField0_ |= 1;
                this.name_ = i;
                return this;
            }

            public JvmFieldSignature build() {
                JvmFieldSignature buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
            }

            public JvmFieldSignature getDefaultInstanceForType() {
                return JvmFieldSignature.getDefaultInstance();
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Builder mergeFrom(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmFieldSignature.hasName()) {
                    setName(jvmFieldSignature.getName());
                }
                if (jvmFieldSignature.hasDesc()) {
                    setDesc(jvmFieldSignature.getDesc());
                }
                setUnknownFields(getUnknownFields().concat(jvmFieldSignature.unknownFields));
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                JvmFieldSignature jvmFieldSignature;
                JvmFieldSignature jvmFieldSignature2 = null;
                try {
                    JvmFieldSignature jvmFieldSignature3 = (JvmFieldSignature) JvmFieldSignature.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (jvmFieldSignature3 != null) {
                        mergeFrom(jvmFieldSignature3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    jvmFieldSignature = (JvmFieldSignature) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    jvmFieldSignature2 = jvmFieldSignature;
                }
                if (jvmFieldSignature2 != null) {
                    mergeFrom(jvmFieldSignature2);
                }
                throw th;
            }
        }

        static {
            defaultInstance.initFields();
        }

        public static JvmFieldSignature getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.name_ = 0;
            this.desc_ = 0;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public int getDesc() {
            return this.desc_;
        }

        public int getName() {
            return this.name_;
        }

        public Parser<JvmFieldSignature> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.computeInt32Size(2, this.desc_);
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasDesc() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) == 1;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.desc_);
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static Builder newBuilder(JvmFieldSignature jvmFieldSignature) {
            return newBuilder().mergeFrom(jvmFieldSignature);
        }

        public JvmFieldSignature getDefaultInstanceForType() {
            return defaultInstance;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        private JvmFieldSignature(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private JvmFieldSignature(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private JvmFieldSignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.bitField0_ |= 1;
                            this.name_ = codedInputStream.readInt32();
                        } else if (readTag == 16) {
                            this.bitField0_ |= 2;
                            this.desc_ = codedInputStream.readInt32();
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public interface JvmFieldSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class JvmMethodSignature extends GeneratedMessageLite implements JvmMethodSignatureOrBuilder {
        public static Parser<JvmMethodSignature> PARSER = new AbstractParser<JvmMethodSignature>() {
            public JvmMethodSignature parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new JvmMethodSignature(codedInputStream, extensionRegistryLite);
            }
        };
        private static final JvmMethodSignature defaultInstance = new JvmMethodSignature(true);
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int name_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<JvmMethodSignature, Builder> implements JvmMethodSignatureOrBuilder {
            private int bitField0_;
            private int desc_;
            private int name_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void maybeForceBuilderInitialization() {
            }

            public JvmMethodSignature buildPartial() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                jvmMethodSignature.name_ = this.name_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmMethodSignature.desc_ = this.desc_;
                jvmMethodSignature.bitField0_ = i2;
                return jvmMethodSignature;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder setDesc(int i) {
                this.bitField0_ |= 2;
                this.desc_ = i;
                return this;
            }

            public Builder setName(int i) {
                this.bitField0_ |= 1;
                this.name_ = i;
                return this;
            }

            public JvmMethodSignature build() {
                JvmMethodSignature buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
            }

            public JvmMethodSignature getDefaultInstanceForType() {
                return JvmMethodSignature.getDefaultInstance();
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Builder mergeFrom(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmMethodSignature.hasName()) {
                    setName(jvmMethodSignature.getName());
                }
                if (jvmMethodSignature.hasDesc()) {
                    setDesc(jvmMethodSignature.getDesc());
                }
                setUnknownFields(getUnknownFields().concat(jvmMethodSignature.unknownFields));
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                JvmMethodSignature jvmMethodSignature;
                JvmMethodSignature jvmMethodSignature2 = null;
                try {
                    JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) JvmMethodSignature.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (jvmMethodSignature3 != null) {
                        mergeFrom(jvmMethodSignature3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    jvmMethodSignature = (JvmMethodSignature) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    jvmMethodSignature2 = jvmMethodSignature;
                }
                if (jvmMethodSignature2 != null) {
                    mergeFrom(jvmMethodSignature2);
                }
                throw th;
            }
        }

        static {
            defaultInstance.initFields();
        }

        public static JvmMethodSignature getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.name_ = 0;
            this.desc_ = 0;
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public int getDesc() {
            return this.desc_;
        }

        public int getName() {
            return this.name_;
        }

        public Parser<JvmMethodSignature> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.computeInt32Size(2, this.desc_);
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasDesc() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) == 1;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.desc_);
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static Builder newBuilder(JvmMethodSignature jvmMethodSignature) {
            return newBuilder().mergeFrom(jvmMethodSignature);
        }

        public JvmMethodSignature getDefaultInstanceForType() {
            return defaultInstance;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        private JvmMethodSignature(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private JvmMethodSignature(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private JvmMethodSignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.bitField0_ |= 1;
                            this.name_ = codedInputStream.readInt32();
                        } else if (readTag == 16) {
                            this.bitField0_ |= 2;
                            this.desc_ = codedInputStream.readInt32();
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public interface JvmMethodSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class JvmPropertySignature extends GeneratedMessageLite implements JvmPropertySignatureOrBuilder {
        public static Parser<JvmPropertySignature> PARSER = new AbstractParser<JvmPropertySignature>() {
            public JvmPropertySignature parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new JvmPropertySignature(codedInputStream, extensionRegistryLite);
            }
        };
        private static final JvmPropertySignature defaultInstance = new JvmPropertySignature(true);
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public JvmFieldSignature field_;
        /* access modifiers changed from: private */
        public JvmMethodSignature getter_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public JvmMethodSignature setter_;
        /* access modifiers changed from: private */
        public JvmMethodSignature syntheticMethod_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<JvmPropertySignature, Builder> implements JvmPropertySignatureOrBuilder {
            private int bitField0_;
            private JvmFieldSignature field_ = JvmFieldSignature.getDefaultInstance();
            private JvmMethodSignature getter_ = JvmMethodSignature.getDefaultInstance();
            private JvmMethodSignature setter_ = JvmMethodSignature.getDefaultInstance();
            private JvmMethodSignature syntheticMethod_ = JvmMethodSignature.getDefaultInstance();

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void maybeForceBuilderInitialization() {
            }

            public JvmPropertySignature buildPartial() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                int i = this.bitField0_;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                jvmPropertySignature.field_ = this.field_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmPropertySignature.syntheticMethod_ = this.syntheticMethod_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                jvmPropertySignature.getter_ = this.getter_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                jvmPropertySignature.setter_ = this.setter_;
                jvmPropertySignature.bitField0_ = i2;
                return jvmPropertySignature;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeField(JvmFieldSignature jvmFieldSignature) {
                if ((this.bitField0_ & 1) != 1 || this.field_ == JvmFieldSignature.getDefaultInstance()) {
                    this.field_ = jvmFieldSignature;
                } else {
                    this.field_ = JvmFieldSignature.newBuilder(this.field_).mergeFrom(jvmFieldSignature).buildPartial();
                }
                this.bitField0_ |= 1;
                return this;
            }

            public Builder mergeGetter(JvmMethodSignature jvmMethodSignature) {
                if ((this.bitField0_ & 4) != 4 || this.getter_ == JvmMethodSignature.getDefaultInstance()) {
                    this.getter_ = jvmMethodSignature;
                } else {
                    this.getter_ = JvmMethodSignature.newBuilder(this.getter_).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.bitField0_ |= 4;
                return this;
            }

            public Builder mergeSetter(JvmMethodSignature jvmMethodSignature) {
                if ((this.bitField0_ & 8) != 8 || this.setter_ == JvmMethodSignature.getDefaultInstance()) {
                    this.setter_ = jvmMethodSignature;
                } else {
                    this.setter_ = JvmMethodSignature.newBuilder(this.setter_).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder mergeSyntheticMethod(JvmMethodSignature jvmMethodSignature) {
                if ((this.bitField0_ & 2) != 2 || this.syntheticMethod_ == JvmMethodSignature.getDefaultInstance()) {
                    this.syntheticMethod_ = jvmMethodSignature;
                } else {
                    this.syntheticMethod_ = JvmMethodSignature.newBuilder(this.syntheticMethod_).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.bitField0_ |= 2;
                return this;
            }

            public JvmPropertySignature build() {
                JvmPropertySignature buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
            }

            public JvmPropertySignature getDefaultInstanceForType() {
                return JvmPropertySignature.getDefaultInstance();
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Builder mergeFrom(JvmPropertySignature jvmPropertySignature) {
                if (jvmPropertySignature == JvmPropertySignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmPropertySignature.hasField()) {
                    mergeField(jvmPropertySignature.getField());
                }
                if (jvmPropertySignature.hasSyntheticMethod()) {
                    mergeSyntheticMethod(jvmPropertySignature.getSyntheticMethod());
                }
                if (jvmPropertySignature.hasGetter()) {
                    mergeGetter(jvmPropertySignature.getGetter());
                }
                if (jvmPropertySignature.hasSetter()) {
                    mergeSetter(jvmPropertySignature.getSetter());
                }
                setUnknownFields(getUnknownFields().concat(jvmPropertySignature.unknownFields));
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                JvmPropertySignature jvmPropertySignature;
                JvmPropertySignature jvmPropertySignature2 = null;
                try {
                    JvmPropertySignature jvmPropertySignature3 = (JvmPropertySignature) JvmPropertySignature.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (jvmPropertySignature3 != null) {
                        mergeFrom(jvmPropertySignature3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    jvmPropertySignature = (JvmPropertySignature) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    jvmPropertySignature2 = jvmPropertySignature;
                }
                if (jvmPropertySignature2 != null) {
                    mergeFrom(jvmPropertySignature2);
                }
                throw th;
            }
        }

        static {
            defaultInstance.initFields();
        }

        public static JvmPropertySignature getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.field_ = JvmFieldSignature.getDefaultInstance();
            this.syntheticMethod_ = JvmMethodSignature.getDefaultInstance();
            this.getter_ = JvmMethodSignature.getDefaultInstance();
            this.setter_ = JvmMethodSignature.getDefaultInstance();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public JvmFieldSignature getField() {
            return this.field_;
        }

        public JvmMethodSignature getGetter() {
            return this.getter_;
        }

        public Parser<JvmPropertySignature> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.computeMessageSize(1, this.field_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.computeMessageSize(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i2 += CodedOutputStream.computeMessageSize(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i2 += CodedOutputStream.computeMessageSize(4, this.setter_);
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public JvmMethodSignature getSetter() {
            return this.setter_;
        }

        public JvmMethodSignature getSyntheticMethod() {
            return this.syntheticMethod_;
        }

        public boolean hasField() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasGetter() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasSetter() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasSyntheticMethod() {
            return (this.bitField0_ & 2) == 2;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(1, this.field_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(4, this.setter_);
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static Builder newBuilder(JvmPropertySignature jvmPropertySignature) {
            return newBuilder().mergeFrom(jvmPropertySignature);
        }

        public JvmPropertySignature getDefaultInstanceForType() {
            return defaultInstance;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        private JvmPropertySignature(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private JvmPropertySignature(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        /* JADX WARNING: type inference failed for: r6v0 */
        /* JADX WARNING: type inference failed for: r6v1, types: [kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$Builder] */
        /* JADX WARNING: type inference failed for: r6v2, types: [kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$Builder] */
        /* JADX WARNING: type inference failed for: r6v3, types: [kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$Builder] */
        /* JADX WARNING: type inference failed for: r6v4, types: [kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$Builder] */
        /* JADX WARNING: type inference failed for: r6v5, types: [kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$Builder] */
        /* JADX WARNING: type inference failed for: r6v6, types: [kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$Builder] */
        /* JADX WARNING: type inference failed for: r6v7, types: [kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$Builder] */
        /* JADX WARNING: type inference failed for: r6v8, types: [kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$Builder] */
        /* JADX WARNING: type inference failed for: r6v9 */
        /* JADX WARNING: type inference failed for: r6v10 */
        /* JADX WARNING: type inference failed for: r6v11 */
        /* JADX WARNING: type inference failed for: r6v12 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$Builder, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$Builder]
          uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$Builder, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$Builder]
          mth insns count: 120
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 5 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private JvmPropertySignature(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r9) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /*
                r7 = this;
                r7.<init>()
                r0 = -1
                r7.memoizedIsInitialized = r0
                r7.memoizedSerializedSize = r0
                r7.initFields()
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString$Output r0 = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.newOutput()
                r1 = 1
                kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.newInstance(r0, r1)
                r3 = 0
            L_0x0015:
                if (r3 != 0) goto L_0x010c
                int r4 = r8.readTag()     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                if (r4 == 0) goto L_0x00dc
                r5 = 10
                r6 = 0
                if (r4 == r5) goto L_0x00b3
                r5 = 18
                if (r4 == r5) goto L_0x0089
                r5 = 26
                if (r4 == r5) goto L_0x0060
                r5 = 34
                if (r4 == r5) goto L_0x0036
                boolean r4 = r7.parseUnknownField(r8, r2, r9, r4)     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                if (r4 != 0) goto L_0x0015
                goto L_0x00dc
            L_0x0036:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r5 = 8
                r4 = r4 & r5
                if (r4 != r5) goto L_0x0043
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r7.setter_     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$Builder r6 = r4.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            L_0x0043:
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature> r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r8.readMessage(r4, r9)     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r4     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r7.setter_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                if (r6 == 0) goto L_0x005a
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r7.setter_     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r6.mergeFrom(r4)     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r6.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r7.setter_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            L_0x005a:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r4 = r4 | r5
                r7.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                goto L_0x0015
            L_0x0060:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r5 = 4
                r4 = r4 & r5
                if (r4 != r5) goto L_0x006c
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r7.getter_     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$Builder r6 = r4.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            L_0x006c:
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature> r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r8.readMessage(r4, r9)     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r4     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r7.getter_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                if (r6 == 0) goto L_0x0083
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r7.getter_     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r6.mergeFrom(r4)     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r6.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r7.getter_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            L_0x0083:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r4 = r4 | r5
                r7.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                goto L_0x0015
            L_0x0089:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r5 = 2
                r4 = r4 & r5
                if (r4 != r5) goto L_0x0095
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r7.syntheticMethod_     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$Builder r6 = r4.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            L_0x0095:
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature> r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r8.readMessage(r4, r9)     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r4     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r7.syntheticMethod_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                if (r6 == 0) goto L_0x00ac
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r7.syntheticMethod_     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r6.mergeFrom(r4)     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r6.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r7.syntheticMethod_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            L_0x00ac:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r4 = r4 | r5
                r7.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                goto L_0x0015
            L_0x00b3:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r4 = r4 & r1
                if (r4 != r1) goto L_0x00be
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r4 = r7.field_     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$Builder r6 = r4.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            L_0x00be:
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature> r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r8.readMessage(r4, r9)     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature) r4     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r7.field_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                if (r6 == 0) goto L_0x00d5
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r4 = r7.field_     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r6.mergeFrom(r4)     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r4 = r6.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r7.field_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
            L_0x00d5:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                r4 = r4 | r1
                r7.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x00f0, IOException -> 0x00e1 }
                goto L_0x0015
            L_0x00dc:
                r3 = 1
                goto L_0x0015
            L_0x00df:
                r8 = move-exception
                goto L_0x00f6
            L_0x00e1:
                r8 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r9 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x00df }
                java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x00df }
                r9.<init>(r8)     // Catch:{ all -> 0x00df }
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r8 = r9.setUnfinishedMessage(r7)     // Catch:{ all -> 0x00df }
                throw r8     // Catch:{ all -> 0x00df }
            L_0x00f0:
                r8 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r8 = r8.setUnfinishedMessage(r7)     // Catch:{ all -> 0x00df }
                throw r8     // Catch:{ all -> 0x00df }
            L_0x00f6:
                r2.flush()     // Catch:{ IOException -> 0x00f9, all -> 0x0100 }
            L_0x00f9:
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r9 = r0.toByteString()
                r7.unknownFields = r9
                goto L_0x0108
            L_0x0100:
                r8 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r9 = r0.toByteString()
                r7.unknownFields = r9
                throw r8
            L_0x0108:
                r7.makeExtensionsImmutable()
                throw r8
            L_0x010c:
                r2.flush()     // Catch:{ IOException -> 0x010f, all -> 0x0116 }
            L_0x010f:
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r8 = r0.toByteString()
                r7.unknownFields = r8
                goto L_0x011e
            L_0x0116:
                r8 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString r9 = r0.toByteString()
                r7.unknownFields = r9
                throw r8
            L_0x011e:
                r7.makeExtensionsImmutable()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
        }
    }

    public interface JvmPropertySignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements StringTableTypesOrBuilder {
        public static Parser<StringTableTypes> PARSER = new AbstractParser<StringTableTypes>() {
            public StringTableTypes parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new StringTableTypes(codedInputStream, extensionRegistryLite);
            }
        };
        private static final StringTableTypes defaultInstance = new StringTableTypes(true);
        private int localNameMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> localName_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Record> record_;
        /* access modifiers changed from: private */
        public final ByteString unknownFields;

        public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<StringTableTypes, Builder> implements StringTableTypesOrBuilder {
            private int bitField0_;
            private List<Integer> localName_ = Collections.emptyList();
            private List<Record> record_ = Collections.emptyList();

            private Builder() {
                maybeForceBuilderInitialization();
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            private void ensureLocalNameIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.localName_ = new ArrayList(this.localName_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureRecordIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.record_ = new ArrayList(this.record_);
                    this.bitField0_ |= 1;
                }
            }

            private void maybeForceBuilderInitialization() {
            }

            public StringTableTypes buildPartial() {
                StringTableTypes stringTableTypes = new StringTableTypes((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                if ((this.bitField0_ & 1) == 1) {
                    this.record_ = Collections.unmodifiableList(this.record_);
                    this.bitField0_ &= -2;
                }
                stringTableTypes.record_ = this.record_;
                if ((this.bitField0_ & 2) == 2) {
                    this.localName_ = Collections.unmodifiableList(this.localName_);
                    this.bitField0_ &= -3;
                }
                stringTableTypes.localName_ = this.localName_;
                return stringTableTypes;
            }

            public final boolean isInitialized() {
                return true;
            }

            public StringTableTypes build() {
                StringTableTypes buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
            }

            public StringTableTypes getDefaultInstanceForType() {
                return StringTableTypes.getDefaultInstance();
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Builder mergeFrom(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.getDefaultInstance()) {
                    return this;
                }
                if (!stringTableTypes.record_.isEmpty()) {
                    if (this.record_.isEmpty()) {
                        this.record_ = stringTableTypes.record_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRecordIsMutable();
                        this.record_.addAll(stringTableTypes.record_);
                    }
                }
                if (!stringTableTypes.localName_.isEmpty()) {
                    if (this.localName_.isEmpty()) {
                        this.localName_ = stringTableTypes.localName_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureLocalNameIsMutable();
                        this.localName_.addAll(stringTableTypes.localName_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(stringTableTypes.unknownFields));
                return this;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                StringTableTypes stringTableTypes;
                StringTableTypes stringTableTypes2 = null;
                try {
                    StringTableTypes stringTableTypes3 = (StringTableTypes) StringTableTypes.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (stringTableTypes3 != null) {
                        mergeFrom(stringTableTypes3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    stringTableTypes = (StringTableTypes) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    stringTableTypes2 = stringTableTypes;
                }
                if (stringTableTypes2 != null) {
                    mergeFrom(stringTableTypes2);
                }
                throw th;
            }
        }

        public static final class Record extends GeneratedMessageLite implements RecordOrBuilder {
            public static Parser<Record> PARSER = new AbstractParser<Record>() {
                public Record parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Record(codedInputStream, extensionRegistryLite);
                }
            };
            private static final Record defaultInstance = new Record(true);
            /* access modifiers changed from: private */
            public int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            /* access modifiers changed from: private */
            public Operation operation_;
            /* access modifiers changed from: private */
            public int predefinedIndex_;
            /* access modifiers changed from: private */
            public int range_;
            private int replaceCharMemoizedSerializedSize;
            /* access modifiers changed from: private */
            public List<Integer> replaceChar_;
            /* access modifiers changed from: private */
            public Object string_;
            private int substringIndexMemoizedSerializedSize;
            /* access modifiers changed from: private */
            public List<Integer> substringIndex_;
            /* access modifiers changed from: private */
            public final ByteString unknownFields;

            public static final class Builder extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<Record, Builder> implements RecordOrBuilder {
                private int bitField0_;
                private Operation operation_ = Operation.NONE;
                private int predefinedIndex_;
                private int range_ = 1;
                private List<Integer> replaceChar_ = Collections.emptyList();
                private Object string_ = "";
                private List<Integer> substringIndex_ = Collections.emptyList();

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                /* access modifiers changed from: private */
                public static Builder create() {
                    return new Builder();
                }

                private void ensureReplaceCharIsMutable() {
                    if ((this.bitField0_ & 32) != 32) {
                        this.replaceChar_ = new ArrayList(this.replaceChar_);
                        this.bitField0_ |= 32;
                    }
                }

                private void ensureSubstringIndexIsMutable() {
                    if ((this.bitField0_ & 16) != 16) {
                        this.substringIndex_ = new ArrayList(this.substringIndex_);
                        this.bitField0_ |= 16;
                    }
                }

                private void maybeForceBuilderInitialization() {
                }

                public Record buildPartial() {
                    Record record = new Record((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder) this);
                    int i = this.bitField0_;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    record.range_ = this.range_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    record.predefinedIndex_ = this.predefinedIndex_;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    record.string_ = this.string_;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    record.operation_ = this.operation_;
                    if ((this.bitField0_ & 16) == 16) {
                        this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                        this.bitField0_ &= -17;
                    }
                    record.substringIndex_ = this.substringIndex_;
                    if ((this.bitField0_ & 32) == 32) {
                        this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
                        this.bitField0_ &= -33;
                    }
                    record.replaceChar_ = this.replaceChar_;
                    record.bitField0_ = i2;
                    return record;
                }

                public final boolean isInitialized() {
                    return true;
                }

                public Builder setOperation(Operation operation) {
                    if (operation != null) {
                        this.bitField0_ |= 8;
                        this.operation_ = operation;
                        return this;
                    }
                    throw new NullPointerException();
                }

                public Builder setPredefinedIndex(int i) {
                    this.bitField0_ |= 2;
                    this.predefinedIndex_ = i;
                    return this;
                }

                public Builder setRange(int i) {
                    this.bitField0_ |= 1;
                    this.range_ = i;
                    return this;
                }

                public Record build() {
                    Record buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
                }

                public Record getDefaultInstanceForType() {
                    return Record.getDefaultInstance();
                }

                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public Builder mergeFrom(Record record) {
                    if (record == Record.getDefaultInstance()) {
                        return this;
                    }
                    if (record.hasRange()) {
                        setRange(record.getRange());
                    }
                    if (record.hasPredefinedIndex()) {
                        setPredefinedIndex(record.getPredefinedIndex());
                    }
                    if (record.hasString()) {
                        this.bitField0_ |= 4;
                        this.string_ = record.string_;
                    }
                    if (record.hasOperation()) {
                        setOperation(record.getOperation());
                    }
                    if (!record.substringIndex_.isEmpty()) {
                        if (this.substringIndex_.isEmpty()) {
                            this.substringIndex_ = record.substringIndex_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureSubstringIndexIsMutable();
                            this.substringIndex_.addAll(record.substringIndex_);
                        }
                    }
                    if (!record.replaceChar_.isEmpty()) {
                        if (this.replaceChar_.isEmpty()) {
                            this.replaceChar_ = record.replaceChar_;
                            this.bitField0_ &= -33;
                        } else {
                            ensureReplaceCharIsMutable();
                            this.replaceChar_.addAll(record.replaceChar_);
                        }
                    }
                    setUnknownFields(getUnknownFields().concat(record.unknownFields));
                    return this;
                }

                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    Record record;
                    Record record2 = null;
                    try {
                        Record record3 = (Record) Record.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (record3 != null) {
                            mergeFrom(record3);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        record = (Record) e.getUnfinishedMessage();
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        record2 = record;
                    }
                    if (record2 != null) {
                        mergeFrom(record2);
                    }
                    throw th;
                }
            }

            public enum Operation implements EnumLite {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);
                
                private static EnumLiteMap<Operation> internalValueMap;
                private final int value;

                static {
                    internalValueMap = new EnumLiteMap<Operation>() {
                        public Operation findValueByNumber(int i) {
                            return Operation.valueOf(i);
                        }
                    };
                }

                private Operation(int i, int i2) {
                    this.value = i2;
                }

                public final int getNumber() {
                    return this.value;
                }

                public static Operation valueOf(int i) {
                    if (i == 0) {
                        return NONE;
                    }
                    if (i == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }
            }

            static {
                defaultInstance.initFields();
            }

            public static Record getDefaultInstance() {
                return defaultInstance;
            }

            private void initFields() {
                this.range_ = 1;
                this.predefinedIndex_ = 0;
                this.string_ = "";
                this.operation_ = Operation.NONE;
                this.substringIndex_ = Collections.emptyList();
                this.replaceChar_ = Collections.emptyList();
            }

            public static Builder newBuilder() {
                return Builder.create();
            }

            public Operation getOperation() {
                return this.operation_;
            }

            public Parser<Record> getParserForType() {
                return PARSER;
            }

            public int getPredefinedIndex() {
                return this.predefinedIndex_;
            }

            public int getRange() {
                return this.range_;
            }

            public int getReplaceCharCount() {
                return this.replaceChar_.size();
            }

            public List<Integer> getReplaceCharList() {
                return this.replaceChar_;
            }

            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int computeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.range_) + 0 : 0;
                if ((this.bitField0_ & 2) == 2) {
                    computeInt32Size += CodedOutputStream.computeInt32Size(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    computeInt32Size += CodedOutputStream.computeEnumSize(3, this.operation_.getNumber());
                }
                int i2 = 0;
                for (int i3 = 0; i3 < this.substringIndex_.size(); i3++) {
                    i2 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.substringIndex_.get(i3)).intValue());
                }
                int i4 = computeInt32Size + i2;
                if (!getSubstringIndexList().isEmpty()) {
                    i4 = i4 + 1 + CodedOutputStream.computeInt32SizeNoTag(i2);
                }
                this.substringIndexMemoizedSerializedSize = i2;
                int i5 = 0;
                for (int i6 = 0; i6 < this.replaceChar_.size(); i6++) {
                    i5 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.replaceChar_.get(i6)).intValue());
                }
                int i7 = i4 + i5;
                if (!getReplaceCharList().isEmpty()) {
                    i7 = i7 + 1 + CodedOutputStream.computeInt32SizeNoTag(i5);
                }
                this.replaceCharMemoizedSerializedSize = i5;
                if ((this.bitField0_ & 4) == 4) {
                    i7 += CodedOutputStream.computeBytesSize(6, getStringBytes());
                }
                int size = i7 + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public String getString() {
                Object obj = this.string_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.string_ = stringUtf8;
                }
                return stringUtf8;
            }

            public ByteString getStringBytes() {
                Object obj = this.string_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.string_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public int getSubstringIndexCount() {
                return this.substringIndex_.size();
            }

            public List<Integer> getSubstringIndexList() {
                return this.substringIndex_;
            }

            public boolean hasOperation() {
                return (this.bitField0_ & 8) == 8;
            }

            public boolean hasPredefinedIndex() {
                return (this.bitField0_ & 2) == 2;
            }

            public boolean hasRange() {
                return (this.bitField0_ & 1) == 1;
            }

            public boolean hasString() {
                return (this.bitField0_ & 4) == 4;
            }

            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.range_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeInt32(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    codedOutputStream.writeEnum(3, this.operation_.getNumber());
                }
                if (getSubstringIndexList().size() > 0) {
                    codedOutputStream.writeRawVarint32(34);
                    codedOutputStream.writeRawVarint32(this.substringIndexMemoizedSerializedSize);
                }
                for (int i = 0; i < this.substringIndex_.size(); i++) {
                    codedOutputStream.writeInt32NoTag(((Integer) this.substringIndex_.get(i)).intValue());
                }
                if (getReplaceCharList().size() > 0) {
                    codedOutputStream.writeRawVarint32(42);
                    codedOutputStream.writeRawVarint32(this.replaceCharMemoizedSerializedSize);
                }
                for (int i2 = 0; i2 < this.replaceChar_.size(); i2++) {
                    codedOutputStream.writeInt32NoTag(((Integer) this.replaceChar_.get(i2)).intValue());
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.writeBytes(6, getStringBytes());
                }
                codedOutputStream.writeRawBytes(this.unknownFields);
            }

            public static Builder newBuilder(Record record) {
                return newBuilder().mergeFrom(record);
            }

            public Record getDefaultInstanceForType() {
                return defaultInstance;
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public Builder toBuilder() {
                return newBuilder(this);
            }

            private Record(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
                super(builder);
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }

            private Record(boolean z) {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.EMPTY;
            }

            private Record(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                initFields();
                Output newOutput = ByteString.newOutput();
                CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.bitField0_ |= 1;
                                this.range_ = codedInputStream.readInt32();
                            } else if (readTag == 16) {
                                this.bitField0_ |= 2;
                                this.predefinedIndex_ = codedInputStream.readInt32();
                            } else if (readTag == 24) {
                                int readEnum = codedInputStream.readEnum();
                                Operation valueOf = Operation.valueOf(readEnum);
                                if (valueOf == null) {
                                    newInstance.writeRawVarint32(readTag);
                                    newInstance.writeRawVarint32(readEnum);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.operation_ = valueOf;
                                }
                            } else if (readTag == 32) {
                                if (!(z2 & true)) {
                                    this.substringIndex_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.substringIndex_.add(Integer.valueOf(codedInputStream.readInt32()));
                            } else if (readTag == 34) {
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if (!(z2 & true) && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.substringIndex_ = new ArrayList();
                                    z2 |= true;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.substringIndex_.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(pushLimit);
                            } else if (readTag == 40) {
                                if (!(z2 & true)) {
                                    this.replaceChar_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.replaceChar_.add(Integer.valueOf(codedInputStream.readInt32()));
                            } else if (readTag == 42) {
                                int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if (!(z2 & true) && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.replaceChar_ = new ArrayList();
                                    z2 |= true;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.replaceChar_.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(pushLimit2);
                            } else if (readTag == 50) {
                                ByteString readBytes = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                                this.string_ = readBytes;
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                        }
                        if (z2 & true) {
                            this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
                        }
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                }
                if (z2 & true) {
                    this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
                }
                try {
                    newInstance.flush();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.unknownFields = newOutput.toByteString();
                    throw th3;
                }
                this.unknownFields = newOutput.toByteString();
                makeExtensionsImmutable();
            }
        }

        public interface RecordOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            defaultInstance.initFields();
        }

        public static StringTableTypes getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.record_ = Collections.emptyList();
            this.localName_ = Collections.emptyList();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static StringTableTypes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StringTableTypes) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public List<Integer> getLocalNameList() {
            return this.localName_;
        }

        public Parser<StringTableTypes> getParserForType() {
            return PARSER;
        }

        public List<Record> getRecordList() {
            return this.record_;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.record_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.record_.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.localName_.size(); i5++) {
                i4 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.localName_.get(i5)).intValue());
            }
            int i6 = i2 + i4;
            if (!getLocalNameList().isEmpty()) {
                i6 = i6 + 1 + CodedOutputStream.computeInt32SizeNoTag(i4);
            }
            this.localNameMemoizedSerializedSize = i4;
            int size = i6 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.record_.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.record_.get(i));
            }
            if (getLocalNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(42);
                codedOutputStream.writeRawVarint32(this.localNameMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.localName_.size(); i2++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.localName_.get(i2)).intValue());
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static Builder newBuilder(StringTableTypes stringTableTypes) {
            return newBuilder().mergeFrom(stringTableTypes);
        }

        public StringTableTypes getDefaultInstanceForType() {
            return defaultInstance;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        private StringTableTypes(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private StringTableTypes(boolean z) {
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        private StringTableTypes(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            if (!z2 || !true) {
                                this.record_ = new ArrayList();
                                z2 |= true;
                            }
                            this.record_.add(codedInputStream.readMessage(Record.PARSER, extensionRegistryLite));
                        } else if (readTag == 40) {
                            if (!(z2 & true)) {
                                this.localName_ = new ArrayList();
                                z2 |= true;
                            }
                            this.localName_.add(Integer.valueOf(codedInputStream.readInt32()));
                        } else if (readTag == 42) {
                            int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            if (!(z2 & true) && codedInputStream.getBytesUntilLimit() > 0) {
                                this.localName_ = new ArrayList();
                                z2 |= true;
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.localName_.add(Integer.valueOf(codedInputStream.readInt32()));
                            }
                            codedInputStream.popLimit(pushLimit);
                        } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.record_ = Collections.unmodifiableList(this.record_);
                    }
                    if (z2 & true) {
                        this.localName_ = Collections.unmodifiableList(this.localName_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.record_ = Collections.unmodifiableList(this.record_);
            }
            if (z2 & true) {
                this.localName_ = Collections.unmodifiableList(this.localName_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }
    }

    public interface StringTableTypesOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        Function defaultInstance = Function.getDefaultInstance();
        Integer valueOf = Integer.valueOf(0);
        lambdaClassOriginName = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance, valueOf, null, null, 101, FieldType.INT32, Integer.class);
        flags = GeneratedMessageLite.newSingularGeneratedExtension(Property.getDefaultInstance(), valueOf, null, null, 101, FieldType.INT32, Integer.class);
        classModuleName = GeneratedMessageLite.newSingularGeneratedExtension(Class.getDefaultInstance(), valueOf, null, null, 101, FieldType.INT32, Integer.class);
        Integer num = valueOf;
        anonymousObjectOriginName = GeneratedMessageLite.newSingularGeneratedExtension(Class.getDefaultInstance(), num, null, null, 103, FieldType.INT32, Integer.class);
        packageModuleName = GeneratedMessageLite.newSingularGeneratedExtension(Package.getDefaultInstance(), num, null, null, 101, FieldType.INT32, Integer.class);
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(constructorSignature);
        extensionRegistryLite.add(methodSignature);
        extensionRegistryLite.add(lambdaClassOriginName);
        extensionRegistryLite.add(propertySignature);
        extensionRegistryLite.add(flags);
        extensionRegistryLite.add(typeAnnotation);
        extensionRegistryLite.add(isRaw);
        extensionRegistryLite.add(typeParameterAnnotation);
        extensionRegistryLite.add(classModuleName);
        extensionRegistryLite.add(classLocalVariable);
        extensionRegistryLite.add(anonymousObjectOriginName);
        extensionRegistryLite.add(packageModuleName);
        extensionRegistryLite.add(packageLocalVariable);
    }
}
