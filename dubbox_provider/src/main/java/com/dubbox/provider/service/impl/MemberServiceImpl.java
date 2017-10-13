package com.dubbox.provider.service.impl;



import com.dubbox.common.utils.MyBeanUtils;
import com.dubbox.provider.dao.MemberDao;
import com.dubbox.provider.entity.Member;
import com.dubbox.service.MemberService;
import com.dubbox.service.model.MemberDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Lee on 2017/10/12.
 */
@Service
public class MemberServiceImpl  implements MemberService {
@Resource
private MemberDao memberDao;

    @Override
    public MemberDto getMember(String mobile) {
        MemberDto memberDto = new MemberDto();
        Member member = memberDao.getMemberByMobile(mobile);
        if(member !=null){
            MyBeanUtils.copyBean2Bean(memberDto, member);
        }
        return memberDto;
    }
}
