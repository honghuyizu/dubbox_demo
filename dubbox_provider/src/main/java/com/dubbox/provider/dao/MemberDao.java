package com.dubbox.provider.dao;

import com.dubbox.provider.entity.Member;

/**
 * Created by Lee on 2017/10/12.
 */
public interface MemberDao extends BaseDao<Member> {

    /**
     * 根据手机号获取会员信息
     * @param mobile
     * @return
     */
    public Member getMemberByMobile(String mobile);
}

