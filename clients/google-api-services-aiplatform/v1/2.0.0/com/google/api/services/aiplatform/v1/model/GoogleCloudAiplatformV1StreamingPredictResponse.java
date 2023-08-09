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
 * Response message for PredictionService.StreamingPredict.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1StreamingPredictResponse extends com.google.api.client.json.GenericJson {

  /**
   * The prediction output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1Tensor> outputs;

  /**
   * The parameters that govern the prediction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1Tensor parameters;

  /**
   * The prediction output.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1Tensor> getOutputs() {
    return outputs;
  }

  /**
   * The prediction output.
   * @param outputs outputs or {@code null} for none
   */
  public GoogleCloudAiplatformV1StreamingPredictResponse setOutputs(java.util.List<GoogleCloudAiplatformV1Tensor> outputs) {
    this.outputs = outputs;
    return this;
  }

  /**
   * The parameters that govern the prediction.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1Tensor getParameters() {
    return parameters;
  }

  /**
   * The parameters that govern the prediction.
   * @param parameters parameters or {@code null} for none
   */
  public GoogleCloudAiplatformV1StreamingPredictResponse setParameters(GoogleCloudAiplatformV1Tensor parameters) {
    this.parameters = parameters;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1StreamingPredictResponse set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1StreamingPredictResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1StreamingPredictResponse clone() {
    return (GoogleCloudAiplatformV1StreamingPredictResponse) super.clone();
  }

}