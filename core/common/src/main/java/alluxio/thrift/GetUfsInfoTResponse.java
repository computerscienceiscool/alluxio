/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package alluxio.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class GetUfsInfoTResponse implements org.apache.thrift.TBase<GetUfsInfoTResponse, GetUfsInfoTResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetUfsInfoTResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetUfsInfoTResponse");

  private static final org.apache.thrift.protocol.TField UFS_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("ufsInfo", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetUfsInfoTResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetUfsInfoTResponseTupleSchemeFactory();

  private UfsInfo ufsInfo; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UFS_INFO((short)1, "ufsInfo");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // UFS_INFO
          return UFS_INFO;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UFS_INFO, new org.apache.thrift.meta_data.FieldMetaData("ufsInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, UfsInfo.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetUfsInfoTResponse.class, metaDataMap);
  }

  public GetUfsInfoTResponse() {
  }

  public GetUfsInfoTResponse(
    UfsInfo ufsInfo)
  {
    this();
    this.ufsInfo = ufsInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetUfsInfoTResponse(GetUfsInfoTResponse other) {
    if (other.isSetUfsInfo()) {
      this.ufsInfo = new UfsInfo(other.ufsInfo);
    }
  }

  public GetUfsInfoTResponse deepCopy() {
    return new GetUfsInfoTResponse(this);
  }

  @Override
  public void clear() {
    this.ufsInfo = null;
  }

  public UfsInfo getUfsInfo() {
    return this.ufsInfo;
  }

  public GetUfsInfoTResponse setUfsInfo(UfsInfo ufsInfo) {
    this.ufsInfo = ufsInfo;
    return this;
  }

  public void unsetUfsInfo() {
    this.ufsInfo = null;
  }

  /** Returns true if field ufsInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetUfsInfo() {
    return this.ufsInfo != null;
  }

  public void setUfsInfoIsSet(boolean value) {
    if (!value) {
      this.ufsInfo = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case UFS_INFO:
      if (value == null) {
        unsetUfsInfo();
      } else {
        setUfsInfo((UfsInfo)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case UFS_INFO:
      return getUfsInfo();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case UFS_INFO:
      return isSetUfsInfo();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GetUfsInfoTResponse)
      return this.equals((GetUfsInfoTResponse)that);
    return false;
  }

  public boolean equals(GetUfsInfoTResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_ufsInfo = true && this.isSetUfsInfo();
    boolean that_present_ufsInfo = true && that.isSetUfsInfo();
    if (this_present_ufsInfo || that_present_ufsInfo) {
      if (!(this_present_ufsInfo && that_present_ufsInfo))
        return false;
      if (!this.ufsInfo.equals(that.ufsInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUfsInfo()) ? 131071 : 524287);
    if (isSetUfsInfo())
      hashCode = hashCode * 8191 + ufsInfo.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GetUfsInfoTResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUfsInfo()).compareTo(other.isSetUfsInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUfsInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ufsInfo, other.ufsInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetUfsInfoTResponse(");
    boolean first = true;

    sb.append("ufsInfo:");
    if (this.ufsInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.ufsInfo);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (ufsInfo != null) {
      ufsInfo.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetUfsInfoTResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetUfsInfoTResponseStandardScheme getScheme() {
      return new GetUfsInfoTResponseStandardScheme();
    }
  }

  private static class GetUfsInfoTResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetUfsInfoTResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetUfsInfoTResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UFS_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.ufsInfo = new UfsInfo();
              struct.ufsInfo.read(iprot);
              struct.setUfsInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetUfsInfoTResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ufsInfo != null) {
        oprot.writeFieldBegin(UFS_INFO_FIELD_DESC);
        struct.ufsInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetUfsInfoTResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetUfsInfoTResponseTupleScheme getScheme() {
      return new GetUfsInfoTResponseTupleScheme();
    }
  }

  private static class GetUfsInfoTResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetUfsInfoTResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetUfsInfoTResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUfsInfo()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetUfsInfo()) {
        struct.ufsInfo.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetUfsInfoTResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.ufsInfo = new UfsInfo();
        struct.ufsInfo.read(iprot);
        struct.setUfsInfoIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

