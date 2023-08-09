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
 * Response message for MetadataService.ListExecutions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1ListExecutionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The Executions retrieved from the MetadataStore.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1beta1Execution> executions;

  static {
    // hack to force ProGuard to consider GoogleCloudAiplatformV1beta1Execution used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudAiplatformV1beta1Execution.class);
  }

  /**
   * A token, which can be sent as ListExecutionsRequest.page_token to retrieve the next page. If
   * this field is not populated, there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The Executions retrieved from the MetadataStore.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1beta1Execution> getExecutions() {
    return executions;
  }

  /**
   * The Executions retrieved from the MetadataStore.
   * @param executions executions or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ListExecutionsResponse setExecutions(java.util.List<GoogleCloudAiplatformV1beta1Execution> executions) {
    this.executions = executions;
    return this;
  }

  /**
   * A token, which can be sent as ListExecutionsRequest.page_token to retrieve the next page. If
   * this field is not populated, there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token, which can be sent as ListExecutionsRequest.page_token to retrieve the next page. If
   * this field is not populated, there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ListExecutionsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1ListExecutionsResponse set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1ListExecutionsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1ListExecutionsResponse clone() {
    return (GoogleCloudAiplatformV1beta1ListExecutionsResponse) super.clone();
  }

}