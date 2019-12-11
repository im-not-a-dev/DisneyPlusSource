package com.facebook.stetho.inspector;

import com.facebook.stetho.common.ExceptionUtil;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.jsonrpc.protocol.EmptyResult;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError.ErrorCode;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.json.ObjectMapper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class MethodDispatcher {
    private final Iterable<ChromeDevtoolsDomain> mDomainHandlers;
    private Map<String, MethodDispatchHelper> mMethods;
    private final ObjectMapper mObjectMapper;

    private static class MethodDispatchHelper {
        private final ChromeDevtoolsDomain mInstance;
        private final Method mMethod;
        private final ObjectMapper mObjectMapper;

        public MethodDispatchHelper(ObjectMapper objectMapper, ChromeDevtoolsDomain chromeDevtoolsDomain, Method method) {
            this.mObjectMapper = objectMapper;
            this.mInstance = chromeDevtoolsDomain;
            this.mMethod = method;
        }

        public JSONObject invoke(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) throws InvocationTargetException, IllegalAccessException, JSONException, JsonRpcException {
            Object invoke = this.mMethod.invoke(this.mInstance, new Object[]{jsonRpcPeer, jSONObject});
            if (invoke == null || (invoke instanceof EmptyResult)) {
                return new JSONObject();
            }
            return (JSONObject) this.mObjectMapper.convertValue((JsonRpcResult) invoke, JSONObject.class);
        }
    }

    public MethodDispatcher(ObjectMapper objectMapper, Iterable<ChromeDevtoolsDomain> iterable) {
        this.mObjectMapper = objectMapper;
        this.mDomainHandlers = iterable;
    }

    private static Map<String, MethodDispatchHelper> buildDispatchTable(ObjectMapper objectMapper, Iterable<ChromeDevtoolsDomain> iterable) {
        Method[] declaredMethods;
        Util.throwIfNull(objectMapper);
        HashMap hashMap = new HashMap();
        for (ChromeDevtoolsDomain chromeDevtoolsDomain : (Iterable) Util.throwIfNull(iterable)) {
            Class cls = chromeDevtoolsDomain.getClass();
            String simpleName = cls.getSimpleName();
            for (Method method : cls.getDeclaredMethods()) {
                if (isDevtoolsMethod(method)) {
                    MethodDispatchHelper methodDispatchHelper = new MethodDispatchHelper(objectMapper, chromeDevtoolsDomain, method);
                    StringBuilder sb = new StringBuilder();
                    sb.append(simpleName);
                    sb.append(".");
                    sb.append(method.getName());
                    hashMap.put(sb.toString(), methodDispatchHelper);
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private synchronized MethodDispatchHelper findMethodDispatcher(String str) {
        if (this.mMethods == null) {
            this.mMethods = buildDispatchTable(this.mObjectMapper, this.mDomainHandlers);
        }
        return (MethodDispatchHelper) this.mMethods.get(str);
    }

    private static boolean isDevtoolsMethod(Method method) throws IllegalArgumentException {
        if (!method.isAnnotationPresent(ChromeDevtoolsMethod.class)) {
            return false;
        }
        Class[] parameterTypes = method.getParameterTypes();
        StringBuilder sb = new StringBuilder();
        sb.append(method.getDeclaringClass().getSimpleName());
        sb.append(".");
        sb.append(method.getName());
        String sb2 = sb.toString();
        Util.throwIfNot(parameterTypes.length == 2, "%s: expected 2 args, got %s", sb2, Integer.valueOf(parameterTypes.length));
        Util.throwIfNot(parameterTypes[0].equals(JsonRpcPeer.class), "%s: expected 1st arg of JsonRpcPeer, got %s", sb2, parameterTypes[0].getName());
        Util.throwIfNot(parameterTypes[1].equals(JSONObject.class), "%s: expected 2nd arg of JSONObject, got %s", sb2, parameterTypes[1].getName());
        Class returnType = method.getReturnType();
        if (!returnType.equals(Void.TYPE)) {
            Util.throwIfNot(JsonRpcResult.class.isAssignableFrom(returnType), "%s: expected JsonRpcResult return type, got %s", sb2, returnType.getName());
        }
        return true;
    }

    public JSONObject dispatch(JsonRpcPeer jsonRpcPeer, String str, JSONObject jSONObject) throws JsonRpcException {
        MethodDispatchHelper findMethodDispatcher = findMethodDispatcher(str);
        if (findMethodDispatcher != null) {
            try {
                return findMethodDispatcher.invoke(jsonRpcPeer, jSONObject);
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                ExceptionUtil.propagateIfInstanceOf(cause, JsonRpcException.class);
                throw ExceptionUtil.propagate(cause);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (JSONException e3) {
                throw new JsonRpcException(new JsonRpcError(ErrorCode.INTERNAL_ERROR, e3.toString(), null));
            }
        } else {
            ErrorCode errorCode = ErrorCode.METHOD_NOT_FOUND;
            StringBuilder sb = new StringBuilder();
            sb.append("Not implemented: ");
            sb.append(str);
            throw new JsonRpcException(new JsonRpcError(errorCode, sb.toString(), null));
        }
    }
}
