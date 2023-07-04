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
import code.byted.cdp.model.CdpEventPropertyVo;
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
 * ListCdpEventPropertyVo
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-07-04T11:23:30.393+08:00[Asia/Shanghai]")
public class ListCdpEventPropertyVo {
  @SerializedName("code")
  private Long code = null;

  @SerializedName("msg")
  private String msg = null;

  @SerializedName("data")
  private List<CdpEventPropertyVo> data = null;

  public ListCdpEventPropertyVo code(Long code) {
    this.code = code;
    return this;
  }

   /**
   * 状态码，0表示正常
   * @return code
  **/
  @Schema(description = "状态码，0表示正常")
  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public ListCdpEventPropertyVo msg(String msg) {
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @Schema(description = "")
  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public ListCdpEventPropertyVo data(List<CdpEventPropertyVo> data) {
    this.data = data;
    return this;
  }

  public ListCdpEventPropertyVo addDataItem(CdpEventPropertyVo dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<CdpEventPropertyVo>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public List<CdpEventPropertyVo> getData() {
    return data;
  }

  public void setData(List<CdpEventPropertyVo> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCdpEventPropertyVo listCdpEventPropertyVo = (ListCdpEventPropertyVo) o;
    return Objects.equals(this.code, listCdpEventPropertyVo.code) &&
        Objects.equals(this.msg, listCdpEventPropertyVo.msg) &&
        Objects.equals(this.data, listCdpEventPropertyVo.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, msg, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCdpEventPropertyVo {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
