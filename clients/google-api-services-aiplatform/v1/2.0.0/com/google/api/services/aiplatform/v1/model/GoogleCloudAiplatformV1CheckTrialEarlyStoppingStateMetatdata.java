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
 * This message will be placed in the metadata field of a google.longrunning.Operation associated
 * with a CheckTrialEarlyStoppingState request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1CheckTrialEarlyStoppingStateMetatdata extends com.google.api.client.json.GenericJson {

  /**
   * Operation metadata for suggesting Trials.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1GenericOperationMetadata genericMetadata;

  /**
   * The name of the Study that the Trial belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String study;

  /**
   * The Trial name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trial;

  /**
   * Operation metadata for suggesting Trials.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1GenericOperationMetadata getGenericMetadata() {
    return genericMetadata;
  }

  /**
   * Operation metadata for suggesting Trials.
   * @param genericMetadata genericMetadata or {@code null} for none
   */
  public GoogleCloudAiplatformV1CheckTrialEarlyStoppingStateMetatdata setGenericMetadata(GoogleCloudAiplatformV1GenericOperationMetadata genericMetadata) {
    this.genericMetadata = genericMetadata;
    return this;
  }

  /**
   * The name of the Study that the Trial belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getStudy() {
    return study;
  }

  /**
   * The name of the Study that the Trial belongs to.
   * @param study study or {@code null} for none
   */
  public GoogleCloudAiplatformV1CheckTrialEarlyStoppingStateMetatdata setStudy(java.lang.String study) {
    this.study = study;
    return this;
  }

  /**
   * The Trial name.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrial() {
    return trial;
  }

  /**
   * The Trial name.
   * @param trial trial or {@code null} for none
   */
  public GoogleCloudAiplatformV1CheckTrialEarlyStoppingStateMetatdata setTrial(java.lang.String trial) {
    this.trial = trial;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1CheckTrialEarlyStoppingStateMetatdata set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1CheckTrialEarlyStoppingStateMetatdata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1CheckTrialEarlyStoppingStateMetatdata clone() {
    return (GoogleCloudAiplatformV1CheckTrialEarlyStoppingStateMetatdata) super.clone();
  }

}