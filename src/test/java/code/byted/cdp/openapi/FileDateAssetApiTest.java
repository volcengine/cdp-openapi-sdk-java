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

import java.io.File;
import code.byted.cdp.model.SeqFileDataTaskSimpleResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for FileDateAssetApi
 */
@Ignore
public class FileDateAssetApiTest {

    private final FileDateAssetApi api = new FileDateAssetApi();

    /**
     * 下载分群明细
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void downloadFileDateAssetTest() throws Exception {
        String xTenant = null;
        Integer taskId = null;
        Integer segId = null;
        String file = null;
        File response = api.downloadFileDateAsset(xTenant, taskId, segId, file);

        // TODO: test validations
    }
    /**
     * 获取分群明细任务列表
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFileDateAssetTaskListTest() throws Exception {
        String xTenant = null;
        SeqFileDataTaskSimpleResult response = api.getFileDateAssetTaskList(xTenant);

        // TODO: test validations
    }
}
