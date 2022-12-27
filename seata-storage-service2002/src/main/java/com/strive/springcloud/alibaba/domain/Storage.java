package com.strive.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author l moonlight
 * @create 2022-12-27 20:18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Storage {
    private Long id;
    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
