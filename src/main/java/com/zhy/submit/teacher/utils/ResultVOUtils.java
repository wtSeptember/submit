package com.zhy.submit.teacher.utils;

import com.zhy.submit.teacher.VO.ResultVO;

public class ResultVOUtils {
    public static ResultVO success(Object object){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return  resultVO;
    }
}
