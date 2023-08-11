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
import code.byted.cdp.model.LegacySegOpenApiResponse;
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
 * LegacySegOpenApiSegPageResponseLegacySegOpenApiResponse
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-08-11T11:20:29.425+08:00[Asia/Shanghai]")
public class LegacySegOpenApiSegPageResponseLegacySegOpenApiResponse {
  @SerializedName("total")
  private Integer total = null;

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("items")
  private List<LegacySegOpenApiResponse> items = new ArrayList<LegacySegOpenApiResponse>();

  public LegacySegOpenApiSegPageResponseLegacySegOpenApiResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * 总数
   * @return total
  **/
  @Schema(required = true, description = "总数")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public LegacySegOpenApiSegPageResponseLegacySegOpenApiResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页大小
   * @return pageSize
  **/
  @Schema(required = true, description = "每页大小")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public LegacySegOpenApiSegPageResponseLegacySegOpenApiResponse page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * 页码
   * @return page
  **/
  @Schema(required = true, description = "页码")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public LegacySegOpenApiSegPageResponseLegacySegOpenApiResponse items(List<LegacySegOpenApiResponse> items) {
    this.items = items;
    return this;
  }

  public LegacySegOpenApiSegPageResponseLegacySegOpenApiResponse addItemsItem(LegacySegOpenApiResponse itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * 结果
   * @return items
  **/
  @Schema(required = true, description = "结果")
  public List<LegacySegOpenApiResponse> getItems() {
    return items;
  }

  public void setItems(List<LegacySegOpenApiResponse> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacySegOpenApiSegPageResponseLegacySegOpenApiResponse legacySegOpenApiSegPageResponseLegacySegOpenApiResponse = (LegacySegOpenApiSegPageResponseLegacySegOpenApiResponse) o;
    return Objects.equals(this.total, legacySegOpenApiSegPageResponseLegacySegOpenApiResponse.total) &&
        Objects.equals(this.pageSize, legacySegOpenApiSegPageResponseLegacySegOpenApiResponse.pageSize) &&
        Objects.equals(this.page, legacySegOpenApiSegPageResponseLegacySegOpenApiResponse.page) &&
        Objects.equals(this.items, legacySegOpenApiSegPageResponseLegacySegOpenApiResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, pageSize, page, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacySegOpenApiSegPageResponseLegacySegOpenApiResponse {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
