/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.biglake.v1.model;

/**
 * Represents a table.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigLake API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Table extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The creation time of the table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The deletion time of the table. Only set after the table is deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deleteTime;

  /**
   * The checksum of a table object computed by the server based on the value of other fields. It
   * may be sent on update requests to ensure the client has an up-to-date value before proceeding.
   * It is only checked for update table operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Output only. The time when this table is considered expired. Only set after the table is
   * deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * Options of a Hive table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HiveTableOptions hiveOptions;

  /**
   * Output only. The resource name. Format: projects/{project_id_or_number}/locations/{location_id}
   * /catalogs/{catalog_id}/databases/{database_id}/tables/{table_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The table type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Output only. The last modification time of the table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The creation time of the table.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The creation time of the table.
   * @param createTime createTime or {@code null} for none
   */
  public Table setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The deletion time of the table. Only set after the table is deleted.
   * @return value or {@code null} for none
   */
  public String getDeleteTime() {
    return deleteTime;
  }

  /**
   * Output only. The deletion time of the table. Only set after the table is deleted.
   * @param deleteTime deleteTime or {@code null} for none
   */
  public Table setDeleteTime(String deleteTime) {
    this.deleteTime = deleteTime;
    return this;
  }

  /**
   * The checksum of a table object computed by the server based on the value of other fields. It
   * may be sent on update requests to ensure the client has an up-to-date value before proceeding.
   * It is only checked for update table operations.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * The checksum of a table object computed by the server based on the value of other fields. It
   * may be sent on update requests to ensure the client has an up-to-date value before proceeding.
   * It is only checked for update table operations.
   * @param etag etag or {@code null} for none
   */
  public Table setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Output only. The time when this table is considered expired. Only set after the table is
   * deleted.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * Output only. The time when this table is considered expired. Only set after the table is
   * deleted.
   * @param expireTime expireTime or {@code null} for none
   */
  public Table setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * Options of a Hive table.
   * @return value or {@code null} for none
   */
  public HiveTableOptions getHiveOptions() {
    return hiveOptions;
  }

  /**
   * Options of a Hive table.
   * @param hiveOptions hiveOptions or {@code null} for none
   */
  public Table setHiveOptions(HiveTableOptions hiveOptions) {
    this.hiveOptions = hiveOptions;
    return this;
  }

  /**
   * Output only. The resource name. Format: projects/{project_id_or_number}/locations/{location_id}
   * /catalogs/{catalog_id}/databases/{database_id}/tables/{table_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name. Format: projects/{project_id_or_number}/locations/{location_id}
   * /catalogs/{catalog_id}/databases/{database_id}/tables/{table_id}
   * @param name name or {@code null} for none
   */
  public Table setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The table type.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The table type.
   * @param type type or {@code null} for none
   */
  public Table setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Output only. The last modification time of the table.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last modification time of the table.
   * @param updateTime updateTime or {@code null} for none
   */
  public Table setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Table set(String fieldName, Object value) {
    return (Table) super.set(fieldName, value);
  }

  @Override
  public Table clone() {
    return (Table) super.clone();
  }

}
