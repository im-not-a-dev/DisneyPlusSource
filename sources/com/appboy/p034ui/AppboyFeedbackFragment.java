package com.appboy.p034ui;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.fragment.app.C0532d;
import androidx.fragment.app.Fragment;
import com.appboy.C1440a;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import com.appboy.p033s.C1564j;

@Deprecated
/* renamed from: com.appboy.ui.AppboyFeedbackFragment */
public class AppboyFeedbackFragment extends Fragment {
    private static final String TAG = C1557c.m7461a(AppboyFeedbackFragment.class);
    private Button mCancelButton;
    private OnClickListener mCancelListener;
    /* access modifiers changed from: private */
    public EditText mEmailEditText;
    /* access modifiers changed from: private */
    public boolean mErrorMessageShown;
    /* access modifiers changed from: private */
    public IFeedbackFinishedListener mFeedbackFinishedListener;
    /* access modifiers changed from: private */
    public CheckBox mIsBugCheckBox;
    /* access modifiers changed from: private */
    public EditText mMessageEditText;
    private int mOriginalSoftInputMode;
    private Button mSendButton;
    private TextWatcher mSendButtonWatcher;
    private OnClickListener mSendListener;

    @Deprecated
    /* renamed from: com.appboy.ui.AppboyFeedbackFragment$FeedbackResult */
    public enum FeedbackResult {
        SUBMITTED,
        CANCELLED
    }

    @Deprecated
    /* renamed from: com.appboy.ui.AppboyFeedbackFragment$IFeedbackFinishedListener */
    public interface IFeedbackFinishedListener {
        String beforeFeedbackSubmitted(String str);

        void onFeedbackFinished(FeedbackResult feedbackResult);
    }

    /* access modifiers changed from: private */
    public void clearData() {
        String str = "";
        this.mEmailEditText.setText(str);
        this.mMessageEditText.setText(str);
        this.mIsBugCheckBox.setChecked(false);
        this.mErrorMessageShown = false;
        this.mEmailEditText.setError(null);
        this.mMessageEditText.setError(null);
    }

    private void displayEmailTextError(int i) {
        if (getActivity() != null) {
            this.mEmailEditText.setError(getResources().getString(i));
        } else {
            C1557c.m7473e(TAG, "Activity is null. Cannot set feedback form email error message");
        }
    }

    private void displayMessageTextError(int i) {
        if (getActivity() != null) {
            this.mMessageEditText.setError(getResources().getString(i));
        } else {
            C1557c.m7473e(TAG, "Activity is null. Cannot set feedback form message error.");
        }
    }

    /* access modifiers changed from: private */
    public boolean ensureSendButton() {
        return validatedMessage() & validatedEmail();
    }

    /* access modifiers changed from: private */
    public void hideSoftKeyboard() {
        C0532d activity = getActivity();
        activity.getWindow().setSoftInputMode(this.mOriginalSoftInputMode);
        if (activity.getCurrentFocus() != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    private boolean validatedEmail() {
        boolean z = true;
        boolean z2 = this.mEmailEditText.getText() != null && !C1563i.m7490d(this.mEmailEditText.getText().toString()) && C1564j.m7497b(this.mEmailEditText.getText().toString());
        if (this.mEmailEditText.getText() == null || !C1563i.m7490d(this.mEmailEditText.getText().toString())) {
            z = false;
        }
        if (z2) {
            this.mEmailEditText.setError(null);
        } else if (z) {
            displayEmailTextError(R$string.com_appboy_feedback_form_empty_email);
        } else {
            displayEmailTextError(R$string.com_appboy_feedback_form_invalid_email);
        }
        return z2;
    }

    private boolean validatedMessage() {
        boolean z = this.mMessageEditText.getText() != null && !C1563i.m7490d(this.mMessageEditText.getText().toString());
        if (z) {
            this.mMessageEditText.setError(null);
        } else {
            displayMessageTextError(R$string.com_appboy_feedback_form_invalid_message);
        }
        return z;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.mSendButtonWatcher = new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                if (AppboyFeedbackFragment.this.mErrorMessageShown) {
                    AppboyFeedbackFragment.this.ensureSendButton();
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        this.mCancelListener = new OnClickListener() {
            public void onClick(View view) {
                AppboyFeedbackFragment.this.hideSoftKeyboard();
                if (AppboyFeedbackFragment.this.mFeedbackFinishedListener != null) {
                    AppboyFeedbackFragment.this.mFeedbackFinishedListener.onFeedbackFinished(FeedbackResult.CANCELLED);
                }
                AppboyFeedbackFragment.this.clearData();
            }
        };
        this.mSendListener = new OnClickListener() {
            public void onClick(View view) {
                if (AppboyFeedbackFragment.this.ensureSendButton()) {
                    AppboyFeedbackFragment.this.hideSoftKeyboard();
                    boolean isChecked = AppboyFeedbackFragment.this.mIsBugCheckBox.isChecked();
                    String obj = AppboyFeedbackFragment.this.mMessageEditText.getText().toString();
                    String obj2 = AppboyFeedbackFragment.this.mEmailEditText.getText().toString();
                    if (AppboyFeedbackFragment.this.mFeedbackFinishedListener != null) {
                        obj = AppboyFeedbackFragment.this.mFeedbackFinishedListener.beforeFeedbackSubmitted(obj);
                    }
                    C1440a.m6921c((Context) AppboyFeedbackFragment.this.getActivity()).mo6569a(obj2, obj, isChecked);
                    if (AppboyFeedbackFragment.this.mFeedbackFinishedListener != null) {
                        AppboyFeedbackFragment.this.mFeedbackFinishedListener.onFeedbackFinished(FeedbackResult.SUBMITTED);
                    }
                    AppboyFeedbackFragment.this.clearData();
                    return;
                }
                AppboyFeedbackFragment.this.mErrorMessageShown = true;
            }
        };
        setRetainInstance(true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R$layout.com_appboy_feedback, viewGroup, false);
        this.mCancelButton = (Button) inflate.findViewById(R$id.com_appboy_feedback_cancel);
        this.mSendButton = (Button) inflate.findViewById(R$id.com_appboy_feedback_send);
        this.mIsBugCheckBox = (CheckBox) inflate.findViewById(R$id.com_appboy_feedback_is_bug);
        this.mMessageEditText = (EditText) inflate.findViewById(R$id.com_appboy_feedback_message);
        this.mEmailEditText = (EditText) inflate.findViewById(R$id.com_appboy_feedback_email);
        this.mMessageEditText.addTextChangedListener(this.mSendButtonWatcher);
        this.mEmailEditText.addTextChangedListener(this.mSendButtonWatcher);
        this.mCancelButton.setOnClickListener(this.mCancelListener);
        this.mSendButton.setOnClickListener(this.mSendListener);
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.mMessageEditText.removeTextChangedListener(this.mSendButtonWatcher);
        this.mEmailEditText.removeTextChangedListener(this.mSendButtonWatcher);
    }

    public void onResume() {
        super.onResume();
        C1440a.m6921c((Context) getActivity()).mo6585g();
        C0532d activity = getActivity();
        Window window = activity.getWindow();
        this.mOriginalSoftInputMode = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
        C1440a.m6921c((Context) activity).mo6585g();
    }
}
