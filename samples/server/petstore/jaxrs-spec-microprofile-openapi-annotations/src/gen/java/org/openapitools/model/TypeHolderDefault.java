package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@org.eclipse.microprofile.openapi.annotations.media.Schema(description="")
@JsonTypeName("TypeHolderDefault")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class TypeHolderDefault  implements Serializable {
  private String stringItem = "what";
  private BigDecimal numberItem;
  private Integer integerItem;
  private Boolean boolItem = true;
  private @Valid List<Integer> arrayItem = new ArrayList<>();

  protected TypeHolderDefault(TypeHolderDefaultBuilder<?, ?> b) {
    this.stringItem = b.stringItem;
    this.numberItem = b.numberItem;
    this.integerItem = b.integerItem;
    this.boolItem = b.boolItem;
    this.arrayItem = b.arrayItem;
  }

  public TypeHolderDefault() {
  }

  @JsonCreator
  public TypeHolderDefault(
    @JsonProperty(required = true, value = "string_item") String stringItem,
    @JsonProperty(required = true, value = "number_item") BigDecimal numberItem,
    @JsonProperty(required = true, value = "integer_item") Integer integerItem,
    @JsonProperty(required = true, value = "bool_item") Boolean boolItem,
    @JsonProperty(required = true, value = "array_item") List<Integer> arrayItem
  ) {
    this.stringItem = stringItem;
    this.numberItem = numberItem;
    this.integerItem = integerItem;
    this.boolItem = boolItem;
    this.arrayItem = arrayItem;
  }

  /**
   **/
  public TypeHolderDefault stringItem(String stringItem) {
    this.stringItem = stringItem;
    return this;
  }

  
  @org.eclipse.microprofile.openapi.annotations.media.Schema(required = true, description = "")
  @JsonProperty(required = true, value = "string_item")
  @NotNull public String getStringItem() {
    return stringItem;
  }

  @JsonProperty(required = true, value = "string_item")
  public void setStringItem(String stringItem) {
    this.stringItem = stringItem;
  }

  /**
   **/
  public TypeHolderDefault numberItem(BigDecimal numberItem) {
    this.numberItem = numberItem;
    return this;
  }

  
  @org.eclipse.microprofile.openapi.annotations.media.Schema(required = true, description = "")
  @JsonProperty(required = true, value = "number_item")
  @NotNull @Valid public BigDecimal getNumberItem() {
    return numberItem;
  }

  @JsonProperty(required = true, value = "number_item")
  public void setNumberItem(BigDecimal numberItem) {
    this.numberItem = numberItem;
  }

  /**
   **/
  public TypeHolderDefault integerItem(Integer integerItem) {
    this.integerItem = integerItem;
    return this;
  }

  
  @org.eclipse.microprofile.openapi.annotations.media.Schema(required = true, description = "")
  @JsonProperty(required = true, value = "integer_item")
  @NotNull public Integer getIntegerItem() {
    return integerItem;
  }

  @JsonProperty(required = true, value = "integer_item")
  public void setIntegerItem(Integer integerItem) {
    this.integerItem = integerItem;
  }

  /**
   **/
  public TypeHolderDefault boolItem(Boolean boolItem) {
    this.boolItem = boolItem;
    return this;
  }

  
  @org.eclipse.microprofile.openapi.annotations.media.Schema(required = true, description = "")
  @JsonProperty(required = true, value = "bool_item")
  @NotNull public Boolean getBoolItem() {
    return boolItem;
  }

  @JsonProperty(required = true, value = "bool_item")
  public void setBoolItem(Boolean boolItem) {
    this.boolItem = boolItem;
  }

  /**
   **/
  public TypeHolderDefault arrayItem(List<Integer> arrayItem) {
    this.arrayItem = arrayItem;
    return this;
  }

  
  @org.eclipse.microprofile.openapi.annotations.media.Schema(required = true, description = "")
  @JsonProperty(required = true, value = "array_item")
  @NotNull public List<Integer> getArrayItem() {
    return arrayItem;
  }

  @JsonProperty(required = true, value = "array_item")
  public void setArrayItem(List<Integer> arrayItem) {
    this.arrayItem = arrayItem;
  }

  public TypeHolderDefault addArrayItemItem(Integer arrayItemItem) {
    if (this.arrayItem == null) {
      this.arrayItem = new ArrayList<>();
    }

    this.arrayItem.add(arrayItemItem);
    return this;
  }

  public TypeHolderDefault removeArrayItemItem(Integer arrayItemItem) {
    if (arrayItemItem != null && this.arrayItem != null) {
      this.arrayItem.remove(arrayItemItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeHolderDefault typeHolderDefault = (TypeHolderDefault) o;
    return Objects.equals(this.stringItem, typeHolderDefault.stringItem) &&
        Objects.equals(this.numberItem, typeHolderDefault.numberItem) &&
        Objects.equals(this.integerItem, typeHolderDefault.integerItem) &&
        Objects.equals(this.boolItem, typeHolderDefault.boolItem) &&
        Objects.equals(this.arrayItem, typeHolderDefault.arrayItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringItem, numberItem, integerItem, boolItem, arrayItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeHolderDefault {\n");
    
    sb.append("    stringItem: ").append(toIndentedString(stringItem)).append("\n");
    sb.append("    numberItem: ").append(toIndentedString(numberItem)).append("\n");
    sb.append("    integerItem: ").append(toIndentedString(integerItem)).append("\n");
    sb.append("    boolItem: ").append(toIndentedString(boolItem)).append("\n");
    sb.append("    arrayItem: ").append(toIndentedString(arrayItem)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static TypeHolderDefaultBuilder<?, ?> builder() {
    return new TypeHolderDefaultBuilderImpl();
  }

  private static final class TypeHolderDefaultBuilderImpl extends TypeHolderDefaultBuilder<TypeHolderDefault, TypeHolderDefaultBuilderImpl> {

    @Override
    protected TypeHolderDefaultBuilderImpl self() {
      return this;
    }

    @Override
    public TypeHolderDefault build() {
      return new TypeHolderDefault(this);
    }
  }

  public static abstract class TypeHolderDefaultBuilder<C extends TypeHolderDefault, B extends TypeHolderDefaultBuilder<C, B>>  {
    private String stringItem = "what";
    private BigDecimal numberItem;
    private Integer integerItem;
    private Boolean boolItem = true;
    private List<Integer> arrayItem = new ArrayList<>();
    protected abstract B self();

    public abstract C build();

    public B stringItem(String stringItem) {
      this.stringItem = stringItem;
      return self();
    }
    public B numberItem(BigDecimal numberItem) {
      this.numberItem = numberItem;
      return self();
    }
    public B integerItem(Integer integerItem) {
      this.integerItem = integerItem;
      return self();
    }
    public B boolItem(Boolean boolItem) {
      this.boolItem = boolItem;
      return self();
    }
    public B arrayItem(List<Integer> arrayItem) {
      this.arrayItem = arrayItem;
      return self();
    }
  }
}

