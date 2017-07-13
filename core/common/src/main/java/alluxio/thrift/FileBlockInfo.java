/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package alluxio.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * Contains the information of a block in a file. In addition to the BlockInfo, it includes the
 * offset in the file, and the under file system locations of the block replicas.
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class FileBlockInfo implements org.apache.thrift.TBase<FileBlockInfo, FileBlockInfo._Fields>, java.io.Serializable, Cloneable, Comparable<FileBlockInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FileBlockInfo");

  private static final org.apache.thrift.protocol.TField BLOCK_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("blockInfo", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("offset", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField UFS_LOCATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("ufsLocations", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField UFS_STRING_LOCATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("ufsStringLocations", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new FileBlockInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new FileBlockInfoTupleSchemeFactory();

  private alluxio.thrift.BlockInfo blockInfo; // required
  private long offset; // required
  private java.util.List<alluxio.thrift.WorkerNetAddress> ufsLocations; // required
  private java.util.List<java.lang.String> ufsStringLocations; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BLOCK_INFO((short)1, "blockInfo"),
    OFFSET((short)2, "offset"),
    UFS_LOCATIONS((short)3, "ufsLocations"),
    UFS_STRING_LOCATIONS((short)4, "ufsStringLocations");

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
        case 1: // BLOCK_INFO
          return BLOCK_INFO;
        case 2: // OFFSET
          return OFFSET;
        case 3: // UFS_LOCATIONS
          return UFS_LOCATIONS;
        case 4: // UFS_STRING_LOCATIONS
          return UFS_STRING_LOCATIONS;
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
  private static final int __OFFSET_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BLOCK_INFO, new org.apache.thrift.meta_data.FieldMetaData("blockInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, alluxio.thrift.BlockInfo.class)));
    tmpMap.put(_Fields.OFFSET, new org.apache.thrift.meta_data.FieldMetaData("offset", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.UFS_LOCATIONS, new org.apache.thrift.meta_data.FieldMetaData("ufsLocations", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, alluxio.thrift.WorkerNetAddress.class))));
    tmpMap.put(_Fields.UFS_STRING_LOCATIONS, new org.apache.thrift.meta_data.FieldMetaData("ufsStringLocations", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FileBlockInfo.class, metaDataMap);
  }

  public FileBlockInfo() {
  }

  public FileBlockInfo(
    alluxio.thrift.BlockInfo blockInfo,
    long offset,
    java.util.List<alluxio.thrift.WorkerNetAddress> ufsLocations,
    java.util.List<java.lang.String> ufsStringLocations)
  {
    this();
    this.blockInfo = blockInfo;
    this.offset = offset;
    setOffsetIsSet(true);
    this.ufsLocations = ufsLocations;
    this.ufsStringLocations = ufsStringLocations;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FileBlockInfo(FileBlockInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetBlockInfo()) {
      this.blockInfo = new alluxio.thrift.BlockInfo(other.blockInfo);
    }
    this.offset = other.offset;
    if (other.isSetUfsLocations()) {
      java.util.List<alluxio.thrift.WorkerNetAddress> __this__ufsLocations = new java.util.ArrayList<alluxio.thrift.WorkerNetAddress>(other.ufsLocations.size());
      for (alluxio.thrift.WorkerNetAddress other_element : other.ufsLocations) {
        __this__ufsLocations.add(new alluxio.thrift.WorkerNetAddress(other_element));
      }
      this.ufsLocations = __this__ufsLocations;
    }
    if (other.isSetUfsStringLocations()) {
      java.util.List<java.lang.String> __this__ufsStringLocations = new java.util.ArrayList<java.lang.String>(other.ufsStringLocations);
      this.ufsStringLocations = __this__ufsStringLocations;
    }
  }

  public FileBlockInfo deepCopy() {
    return new FileBlockInfo(this);
  }

  @Override
  public void clear() {
    this.blockInfo = null;
    setOffsetIsSet(false);
    this.offset = 0;
    this.ufsLocations = null;
    this.ufsStringLocations = null;
  }

  public alluxio.thrift.BlockInfo getBlockInfo() {
    return this.blockInfo;
  }

  public FileBlockInfo setBlockInfo(alluxio.thrift.BlockInfo blockInfo) {
    this.blockInfo = blockInfo;
    return this;
  }

  public void unsetBlockInfo() {
    this.blockInfo = null;
  }

  /** Returns true if field blockInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetBlockInfo() {
    return this.blockInfo != null;
  }

  public void setBlockInfoIsSet(boolean value) {
    if (!value) {
      this.blockInfo = null;
    }
  }

  public long getOffset() {
    return this.offset;
  }

  public FileBlockInfo setOffset(long offset) {
    this.offset = offset;
    setOffsetIsSet(true);
    return this;
  }

  public void unsetOffset() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __OFFSET_ISSET_ID);
  }

  /** Returns true if field offset is set (has been assigned a value) and false otherwise */
  public boolean isSetOffset() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __OFFSET_ISSET_ID);
  }

  public void setOffsetIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __OFFSET_ISSET_ID, value);
  }

  public int getUfsLocationsSize() {
    return (this.ufsLocations == null) ? 0 : this.ufsLocations.size();
  }

  public java.util.Iterator<alluxio.thrift.WorkerNetAddress> getUfsLocationsIterator() {
    return (this.ufsLocations == null) ? null : this.ufsLocations.iterator();
  }

  public void addToUfsLocations(alluxio.thrift.WorkerNetAddress elem) {
    if (this.ufsLocations == null) {
      this.ufsLocations = new java.util.ArrayList<alluxio.thrift.WorkerNetAddress>();
    }
    this.ufsLocations.add(elem);
  }

  public java.util.List<alluxio.thrift.WorkerNetAddress> getUfsLocations() {
    return this.ufsLocations;
  }

  public FileBlockInfo setUfsLocations(java.util.List<alluxio.thrift.WorkerNetAddress> ufsLocations) {
    this.ufsLocations = ufsLocations;
    return this;
  }

  public void unsetUfsLocations() {
    this.ufsLocations = null;
  }

  /** Returns true if field ufsLocations is set (has been assigned a value) and false otherwise */
  public boolean isSetUfsLocations() {
    return this.ufsLocations != null;
  }

  public void setUfsLocationsIsSet(boolean value) {
    if (!value) {
      this.ufsLocations = null;
    }
  }

  public int getUfsStringLocationsSize() {
    return (this.ufsStringLocations == null) ? 0 : this.ufsStringLocations.size();
  }

  public java.util.Iterator<java.lang.String> getUfsStringLocationsIterator() {
    return (this.ufsStringLocations == null) ? null : this.ufsStringLocations.iterator();
  }

  public void addToUfsStringLocations(java.lang.String elem) {
    if (this.ufsStringLocations == null) {
      this.ufsStringLocations = new java.util.ArrayList<java.lang.String>();
    }
    this.ufsStringLocations.add(elem);
  }

  public java.util.List<java.lang.String> getUfsStringLocations() {
    return this.ufsStringLocations;
  }

  public FileBlockInfo setUfsStringLocations(java.util.List<java.lang.String> ufsStringLocations) {
    this.ufsStringLocations = ufsStringLocations;
    return this;
  }

  public void unsetUfsStringLocations() {
    this.ufsStringLocations = null;
  }

  /** Returns true if field ufsStringLocations is set (has been assigned a value) and false otherwise */
  public boolean isSetUfsStringLocations() {
    return this.ufsStringLocations != null;
  }

  public void setUfsStringLocationsIsSet(boolean value) {
    if (!value) {
      this.ufsStringLocations = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case BLOCK_INFO:
      if (value == null) {
        unsetBlockInfo();
      } else {
        setBlockInfo((alluxio.thrift.BlockInfo)value);
      }
      break;

    case OFFSET:
      if (value == null) {
        unsetOffset();
      } else {
        setOffset((java.lang.Long)value);
      }
      break;

    case UFS_LOCATIONS:
      if (value == null) {
        unsetUfsLocations();
      } else {
        setUfsLocations((java.util.List<alluxio.thrift.WorkerNetAddress>)value);
      }
      break;

    case UFS_STRING_LOCATIONS:
      if (value == null) {
        unsetUfsStringLocations();
      } else {
        setUfsStringLocations((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case BLOCK_INFO:
      return getBlockInfo();

    case OFFSET:
      return getOffset();

    case UFS_LOCATIONS:
      return getUfsLocations();

    case UFS_STRING_LOCATIONS:
      return getUfsStringLocations();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case BLOCK_INFO:
      return isSetBlockInfo();
    case OFFSET:
      return isSetOffset();
    case UFS_LOCATIONS:
      return isSetUfsLocations();
    case UFS_STRING_LOCATIONS:
      return isSetUfsStringLocations();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof FileBlockInfo)
      return this.equals((FileBlockInfo)that);
    return false;
  }

  public boolean equals(FileBlockInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_blockInfo = true && this.isSetBlockInfo();
    boolean that_present_blockInfo = true && that.isSetBlockInfo();
    if (this_present_blockInfo || that_present_blockInfo) {
      if (!(this_present_blockInfo && that_present_blockInfo))
        return false;
      if (!this.blockInfo.equals(that.blockInfo))
        return false;
    }

    boolean this_present_offset = true;
    boolean that_present_offset = true;
    if (this_present_offset || that_present_offset) {
      if (!(this_present_offset && that_present_offset))
        return false;
      if (this.offset != that.offset)
        return false;
    }

    boolean this_present_ufsLocations = true && this.isSetUfsLocations();
    boolean that_present_ufsLocations = true && that.isSetUfsLocations();
    if (this_present_ufsLocations || that_present_ufsLocations) {
      if (!(this_present_ufsLocations && that_present_ufsLocations))
        return false;
      if (!this.ufsLocations.equals(that.ufsLocations))
        return false;
    }

    boolean this_present_ufsStringLocations = true && this.isSetUfsStringLocations();
    boolean that_present_ufsStringLocations = true && that.isSetUfsStringLocations();
    if (this_present_ufsStringLocations || that_present_ufsStringLocations) {
      if (!(this_present_ufsStringLocations && that_present_ufsStringLocations))
        return false;
      if (!this.ufsStringLocations.equals(that.ufsStringLocations))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetBlockInfo()) ? 131071 : 524287);
    if (isSetBlockInfo())
      hashCode = hashCode * 8191 + blockInfo.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(offset);

    hashCode = hashCode * 8191 + ((isSetUfsLocations()) ? 131071 : 524287);
    if (isSetUfsLocations())
      hashCode = hashCode * 8191 + ufsLocations.hashCode();

    hashCode = hashCode * 8191 + ((isSetUfsStringLocations()) ? 131071 : 524287);
    if (isSetUfsStringLocations())
      hashCode = hashCode * 8191 + ufsStringLocations.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(FileBlockInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetBlockInfo()).compareTo(other.isSetBlockInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBlockInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.blockInfo, other.blockInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOffset()).compareTo(other.isSetOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.offset, other.offset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUfsLocations()).compareTo(other.isSetUfsLocations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUfsLocations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ufsLocations, other.ufsLocations);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUfsStringLocations()).compareTo(other.isSetUfsStringLocations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUfsStringLocations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ufsStringLocations, other.ufsStringLocations);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("FileBlockInfo(");
    boolean first = true;

    sb.append("blockInfo:");
    if (this.blockInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.blockInfo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("offset:");
    sb.append(this.offset);
    first = false;
    if (!first) sb.append(", ");
    sb.append("ufsLocations:");
    if (this.ufsLocations == null) {
      sb.append("null");
    } else {
      sb.append(this.ufsLocations);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ufsStringLocations:");
    if (this.ufsStringLocations == null) {
      sb.append("null");
    } else {
      sb.append(this.ufsStringLocations);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (blockInfo != null) {
      blockInfo.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FileBlockInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FileBlockInfoStandardScheme getScheme() {
      return new FileBlockInfoStandardScheme();
    }
  }

  private static class FileBlockInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<FileBlockInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FileBlockInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BLOCK_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.blockInfo = new alluxio.thrift.BlockInfo();
              struct.blockInfo.read(iprot);
              struct.setBlockInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.offset = iprot.readI64();
              struct.setOffsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UFS_LOCATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.ufsLocations = new java.util.ArrayList<alluxio.thrift.WorkerNetAddress>(_list16.size);
                alluxio.thrift.WorkerNetAddress _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = new alluxio.thrift.WorkerNetAddress();
                  _elem17.read(iprot);
                  struct.ufsLocations.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setUfsLocationsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // UFS_STRING_LOCATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list19 = iprot.readListBegin();
                struct.ufsStringLocations = new java.util.ArrayList<java.lang.String>(_list19.size);
                java.lang.String _elem20;
                for (int _i21 = 0; _i21 < _list19.size; ++_i21)
                {
                  _elem20 = iprot.readString();
                  struct.ufsStringLocations.add(_elem20);
                }
                iprot.readListEnd();
              }
              struct.setUfsStringLocationsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FileBlockInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.blockInfo != null) {
        oprot.writeFieldBegin(BLOCK_INFO_FIELD_DESC);
        struct.blockInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(OFFSET_FIELD_DESC);
      oprot.writeI64(struct.offset);
      oprot.writeFieldEnd();
      if (struct.ufsLocations != null) {
        oprot.writeFieldBegin(UFS_LOCATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.ufsLocations.size()));
          for (alluxio.thrift.WorkerNetAddress _iter22 : struct.ufsLocations)
          {
            _iter22.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.ufsStringLocations != null) {
        oprot.writeFieldBegin(UFS_STRING_LOCATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.ufsStringLocations.size()));
          for (java.lang.String _iter23 : struct.ufsStringLocations)
          {
            oprot.writeString(_iter23);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FileBlockInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FileBlockInfoTupleScheme getScheme() {
      return new FileBlockInfoTupleScheme();
    }
  }

  private static class FileBlockInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<FileBlockInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FileBlockInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetBlockInfo()) {
        optionals.set(0);
      }
      if (struct.isSetOffset()) {
        optionals.set(1);
      }
      if (struct.isSetUfsLocations()) {
        optionals.set(2);
      }
      if (struct.isSetUfsStringLocations()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetBlockInfo()) {
        struct.blockInfo.write(oprot);
      }
      if (struct.isSetOffset()) {
        oprot.writeI64(struct.offset);
      }
      if (struct.isSetUfsLocations()) {
        {
          oprot.writeI32(struct.ufsLocations.size());
          for (alluxio.thrift.WorkerNetAddress _iter24 : struct.ufsLocations)
          {
            _iter24.write(oprot);
          }
        }
      }
      if (struct.isSetUfsStringLocations()) {
        {
          oprot.writeI32(struct.ufsStringLocations.size());
          for (java.lang.String _iter25 : struct.ufsStringLocations)
          {
            oprot.writeString(_iter25);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FileBlockInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.blockInfo = new alluxio.thrift.BlockInfo();
        struct.blockInfo.read(iprot);
        struct.setBlockInfoIsSet(true);
      }
      if (incoming.get(1)) {
        struct.offset = iprot.readI64();
        struct.setOffsetIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list26 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.ufsLocations = new java.util.ArrayList<alluxio.thrift.WorkerNetAddress>(_list26.size);
          alluxio.thrift.WorkerNetAddress _elem27;
          for (int _i28 = 0; _i28 < _list26.size; ++_i28)
          {
            _elem27 = new alluxio.thrift.WorkerNetAddress();
            _elem27.read(iprot);
            struct.ufsLocations.add(_elem27);
          }
        }
        struct.setUfsLocationsIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.ufsStringLocations = new java.util.ArrayList<java.lang.String>(_list29.size);
          java.lang.String _elem30;
          for (int _i31 = 0; _i31 < _list29.size; ++_i31)
          {
            _elem30 = iprot.readString();
            struct.ufsStringLocations.add(_elem30);
          }
        }
        struct.setUfsStringLocationsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

