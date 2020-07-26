package com.project.toy.common.model;

import com.project.toy.common.enums.DataStatus;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: jwlee
 * Date: 2020/07/26
 */
@Data
public class KeywordModel implements Serializable {

    private static final long serialVersionUID = 9076605018999408716L;

    private int kNo;                        // 넘버
    private String kName;                   // 키워드 명
    private DataStatus dataStatus;          // 데이터 상태
    private String regDatetime;             // 등록일
    private String updDatetime;             // 수정일
}
