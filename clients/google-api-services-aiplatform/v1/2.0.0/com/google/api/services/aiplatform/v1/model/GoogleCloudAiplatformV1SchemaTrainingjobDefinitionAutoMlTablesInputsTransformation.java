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
 * Model definition for
 * GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationAutoTransformation auto;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationCategoricalTransformation categorical;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationNumericTransformation numeric;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationCategoricalArrayTransformation repeatedCategorical;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationNumericArrayTransformation repeatedNumeric;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationTextArrayTransformation repeatedText;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationTextTransformation text;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationTimestampTransformation timestamp;

  /**
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationAutoTransformation getAuto() {
    return auto;
  }

  /**
   * @param auto auto or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation setAuto(GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationAutoTransformation auto) {
    this.auto = auto;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationCategoricalTransformation getCategorical() {
    return categorical;
  }

  /**
   * @param categorical categorical or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation setCategorical(GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationCategoricalTransformation categorical) {
    this.categorical = categorical;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationNumericTransformation getNumeric() {
    return numeric;
  }

  /**
   * @param numeric numeric or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation setNumeric(GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationNumericTransformation numeric) {
    this.numeric = numeric;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationCategoricalArrayTransformation getRepeatedCategorical() {
    return repeatedCategorical;
  }

  /**
   * @param repeatedCategorical repeatedCategorical or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation setRepeatedCategorical(GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationCategoricalArrayTransformation repeatedCategorical) {
    this.repeatedCategorical = repeatedCategorical;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationNumericArrayTransformation getRepeatedNumeric() {
    return repeatedNumeric;
  }

  /**
   * @param repeatedNumeric repeatedNumeric or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation setRepeatedNumeric(GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationNumericArrayTransformation repeatedNumeric) {
    this.repeatedNumeric = repeatedNumeric;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationTextArrayTransformation getRepeatedText() {
    return repeatedText;
  }

  /**
   * @param repeatedText repeatedText or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation setRepeatedText(GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationTextArrayTransformation repeatedText) {
    this.repeatedText = repeatedText;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationTextTransformation getText() {
    return text;
  }

  /**
   * @param text text or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation setText(GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationTextTransformation text) {
    this.text = text;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationTimestampTransformation getTimestamp() {
    return timestamp;
  }

  /**
   * @param timestamp timestamp or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation setTimestamp(GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformationTimestampTransformation timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation clone() {
    return (GoogleCloudAiplatformV1SchemaTrainingjobDefinitionAutoMlTablesInputsTransformation) super.clone();
  }

}