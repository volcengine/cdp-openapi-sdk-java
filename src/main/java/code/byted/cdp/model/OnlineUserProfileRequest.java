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
 * OnlineUserProfileRequest
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-03-23T12:09:51.626+08:00[Asia/Shanghai]")
public class OnlineUserProfileRequest {
  @SerializedName("id")
  private String id = null;

  @SerializedName("id_type")
  private String idType = null;

  @SerializedName("properties")
  private List<Integer> properties = null;

  @SerializedName("tags")
  private List<Integer> tags = null;

  public OnlineUserProfileRequest id(String id) {
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

  public OnlineUserProfileRequest idType(String idType) {
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

  public OnlineUserProfileRequest properties(List<Integer> properties) {
    this.properties = properties;
    return this;
  }

  public OnlineUserProfileRequest addPropertiesItem(Integer propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<Integer>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @Schema(description = "")
  public List<Integer> getProperties() {
    return properties;
  }

  public void setProperties(List<Integer> properties) {
    this.properties = properties;
  }

  public OnlineUserProfileRequest tags(List<Integer> tags) {
    this.tags = tags;
    return this;
  }

  public OnlineUserProfileRequest addTagsItem(Integer tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Integer>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public List<Integer> getTags() {
    return tags;
  }

  public void setTags(List<Integer> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnlineUserProfileRequest onlineUserProfileRequest = (OnlineUserProfileRequest) o;
    return Objects.equals(this.id, onlineUserProfileRequest.id) &&
        Objects.equals(this.idType, onlineUserProfileRequest.idType) &&
        Objects.equals(this.properties, onlineUserProfileRequest.properties) &&
        Objects.equals(this.tags, onlineUserProfileRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idType, properties, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnlineUserProfileRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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