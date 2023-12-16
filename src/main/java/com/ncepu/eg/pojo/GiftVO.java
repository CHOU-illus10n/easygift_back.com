package com.ncepu.eg.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author zwy
 * @version 1.0
 * @description: TODO
 * @date 2023/12/13 10:13
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GiftVO {
    private String giftId;
    private String userId;
    private String giftName;
    private String description;
    private LocalDateTime createTime;
    private Integer state;

}
