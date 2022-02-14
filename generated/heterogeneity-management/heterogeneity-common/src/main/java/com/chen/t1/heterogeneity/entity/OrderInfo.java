package  com.chen.t1.heterogeneity.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 订单基础信息
 * </p>
 *
 * @author chen_q_i@163.com
 * @since 2022-02-11
 */
@TableName("order_Info")
public class OrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * order base id
     */
    private Long baseId;

    /**
     * 单号
     */
    private String orderSn;

    /**
     * 商户名称
     */
    private String supplierName;

    /**
     * 订单状态 0未付款,1已付款,2已发货,3已签收,-1退货申请,-2退货中,-3已退货,-4取消交易
     */
    private Integer orderStatus;

    /**
     * 用户售后状态 0 未发起售后 1 申请售后 -1 售后已取消 2 处理中 200 处理完毕
     */
    private Integer afterStatus;

    /**
     * 商品数量
     */
    private Integer productCount;

    /**
     * 商品总价
     */
    private BigDecimal productAmountTotal;

    /**
     * 实际付款金额
     */
    private BigDecimal orderAmountTotal;

    /**
     * 运费金额
     */
    private BigDecimal logisticsFee;

    /**
     * 收货地址编码
     */
    private Integer addressId;

    /**
     * 支付渠道 0余额 1微信 2支付宝
     */
    private Integer payChannel;

    /**
     * 订单支付单号
     */
    private String outTradeNo;

    /**
     * 第三方支付流水号
     */
    private String escrowTradeNo;

    /**
     * 付款时间
     */
    private Integer payTime;

    /**
     * 发货时间
     */
    private Integer deliveryTime;

    /**
     * 订单结算状态 0未结算 1已结算
     */
    private Integer orderSettlementStatus;

    /**
     * 订单结算时间
     */
    private Integer orderSettlementTime;

    /**
     * 是否是套餐
     */
    private String isPackage;

    /**
     * 是否是积分产品
     */
    private String isIntegral;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBaseId() {
        return baseId;
    }

    public void setBaseId(Long baseId) {
        this.baseId = baseId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getAfterStatus() {
        return afterStatus;
    }

    public void setAfterStatus(Integer afterStatus) {
        this.afterStatus = afterStatus;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public BigDecimal getProductAmountTotal() {
        return productAmountTotal;
    }

    public void setProductAmountTotal(BigDecimal productAmountTotal) {
        this.productAmountTotal = productAmountTotal;
    }

    public BigDecimal getOrderAmountTotal() {
        return orderAmountTotal;
    }

    public void setOrderAmountTotal(BigDecimal orderAmountTotal) {
        this.orderAmountTotal = orderAmountTotal;
    }

    public BigDecimal getLogisticsFee() {
        return logisticsFee;
    }

    public void setLogisticsFee(BigDecimal logisticsFee) {
        this.logisticsFee = logisticsFee;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getEscrowTradeNo() {
        return escrowTradeNo;
    }

    public void setEscrowTradeNo(String escrowTradeNo) {
        this.escrowTradeNo = escrowTradeNo;
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    public Integer getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Integer deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Integer getOrderSettlementStatus() {
        return orderSettlementStatus;
    }

    public void setOrderSettlementStatus(Integer orderSettlementStatus) {
        this.orderSettlementStatus = orderSettlementStatus;
    }

    public Integer getOrderSettlementTime() {
        return orderSettlementTime;
    }

    public void setOrderSettlementTime(Integer orderSettlementTime) {
        this.orderSettlementTime = orderSettlementTime;
    }

    public String getIsPackage() {
        return isPackage;
    }

    public void setIsPackage(String isPackage) {
        this.isPackage = isPackage;
    }

    public String getIsIntegral() {
        return isIntegral;
    }

    public void setIsIntegral(String isIntegral) {
        this.isIntegral = isIntegral;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
        "id=" + id +
        ", baseId=" + baseId +
        ", orderSn=" + orderSn +
        ", supplierName=" + supplierName +
        ", orderStatus=" + orderStatus +
        ", afterStatus=" + afterStatus +
        ", productCount=" + productCount +
        ", productAmountTotal=" + productAmountTotal +
        ", orderAmountTotal=" + orderAmountTotal +
        ", logisticsFee=" + logisticsFee +
        ", addressId=" + addressId +
        ", payChannel=" + payChannel +
        ", outTradeNo=" + outTradeNo +
        ", escrowTradeNo=" + escrowTradeNo +
        ", payTime=" + payTime +
        ", deliveryTime=" + deliveryTime +
        ", orderSettlementStatus=" + orderSettlementStatus +
        ", orderSettlementTime=" + orderSettlementTime +
        ", isPackage=" + isPackage +
        ", isIntegral=" + isIntegral +
        ", updateTime=" + updateTime +
        "}";
    }
}
