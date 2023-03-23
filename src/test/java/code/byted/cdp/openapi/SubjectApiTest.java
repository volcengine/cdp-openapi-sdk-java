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

import code.byted.cdp.model.ListIdType;
import code.byted.cdp.model.ListSubjectMeta;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for SubjectApi
 */
@Ignore
public class SubjectApiTest {

    private final SubjectApi api = new SubjectApi();

    /**
     * 查询实体列表
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSubjectIdTypesTest() throws Exception {
        Integer subjectId = null;
        ListIdType response = api.getSubjectIdTypes(subjectId);

        // TODO: test validations
    }
    /**
     * 查询主体列表
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSubjectsTest() throws Exception {
        Long xTenant = null;
        Long orgId = null;
        ListSubjectMeta response = api.getSubjects(xTenant, orgId);

        // TODO: test validations
    }
}
