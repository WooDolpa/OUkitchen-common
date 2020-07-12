package com.project.toy.common.model;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * User: jwlee
 * Date: 2020/07/12
 */
@Data
public class UserModel {

    private int userNo;                     // 사용자 번호
    private String userId;                  // 아이디
    private String userPassword;            // 비밀번호
    private int userStatus;                 // 사용자 상태
    private String regDatetime;             // 등록일
    private String updDatetime;             // 수정일

}
