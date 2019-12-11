package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.C0532d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C9698f;
import com.google.android.gms.common.api.Status;
import p096e.p150n.p151a.C4237a.C4238a;
import p096e.p150n.p152b.C4246b;

@KeepName
public class SignInHubActivity extends C0532d {

    /* renamed from: Y */
    private static boolean f22658Y = false;

    /* renamed from: U */
    private SignInConfiguration f22659U;

    /* renamed from: V */
    private boolean f22660V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public int f22661W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public Intent f22662X;

    /* renamed from: c */
    private boolean f22663c = false;

    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    private class C9651a implements C4238a<Void> {
        private C9651a() {
        }

        /* renamed from: a */
        public final C4246b<Void> mo14920a(int i, Bundle bundle) {
            return new C9658g(SignInHubActivity.this, C9698f.m30106h());
        }

        /* renamed from: a */
        public final void mo14921a(C4246b<Void> bVar) {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo14922a(C4246b bVar, Object obj) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.f22661W, SignInHubActivity.this.f22662X);
            SignInHubActivity.this.finish();
        }
    }

    /* renamed from: c */
    private final void m29973c(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f22658Y = false;
    }

    /* renamed from: f */
    private final void m29974f() {
        getSupportLoaderManager().mo14917a(0, null, new C9651a());
        f22658Y = false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f22663c) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    String str = "signInAccount";
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(str);
                    if (signInAccount == null || signInAccount.mo24926c() == null) {
                        String str2 = "errorCode";
                        if (intent.hasExtra(str2)) {
                            int intExtra = intent.getIntExtra(str2, 8);
                            if (intExtra == 13) {
                                intExtra = 12501;
                            }
                            m29973c(intExtra);
                            return;
                        }
                    } else {
                        GoogleSignInAccount c = signInAccount.mo24926c();
                        C9665n.m30015a(this).mo24970a(this.f22659U.mo24937c(), c);
                        intent.removeExtra(str);
                        intent.putExtra("googleSignInAccount", c);
                        this.f22660V = true;
                        this.f22661W = i2;
                        this.f22662X = intent;
                        m29974f();
                        return;
                    }
                }
                m29973c(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m29973c(12500);
            return;
        }
        String str = "com.google.android.gms.auth.GOOGLE_SIGN_IN";
        String str2 = "AuthSignInClient";
        if (action.equals(str) || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String str3 = "config";
            this.f22659U = (SignInConfiguration) intent.getBundleExtra(str3).getParcelable(str3);
            if (this.f22659U == null) {
                Log.e(str2, "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            if (!(bundle == null)) {
                this.f22660V = bundle.getBoolean("signingInGoogleApiClients");
                if (this.f22660V) {
                    this.f22661W = bundle.getInt("signInResultCode");
                    this.f22662X = (Intent) bundle.getParcelable("signInResultData");
                    m29974f();
                }
            } else if (f22658Y) {
                setResult(0);
                m29973c(12502);
            } else {
                f22658Y = true;
                Intent intent2 = new Intent(action);
                if (action.equals(str)) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra(str3, this.f22659U);
                try {
                    startActivityForResult(intent2, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.f22663c = true;
                    Log.w(str2, "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    m29973c(17);
                }
            }
        } else {
            String str4 = "Unknown action: ";
            String valueOf = String.valueOf(intent.getAction());
            Log.e(str2, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f22660V);
        if (this.f22660V) {
            bundle.putInt("signInResultCode", this.f22661W);
            bundle.putParcelable("signInResultData", this.f22662X);
        }
    }
}
