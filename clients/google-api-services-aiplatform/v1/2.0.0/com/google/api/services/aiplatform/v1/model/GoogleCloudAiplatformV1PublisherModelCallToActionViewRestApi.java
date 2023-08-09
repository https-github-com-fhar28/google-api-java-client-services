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

package com.google.api.services.aiplatform.v1.model;

/**
 * Rest API docs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1PublisherModelCallToActionViewRestApi extends com.google.api.client.json.GenericJson {

  /**
   * Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1PublisherModelDocumentation> documentations;

  /**
   * Required. The title of the view rest API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Required.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1PublisherModelDocumentation> getDocumentations() {
    return documentations;
  }

  /**
   * Required.
   * @param documentations documentations or {@code null} for none
   */
  public GoogleCloudAiplatformV1PublisherModelCallToActionViewRestApi setDocumentations(java.util.List<GoogleCloudAiplatformV1PublisherModelDocumentation> documentations) {
    this.documentations = documentations;
    return this;
  }

  /**
   * Required. The title of the view rest API.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Required. The title of the view rest API.
   * @param title title or {@code null} for none
   */
  public GoogleCloudAiplatformV1PublisherModelCallToActionViewRestApi setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1PublisherModelCallToActionViewRestApi set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1PublisherModelCallToActionViewRestApi) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1PublisherModelCallToActionViewRestApi clone() {
    return (GoogleCloudAiplatformV1PublisherModelCallToActionViewRestApi) super.clone();
  }

}