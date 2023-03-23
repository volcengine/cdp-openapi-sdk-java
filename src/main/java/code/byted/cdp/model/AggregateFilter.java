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
import code.byted.cdp.model.AggregateCondition;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AggregateFilter
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-03-23T12:09:51.626+08:00[Asia/Shanghai]")
public class AggregateFilter {
  @SerializedName("columnId")
  private Integer columnId = null;

  @SerializedName("condition")
  private AggregateCondition condition = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("paramName")
  private String paramName = null;

  @SerializedName("valueType")
  private String valueType = null;

  public AggregateFilter columnId(Integer columnId) {
    this.columnId = columnId;
    return this;
  }

   /**
   * Get columnId
   * @return columnId
  **/
  @Schema(description = "")
  public Integer getColumnId() {
    return columnId;
  }

  public void setColumnId(Integer columnId) {
    this.columnId = columnId;
  }

  public AggregateFilter condition(AggregateCondition condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @Schema(description = "")
  public AggregateCondition getCondition() {
    return condition;
  }

  public void setCondition(AggregateCondition condition) {
    this.condition = condition;
  }

  public AggregateFilter method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @Schema(required = true, description = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public AggregateFilter paramName(String paramName) {
    this.paramName = paramName;
    return this;
  }

   /**
   * Get paramName
   * @return paramName
  **/
  @Schema(description = "")
  public String getParamName() {
    return paramName;
  }

  public void setParamName(String paramName) {
    this.paramName = paramName;
  }

  public AggregateFilter valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @Schema(description = "")
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateFilter aggregateFilter = (AggregateFilter) o;
    return Objects.equals(this.columnId, aggregateFilter.columnId) &&
        Objects.equals(this.condition, aggregateFilter.condition) &&
        Objects.equals(this.method, aggregateFilter.method) &&
        Objects.equals(this.paramName, aggregateFilter.paramName) &&
        Objects.equals(this.valueType, aggregateFilter.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnId, condition, method, paramName, valueType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateFilter {\n");
    
    sb.append("    columnId: ").append(toIndentedString(columnId)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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
