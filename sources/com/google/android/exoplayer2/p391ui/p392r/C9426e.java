package com.google.android.exoplayer2.p391ui.p392r;

import android.opengl.GLES20;
import com.google.android.exoplayer2.util.C9561o;
import com.google.android.exoplayer2.p394w0.p395s.C9608d;
import com.google.android.exoplayer2.p394w0.p395s.C9608d.C9609a;
import com.google.android.exoplayer2.p394w0.p395s.C9608d.C9610b;
import java.nio.FloatBuffer;

/* renamed from: com.google.android.exoplayer2.ui.r.e */
/* compiled from: ProjectionRenderer */
final class C9426e {

    /* renamed from: j */
    private static final String[] f21877j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: k */
    private static final String[] f21878k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: l */
    private static final float[] f21879l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m */
    private static final float[] f21880m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: n */
    private static final float[] f21881n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: o */
    private static final float[] f21882o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: p */
    private static final float[] f21883p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a */
    private int f21884a;

    /* renamed from: b */
    private C9427a f21885b;

    /* renamed from: c */
    private C9427a f21886c;

    /* renamed from: d */
    private int f21887d;

    /* renamed from: e */
    private int f21888e;

    /* renamed from: f */
    private int f21889f;

    /* renamed from: g */
    private int f21890g;

    /* renamed from: h */
    private int f21891h;

    /* renamed from: i */
    private int f21892i;

    /* renamed from: com.google.android.exoplayer2.ui.r.e$a */
    /* compiled from: ProjectionRenderer */
    private static class C9427a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f21893a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final FloatBuffer f21894b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final FloatBuffer f21895c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final int f21896d;

        public C9427a(C9610b bVar) {
            this.f21893a = bVar.mo24798a();
            this.f21894b = C9561o.m29482a(bVar.f22477c);
            this.f21895c = C9561o.m29482a(bVar.f22478d);
            int i = bVar.f22476b;
            if (i == 1) {
                this.f21896d = 5;
            } else if (i != 2) {
                this.f21896d = 4;
            } else {
                this.f21896d = 6;
            }
        }
    }

    C9426e() {
    }

    /* renamed from: b */
    public static boolean m28909b(C9608d dVar) {
        C9609a aVar = dVar.f22470a;
        C9609a aVar2 = dVar.f22471b;
        if (aVar.mo24796a() == 1 && aVar.mo24797a(0).f22475a == 0 && aVar2.mo24796a() == 1 && aVar2.mo24797a(0).f22475a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo24419a(C9608d dVar) {
        C9427a aVar;
        if (m28909b(dVar)) {
            this.f21884a = dVar.f22472c;
            this.f21885b = new C9427a(dVar.f22470a.mo24797a(0));
            if (dVar.f22473d) {
                aVar = this.f21885b;
            } else {
                aVar = new C9427a(dVar.f22471b.mo24797a(0));
            }
            this.f21886c = aVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24417a() {
        this.f21887d = C9561o.m29480a(f21877j, f21878k);
        this.f21888e = GLES20.glGetUniformLocation(this.f21887d, "uMvpMatrix");
        this.f21889f = GLES20.glGetUniformLocation(this.f21887d, "uTexMatrix");
        this.f21890g = GLES20.glGetAttribLocation(this.f21887d, "aPosition");
        this.f21891h = GLES20.glGetAttribLocation(this.f21887d, "aTexCoords");
        this.f21892i = GLES20.glGetUniformLocation(this.f21887d, "uTexture");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24418a(int i, float[] fArr, boolean z) {
        C9427a aVar = z ? this.f21886c : this.f21885b;
        if (aVar != null) {
            GLES20.glUseProgram(this.f21887d);
            C9561o.m29483a();
            GLES20.glEnableVertexAttribArray(this.f21890g);
            GLES20.glEnableVertexAttribArray(this.f21891h);
            C9561o.m29483a();
            int i2 = this.f21884a;
            float[] fArr2 = i2 == 1 ? z ? f21881n : f21880m : i2 == 2 ? z ? f21883p : f21882o : f21879l;
            GLES20.glUniformMatrix3fv(this.f21889f, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(this.f21888e, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(this.f21892i, 0);
            C9561o.m29483a();
            GLES20.glVertexAttribPointer(this.f21890g, 3, 5126, false, 12, aVar.f21894b);
            C9561o.m29483a();
            GLES20.glVertexAttribPointer(this.f21891h, 2, 5126, false, 8, aVar.f21895c);
            C9561o.m29483a();
            GLES20.glDrawArrays(aVar.f21896d, 0, aVar.f21893a);
            C9561o.m29483a();
            GLES20.glDisableVertexAttribArray(this.f21890g);
            GLES20.glDisableVertexAttribArray(this.f21891h);
        }
    }
}
