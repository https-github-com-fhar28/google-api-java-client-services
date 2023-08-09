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
 * Request message for FeaturestoreService.BatchCreateFeatures.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1BatchCreateFeaturesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The request message specifying the Features to create. All Features must be created
   * under the same parent EntityType. The `parent` field in each child request message can be
   * omitted. If `parent` is set in a child request, then the value must match the `parent` value in
   * this request message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1beta1CreateFeatureRequest> requests;

  /**
   * Required. The request message specifying the Features to create. All Features must be created
   * under the same parent EntityType. The `parent` field in each child request message can be
   * omitted. If `parent` is set in a child request, then the value must match the `parent` value in
   * this request message.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1beta1CreateFeatureRequest> getRequests() {
    return requests;
  }

  /**
   * Required. The request message specifying the Features to create. All Features must be created
   * under the same parent EntityType. The `parent` field in each child request message can be
   * omitted. If `parent` is set in a child request, then the value must match the `parent` value in
   * this request message.
   * @param requests requests or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1BatchCreateFeaturesRequest setRequests(java.util.List<GoogleCloudAiplatformV1beta1CreateFeatureRequest> requests) {
    this.requests = requests;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1BatchCreateFeaturesRequest set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1BatchCreateFeaturesRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1BatchCreateFeaturesRequest clone() {
    return (GoogleCloudAiplatformV1beta1BatchCreateFeaturesRequest) super.clone();
  }

}