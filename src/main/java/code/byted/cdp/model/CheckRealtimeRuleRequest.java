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

package code.byted.cdp.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CheckRealtimeRuleRequest
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-03-23T12:09:51.626+08:00[Asia/Shanghai]")
public class CheckRealtimeRuleRequest {
  @SerializedName("id")
  private String id = null;

  @SerializedName("id_type")
  private String idType = null;

  @SerializedName("rule_ids")
  private List<Integer> ruleIds = null;

  public CheckRealtimeRuleRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CheckRealtimeRuleRequest idType(String idType) {
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @Schema(description = "")
  public String getIdType() {
    return idType;
  }

  public void setIdType(String idType) {
    this.idType = idType;
  }

  public CheckRealtimeRuleRequest ruleIds(List<Integer> ruleIds) {
    this.ruleIds = ruleIds;
    return this;
  }

  public CheckRealtimeRuleRequest addRuleIdsItem(Integer ruleIdsItem) {
    if (this.ruleIds == null) {
      this.ruleIds = new ArrayList<Integer>();
    }
    this.ruleIds.add(ruleIdsItem);
    return this;
  }

   /**
   * Get ruleIds
   * @return ruleIds
  **/
  @Schema(description = "")
  public List<Integer> getRuleIds() {
    return ruleIds;
  }

  public void setRuleIds(List<Integer> ruleIds) {
    this.ruleIds = ruleIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckRealtimeRuleRequest checkRealtimeRuleRequest = (CheckRealtimeRuleRequest) o;
    return Objects.equals(this.id, checkRealtimeRuleRequest.id) &&
        Objects.equals(this.idType, checkRealtimeRuleRequest.idType) &&
        Objects.equals(this.ruleIds, checkRealtimeRuleRequest.ruleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idType, ruleIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckRealtimeRuleRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}