package com.zz.util;

import com.zz.enums.ReturnStatusEnum;
import com.zz.vo.ResultVO;

public class ResultVOUtil {
    public static ResultVO SUCCESS(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(true);
        resultVO.setErrorCode(ReturnStatusEnum.SUCCESS.getCode());
        resultVO.setMsg(ReturnStatusEnum.SUCCESS.getMsg());
        resultVO.setBody(object);
        return resultVO;
    }
}
