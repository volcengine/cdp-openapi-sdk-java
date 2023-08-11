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
import code.byted.cdp.model.InputStream;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
import java.io.IOException;
/**
 * InputStreamResource
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-08-11T11:20:29.425+08:00[Asia/Shanghai]")
public class InputStreamResource {
  @SerializedName("inputStream")
  private InputStream inputStream = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("open")
  private Boolean open = null;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("file")
  private File file = null;

  @SerializedName("readable")
  private Boolean readable = null;

  public InputStreamResource inputStream(InputStream inputStream) {
    this.inputStream = inputStream;
    return this;
  }

   /**
   * Get inputStream
   * @return inputStream
  **/
  @Schema(description = "")
  public InputStream getInputStream() {
    return inputStream;
  }

  public void setInputStream(InputStream inputStream) {
    this.inputStream = inputStream;
  }

  public InputStreamResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InputStreamResource open(Boolean open) {
    this.open = open;
    return this;
  }

   /**
   * Get open
   * @return open
  **/
  @Schema(description = "")
  public Boolean isOpen() {
    return open;
  }

  public void setOpen(Boolean open) {
    this.open = open;
  }

  public InputStreamResource filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @Schema(description = "")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public InputStreamResource uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @Schema(description = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public InputStreamResource url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public InputStreamResource file(File file) {
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @Schema(description = "")
  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  public InputStreamResource readable(Boolean readable) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputStreamResource inputStreamResource = (InputStreamResource) o;
    return Objects.equals(this.inputStream, inputStreamResource.inputStream) &&
        Objects.equals(this.description, inputStreamResource.description) &&
        Objects.equals(this.open, inputStreamResource.open) &&
        Objects.equals(this.filename, inputStreamResource.filename) &&
        Objects.equals(this.uri, inputStreamResource.uri) &&
        Objects.equals(this.url, inputStreamResource.url) &&
        Objects.equals(this.file, inputStreamResource.file) &&
        Objects.equals(this.readable, inputStreamResource.readable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputStream, description, open, filename, uri, url, file, readable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputStreamResource {\n");
    
    sb.append("    inputStream: ").append(toIndentedString(inputStream)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    readable: ").append(toIndentedString(readable)).append("\n");
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
