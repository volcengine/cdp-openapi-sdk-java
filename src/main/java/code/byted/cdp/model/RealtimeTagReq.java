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
import code.byted.cdp.model.IdFilter;
import code.byted.cdp.model.NewTagValue;
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
 * RealtimeTagReq
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-09-20T16:39:48.664+08:00[Asia/Shanghai]")
public class RealtimeTagReq {
  @SerializedName("idFilter")
  private IdFilter idFilter = null;

  @SerializedName("newTagValues")
  private List<NewTagValue> newTagValues = null;

  public RealtimeTagReq idFilter(IdFilter idFilter) {
    this.idFilter = idFilter;
    return this;
  }

   /**
   * Get idFilter
   * @return idFilter
  **/
  @Schema(description = "")
  public IdFilter getIdFilter() {
    return idFilter;
  }

  public void setIdFilter(IdFilter idFilter) {
    this.idFilter = idFilter;
  }

  public RealtimeTagReq newTagValues(List<NewTagValue> newTagValues) {
    this.newTagValues = newTagValues;
    return this;
  }

  public RealtimeTagReq addNewTagValuesItem(NewTagValue newTagValuesItem) {
    if (this.newTagValues == null) {
      this.newTagValues = new ArrayList<NewTagValue>();
    }
    this.newTagValues.add(newTagValuesItem);
    return this;
  }

   /**
   * Get newTagValues
   * @return newTagValues
  **/
  @Schema(description = "")
  public List<NewTagValue> getNewTagValues() {
    return newTagValues;
  }

  public void setNewTagValues(List<NewTagValue> newTagValues) {
    this.newTagValues = newTagValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeTagReq realtimeTagReq = (RealtimeTagReq) o;
    return Objects.equals(this.idFilter, realtimeTagReq.idFilter) &&
        Objects.equals(this.newTagValues, realtimeTagReq.newTagValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idFilter, newTagValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeTagReq {\n");
    
    sb.append("    idFilter: ").append(toIndentedString(idFilter)).append("\n");
    sb.append("    newTagValues: ").append(toIndentedString(newTagValues)).append("\n");
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
