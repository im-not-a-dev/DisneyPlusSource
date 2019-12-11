package com.facebook.stetho.inspector.protocol.module;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.helper.ObjectIdMapper;
import com.facebook.stetho.inspector.helper.PeersRegisteredListener;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError.ErrorCode;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver.ExecuteResultHandler;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.json.annotation.JsonProperty;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@TargetApi(11)
public class Database implements ChromeDevtoolsDomain {
    private static final int MAX_BLOB_LENGTH = 512;
    private static final int MAX_EXECUTE_RESULTS = 250;
    private static final String UNKNOWN_BLOB_LABEL = "{blob}";
    private final ChromePeerManager mChromePeerManager = new ChromePeerManager();
    private List<DatabaseDriver2> mDatabaseDrivers = new ArrayList();
    private final ObjectMapper mObjectMapper;
    private final DatabasePeerRegistrationListener mPeerListener = new DatabasePeerRegistrationListener(this.mDatabaseDrivers);

    public static class AddDatabaseEvent {
        @JsonProperty(required = true)
        public DatabaseObject database;
    }

    private static class DatabaseDescriptorHolder {
        public final DatabaseDescriptor descriptor;
        public final DatabaseDriver2 driver;

        public DatabaseDescriptorHolder(DatabaseDriver2 databaseDriver2, DatabaseDescriptor databaseDescriptor) {
            this.driver = databaseDriver2;
            this.descriptor = databaseDescriptor;
        }
    }

    @Deprecated
    public static abstract class DatabaseDriver extends BaseDatabaseDriver<String> {
        public DatabaseDriver(Context context) {
            super(context);
        }
    }

    public static class DatabaseObject {
        @JsonProperty(required = true)
        public String domain;
        @JsonProperty(required = true)

        /* renamed from: id */
        public String f18337id;
        @JsonProperty(required = true)
        public String name;
        @JsonProperty(required = true)
        public String version;
    }

    private static class DatabasePeerRegistrationListener extends PeersRegisteredListener {
        private final List<DatabaseDriver2> mDatabaseDrivers;
        private final SparseArray<DatabaseDescriptorHolder> mDatabaseHolders;
        private final ObjectIdMapper mDatabaseIdMapper;

        public DatabaseDescriptorHolder getDatabaseDescriptorHolder(String str) {
            return (DatabaseDescriptorHolder) this.mDatabaseHolders.get(Integer.parseInt(str));
        }

