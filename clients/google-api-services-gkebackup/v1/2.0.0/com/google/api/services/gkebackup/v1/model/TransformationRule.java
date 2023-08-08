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

package com.google.api.services.gkebackup.v1.model;

/**
 * A transformation rule to be applied against Kubernetes resources as they are selected for
 * restoration from a Backup. A rule contains both filtering logic (which resources are subject to
 * transform) and transformation logic.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Backup for GKE API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TransformationRule extends com.google.api.client.json.GenericJson {

  /**
   * The description is a user specified string description of the transformation rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. A list of transformation rule actions to take against candidate resources. Actions
   * are executed in order defined - this order matters, as they could potentially interfere with
   * each other and the first operation could affect the outcome of the second operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TransformationRuleAction> fieldActions;

  /**
   * This field is used to specify a set of fields that should be used to determine which resources
   * in backup should be acted upon by the supplied transformation rule actions, and this will
   * ensure that only specific resources are affected by transformation rule actions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourceFilter resourceFilter;

  /**
   * The description is a user specified string description of the transformation rule.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description is a user specified string description of the transformation rule.
   * @param description description or {@code null} for none
   */
  public TransformationRule setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. A list of transformation rule actions to take against candidate resources. Actions
   * are executed in order defined - this order matters, as they could potentially interfere with
   * each other and the first operation could affect the outcome of the second operation.
   * @return value or {@code null} for none
   */
  public java.util.List<TransformationRuleAction> getFieldActions() {
    return fieldActions;
  }

  /**
   * Required. A list of transformation rule actions to take against candidate resources. Actions
   * are executed in order defined - this order matters, as they could potentially interfere with
   * each other and the first operation could affect the outcome of the second operation.
   * @param fieldActions fieldActions or {@code null} for none
   */
  public TransformationRule setFieldActions(java.util.List<TransformationRuleAction> fieldActions) {
    this.fieldActions = fieldActions;
    return this;
  }

  /**
   * This field is used to specify a set of fields that should be used to determine which resources
   * in backup should be acted upon by the supplied transformation rule actions, and this will
   * ensure that only specific resources are affected by transformation rule actions.
   * @return value or {@code null} for none
   */
  public ResourceFilter getResourceFilter() {
    return resourceFilter;
  }

  /**
   * This field is used to specify a set of fields that should be used to determine which resources
   * in backup should be acted upon by the supplied transformation rule actions, and this will
   * ensure that only specific resources are affected by transformation rule actions.
   * @param resourceFilter resourceFilter or {@code null} for none
   */
  public TransformationRule setResourceFilter(ResourceFilter resourceFilter) {
    this.resourceFilter = resourceFilter;
    return this;
  }

  @Override
  public TransformationRule set(String fieldName, Object value) {
    return (TransformationRule) super.set(fieldName, value);
  }

  @Override
  public TransformationRule clone() {
    return (TransformationRule) super.clone();
  }

}