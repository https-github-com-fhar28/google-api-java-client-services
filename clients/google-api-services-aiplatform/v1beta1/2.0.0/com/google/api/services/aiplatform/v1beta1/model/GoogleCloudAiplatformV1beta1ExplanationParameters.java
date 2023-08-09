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
 * Parameters to configure explaining for Model's predictions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1ExplanationParameters extends com.google.api.client.json.GenericJson {

  /**
   * Example-based explanations that returns the nearest neighbors from the provided dataset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1Examples examples;

  /**
   * An attribution method that computes Aumann-Shapley values taking advantage of the model's fully
   * differentiable structure. Refer to this paper for more details:
   * https://arxiv.org/abs/1703.01365
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1IntegratedGradientsAttribution integratedGradientsAttribution;

  /**
   * If populated, only returns attributions that have output_index contained in output_indices. It
   * must be an ndarray of integers, with the same shape of the output it's explaining. If not
   * populated, returns attributions for top_k indices of outputs. If neither top_k nor
   * output_indices is populated, returns the argmax index of the outputs. Only applicable to Models
   * that predict multiple outputs (e,g, multi-class Models that predict multiple classes).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Object> outputIndices;

  /**
   * An attribution method that approximates Shapley values for features that contribute to the
   * label being predicted. A sampling strategy is used to approximate the value rather than
   * considering all subsets of features. Refer to this paper for model details:
   * https://arxiv.org/abs/1306.4265.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1SampledShapleyAttribution sampledShapleyAttribution;

  /**
   * If populated, returns attributions for top K indices of outputs (defaults to 1). Only applies
   * to Models that predicts more than one outputs (e,g, multi-class Models). When set to -1,
   * returns explanations for all outputs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer topK;

  /**
   * An attribution method that redistributes Integrated Gradients attribution to segmented regions,
   * taking advantage of the model's fully differentiable structure. Refer to this paper for more
   * details: https://arxiv.org/abs/1906.02825 XRAI currently performs better on natural images,
   * like a picture of a house or an animal. If the images are taken in artificial environments,
   * like a lab or manufacturing line, or from diagnostic equipment, like x-rays or quality-control
   * cameras, use Integrated Gradients instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1XraiAttribution xraiAttribution;

  /**
   * Example-based explanations that returns the nearest neighbors from the provided dataset.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1Examples getExamples() {
    return examples;
  }

  /**
   * Example-based explanations that returns the nearest neighbors from the provided dataset.
   * @param examples examples or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ExplanationParameters setExamples(GoogleCloudAiplatformV1beta1Examples examples) {
    this.examples = examples;
    return this;
  }

  /**
   * An attribution method that computes Aumann-Shapley values taking advantage of the model's fully
   * differentiable structure. Refer to this paper for more details:
   * https://arxiv.org/abs/1703.01365
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1IntegratedGradientsAttribution getIntegratedGradientsAttribution() {
    return integratedGradientsAttribution;
  }

  /**
   * An attribution method that computes Aumann-Shapley values taking advantage of the model's fully
   * differentiable structure. Refer to this paper for more details:
   * https://arxiv.org/abs/1703.01365
   * @param integratedGradientsAttribution integratedGradientsAttribution or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ExplanationParameters setIntegratedGradientsAttribution(GoogleCloudAiplatformV1beta1IntegratedGradientsAttribution integratedGradientsAttribution) {
    this.integratedGradientsAttribution = integratedGradientsAttribution;
    return this;
  }

  /**
   * If populated, only returns attributions that have output_index contained in output_indices. It
   * must be an ndarray of integers, with the same shape of the output it's explaining. If not
   * populated, returns attributions for top_k indices of outputs. If neither top_k nor
   * output_indices is populated, returns the argmax index of the outputs. Only applicable to Models
   * that predict multiple outputs (e,g, multi-class Models that predict multiple classes).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Object> getOutputIndices() {
    return outputIndices;
  }

  /**
   * If populated, only returns attributions that have output_index contained in output_indices. It
   * must be an ndarray of integers, with the same shape of the output it's explaining. If not
   * populated, returns attributions for top_k indices of outputs. If neither top_k nor
   * output_indices is populated, returns the argmax index of the outputs. Only applicable to Models
   * that predict multiple outputs (e,g, multi-class Models that predict multiple classes).
   * @param outputIndices outputIndices or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ExplanationParameters setOutputIndices(java.util.List<java.lang.Object> outputIndices) {
    this.outputIndices = outputIndices;
    return this;
  }

  /**
   * An attribution method that approximates Shapley values for features that contribute to the
   * label being predicted. A sampling strategy is used to approximate the value rather than
   * considering all subsets of features. Refer to this paper for model details:
   * https://arxiv.org/abs/1306.4265.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SampledShapleyAttribution getSampledShapleyAttribution() {
    return sampledShapleyAttribution;
  }

  /**
   * An attribution method that approximates Shapley values for features that contribute to the
   * label being predicted. A sampling strategy is used to approximate the value rather than
   * considering all subsets of features. Refer to this paper for model details:
   * https://arxiv.org/abs/1306.4265.
   * @param sampledShapleyAttribution sampledShapleyAttribution or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ExplanationParameters setSampledShapleyAttribution(GoogleCloudAiplatformV1beta1SampledShapleyAttribution sampledShapleyAttribution) {
    this.sampledShapleyAttribution = sampledShapleyAttribution;
    return this;
  }

  /**
   * If populated, returns attributions for top K indices of outputs (defaults to 1). Only applies
   * to Models that predicts more than one outputs (e,g, multi-class Models). When set to -1,
   * returns explanations for all outputs.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTopK() {
    return topK;
  }

  /**
   * If populated, returns attributions for top K indices of outputs (defaults to 1). Only applies
   * to Models that predicts more than one outputs (e,g, multi-class Models). When set to -1,
   * returns explanations for all outputs.
   * @param topK topK or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ExplanationParameters setTopK(java.lang.Integer topK) {
    this.topK = topK;
    return this;
  }

  /**
   * An attribution method that redistributes Integrated Gradients attribution to segmented regions,
   * taking advantage of the model's fully differentiable structure. Refer to this paper for more
   * details: https://arxiv.org/abs/1906.02825 XRAI currently performs better on natural images,
   * like a picture of a house or an animal. If the images are taken in artificial environments,
   * like a lab or manufacturing line, or from diagnostic equipment, like x-rays or quality-control
   * cameras, use Integrated Gradients instead.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1XraiAttribution getXraiAttribution() {
    return xraiAttribution;
  }

  /**
   * An attribution method that redistributes Integrated Gradients attribution to segmented regions,
   * taking advantage of the model's fully differentiable structure. Refer to this paper for more
   * details: https://arxiv.org/abs/1906.02825 XRAI currently performs better on natural images,
   * like a picture of a house or an animal. If the images are taken in artificial environments,
   * like a lab or manufacturing line, or from diagnostic equipment, like x-rays or quality-control
   * cameras, use Integrated Gradients instead.
   * @param xraiAttribution xraiAttribution or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ExplanationParameters setXraiAttribution(GoogleCloudAiplatformV1beta1XraiAttribution xraiAttribution) {
    this.xraiAttribution = xraiAttribution;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1ExplanationParameters set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1ExplanationParameters) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1ExplanationParameters clone() {
    return (GoogleCloudAiplatformV1beta1ExplanationParameters) super.clone();
  }

}