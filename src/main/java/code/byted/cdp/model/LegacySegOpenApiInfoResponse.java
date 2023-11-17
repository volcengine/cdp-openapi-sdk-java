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
import code.byted.cdp.model.DetailModel;
import code.byted.cdp.model.LegacySegResult;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * LegacySegOpenApiInfoResponse
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-11-17T15:23:34.702+08:00[Asia/Shanghai]")
public class LegacySegOpenApiInfoResponse {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("idType")
  private String idType = null;

  @SerializedName("idTypeName")
  private String idTypeName = null;

  @SerializedName("result")
  private LegacySegResult result = null;

  /**
   * 分群类型
   */
  @JsonAdapter(SegTypeEnum.Adapter.class)
  public enum SegTypeEnum {
    UNKNOWN("Unknown"),
    CONDITIONAL("Conditional"),
    UPLOADED("Uploaded"),
    ABI("ABI"),
    LOOKALIKE("Lookalike"),
    CHILDSEG("ChildSeg"),
    PRIVATETRANSTOPUBLIC("PrivateTransToPublic"),
    SUBJECTTRANS("SubjectTrans"),
    FEATURERECOMMENDATION("FeatureRecommendation"),
    INSIGHTEXPORT("InsightExport"),
    INSIGHTEXPORTV2("InsightExportV2"),
    PUBLICCONDITIONAL("PublicConditional"),
    FINDER("Finder"),
    PUBLICMODELRESULT("PublicModelResult"),
    PUBLICUPLOADED("PublicUploaded"),
    MODEL("Model"),
    PUBLICLOOKALIKE("PublicLookalike"),
    PRIVATELOOKALIKE("PrivateLookalike"),
    SQLEXPORT("SqlExport"),
    REALTIMECONDITIONAL("RealtimeConditional"),
    PRIVATECLUSTER("PrivateCluster"),
    PRIVATECLUSTERCHILD("PrivateClusterChild"),
    PUBLICCLUSTER("PublicCluster"),
    PUBLICCLUSTERCHILD("PublicClusterChild");

    private String value;

    SegTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SegTypeEnum fromValue(String input) {
      for (SegTypeEnum b : SegTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return UNKNOWN;
    }
    public static class Adapter extends TypeAdapter<SegTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SegTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SegTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SegTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("segType")
  private SegTypeEnum segType = null;

  @SerializedName("abaseEnabled")
  private Boolean abaseEnabled = null;

  @SerializedName("detail")
  private DetailModel detail = null;

  public LegacySegOpenApiInfoResponse id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * 分群id
   * @return id
  **/
  @Schema(required = true, description = "分群id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LegacySegOpenApiInfoResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 分群名称
   * @return name
  **/
  @Schema(required = true, description = "分群名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LegacySegOpenApiInfoResponse createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * 分群创建人
   * @return createdBy
  **/
  @Schema(required = true, description = "分群创建人")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public LegacySegOpenApiInfoResponse idType(String idType) {
    this.idType = idType;
    return this;
  }

   /**
   * 分群实体类型code
   * @return idType
  **/
  @Schema(required = true, description = "分群实体类型code")
  public String getIdType() {
    return idType;
  }

  public void setIdType(String idType) {
    this.idType = idType;
  }

  public LegacySegOpenApiInfoResponse idTypeName(String idTypeName) {
    this.idTypeName = idTypeName;
    return this;
  }

   /**
   * 分群实体类型名称
   * @return idTypeName
  **/
  @Schema(required = true, description = "分群实体类型名称")
  public String getIdTypeName() {
    return idTypeName;
  }

  public void setIdTypeName(String idTypeName) {
    this.idTypeName = idTypeName;
  }

  public LegacySegOpenApiInfoResponse result(LegacySegResult result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @Schema(required = true, description = "")
  public LegacySegResult getResult() {
    return result;
  }

  public void setResult(LegacySegResult result) {
    this.result = result;
  }

  public LegacySegOpenApiInfoResponse segType(SegTypeEnum segType) {
    this.segType = segType;
    return this;
  }

   /**
   * 分群类型
   * @return segType
  **/
  @Schema(required = true, description = "分群类型")
  public SegTypeEnum getSegType() {
    return segType;
  }

  public void setSegType(SegTypeEnum segType) {
    this.segType = segType;
  }

  public LegacySegOpenApiInfoResponse abaseEnabled(Boolean abaseEnabled) {
    this.abaseEnabled = abaseEnabled;
    return this;
  }

   /**
   * 是否开启了在线服务
   * @return abaseEnabled
  **/
  @Schema(description = "是否开启了在线服务")
  public Boolean isAbaseEnabled() {
    return abaseEnabled;
  }

  public void setAbaseEnabled(Boolean abaseEnabled) {
    this.abaseEnabled = abaseEnabled;
  }

  public LegacySegOpenApiInfoResponse detail(DetailModel detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @Schema(description = "")
  public DetailModel getDetail() {
    return detail;
  }

  public void setDetail(DetailModel detail) {
    this.detail = detail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacySegOpenApiInfoResponse legacySegOpenApiInfoResponse = (LegacySegOpenApiInfoResponse) o;
    return Objects.equals(this.id, legacySegOpenApiInfoResponse.id) &&
        Objects.equals(this.name, legacySegOpenApiInfoResponse.name) &&
        Objects.equals(this.createdBy, legacySegOpenApiInfoResponse.createdBy) &&
        Objects.equals(this.idType, legacySegOpenApiInfoResponse.idType) &&
        Objects.equals(this.idTypeName, legacySegOpenApiInfoResponse.idTypeName) &&
        Objects.equals(this.result, legacySegOpenApiInfoResponse.result) &&
        Objects.equals(this.segType, legacySegOpenApiInfoResponse.segType) &&
        Objects.equals(this.abaseEnabled, legacySegOpenApiInfoResponse.abaseEnabled) &&
        Objects.equals(this.detail, legacySegOpenApiInfoResponse.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdBy, idType, idTypeName, result, segType, abaseEnabled, detail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacySegOpenApiInfoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    idTypeName: ").append(toIndentedString(idTypeName)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    segType: ").append(toIndentedString(segType)).append("\n");
    sb.append("    abaseEnabled: ").append(toIndentedString(abaseEnabled)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
