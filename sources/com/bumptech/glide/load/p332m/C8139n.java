package com.bumptech.glide.load.p332m;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.m.n */
/* compiled from: StreamLocalUriFetcher */
public class C8139n extends C8137l<InputStream> {

    /* renamed from: W */
    private static final UriMatcher f17404W = new UriMatcher(-1);

    static {
        String str = "com.android.contacts";
        f17404W.addURI(str, "contacts/lookup/*/#", 1);
        f17404W.addURI(str, "contacts/lookup/*", 1);
        f17404W.addURI(str, "contacts/#/photo", 2);
        f17404W.addURI(str, "contacts/#", 3);
        f17404W.addURI(str, "contacts/#/display_photo", 4);
        f17404W.addURI(str, "phone_lookup/*", 5);
    }

    public C8139n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: b */
    private InputStream m23608b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f17404W.match(uri);
        if (match != 1) {
            if (match == 3) {
                return m23607a(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return m23607a(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream m23611a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream b = m23608b(uri, contentResolver);
        if (b != null) {
            return b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("InputStream is null for ");
        sb.append(uri);
        throw new FileNotFoundException(sb.toString());
    }

    /* renamed from: a */
    private InputStream m23607a(ContentResolver contentResolver, Uri uri) {
        return Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21171a(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* renamed from: a */
    public Class<InputStream> mo21140a() {
        return InputStream.class;
    }
}
