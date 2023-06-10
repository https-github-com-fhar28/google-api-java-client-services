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
 * Representation of geometry. Geometries vary both in type and in level-of-detail, enabling
 * representation of any shape at any level of granularity.
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
public final class GeostoreCityJsonProtoCityObjectGeometry extends com.google.api.client.json.GenericJson {

  /**
   * Level-of-detail (LoD) indicates how intricate the geometric representation is. May be a single
   * digit per CityGML standards or X.Y per TU Delft (visual depiction at
   * https://3d.bk.tudelft.nl/lod/). `CityObject`s may have multiple geometries with the same LoD.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lod;

  /**
   * For geometries consisting of a single point, line, or loop.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreCityJsonProtoCityObjectGeometryMultiPoint multipoint;

  /**
   * For geometries consisting of a collection of surfaces.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreCityJsonProtoCityObjectGeometryMultiSurface multisurface;

  /**
   * For geometries consisting of a watertight 3D shape.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreCityJsonProtoCityObjectGeometrySolid solid;

  /**
   * Level-of-detail (LoD) indicates how intricate the geometric representation is. May be a single
   * digit per CityGML standards or X.Y per TU Delft (visual depiction at
   * https://3d.bk.tudelft.nl/lod/). `CityObject`s may have multiple geometries with the same LoD.
   * @return value or {@code null} for none
   */
  public java.lang.String getLod() {
    return lod;
  }

  /**
   * Level-of-detail (LoD) indicates how intricate the geometric representation is. May be a single
   * digit per CityGML standards or X.Y per TU Delft (visual depiction at
   * https://3d.bk.tudelft.nl/lod/). `CityObject`s may have multiple geometries with the same LoD.
   * @param lod lod or {@code null} for none
   */
  public GeostoreCityJsonProtoCityObjectGeometry setLod(java.lang.String lod) {
    this.lod = lod;
    return this;
  }

  /**
   * For geometries consisting of a single point, line, or loop.
   * @return value or {@code null} for none
   */
  public GeostoreCityJsonProtoCityObjectGeometryMultiPoint getMultipoint() {
    return multipoint;
  }

  /**
   * For geometries consisting of a single point, line, or loop.
   * @param multipoint multipoint or {@code null} for none
   */
  public GeostoreCityJsonProtoCityObjectGeometry setMultipoint(GeostoreCityJsonProtoCityObjectGeometryMultiPoint multipoint) {
    this.multipoint = multipoint;
    return this;
  }

  /**
   * For geometries consisting of a collection of surfaces.
   * @return value or {@code null} for none
   */
  public GeostoreCityJsonProtoCityObjectGeometryMultiSurface getMultisurface() {
    return multisurface;
  }

  /**
   * For geometries consisting of a collection of surfaces.
   * @param multisurface multisurface or {@code null} for none
   */
  public GeostoreCityJsonProtoCityObjectGeometry setMultisurface(GeostoreCityJsonProtoCityObjectGeometryMultiSurface multisurface) {
    this.multisurface = multisurface;
    return this;
  }

  /**
   * For geometries consisting of a watertight 3D shape.
   * @return value or {@code null} for none
   */
  public GeostoreCityJsonProtoCityObjectGeometrySolid getSolid() {
    return solid;
  }

  /**
   * For geometries consisting of a watertight 3D shape.
   * @param solid solid or {@code null} for none
   */
  public GeostoreCityJsonProtoCityObjectGeometry setSolid(GeostoreCityJsonProtoCityObjectGeometrySolid solid) {
    this.solid = solid;
    return this;
  }

  @Override
  public GeostoreCityJsonProtoCityObjectGeometry set(String fieldName, Object value) {
    return (GeostoreCityJsonProtoCityObjectGeometry) super.set(fieldName, value);
  }

  @Override
  public GeostoreCityJsonProtoCityObjectGeometry clone() {
    return (GeostoreCityJsonProtoCityObjectGeometry) super.clone();
  }

}