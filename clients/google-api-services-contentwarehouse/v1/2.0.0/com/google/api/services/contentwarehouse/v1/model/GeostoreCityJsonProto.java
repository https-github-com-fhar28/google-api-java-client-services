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

package com.google.api.services.contentwarehouse.v1.model;

/**
 * CityJsonProto is a custom proto representation of the portion of the CityJSON spec
 * (https://www.cityjson.org/) relevant to internal projects. See go/cityjsonproto-design for more
 * information about the modeling and design decisions implemented here.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Document AI Warehouse API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostoreCityJsonProto extends com.google.api.client.json.GenericJson {

  /**
   * City objects associated with this CityJsonProto.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GeostoreCityJsonProtoCityObject> cityObjects;

  /**
   * Spec for converting vertices from a local coordinate system in arbitrary units to ECEF
   * coordinates in meters (https://en.wikipedia.org/wiki/Earth-centered,_Earth-
   * fixed_coordinate_system).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreCityJsonProtoTransform transform;

  /**
   * Vertices as local coordinates represented as a flattened list: [x1,y1,z1,x2,y2,z2,x3,y3,z3].
   * Vertices are relative to a local coordinate system and rounded to their nearest integer value.
   * See `transform` for how vertices can be transformed from a local coordinate system into an
   * Earth-centered, Earth-fixed coordinate system. Vertices are flattened for space efficiency,
   * memory locality, and processing performance. To access the x,y,z coordinates of vertex N, read
   * the values at indices 3N, 3N+1, and 3N+2.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> vertexXyz;

  /**
   * City objects associated with this CityJsonProto.
   * @return value or {@code null} for none
   */
  public java.util.List<GeostoreCityJsonProtoCityObject> getCityObjects() {
    return cityObjects;
  }

  /**
   * City objects associated with this CityJsonProto.
   * @param cityObjects cityObjects or {@code null} for none
   */
  public GeostoreCityJsonProto setCityObjects(java.util.List<GeostoreCityJsonProtoCityObject> cityObjects) {
    this.cityObjects = cityObjects;
    return this;
  }

  /**
   * Spec for converting vertices from a local coordinate system in arbitrary units to ECEF
   * coordinates in meters (https://en.wikipedia.org/wiki/Earth-centered,_Earth-
   * fixed_coordinate_system).
   * @return value or {@code null} for none
   */
  public GeostoreCityJsonProtoTransform getTransform() {
    return transform;
  }

  /**
   * Spec for converting vertices from a local coordinate system in arbitrary units to ECEF
   * coordinates in meters (https://en.wikipedia.org/wiki/Earth-centered,_Earth-
   * fixed_coordinate_system).
   * @param transform transform or {@code null} for none
   */
  public GeostoreCityJsonProto setTransform(GeostoreCityJsonProtoTransform transform) {
    this.transform = transform;
    return this;
  }

  /**
   * Vertices as local coordinates represented as a flattened list: [x1,y1,z1,x2,y2,z2,x3,y3,z3].
   * Vertices are relative to a local coordinate system and rounded to their nearest integer value.
   * See `transform` for how vertices can be transformed from a local coordinate system into an
   * Earth-centered, Earth-fixed coordinate system. Vertices are flattened for space efficiency,
   * memory locality, and processing performance. To access the x,y,z coordinates of vertex N, read
   * the values at indices 3N, 3N+1, and 3N+2.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getVertexXyz() {
    return vertexXyz;
  }

  /**
   * Vertices as local coordinates represented as a flattened list: [x1,y1,z1,x2,y2,z2,x3,y3,z3].
   * Vertices are relative to a local coordinate system and rounded to their nearest integer value.
   * See `transform` for how vertices can be transformed from a local coordinate system into an
   * Earth-centered, Earth-fixed coordinate system. Vertices are flattened for space efficiency,
   * memory locality, and processing performance. To access the x,y,z coordinates of vertex N, read
   * the values at indices 3N, 3N+1, and 3N+2.
   * @param vertexXyz vertexXyz or {@code null} for none
   */
  public GeostoreCityJsonProto setVertexXyz(java.util.List<java.lang.Integer> vertexXyz) {
    this.vertexXyz = vertexXyz;
    return this;
  }

  @Override
  public GeostoreCityJsonProto set(String fieldName, Object value) {
    return (GeostoreCityJsonProto) super.set(fieldName, value);
  }

  @Override
  public GeostoreCityJsonProto clone() {
    return (GeostoreCityJsonProto) super.clone();
  }

}