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
 * Represents a NasTrial details along with its parameters. If there is a corresponding train
 * NasTrial, the train NasTrial is also returned.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1NasTrialDetail extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Resource name of the NasTrialDetail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The parameters for the NasJob NasTrial.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parameters;

  /**
   * The requested search NasTrial.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1NasTrial searchTrial;

  /**
   * The train NasTrial corresponding to search_trial. Only populated if search_trial is used for
   * training.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1NasTrial trainTrial;

  /**
   * Output only. Resource name of the NasTrialDetail.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the NasTrialDetail.
   * @param name name or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1NasTrialDetail setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The parameters for the NasJob NasTrial.
   * @return value or {@code null} for none
   */
  public java.lang.String getParameters() {
    return parameters;
  }

  /**
   * The parameters for the NasJob NasTrial.
   * @param parameters parameters or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1NasTrialDetail setParameters(java.lang.String parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * The requested search NasTrial.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1NasTrial getSearchTrial() {
    return searchTrial;
  }

  /**
   * The requested search NasTrial.
   * @param searchTrial searchTrial or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1NasTrialDetail setSearchTrial(GoogleCloudAiplatformV1beta1NasTrial searchTrial) {
    this.searchTrial = searchTrial;
    return this;
  }

  /**
   * The train NasTrial corresponding to search_trial. Only populated if search_trial is used for
   * training.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1NasTrial getTrainTrial() {
    return trainTrial;
  }

  /**
   * The train NasTrial corresponding to search_trial. Only populated if search_trial is used for
   * training.
   * @param trainTrial trainTrial or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1NasTrialDetail setTrainTrial(GoogleCloudAiplatformV1beta1NasTrial trainTrial) {
    this.trainTrial = trainTrial;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1NasTrialDetail set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1NasTrialDetail) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1NasTrialDetail clone() {
    return (GoogleCloudAiplatformV1beta1NasTrialDetail) super.clone();
  }

}