CREATE TABLE heterogeneity.`order_base`
(
    `id`         bigint(18)     NOT NULL AUTO_INCREMENT COMMENT '主键',
    `orderSn`    char(64)       NOT NULL COMMENT '单号',
    `goodsId`    bigint(18)     NOT NULL COMMENT '商品id',
    `customerId` bigint(18)     NOT NULL COMMENT '客户id',
    `shopId`     bigint(18)     NOT NULL COMMENT '店铺id',
    `amount`     decimal(10, 2) not null COMMENT '金额',
    `payOrderId` bigint(18) default NULL COMMENT '付款单Id',
    `createTime` datetime   DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
    `updateTime` datetime   DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (`id`) USING BTREE,
    unique index order_sn (orderSn)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8mb4
  ROW_FORMAT = DYNAMIC COMMENT ='订单基础信息';

CREATE TABLE heterogeneity.`order_Info`
(
    `id`                      bigint(18)                                NOT NULL AUTO_INCREMENT COMMENT '主键',
    `baseId`                  bigint(18)                                NOT NULL COMMENT 'order base id',
    `orderSn`                 char(64)                                  NOT NULL COMMENT '单号',
    `supplier_name`           varchar(255) COLLATE utf8mb4_unicode_ci   NOT NULL COMMENT '商户名称',
    `order_status`            tinyint(4)                                NOT NULL DEFAULT '0' COMMENT '订单状态 0未付款,1已付款,2已发货,3已签收,-1退货申请,-2退货中,-3已退货,-4取消交易',
    `after_status`            tinyint(4)                                NOT NULL DEFAULT '0' COMMENT '用户售后状态 0 未发起售后 1 申请售后 -1 售后已取消 2 处理中 200 处理完毕',
    `product_count`           int(11)                                   NOT NULL DEFAULT '0' COMMENT '商品数量',
    `product_amount_total`    decimal(12, 4)                            NOT NULL COMMENT '商品总价',
    `order_amount_total`      decimal(12, 4)                            NOT NULL DEFAULT '0.0000' COMMENT '实际付款金额',
    `logistics_fee`           decimal(12, 4)                            NOT NULL COMMENT '运费金额',
    `address_id`              int(11)                                   NOT NULL COMMENT '收货地址编码',
    `pay_channel`             tinyint(4)                                NOT NULL DEFAULT '0' COMMENT '支付渠道 0余额 1微信 2支付宝',
    `out_trade_no`            varchar(255) COLLATE utf8mb4_unicode_ci            DEFAULT NULL COMMENT '订单支付单号',
    `escrow_trade_no`         varchar(255) COLLATE utf8mb4_unicode_ci            DEFAULT NULL COMMENT '第三方支付流水号',
    `pay_time`                int(11)                                   NOT NULL DEFAULT '0' COMMENT '付款时间',
    `delivery_time`           int(11)                                   NOT NULL DEFAULT '0' COMMENT '发货时间',
    `order_settlement_status` tinyint(4)                                NOT NULL DEFAULT '0' COMMENT '订单结算状态 0未结算 1已结算',
    `order_settlement_time`   int(11)                                   NOT NULL DEFAULT '0' COMMENT '订单结算时间',
    `is_package`              enum ('0','1') COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '0' COMMENT '是否是套餐',
    `is_integral`             enum ('0','1') COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '0' COMMENT '是否是积分产品',
    `updateTime`              datetime                                           DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (`id`) USING BTREE,
    index orderSn(orderSn),
    index address_id(address_id),

    index escrow_trade_no(escrow_trade_no),
    index out_trade_no(out_trade_no)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8mb4
  ROW_FORMAT = DYNAMIC COMMENT ='订单基础信息';