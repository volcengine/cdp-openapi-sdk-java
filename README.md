# CDP openAPI for Java

欢迎使用CDP openAPI SDK for Java, 本文档为您介绍如何获取及调用SDK。
此SDK 适用于CDP私部场景。
## 前置准备
### 服务开通
如果调用高速openAPI,请确保已经开通在线服务。

### 获取安全凭证
Access Key（访问密钥）是访问CDP openAPI服务的安全凭证，包含Access Key ID（简称为AK）和Secret Access Key（简称为SK）两部分。
您可以登录CDP, 点击“项目中心”->"资产输出"->"渠道管理"->"自定义渠道"， 点击“添加渠道应用”，创建并管理您的Access Key。

### 环境检查
Java 版本需要不低于 1.8

## 获取与安装

```
<dependency>
    <groupId>com.volcengine</groupId>
    <artifactId>cdp-openapisdk-java</artifactId>
    <version>最新版本</version>
</dependency>
```

## 样例
```java
    private final ApiClient client = new ApiClient(
        "xxx",
        "xxx",
        "https://xxxx/open_platform/openapi"
    );
    private final SegmentationApi segClient = new SegmentationApi(client);

    @Test
    public void sdkTest() throws Exception {
        try {
            File file = segClient.downloadSegFile(1, 1000008, "txt", false);
            System.out.println(file.getName());
            ByteDanceResponseSegmentationUploadResp res = segClient.uploadSegFile(file, 1);
            System.out.println(res);
        } catch (ApiException e) {
            throw e;
        }
    }

    @Test
    public void sdkAsyncTest() throws Exception {
        try {
            segClient.legacyGetSegmentListAsync(
                1, 1, 10, null, null, null, null, null, null, null, null,
                new ApiCallback<ByteDanceResponseSegmentationListResp>() {

                    public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {}

                    public void onSuccess(ByteDanceResponseSegmentationListResp result, int statusCode, Map<String, List<String>> responseHeaders) {
                        System.out.println(result);
                    }

                    public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {}

                    public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {}
                });
            Thread.sleep(5000);
        } catch (ApiException e) {
            throw e;
        }
    }
```



