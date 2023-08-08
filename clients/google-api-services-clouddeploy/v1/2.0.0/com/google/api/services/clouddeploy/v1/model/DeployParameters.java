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

package com.google.api.services.clouddeploy.v1.model;

/**
 * DeployParameters contains deploy parameters information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Deploy API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeployParameters extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Deploy parameters are applied to targets with match labels. If unspecified, deploy
   * parameters are applied to all targets (including child targets of a multi-target).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> matchTargetLabels;

  /**
   * Required. Values are deploy parameters in key-value pairs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> values;

  /**
   * Optional. Deploy parameters are applied to targets with match labels. If unspecified, deploy
   * parameters are applied to all targets (including child targets of a multi-target).
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMatchTargetLabels() {
    return matchTargetLabels;
  }

  /**
   * Optional. Deploy parameters are applied to targets with match labels. If unspecified, deploy
   * parameters are applied to all targets (including child targets of a multi-target).
   * @param matchTargetLabels matchTargetLabels or {@code null} for none
   */
  public DeployParameters setMatchTargetLabels(java.util.Map<String, java.lang.String> matchTargetLabels) {
    this.matchTargetLabels = matchTargetLabels;
    return this;
  }

  /**
   * Required. Values are deploy parameters in key-value pairs.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getValues() {
    return values;
  }

  /**
   * Required. Values are deploy parameters in key-value pairs.
   * @param values values or {@code null} for none
   */
  public DeployParameters setValues(java.util.Map<String, java.lang.String> values) {
    this.values = values;
    return this;
  }

  @Override
  public DeployParameters set(String fieldName, Object value) {
    return (DeployParameters) super.set(fieldName, value);
  }

  @Override
  public DeployParameters clone() {
    return (DeployParameters) super.clone();
  }

}