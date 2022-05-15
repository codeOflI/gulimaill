package com.codeofli.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeofli.common.utils.PageUtils;
import com.codeofli.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author codeofli
 * @email 1162314270@qq.com
 * @date 2022-05-15 19:36:09
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

