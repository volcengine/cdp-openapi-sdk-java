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
/**
 * AllowUpdateData
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-08-11T11:20:29.425+08:00[Asia/Shanghai]")
public class AllowUpdateData {
  @SerializedName("notAllowReason")
  private String notAllowReason = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("value")
  private Boolean value = null;

  public AllowUpdateData notAllowReason(String notAllowReason) {
    this.notAllowReason = notAllowReason;
    return this;
  }

   /**
   * Get notAllowReason
   * @return notAllowReason
  **/
  @Schema(required = true, description = "")
  public String getNotAllowReason() {
    return notAllowReason;
  }

  public void setNotAllowReason(String notAllowReason) {
    this.notAllowReason = notAllowReason;
  }

  public AllowUpdateData type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AllowUpdateData value(Boolean value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(required = true, description = "")
  public Boolean isValue() {
    return value;
  }

  public void setValue(Boolean value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllowUpdateData allowUpdateData = (AllowUpdateData) o;
    return Objects.equals(this.notAllowReason, allowUpdateData.notAllowReason) &&
        Objects.equals(this.type, allowUpdateData.type) &&
        Objects.equals(this.value, allowUpdateData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notAllowReason, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowUpdateData {\n");
    
    sb.append("    notAllowReason: ").append(toIndentedString(notAllowReason)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
