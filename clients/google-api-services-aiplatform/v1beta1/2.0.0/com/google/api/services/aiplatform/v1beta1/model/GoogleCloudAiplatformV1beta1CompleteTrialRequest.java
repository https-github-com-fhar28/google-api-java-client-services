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
 * Request message for VizierService.CompleteTrial.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1CompleteTrialRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. If provided, it will be used as the completed Trial's final_measurement; Otherwise,
   * the service will auto-select a previously reported measurement as the final-measurement
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1Measurement finalMeasurement;

  /**
   * Optional. A human readable reason why the trial was infeasible. This should only be provided if
   * `trial_infeasible` is true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String infeasibleReason;

  /**
   * Optional. True if the Trial cannot be run with the given Parameter, and final_measurement will
   * be ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean trialInfeasible;

  /**
   * Optional. If provided, it will be used as the completed Trial's final_measurement; Otherwise,
   * the service will auto-select a previously reported measurement as the final-measurement
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1Measurement getFinalMeasurement() {
    return finalMeasurement;
  }

  /**
   * Optional. If provided, it will be used as the completed Trial's final_measurement; Otherwise,
   * the service will auto-select a previously reported measurement as the final-measurement
   * @param finalMeasurement finalMeasurement or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1CompleteTrialRequest setFinalMeasurement(GoogleCloudAiplatformV1beta1Measurement finalMeasurement) {
    this.finalMeasurement = finalMeasurement;
    return this;
  }

  /**
   * Optional. A human readable reason why the trial was infeasible. This should only be provided if
   * `trial_infeasible` is true.
   * @return value or {@code null} for none
   */
  public java.lang.String getInfeasibleReason() {
    return infeasibleReason;
  }

  /**
   * Optional. A human readable reason why the trial was infeasible. This should only be provided if
   * `trial_infeasible` is true.
   * @param infeasibleReason infeasibleReason or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1CompleteTrialRequest setInfeasibleReason(java.lang.String infeasibleReason) {
    this.infeasibleReason = infeasibleReason;
    return this;
  }

  /**
   * Optional. True if the Trial cannot be run with the given Parameter, and final_measurement will
   * be ignored.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTrialInfeasible() {
    return trialInfeasible;
  }

  /**
   * Optional. True if the Trial cannot be run with the given Parameter, and final_measurement will
   * be ignored.
   * @param trialInfeasible trialInfeasible or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1CompleteTrialRequest setTrialInfeasible(java.lang.Boolean trialInfeasible) {
    this.trialInfeasible = trialInfeasible;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1CompleteTrialRequest set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1CompleteTrialRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1CompleteTrialRequest clone() {
    return (GoogleCloudAiplatformV1beta1CompleteTrialRequest) super.clone();
  }

}