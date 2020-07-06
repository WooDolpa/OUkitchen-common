package com.project.toy.common.model;

import com.project.toy.common.enums.DataStatus;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: jwlee
 * Date: 2020/07/05
 */
@Data
public class ApiAccountModel implements Serializable {

    private static final long serialVersionUID = 7549895558466753705L;

    private String clientId;        // API 인증 아이디
    private String secretKey;       // API 인증 키
    private DataStatus dataStatus;  // 데이터 상태
    private String regDatetime;     // 등록일
    private String updDatetime;     // 수정일
}