        /* access modifiers changed from: protected */
        public synchronized void onFirstPeerRegistered() {
            for (DatabaseDriver2 databaseDriver2 : this.mDatabaseDrivers) {
                for (DatabaseDescriptor databaseDescriptor : databaseDriver2.getDatabaseNames()) {
                    if (this.mDatabaseIdMapper.getIdForObject(databaseDescriptor) == null) {
                        this.mDatabaseHolders.put(Integer.valueOf(this.mDatabaseIdMapper.putObject(databaseDescriptor)).intValue(), new DatabaseDescriptorHolder(databaseDriver2, databaseDescriptor));
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public synchronized void onLastPeerUnregistered() {
            this.mDatabaseIdMapper.clear();
            this.mDatabaseHolders.clear();
        }

        /* access modifiers changed from: protected */
        public synchronized void onPeerAdded(JsonRpcPeer jsonRpcPeer) {
            int size = this.mDatabaseHolders.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.mDatabaseHolders.keyAt(i);
                DatabaseDescriptorHolder databaseDescriptorHolder = (DatabaseDescriptorHolder) this.mDatabaseHolders.valueAt(i);
                DatabaseObject databaseObject = new DatabaseObject();
                databaseObject.f18337id = String.valueOf(keyAt);
                databaseObject.name = databaseDescriptorHolder.descriptor.name();
                databaseObject.domain = databaseDescriptorHolder.driver.getContext().getPackageName();
                databaseObject.version = "N/A";
                AddDatabaseEvent addDatabaseEvent = new AddDatabaseEvent();
                addDatabaseEvent.database = databaseObject;
                jsonRpcPeer.invokeMethod("Database.addDatabase", addDatabaseEvent, null);
            }
        }

        /* access modifiers changed from: protected */
        public synchronized void onPeerRemoved(JsonRpcPeer jsonRpcPeer) {
        }

        private DatabasePeerRegistrationListener(List<DatabaseDriver2> list) {
            this.mDatabaseHolders = new SparseArray<>();
            this.mDatabaseIdMapper = new ObjectIdMapper();
            this.mDatabaseDrivers = list;
        }
    }

    public static class Error {
        @JsonProperty(required = true)
        public int code;
        @JsonProperty(required = true)
        public String message;
    }

    public static class ExecuteSQLRequest {
        @JsonProperty(required = true)
        public String databaseId;
        @JsonProperty(required = true)
        public String query;
    }

    public static class ExecuteSQLResponse implements JsonRpcResult {
        @JsonProperty
        public List<String> columnNames;
        @JsonProperty
        public Error sqlError;
        @JsonProperty
        public List<String> values;
    }

    private static class GetDatabaseTableNamesRequest {
        @JsonProperty(required = true)
        public String databaseId;

        private GetDatabaseTableNamesRequest() {
        }
    }

    private static class GetDatabaseTableNamesResponse implements JsonRpcResult {
        @JsonProperty(required = true)
        public List<String> tableNames;

        private GetDatabaseTableNamesResponse() {
        }
    }

    public Database() {
        this.mChromePeerManager.setListener(this.mPeerListener);
        this.mObjectMapper = new ObjectMapper();
    }

    private static String blobToString(byte[] bArr) {
        if (bArr.length <= 512 && fastIsAscii(bArr)) {
            try {
                return new String(bArr, "US-ASCII");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return UNKNOWN_BLOB_LABEL;
    }

    private static boolean fastIsAscii(byte[] bArr) {
        for (byte b : bArr) {
            if ((b & Byte.MIN_VALUE) != 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static ArrayList<String> flattenRows(Cursor cursor, int i) {
        Util.throwIfNot(i >= 0);
        ArrayList<String> arrayList = new ArrayList<>();
        int columnCount = cursor.getColumnCount();
        for (int i2 = 0; i2 < i && cursor.moveToNext(); i2++) {
            for (int i3 = 0; i3 < columnCount; i3++) {
                int type = cursor.getType(i3);
                if (type == 0) {
                    arrayList.add(null);
                } else if (type == 1) {
                    arrayList.add(String.valueOf(cursor.getLong(i3)));
                } else if (type == 2) {
                    arrayList.add(String.valueOf(cursor.getDouble(i3)));
                } else if (type != 4) {
                    arrayList.add(cursor.getString(i3));
                } else {
                    arrayList.add(blobToString(cursor.getBlob(i3)));
                }
            }
        }
        if (!cursor.isAfterLast()) {
            for (int i4 = 0; i4 < columnCount; i4++) {
                arrayList.add("{truncated}");
            }
        }
        return arrayList;
    }

    public void add(DatabaseDriver2 databaseDriver2) {
        this.mDatabaseDrivers.add(databaseDriver2);
    }

    @ChromeDevtoolsMethod
    public void disable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        this.mChromePeerManager.removePeer(jsonRpcPeer);
    }

    @ChromeDevtoolsMethod
    public void enable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        this.mChromePeerManager.addPeer(jsonRpcPeer);
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult executeSQL(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        ExecuteSQLRequest executeSQLRequest = (ExecuteSQLRequest) this.mObjectMapper.convertValue(jSONObject, ExecuteSQLRequest.class);
        DatabaseDescriptorHolder databaseDescriptorHolder = this.mPeerListener.getDatabaseDescriptorHolder(executeSQLRequest.databaseId);
        try {
            return databaseDescriptorHolder.driver.executeSQL(databaseDescriptorHolder.descriptor, executeSQLRequest.query, new ExecuteResultHandler<ExecuteSQLResponse>() {
                public ExecuteSQLResponse handleInsert(long j) throws SQLiteException {
                    ExecuteSQLResponse executeSQLResponse = new ExecuteSQLResponse();
                    executeSQLResponse.columnNames = Collections.singletonList("ID of last inserted row");
                    executeSQLResponse.values = Collections.singletonList(String.valueOf(j));
                    return executeSQLResponse;
                }

                public ExecuteSQLResponse handleRawQuery() throws SQLiteException {
                    ExecuteSQLResponse executeSQLResponse = new ExecuteSQLResponse();
                    executeSQLResponse.columnNames = Collections.singletonList("success");
                    executeSQLResponse.values = Collections.singletonList("true");
                    return executeSQLResponse;
                }

                public ExecuteSQLResponse handleSelect(Cursor cursor) throws SQLiteException {
                    ExecuteSQLResponse executeSQLResponse = new ExecuteSQLResponse();
                    executeSQLResponse.columnNames = Arrays.asList(cursor.getColumnNames());
                    executeSQLResponse.values = Database.flattenRows(cursor, Database.MAX_EXECUTE_RESULTS);
                    return executeSQLResponse;
                }

                public ExecuteSQLResponse handleUpdateDelete(int i) throws SQLiteException {
                    ExecuteSQLResponse executeSQLResponse = new ExecuteSQLResponse();
                    executeSQLResponse.columnNames = Collections.singletonList("Modified rows");
                    executeSQLResponse.values = Collections.singletonList(String.valueOf(i));
                    return executeSQLResponse;
                }
            });
        } catch (RuntimeException e) {
            LogUtil.m24846e(e, "Exception executing: %s", executeSQLRequest.query);
            Error error = new Error();
            error.code = 0;
            error.message = e.getMessage();
            ExecuteSQLResponse executeSQLResponse = new ExecuteSQLResponse();
            executeSQLResponse.sqlError = error;
            return executeSQLResponse;
        }
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult getDatabaseTableNames(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) throws JsonRpcException {
        DatabaseDescriptorHolder databaseDescriptorHolder = this.mPeerListener.getDatabaseDescriptorHolder(((GetDatabaseTableNamesRequest) this.mObjectMapper.convertValue(jSONObject, GetDatabaseTableNamesRequest.class)).databaseId);
        try {
            GetDatabaseTableNamesResponse getDatabaseTableNamesResponse = new GetDatabaseTableNamesResponse();
            getDatabaseTableNamesResponse.tableNames = databaseDescriptorHolder.driver.getTableNames(databaseDescriptorHolder.descriptor);
            return getDatabaseTableNamesResponse;
        } catch (SQLiteException e) {
            throw new JsonRpcException(new JsonRpcError(ErrorCode.INVALID_REQUEST, e.toString(), null));
        }
    }
}
