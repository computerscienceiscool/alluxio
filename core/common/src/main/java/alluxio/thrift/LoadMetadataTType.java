/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package alluxio.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum LoadMetadataTType implements org.apache.thrift.TEnum {
  Never(0),
  Once(1),
  Always(2);

  private final int value;

  private LoadMetadataTType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static LoadMetadataTType findByValue(int value) { 
    switch (value) {
      case 0:
        return Never;
      case 1:
        return Once;
      case 2:
        return Always;
      default:
        return null;
    }
  }
}
