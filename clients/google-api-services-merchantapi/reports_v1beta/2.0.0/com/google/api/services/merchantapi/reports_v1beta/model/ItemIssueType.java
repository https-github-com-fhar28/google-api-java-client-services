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

package com.google.api.services.merchantapi.reports_v1beta.model;

/**
 * Issue type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ItemIssueType extends com.google.api.client.json.GenericJson {

  /**
   * Canonical attribute name for attribute-specific issues.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String canonicalAttribute;

  /**
   * Error code of the issue, equivalent to the `code` of [Product
   * issues](https://developers.google.com/shopping-content/guides/product-issues).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * Canonical attribute name for attribute-specific issues.
   * @return value or {@code null} for none
   */
  public java.lang.String getCanonicalAttribute() {
    return canonicalAttribute;
  }

  /**
   * Canonical attribute name for attribute-specific issues.
   * @param canonicalAttribute canonicalAttribute or {@code null} for none
   */
  public ItemIssueType setCanonicalAttribute(java.lang.String canonicalAttribute) {
    this.canonicalAttribute = canonicalAttribute;
    return this;
  }

  /**
   * Error code of the issue, equivalent to the `code` of [Product
   * issues](https://developers.google.com/shopping-content/guides/product-issues).
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * Error code of the issue, equivalent to the `code` of [Product
   * issues](https://developers.google.com/shopping-content/guides/product-issues).
   * @param code code or {@code null} for none
   */
  public ItemIssueType setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  @Override
  public ItemIssueType set(String fieldName, Object value) {
    return (ItemIssueType) super.set(fieldName, value);
  }

  @Override
  public ItemIssueType clone() {
    return (ItemIssueType) super.clone();
  }

}
