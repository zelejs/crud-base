package com.jfeat.crud.base.exception;

/**
 * Created by jackyhuang on 2017/12/13.
 */
public enum BusinessCode {

    CodeBase(BusinessException.BusinessCodeBase, "业务错误"),

    /// 4001
    NotImplement(CodeBase.friendlyCode + 1, "服务未实现"),
    /// 4002
    NotSupport(CodeBase.friendlyCode + 2, "服务不支持"),
    /// 4003
    DatabaseConnectFailure(CodeBase.friendlyCode + 3, "数据库连接异常"),
    /// 4004
    PartiallyAffectedError(CodeBase.friendlyCode + 4, "部分操作有效"),
    /// 4005
    ErrorStatus(CodeBase.friendlyCode + 5, "状态错误"),
    /// 4006
    InvalidKey(CodeBase.friendlyCode + 6, "非法键值"),
    /// 4007
    DuplicateKey(CodeBase.friendlyCode + 7, "重复键值"),
    /// 4008
    DeleteAssociatedOne(CodeBase.friendlyCode + 8, "尝试删除关联项"),
    /// 4009
    DeleteNotEmptyOne(CodeBase.friendlyCode + 9, "尝试删除非空项"),
    /// 4010
    // ReservedCode10(CodeBase.friendlyCode + 10, "预留业务错误"),
    PassworkNotExist(CodeBase.friendlyCode + 10, "错误密码为空"),
    /// 4011
    DatabaseInsertError(CodeBase.friendlyCode + 11, "数据库插入错误"),
    /// 4012
    DatabaseUpdateError(CodeBase.friendlyCode + 12, "数据库更新错误"),
    /// 4013
    DatabaseDeleteError(CodeBase.friendlyCode + 13, "数据库删除错误"),
    /// 4014
    ThirdPartError(CodeBase.friendlyCode + 14, "调用第三方出错"),
    // 4015
    RpcFailure(CodeBase.friendlyCode + 15, "远程调用失败"),
    // 4016
    LoginExpired(CodeBase.friendlyCode + 16, "登录过期"),

    /// 4020
    BadRequest(CodeBase.friendlyCode + 20, "请求参数错误"),
    /// 4021
    OutOfRange(CodeBase.friendlyCode + 21, "超出范围"),
    /// 4022
    EmptyNotAllowed(CodeBase.friendlyCode + 22, "不允许空值"),
    /// 4023
    NotValidated(CodeBase.friendlyCode + 23, "未校验"),
    /// 4024
    Reserved2(CodeBase.friendlyCode + 24, "预留"),
    /// 4025
    SyntaxError(CodeBase.friendlyCode + 25, "语法错误"),
    /// 4026
    JsonSyntaxError(CodeBase.friendlyCode + 26, "JSON语法错误"),


    /// 4040
    AuthorizationError(CodeBase.friendlyCode + 40, "权限异常"),
    /// 4041
    NoPermission(CodeBase.friendlyCode + 41, "没有权限"),
    /// 4042
    UserAlreadyReg(CodeBase.friendlyCode + 42, "该用户已经注册"),
    /// 4043
    UserNotExisted(CodeBase.friendlyCode + 43, "没有此用户"),
    /// 4044
    PasswordIncorrect(CodeBase.friendlyCode + 44, "密码不正确"),
    /// 4045
    PasswordMismatch(CodeBase.friendlyCode + 45, "两次输入密码不一致"),
    /// 4046
    LoginFailure(CodeBase.friendlyCode + 46, "登录失败"),
    /// 4047
    InvalidToken(CodeBase.friendlyCode + 47, "非法验证码"),
    /// 4048
    InvalidPasswordPolicy(CodeBase.friendlyCode + 48, "无效的密码策略"),
    /// 4049
    ExpiredTime(CodeBase.friendlyCode + 49, "过期的时间"),

    /// 4060
    GeneralIOError(CodeBase.friendlyCode + 60, "文件操作错误"),
    /// 4061
    UploadFileError(CodeBase.friendlyCode + 61, "上传文件出错"),
    /// 4062
    FileReadingError(CodeBase.friendlyCode + 62, "读取文件出错"),
    /// 4063
    FileNotFound(CodeBase.friendlyCode + 63, "找不到文件"),

    /// 4080
    VersionInconsistency(CodeBase.friendlyCode + 80, "数据版本不一致"),


    /**
     * CRUD Error Code
     */
    CRUD_GENERAL_ERROR(CodeBase.friendlyCode + 400, "[CRUD]找不到文件"),
    CRUD_INSERT_FAILURE(CRUD_GENERAL_ERROR.friendlyCode + 1, "[CRUD]更新失败"),
    CRUD_UPDATE_FAILURE(CRUD_GENERAL_ERROR.friendlyCode + 2, "[CRUD]插入失败"),
    CRUD_DELETE_FAILURE(CRUD_GENERAL_ERROR.friendlyCode + 3, "[CRUD]删除失败"),
    CRUD_QUERY_FAILURE(CRUD_GENERAL_ERROR.friendlyCode + 4, "[CRUD]查询失败"),
    CRUD_MASTER_KEY_NOT_PROVIDED(CRUD_GENERAL_ERROR.friendlyCode + 5, "[CRUD]主关键字段未提供"),
    CRUD_SLAVE_KEY_NOT_PROVIDED(CRUD_GENERAL_ERROR.friendlyCode + 6, "[CRUD]从属关键字段未提供"),
    CRUD_DELETE_NOT_EMPTY_GROUP(CRUD_GENERAL_ERROR.friendlyCode + 7, "[CRUD]尝试删除非空类别"),
    CRUD_DELETE_ASSOCIATED_MASTER(CRUD_GENERAL_ERROR.friendlyCode + 8, "[CRUD]尝试删除存在关联的实体"),
    CRUD_MASTER_NOT_EXISTS(CRUD_GENERAL_ERROR.friendlyCode + 9, "[CRUD]主表项不存在"),
    CRUD_PEER_KEY_NOT_UNIQUE(CRUD_GENERAL_ERROR.friendlyCode + 10, "[CRUD]关联关键字非唯一"),
    CRUD_DUPLICATE_UNIQUE_FIELD(CRUD_GENERAL_ERROR.friendlyCode + 11, "[CRUD]唯一字段重复"),

    /**
     * 设备管控业务相关错误码
     */
    MDM_GENERAL_ERROR(CodeBase.friendlyCode + 420, "[MDM] 一般性错误"),
    MDM_NOT_EXISTS(MDM_GENERAL_ERROR.friendlyCode + 1, "[MDM] 数据不存在"),


    /**
     * 系统错误
     */
    SYSTEM_GENERAL_ERROR(CodeBase.friendlyCode + 500, "系统错误"),
    SYSTEM_LOGIC_ERROR(SYSTEM_GENERAL_ERROR.friendlyCode + 1, "系统逻辑错误"),
    SYSTEM_DATA_NOT_EXISTS(SYSTEM_GENERAL_ERROR.friendlyCode + 2, "数据不存在"),


    /**
     * Unknown error
     */
    UNKNOWN_ERROR(CodeBase.friendlyCode + 1000, "未知错误");

    /**
     *  enum Code
     */
    private int friendlyCode;
    private String friendlyMsg;

    private BusinessCode(int code, String message) {
        this.friendlyCode = code;
        this.friendlyMsg = message;
    }

    public int getCode() {
        return this.friendlyCode;
    }

    public void setCode(int code) {
        this.friendlyCode = code;
    }

    public String getMessage() {
        return this.friendlyMsg;
    }

    public void setMessage(String message) {
        this.friendlyMsg = message;
    }
}
