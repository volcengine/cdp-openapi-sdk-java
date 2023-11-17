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
 * ProfileTag
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-11-17T15:23:34.702+08:00[Asia/Shanghai]")
public class ProfileTag {
  @SerializedName("code")
  private String code = null;

  /**
   * Gets or Sets createWay
   */
  @JsonAdapter(CreateWayEnum.Adapter.class)
  public enum CreateWayEnum {
    UNKNOWN("Unknown"),
    ALL("all"),
    CALCU("calcu"),
    RULE("rule"),
    IMPORT("import"),
    MANUAL("manual"),
    SQL("sql"),
    LOGIC("logic"),
    COMBINE("combine"),
    ML_MODEL("ml_model"),
    ETL_MODEL("etl_model"),
    CLICKHOUSE_SQL("clickhouse_sql"),
    HIVE_SQL("hive_sql"),
    MODEL("model"),
    MULTI_STAGE("multi_stage"),
    MAUTAG("mautag"),
    RFM("rfm"),
    STATISTICS("statistics"),
    FIRST_LAST("first_last");

    private String value;

    CreateWayEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CreateWayEnum fromValue(String input) {
      for (CreateWayEnum b : CreateWayEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return UNKNOWN;
    }
    public static class Adapter extends TypeAdapter<CreateWayEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CreateWayEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CreateWayEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CreateWayEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("createWay")
  private CreateWayEnum createWay = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  /**
   * Gets or Sets dataType
   */
  @JsonAdapter(DataTypeEnum.Adapter.class)
  public enum DataTypeEnum {
    UNKNOWN("Unknown"),
    STRING("String"),
    STRINGENUM("StringEnum"),
    DECIMAL("Decimal"),
    DECIMALENUM("DecimalEnum"),
    DOUBLEDECIMAL("DoubleDecimal"),
    INTDECIMAL("IntDecimal"),
    DIMTLBTYPE("dimTlbType"),
    ARRAY("Array"),
    COMPOUND("Compound"),
    COMPOUNDENUM("CompoundEnum"),
    SEGTYPE("SegType"),
    DATETIME("DateTime"),
    DATE("Date"),
    TIMESTAMP("Timestamp");

    private String value;

    DataTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DataTypeEnum fromValue(String input) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return UNKNOWN;
    }
    public static class Adapter extends TypeAdapter<DataTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DataTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DataTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("dataType")
  private DataTypeEnum dataType = null;

  /**
   * Gets or Sets featureDataType
   */
  @JsonAdapter(FeatureDataTypeEnum.Adapter.class)
  public enum FeatureDataTypeEnum {
    UNKNOWN("Unknown"),
    STRING("string"),
    INT("int"),
    BIGINT("bigint"),
    DOUBLE("double"),
    TIMESTAMP("timestamp"),
    DECIMAL("decimal"),
    LIST("list"),
    DATE("date"),
    DATETIME("datetime"),
    ARRAY_STRING("array_string"),
    ARRAY_STRING_("array<string>");

    private String value;

    FeatureDataTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FeatureDataTypeEnum fromValue(String input) {
      for (FeatureDataTypeEnum b : FeatureDataTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return UNKNOWN;
    }
    public static class Adapter extends TypeAdapter<FeatureDataTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeatureDataTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public FeatureDataTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FeatureDataTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("featureDataType")
  private FeatureDataTypeEnum featureDataType = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("idType")
  private Integer idType = null;

  @SerializedName("idTypeCode")
  private String idTypeCode = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Gets or Sets originDataType
   */
  @JsonAdapter(OriginDataTypeEnum.Adapter.class)
  public enum OriginDataTypeEnum {
    UNKNOWN("Unknown"),
    STRING("string"),
    INT("int"),
    BIGINT("bigint"),
    DOUBLE("double"),
    TIMESTAMP("timestamp"),
    DECIMAL("decimal"),
    LIST("list"),
    DATE("date"),
    DATETIME("datetime"),
    ARRAY_STRING("array_string"),
    ARRAY_STRING_("array<string>");

    private String value;

    OriginDataTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OriginDataTypeEnum fromValue(String input) {
      for (OriginDataTypeEnum b : OriginDataTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return UNKNOWN;
    }
    public static class Adapter extends TypeAdapter<OriginDataTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OriginDataTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public OriginDataTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return OriginDataTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("originDataType")
  private OriginDataTypeEnum originDataType = null;

  /**
   * Gets or Sets originType
   */
  @JsonAdapter(OriginTypeEnum.Adapter.class)
  public enum OriginTypeEnum {
    UNKNOWN("Unknown"),
    STRING("String"),
    STRINGENUM("StringEnum"),
    DECIMAL("Decimal"),
    DECIMALENUM("DecimalEnum"),
    DOUBLEDECIMAL("DoubleDecimal"),
    INTDECIMAL("IntDecimal"),
    DIMTLBTYPE("dimTlbType"),
    ARRAY("Array"),
    COMPOUND("Compound"),
    COMPOUNDENUM("CompoundEnum"),
    SEGTYPE("SegType"),
    DATETIME("DateTime"),
    DATE("Date"),
    TIMESTAMP("Timestamp");

    private String value;

    OriginTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OriginTypeEnum fromValue(String input) {
      for (OriginTypeEnum b : OriginTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return UNKNOWN;
    }
    public static class Adapter extends TypeAdapter<OriginTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OriginTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public OriginTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return OriginTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("originType")
  private OriginTypeEnum originType = null;

  @SerializedName("readable")
  private Boolean readable = null;

  @SerializedName("tagDate")
  private String tagDate = null;

  @SerializedName("updatedAt")
  private String updatedAt = null;

  @SerializedName("value")
  private Object value = null;

  public ProfileTag code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(required = true, description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ProfileTag createWay(CreateWayEnum createWay) {
    this.createWay = createWay;
    return this;
  }

   /**
   * Get createWay
   * @return createWay
  **/
  @Schema(required = true, description = "")
  public CreateWayEnum getCreateWay() {
    return createWay;
  }

  public void setCreateWay(CreateWayEnum createWay) {
    this.createWay = createWay;
  }

  public ProfileTag createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(required = true, description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ProfileTag dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @Schema(required = true, description = "")
  public DataTypeEnum getDataType() {
    return dataType;
  }

  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }

  public ProfileTag featureDataType(FeatureDataTypeEnum featureDataType) {
    this.featureDataType = featureDataType;
    return this;
  }

   /**
   * Get featureDataType
   * @return featureDataType
  **/
  @Schema(required = true, description = "")
  public FeatureDataTypeEnum getFeatureDataType() {
    return featureDataType;
  }

  public void setFeatureDataType(FeatureDataTypeEnum featureDataType) {
    this.featureDataType = featureDataType;
  }

  public ProfileTag id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ProfileTag idType(Integer idType) {
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @Schema(required = true, description = "")
  public Integer getIdType() {
    return idType;
  }

  public void setIdType(Integer idType) {
    this.idType = idType;
  }

  public ProfileTag idTypeCode(String idTypeCode) {
    this.idTypeCode = idTypeCode;
    return this;
  }

   /**
   * Get idTypeCode
   * @return idTypeCode
  **/
  @Schema(description = "")
  public String getIdTypeCode() {
    return idTypeCode;
  }

  public void setIdTypeCode(String idTypeCode) {
    this.idTypeCode = idTypeCode;
  }

  public ProfileTag name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProfileTag originDataType(OriginDataTypeEnum originDataType) {
    this.originDataType = originDataType;
    return this;
  }

   /**
   * Get originDataType
   * @return originDataType
  **/
  @Schema(description = "")
  public OriginDataTypeEnum getOriginDataType() {
    return originDataType;
  }

  public void setOriginDataType(OriginDataTypeEnum originDataType) {
    this.originDataType = originDataType;
  }

  public ProfileTag originType(OriginTypeEnum originType) {
    this.originType = originType;
    return this;
  }

   /**
   * Get originType
   * @return originType
  **/
  @Schema(description = "")
  public OriginTypeEnum getOriginType() {
    return originType;
  }

  public void setOriginType(OriginTypeEnum originType) {
    this.originType = originType;
  }

  public ProfileTag readable(Boolean readable) {
    this.readable = readable;
    return this;
  }

   /**
   * Get readable
   * @return readable
  **/
  @Schema(description = "")
  public Boolean isReadable() {
    return readable;
  }

  public void setReadable(Boolean readable) {
    this.readable = readable;
  }

  public ProfileTag tagDate(String tagDate) {
    this.tagDate = tagDate;
    return this;
  }

   /**
   * Get tagDate
   * @return tagDate
  **/
  @Schema(description = "")
  public String getTagDate() {
    return tagDate;
  }

  public void setTagDate(String tagDate) {
    this.tagDate = tagDate;
  }

  public ProfileTag updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(required = true, description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public ProfileTag value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
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
    ProfileTag profileTag = (ProfileTag) o;
    return Objects.equals(this.code, profileTag.code) &&
        Objects.equals(this.createWay, profileTag.createWay) &&
        Objects.equals(this.createdAt, profileTag.createdAt) &&
        Objects.equals(this.dataType, profileTag.dataType) &&
        Objects.equals(this.featureDataType, profileTag.featureDataType) &&
        Objects.equals(this.id, profileTag.id) &&
        Objects.equals(this.idType, profileTag.idType) &&
        Objects.equals(this.idTypeCode, profileTag.idTypeCode) &&
        Objects.equals(this.name, profileTag.name) &&
        Objects.equals(this.originDataType, profileTag.originDataType) &&
        Objects.equals(this.originType, profileTag.originType) &&
        Objects.equals(this.readable, profileTag.readable) &&
        Objects.equals(this.tagDate, profileTag.tagDate) &&
        Objects.equals(this.updatedAt, profileTag.updatedAt) &&
        Objects.equals(this.value, profileTag.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, createWay, createdAt, dataType, featureDataType, id, idType, idTypeCode, name, originDataType, originType, readable, tagDate, updatedAt, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileTag {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    createWay: ").append(toIndentedString(createWay)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    featureDataType: ").append(toIndentedString(featureDataType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    idTypeCode: ").append(toIndentedString(idTypeCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originDataType: ").append(toIndentedString(originDataType)).append("\n");
    sb.append("    originType: ").append(toIndentedString(originType)).append("\n");
    sb.append("    readable: ").append(toIndentedString(readable)).append("\n");
    sb.append("    tagDate: ").append(toIndentedString(tagDate)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
