/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package alluxio.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class CreateFileTOptions implements org.apache.thrift.TBase<CreateFileTOptions, CreateFileTOptions._Fields>, java.io.Serializable, Cloneable, Comparable<CreateFileTOptions> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CreateFileTOptions");

  private static final org.apache.thrift.protocol.TField BLOCK_SIZE_BYTES_FIELD_DESC = new org.apache.thrift.protocol.TField("blockSizeBytes", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField PERSISTED_FIELD_DESC = new org.apache.thrift.protocol.TField("persisted", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField RECURSIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("recursive", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField TTL_FIELD_DESC = new org.apache.thrift.protocol.TField("ttl", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("mode", org.apache.thrift.protocol.TType.I16, (short)5);
  private static final org.apache.thrift.protocol.TField TTL_ACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("ttlAction", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CreateFileTOptionsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CreateFileTOptionsTupleSchemeFactory();

  private long blockSizeBytes; // optional
  private boolean persisted; // optional
  private boolean recursive; // optional
  private long ttl; // optional
  private short mode; // optional
  private alluxio.thrift.TTtlAction ttlAction; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BLOCK_SIZE_BYTES((short)1, "blockSizeBytes"),
    PERSISTED((short)2, "persisted"),
    RECURSIVE((short)3, "recursive"),
    TTL((short)4, "ttl"),
    MODE((short)5, "mode"),
    /**
     * 
     * @see alluxio.thrift.TTtlAction
     */
    TTL_ACTION((short)6, "ttlAction");

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
        case 1: // BLOCK_SIZE_BYTES
          return BLOCK_SIZE_BYTES;
        case 2: // PERSISTED
          return PERSISTED;
        case 3: // RECURSIVE
          return RECURSIVE;
        case 4: // TTL
          return TTL;
        case 5: // MODE
          return MODE;
        case 6: // TTL_ACTION
          return TTL_ACTION;
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
  private static final int __BLOCKSIZEBYTES_ISSET_ID = 0;
  private static final int __PERSISTED_ISSET_ID = 1;
  private static final int __RECURSIVE_ISSET_ID = 2;
  private static final int __TTL_ISSET_ID = 3;
  private static final int __MODE_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.BLOCK_SIZE_BYTES,_Fields.PERSISTED,_Fields.RECURSIVE,_Fields.TTL,_Fields.MODE,_Fields.TTL_ACTION};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BLOCK_SIZE_BYTES, new org.apache.thrift.meta_data.FieldMetaData("blockSizeBytes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PERSISTED, new org.apache.thrift.meta_data.FieldMetaData("persisted", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.RECURSIVE, new org.apache.thrift.meta_data.FieldMetaData("recursive", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TTL, new org.apache.thrift.meta_data.FieldMetaData("ttl", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MODE, new org.apache.thrift.meta_data.FieldMetaData("mode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.TTL_ACTION, new org.apache.thrift.meta_data.FieldMetaData("ttlAction", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, alluxio.thrift.TTtlAction.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CreateFileTOptions.class, metaDataMap);
  }

  public CreateFileTOptions() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CreateFileTOptions(CreateFileTOptions other) {
    __isset_bitfield = other.__isset_bitfield;
    this.blockSizeBytes = other.blockSizeBytes;
    this.persisted = other.persisted;
    this.recursive = other.recursive;
    this.ttl = other.ttl;
    this.mode = other.mode;
    if (other.isSetTtlAction()) {
      this.ttlAction = other.ttlAction;
    }
  }

  public CreateFileTOptions deepCopy() {
    return new CreateFileTOptions(this);
  }

  @Override
  public void clear() {
    setBlockSizeBytesIsSet(false);
    this.blockSizeBytes = 0;
    setPersistedIsSet(false);
    this.persisted = false;
    setRecursiveIsSet(false);
    this.recursive = false;
    setTtlIsSet(false);
    this.ttl = 0;
    setModeIsSet(false);
    this.mode = 0;
    this.ttlAction = null;
  }

  public long getBlockSizeBytes() {
    return this.blockSizeBytes;
  }

  public CreateFileTOptions setBlockSizeBytes(long blockSizeBytes) {
    this.blockSizeBytes = blockSizeBytes;
    setBlockSizeBytesIsSet(true);
    return this;
  }

  public void unsetBlockSizeBytes() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BLOCKSIZEBYTES_ISSET_ID);
  }

  /** Returns true if field blockSizeBytes is set (has been assigned a value) and false otherwise */
  public boolean isSetBlockSizeBytes() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BLOCKSIZEBYTES_ISSET_ID);
  }

  public void setBlockSizeBytesIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BLOCKSIZEBYTES_ISSET_ID, value);
  }

  public boolean isPersisted() {
    return this.persisted;
  }

  public CreateFileTOptions setPersisted(boolean persisted) {
    this.persisted = persisted;
    setPersistedIsSet(true);
    return this;
  }

  public void unsetPersisted() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PERSISTED_ISSET_ID);
  }

  /** Returns true if field persisted is set (has been assigned a value) and false otherwise */
  public boolean isSetPersisted() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PERSISTED_ISSET_ID);
  }

  public void setPersistedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PERSISTED_ISSET_ID, value);
  }

  public boolean isRecursive() {
    return this.recursive;
  }

  public CreateFileTOptions setRecursive(boolean recursive) {
    this.recursive = recursive;
    setRecursiveIsSet(true);
    return this;
  }

  public void unsetRecursive() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RECURSIVE_ISSET_ID);
  }

  /** Returns true if field recursive is set (has been assigned a value) and false otherwise */
  public boolean isSetRecursive() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RECURSIVE_ISSET_ID);
  }

  public void setRecursiveIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RECURSIVE_ISSET_ID, value);
  }

  public long getTtl() {
    return this.ttl;
  }

  public CreateFileTOptions setTtl(long ttl) {
    this.ttl = ttl;
    setTtlIsSet(true);
    return this;
  }

  public void unsetTtl() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TTL_ISSET_ID);
  }

  /** Returns true if field ttl is set (has been assigned a value) and false otherwise */
  public boolean isSetTtl() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TTL_ISSET_ID);
  }

  public void setTtlIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TTL_ISSET_ID, value);
  }

  public short getMode() {
    return this.mode;
  }

  public CreateFileTOptions setMode(short mode) {
    this.mode = mode;
    setModeIsSet(true);
    return this;
  }

  public void unsetMode() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MODE_ISSET_ID);
  }

  /** Returns true if field mode is set (has been assigned a value) and false otherwise */
  public boolean isSetMode() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MODE_ISSET_ID);
  }

  public void setModeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MODE_ISSET_ID, value);
  }

  /**
   * 
   * @see alluxio.thrift.TTtlAction
   */
  public alluxio.thrift.TTtlAction getTtlAction() {
    return this.ttlAction;
  }

  /**
   * 
   * @see alluxio.thrift.TTtlAction
   */
  public CreateFileTOptions setTtlAction(alluxio.thrift.TTtlAction ttlAction) {
    this.ttlAction = ttlAction;
    return this;
  }

  public void unsetTtlAction() {
    this.ttlAction = null;
  }

  /** Returns true if field ttlAction is set (has been assigned a value) and false otherwise */
  public boolean isSetTtlAction() {
    return this.ttlAction != null;
  }

  public void setTtlActionIsSet(boolean value) {
    if (!value) {
      this.ttlAction = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case BLOCK_SIZE_BYTES:
      if (value == null) {
        unsetBlockSizeBytes();
      } else {
        setBlockSizeBytes((java.lang.Long)value);
      }
      break;

    case PERSISTED:
      if (value == null) {
        unsetPersisted();
      } else {
        setPersisted((java.lang.Boolean)value);
      }
      break;

    case RECURSIVE:
      if (value == null) {
        unsetRecursive();
      } else {
        setRecursive((java.lang.Boolean)value);
      }
      break;

    case TTL:
      if (value == null) {
        unsetTtl();
      } else {
        setTtl((java.lang.Long)value);
      }
      break;

    case MODE:
      if (value == null) {
        unsetMode();
      } else {
        setMode((java.lang.Short)value);
      }
      break;

    case TTL_ACTION:
      if (value == null) {
        unsetTtlAction();
      } else {
        setTtlAction((alluxio.thrift.TTtlAction)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case BLOCK_SIZE_BYTES:
      return getBlockSizeBytes();

    case PERSISTED:
      return isPersisted();

    case RECURSIVE:
      return isRecursive();

    case TTL:
      return getTtl();

    case MODE:
      return getMode();

    case TTL_ACTION:
      return getTtlAction();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case BLOCK_SIZE_BYTES:
      return isSetBlockSizeBytes();
    case PERSISTED:
      return isSetPersisted();
    case RECURSIVE:
      return isSetRecursive();
    case TTL:
      return isSetTtl();
    case MODE:
      return isSetMode();
    case TTL_ACTION:
      return isSetTtlAction();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof CreateFileTOptions)
      return this.equals((CreateFileTOptions)that);
    return false;
  }

  public boolean equals(CreateFileTOptions that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_blockSizeBytes = true && this.isSetBlockSizeBytes();
    boolean that_present_blockSizeBytes = true && that.isSetBlockSizeBytes();
    if (this_present_blockSizeBytes || that_present_blockSizeBytes) {
      if (!(this_present_blockSizeBytes && that_present_blockSizeBytes))
        return false;
      if (this.blockSizeBytes != that.blockSizeBytes)
        return false;
    }

    boolean this_present_persisted = true && this.isSetPersisted();
    boolean that_present_persisted = true && that.isSetPersisted();
    if (this_present_persisted || that_present_persisted) {
      if (!(this_present_persisted && that_present_persisted))
        return false;
      if (this.persisted != that.persisted)
        return false;
    }

    boolean this_present_recursive = true && this.isSetRecursive();
    boolean that_present_recursive = true && that.isSetRecursive();
    if (this_present_recursive || that_present_recursive) {
      if (!(this_present_recursive && that_present_recursive))
        return false;
      if (this.recursive != that.recursive)
        return false;
    }

    boolean this_present_ttl = true && this.isSetTtl();
    boolean that_present_ttl = true && that.isSetTtl();
    if (this_present_ttl || that_present_ttl) {
      if (!(this_present_ttl && that_present_ttl))
        return false;
      if (this.ttl != that.ttl)
        return false;
    }

    boolean this_present_mode = true && this.isSetMode();
    boolean that_present_mode = true && that.isSetMode();
    if (this_present_mode || that_present_mode) {
      if (!(this_present_mode && that_present_mode))
        return false;
      if (this.mode != that.mode)
        return false;
    }

    boolean this_present_ttlAction = true && this.isSetTtlAction();
    boolean that_present_ttlAction = true && that.isSetTtlAction();
    if (this_present_ttlAction || that_present_ttlAction) {
      if (!(this_present_ttlAction && that_present_ttlAction))
        return false;
      if (!this.ttlAction.equals(that.ttlAction))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetBlockSizeBytes()) ? 131071 : 524287);
    if (isSetBlockSizeBytes())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(blockSizeBytes);

    hashCode = hashCode * 8191 + ((isSetPersisted()) ? 131071 : 524287);
    if (isSetPersisted())
      hashCode = hashCode * 8191 + ((persisted) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetRecursive()) ? 131071 : 524287);
    if (isSetRecursive())
      hashCode = hashCode * 8191 + ((recursive) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetTtl()) ? 131071 : 524287);
    if (isSetTtl())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(ttl);

    hashCode = hashCode * 8191 + ((isSetMode()) ? 131071 : 524287);
    if (isSetMode())
      hashCode = hashCode * 8191 + mode;

    hashCode = hashCode * 8191 + ((isSetTtlAction()) ? 131071 : 524287);
    if (isSetTtlAction())
      hashCode = hashCode * 8191 + ttlAction.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(CreateFileTOptions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetBlockSizeBytes()).compareTo(other.isSetBlockSizeBytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBlockSizeBytes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.blockSizeBytes, other.blockSizeBytes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPersisted()).compareTo(other.isSetPersisted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPersisted()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.persisted, other.persisted);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRecursive()).compareTo(other.isSetRecursive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecursive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recursive, other.recursive);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTtl()).compareTo(other.isSetTtl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTtl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ttl, other.ttl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMode()).compareTo(other.isSetMode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mode, other.mode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTtlAction()).compareTo(other.isSetTtlAction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTtlAction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ttlAction, other.ttlAction);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateFileTOptions(");
    boolean first = true;

    if (isSetBlockSizeBytes()) {
      sb.append("blockSizeBytes:");
      sb.append(this.blockSizeBytes);
      first = false;
    }
    if (isSetPersisted()) {
      if (!first) sb.append(", ");
      sb.append("persisted:");
      sb.append(this.persisted);
      first = false;
    }
    if (isSetRecursive()) {
      if (!first) sb.append(", ");
      sb.append("recursive:");
      sb.append(this.recursive);
      first = false;
    }
    if (isSetTtl()) {
      if (!first) sb.append(", ");
      sb.append("ttl:");
      sb.append(this.ttl);
      first = false;
    }
    if (isSetMode()) {
      if (!first) sb.append(", ");
      sb.append("mode:");
      sb.append(this.mode);
      first = false;
    }
    if (isSetTtlAction()) {
      if (!first) sb.append(", ");
      sb.append("ttlAction:");
      if (this.ttlAction == null) {
        sb.append("null");
      } else {
        sb.append(this.ttlAction);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class CreateFileTOptionsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CreateFileTOptionsStandardScheme getScheme() {
      return new CreateFileTOptionsStandardScheme();
    }
  }

  private static class CreateFileTOptionsStandardScheme extends org.apache.thrift.scheme.StandardScheme<CreateFileTOptions> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CreateFileTOptions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BLOCK_SIZE_BYTES
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.blockSizeBytes = iprot.readI64();
              struct.setBlockSizeBytesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PERSISTED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.persisted = iprot.readBool();
              struct.setPersistedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RECURSIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.recursive = iprot.readBool();
              struct.setRecursiveIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TTL
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.ttl = iprot.readI64();
              struct.setTtlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.mode = iprot.readI16();
              struct.setModeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TTL_ACTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.ttlAction = alluxio.thrift.TTtlAction.findByValue(iprot.readI32());
              struct.setTtlActionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CreateFileTOptions struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetBlockSizeBytes()) {
        oprot.writeFieldBegin(BLOCK_SIZE_BYTES_FIELD_DESC);
        oprot.writeI64(struct.blockSizeBytes);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPersisted()) {
        oprot.writeFieldBegin(PERSISTED_FIELD_DESC);
        oprot.writeBool(struct.persisted);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRecursive()) {
        oprot.writeFieldBegin(RECURSIVE_FIELD_DESC);
        oprot.writeBool(struct.recursive);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTtl()) {
        oprot.writeFieldBegin(TTL_FIELD_DESC);
        oprot.writeI64(struct.ttl);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMode()) {
        oprot.writeFieldBegin(MODE_FIELD_DESC);
        oprot.writeI16(struct.mode);
        oprot.writeFieldEnd();
      }
      if (struct.ttlAction != null) {
        if (struct.isSetTtlAction()) {
          oprot.writeFieldBegin(TTL_ACTION_FIELD_DESC);
          oprot.writeI32(struct.ttlAction.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CreateFileTOptionsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CreateFileTOptionsTupleScheme getScheme() {
      return new CreateFileTOptionsTupleScheme();
    }
  }

  private static class CreateFileTOptionsTupleScheme extends org.apache.thrift.scheme.TupleScheme<CreateFileTOptions> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CreateFileTOptions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetBlockSizeBytes()) {
        optionals.set(0);
      }
      if (struct.isSetPersisted()) {
        optionals.set(1);
      }
      if (struct.isSetRecursive()) {
        optionals.set(2);
      }
      if (struct.isSetTtl()) {
        optionals.set(3);
      }
      if (struct.isSetMode()) {
        optionals.set(4);
      }
      if (struct.isSetTtlAction()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetBlockSizeBytes()) {
        oprot.writeI64(struct.blockSizeBytes);
      }
      if (struct.isSetPersisted()) {
        oprot.writeBool(struct.persisted);
      }
      if (struct.isSetRecursive()) {
        oprot.writeBool(struct.recursive);
      }
      if (struct.isSetTtl()) {
        oprot.writeI64(struct.ttl);
      }
      if (struct.isSetMode()) {
        oprot.writeI16(struct.mode);
      }
      if (struct.isSetTtlAction()) {
        oprot.writeI32(struct.ttlAction.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CreateFileTOptions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.blockSizeBytes = iprot.readI64();
        struct.setBlockSizeBytesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.persisted = iprot.readBool();
        struct.setPersistedIsSet(true);
      }
      if (incoming.get(2)) {
        struct.recursive = iprot.readBool();
        struct.setRecursiveIsSet(true);
      }
      if (incoming.get(3)) {
        struct.ttl = iprot.readI64();
        struct.setTtlIsSet(true);
      }
      if (incoming.get(4)) {
        struct.mode = iprot.readI16();
        struct.setModeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.ttlAction = alluxio.thrift.TTtlAction.findByValue(iprot.readI32());
        struct.setTtlActionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

