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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * A runtime is a virtual machine allocated to a particular user for a particular Notebook file on
 * temporary basis with lifetime limited to 24 hours.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1NotebookRuntime extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Timestamp when this NotebookRuntime was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The description of the NotebookRuntime.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. The display name of the NotebookRuntime. The name can be up to 128 characters long
   * and can consist of any UTF-8 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. The health state of the NotebookRuntime.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String healthState;

  /**
   * Output only. The resource name of the NotebookRuntime.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The pointer to NotebookRuntimeTemplate this NotebookRuntime is created from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1NotebookRuntimeTemplateRef notebookRuntimeTemplateRef;

  /**
   * Output only. The proxy endpoint used to access the NotebookRuntime.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String proxyUri;

  /**
   * Output only. The runtime (instance) state of the NotebookRuntime.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String runtimeState;

  /**
   * Required. The user email of the NotebookRuntime.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String runtimeUser;

  /**
   * Output only. The service account that the NotebookRuntime workload runs as.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Output only. Timestamp when this NotebookRuntime was most recently updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Timestamp when this NotebookRuntime was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp when this NotebookRuntime was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1NotebookRuntime setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The description of the NotebookRuntime.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the NotebookRuntime.
   * @param description description or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1NotebookRuntime setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. The display name of the NotebookRuntime. The name can be up to 128 characters long
   * and can consist of any UTF-8 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The display name of the NotebookRuntime. The name can be up to 128 characters long
   * and can consist of any UTF-8 characters.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1NotebookRuntime setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. The health state of the NotebookRuntime.
   * @return value or {@code null} for none
   */
  public java.lang.String getHealthState() {
    return healthState;
  }

  /**
   * Output only. The health state of the NotebookRuntime.
   * @param healthState healthState or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1NotebookRuntime setHealthState(java.lang.String healthState) {
    this.healthState = healthState;
    return this;
  }

  /**
   * Output only. The resource name of the NotebookRuntime.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the NotebookRuntime.
   * @param name name or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1NotebookRuntime setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The pointer to NotebookRuntimeTemplate this NotebookRuntime is created from.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1NotebookRuntimeTemplateRef getNotebookRuntimeTemplateRef() {
    return notebookRuntimeTemplateRef;
  }

  /**
   * Output only. The pointer to NotebookRuntimeTemplate this NotebookRuntime is created from.
   * @param notebookRuntimeTemplateRef notebookRuntimeTemplateRef or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1NotebookRuntime setNotebookRuntimeTemplateRef(GoogleCloudAiplatformV1beta1NotebookRuntimeTemplateRef notebookRuntimeTemplateRef) {
    this.notebookRuntimeTemplateRef = notebookRuntimeTemplateRef;
    return this;
  }

  /**
   * Output only. The proxy endpoint used to access the NotebookRuntime.
   * @return value or {@code null} for none
   */
  public java.lang.String getProxyUri() {
    return proxyUri;
  }

  /**
   * Output only. The proxy endpoint used to access the NotebookRuntime.
   * @param proxyUri proxyUri or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1NotebookRuntime setProxyUri(java.lang.String proxyUri) {
    this.proxyUri = proxyUri;
    return this;
  }

  /**
   * Output only. The runtime (instance) state of the NotebookRuntime.
   * @return value or {@code null} for none
   */
  public java.lang.String getRuntimeState() {
    return runtimeState;
  }

  /**
   * Output only. The runtime (instance) state of the NotebookRuntime.
   * @param runtimeState runtimeState or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1NotebookRuntime setRuntimeState(java.lang.String runtimeState) {
    this.runtimeState = runtimeState;
    return this;
  }

  /**
   * Required. The user email of the NotebookRuntime.
   * @return value or {@code null} for none
   */
  public java.lang.String getRuntimeUser() {
    return runtimeUser;
  }

  /**
   * Required. The user email of the NotebookRuntime.
   * @param runtimeUser runtimeUser or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1NotebookRuntime setRuntimeUser(java.lang.String runtimeUser) {
    this.runtimeUser = runtimeUser;
    return this;
  }

  /**
   * Output only. The service account that the NotebookRuntime workload runs as.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Output only. The service account that the NotebookRuntime workload runs as.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1NotebookRuntime setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Output only. Timestamp when this NotebookRuntime was most recently updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Timestamp when this NotebookRuntime was most recently updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1NotebookRuntime setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1NotebookRuntime set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1NotebookRuntime) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1NotebookRuntime clone() {
    return (GoogleCloudAiplatformV1beta1NotebookRuntime) super.clone();
  }

}