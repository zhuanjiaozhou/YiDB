/**
 * 
 */
package com.ebay.cloud.cms.typsafe.exception;

/**
 * 
 * Error code enum that represents the CMS server error.
 * 
 * @author liasu
 *
 */
public enum CMSErrorCodeEnum {
    UNDEFINED_ERROR_CODE(0),
    OK(200),
    UNAUTHORIZED(401),
    DAL_NO_ERROR(1000),
    VERSION_CONFLICT(1001),
    MISS_VERSION(1002),
    INVALID_VERSION(1003),
    ENTITY_NOT_FOUND(1004),
    DIRTY_DATA_WRONG_TYPE(1005),
    PROCESS_JSON(1006),
    MISS_REFID(1007),
    MISS_META_FIELD(1008),
    MISS_RUNTIME_FIELD(1009),
    MISS_ID(1010),
    NO_TYPE_IN_DBOBJECT(1011),
    TYPE_INCONSISTENCY(1012),
    REPOSITORYNAME_INCONSISTENCY(1013),
    BRANCHID_INCONSISTENCY(1014),
    VIOLATE_REFERENCE_INTEGRITY(1015),
    ENTITY_ALREADY_EXIST(1016),
    CONSTANT_FIELD_MODIFICATION(1017),
    STANDALONE_EMBED(1018),
    MISMATCH_META_TYPE(1019),
    INVALID_EMBED_ID(1020),
    ENTITY_NOT_ACTIVE(1021),
    CANNOT_DELETE_EXPRESSION_FIELD(1022),
    VALIDATION_FAILED(1023),
    DUPLICATE_REFERENCE(1024),
    AGGREGATION_FAILED(1101),
    MONGO_EXCEPTON_DUPLICATE(1301),
    MONGO_EXCEPTION_NETWORK(1302),
    MONGO_EXCEPTION_CURSORNOTFOUND(1303),
    MONGO_EXCEPTION_UNKNOWN(1310),
    JS_EXPRESSION_EXECUTION_ERROR(1401),
    JS_EXPRESSION_TIMEOUT(1402),
    ENTMGR_NO_ERROR(10000),
    @Deprecated
    ENTITY_CREATE(10001),
    BRANCH_NOT_FOUND(10002),
    BRANCH_COMMIT_VERSION_CONFLICT(10003),
    BRANCH_STATUS_WRONG(10004),
    BRANCH_UNSUPPORT_HISOTRY(10005),
    REPOSITORY_NOT_FOUND(10006),
    FIELD_NOT_FOUND(10007),
    BRANCH_EXISTS(10008), 
    ILLEGAL_BRANCH_ENTITY(10009),
    BRANCH_WRONG_OPS(10010),
    ENTMGR_VIOLATE_REFERENCE_INTEGRITY(10011),
    ENTITY_EXISTED(10012),
    UNIQUE_INDEX_VIOLATION(10013),
    OPERATION_CHECK_FAILED(10014, "operation check failed, possibly acl issue!"),
    CONDITIONAL_UPDATE_FAILED(10015),
    INNER_RELATIONSHIP_EXISTED(10016),
    INVALID_HOST_ENTITY_PATH(10017),
    INNER_ENTITY_NOT_EXIST_IN_HOST(10018),
    INNER_RELATIONSHIP_IMMUTABLE(10019),
    META_CONTAINS_INNER_RELATIONSHIP(10020),
    EMBED_RELATIONSHIP_IMMUTABLE(10021),
    QUERY_NO_ERROR(20000),
    METACLASS_NOT_FOUND(20001),
    METAFIELD_NOT_FOUND(20002),
    PARSE_GRAMMER_ERROR(20003),
    REJECT_FULL_TABLE_SCAN(20004),
    DIRTY_DATA_FORMAT(20005),
    AGG_FIELD_IN_GROUP(20006),
    AGG_WITHOUT_GROUP(20007),
    AGG_FUNC_NOT_FOUND(20008),
    MULTI_AGGR_FORBID(20009),
    PROJECT_NON_AGGR(20010),
    IILEGAL_PROJECTION(20011),
    UNKNOWN_FIELD(20012),
    SYNTAX_ERROR(20013),
    TYPE_CAST_NOT_SUBMETA(20014),
    INCOMPLETE_JOIN_QUERY(20015),
    TOO_DEEP_EXECUTION(20016),
    JOIN_COUNT_NOT_SUPPORT(20017),
    AGGREGATION_MUST_BEFORE_SET(20018),
    JOIN_SORT_NOT_SUPPORT(20019),
    ARRAY_SORT_NOT_SUPPORT(20020),
    JSON_SORT_NOT_SUPPORT(20021)
    ;
    
    private final int errorCode;
    private final String description;
    
    CMSErrorCodeEnum(int code, String desp){
        this.errorCode = code;
        this.description = desp;
    }
    CMSErrorCodeEnum(int code){
        this(code, null);
    }

    String getDescription() {
        return description;
    }

    public static CMSErrorCodeEnum getErrorEnum(int errorCode) {
        for (CMSErrorCodeEnum en : CMSErrorCodeEnum.values()) {
            if (en.errorCode == errorCode) {
                return en;
            }
        }
        // instead of throw exception, return a common undefind enum.
        return UNDEFINED_ERROR_CODE;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
