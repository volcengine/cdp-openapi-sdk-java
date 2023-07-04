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


import code.byted.cdp.model.ResNodeLineage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LineageApi {
    private ApiClient apiClient;

    public LineageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LineageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for queryLineageByNid
     * @param bizType 业务类型枚举Key (required)
     * @param nativeId 业务结点原生ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryLineageByNidCall(String bizType, Long nativeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (bizType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("bizType", bizType));
        if (nativeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("nativeId", nativeId));


        localVarQueryParams.add(new Pair("Action","QueryOpenPlatformOpenApi"));
        localVarQueryParams.add(new Pair("Version","2021-12-16"));
        localVarQueryParams.add(new Pair("ApiAction","queryLineageByNid"));
        localVarQueryParams.add(new Pair("ApiVersion","2023-06-20"));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
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
    private com.squareup.okhttp.Call queryLineageByNidValidateBeforeCall(String bizType, Long nativeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'bizType' is set
        if (bizType == null) {
            throw new ApiException("Missing the required parameter 'bizType' when calling queryLineageByNid(Async)");
        }
        // verify the required parameter 'nativeId' is set
        if (nativeId == null) {
            throw new ApiException("Missing the required parameter 'nativeId' when calling queryLineageByNid(Async)");
        }

        com.squareup.okhttp.Call call = queryLineageByNidCall(bizType, nativeId, progressListener, progressRequestListener);
        return call;





    }

    /**
     * 根据业务类型&amp;原生ID查询出入度数据血缘
     * 根据业务ID&amp;业务类型查询,未查询到的结点baseId为Null
     * @param bizType 业务类型枚举Key (required)
     * @param nativeId 业务结点原生ID (required)
     * @return ResNodeLineage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResNodeLineage queryLineageByNid(String bizType, Long nativeId) throws ApiException {
        ApiResponse<ResNodeLineage> resp = queryLineageByNidWithHttpInfo(bizType, nativeId);
        return resp.getData();
    }

    /**
     * 根据业务类型&amp;原生ID查询出入度数据血缘
     * 根据业务ID&amp;业务类型查询,未查询到的结点baseId为Null
     * @param bizType 业务类型枚举Key (required)
     * @param nativeId 业务结点原生ID (required)
     * @return ApiResponse&lt;ResNodeLineage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResNodeLineage> queryLineageByNidWithHttpInfo(String bizType, Long nativeId) throws ApiException {
        com.squareup.okhttp.Call call = queryLineageByNidValidateBeforeCall(bizType, nativeId, null, null);
        Type localVarReturnType = new TypeToken<ResNodeLineage>(){}.getType();

        String[] localVarAccepts = {
            "*/*"
        };

        return apiClient.execute(call, localVarReturnType, localVarAccepts);
    }

    /**
     * 根据业务类型&amp;原生ID查询出入度数据血缘 (asynchronously)
     * 根据业务ID&amp;业务类型查询,未查询到的结点baseId为Null
     * @param bizType 业务类型枚举Key (required)
     * @param nativeId 业务结点原生ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryLineageByNidAsync(String bizType, Long nativeId, final ApiCallback<ResNodeLineage> callback) throws ApiException {

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
            "*/*"
        };

        com.squareup.okhttp.Call call = queryLineageByNidValidateBeforeCall(bizType, nativeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResNodeLineage>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, localVarAccepts, callback);
        return call;
    }
}