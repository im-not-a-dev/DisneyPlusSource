package com.google.android.exoplayer2.p366s0;

import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s0.h */
/* compiled from: ExtractorInput */
public interface C8913h {
    /* renamed from: a */
    long mo23287a();

    /* renamed from: a */
    void mo23288a(int i) throws IOException, InterruptedException;

    /* renamed from: a */
    void mo23289a(byte[] bArr, int i, int i2) throws IOException, InterruptedException;

    /* renamed from: a */
    boolean mo23290a(int i, boolean z) throws IOException, InterruptedException;

    /* renamed from: a */
    boolean mo23291a(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException;

    /* renamed from: b */
    int mo23292b(int i) throws IOException, InterruptedException;

    /* renamed from: b */
    long mo23293b();

    /* renamed from: b */
    void mo23294b(byte[] bArr, int i, int i2) throws IOException, InterruptedException;

    /* renamed from: b */
    boolean mo23296b(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException;

    /* renamed from: c */
    void mo23297c();

    /* renamed from: c */
    void mo23298c(int i) throws IOException, InterruptedException;

    long getPosition();

    int read(byte[] bArr, int i, int i2) throws IOException, InterruptedException;
}
