/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package alluxio.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * Address information about workers.
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class WorkerNetAddress implements org.apache.thrift.TBase<WorkerNetAddress, WorkerNetAddress._Fields>, java.io.Serializable, Cloneable, Comparable<WorkerNetAddress> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WorkerNetAddress");

  private static final org.apache.thrift.protocol.TField HOST_FIELD_DESC = new org.apache.thrift.protocol.TField("host", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RPC_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("rpcPort", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField DATA_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("dataPort", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField WEB_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("webPort", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField DOMAIN_SOCKET_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("domainSocketPath", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new WorkerNetAddressStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new WorkerNetAddressTupleSchemeFactory();

  private java.lang.String host; // required
  private int rpcPort; // required
  private int dataPort; // required
  private int webPort; // required
  private java.lang.String domainSocketPath; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HOST((short)1, "host"),
    RPC_PORT((short)2, "rpcPort"),
    DATA_PORT((short)3, "dataPort"),
    WEB_PORT((short)4, "webPort"),
    DOMAIN_SOCKET_PATH((short)5, "domainSocketPath");

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
        case 1: // HOST
          return HOST;
        case 2: // RPC_PORT
          return RPC_PORT;
        case 3: // DATA_PORT
          return DATA_PORT;
        case 4: // WEB_PORT
          return WEB_PORT;
        case 5: // DOMAIN_SOCKET_PATH
          return DOMAIN_SOCKET_PATH;
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
  private static final int __RPCPORT_ISSET_ID = 0;
  private static final int __DATAPORT_ISSET_ID = 1;
  private static final int __WEBPORT_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HOST, new org.apache.thrift.meta_data.FieldMetaData("host", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RPC_PORT, new org.apache.thrift.meta_data.FieldMetaData("rpcPort", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DATA_PORT, new org.apache.thrift.meta_data.FieldMetaData("dataPort", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.WEB_PORT, new org.apache.thrift.meta_data.FieldMetaData("webPort", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DOMAIN_SOCKET_PATH, new org.apache.thrift.meta_data.FieldMetaData("domainSocketPath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WorkerNetAddress.class, metaDataMap);
  }

  public WorkerNetAddress() {
  }

  public WorkerNetAddress(
    java.lang.String host,
    int rpcPort,
    int dataPort,
    int webPort,
    java.lang.String domainSocketPath)
  {
    this();
    this.host = host;
    this.rpcPort = rpcPort;
    setRpcPortIsSet(true);
    this.dataPort = dataPort;
    setDataPortIsSet(true);
    this.webPort = webPort;
    setWebPortIsSet(true);
    this.domainSocketPath = domainSocketPath;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WorkerNetAddress(WorkerNetAddress other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHost()) {
      this.host = other.host;
    }
    this.rpcPort = other.rpcPort;
    this.dataPort = other.dataPort;
    this.webPort = other.webPort;
    if (other.isSetDomainSocketPath()) {
      this.domainSocketPath = other.domainSocketPath;
    }
  }

  public WorkerNetAddress deepCopy() {
    return new WorkerNetAddress(this);
  }

  @Override
  public void clear() {
    this.host = null;
    setRpcPortIsSet(false);
    this.rpcPort = 0;
    setDataPortIsSet(false);
    this.dataPort = 0;
    setWebPortIsSet(false);
    this.webPort = 0;
    this.domainSocketPath = null;
  }

  public java.lang.String getHost() {
    return this.host;
  }

  public WorkerNetAddress setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  public void unsetHost() {
    this.host = null;
  }

  /** Returns true if field host is set (has been assigned a value) and false otherwise */
  public boolean isSetHost() {
    return this.host != null;
  }

  public void setHostIsSet(boolean value) {
    if (!value) {
      this.host = null;
    }
  }

  public int getRpcPort() {
    return this.rpcPort;
  }

  public WorkerNetAddress setRpcPort(int rpcPort) {
    this.rpcPort = rpcPort;
    setRpcPortIsSet(true);
    return this;
  }

  public void unsetRpcPort() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RPCPORT_ISSET_ID);
  }

  /** Returns true if field rpcPort is set (has been assigned a value) and false otherwise */
  public boolean isSetRpcPort() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RPCPORT_ISSET_ID);
  }

  public void setRpcPortIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RPCPORT_ISSET_ID, value);
  }

  public int getDataPort() {
    return this.dataPort;
  }

  public WorkerNetAddress setDataPort(int dataPort) {
    this.dataPort = dataPort;
    setDataPortIsSet(true);
    return this;
  }

  public void unsetDataPort() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DATAPORT_ISSET_ID);
  }

  /** Returns true if field dataPort is set (has been assigned a value) and false otherwise */
  public boolean isSetDataPort() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DATAPORT_ISSET_ID);
  }

  public void setDataPortIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DATAPORT_ISSET_ID, value);
  }

  public int getWebPort() {
    return this.webPort;
  }

  public WorkerNetAddress setWebPort(int webPort) {
    this.webPort = webPort;
    setWebPortIsSet(true);
    return this;
  }

  public void unsetWebPort() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __WEBPORT_ISSET_ID);
  }

  /** Returns true if field webPort is set (has been assigned a value) and false otherwise */
  public boolean isSetWebPort() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __WEBPORT_ISSET_ID);
  }

  public void setWebPortIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __WEBPORT_ISSET_ID, value);
  }

  public java.lang.String getDomainSocketPath() {
    return this.domainSocketPath;
  }

  public WorkerNetAddress setDomainSocketPath(java.lang.String domainSocketPath) {
    this.domainSocketPath = domainSocketPath;
    return this;
  }

  public void unsetDomainSocketPath() {
    this.domainSocketPath = null;
  }

  /** Returns true if field domainSocketPath is set (has been assigned a value) and false otherwise */
  public boolean isSetDomainSocketPath() {
    return this.domainSocketPath != null;
  }

  public void setDomainSocketPathIsSet(boolean value) {
    if (!value) {
      this.domainSocketPath = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case HOST:
      if (value == null) {
        unsetHost();
      } else {
        setHost((java.lang.String)value);
      }
      break;

    case RPC_PORT:
      if (value == null) {
        unsetRpcPort();
      } else {
        setRpcPort((java.lang.Integer)value);
      }
      break;

    case DATA_PORT:
      if (value == null) {
        unsetDataPort();
      } else {
        setDataPort((java.lang.Integer)value);
      }
      break;

    case WEB_PORT:
      if (value == null) {
        unsetWebPort();
      } else {
        setWebPort((java.lang.Integer)value);
      }
      break;

    case DOMAIN_SOCKET_PATH:
      if (value == null) {
        unsetDomainSocketPath();
      } else {
        setDomainSocketPath((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case HOST:
      return getHost();

    case RPC_PORT:
      return getRpcPort();

    case DATA_PORT:
      return getDataPort();

    case WEB_PORT:
      return getWebPort();

    case DOMAIN_SOCKET_PATH:
      return getDomainSocketPath();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case HOST:
      return isSetHost();
    case RPC_PORT:
      return isSetRpcPort();
    case DATA_PORT:
      return isSetDataPort();
    case WEB_PORT:
      return isSetWebPort();
    case DOMAIN_SOCKET_PATH:
      return isSetDomainSocketPath();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof WorkerNetAddress)
      return this.equals((WorkerNetAddress)that);
    return false;
  }

  public boolean equals(WorkerNetAddress that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_host = true && this.isSetHost();
    boolean that_present_host = true && that.isSetHost();
    if (this_present_host || that_present_host) {
      if (!(this_present_host && that_present_host))
        return false;
      if (!this.host.equals(that.host))
        return false;
    }

    boolean this_present_rpcPort = true;
    boolean that_present_rpcPort = true;
    if (this_present_rpcPort || that_present_rpcPort) {
      if (!(this_present_rpcPort && that_present_rpcPort))
        return false;
      if (this.rpcPort != that.rpcPort)
        return false;
    }

    boolean this_present_dataPort = true;
    boolean that_present_dataPort = true;
    if (this_present_dataPort || that_present_dataPort) {
      if (!(this_present_dataPort && that_present_dataPort))
        return false;
      if (this.dataPort != that.dataPort)
        return false;
    }

    boolean this_present_webPort = true;
    boolean that_present_webPort = true;
    if (this_present_webPort || that_present_webPort) {
      if (!(this_present_webPort && that_present_webPort))
        return false;
      if (this.webPort != that.webPort)
        return false;
    }

    boolean this_present_domainSocketPath = true && this.isSetDomainSocketPath();
    boolean that_present_domainSocketPath = true && that.isSetDomainSocketPath();
    if (this_present_domainSocketPath || that_present_domainSocketPath) {
      if (!(this_present_domainSocketPath && that_present_domainSocketPath))
        return false;
      if (!this.domainSocketPath.equals(that.domainSocketPath))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetHost()) ? 131071 : 524287);
    if (isSetHost())
      hashCode = hashCode * 8191 + host.hashCode();

    hashCode = hashCode * 8191 + rpcPort;

    hashCode = hashCode * 8191 + dataPort;

    hashCode = hashCode * 8191 + webPort;

    hashCode = hashCode * 8191 + ((isSetDomainSocketPath()) ? 131071 : 524287);
    if (isSetDomainSocketPath())
      hashCode = hashCode * 8191 + domainSocketPath.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(WorkerNetAddress other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetHost()).compareTo(other.isSetHost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHost()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.host, other.host);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRpcPort()).compareTo(other.isSetRpcPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRpcPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rpcPort, other.rpcPort);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDataPort()).compareTo(other.isSetDataPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataPort, other.dataPort);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetWebPort()).compareTo(other.isSetWebPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWebPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.webPort, other.webPort);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDomainSocketPath()).compareTo(other.isSetDomainSocketPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDomainSocketPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.domainSocketPath, other.domainSocketPath);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("WorkerNetAddress(");
    boolean first = true;

    sb.append("host:");
    if (this.host == null) {
      sb.append("null");
    } else {
      sb.append(this.host);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("rpcPort:");
    sb.append(this.rpcPort);
    first = false;
    if (!first) sb.append(", ");
    sb.append("dataPort:");
    sb.append(this.dataPort);
    first = false;
    if (!first) sb.append(", ");
    sb.append("webPort:");
    sb.append(this.webPort);
    first = false;
    if (!first) sb.append(", ");
    sb.append("domainSocketPath:");
    if (this.domainSocketPath == null) {
      sb.append("null");
    } else {
      sb.append(this.domainSocketPath);
    }
    first = false;
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

  private static class WorkerNetAddressStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WorkerNetAddressStandardScheme getScheme() {
      return new WorkerNetAddressStandardScheme();
    }
  }

  private static class WorkerNetAddressStandardScheme extends org.apache.thrift.scheme.StandardScheme<WorkerNetAddress> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WorkerNetAddress struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HOST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.host = iprot.readString();
              struct.setHostIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RPC_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.rpcPort = iprot.readI32();
              struct.setRpcPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DATA_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.dataPort = iprot.readI32();
              struct.setDataPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // WEB_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.webPort = iprot.readI32();
              struct.setWebPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DOMAIN_SOCKET_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.domainSocketPath = iprot.readString();
              struct.setDomainSocketPathIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, WorkerNetAddress struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.host != null) {
        oprot.writeFieldBegin(HOST_FIELD_DESC);
        oprot.writeString(struct.host);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(RPC_PORT_FIELD_DESC);
      oprot.writeI32(struct.rpcPort);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DATA_PORT_FIELD_DESC);
      oprot.writeI32(struct.dataPort);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(WEB_PORT_FIELD_DESC);
      oprot.writeI32(struct.webPort);
      oprot.writeFieldEnd();
      if (struct.domainSocketPath != null) {
        oprot.writeFieldBegin(DOMAIN_SOCKET_PATH_FIELD_DESC);
        oprot.writeString(struct.domainSocketPath);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WorkerNetAddressTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WorkerNetAddressTupleScheme getScheme() {
      return new WorkerNetAddressTupleScheme();
    }
  }

  private static class WorkerNetAddressTupleScheme extends org.apache.thrift.scheme.TupleScheme<WorkerNetAddress> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WorkerNetAddress struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetHost()) {
        optionals.set(0);
      }
      if (struct.isSetRpcPort()) {
        optionals.set(1);
      }
      if (struct.isSetDataPort()) {
        optionals.set(2);
      }
      if (struct.isSetWebPort()) {
        optionals.set(3);
      }
      if (struct.isSetDomainSocketPath()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetHost()) {
        oprot.writeString(struct.host);
      }
      if (struct.isSetRpcPort()) {
        oprot.writeI32(struct.rpcPort);
      }
      if (struct.isSetDataPort()) {
        oprot.writeI32(struct.dataPort);
      }
      if (struct.isSetWebPort()) {
        oprot.writeI32(struct.webPort);
      }
      if (struct.isSetDomainSocketPath()) {
        oprot.writeString(struct.domainSocketPath);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WorkerNetAddress struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.host = iprot.readString();
        struct.setHostIsSet(true);
      }
      if (incoming.get(1)) {
        struct.rpcPort = iprot.readI32();
        struct.setRpcPortIsSet(true);
      }
      if (incoming.get(2)) {
        struct.dataPort = iprot.readI32();
        struct.setDataPortIsSet(true);
      }
      if (incoming.get(3)) {
        struct.webPort = iprot.readI32();
        struct.setWebPortIsSet(true);
      }
      if (incoming.get(4)) {
        struct.domainSocketPath = iprot.readString();
        struct.setDomainSocketPathIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

