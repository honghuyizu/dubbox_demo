package com.dubbox.service;


import com.dubbox.service.model.MemberDto;

/**
 * Created by Lee on 2017/10/12.
 */
public interface MemberService {

    /**
     * 根据手机号获取会员信息
     * @param mobile
     * @return
     */
    public MemberDto getMember(String mobile);

}
