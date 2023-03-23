/*
 * Copyright 2022 ByteDance and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * CDP开放接口
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2023-02-10
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package code.byted.cdp.openapi;

import code.byted.cdp.ApiCallback;
import code.byted.cdp.ApiClient;
import code.byted.cdp.ApiException;
import code.byted.cdp.ApiResponse;
import code.byted.cdp.Configuration;
import code.byted.cdp.Pair;
import code.byted.cdp.ProgressRequestBody;
import code.byted.cdp.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import code.byted.cdp.model.ByteDanceSeqResponseString;
import code.byted.cdp.model.CheckRealtimeRuleRequest;
import code.byted.cdp.model.CheckRealtimeRuleResponse;
import code.byted.cdp.model.IDMReq;
import code.byted.cdp.model.IDMResp;
import code.byted.cdp.model.OnlineGetUserProfileRequest;
import code.byted.cdp.model.OnlineUserProfileRespWithPrivacy;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineApi {
    private ApiClient apiClient;

    public OnlineApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OnlineApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for checkHitRealtimeRule
     * @param body  (required)
     * @param tenantCode 租户code (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call checkHitRealtimeRuleCall(CheckRealtimeRuleRequest body, String tenantCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        localVarQueryParams.add(new Pair("tenantCode", tenantCode.toString()));

        localVarQueryParams.add(new Pair("Action","QueryOpenPlatformOpenApi"));
        localVarQueryParams.add(new Pair("Version","2021-12-16"));
        localVarQueryParams.add(new Pair("ApiAction","checkHitRealtimeRule"));
        localVarQueryParams.add(new Pair("ApiVersion","2023-02-10"));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/plain"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call checkHitRealtimeRuleValidateBeforeCall(CheckRealtimeRuleRequest body, String tenantCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling checkHitRealtimeRule(Async)");
        }
        // verify the required parameter 'tenantCode' is set
        if (tenantCode == null) {
            throw new ApiException("Missing the required parameter 'tenantCode' when calling checkHitRealtimeRule(Async)");
        }

        com.squareup.okhttp.Call call = checkHitRealtimeRuleCall(body, tenantCode, progressListener, progressRequestListener);
        return call;





    }

    /**
     * 判断是否命中实时规则,高速接口
     * 
     * @param body  (required)
     * @param tenantCode 租户code (required)
     * @return CheckRealtimeRuleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CheckRealtimeRuleResponse checkHitRealtimeRule(CheckRealtimeRuleRequest body, String tenantCode) throws ApiException {
        ApiResponse<CheckRealtimeRuleResponse> resp = checkHitRealtimeRuleWithHttpInfo(body, tenantCode);
        return resp.getData();
    }

    /**
     * 判断是否命中实时规则,高速接口
     * 
     * @param body  (required)
     * @param tenantCode 租户code (required)
     * @return ApiResponse&lt;CheckRealtimeRuleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CheckRealtimeRuleResponse> checkHitRealtimeRuleWithHttpInfo(CheckRealtimeRuleRequest body, String tenantCode) throws ApiException {
        com.squareup.okhttp.Call call = checkHitRealtimeRuleValidateBeforeCall(body, tenantCode, null, null);
        Type localVarReturnType = new TypeToken<CheckRealtimeRuleResponse>(){}.getType();

        String[] localVarAccepts = {
            "application/json", "text/plain"
        };

        return apiClient.execute(call, localVarReturnType, localVarAccepts);
    }

    /**
     * 判断是否命中实时规则,高速接口 (asynchronously)
     * 
     * @param body  (required)
     * @param tenantCode 租户code (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call checkHitRealtimeRuleAsync(CheckRealtimeRuleRequest body, String tenantCode, final ApiCallback<CheckRealtimeRuleResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        String[] localVarAccepts = {
            "application/json", "text/plain"
        };

        com.squareup.okhttp.Call call = checkHitRealtimeRuleValidateBeforeCall(body, tenantCode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CheckRealtimeRuleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, localVarAccepts, callback);
        return call;
    }
    /**
     * Build call for getIdMapping
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getIdMappingCall(IDMReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();


        localVarQueryParams.add(new Pair("Action","QueryOpenPlatformOpenApi"));
        localVarQueryParams.add(new Pair("Version","2021-12-16"));
        localVarQueryParams.add(new Pair("ApiAction","getIdMapping"));
        localVarQueryParams.add(new Pair("ApiVersion","2023-02-10"));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/plain"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getIdMappingValidateBeforeCall(IDMReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling getIdMapping(Async)");
        }

        com.squareup.okhttp.Call call = getIdMappingCall(body, progressListener, progressRequestListener);
        return call;





    }

    /**
     * idmapping映射,高速接口
     * 
     * @param body  (required)
     * @return IDMResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IDMResp getIdMapping(IDMReq body) throws ApiException {
        ApiResponse<IDMResp> resp = getIdMappingWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * idmapping映射,高速接口
     * 
     * @param body  (required)
     * @return ApiResponse&lt;IDMResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IDMResp> getIdMappingWithHttpInfo(IDMReq body) throws ApiException {
        com.squareup.okhttp.Call call = getIdMappingValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<IDMResp>(){}.getType();

        String[] localVarAccepts = {
            "application/json", "text/plain"
        };

        return apiClient.execute(call, localVarReturnType, localVarAccepts);
    }

    /**
     * idmapping映射,高速接口 (asynchronously)
     * 
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getIdMappingAsync(IDMReq body, final ApiCallback<IDMResp> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        String[] localVarAccepts = {
            "application/json", "text/plain"
        };

        com.squareup.okhttp.Call call = getIdMappingValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IDMResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, localVarAccepts, callback);
        return call;
    }
    /**
     * Build call for getUserProfileWithPrivacy
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserProfileWithPrivacyCall(OnlineGetUserProfileRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();


        localVarQueryParams.add(new Pair("Action","QueryOpenPlatformOpenApi"));
        localVarQueryParams.add(new Pair("Version","2021-12-16"));
        localVarQueryParams.add(new Pair("ApiAction","getUserProfileWithPrivacy"));
        localVarQueryParams.add(new Pair("ApiVersion","2023-02-10"));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/plain"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getUserProfileWithPrivacyValidateBeforeCall(OnlineGetUserProfileRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling getUserProfileWithPrivacy(Async)");
        }

        com.squareup.okhttp.Call call = getUserProfileWithPrivacyCall(body, progressListener, progressRequestListener);
        return call;





    }

    /**
     * 查询标签和属性
     * 
     * @param body  (required)
     * @return OnlineUserProfileRespWithPrivacy
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OnlineUserProfileRespWithPrivacy getUserProfileWithPrivacy(OnlineGetUserProfileRequest body) throws ApiException {
        ApiResponse<OnlineUserProfileRespWithPrivacy> resp = getUserProfileWithPrivacyWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 查询标签和属性
     * 
     * @param body  (required)
     * @return ApiResponse&lt;OnlineUserProfileRespWithPrivacy&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OnlineUserProfileRespWithPrivacy> getUserProfileWithPrivacyWithHttpInfo(OnlineGetUserProfileRequest body) throws ApiException {
        com.squareup.okhttp.Call call = getUserProfileWithPrivacyValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<OnlineUserProfileRespWithPrivacy>(){}.getType();

        String[] localVarAccepts = {
            "application/json", "text/plain"
        };

        return apiClient.execute(call, localVarReturnType, localVarAccepts);
    }

    /**
     * 查询标签和属性 (asynchronously)
     * 
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserProfileWithPrivacyAsync(OnlineGetUserProfileRequest body, final ApiCallback<OnlineUserProfileRespWithPrivacy> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        String[] localVarAccepts = {
            "application/json", "text/plain"
        };

        com.squareup.okhttp.Call call = getUserProfileWithPrivacyValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OnlineUserProfileRespWithPrivacy>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, localVarAccepts, callback);
        return call;
    }
    /**
     * Build call for queryUserSeg
     * @param id 用户id，需要和分群包的id类型保持一致。比如分群结果是手机号，则需要用手机号来查询 (required)
     * @param segIds 分群id。多个分群用逗号分割。 (required)
     * @param xTenant 项目ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryUserSegCall(String id, String segIds, Long xTenant, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (segIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("segIds", segIds));

        localVarQueryParams.add(new Pair("id", id.toString()));

        localVarQueryParams.add(new Pair("Action","QueryOpenPlatformOpenApi"));
        localVarQueryParams.add(new Pair("Version","2021-12-16"));
        localVarQueryParams.add(new Pair("ApiAction","queryUserSeg"));
        localVarQueryParams.add(new Pair("ApiVersion","2023-02-10"));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xTenant != null)
        localVarHeaderParams.put("X-Tenant", apiClient.parameterToString(xTenant));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/plain"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call queryUserSegValidateBeforeCall(String id, String segIds, Long xTenant, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling queryUserSeg(Async)");
        }
        // verify the required parameter 'segIds' is set
        if (segIds == null) {
            throw new ApiException("Missing the required parameter 'segIds' when calling queryUserSeg(Async)");
        }
        // verify the required parameter 'xTenant' is set
        if (xTenant == null) {
            throw new ApiException("Missing the required parameter 'xTenant' when calling queryUserSeg(Async)");
        }

        com.squareup.okhttp.Call call = queryUserSegCall(id, segIds, xTenant, progressListener, progressRequestListener);
        return call;





    }

    /**
     * 查询用户是否命中人群,高速接口
     * 
     * @param id 用户id，需要和分群包的id类型保持一致。比如分群结果是手机号，则需要用手机号来查询 (required)
     * @param segIds 分群id。多个分群用逗号分割。 (required)
     * @param xTenant 项目ID (required)
     * @return ByteDanceSeqResponseString
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ByteDanceSeqResponseString queryUserSeg(String id, String segIds, Long xTenant) throws ApiException {
        ApiResponse<ByteDanceSeqResponseString> resp = queryUserSegWithHttpInfo(id, segIds, xTenant);
        return resp.getData();
    }

    /**
     * 查询用户是否命中人群,高速接口
     * 
     * @param id 用户id，需要和分群包的id类型保持一致。比如分群结果是手机号，则需要用手机号来查询 (required)
     * @param segIds 分群id。多个分群用逗号分割。 (required)
     * @param xTenant 项目ID (required)
     * @return ApiResponse&lt;ByteDanceSeqResponseString&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ByteDanceSeqResponseString> queryUserSegWithHttpInfo(String id, String segIds, Long xTenant) throws ApiException {
        com.squareup.okhttp.Call call = queryUserSegValidateBeforeCall(id, segIds, xTenant, null, null);
        Type localVarReturnType = new TypeToken<ByteDanceSeqResponseString>(){}.getType();

        String[] localVarAccepts = {
            "application/json", "text/plain"
        };

        return apiClient.execute(call, localVarReturnType, localVarAccepts);
    }

    /**
     * 查询用户是否命中人群,高速接口 (asynchronously)
     * 
     * @param id 用户id，需要和分群包的id类型保持一致。比如分群结果是手机号，则需要用手机号来查询 (required)
     * @param segIds 分群id。多个分群用逗号分割。 (required)
     * @param xTenant 项目ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryUserSegAsync(String id, String segIds, Long xTenant, final ApiCallback<ByteDanceSeqResponseString> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        String[] localVarAccepts = {
            "application/json", "text/plain"
        };

        com.squareup.okhttp.Call call = queryUserSegValidateBeforeCall(id, segIds, xTenant, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ByteDanceSeqResponseString>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, localVarAccepts, callback);
        return call;
    }
}