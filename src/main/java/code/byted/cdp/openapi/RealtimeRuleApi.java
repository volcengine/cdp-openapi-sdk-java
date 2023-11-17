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


import code.byted.cdp.model.RealtimeRuleListResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RealtimeRuleApi {
    private ApiClient apiClient;

    public RealtimeRuleApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RealtimeRuleApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public RealtimeRuleApi(String accessKeyID, String secretAccessKey, String sessionToken, String basePath) {
        this.apiClient = new ApiClient(accessKeyID, secretAccessKey, sessionToken, basePath);
    }

    /**
     * Build call for getRealtimeRuleList
     * @param tenantsCode 租户ID (required)
     * @param page 当前页 (required)
     * @param pageSize 分页大小 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRealtimeRuleListCall(String tenantsCode, Integer page, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageSize", pageSize));

        localVarQueryParams.add(new Pair("tenantsCode", tenantsCode.toString()));

        localVarQueryParams.add(new Pair("Action","QueryOpenPlatformOpenApi"));
        localVarQueryParams.add(new Pair("Version","2021-12-16"));
        localVarQueryParams.add(new Pair("ApiAction","getRealtimeRuleList"));
        localVarQueryParams.add(new Pair("ApiVersion","2023-02-10"));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
    private com.squareup.okhttp.Call getRealtimeRuleListValidateBeforeCall(String tenantsCode, Integer page, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'tenantsCode' is set
        if (tenantsCode == null) {
            throw new ApiException("Missing the required parameter 'tenantsCode' when calling getRealtimeRuleList(Async)");
        }
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling getRealtimeRuleList(Async)");
        }
        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling getRealtimeRuleList(Async)");
        }

        com.squareup.okhttp.Call call = getRealtimeRuleListCall(tenantsCode, page, pageSize, progressListener, progressRequestListener);
        return call;





    }

    /**
     * 获取实时规则列表
     * 
     * @param tenantsCode 租户ID (required)
     * @param page 当前页 (required)
     * @param pageSize 分页大小 (required)
     * @return RealtimeRuleListResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RealtimeRuleListResp getRealtimeRuleList(String tenantsCode, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<RealtimeRuleListResp> resp = getRealtimeRuleListWithHttpInfo(tenantsCode, page, pageSize);
        return resp.getData();
    }


    /**
     * 获取实时规则列表
     * 
     * @param tenantsCode 租户ID (required)
     * @param page 当前页 (required)
     * @param pageSize 分页大小 (required)
     * @return ApiResponse&lt;RealtimeRuleListResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RealtimeRuleListResp> getRealtimeRuleListWithHttpInfo(String tenantsCode, Integer page, Integer pageSize) throws ApiException {
        com.squareup.okhttp.Call call = getRealtimeRuleListValidateBeforeCall(tenantsCode, page, pageSize, null, null);
        Type localVarReturnType = new TypeToken<RealtimeRuleListResp>(){}.getType();

        String[] localVarAccepts = {
            "application/json", "text/plain"
        };

        return apiClient.execute(call, localVarReturnType, localVarAccepts);
    }

    /**
     * 获取实时规则列表 (asynchronously)
     * 
     * @param tenantsCode 租户ID (required)
     * @param page 当前页 (required)
     * @param pageSize 分页大小 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRealtimeRuleListAsync(String tenantsCode, Integer page, Integer pageSize, final ApiCallback<RealtimeRuleListResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getRealtimeRuleListValidateBeforeCall(tenantsCode, page, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RealtimeRuleListResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, localVarAccepts, callback);
        return call;
    }
}
