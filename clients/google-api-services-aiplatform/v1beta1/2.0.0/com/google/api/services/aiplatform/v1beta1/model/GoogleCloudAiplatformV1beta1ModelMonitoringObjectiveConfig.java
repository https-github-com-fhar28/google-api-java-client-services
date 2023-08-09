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
 * The objective configuration for model monitoring, including the information needed to detect
 * anomalies for one particular model.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfig extends com.google.api.client.json.GenericJson {

  /**
   * The config for integrating with Vertex Explainable AI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfigExplanationConfig explanationConfig;

  /**
   * The config for drift of prediction data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfigPredictionDriftDetectionConfig predictionDriftDetectionConfig;

  /**
   * Training dataset for models. This field has to be set only if
   * TrainingPredictionSkewDetectionConfig is specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfigTrainingDataset trainingDataset;

  /**
   * The config for skew between training data and prediction data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfigTrainingPredictionSkewDetectionConfig trainingPredictionSkewDetectionConfig;

  /**
   * The config for integrating with Vertex Explainable AI.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfigExplanationConfig getExplanationConfig() {
    return explanationConfig;
  }

  /**
   * The config for integrating with Vertex Explainable AI.
   * @param explanationConfig explanationConfig or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfig setExplanationConfig(GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfigExplanationConfig explanationConfig) {
    this.explanationConfig = explanationConfig;
    return this;
  }

  /**
   * The config for drift of prediction data.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfigPredictionDriftDetectionConfig getPredictionDriftDetectionConfig() {
    return predictionDriftDetectionConfig;
  }

  /**
   * The config for drift of prediction data.
   * @param predictionDriftDetectionConfig predictionDriftDetectionConfig or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfig setPredictionDriftDetectionConfig(GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfigPredictionDriftDetectionConfig predictionDriftDetectionConfig) {
    this.predictionDriftDetectionConfig = predictionDriftDetectionConfig;
    return this;
  }

  /**
   * Training dataset for models. This field has to be set only if
   * TrainingPredictionSkewDetectionConfig is specified.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfigTrainingDataset getTrainingDataset() {
    return trainingDataset;
  }

  /**
   * Training dataset for models. This field has to be set only if
   * TrainingPredictionSkewDetectionConfig is specified.
   * @param trainingDataset trainingDataset or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfig setTrainingDataset(GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfigTrainingDataset trainingDataset) {
    this.trainingDataset = trainingDataset;
    return this;
  }

  /**
   * The config for skew between training data and prediction data.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfigTrainingPredictionSkewDetectionConfig getTrainingPredictionSkewDetectionConfig() {
    return trainingPredictionSkewDetectionConfig;
  }

  /**
   * The config for skew between training data and prediction data.
   * @param trainingPredictionSkewDetectionConfig trainingPredictionSkewDetectionConfig or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfig setTrainingPredictionSkewDetectionConfig(GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfigTrainingPredictionSkewDetectionConfig trainingPredictionSkewDetectionConfig) {
    this.trainingPredictionSkewDetectionConfig = trainingPredictionSkewDetectionConfig;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfig set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfig clone() {
    return (GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfig) super.clone();
  }

}