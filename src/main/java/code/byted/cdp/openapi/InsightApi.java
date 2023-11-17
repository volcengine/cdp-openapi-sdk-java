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


import code.byted.cdp.model.InlineResponse200;
import code.byted.cdp.model.InlineResponse2001;
import code.byted.cdp.model.InlineResponse2002;
import code.byted.cdp.model.InlineResponse2003;
import org.threeten.bp.LocalDate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InsightApi {
    private ApiClient apiClient;

    public InsightApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InsightApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getDSLInsightKey
     * @param body dsl结构 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDSLInsightKeyCall(Object body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();


        localVarQueryParams.add(new Pair("Action","QueryOpenPlatformOpenApi"));
        localVarQueryParams.add(new Pair("Version","2021-12-16"));
        localVarQueryParams.add(new Pair("ApiAction","getDSLInsightKey"));
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
    private com.squareup.okhttp.Call getDSLInsightKeyValidateBeforeCall(Object body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling getDSLInsightKey(Async)");
        }

        com.squareup.okhttp.Call call = getDSLInsightKeyCall(body, progressListener, progressRequestListener);
        return call;





    }

    /**
     * 获取洞察跳转key
     * 
     * @param body dsl结构 (required)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse200 getDSLInsightKey(Object body) throws ApiException {
        ApiResponse<InlineResponse200> resp = getDSLInsightKeyWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 获取洞察跳转key
     * 
     * @param body dsl结构 (required)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse200> getDSLInsightKeyWithHttpInfo(Object body) throws ApiException {
        com.squareup.okhttp.Call call = getDSLInsightKeyValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();

        String[] localVarAccepts = {
            "application/json", "text/plain"
        };

        return apiClient.execute(call, localVarReturnType, localVarAccepts);
    }

    /**
     * 获取洞察跳转key (asynchronously)
     * 
     * @param body dsl结构 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDSLInsightKeyAsync(Object body, final ApiCallback<InlineResponse200> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDSLInsightKeyValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, localVarAccepts, callback);
        return call;
    }
    /**
     * Build call for getInsightReportById
     * @param xTenant  (required)
     * @param reportId  (required)
     * @param xEnv  (optional)
     * @param singleValue  (optional)
     * @param insightSortObj  (optional)
     * @param sortType  (optional)
     * @param pDate  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getInsightReportByIdCall(Long xTenant, Long reportId, String xEnv, Boolean singleValue, String insightSortObj, String sortType, LocalDate pDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (singleValue != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("singleValue", singleValue));
        if (insightSortObj != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("insightSortObj", insightSortObj));
        if (sortType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sortType", sortType));
        if (pDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pDate", pDate));

        localVarQueryParams.add(new Pair("reportId", reportId.toString()));

        localVarQueryParams.add(new Pair("Action","QueryOpenPlatformOpenApi"));
        localVarQueryParams.add(new Pair("Version","2021-12-16"));
        localVarQueryParams.add(new Pair("ApiAction","getInsightReportById"));
        localVarQueryParams.add(new Pair("ApiVersion","2023-02-10"));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xTenant != null)
        localVarHeaderParams.put("X-Tenant", apiClient.parameterToString(xTenant));
        if (xEnv != null)
        localVarHeaderParams.put("X-Env", apiClient.parameterToString(xEnv));

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
    private com.squareup.okhttp.Call getInsightReportByIdValidateBeforeCall(Long xTenant, Long reportId, String xEnv, Boolean singleValue, String insightSortObj, String sortType, LocalDate pDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xTenant' is set
        if (xTenant == null) {
            throw new ApiException("Missing the required parameter 'xTenant' when calling getInsightReportById(Async)");
        }
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new ApiException("Missing the required parameter 'reportId' when calling getInsightReportById(Async)");
        }

        com.squareup.okhttp.Call call = getInsightReportByIdCall(xTenant, reportId, xEnv, singleValue, insightSortObj, sortType, pDate, progressListener, progressRequestListener);
        return call;





    }

    /**
     * 洞察报告详情
     * 
     * @param xTenant  (required)
     * @param reportId  (required)
     * @param xEnv  (optional)
     * @param singleValue  (optional)
     * @param insightSortObj  (optional)
     * @param sortType  (optional)
     * @param pDate  (optional)
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2002 getInsightReportById(Long xTenant, Long reportId, String xEnv, Boolean singleValue, String insightSortObj, String sortType, LocalDate pDate) throws ApiException {
        ApiResponse<InlineResponse2002> resp = getInsightReportByIdWithHttpInfo(xTenant, reportId, xEnv, singleValue, insightSortObj, sortType, pDate);
        return resp.getData();
    }

    /**
     * 洞察报告详情
     * 
     * @param xTenant  (required)
     * @param reportId  (required)
     * @param xEnv  (optional)
     * @param singleValue  (optional)
     * @param insightSortObj  (optional)
     * @param sortType  (optional)
     * @param pDate  (optional)
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2002> getInsightReportByIdWithHttpInfo(Long xTenant, Long reportId, String xEnv, Boolean singleValue, String insightSortObj, String sortType, LocalDate pDate) throws ApiException {
        com.squareup.okhttp.Call call = getInsightReportByIdValidateBeforeCall(xTenant, reportId, xEnv, singleValue, insightSortObj, sortType, pDate, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();

        String[] localVarAccepts = {
            "application/json", "text/plain"
        };

        return apiClient.execute(call, localVarReturnType, localVarAccepts);
    }

    /**
     * 洞察报告详情 (asynchronously)
     * 
     * @param xTenant  (required)
     * @param reportId  (required)
     * @param xEnv  (optional)
     * @param singleValue  (optional)
     * @param insightSortObj  (optional)
     * @param sortType  (optional)
     * @param pDate  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInsightReportByIdAsync(Long xTenant, Long reportId, String xEnv, Boolean singleValue, String insightSortObj, String sortType, LocalDate pDate, final ApiCallback<InlineResponse2002> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getInsightReportByIdValidateBeforeCall(xTenant, reportId, xEnv, singleValue, insightSortObj, sortType, pDate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, localVarAccepts, callback);
        return call;
    }
    /**
     * Build call for getInsightReportList
     * @param xTenant  (required)
     * @param xEnv  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getInsightReportListCall(Long xTenant, String xEnv, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();


        localVarQueryParams.add(new Pair("Action","QueryOpenPlatformOpenApi"));
        localVarQueryParams.add(new Pair("Version","2021-12-16"));
        localVarQueryParams.add(new Pair("ApiAction","getInsightReportList"));
        localVarQueryParams.add(new Pair("ApiVersion","2023-02-10"));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xTenant != null)
        localVarHeaderParams.put("X-Tenant", apiClient.parameterToString(xTenant));
        if (xEnv != null)
        localVarHeaderParams.put("X-Env", apiClient.parameterToString(xEnv));

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
    private com.squareup.okhttp.Call getInsightReportListValidateBeforeCall(Long xTenant, String xEnv, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xTenant' is set
        if (xTenant == null) {
            throw new ApiException("Missing the required parameter 'xTenant' when calling getInsightReportList(Async)");
        }

        com.squareup.okhttp.Call call = getInsightReportListCall(xTenant, xEnv, progressListener, progressRequestListener);
        return call;





    }

    /**
     * 洞察报告列表
     * 
     * @param xTenant  (required)
     * @param xEnv  (optional)
     * @return InlineResponse2001
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2001 getInsightReportList(Long xTenant, String xEnv) throws ApiException {
        ApiResponse<InlineResponse2001> resp = getInsightReportListWithHttpInfo(xTenant, xEnv);
        return resp.getData();
    }

    /**
     * 洞察报告列表
     * 
     * @param xTenant  (required)
     * @param xEnv  (optional)
     * @return ApiResponse&lt;InlineResponse2001&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2001> getInsightReportListWithHttpInfo(Long xTenant, String xEnv) throws ApiException {
        com.squareup.okhttp.Call call = getInsightReportListValidateBeforeCall(xTenant, xEnv, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();

        String[] localVarAccepts = {
            "application/json", "text/plain"
        };

        return apiClient.execute(call, localVarReturnType, localVarAccepts);
    }

    /**
     * 洞察报告列表 (asynchronously)
     * 
     * @param xTenant  (required)
     * @param xEnv  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInsightReportListAsync(Long xTenant, String xEnv, final ApiCallback<InlineResponse2001> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getInsightReportListValidateBeforeCall(xTenant, xEnv, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, localVarAccepts, callback);
        return call;
    }
    /**
     * Build call for getInsightReportUsage
     * @param xTenant  (required)
     * @param xEnv  (optional)
     * @param openapiOnly  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getInsightReportUsageCall(Long xTenant, String xEnv, Boolean openapiOnly, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (openapiOnly != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("openapiOnly", openapiOnly));


        localVarQueryParams.add(new Pair("Action","QueryOpenPlatformOpenApi"));
        localVarQueryParams.add(new Pair("Version","2021-12-16"));
        localVarQueryParams.add(new Pair("ApiAction","getInsightReportUsage"));
        localVarQueryParams.add(new Pair("ApiVersion","2023-06-20"));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xTenant != null)
        localVarHeaderParams.put("X-Tenant", apiClient.parameterToString(xTenant));
        if (xEnv != null)
        localVarHeaderParams.put("X-Env", apiClient.parameterToString(xEnv));

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
    private com.squareup.okhttp.Call getInsightReportUsageValidateBeforeCall(Long xTenant, String xEnv, Boolean openapiOnly, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xTenant' is set
        if (xTenant == null) {
            throw new ApiException("Missing the required parameter 'xTenant' when calling getInsightReportUsage(Async)");
        }

        com.squareup.okhttp.Call call = getInsightReportUsageCall(xTenant, xEnv, openapiOnly, progressListener, progressRequestListener);
        return call;





    }

    /**
     * 统计洞察报告查看次数
     * 
     * @param xTenant  (required)
     * @param xEnv  (optional)
     * @param openapiOnly  (optional)
     * @return InlineResponse2003
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2003 getInsightReportUsage(Long xTenant, String xEnv, Boolean openapiOnly) throws ApiException {
        ApiResponse<InlineResponse2003> resp = getInsightReportUsageWithHttpInfo(xTenant, xEnv, openapiOnly);
        return resp.getData();
    }

    /**
     * 统计洞察报告查看次数
     * 
     * @param xTenant  (required)
     * @param xEnv  (optional)
     * @param openapiOnly  (optional)
     * @return ApiResponse&lt;InlineResponse2003&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2003> getInsightReportUsageWithHttpInfo(Long xTenant, String xEnv, Boolean openapiOnly) throws ApiException {
        com.squareup.okhttp.Call call = getInsightReportUsageValidateBeforeCall(xTenant, xEnv, openapiOnly, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();

        String[] localVarAccepts = {
            "application/json", "text/plain"
        };

        return apiClient.execute(call, localVarReturnType, localVarAccepts);
    }

    /**
     * 统计洞察报告查看次数 (asynchronously)
     * 
     * @param xTenant  (required)
     * @param xEnv  (optional)
     * @param openapiOnly  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInsightReportUsageAsync(Long xTenant, String xEnv, Boolean openapiOnly, final ApiCallback<InlineResponse2003> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getInsightReportUsageValidateBeforeCall(xTenant, xEnv, openapiOnly, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, localVarAccepts, callback);
        return call;
    }
}
