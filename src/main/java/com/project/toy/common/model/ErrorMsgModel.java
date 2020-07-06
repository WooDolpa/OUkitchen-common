package com.project.toy.common.model;

import com.project.toy.common.enums.DataStatus;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: jwlee
 * Date: 2020/07/06
 */
@Data
public class ErrorMsgModel implements Serializable {

    private static final long serialVersionUID = 5643325143825904625L;

    private String errorId;                 // 에러 아이디
    private int errorCode;                  // 에러 코드
    private String errorMsg;                // 에러 메시지
    private DataStatus dataStatus;          // 상태
    private String regDatetime;             // 등록일
    private String updDatetime;             // 수정일
}
